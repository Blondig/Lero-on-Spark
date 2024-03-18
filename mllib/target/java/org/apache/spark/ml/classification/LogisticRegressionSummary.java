package org.apache.spark.ml.classification;
/**
 * Abstraction for logistic regression results for a given model.
 */
public  interface LogisticRegressionSummary extends org.apache.spark.ml.classification.ClassificationSummary {
  /**
   * Convenient method for casting to binary logistic regression summary.
   * This method will throw an Exception if the summary is not a binary summary.
   * @return (undocumented)
   */
  public  org.apache.spark.ml.classification.BinaryLogisticRegressionSummary asBinary ()  ;
  /** Field in "predictions" which gives the features of each instance as a vector. */
  public  java.lang.String featuresCol ()  ;
  /** Field in "predictions" which gives the probability of each class as a vector. */
  public  java.lang.String probabilityCol ()  ;
}
