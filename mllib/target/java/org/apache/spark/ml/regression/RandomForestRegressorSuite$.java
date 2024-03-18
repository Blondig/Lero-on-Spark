package org.apache.spark.ml.regression;
public  class RandomForestRegressorSuite$ extends org.apache.spark.SparkFunSuite {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final RandomForestRegressorSuite$ MODULE$ = null;
  public   RandomForestRegressorSuite$ ()  { throw new RuntimeException(); }
  /**
   * Train 2 models on the given dataset, one using the old API and one using the new API.
   * Convert the old model to the new format, compare them, and fail if they are not exactly equal.
   * @param data (undocumented)
   * @param rf (undocumented)
   * @param categoricalFeatures (undocumented)
   */
  public  void compareAPIs (org.apache.spark.rdd.RDD<org.apache.spark.ml.feature.LabeledPoint> data, org.apache.spark.ml.regression.RandomForestRegressor rf, scala.collection.immutable.Map<java.lang.Object, java.lang.Object> categoricalFeatures)  { throw new RuntimeException(); }
}
