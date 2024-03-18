package org.apache.spark.ml.classification;
/**
 * <a href = "https://en.wikipedia.org/wiki/Support_vector_machine#Linear_SVM">
 *   Linear SVM Classifier</a>
 * <p>
 * This binary classifier optimizes the Hinge Loss using the OWLQN optimizer.
 * Only supports L2 regularization currently.
 * <p>
 * Since 3.1.0, it supports stacking instances into blocks and using GEMV for
 * better performance.
 * The block size will be 1.0 MB, if param maxBlockSizeInMB is set 0.0 by default.
 * <p>
 */
public  class LinearSVC extends org.apache.spark.ml.classification.Classifier<org.apache.spark.ml.linalg.Vector, org.apache.spark.ml.classification.LinearSVC, org.apache.spark.ml.classification.LinearSVCModel> implements org.apache.spark.ml.classification.LinearSVCParams, org.apache.spark.ml.util.DefaultParamsWritable {
  static public  org.apache.spark.ml.classification.LinearSVC load (java.lang.String path)  { throw new RuntimeException(); }
  static public  org.apache.spark.ml.util.MLReader<T> read ()  { throw new RuntimeException(); }
  public final  org.apache.spark.ml.param.DoubleParam threshold ()  { throw new RuntimeException(); }
  public final  org.apache.spark.ml.param.DoubleParam maxBlockSizeInMB ()  { throw new RuntimeException(); }
  public final  org.apache.spark.ml.param.IntParam aggregationDepth ()  { throw new RuntimeException(); }
  public final  org.apache.spark.ml.param.Param<java.lang.String> weightCol ()  { throw new RuntimeException(); }
  public final  org.apache.spark.ml.param.BooleanParam standardization ()  { throw new RuntimeException(); }
  public final  org.apache.spark.ml.param.DoubleParam tol ()  { throw new RuntimeException(); }
  public final  org.apache.spark.ml.param.BooleanParam fitIntercept ()  { throw new RuntimeException(); }
  public final  org.apache.spark.ml.param.IntParam maxIter ()  { throw new RuntimeException(); }
  public final  org.apache.spark.ml.param.DoubleParam regParam ()  { throw new RuntimeException(); }
  public  java.lang.String uid ()  { throw new RuntimeException(); }
  // not preceding
  public   LinearSVC (java.lang.String uid)  { throw new RuntimeException(); }
  public   LinearSVC ()  { throw new RuntimeException(); }
  /**
   * Set the regularization parameter.
   * Default is 0.0.
   * <p>
   * @group setParam
   * @param value (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.ml.classification.LinearSVC setRegParam (double value)  { throw new RuntimeException(); }
  /**
   * Set the maximum number of iterations.
   * Default is 100.
   * <p>
   * @group setParam
   * @param value (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.ml.classification.LinearSVC setMaxIter (int value)  { throw new RuntimeException(); }
  /**
   * Whether to fit an intercept term.
   * Default is true.
   * <p>
   * @group setParam
   * @param value (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.ml.classification.LinearSVC setFitIntercept (boolean value)  { throw new RuntimeException(); }
  /**
   * Set the convergence tolerance of iterations.
   * Smaller values will lead to higher accuracy at the cost of more iterations.
   * Default is 1E-6.
   * <p>
   * @group setParam
   * @param value (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.ml.classification.LinearSVC setTol (double value)  { throw new RuntimeException(); }
  /**
   * Whether to standardize the training features before fitting the model.
   * Default is true.
   * <p>
   * @group setParam
   * @param value (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.ml.classification.LinearSVC setStandardization (boolean value)  { throw new RuntimeException(); }
  /**
   * Set the value of param {@link weightCol}.
   * If this is not set or empty, we treat all instance weights as 1.0.
   * Default is not set, so all instances have weight one.
   * <p>
   * @group setParam
   * @param value (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.ml.classification.LinearSVC setWeightCol (java.lang.String value)  { throw new RuntimeException(); }
  /**
   * Set threshold in binary classification.
   * <p>
   * @group setParam
   * @param value (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.ml.classification.LinearSVC setThreshold (double value)  { throw new RuntimeException(); }
  /**
   * Suggested depth for treeAggregate (greater than or equal to 2).
   * If the dimensions of features or the number of partitions are large,
   * this param could be adjusted to a larger size.
   * Default is 2.
   * <p>
   * @group expertSetParam
   * @param value (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.ml.classification.LinearSVC setAggregationDepth (int value)  { throw new RuntimeException(); }
  /**
   * Sets the value of param {@link maxBlockSizeInMB}.
   * Default is 0.0, then 1.0 MB will be chosen.
   * <p>
   * @group expertSetParam
   * @param value (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.ml.classification.LinearSVC setMaxBlockSizeInMB (double value)  { throw new RuntimeException(); }
  public  org.apache.spark.ml.classification.LinearSVC copy (org.apache.spark.ml.param.ParamMap extra)  { throw new RuntimeException(); }
  protected  org.apache.spark.ml.classification.LinearSVCModel train (org.apache.spark.sql.Dataset<?> dataset)  { throw new RuntimeException(); }
}
