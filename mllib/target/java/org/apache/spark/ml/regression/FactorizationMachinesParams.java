package org.apache.spark.ml.regression;
/**
 * Params for Factorization Machines
 */
public  interface FactorizationMachinesParams extends org.apache.spark.ml.PredictorParams, org.apache.spark.ml.param.shared.HasMaxIter, org.apache.spark.ml.param.shared.HasStepSize, org.apache.spark.ml.param.shared.HasTol, org.apache.spark.ml.param.shared.HasSolver, org.apache.spark.ml.param.shared.HasSeed, org.apache.spark.ml.param.shared.HasFitIntercept, org.apache.spark.ml.param.shared.HasRegParam, org.apache.spark.ml.param.shared.HasWeightCol {
  /**
   * Param for dimensionality of the factors (&amp;gt;= 0)
   * @group param
   * @return (undocumented)
   */
  public  org.apache.spark.ml.param.IntParam factorSize ()  ;
  /**
   * Param for whether to fit linear term (aka 1-way term)
   * @group param
   * @return (undocumented)
   */
  public  org.apache.spark.ml.param.BooleanParam fitLinear ()  ;
  /** @group getParam */
  public  int getFactorSize ()  ;
  /** @group getParam */
  public  boolean getFitLinear ()  ;
  /** @group getParam */
  public  double getInitStd ()  ;
  /** @group getParam */
  public  double getMiniBatchFraction ()  ;
  /**
   * Param for standard deviation of initial coefficients
   * @group param
   * @return (undocumented)
   */
  public  org.apache.spark.ml.param.DoubleParam initStd ()  ;
  /**
   * Param for mini-batch fraction, must be in range (0, 1]
   * @group param
   * @return (undocumented)
   */
  public  org.apache.spark.ml.param.DoubleParam miniBatchFraction ()  ;
  /**
   * The solver algorithm for optimization.
   * Supported options: "gd", "adamW".
   * Default: "adamW"
   * <p>
   * @group param
   * @return (undocumented)
   */
  public  org.apache.spark.ml.param.Param<java.lang.String> solver ()  ;
}
