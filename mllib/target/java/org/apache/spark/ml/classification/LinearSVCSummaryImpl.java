package org.apache.spark.ml.classification;
/**
 * LinearSVC results for a given model.
 * <p>
 * param:  predictions dataframe output by the model's <code>transform</code> method.
 * param:  scoreCol field in "predictions" which gives the rawPrediction of each instance.
 * param:  predictionCol field in "predictions" which gives the prediction for a data instance as a
 *                      double.
 * param:  labelCol field in "predictions" which gives the true label of each instance.
 * param:  weightCol field in "predictions" which gives the weight of each instance.
 */
public  class LinearSVCSummaryImpl implements org.apache.spark.ml.classification.LinearSVCSummary {
  // not preceding
  public   LinearSVCSummaryImpl (org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> predictions, java.lang.String scoreCol, java.lang.String predictionCol, java.lang.String labelCol, java.lang.String weightCol)  { throw new RuntimeException(); }
  public  double areaUnderROC ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> fMeasureByThreshold ()  { throw new RuntimeException(); }
  public  java.lang.String labelCol ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> pr ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> precisionByThreshold ()  { throw new RuntimeException(); }
  public  java.lang.String predictionCol ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> predictions ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> recallByThreshold ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> roc ()  { throw new RuntimeException(); }
  public  java.lang.String scoreCol ()  { throw new RuntimeException(); }
  public  java.lang.String weightCol ()  { throw new RuntimeException(); }
}
