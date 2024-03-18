package org.apache.spark.ml.classification;
/**
 * Binary RandomForestClassification for a given model.
 * <p>
 * param:  predictions dataframe output by the model's <code>transform</code> method.
 * param:  scoreCol field in "predictions" which gives the prediction of
 *                 each class as a vector.
 * param:  labelCol field in "predictions" which gives the true label of each instance.
 * param:  weightCol field in "predictions" which gives the weight of each instance.
 */
public  class BinaryRandomForestClassificationSummaryImpl extends org.apache.spark.ml.classification.RandomForestClassificationSummaryImpl implements org.apache.spark.ml.classification.BinaryRandomForestClassificationSummary {
  // not preceding
  public   BinaryRandomForestClassificationSummaryImpl (org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> predictions, java.lang.String scoreCol, java.lang.String predictionCol, java.lang.String labelCol, java.lang.String weightCol)  { throw new RuntimeException(); }
  public  double areaUnderROC ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> fMeasureByThreshold ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> pr ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> precisionByThreshold ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> recallByThreshold ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> roc ()  { throw new RuntimeException(); }
  public  java.lang.String scoreCol ()  { throw new RuntimeException(); }
}
