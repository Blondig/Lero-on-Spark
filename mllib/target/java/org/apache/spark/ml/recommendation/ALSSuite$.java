package org.apache.spark.ml.recommendation;
public  class ALSSuite$ implements org.apache.spark.internal.Logging, scala.Serializable {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final ALSSuite$ MODULE$ = null;
  public   ALSSuite$ ()  { throw new RuntimeException(); }
  /**
   * Mapping from all Params to valid settings which differ from the defaults.
   * This is useful for tests which need to exercise all Params, such as save/load.
   * This excludes input columns to simplify some tests.
   * @return (undocumented)
   */
  public  scala.collection.immutable.Map<java.lang.String, java.lang.Object> allModelParamSettings ()  { throw new RuntimeException(); }
  /**
   * Mapping from all Params to valid settings which differ from the defaults.
   * This is useful for tests which need to exercise all Params, such as save/load.
   * This excludes input columns to simplify some tests.
   * @return (undocumented)
   */
  public  scala.collection.immutable.Map<java.lang.String, java.lang.Object> allEstimatorParamSettings ()  { throw new RuntimeException(); }
  /**
   * Generates an implicit feedback dataset for testing ALS.
   * <p>
   * @param sc SparkContext
   * @param numUsers number of users
   * @param numItems number of items
   * @param rank rank
   * @param noiseStd the standard deviation of additive Gaussian noise on training data
   * @param seed random seed
   * @return (training, test)
   */
  public  scala.Tuple2<org.apache.spark.rdd.RDD<org.apache.spark.ml.recommendation.ALS.Rating<java.lang.Object>>, org.apache.spark.rdd.RDD<org.apache.spark.ml.recommendation.ALS.Rating<java.lang.Object>>> genImplicitTestData (org.apache.spark.SparkContext sc, int numUsers, int numItems, int rank, double noiseStd, long seed)  { throw new RuntimeException(); }
}
