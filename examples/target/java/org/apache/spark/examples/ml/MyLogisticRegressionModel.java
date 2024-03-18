package org.apache.spark.examples.ml;
/**
 * Example of defining a type of {@link ClassificationModel}.
 * <p>
 * NOTE: This is private since it is an example. In practice, you may not want it to be private.
 */
public  class MyLogisticRegressionModel extends org.apache.spark.ml.classification.ClassificationModel<org.apache.spark.ml.linalg.Vector, org.apache.spark.examples.ml.MyLogisticRegressionModel> implements org.apache.spark.examples.ml.MyLogisticRegressionParams {
  // not preceding
  public   MyLogisticRegressionModel (java.lang.String uid, org.apache.spark.ml.linalg.Vector coefficients)  { throw new RuntimeException(); }
  public  org.apache.spark.ml.linalg.Vector coefficients ()  { throw new RuntimeException(); }
  /**
   * Create a copy of the model.
   * The copy is shallow, except for the embedded paramMap, which gets a deep copy.
   * <p>
   * This is used for the default implementation of {@link transform()}.
   * @param extra (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.examples.ml.MyLogisticRegressionModel copy (org.apache.spark.ml.param.ParamMap extra)  { throw new RuntimeException(); }
  public  org.apache.spark.ml.param.IntParam maxIter ()  { throw new RuntimeException(); }
  public  int numClasses ()  { throw new RuntimeException(); }
  public  int numFeatures ()  { throw new RuntimeException(); }
  /**
   * Raw prediction for each possible label.
   * The meaning of a "raw" prediction may vary between algorithms, but it intuitively gives
   * a measure of confidence in each possible label (where larger = more confident).
   * This internal method is used to implement {@link transform()} and output {@link rawPredictionCol}.
   * <p>
   * @return  vector where element i is the raw prediction for label i.
   *          This raw prediction may be any real number, where a larger value indicates greater
   *          confidence for that label.
   * @param features (undocumented)
   */
  public  org.apache.spark.ml.linalg.Vector predictRaw (org.apache.spark.ml.linalg.Vector features)  { throw new RuntimeException(); }
  public  java.lang.String uid ()  { throw new RuntimeException(); }
}
