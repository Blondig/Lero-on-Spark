package org.apache.spark.ml.optim.aggregator;
/**
 * AFTBlockAggregator computes the gradient and loss as used in AFT survival regression
 * for blocks in sparse or dense matrix in an online fashion.
 * <p>
 * Two AFTBlockAggregator can be merged together to have a summary of loss and gradient of
 * the corresponding joint dataset.
 * <p>
 * NOTE: The feature values are expected to already have be scaled (multiplied by bcInverseStd,
 * but NOT centered) before computation.
 * <p>
 * param:  bcCoefficients The coefficients corresponding to the features, it includes three parts:
 *                       1, regression coefficients corresponding to the features;
 *                       2, the intercept;
 *                       3, the log of scale parameter.
 * param:  fitIntercept Whether to fit an intercept term. When true, will perform data centering
 *                     in a virtual way. Then we MUST adjust the intercept of both initial
 *                     coefficients and final solution in the caller.
 */
  class AFTBlockAggregator implements org.apache.spark.ml.optim.aggregator.DifferentiableLossAggregator<org.apache.spark.ml.feature.InstanceBlock, org.apache.spark.ml.optim.aggregator.AFTBlockAggregator> {
  public   AFTBlockAggregator (org.apache.spark.broadcast.Broadcast<double[]> bcScaledMean, boolean fitIntercept, org.apache.spark.broadcast.Broadcast<org.apache.spark.ml.linalg.Vector> bcCoefficients)  { throw new RuntimeException(); }
  /**
   * Add a new training instance block to this BlockAFTAggregator, and update the loss and
   * gradient of the objective function.
   * <p>
   * @return This BlockAFTAggregator object.
   * @param block (undocumented)
   */
  public  org.apache.spark.ml.optim.aggregator.AFTBlockAggregator add (org.apache.spark.ml.feature.InstanceBlock block)  { throw new RuntimeException(); }
  protected  int dim ()  { throw new RuntimeException(); }
  protected  double[] gradientSumArray ()  { throw new RuntimeException(); }
  protected  double lossSum ()  { throw new RuntimeException(); }
  protected  double weightSum ()  { throw new RuntimeException(); }
}
