package org.apache.spark.ml.classification;
/**
 * Enable the ignored test to export the dataset into CSV format,
 * so we can validate the training accuracy compared with R's glmnet package.
 */
public  class LogisticRegressionSuite$ implements scala.Serializable {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final LogisticRegressionSuite$ MODULE$ = null;
  public   LogisticRegressionSuite$ ()  { throw new RuntimeException(); }
  /**
   * Mapping from all Params to valid settings which differ from the defaults.
   * This is useful for tests which need to exercise all Params, such as save/load.
   * This excludes input columns to simplify some tests.
   * @return (undocumented)
   */
  public  scala.collection.immutable.Map<java.lang.String, java.lang.Object> allParamSettings ()  { throw new RuntimeException(); }
  public  java.util.List<org.apache.spark.ml.feature.LabeledPoint> generateLogisticInputAsList (double offset, double scale, int nPoints, int seed)  { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.ml.feature.LabeledPoint> generateLogisticInput (double offset, double scale, int nPoints, int seed)  { throw new RuntimeException(); }
  /**
   * Generates <code>k</code> classes multinomial synthetic logistic input in <code>n</code> dimensional space given the
   * model weights and mean/variance of the features. The synthetic data will be drawn from
   * the probability distribution constructed by weights using the following formula.
   * <p>
   * P(y = 0 | x) = 1 / norm
   * P(y = 1 | x) = exp(x * w_1) / norm
   * P(y = 2 | x) = exp(x * w_2) / norm
   * ...
   * P(y = k-1 | x) = exp(x * w_{k-1}) / norm
   * where norm = 1 + exp(x * w_1) + exp(x * w_2) + ... + exp(x * w_{k-1})
   * <p>
   * @param weights matrix is flatten into a vector; as a result, the dimension of weights vector
   *                will be (k - 1) * (n + 1) if <code>addIntercept == true</code>, and
   *                if <code>addIntercept != true</code>, the dimension will be (k - 1) * n.
   * @param xMean the mean of the generated features. Lots of time, if the features are not properly
   *              standardized, the algorithm with poor implementation will have difficulty
   *              to converge.
   * @param xVariance the variance of the generated features.
   * @param addIntercept whether to add intercept.
   * @param nPoints the number of instance of generated data.
   * @param seed the seed for random generator. For consistent testing result, it will be fixed.
   * @return (undocumented)
   */
  public  scala.collection.Seq<org.apache.spark.ml.feature.LabeledPoint> generateMultinomialLogisticInput (double[] weights, double[] xMean, double[] xVariance, boolean addIntercept, int nPoints, int seed)  { throw new RuntimeException(); }
  /**
   * Note: This method is only used in Bounded MLOR (without regularization) test
   * When no regularization is applied, the multinomial coefficients lack identifiability
   * because we do not use a pivot class. We can add any constant value to the coefficients
   * and get the same likelihood. If fitting under bound constrained optimization, we don't
   * choose the mean centered coefficients like what we do for unbound problems, since they
   * may out of the bounds. We use this function to check whether two coefficients are equivalent.
   * @param coefficients1 (undocumented)
   * @param coefficients2 (undocumented)
   */
  public  void checkBoundedMLORCoefficientsEquivalent (org.apache.spark.ml.linalg.Matrix coefficients1, org.apache.spark.ml.linalg.Matrix coefficients2)  { throw new RuntimeException(); }
}
