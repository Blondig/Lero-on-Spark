package org.apache.spark.ml.optim.aggregator;
/**
 * LeastSquaresBlockAggregator computes the gradient and loss used in Linear Regression
 * for blocks in sparse or dense matrix in an online fashion.
 * <p>
 * Two LeastSquaresBlockAggregator can be merged together to have a summary of loss and
 * gradient of the corresponding joint dataset.
 * <p>
 * NOTE: The feature values are expected to already have be scaled (multiplied by bcInverseStd,
 * but NOT centered) before computation.
 * <p>
 * NOTE: the virtual centering is NOT applied, because the intercept here is computed using
 * closed form after the coefficients are converged.
 * See this discussion for detail.
 * http://stats.stackexchange.com/questions/13617/how-is-the-intercept-computed-in-glmnet
 * <p>
 * param:  bcCoefficients The coefficients corresponding to the features.
 * param:  fitIntercept Whether to fit an intercept term. Note that virtual centering is NOT
 *                     applied, because the intercept here is computed using closed form after
 *                     the coefficients are converged.
 */
  class LeastSquaresBlockAggregator implements org.apache.spark.ml.optim.aggregator.DifferentiableLossAggregator<org.apache.spark.ml.feature.InstanceBlock, org.apache.spark.ml.optim.aggregator.LeastSquaresBlockAggregator>, org.apache.spark.internal.Logging {
  public   LeastSquaresBlockAggregator (org.apache.spark.broadcast.Broadcast<double[]> bcInverseStd, org.apache.spark.broadcast.Broadcast<double[]> bcScaledMean, boolean fitIntercept, double labelStd, double labelMean, org.apache.spark.broadcast.Broadcast<org.apache.spark.ml.linalg.Vector> bcCoefficients)  { throw new RuntimeException(); }
  /**
   * Add a new training instance block to this LeastSquaresBlockAggregator, and update the loss
   * and gradient of the objective function.
   * <p>
   * @param block The instance block of data point to be added.
   * @return This LeastSquaresBlockAggregator object.
   */
  public  org.apache.spark.ml.optim.aggregator.LeastSquaresBlockAggregator add (org.apache.spark.ml.feature.InstanceBlock block)  { throw new RuntimeException(); }
  protected  int dim ()  { throw new RuntimeException(); }
  protected  double[] gradientSumArray ()  { throw new RuntimeException(); }
  protected  double lossSum ()  { throw new RuntimeException(); }
  protected  double weightSum ()  { throw new RuntimeException(); }
}
