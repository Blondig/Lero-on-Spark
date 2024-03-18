package org.apache.spark.mllib.regression;
/**
 * Regression model trained using LinearRegression.
 * <p>
 * param:  weights Weights computed for every feature.
 * param:  intercept Intercept computed for this model.
 * <p>
 */
public  class LinearRegressionModel extends org.apache.spark.mllib.regression.GeneralizedLinearModel implements org.apache.spark.mllib.regression.RegressionModel, scala.Serializable, org.apache.spark.mllib.util.Saveable, org.apache.spark.mllib.pmml.PMMLExportable {
  static public  org.apache.spark.mllib.regression.LinearRegressionModel load (org.apache.spark.SparkContext sc, java.lang.String path)  { throw new RuntimeException(); }
  public  org.apache.spark.mllib.linalg.Vector weights ()  { throw new RuntimeException(); }
  public  double intercept ()  { throw new RuntimeException(); }
  // not preceding
  public   LinearRegressionModel (org.apache.spark.mllib.linalg.Vector weights, double intercept)  { throw new RuntimeException(); }
  protected  double predictPoint (org.apache.spark.mllib.linalg.Vector dataMatrix, org.apache.spark.mllib.linalg.Vector weightMatrix, double intercept)  { throw new RuntimeException(); }
  public  void save (org.apache.spark.SparkContext sc, java.lang.String path)  { throw new RuntimeException(); }
}
