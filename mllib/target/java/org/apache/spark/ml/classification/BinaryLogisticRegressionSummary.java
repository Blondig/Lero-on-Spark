package org.apache.spark.ml.classification;
/**
 * Abstraction for binary logistic regression results for a given model.
 */
public  interface BinaryLogisticRegressionSummary extends org.apache.spark.ml.classification.LogisticRegressionSummary, org.apache.spark.ml.classification.BinaryClassificationSummary {
  public  java.lang.String scoreCol ()  ;
}
