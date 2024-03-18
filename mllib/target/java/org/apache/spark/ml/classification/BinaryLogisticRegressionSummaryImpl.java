package org.apache.spark.ml.classification;
/**
 * Binary logistic regression results for a given model.
 * <p>
 * param:  predictions dataframe output by the model's <code>transform</code> method.
 * param:  probabilityCol field in "predictions" which gives the probability of
 *                       each class as a vector.
 * param:  predictionCol field in "predictions" which gives the prediction of
 *                      each class as a double.
 * param:  labelCol field in "predictions" which gives the true label of each instance.
 * param:  featuresCol field in "predictions" which gives the features of each instance as a vector.
 * param:  weightCol field in "predictions" which gives the weight of each instance.
 */
public  class BinaryLogisticRegressionSummaryImpl extends org.apache.spark.ml.classification.LogisticRegressionSummaryImpl implements org.apache.spark.ml.classification.BinaryLogisticRegressionSummary {
  public   BinaryLogisticRegressionSummaryImpl (org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> predictions, java.lang.String probabilityCol, java.lang.String predictionCol, java.lang.String labelCol, java.lang.String featuresCol, java.lang.String weightCol)  { throw new RuntimeException(); }
  public  double areaUnderROC ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> fMeasureByThreshold ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> pr ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> precisionByThreshold ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> recallByThreshold ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> roc ()  { throw new RuntimeException(); }
}
