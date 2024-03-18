package org.apache.spark.ml.optim.loss;
/**
 * A Breeze diff function which represents a cost function for differentiable regularization
 * of parameters. e.g. L2 regularization: 1 / 2 regParam * beta dot beta
 * <p>
 * @param <T>  The type of the coefficients being regularized.
 */
public  interface DifferentiableRegularization<T extends java.lang.Object> extends breeze.optimize.DiffFunction<T> {
  /** Magnitude of the regularization penalty. */
  public  double regParam ()  ;
}
