package org.apache.spark.ml.optim.aggregator;
/**
 * HuberBlockAggregator computes the gradient and loss used in Huber Regression
 * for blocks in sparse or dense matrix in an online fashion.
 * <p>
 * Two HuberBlockAggregator can be merged together to have a summary of loss and
 * gradient of the corresponding joint dataset.
 * <p>
 * NOTE: The feature values are expected to already have be scaled (multiplied by bcInverseStd,
 * but NOT centered) before computation.
 * <p>
 * param:  bcCoefficients The coefficients corresponding to the features.
 * param:  fitIntercept Whether to fit an intercept term. When true, will perform data centering
 *                     in a virtual way. Then we MUST adjust the intercept of both initial
 *                     coefficients and final solution in the caller.
 */
  class HuberBlockAggregator implements org.apache.spark.ml.optim.aggregator.DifferentiableLossAggregator<org.apache.spark.ml.feature.InstanceBlock, org.apache.spark.ml.optim.aggregator.HuberBlockAggregator>, org.apache.spark.internal.Logging {
  public   HuberBlockAggregator (org.apache.spark.broadcast.Broadcast<double[]> bcInverseStd, org.apache.spark.broadcast.Broadcast<double[]> bcScaledMean, boolean fitIntercept, double epsilon, org.apache.spark.broadcast.Broadcast<org.apache.spark.ml.linalg.Vector> bcCoefficients)  { throw new RuntimeException(); }
  /**
   * Add a new training instance block to this HuberBlockAggregator, and update the loss
   * and gradient of the objective function.
   * <p>
   * @param block The instance block of data point to be added.
   * @return This HuberBlockAggregator object.
   */
  public  org.apache.spark.ml.optim.aggregator.HuberBlockAggregator add (org.apache.spark.ml.feature.InstanceBlock block)  { throw new RuntimeException(); }
  protected  int dim ()  { throw new RuntimeException(); }
  protected  double[] gradientSumArray ()  { throw new RuntimeException(); }
  protected  double lossSum ()  { throw new RuntimeException(); }
  protected  double weightSum ()  { throw new RuntimeException(); }
}
