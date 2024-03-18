package org.apache.spark.ml.classification;
/**
 * Abstraction for binary classification results for a given model.
 */
public  interface BinaryClassificationSummary extends org.apache.spark.ml.classification.ClassificationSummary {
  /**
   * Computes the area under the receiver operating characteristic (ROC) curve.
   * @return (undocumented)
   */
  public  double areaUnderROC ()  ;
  /**
   * Returns a dataframe with two fields (threshold, F-Measure) curve with beta = 1.0.
   * @return (undocumented)
   */
  public  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> fMeasureByThreshold ()  ;
  /**
   * Returns the precision-recall curve, which is a Dataframe containing
   * two fields recall, precision with (0.0, 1.0) prepended to it.
   * @return (undocumented)
   */
  public  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> pr ()  ;
  /**
   * Returns a dataframe with two fields (threshold, precision) curve.
   * Every possible probability obtained in transforming the dataset are used
   * as thresholds used in calculating the precision.
   * @return (undocumented)
   */
  public  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> precisionByThreshold ()  ;
  /**
   * Returns a dataframe with two fields (threshold, recall) curve.
   * Every possible probability obtained in transforming the dataset are used
   * as thresholds used in calculating the recall.
   * @return (undocumented)
   */
  public  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> recallByThreshold ()  ;
  /**
   * Returns the receiver operating characteristic (ROC) curve,
   * which is a Dataframe having two fields (FPR, TPR)
   * with (0.0, 0.0) prepended and (1.0, 1.0) appended to it.
   * See http://en.wikipedia.org/wiki/Receiver_operating_characteristic
   * @return (undocumented)
   */
  public  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> roc ()  ;
  /**
   *  Field in "predictions" which gives the probability or rawPrediction of each class as a
   *  vector.
   * @return (undocumented)
   */
  public  java.lang.String scoreCol ()  ;
}
