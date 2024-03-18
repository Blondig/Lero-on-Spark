package org.apache.spark.mllib.classification;
/**
 * Train a classification model for Binary Logistic Regression
 * using Stochastic Gradient Descent. By default L2 regularization is used,
 * which can be changed via <code>LogisticRegressionWithSGD.optimizer</code>.
 * <p>
 * Using {@link LogisticRegressionWithLBFGS} is recommended over this.
 * <p>
 * @note Labels used in Logistic Regression should be {0, 1, ..., k - 1}
 * for k classes multi-label classification problem.
 */
public  class LogisticRegressionWithSGD extends org.apache.spark.mllib.regression.GeneralizedLinearAlgorithm<org.apache.spark.mllib.classification.LogisticRegressionModel> implements scala.Serializable {
  // not preceding
     LogisticRegressionWithSGD (double stepSize, int numIterations, double regParam, double miniBatchFraction)  { throw new RuntimeException(); }
  protected  org.apache.spark.mllib.classification.LogisticRegressionModel createModel (org.apache.spark.mllib.linalg.Vector weights, double intercept)  { throw new RuntimeException(); }
  public  org.apache.spark.mllib.optimization.GradientDescent optimizer ()  { throw new RuntimeException(); }
  protected  scala.collection.immutable.List<scala.Function1<org.apache.spark.rdd.RDD<org.apache.spark.mllib.regression.LabeledPoint>, java.lang.Object>> validators ()  { throw new RuntimeException(); }
}
