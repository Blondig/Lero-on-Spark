package org.apache.spark.ml.regression;
/**
 * Params for Generalized Linear Regression.
 */
public  interface GeneralizedLinearRegressionBase extends org.apache.spark.ml.PredictorParams, org.apache.spark.ml.param.shared.HasFitIntercept, org.apache.spark.ml.param.shared.HasMaxIter, org.apache.spark.ml.param.shared.HasTol, org.apache.spark.ml.param.shared.HasRegParam, org.apache.spark.ml.param.shared.HasWeightCol, org.apache.spark.ml.param.shared.HasSolver, org.apache.spark.ml.param.shared.HasAggregationDepth, org.apache.spark.internal.Logging {
  /**
   * Param for the name of family which is a description of the error distribution
   * to be used in the model.
   * Supported options: "gaussian", "binomial", "poisson", "gamma" and "tweedie".
   * Default is "gaussian".
   * <p>
   * @group param
   * @return (undocumented)
   */
  public  org.apache.spark.ml.param.Param<java.lang.String> family ()  ;
  /** @group getParam */
  public  java.lang.String getFamily ()  ;
  /** @group getParam */
  public  java.lang.String getLink ()  ;
  /** @group getParam */
  public  double getLinkPower ()  ;
  /** @group getParam */
  public  java.lang.String getLinkPredictionCol ()  ;
  /** @group getParam */
  public  java.lang.String getOffsetCol ()  ;
  /** @group getParam */
  public  double getVariancePower ()  ;
  /** Checks whether we should output link prediction. */
    boolean hasLinkPredictionCol ()  ;
  /** Checks whether offset column is set and nonempty. */
    boolean hasOffsetCol ()  ;
  /** Checks whether weight column is set and nonempty. */
    boolean hasWeightCol ()  ;
  /**
   * Param for the name of link function which provides the relationship
   * between the linear predictor and the mean of the distribution function.
   * Supported options: "identity", "log", "inverse", "logit", "probit", "cloglog" and "sqrt".
   * This is used only when family is not "tweedie". The link function for the "tweedie" family
   * must be specified through {@link linkPower}.
   * <p>
   * @group param
   * @return (undocumented)
   */
  public  org.apache.spark.ml.param.Param<java.lang.String> link ()  ;
  /**
   * Param for the index in the power link function. Only applicable to the Tweedie family.
   * Note that link power 0, 1, -1 or 0.5 corresponds to the Log, Identity, Inverse or Sqrt
   * link, respectively.
   * When not set, this value defaults to 1 - {@link variancePower}, which matches the R "statmod"
   * package.
   * <p>
   * @group param
   * @return (undocumented)
   */
  public  org.apache.spark.ml.param.DoubleParam linkPower ()  ;
  /**
   * Param for link prediction (linear predictor) column name.
   * Default is not set, which means we do not output link prediction.
   * <p>
   * @group param
   * @return (undocumented)
   */
  public  org.apache.spark.ml.param.Param<java.lang.String> linkPredictionCol ()  ;
  /**
   * Param for offset column name. If this is not set or empty, we treat all instance offsets
   * as 0.0. The feature specified as offset has a constant coefficient of 1.0.
   * <p>
   * @group param
   * @return (undocumented)
   */
  public  org.apache.spark.ml.param.Param<java.lang.String> offsetCol ()  ;
  /**
   * The solver algorithm for optimization.
   * Supported options: "irls" (iteratively reweighted least squares).
   * Default: "irls"
   * <p>
   * @group param
   * @return (undocumented)
   */
  public  org.apache.spark.ml.param.Param<java.lang.String> solver ()  ;
  public  org.apache.spark.sql.types.StructType validateAndTransformSchema (org.apache.spark.sql.types.StructType schema, boolean fitting, org.apache.spark.sql.types.DataType featuresDataType)  ;
  /**
   * Param for the power in the variance function of the Tweedie distribution which provides
   * the relationship between the variance and mean of the distribution.
   * Only applicable to the Tweedie family.
   * (see <a href="https://en.wikipedia.org/wiki/Tweedie_distribution">
   * Tweedie Distribution (Wikipedia)</a>)
   * Supported values: 0 and [1, Inf).
   * Note that variance power 0, 1, or 2 corresponds to the Gaussian, Poisson or Gamma
   * family, respectively.
   * <p>
   * @group param
   * @return (undocumented)
   */
  public  org.apache.spark.ml.param.DoubleParam variancePower ()  ;
}
