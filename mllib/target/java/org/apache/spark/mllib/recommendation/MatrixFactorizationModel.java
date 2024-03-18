package org.apache.spark.mllib.recommendation;
/**
 * Model representing the result of matrix factorization.
 * <p>
 * param:  rank Rank for the features in this model.
 * param:  userFeatures RDD of tuples where each tuple represents the userId and
 *                     the features computed for this user.
 * param:  productFeatures RDD of tuples where each tuple represents the productId
 *                        and the features computed for this product.
 * <p>
 * @note If you create the model directly using constructor, please be aware that fast prediction
 * requires cached user/product features and their associated partitioners.
 */
public  class MatrixFactorizationModel implements org.apache.spark.mllib.util.Saveable, scala.Serializable, org.apache.spark.internal.Logging {
  static public  class SaveLoadV1_0$ {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final SaveLoadV1_0$ MODULE$ = null;
    public   SaveLoadV1_0$ ()  { throw new RuntimeException(); }
      java.lang.String thisClassName ()  { throw new RuntimeException(); }
    /**
     * Saves a {@link MatrixFactorizationModel}, where user features are saved under <code>data/users</code> and
     * product features are saved under <code>data/products</code>.
     * @param model (undocumented)
     * @param path (undocumented)
     */
    public  void save (org.apache.spark.mllib.recommendation.MatrixFactorizationModel model, java.lang.String path)  { throw new RuntimeException(); }
    public  org.apache.spark.mllib.recommendation.MatrixFactorizationModel load (org.apache.spark.SparkContext sc, java.lang.String path)  { throw new RuntimeException(); }
  }
  /**
   * Load a model from the given path.
   * <p>
   * The model should have been saved by <code>Saveable.save</code>.
   * <p>
   * @param sc  Spark context used for loading model files.
   * @param path  Path specifying the directory to which the model was saved.
   * @return  Model instance
   */
  static public  org.apache.spark.mllib.recommendation.MatrixFactorizationModel load (org.apache.spark.SparkContext sc, java.lang.String path)  { throw new RuntimeException(); }
  public  int rank ()  { throw new RuntimeException(); }
  public  org.apache.spark.rdd.RDD<scala.Tuple2<java.lang.Object, double[]>> userFeatures ()  { throw new RuntimeException(); }
  public  org.apache.spark.rdd.RDD<scala.Tuple2<java.lang.Object, double[]>> productFeatures ()  { throw new RuntimeException(); }
  // not preceding
  public   MatrixFactorizationModel (int rank, org.apache.spark.rdd.RDD<scala.Tuple2<java.lang.Object, double[]>> userFeatures, org.apache.spark.rdd.RDD<scala.Tuple2<java.lang.Object, double[]>> productFeatures)  { throw new RuntimeException(); }
  /** Predict the rating of one user for one product. */
  public  double predict (int user, int product)  { throw new RuntimeException(); }
  /**
   * Predict the rating of many users for many products.
   * The output RDD has an element per each element in the input RDD (including all duplicates)
   * unless a user or product is missing in the training set.
   * <p>
   * @param usersProducts  RDD of (user, product) pairs.
   * @return RDD of Ratings.
   */
  public  org.apache.spark.rdd.RDD<org.apache.spark.mllib.recommendation.Rating> predict (org.apache.spark.rdd.RDD<scala.Tuple2<java.lang.Object, java.lang.Object>> usersProducts)  { throw new RuntimeException(); }
  /**
   * Java-friendly version of <code>MatrixFactorizationModel.predict</code>.
   * @param usersProducts (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.api.java.JavaRDD<org.apache.spark.mllib.recommendation.Rating> predict (org.apache.spark.api.java.JavaPairRDD<java.lang.Integer, java.lang.Integer> usersProducts)  { throw new RuntimeException(); }
  /**
   * Recommends products to a user.
   * <p>
   * @param user the user to recommend products to
   * @param num how many products to return. The number returned may be less than this.
   * @return {@link Rating} objects, each of which contains the given user ID, a product ID, and a
   *  "score" in the rating field. Each represents one recommended product, and they are sorted
   *  by score, decreasing. The first returned is the one predicted to be most strongly
   *  recommended to the user. The score is an opaque value that indicates how strongly
   *  recommended the product is.
   */
  public  org.apache.spark.mllib.recommendation.Rating[] recommendProducts (int user, int num)  { throw new RuntimeException(); }
  /**
   * Recommends users to a product. That is, this returns users who are most likely to be
   * interested in a product.
   * <p>
   * @param product the product to recommend users to
   * @param num how many users to return. The number returned may be less than this.
   * @return {@link Rating} objects, each of which contains a user ID, the given product ID, and a
   *  "score" in the rating field. Each represents one recommended user, and they are sorted
   *  by score, decreasing. The first returned is the one predicted to be most strongly
   *  recommended to the product. The score is an opaque value that indicates how strongly
   *  recommended the user is.
   */
  public  org.apache.spark.mllib.recommendation.Rating[] recommendUsers (int product, int num)  { throw new RuntimeException(); }
  /**
   * Save this model to the given path.
   * <p>
   * This saves:
   *  - human-readable (JSON) model metadata to path/metadata/
   *  - Parquet formatted data to path/data/
   * <p>
   * The model may be loaded using <code>Loader.load</code>.
   * <p>
   * @param sc  Spark context used to save model data.
   * @param path  Path specifying the directory in which to save this model.
   *              If the directory already exists, this method throws an exception.
   */
  public  void save (org.apache.spark.SparkContext sc, java.lang.String path)  { throw new RuntimeException(); }
  /**
   * Recommends top products for all users.
   * <p>
   * @param num how many products to return for every user.
   * @return [(Int, Array[Rating])] objects, where every tuple contains a userID and an array of
   * rating objects which contains the same userId, recommended productID and a "score" in the
   * rating field. Semantics of score is same as recommendProducts API
   */
  public  org.apache.spark.rdd.RDD<scala.Tuple2<java.lang.Object, org.apache.spark.mllib.recommendation.Rating[]>> recommendProductsForUsers (int num)  { throw new RuntimeException(); }
  /**
   * Recommends top users for all products.
   * <p>
   * @param num how many users to return for every product.
   * @return [(Int, Array[Rating])] objects, where every tuple contains a productID and an array
   * of rating objects which contains the recommended userId, same productID and a "score" in the
   * rating field. Semantics of score is same as recommendUsers API
   */
  public  org.apache.spark.rdd.RDD<scala.Tuple2<java.lang.Object, org.apache.spark.mllib.recommendation.Rating[]>> recommendUsersForProducts (int num)  { throw new RuntimeException(); }
}
