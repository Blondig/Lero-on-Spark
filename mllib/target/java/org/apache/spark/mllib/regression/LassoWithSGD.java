package org.apache.spark.mllib.regression;
/**
 * Train a regression model with L1-regularization using Stochastic Gradient Descent.
 * This solves the l1-regularized least squares regression formulation
 *          f(weights) = 1/2n ||A weights-y||^2^  + regParam ||weights||_1
 * Here the data matrix has n rows, and the input RDD holds the set of rows of A, each with
 * its corresponding right hand side label y.
 * See also the documentation for the precise formulation.
 */
public  class LassoWithSGD extends org.apache.spark.mllib.regression.GeneralizedLinearAlgorithm<org.apache.spark.mllib.regression.LassoModel> implements scala.Serializable {
  // not preceding
     LassoWithSGD (double stepSize, int numIterations, double regParam, double miniBatchFraction)  { throw new RuntimeException(); }
  protected  org.apache.spark.mllib.regression.LassoModel createModel (org.apache.spark.mllib.linalg.Vector weights, double intercept)  { throw new RuntimeException(); }
  public  org.apache.spark.mllib.optimization.GradientDescent optimizer ()  { throw new RuntimeException(); }
}
