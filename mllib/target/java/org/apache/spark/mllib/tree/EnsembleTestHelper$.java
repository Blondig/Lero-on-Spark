package org.apache.spark.mllib.tree;
public  class EnsembleTestHelper$ {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final EnsembleTestHelper$ MODULE$ = null;
  public   EnsembleTestHelper$ ()  { throw new RuntimeException(); }
  /**
   * Aggregates all values in data, and tests whether the empirical mean and stddev are within
   * epsilon of the expected values.
   * @param data  Every element of the data should be an i.i.d. sample from some distribution.
   * @param numCols (undocumented)
   * @param expectedMean (undocumented)
   * @param expectedStddev (undocumented)
   * @param epsilon (undocumented)
   */
  public  void testRandomArrays (double[][] data, int numCols, double expectedMean, double expectedStddev, double epsilon)  { throw new RuntimeException(); }
  public  void validateClassifier (org.apache.spark.mllib.tree.model.TreeEnsembleModel model, scala.collection.Seq<org.apache.spark.mllib.regression.LabeledPoint> input, double requiredAccuracy)  { throw new RuntimeException(); }
  /**
   * Validates a tree ensemble model for regression.
   * @param model (undocumented)
   * @param input (undocumented)
   * @param required (undocumented)
   * @param metricName (undocumented)
   */
  public  void validateRegressor (org.apache.spark.mllib.tree.model.TreeEnsembleModel model, scala.collection.Seq<org.apache.spark.mllib.regression.LabeledPoint> input, double required, java.lang.String metricName)  { throw new RuntimeException(); }
  public  org.apache.spark.mllib.regression.LabeledPoint[] generateOrderedLabeledPoints (int numFeatures, int numInstances)  { throw new RuntimeException(); }
}
