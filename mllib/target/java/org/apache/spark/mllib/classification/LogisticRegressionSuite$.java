package org.apache.spark.mllib.classification;
public  class LogisticRegressionSuite$ implements scala.Serializable {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final LogisticRegressionSuite$ MODULE$ = null;
  public   LogisticRegressionSuite$ ()  { throw new RuntimeException(); }
  public  java.util.List<org.apache.spark.mllib.regression.LabeledPoint> generateLogisticInputAsList (double offset, double scale, int nPoints, int seed)  { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.mllib.regression.LabeledPoint> generateLogisticInput (double offset, double scale, int nPoints, int seed)  { throw new RuntimeException(); }
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
  public  scala.collection.Seq<org.apache.spark.mllib.regression.LabeledPoint> generateMultinomialLogisticInput (double[] weights, double[] xMean, double[] xVariance, boolean addIntercept, int nPoints, int seed)  { throw new RuntimeException(); }
}
