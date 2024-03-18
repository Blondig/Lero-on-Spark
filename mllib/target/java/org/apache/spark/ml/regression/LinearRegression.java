package org.apache.spark.ml.regression;
/**
 * Linear regression.
 * <p>
 * The learning objective is to minimize the specified loss function, with regularization.
 * This supports two kinds of loss:
 *  - squaredError (a.k.a squared loss)
 *  - huber (a hybrid of squared error for relatively small errors and absolute error for
 *  relatively large ones, and we estimate the scale parameter from training data)
 * <p>
 * This supports multiple types of regularization:
 *  - none (a.k.a. ordinary least squares)
 *  - L2 (ridge regression)
 *  - L1 (Lasso)
 *  - L2 + L1 (elastic net)
 * <p>
 * The squared error objective function is:
 * <p>
 * <blockquote>
 *   $$
 *   \begin{align}
 *   \min_{w}\frac{1}{2n}{\sum_{i=1}^n(X_{i}w - y_{i})^{2} +
 *   \lambda\left[\frac{1-\alpha}{2}{||w||_{2}}^{2} + \alpha{||w||_{1}}\right]}
 *   \end{align}
 *   $$
 * </blockquote>
 * <p>
 * The huber objective function is:
 * <p>
 * <blockquote>
 *   $$
 *   \begin{align}
 *   \min_{w, \sigma}\frac{1}{2n}{\sum_{i=1}^n\left(\sigma +
 *   H_m\left(\frac{X_{i}w - y_{i}}{\sigma}\right)\sigma\right) + \frac{1}{2}\lambda {||w||_2}^2}
 *   \end{align}
 *   $$
 * </blockquote>
 * <p>
 * where
 * <p>
 * <blockquote>
 *   $$
 *   \begin{align}
 *   H_m(z) = \begin{cases}
 *            z^2, &amp; \text {if } |z| &amp;lt; \epsilon, \\
 *            2\epsilon|z| - \epsilon^2, &amp; \text{otherwise}
 *            \end{cases}
 *   \end{align}
 *   $$
 * </blockquote>
 * <p>
 * Since 3.1.0, it supports stacking instances into blocks and using GEMV for
 * better performance.
 * The block size will be 1.0 MB, if param maxBlockSizeInMB is set 0.0 by default.
 * <p>
 * Note: Fitting with huber loss only supports none and L2 regularization.
 */
public  class LinearRegression extends org.apache.spark.ml.regression.Regressor<org.apache.spark.ml.linalg.Vector, org.apache.spark.ml.regression.LinearRegression, org.apache.spark.ml.regression.LinearRegressionModel> implements org.apache.spark.ml.regression.LinearRegressionParams, org.apache.spark.ml.util.DefaultParamsWritable, org.apache.spark.internal.Logging {
  static public  org.apache.spark.ml.regression.LinearRegression load (java.lang.String path)  { throw new RuntimeException(); }
  /**
   * When using <code>LinearRegression.solver</code> == "normal", the solver must limit the number of
   * features to at most this number.  The entire covariance matrix X^T^X will be collected
   * to the driver. This limit helps prevent memory overflow errors.
   * @return (undocumented)
   */
  static public  int MAX_FEATURES_FOR_NORMAL_SOLVER ()  { throw new RuntimeException(); }
  /** String name for "auto". */
  static   java.lang.String Auto ()  { throw new RuntimeException(); }
  /** String name for "normal". */
  static   java.lang.String Normal ()  { throw new RuntimeException(); }
  /** String name for "l-bfgs". */
  static   java.lang.String LBFGS ()  { throw new RuntimeException(); }
  /** Set of solvers that LinearRegression supports. */
  static   java.lang.String[] supportedSolvers ()  { throw new RuntimeException(); }
  /** String name for "squaredError". */
  static   java.lang.String SquaredError ()  { throw new RuntimeException(); }
  /** String name for "huber". */
  static   java.lang.String Huber ()  { throw new RuntimeException(); }
  /** Set of loss function names that LinearRegression supports. */
  static   java.lang.String[] supportedLosses ()  { throw new RuntimeException(); }
  static public  org.apache.spark.ml.util.MLReader<T> read ()  { throw new RuntimeException(); }
  public final  org.apache.spark.ml.param.Param<java.lang.String> solver ()  { throw new RuntimeException(); }
  public final  org.apache.spark.ml.param.Param<java.lang.String> loss ()  { throw new RuntimeException(); }
  public final  org.apache.spark.ml.param.DoubleParam epsilon ()  { throw new RuntimeException(); }
  public final  org.apache.spark.ml.param.DoubleParam maxBlockSizeInMB ()  { throw new RuntimeException(); }
  public final  org.apache.spark.ml.param.IntParam aggregationDepth ()  { throw new RuntimeException(); }
  public final  org.apache.spark.ml.param.Param<java.lang.String> weightCol ()  { throw new RuntimeException(); }
  public final  org.apache.spark.ml.param.BooleanParam standardization ()  { throw new RuntimeException(); }
  public final  org.apache.spark.ml.param.BooleanParam fitIntercept ()  { throw new RuntimeException(); }
  public final  org.apache.spark.ml.param.DoubleParam tol ()  { throw new RuntimeException(); }
  public final  org.apache.spark.ml.param.IntParam maxIter ()  { throw new RuntimeException(); }
  public final  org.apache.spark.ml.param.DoubleParam elasticNetParam ()  { throw new RuntimeException(); }
  public final  org.apache.spark.ml.param.DoubleParam regParam ()  { throw new RuntimeException(); }
  public  java.lang.String uid ()  { throw new RuntimeException(); }
  // not preceding
  public   LinearRegression (java.lang.String uid)  { throw new RuntimeException(); }
  public   LinearRegression ()  { throw new RuntimeException(); }
  /**
   * Set the regularization parameter.
   * Default is 0.0.
   * <p>
   * @group setParam
   * @param value (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.ml.regression.LinearRegression setRegParam (double value)  { throw new RuntimeException(); }
  /**
   * Set if we should fit the intercept.
   * Default is true.
   * <p>
   * @group setParam
   * @param value (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.ml.regression.LinearRegression setFitIntercept (boolean value)  { throw new RuntimeException(); }
  /**
   * Whether to standardize the training features before fitting the model.
   * The coefficients of models will be always returned on the original scale,
   * so it will be transparent for users.
   * Default is true.
   * <p>
   * @note With/without standardization, the models should be always converged
   * to the same solution when no regularization is applied. In R's GLMNET package,
   * the default behavior is true as well.
   * <p>
   * @group setParam
   * @param value (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.ml.regression.LinearRegression setStandardization (boolean value)  { throw new RuntimeException(); }
  /**
   * Set the ElasticNet mixing parameter.
   * For alpha = 0, the penalty is an L2 penalty.
   * For alpha = 1, it is an L1 penalty.
   * For alpha in (0,1), the penalty is a combination of L1 and L2.
   * Default is 0.0 which is an L2 penalty.
   * <p>
   * Note: Fitting with huber loss only supports None and L2 regularization,
   * so throws exception if this param is non-zero value.
   * <p>
   * @group setParam
   * @param value (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.ml.regression.LinearRegression setElasticNetParam (double value)  { throw new RuntimeException(); }
  /**
   * Set the maximum number of iterations.
   * Default is 100.
   * <p>
   * @group setParam
   * @param value (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.ml.regression.LinearRegression setMaxIter (int value)  { throw new RuntimeException(); }
  /**
   * Set the convergence tolerance of iterations.
   * Smaller value will lead to higher accuracy with the cost of more iterations.
   * Default is 1E-6.
   * <p>
   * @group setParam
   * @param value (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.ml.regression.LinearRegression setTol (double value)  { throw new RuntimeException(); }
  /**
   * Whether to over-/under-sample training instances according to the given weights in weightCol.
   * If not set or empty, all instances are treated equally (weight 1.0).
   * Default is not set, so all instances have weight one.
   * <p>
   * @group setParam
   * @param value (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.ml.regression.LinearRegression setWeightCol (java.lang.String value)  { throw new RuntimeException(); }
  /**
   * Set the solver algorithm used for optimization.
   * In case of linear regression, this can be "l-bfgs", "normal" and "auto".
   *  - "l-bfgs" denotes Limited-memory BFGS which is a limited-memory quasi-Newton
   *    optimization method.
   *  - "normal" denotes using Normal Equation as an analytical solution to the linear regression
   *    problem.  This solver is limited to <code>LinearRegression.MAX_FEATURES_FOR_NORMAL_SOLVER</code>.
   *  - "auto" (default) means that the solver algorithm is selected automatically.
   *    The Normal Equations solver will be used when possible, but this will automatically fall
   *    back to iterative optimization methods when needed.
   * <p>
   * Note: Fitting with huber loss doesn't support normal solver,
   * so throws exception if this param was set with "normal".
   * @group setParam
   * @param value (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.ml.regression.LinearRegression setSolver (java.lang.String value)  { throw new RuntimeException(); }
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
  public  org.apache.spark.ml.regression.LinearRegression setAggregationDepth (int value)  { throw new RuntimeException(); }
  /**
   * Sets the value of param {@link loss}.
   * Default is "squaredError".
   * <p>
   * @group setParam
   * @param value (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.ml.regression.LinearRegression setLoss (java.lang.String value)  { throw new RuntimeException(); }
  /**
   * Sets the value of param {@link epsilon}.
   * Default is 1.35.
   * <p>
   * @group setExpertParam
   * @param value (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.ml.regression.LinearRegression setEpsilon (double value)  { throw new RuntimeException(); }
  /**
   * Sets the value of param {@link maxBlockSizeInMB}.
   * Default is 0.0, then 1.0 MB will be chosen.
   * <p>
   * @group expertSetParam
   * @param value (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.ml.regression.LinearRegression setMaxBlockSizeInMB (double value)  { throw new RuntimeException(); }
  protected  org.apache.spark.ml.regression.LinearRegressionModel train (org.apache.spark.sql.Dataset<?> dataset)  { throw new RuntimeException(); }
  public  org.apache.spark.ml.regression.LinearRegression copy (org.apache.spark.ml.param.ParamMap extra)  { throw new RuntimeException(); }
}
