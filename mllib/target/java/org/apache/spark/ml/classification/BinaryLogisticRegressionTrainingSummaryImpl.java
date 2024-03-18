package org.apache.spark.ml.classification;
/**
 * Binary logistic regression training results.
 * <p>
 * param:  predictions dataframe output by the model's <code>transform</code> method.
 * param:  probabilityCol field in "predictions" which gives the probability of
 *                       each class as a vector.
 * param:  predictionCol field in "predictions" which gives the prediction for a data instance as a
 *                      double.
 * param:  labelCol field in "predictions" which gives the true label of each instance.
 * param:  featuresCol field in "predictions" which gives the features of each instance as a vector.
 * param:  weightCol field in "predictions" which gives the weight of each instance.
 * param:  objectiveHistory objective function (scaled loss + regularization) at each iteration.
 */
public  class BinaryLogisticRegressionTrainingSummaryImpl extends org.apache.spark.ml.classification.BinaryLogisticRegressionSummaryImpl implements org.apache.spark.ml.classification.BinaryLogisticRegressionTrainingSummary {
  // not preceding
  public   BinaryLogisticRegressionTrainingSummaryImpl (org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> predictions, java.lang.String probabilityCol, java.lang.String predictionCol, java.lang.String labelCol, java.lang.String featuresCol, java.lang.String weightCol, double[] objectiveHistory)  { throw new RuntimeException(); }
  public  double[] objectiveHistory ()  { throw new RuntimeException(); }
}
