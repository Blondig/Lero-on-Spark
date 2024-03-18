package org.apache.spark.ml.regression;
/**
 * Params for linear regression.
 */
public  interface LinearRegressionParams extends org.apache.spark.ml.PredictorParams, org.apache.spark.ml.param.shared.HasRegParam, org.apache.spark.ml.param.shared.HasElasticNetParam, org.apache.spark.ml.param.shared.HasMaxIter, org.apache.spark.ml.param.shared.HasTol, org.apache.spark.ml.param.shared.HasFitIntercept, org.apache.spark.ml.param.shared.HasStandardization, org.apache.spark.ml.param.shared.HasWeightCol, org.apache.spark.ml.param.shared.HasSolver, org.apache.spark.ml.param.shared.HasAggregationDepth, org.apache.spark.ml.param.shared.HasLoss, org.apache.spark.ml.param.shared.HasMaxBlockSizeInMB {
  /**
   * The shape parameter to control the amount of robustness. Must be &amp;gt; 1.0.
   * At larger values of epsilon, the huber criterion becomes more similar to least squares
   * regression; for small values of epsilon, the criterion is more similar to L1 regression.
   * Default is 1.35 to get as much robustness as possible while retaining
   * 95% statistical efficiency for normally distributed data. It matches sklearn
   * HuberRegressor and is "M" from <a href="http://statweb.stanford.edu/~owen/reports/hhu.pdf">
   * A robust hybrid of lasso and ridge regression</a>.
   * Only valid when "loss" is "huber".
   * <p>
   * @group expertParam
   * @return (undocumented)
   */
  public  org.apache.spark.ml.param.DoubleParam epsilon ()  ;
  /** @group getExpertParam */
  public  double getEpsilon ()  ;
  /**
   * The loss function to be optimized.
   * Supported options: "squaredError" and "huber".
   * Default: "squaredError"
   * <p>
   * @group param
   * @return (undocumented)
   */
  public  org.apache.spark.ml.param.Param<java.lang.String> loss ()  ;
  /**
   * The solver algorithm for optimization.
   * Supported options: "l-bfgs", "normal" and "auto".
   * Default: "auto"
   * <p>
   * @group param
   * @return (undocumented)
   */
  public  org.apache.spark.ml.param.Param<java.lang.String> solver ()  ;
  public  org.apache.spark.sql.types.StructType validateAndTransformSchema (org.apache.spark.sql.types.StructType schema, boolean fitting, org.apache.spark.sql.types.DataType featuresDataType)  ;
}
