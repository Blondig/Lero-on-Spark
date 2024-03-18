package org.apache.spark.ml.regression;
public  class DecisionTreeRegressorSuite$ extends org.apache.spark.SparkFunSuite {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final DecisionTreeRegressorSuite$ MODULE$ = null;
  public   DecisionTreeRegressorSuite$ ()  { throw new RuntimeException(); }
  /**
   * Train 2 decision trees on the given dataset, one using the old API and one using the new API.
   * Convert the old tree to the new format, compare them, and fail if they are not exactly equal.
   * @param data (undocumented)
   * @param dt (undocumented)
   * @param categoricalFeatures (undocumented)
   */
  public  void compareAPIs (org.apache.spark.rdd.RDD<org.apache.spark.ml.feature.LabeledPoint> data, org.apache.spark.ml.regression.DecisionTreeRegressor dt, scala.collection.immutable.Map<java.lang.Object, java.lang.Object> categoricalFeatures)  { throw new RuntimeException(); }
}
