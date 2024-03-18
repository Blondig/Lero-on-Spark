package org.apache.spark.mllib.regression;
/**
 * Train a linear regression model with no regularization using Stochastic Gradient Descent.
 * This solves the least squares regression formulation
 *              f(weights) = 1/n ||A weights-y||^2^
 * (which is the mean squared error).
 * Here the data matrix has n rows, and the input RDD holds the set of rows of A, each with
 * its corresponding right hand side label y.
 * See also the documentation for the precise formulation.
 */
public  class LinearRegressionWithSGD extends org.apache.spark.mllib.regression.GeneralizedLinearAlgorithm<org.apache.spark.mllib.regression.LinearRegressionModel> implements scala.Serializable {
  // not preceding
     LinearRegressionWithSGD (double stepSize, int numIterations, double regParam, double miniBatchFraction)  { throw new RuntimeException(); }
  protected  org.apache.spark.mllib.regression.LinearRegressionModel createModel (org.apache.spark.mllib.linalg.Vector weights, double intercept)  { throw new RuntimeException(); }
  public  org.apache.spark.mllib.optimization.GradientDescent optimizer ()  { throw new RuntimeException(); }
}
