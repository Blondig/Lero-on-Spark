package org.apache.spark.ml.classification;
/**
 * Params for logistic regression.
 */
public  interface LogisticRegressionParams extends org.apache.spark.ml.classification.ProbabilisticClassifierParams, org.apache.spark.ml.param.shared.HasRegParam, org.apache.spark.ml.param.shared.HasElasticNetParam, org.apache.spark.ml.param.shared.HasMaxIter, org.apache.spark.ml.param.shared.HasFitIntercept, org.apache.spark.ml.param.shared.HasTol, org.apache.spark.ml.param.shared.HasStandardization, org.apache.spark.ml.param.shared.HasWeightCol, org.apache.spark.ml.param.shared.HasThreshold, org.apache.spark.ml.param.shared.HasAggregationDepth, org.apache.spark.ml.param.shared.HasMaxBlockSizeInMB {
  /**
   * If <code>threshold</code> and <code>thresholds</code> are both set, ensures they are consistent.
   * <p>
   * @throws IllegalArgumentException if <code>threshold</code> and <code>thresholds</code> are not equivalent
   */
  public  void checkThresholdConsistency ()  ;
  /**
   * Param for the name of family which is a description of the label distribution
   * to be used in the model.
   * Supported options:
   *  - "auto": Automatically select the family based on the number of classes:
   *            If numClasses == 1 || numClasses == 2, set to "binomial".
   *            Else, set to "multinomial"
   *  - "binomial": Binary logistic regression with pivoting.
   *  - "multinomial": Multinomial logistic (softmax) regression without pivoting.
   * Default is "auto".
   * <p>
   * @group param
   * @return (undocumented)
   */
  public  org.apache.spark.ml.param.Param<java.lang.String> family ()  ;
  /** @group getParam */
  public  java.lang.String getFamily ()  ;
  /** @group expertGetParam */
  public  org.apache.spark.ml.linalg.Matrix getLowerBoundsOnCoefficients ()  ;
  /** @group expertGetParam */
  public  org.apache.spark.ml.linalg.Vector getLowerBoundsOnIntercepts ()  ;
  /**
   * Get threshold for binary classification.
   * <p>
   * If <code>thresholds</code> is set with length 2 (i.e., binary classification),
   * this returns the equivalent threshold: <pre><code>1 / (1 + thresholds(0) / thresholds(1))</code></pre>.
   * Otherwise, returns `threshold` if set, or its default value if unset.
   *
   * &#64;group getParam
   * &#64;throws IllegalArgumentException if `thresholds` is set to an array of length other than 2.
   * @return (undocumented)
   */
  public  double getThreshold ()  ;
  /**
   * Get thresholds for binary or multiclass classification.
   * <p>
   * If <code>thresholds</code> is set, return its value.
   * Otherwise, if <code>threshold</code> is set, return the equivalent thresholds for binary
   * classification: (1-threshold, threshold).
   * If neither are set, throw an exception.
   * <p>
   * @group getParam
   * @return (undocumented)
   */
  public  double[] getThresholds ()  ;
  /** @group expertGetParam */
  public  org.apache.spark.ml.linalg.Matrix getUpperBoundsOnCoefficients ()  ;
  /** @group expertGetParam */
  public  org.apache.spark.ml.linalg.Vector getUpperBoundsOnIntercepts ()  ;
  /**
   * The lower bounds on coefficients if fitting under bound constrained optimization.
   * The bound matrix must be compatible with the shape (1, number of features) for binomial
   * regression, or (number of classes, number of features) for multinomial regression.
   * Otherwise, it throws exception.
   * Default is none.
   * <p>
   * @group expertParam
   * @return (undocumented)
   */
  public  org.apache.spark.ml.param.Param<org.apache.spark.ml.linalg.Matrix> lowerBoundsOnCoefficients ()  ;
  /**
   * The lower bounds on intercepts if fitting under bound constrained optimization.
   * The bounds vector size must be equal to 1 for binomial regression, or the number
   * of classes for multinomial regression. Otherwise, it throws exception.
   * Default is none.
   * <p>
   * @group expertParam
   * @return (undocumented)
   */
  public  org.apache.spark.ml.param.Param<org.apache.spark.ml.linalg.Vector> lowerBoundsOnIntercepts ()  ;
  /**
   * Set threshold in binary classification, in range [0, 1].
   * <p>
   * If the estimated probability of class label 1 is greater than threshold, then predict 1,
   * else 0. A high threshold encourages the model to predict 0 more often;
   * a low threshold encourages the model to predict 1 more often.
   * <p>
   * Note: Calling this with threshold p is equivalent to calling <code>setThresholds(Array(1-p, p))</code>.
   *       When <code>setThreshold()</code> is called, any user-set value for <code>thresholds</code> will be cleared.
   *       If both <code>threshold</code> and <code>thresholds</code> are set in a ParamMap, then they must be
   *       equivalent.
   * <p>
   * Default is 0.5.
   * <p>
   * @group setParam
   * @param value (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.ml.classification.LogisticRegressionParams setThreshold (double value)  ;
  /**
   * Set thresholds in multiclass (or binary) classification to adjust the probability of
   * predicting each class. Array must have length equal to the number of classes,
   * with values greater than 0, excepting that at most one value may be 0.
   * The class with largest value p/t is predicted, where p is the original probability of that
   * class and t is the class's threshold.
   * <p>
   * Note: When <code>setThresholds()</code> is called, any user-set value for <code>threshold</code> will be cleared.
   *       If both <code>threshold</code> and <code>thresholds</code> are set in a ParamMap, then they must be
   *       equivalent.
   * <p>
   * @group setParam
   * @param value (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.ml.classification.LogisticRegressionParams setThresholds (double[] value)  ;
  /**
   * The upper bounds on coefficients if fitting under bound constrained optimization.
   * The bound matrix must be compatible with the shape (1, number of features) for binomial
   * regression, or (number of classes, number of features) for multinomial regression.
   * Otherwise, it throws exception.
   * Default is none.
   * <p>
   * @group expertParam
   * @return (undocumented)
   */
  public  org.apache.spark.ml.param.Param<org.apache.spark.ml.linalg.Matrix> upperBoundsOnCoefficients ()  ;
  /**
   * The upper bounds on intercepts if fitting under bound constrained optimization.
   * The bound vector size must be equal to 1 for binomial regression, or the number
   * of classes for multinomial regression. Otherwise, it throws exception.
   * Default is none.
   * <p>
   * @group expertParam
   * @return (undocumented)
   */
  public  org.apache.spark.ml.param.Param<org.apache.spark.ml.linalg.Vector> upperBoundsOnIntercepts ()  ;
  public  boolean usingBoundConstrainedOptimization ()  ;
  public  org.apache.spark.sql.types.StructType validateAndTransformSchema (org.apache.spark.sql.types.StructType schema, boolean fitting, org.apache.spark.sql.types.DataType featuresDataType)  ;
}
