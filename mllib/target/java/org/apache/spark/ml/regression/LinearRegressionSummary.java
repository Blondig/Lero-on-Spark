package org.apache.spark.ml.regression;
/**
 * Linear regression results evaluated on a dataset.
 * <p>
 * param:  predictions predictions output by the model's <code>transform</code> method.
 * param:  predictionCol Field in "predictions" which gives the predicted value of the label at
 *                      each instance.
 * param:  labelCol Field in "predictions" which gives the true label of each instance.
 * param:  featuresCol Field in "predictions" which gives the features of each instance as a vector.
 */
public  class LinearRegressionSummary implements scala.Serializable {
  // not preceding
     LinearRegressionSummary (org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> predictions, java.lang.String predictionCol, java.lang.String labelCol, java.lang.String featuresCol, org.apache.spark.ml.regression.LinearRegressionModel privateModel, double[] diagInvAtWA)  { throw new RuntimeException(); }
  // not preceding
  public  double[] coefficientStandardErrors ()  { throw new RuntimeException(); }
  /** Degrees of freedom */
  public  long degreesOfFreedom ()  { throw new RuntimeException(); }
  // not preceding
  public  double[] devianceResiduals ()  { throw new RuntimeException(); }
  /**
   * Returns the explained variance regression score.
   * explainedVariance = 1 - variance(y - \hat{y}) / variance(y)
   * Reference: <a href="http://en.wikipedia.org/wiki/Explained_variation">
   * Wikipedia explain variation</a>
   * @return (undocumented)
   */
  public  double explainedVariance ()  { throw new RuntimeException(); }
  public  java.lang.String featuresCol ()  { throw new RuntimeException(); }
  public  java.lang.String labelCol ()  { throw new RuntimeException(); }
  /**
   * Returns the mean absolute error, which is a risk function corresponding to the
   * expected value of the absolute error loss or l1-norm loss.
   * @return (undocumented)
   */
  public  double meanAbsoluteError ()  { throw new RuntimeException(); }
  /**
   * Returns the mean squared error, which is a risk function corresponding to the
   * expected value of the squared error loss or quadratic loss.
   * @return (undocumented)
   */
  public  double meanSquaredError ()  { throw new RuntimeException(); }
  // not preceding
  public  long numInstances ()  { throw new RuntimeException(); }
  // not preceding
  public  double[] pValues ()  { throw new RuntimeException(); }
  public  java.lang.String predictionCol ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> predictions ()  { throw new RuntimeException(); }
  /**
   * Returns R^2^, the coefficient of determination.
   * Reference: <a href="http://en.wikipedia.org/wiki/Coefficient_of_determination">
   * Wikipedia coefficient of determination</a>
   * @return (undocumented)
   */
  public  double r2 ()  { throw new RuntimeException(); }
  /**
   * Returns Adjusted R^2^, the adjusted coefficient of determination.
   * Reference: <a href="https://en.wikipedia.org/wiki/Coefficient_of_determination#Adjusted_R2">
   * Wikipedia coefficient of determination</a>
   * @return (undocumented)
   */
  public  double r2adj ()  { throw new RuntimeException(); }
  // not preceding
  public  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> residuals ()  { throw new RuntimeException(); }
  /**
   * Returns the root mean squared error, which is defined as the square root of
   * the mean squared error.
   * @return (undocumented)
   */
  public  double rootMeanSquaredError ()  { throw new RuntimeException(); }
  // not preceding
  public  double[] tValues ()  { throw new RuntimeException(); }
}
