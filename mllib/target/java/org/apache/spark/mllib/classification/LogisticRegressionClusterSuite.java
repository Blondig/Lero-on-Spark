package org.apache.spark.mllib.classification;
/**
 * From Spark 2.0, MLlib LogisticRegressionWithLBFGS will call the LogisticRegression
 * implementation in ML to train model. We copies test cases from ML to guarantee
 * they produce the same result.
 */
public  class LogisticRegressionClusterSuite extends org.apache.spark.SparkFunSuite implements org.apache.spark.mllib.util.LocalClusterSparkContext {
  public   LogisticRegressionClusterSuite ()  { throw new RuntimeException(); }
  public  org.apache.spark.SparkContext sc ()  { throw new RuntimeException(); }
}
