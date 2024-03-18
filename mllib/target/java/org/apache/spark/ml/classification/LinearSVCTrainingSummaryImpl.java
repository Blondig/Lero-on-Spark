package org.apache.spark.ml.classification;
/**
 * LinearSVC training results.
 * <p>
 * param:  predictions dataframe output by the model's <code>transform</code> method.
 * param:  scoreCol field in "predictions" which gives the rawPrediction of each instance.
 * param:  predictionCol field in "predictions" which gives the prediction for a data instance as a
 *                      double.
 * param:  labelCol field in "predictions" which gives the true label of each instance.
 * param:  weightCol field in "predictions" which gives the weight of each instance.
 * param:  objectiveHistory objective function (scaled loss + regularization) at each iteration.
 */
public  class LinearSVCTrainingSummaryImpl extends org.apache.spark.ml.classification.LinearSVCSummaryImpl implements org.apache.spark.ml.classification.LinearSVCTrainingSummary {
  // not preceding
  public   LinearSVCTrainingSummaryImpl (org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> predictions, java.lang.String scoreCol, java.lang.String predictionCol, java.lang.String labelCol, java.lang.String weightCol, double[] objectiveHistory)  { throw new RuntimeException(); }
  public  double[] objectiveHistory ()  { throw new RuntimeException(); }
}
