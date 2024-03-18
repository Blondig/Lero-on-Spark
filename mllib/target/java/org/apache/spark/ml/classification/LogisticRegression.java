package org.apache.spark.ml.classification;
/**
 * Logistic regression. Supports:
 *  - Multinomial logistic (softmax) regression.
 *  - Binomial logistic regression.
 * <p>
 * This class supports fitting traditional logistic regression model by LBFGS/OWLQN and
 * bound (box) constrained logistic regression model by LBFGSB.
 * <p>
 * Since 3.1.0, it supports stacking instances into blocks and using GEMV/GEMM for
 * better performance.
 * The block size will be 1.0 MB, if param maxBlockSizeInMB is set 0.0 by default.
 */
public  class LogisticRegression extends org.apache.spark.ml.classification.ProbabilisticClassifier<org.apache.spark.ml.linalg.Vector, org.apache.spark.ml.classification.LogisticRegression, org.apache.spark.ml.classification.LogisticRegressionModel> implements org.apache.spark.ml.classification.LogisticRegressionParams, org.apache.spark.ml.util.DefaultParamsWritable, org.apache.spark.internal.Logging {
  static public  org.apache.spark.ml.classification.LogisticRegression load (java.lang.String path)  { throw new RuntimeException(); }
  static   java.lang.String[] supportedFamilyNames ()  { throw new RuntimeException(); }
  static public  org.apache.spark.ml.util.MLReader<T> read ()  { throw new RuntimeException(); }
  public final  org.apache.spark.ml.param.Param<java.lang.String> family ()  { throw new RuntimeException(); }
  public  org.apache.spark.ml.param.Param<org.apache.spark.ml.linalg.Matrix> lowerBoundsOnCoefficients ()  { throw new RuntimeException(); }
  public  org.apache.spark.ml.param.Param<org.apache.spark.ml.linalg.Matrix> upperBoundsOnCoefficients ()  { throw new RuntimeException(); }
  public  org.apache.spark.ml.param.Param<org.apache.spark.ml.linalg.Vector> lowerBoundsOnIntercepts ()  { throw new RuntimeException(); }
  public  org.apache.spark.ml.param.Param<org.apache.spark.ml.linalg.Vector> upperBoundsOnIntercepts ()  { throw new RuntimeException(); }
  public final  org.apache.spark.ml.param.DoubleParam maxBlockSizeInMB ()  { throw new RuntimeException(); }
  public final  org.apache.spark.ml.param.IntParam aggregationDepth ()  { throw new RuntimeException(); }
  public  org.apache.spark.ml.param.DoubleParam threshold ()  { throw new RuntimeException(); }
  public final  org.apache.spark.ml.param.Param<java.lang.String> weightCol ()  { throw new RuntimeException(); }
  public final  org.apache.spark.ml.param.BooleanParam standardization ()  { throw new RuntimeException(); }
  public final  org.apache.spark.ml.param.DoubleParam tol ()  { throw new RuntimeException(); }
  public final  org.apache.spark.ml.param.BooleanParam fitIntercept ()  { throw new RuntimeException(); }
  public final  org.apache.spark.ml.param.IntParam maxIter ()  { throw new RuntimeException(); }
  public final  org.apache.spark.ml.param.DoubleParam elasticNetParam ()  { throw new RuntimeException(); }
  public final  org.apache.spark.ml.param.DoubleParam regParam ()  { throw new RuntimeException(); }
  public  java.lang.String uid ()  { throw new RuntimeException(); }
  // not preceding
  public   LogisticRegression (java.lang.String uid)  { throw new RuntimeException(); }
  public   LogisticRegression ()  { throw new RuntimeException(); }
  /**
   * Set the regularization parameter.
   * Default is 0.0.
   * <p>
   * @group setParam
   * @param value (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.ml.classification.LogisticRegression setRegParam (double value)  { throw new RuntimeException(); }
  /**
   * Set the ElasticNet mixing parameter.
   * For alpha = 0, the penalty is an L2 penalty.
   * For alpha = 1, it is an L1 penalty.
   * For alpha in (0,1), the penalty is a combination of L1 and L2.
   * Default is 0.0 which is an L2 penalty.
   * <p>
   * Note: Fitting under bound constrained optimization only supports L2 regularization,
   * so throws exception if this param is non-zero value.
   * <p>
   * @group setParam
   * @param value (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.ml.classification.LogisticRegression setElasticNetParam (double value)  { throw new RuntimeException(); }
  /**
   * Set the maximum number of iterations.
   * Default is 100.
   * <p>
   * @group setParam
   * @param value (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.ml.classification.LogisticRegression setMaxIter (int value)  { throw new RuntimeException(); }
  /**
   * Set the convergence tolerance of iterations.
   * Smaller value will lead to higher accuracy at the cost of more iterations.
   * Default is 1E-6.
   * <p>
   * @group setParam
   * @param value (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.ml.classification.LogisticRegression setTol (double value)  { throw new RuntimeException(); }
  /**
   * Whether to fit an intercept term.
   * Default is true.
   * <p>
   * @group setParam
   * @param value (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.ml.classification.LogisticRegression setFitIntercept (boolean value)  { throw new RuntimeException(); }
  /**
   * Sets the value of param {@link family}.
   * Default is "auto".
   * <p>
   * @group setParam
   * @param value (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.ml.classification.LogisticRegression setFamily (java.lang.String value)  { throw new RuntimeException(); }
  /**
   * Whether to standardize the training features before fitting the model.
   * The coefficients of models will be always returned on the original scale,
   * so it will be transparent for users. Note that with/without standardization,
   * the models should be always converged to the same solution when no regularization
   * is applied. In R's GLMNET package, the default behavior is true as well.
   * Default is true.
   * <p>
   * @group setParam
   * @param value (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.ml.classification.LogisticRegression setStandardization (boolean value)  { throw new RuntimeException(); }
  public  org.apache.spark.ml.classification.LogisticRegression setThreshold (double value)  { throw new RuntimeException(); }
  public  double getThreshold ()  { throw new RuntimeException(); }
  /**
   * Sets the value of param {@link weightCol}.
   * If this is not set or empty, we treat all instance weights as 1.0.
   * Default is not set, so all instances have weight one.
   * <p>
   * @group setParam
   * @param value (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.ml.classification.LogisticRegression setWeightCol (java.lang.String value)  { throw new RuntimeException(); }
  public  org.apache.spark.ml.classification.LogisticRegression setThresholds (double[] value)  { throw new RuntimeException(); }
  public  double[] getThresholds ()  { throw new RuntimeException(); }
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
  public  org.apache.spark.ml.classification.LogisticRegression setAggregationDepth (int value)  { throw new RuntimeException(); }
  /**
   * Set the lower bounds on coefficients if fitting under bound constrained optimization.
   * <p>
   * @group expertSetParam
   * @param value (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.ml.classification.LogisticRegression setLowerBoundsOnCoefficients (org.apache.spark.ml.linalg.Matrix value)  { throw new RuntimeException(); }
  /**
   * Set the upper bounds on coefficients if fitting under bound constrained optimization.
   * <p>
   * @group expertSetParam
   * @param value (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.ml.classification.LogisticRegression setUpperBoundsOnCoefficients (org.apache.spark.ml.linalg.Matrix value)  { throw new RuntimeException(); }
  /**
   * Set the lower bounds on intercepts if fitting under bound constrained optimization.
   * <p>
   * @group expertSetParam
   * @param value (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.ml.classification.LogisticRegression setLowerBoundsOnIntercepts (org.apache.spark.ml.linalg.Vector value)  { throw new RuntimeException(); }
  /**
   * Set the upper bounds on intercepts if fitting under bound constrained optimization.
   * <p>
   * @group expertSetParam
   * @param value (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.ml.classification.LogisticRegression setUpperBoundsOnIntercepts (org.apache.spark.ml.linalg.Vector value)  { throw new RuntimeException(); }
  /**
   * Sets the value of param {@link maxBlockSizeInMB}.
   * Default is 0.0, then 1.0 MB will be chosen.
   * <p>
   * @group expertSetParam
   * @param value (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.ml.classification.LogisticRegression setMaxBlockSizeInMB (double value)  { throw new RuntimeException(); }
  public  org.apache.spark.ml.classification.LogisticRegression setInitialModel (org.apache.spark.ml.classification.LogisticRegressionModel model)  { throw new RuntimeException(); }
  protected  org.apache.spark.ml.classification.LogisticRegressionModel train (org.apache.spark.sql.Dataset<?> dataset)  { throw new RuntimeException(); }
  public  org.apache.spark.ml.classification.LogisticRegression copy (org.apache.spark.ml.param.ParamMap extra)  { throw new RuntimeException(); }
}
