package org.apache.spark.ml.regression;
public  class GBTRegressionModel$ implements org.apache.spark.ml.util.MLReadable<org.apache.spark.ml.regression.GBTRegressionModel>, scala.Serializable {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final GBTRegressionModel$ MODULE$ = null;
  public   GBTRegressionModel$ ()  { throw new RuntimeException(); }
  public  org.apache.spark.ml.util.MLReader<org.apache.spark.ml.regression.GBTRegressionModel> read ()  { throw new RuntimeException(); }
  public  org.apache.spark.ml.regression.GBTRegressionModel load (java.lang.String path)  { throw new RuntimeException(); }
  /** Convert a model from the old API */
    org.apache.spark.ml.regression.GBTRegressionModel fromOld (org.apache.spark.mllib.tree.model.GradientBoostedTreesModel oldModel, org.apache.spark.ml.regression.GBTRegressor parent, scala.collection.immutable.Map<java.lang.Object, java.lang.Object> categoricalFeatures, int numFeatures)  { throw new RuntimeException(); }
}
