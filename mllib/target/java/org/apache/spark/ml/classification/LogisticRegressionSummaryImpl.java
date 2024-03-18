package org.apache.spark.ml.classification;
/**
 * Multiclass logistic regression results for a given model.
 * <p>
 * param:  predictions dataframe output by the model's <code>transform</code> method.
 * param:  probabilityCol field in "predictions" which gives the probability of
 *                 each class as a vector.
 * param:  predictionCol field in "predictions" which gives the prediction for a data instance as a
 *                      double.
 * param:  labelCol field in "predictions" which gives the true label of each instance.
 * param:  featuresCol field in "predictions" which gives the features of each instance as a vector.
 * param:  weightCol field in "predictions" which gives the weight of each instance.
 */
public  class LogisticRegressionSummaryImpl implements org.apache.spark.ml.classification.LogisticRegressionSummary {
  // not preceding
  public   LogisticRegressionSummaryImpl (org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> predictions, java.lang.String probabilityCol, java.lang.String predictionCol, java.lang.String labelCol, java.lang.String featuresCol, java.lang.String weightCol)  { throw new RuntimeException(); }
  public  java.lang.String featuresCol ()  { throw new RuntimeException(); }
  public  java.lang.String labelCol ()  { throw new RuntimeException(); }
  public  java.lang.String predictionCol ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> predictions ()  { throw new RuntimeException(); }
  public  java.lang.String probabilityCol ()  { throw new RuntimeException(); }
  public  java.lang.String weightCol ()  { throw new RuntimeException(); }
}
