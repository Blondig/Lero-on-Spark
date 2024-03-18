package org.apache.spark.ml.optim.loss;
/**
 * A Breeze diff function for computing the L2 regularized loss and gradient of a vector of
 * coefficients.
 * <p>
 * param:  regParam The magnitude of the regularization.
 * param:  shouldApply A function (Int =&gt; Boolean) indicating whether a given index should have
 *                    regularization applied to it. Usually we don't apply regularization to
 *                    the intercept.
 * param:  applyFeaturesStd Option for a function which maps coefficient index (column major) to the
 *                         feature standard deviation. Since we always standardize the data during
 *                         training, if <code>standardization</code> is false, we have to reverse
 *                         standardization by penalizing each component differently by this param.
 *                         If <code>standardization</code> is true, this should be <code>None</code>.
 */
  class L2Regularization implements org.apache.spark.ml.optim.loss.DifferentiableRegularization<org.apache.spark.ml.linalg.Vector> {
  // not preceding
  public   L2Regularization (double regParam, scala.Function1<java.lang.Object, java.lang.Object> shouldApply, scala.Option<scala.Function1<java.lang.Object, java.lang.Object>> applyFeaturesStd)  { throw new RuntimeException(); }
  public  scala.Tuple2<java.lang.Object, org.apache.spark.ml.linalg.Vector> calculate (org.apache.spark.ml.linalg.Vector coefficients)  { throw new RuntimeException(); }
  public  double regParam ()  { throw new RuntimeException(); }
}
