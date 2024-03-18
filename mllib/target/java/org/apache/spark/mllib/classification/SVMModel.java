package org.apache.spark.mllib.classification;
/**
 * Model for Support Vector Machines (SVMs).
 * <p>
 * param:  weights Weights computed for every feature.
 * param:  intercept Intercept computed for this model.
 */
public  class SVMModel extends org.apache.spark.mllib.regression.GeneralizedLinearModel implements org.apache.spark.mllib.classification.ClassificationModel, scala.Serializable, org.apache.spark.mllib.util.Saveable, org.apache.spark.mllib.pmml.PMMLExportable {
  static public  org.apache.spark.mllib.classification.SVMModel load (org.apache.spark.SparkContext sc, java.lang.String path)  { throw new RuntimeException(); }
  public  org.apache.spark.mllib.linalg.Vector weights ()  { throw new RuntimeException(); }
  public  double intercept ()  { throw new RuntimeException(); }
  // not preceding
  public   SVMModel (org.apache.spark.mllib.linalg.Vector weights, double intercept)  { throw new RuntimeException(); }
  /**
   * Sets the threshold that separates positive predictions from negative predictions. An example
   * with prediction score greater than or equal to this threshold is identified as a positive,
   * and negative otherwise. The default value is 0.0.
   * @param threshold (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.mllib.classification.SVMModel setThreshold (double threshold)  { throw new RuntimeException(); }
  /**
   * Returns the threshold (if any) used for converting raw prediction scores into 0/1 predictions.
   * @return (undocumented)
   */
  public  scala.Option<java.lang.Object> getThreshold ()  { throw new RuntimeException(); }
  /**
   * Clears the threshold so that <code>predict</code> will output raw prediction scores.
   * @return (undocumented)
   */
  public  org.apache.spark.mllib.classification.SVMModel clearThreshold ()  { throw new RuntimeException(); }
  protected  double predictPoint (org.apache.spark.mllib.linalg.Vector dataMatrix, org.apache.spark.mllib.linalg.Vector weightMatrix, double intercept)  { throw new RuntimeException(); }
  public  void save (org.apache.spark.SparkContext sc, java.lang.String path)  { throw new RuntimeException(); }
  public  java.lang.String toString ()  { throw new RuntimeException(); }
}
