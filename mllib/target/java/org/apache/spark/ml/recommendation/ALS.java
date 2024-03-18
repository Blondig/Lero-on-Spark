package org.apache.spark.ml.recommendation;
/**
 * Alternating Least Squares (ALS) matrix factorization.
 * <p>
 * ALS attempts to estimate the ratings matrix <code>R</code> as the product of two lower-rank matrices,
 * <code>X</code> and <code>Y</code>, i.e. <code>X * Yt = R</code>. Typically these approximations are called 'factor' matrices.
 * The general approach is iterative. During each iteration, one of the factor matrices is held
 * constant, while the other is solved for using least squares. The newly-solved factor matrix is
 * then held constant while solving for the other factor matrix.
 * <p>
 * This is a blocked implementation of the ALS factorization algorithm that groups the two sets
 * of factors (referred to as "users" and "products") into blocks and reduces communication by only
 * sending one copy of each user vector to each product block on each iteration, and only for the
 * product blocks that need that user's feature vector. This is achieved by pre-computing some
 * information about the ratings matrix to determine the "out-links" of each user (which blocks of
 * products it will contribute to) and "in-link" information for each product (which of the feature
 * vectors it receives from each user block it will depend on). This allows us to send only an
 * array of feature vectors between each user block and product block, and have the product block
 * find the users' ratings and update the products based on these messages.
 * <p>
 * For implicit preference data, the algorithm used is based on
 * "Collaborative Filtering for Implicit Feedback Datasets", available at
 * https://doi.org/10.1109/ICDM.2008.22, adapted for the blocked approach used here.
 * <p>
 * Essentially instead of finding the low-rank approximations to the rating matrix <code>R</code>,
 * this finds the approximations for a preference matrix <code>P</code> where the elements of <code>P</code> are 1 if
 * r is greater than 0 and 0 if r is less than or equal to 0. The ratings then act as 'confidence'
 * values related to strength of indicated user
 * preferences rather than explicit ratings given to items.
 * <p>
 * Note: the input rating dataset to the ALS implementation should be deterministic.
 * Nondeterministic data can cause failure during fitting ALS model.
 * For example, an order-sensitive operation like sampling after a repartition makes dataset
 * output nondeterministic, like <code>dataset.repartition(2).sample(false, 0.5, 1618)</code>.
 * Checkpointing sampled dataset or adding a sort before sampling can help make the dataset
 * deterministic.
 */
public  class ALS extends org.apache.spark.ml.Estimator<org.apache.spark.ml.recommendation.ALSModel> implements org.apache.spark.ml.recommendation.ALSParams, org.apache.spark.ml.util.DefaultParamsWritable {
  /**
   * Rating class for better code readability.
   */
  static public  class Rating<ID extends java.lang.Object> implements scala.Product, scala.Serializable {
    public  ID user ()  { throw new RuntimeException(); }
    public  ID item ()  { throw new RuntimeException(); }
    public  float rating ()  { throw new RuntimeException(); }
    // not preceding
    public   Rating (ID user, ID item, float rating)  { throw new RuntimeException(); }
  }
  static public  class Rating$ implements scala.Serializable {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final Rating$ MODULE$ = null;
    public   Rating$ ()  { throw new RuntimeException(); }
  }
  /**
   * In-link block for computing user and item factor matrices.
   * <p>
   * The ALS algorithm partitions the columns of the users factor matrix evenly among Spark workers.
   * Since each column of the factor matrix is calculated using the known ratings of the correspond-
   * ing user, and since the ratings don't change across iterations, the ALS algorithm preshuffles
   * the ratings to the appropriate partitions, storing them in <code>InBlock</code> objects.
   * <p>
   * The ratings shuffled by item ID are computed similarly and also stored in <code>InBlock</code> objects.
   * Note that this means every rating is stored twice, once as shuffled by user ID and once by item
   * ID.  This is a necessary tradeoff, since in general a rating will not be on the same worker
   * when partitioned by user as by item.
   * <p>
   * =Example=
   * <p>
   * Say we have a small collection of eight items to offer the seven users in our application.  We
   * have some known ratings given by the users, as seen in the matrix below:
   * <p>
   * <pre><code>
   *                       Items
   *            0   1   2   3   4   5   6   7
   *          +---+---+---+---+---+---+---+---+
   *        0 |   |0.1|   |   |0.4|   |   |0.7|
   *          +---+---+---+---+---+---+---+---+
   *        1 |   |   |   |   |   |   |   |   |
   *          +---+---+---+---+---+---+---+---+
   *     U  2 |   |   |   |   |   |   |   |   |
   *     s    +---+---+---+---+---+---+---+---+
   *     e  3 |   |3.1|   |   |3.4|   |   |3.7|
   *     r    +---+---+---+---+---+---+---+---+
   *     s  4 |   |   |   |   |   |   |   |   |
   *          +---+---+---+---+---+---+---+---+
   *        5 |   |   |   |   |   |   |   |   |
   *          +---+---+---+---+---+---+---+---+
   *        6 |   |6.1|   |   |6.4|   |   |6.7|
   *          +---+---+---+---+---+---+---+---+
   * </code></pre>
   * <p>
   * The ratings are represented as an RDD, passed to the <code>partitionRatings</code> method as the <code>ratings</code>
   * parameter:
   * <p>
   * <pre><code>
   *     ratings.collect() == Seq(
   *       Rating(0, 1, 0.1f),
   *       Rating(0, 4, 0.4f),
   *       Rating(0, 7, 0.7f),
   *       Rating(3, 1, 3.1f),
   *       Rating(3, 4, 3.4f),
   *       Rating(3, 7, 3.7f),
   *       Rating(6, 1, 6.1f),
   *       Rating(6, 4, 6.4f),
   *       Rating(6, 7, 6.7f)
   *     )
   * </code></pre>
   * <p>
   * Say that we are using two partitions to calculate each factor matrix:
   * <p>
   * <pre><code>
   *     val userPart = new ALSPartitioner(2)
   *     val itemPart = new ALSPartitioner(2)
   *     val blockRatings = partitionRatings(ratings, userPart, itemPart)
   * </code></pre>
   * <p>
   * Ratings are mapped to partitions using the user/item IDs modulo the number of partitions.  With
   * two partitions, ratings with even-valued user IDs are shuffled to partition 0 while those with
   * odd-valued user IDs are shuffled to partition 1:
   * <p>
   * <pre><code>
   *     userInBlocks.collect() == Seq(
   *       0 -&gt; Seq(
   *              // Internally, the class stores the ratings in a more optimized format than
   *              // a sequence of `Rating`s, but for clarity we show it as such here.
   *              Rating(0, 1, 0.1f),
   *              Rating(0, 4, 0.4f),
   *              Rating(0, 7, 0.7f),
   *              Rating(6, 1, 6.1f),
   *              Rating(6, 4, 6.4f),
   *              Rating(6, 7, 6.7f)
   *            ),
   *       1 -&gt; Seq(
   *              Rating(3, 1, 3.1f),
   *              Rating(3, 4, 3.4f),
   *              Rating(3, 7, 3.7f)
   *            )
   *     )
   * </code></pre>
   * <p>
   * Similarly, ratings with even-valued item IDs are shuffled to partition 0 while those with
   * odd-valued item IDs are shuffled to partition 1:
   * <p>
   * <pre><code>
   *     itemInBlocks.collect() == Seq(
   *       0 -&gt; Seq(
   *              Rating(0, 4, 0.4f),
   *              Rating(3, 4, 3.4f),
   *              Rating(6, 4, 6.4f)
   *            ),
   *       1 -&gt; Seq(
   *              Rating(0, 1, 0.1f),
   *              Rating(0, 7, 0.7f),
   *              Rating(3, 1, 3.1f),
   *              Rating(3, 7, 3.7f),
   *              Rating(6, 1, 6.1f),
   *              Rating(6, 7, 6.7f)
   *            )
   *     )
   * </code></pre>
   * <p>
   * param:  srcIds src ids (ordered)
   * param:  dstPtrs dst pointers. Elements in range [dstPtrs(i), dstPtrs(i+1)) of dst indices and
   *                ratings are associated with srcIds(i).
   * param:  dstEncodedIndices encoded dst indices
   * param:  ratings ratings
   * @see LocalIndexEncoder
   */
  static   class InBlock<ID extends java.lang.Object> implements scala.Product, scala.Serializable {
    public  java.lang.Object srcIds ()  { throw new RuntimeException(); }
    public  int[] dstPtrs ()  { throw new RuntimeException(); }
    public  int[] dstEncodedIndices ()  { throw new RuntimeException(); }
    public  float[] ratings ()  { throw new RuntimeException(); }
    // not preceding
    public   InBlock (java.lang.Object srcIds, int[] dstPtrs, int[] dstEncodedIndices, float[] ratings, scala.reflect.ClassTag<ID> evidence$2)  { throw new RuntimeException(); }
    /** Size of the block. */
    public  int size ()  { throw new RuntimeException(); }
  }
  static public  class InBlock$ implements scala.Serializable {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final InBlock$ MODULE$ = null;
    public   InBlock$ ()  { throw new RuntimeException(); }
  }
  /**
   * A rating block that contains src IDs, dst IDs, and ratings, stored in primitive arrays.
   */
  static   class RatingBlock<ID extends java.lang.Object> implements scala.Product, scala.Serializable {
    public  java.lang.Object srcIds ()  { throw new RuntimeException(); }
    public  java.lang.Object dstIds ()  { throw new RuntimeException(); }
    public  float[] ratings ()  { throw new RuntimeException(); }
    // not preceding
    public   RatingBlock (java.lang.Object srcIds, java.lang.Object dstIds, float[] ratings, scala.reflect.ClassTag<ID> evidence$3)  { throw new RuntimeException(); }
    /** Size of the block. */
    public  int size ()  { throw new RuntimeException(); }
  }
  static public  class RatingBlock$ implements scala.Serializable {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final RatingBlock$ MODULE$ = null;
    public   RatingBlock$ ()  { throw new RuntimeException(); }
  }
  /** Trait for least squares solvers applied to the normal equation. */
  static public  interface LeastSquaresNESolver extends scala.Serializable {
    /** Solves a least squares problem with regularization (possibly with other constraints). */
    public  float[] solve (org.apache.spark.ml.recommendation.ALS.NormalEquation ne, double lambda)  ;
  }
  /** Cholesky solver for least square problems. */
  static   class CholeskySolver implements org.apache.spark.ml.recommendation.ALS.LeastSquaresNESolver {
    public   CholeskySolver ()  { throw new RuntimeException(); }
    /**
     * Solves a least squares problem with L2 regularization:
     * <p>
     *   min norm(A x - b)^2^ + lambda * norm(x)^2^
     * <p>
     * @param ne a {@link NormalEquation} instance that contains AtA, Atb, and n (number of instances)
     * @param lambda regularization constant
     * @return the solution x
     */
    public  float[] solve (org.apache.spark.ml.recommendation.ALS.NormalEquation ne, double lambda)  { throw new RuntimeException(); }
  }
  /** NNLS solver. */
  static   class NNLSSolver implements org.apache.spark.ml.recommendation.ALS.LeastSquaresNESolver {
    public   NNLSSolver ()  { throw new RuntimeException(); }
    /**
     * Solves a nonnegative least squares problem with L2 regularization:
     * <p>
     *   min_x_  norm(A x - b)^2^ + lambda * n * norm(x)^2^
     *   subject to x >= 0
     * @param ne (undocumented)
     * @param lambda (undocumented)
     * @return (undocumented)
     */
    public  float[] solve (org.apache.spark.ml.recommendation.ALS.NormalEquation ne, double lambda)  { throw new RuntimeException(); }
  }
  /**
   * Representing a normal equation to solve the following weighted least squares problem:
   * <p>
   * minimize \sum,,i,, c,,i,, (a,,i,,^T^ x - d,,i,,)^2^ + lambda * x^T^ x.
   * <p>
   * Its normal equation is given by
   * <p>
   * \sum,,i,, c,,i,, (a,,i,, a,,i,,^T^ x - d,,i,, a,,i,,) + lambda * x = 0.
   * <p>
   * Distributing and letting b,,i,, = c,,i,, * d,,i,,
   * <p>
   * \sum,,i,, c,,i,, a,,i,, a,,i,,^T^ x - b,,i,, a,,i,, + lambda * x = 0.
   */
  static   class NormalEquation implements scala.Serializable {
    // not preceding
    public   NormalEquation (int k)  { throw new RuntimeException(); }
    /** Adds an observation. */
    public  org.apache.spark.ml.recommendation.ALS.NormalEquation add (float[] a, double b, double c)  { throw new RuntimeException(); }
    /** A^T^ * A */
    public  double[] ata ()  { throw new RuntimeException(); }
    /** A^T^ * b */
    public  double[] atb ()  { throw new RuntimeException(); }
    public  int k ()  { throw new RuntimeException(); }
    /** Merges another normal equation object. */
    public  org.apache.spark.ml.recommendation.ALS.NormalEquation merge (org.apache.spark.ml.recommendation.ALS.NormalEquation other)  { throw new RuntimeException(); }
    /** Resets everything to zero, which should be called after each solve. */
    public  void reset ()  { throw new RuntimeException(); }
    /** Number of entries in the upper triangular part of a k-by-k matrix. */
    public  int triK ()  { throw new RuntimeException(); }
  }
  /**
   * Builder for {@link RatingBlock}. <code>mutable.ArrayBuilder</code> is used to avoid boxing/unboxing.
   */
  static   class RatingBlockBuilder<ID extends java.lang.Object> implements scala.Serializable {
    // not preceding
    // TypeTree().setOriginal(TypeBoundsTree(TypeTree(), TypeTree()))
    public   RatingBlockBuilder (scala.reflect.ClassTag<ID> evidence$4)  { throw new RuntimeException(); }
    /** Adds a rating. */
    public  org.apache.spark.ml.recommendation.ALS.RatingBlockBuilder<ID> add (org.apache.spark.ml.recommendation.ALS.Rating<ID> r)  { throw new RuntimeException(); }
    /** Builds a {@link RatingBlock}. */
    public  org.apache.spark.ml.recommendation.ALS.RatingBlock<ID> build ()  { throw new RuntimeException(); }
    /** Merges another {@link RatingBlockBuilder}. */
    public  org.apache.spark.ml.recommendation.ALS.RatingBlockBuilder<ID> merge (org.apache.spark.ml.recommendation.ALS.RatingBlock<ID> other)  { throw new RuntimeException(); }
    public  int size ()  { throw new RuntimeException(); }
  }
  /**
   * Builder for uncompressed in-blocks of (srcId, dstEncodedIndex, rating) tuples.
   * <p>
   * param:  encoder encoder for dst indices
   */
  static   class UncompressedInBlockBuilder<ID extends java.lang.Object> {
    // not preceding
    // TypeTree().setOriginal(TypeBoundsTree(TypeTree(), TypeTree()))
    public   UncompressedInBlockBuilder (org.apache.spark.ml.recommendation.ALS.LocalIndexEncoder encoder, scala.reflect.ClassTag<ID> evidence$6, scala.math.Ordering<ID> ord)  { throw new RuntimeException(); }
    /**
     * Adds a dst block of (srcId, dstLocalIndex, rating) tuples.
     * <p>
     * @param dstBlockId dst block ID
     * @param srcIds original src IDs
     * @param dstLocalIndices dst local indices
     * @param ratings ratings
     * @return (undocumented)
     */
    public  org.apache.spark.ml.recommendation.ALS.UncompressedInBlockBuilder<ID> add (int dstBlockId, java.lang.Object srcIds, int[] dstLocalIndices, float[] ratings)  { throw new RuntimeException(); }
    /** Builds a {@link UncompressedInBlock}. */
    public  org.apache.spark.ml.recommendation.ALS.UncompressedInBlock<ID> build ()  { throw new RuntimeException(); }
  }
  /**
   * A block of (srcId, dstEncodedIndex, rating) tuples stored in primitive arrays.
   */
  static   class UncompressedInBlock<ID extends java.lang.Object> {
    // not preceding
    public   UncompressedInBlock (java.lang.Object srcIds, int[] dstEncodedIndices, float[] ratings, scala.reflect.ClassTag<ID> evidence$7, scala.math.Ordering<ID> ord)  { throw new RuntimeException(); }
    /**
     * Compresses the block into an <code>InBlock</code>. The algorithm is the same as converting a sparse
     * matrix from coordinate list (COO) format into compressed sparse column (CSC) format.
     * Sorting is done using Spark's built-in Timsort to avoid generating too many objects.
     * @return (undocumented)
     */
    public  org.apache.spark.ml.recommendation.ALS.InBlock<ID> compress ()  { throw new RuntimeException(); }
    public  int[] dstEncodedIndices ()  { throw new RuntimeException(); }
    /** Size the of block. */
    public  int length ()  { throw new RuntimeException(); }
    public  float[] ratings ()  { throw new RuntimeException(); }
    public  java.lang.Object srcIds ()  { throw new RuntimeException(); }
  }
  /**
   * Encoder for storing (blockId, localIndex) into a single integer.
   * <p>
   * We use the leading bits (including the sign bit) to store the block id and the rest to store
   * the local index. This is based on the assumption that users/items are approximately evenly
   * partitioned. With this assumption, we should be able to encode two billion distinct values.
   * <p>
   * param:  numBlocks number of blocks
   */
  static   class LocalIndexEncoder implements scala.Serializable {
    public   LocalIndexEncoder (int numBlocks)  { throw new RuntimeException(); }
    /** Gets the block id from an encoded index. */
    public  int blockId (int encoded)  { throw new RuntimeException(); }
    /** Encodes a (blockId, localIndex) into a single integer. */
    public  int encode (int blockId, int localIndex)  { throw new RuntimeException(); }
    /** Gets the local index from an encoded index. */
    public  int localIndex (int encoded)  { throw new RuntimeException(); }
  }
  static public  org.apache.spark.ml.recommendation.ALS load (java.lang.String path)  { throw new RuntimeException(); }
  /**
   * Implementation of the ALS algorithm.
   * <p>
   * This implementation of the ALS factorization algorithm partitions the two sets of factors among
   * Spark workers so as to reduce network communication by only sending one copy of each factor
   * vector to each Spark worker on each iteration, and only if needed.  This is achieved by
   * precomputing some information about the ratings matrix to determine which users require which
   * item factors and vice versa.  See the Scaladoc for <code>InBlock</code> for a detailed explanation of how
   * the precomputation is done.
   * <p>
   * In addition, since each iteration of calculating the factor matrices depends on the known
   * ratings, which are spread across Spark partitions, a naive implementation would incur
   * significant network communication overhead between Spark workers, as the ratings RDD would be
   * repeatedly shuffled during each iteration.  This implementation reduces that overhead by
   * performing the shuffling operation up front, precomputing each partition's ratings dependencies
   * and duplicating those values to the appropriate workers before starting iterations to solve for
   * the factor matrices.  See the Scaladoc for <code>OutBlock</code> for a detailed explanation of how the
   * precomputation is done.
   * <p>
   * Note that the term "rating block" is a bit of a misnomer, as the ratings are not partitioned by
   * contiguous blocks from the ratings matrix but by a hash function on the rating's location in
   * the matrix.  If it helps you to visualize the partitions, it is easier to think of the term
   * "block" as referring to a subset of an RDD containing the ratings rather than a contiguous
   * submatrix of the ratings matrix.
   * @param ratings (undocumented)
   * @param rank (undocumented)
   * @param numUserBlocks (undocumented)
   * @param numItemBlocks (undocumented)
   * @param maxIter (undocumented)
   * @param regParam (undocumented)
   * @param implicitPrefs (undocumented)
   * @param alpha (undocumented)
   * @param nonnegative (undocumented)
   * @param intermediateRDDStorageLevel (undocumented)
   * @param finalRDDStorageLevel (undocumented)
   * @param checkpointInterval (undocumented)
   * @param seed (undocumented)
   * @param evidence$1 (undocumented)
   * @param ord (undocumented)
   * @return (undocumented)
   */
  static public <ID extends java.lang.Object> scala.Tuple2<org.apache.spark.rdd.RDD<scala.Tuple2<ID, float[]>>, org.apache.spark.rdd.RDD<scala.Tuple2<ID, float[]>>> train (org.apache.spark.rdd.RDD<org.apache.spark.ml.recommendation.ALS.Rating<ID>> ratings, int rank, int numUserBlocks, int numItemBlocks, int maxIter, double regParam, boolean implicitPrefs, double alpha, boolean nonnegative, org.apache.spark.storage.StorageLevel intermediateRDDStorageLevel, org.apache.spark.storage.StorageLevel finalRDDStorageLevel, int checkpointInterval, long seed, scala.reflect.ClassTag<ID> evidence$1, scala.math.Ordering<ID> ord)  { throw new RuntimeException(); }
  static public  org.apache.spark.ml.util.MLReader<T> read ()  { throw new RuntimeException(); }
  static public  org.slf4j.Logger org$apache$spark$internal$Logging$$log_ ()  { throw new RuntimeException(); }
  static public  void org$apache$spark$internal$Logging$$log__$eq (org.slf4j.Logger x$1)  { throw new RuntimeException(); }
  static protected  java.lang.String logName ()  { throw new RuntimeException(); }
  static protected  org.slf4j.Logger log ()  { throw new RuntimeException(); }
  static protected  void logInfo (scala.Function0<java.lang.String> msg)  { throw new RuntimeException(); }
  static protected  void logDebug (scala.Function0<java.lang.String> msg)  { throw new RuntimeException(); }
  static protected  void logTrace (scala.Function0<java.lang.String> msg)  { throw new RuntimeException(); }
  static protected  void logWarning (scala.Function0<java.lang.String> msg)  { throw new RuntimeException(); }
  static protected  void logError (scala.Function0<java.lang.String> msg)  { throw new RuntimeException(); }
  static protected  void logInfo (scala.Function0<java.lang.String> msg, java.lang.Throwable throwable)  { throw new RuntimeException(); }
  static protected  void logDebug (scala.Function0<java.lang.String> msg, java.lang.Throwable throwable)  { throw new RuntimeException(); }
  static protected  void logTrace (scala.Function0<java.lang.String> msg, java.lang.Throwable throwable)  { throw new RuntimeException(); }
  static protected  void logWarning (scala.Function0<java.lang.String> msg, java.lang.Throwable throwable)  { throw new RuntimeException(); }
  static protected  void logError (scala.Function0<java.lang.String> msg, java.lang.Throwable throwable)  { throw new RuntimeException(); }
  static protected  boolean isTraceEnabled ()  { throw new RuntimeException(); }
  static protected  void initializeLogIfNecessary (boolean isInterpreter)  { throw new RuntimeException(); }
  static protected  boolean initializeLogIfNecessary (boolean isInterpreter, boolean silent)  { throw new RuntimeException(); }
  static protected  boolean initializeLogIfNecessary$default$2 ()  { throw new RuntimeException(); }
  static   void initializeForcefully (boolean isInterpreter, boolean silent)  { throw new RuntimeException(); }
  public  org.apache.spark.ml.param.IntParam rank ()  { throw new RuntimeException(); }
  public  org.apache.spark.ml.param.IntParam numUserBlocks ()  { throw new RuntimeException(); }
  public  org.apache.spark.ml.param.IntParam numItemBlocks ()  { throw new RuntimeException(); }
  public  org.apache.spark.ml.param.BooleanParam implicitPrefs ()  { throw new RuntimeException(); }
  public  org.apache.spark.ml.param.DoubleParam alpha ()  { throw new RuntimeException(); }
  public  org.apache.spark.ml.param.Param<java.lang.String> ratingCol ()  { throw new RuntimeException(); }
  public  org.apache.spark.ml.param.BooleanParam nonnegative ()  { throw new RuntimeException(); }
  public  org.apache.spark.ml.param.Param<java.lang.String> intermediateStorageLevel ()  { throw new RuntimeException(); }
  public  org.apache.spark.ml.param.Param<java.lang.String> finalStorageLevel ()  { throw new RuntimeException(); }
  public final  org.apache.spark.ml.param.LongParam seed ()  { throw new RuntimeException(); }
  public final  org.apache.spark.ml.param.IntParam checkpointInterval ()  { throw new RuntimeException(); }
  public final  org.apache.spark.ml.param.DoubleParam regParam ()  { throw new RuntimeException(); }
  public final  org.apache.spark.ml.param.IntParam maxIter ()  { throw new RuntimeException(); }
  public  org.apache.spark.ml.param.Param<java.lang.String> userCol ()  { throw new RuntimeException(); }
  public  org.apache.spark.ml.param.Param<java.lang.String> itemCol ()  { throw new RuntimeException(); }
  protected  org.apache.spark.sql.expressions.UserDefinedFunction checkedCast ()  { throw new RuntimeException(); }
  public  org.apache.spark.ml.param.Param<java.lang.String> coldStartStrategy ()  { throw new RuntimeException(); }
  public final  org.apache.spark.ml.param.IntParam blockSize ()  { throw new RuntimeException(); }
  public final  org.apache.spark.ml.param.Param<java.lang.String> predictionCol ()  { throw new RuntimeException(); }
  public  java.lang.String uid ()  { throw new RuntimeException(); }
  // not preceding
  public   ALS (java.lang.String uid)  { throw new RuntimeException(); }
  public   ALS ()  { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.recommendation.ALS setRank (int value)  { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.recommendation.ALS setNumUserBlocks (int value)  { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.recommendation.ALS setNumItemBlocks (int value)  { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.recommendation.ALS setImplicitPrefs (boolean value)  { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.recommendation.ALS setAlpha (double value)  { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.recommendation.ALS setUserCol (java.lang.String value)  { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.recommendation.ALS setItemCol (java.lang.String value)  { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.recommendation.ALS setRatingCol (java.lang.String value)  { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.recommendation.ALS setPredictionCol (java.lang.String value)  { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.recommendation.ALS setMaxIter (int value)  { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.recommendation.ALS setRegParam (double value)  { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.recommendation.ALS setNonnegative (boolean value)  { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.recommendation.ALS setCheckpointInterval (int value)  { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.recommendation.ALS setSeed (long value)  { throw new RuntimeException(); }
  /** @group expertSetParam */
  public  org.apache.spark.ml.recommendation.ALS setIntermediateStorageLevel (java.lang.String value)  { throw new RuntimeException(); }
  /** @group expertSetParam */
  public  org.apache.spark.ml.recommendation.ALS setFinalStorageLevel (java.lang.String value)  { throw new RuntimeException(); }
  /** @group expertSetParam */
  public  org.apache.spark.ml.recommendation.ALS setColdStartStrategy (java.lang.String value)  { throw new RuntimeException(); }
  /**
   * Set block size for stacking input data in matrices.
   * Default is 4096.
   * <p>
   * @group expertSetParam
   * @param value (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.ml.recommendation.ALS setBlockSize (int value)  { throw new RuntimeException(); }
  /**
   * Sets both numUserBlocks and numItemBlocks to the specific value.
   * <p>
   * @group setParam
   * @param value (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.ml.recommendation.ALS setNumBlocks (int value)  { throw new RuntimeException(); }
  public  org.apache.spark.ml.recommendation.ALSModel fit (org.apache.spark.sql.Dataset<?> dataset)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.types.StructType transformSchema (org.apache.spark.sql.types.StructType schema)  { throw new RuntimeException(); }
  public  org.apache.spark.ml.recommendation.ALS copy (org.apache.spark.ml.param.ParamMap extra)  { throw new RuntimeException(); }
}
