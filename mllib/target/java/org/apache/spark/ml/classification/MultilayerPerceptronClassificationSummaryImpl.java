package org.apache.spark.ml.classification;
/**
 * MultilayerPerceptronClassification results for a given model.
 * <p>
 * param:  predictions dataframe output by the model's <code>transform</code> method.
 * param:  predictionCol field in "predictions" which gives the prediction for a data instance as a
 *                      double.
 * param:  labelCol field in "predictions" which gives the true label of each instance.
 * param:  weightCol field in "predictions" which gives the weight of each instance.
 */
public  class MultilayerPerceptronClassificationSummaryImpl implements org.apache.spark.ml.classification.MultilayerPerceptronClassificationSummary {
  // not preceding
  public   MultilayerPerceptronClassificationSummaryImpl (org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> predictions, java.lang.String predictionCol, java.lang.String labelCol, java.lang.String weightCol)  { throw new RuntimeException(); }
  public  java.lang.String labelCol ()  { throw new RuntimeException(); }
  public  java.lang.String predictionCol ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> predictions ()  { throw new RuntimeException(); }
  public  java.lang.String weightCol ()  { throw new RuntimeException(); }
}
