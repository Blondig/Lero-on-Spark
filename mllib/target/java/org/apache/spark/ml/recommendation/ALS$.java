package org.apache.spark.ml.recommendation;
/**
 * An implementation of ALS that supports generic ID types, specialized for Int and Long. This is
 * exposed as a developer API for users who do need other ID types. But it is not recommended
 * because it increases the shuffle size and memory requirement during training. For simplicity,
 * users and items must have the same type. The number of distinct users/items should be smaller
 * than 2 billion.
 */
public  class ALS$ implements org.apache.spark.ml.util.DefaultParamsReadable<org.apache.spark.ml.recommendation.ALS>, org.apache.spark.internal.Logging, scala.Serializable {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final ALS$ MODULE$ = null;
  public   ALS$ ()  { throw new RuntimeException(); }
  public  org.apache.spark.ml.recommendation.ALS load (java.lang.String path)  { throw new RuntimeException(); }
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
  public <ID extends java.lang.Object> scala.Tuple2<org.apache.spark.rdd.RDD<scala.Tuple2<ID, float[]>>, org.apache.spark.rdd.RDD<scala.Tuple2<ID, float[]>>> train (org.apache.spark.rdd.RDD<org.apache.spark.ml.recommendation.ALS.Rating<ID>> ratings, int rank, int numUserBlocks, int numItemBlocks, int maxIter, double regParam, boolean implicitPrefs, double alpha, boolean nonnegative, org.apache.spark.storage.StorageLevel intermediateRDDStorageLevel, org.apache.spark.storage.StorageLevel finalRDDStorageLevel, int checkpointInterval, long seed, scala.reflect.ClassTag<ID> evidence$1, scala.math.Ordering<ID> ord)  { throw new RuntimeException(); }
}
