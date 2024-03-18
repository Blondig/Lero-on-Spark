package org.apache.spark.ml.regression;
/**
 * Model produced by {@link LinearRegression}.
 */
public  class LinearRegressionModel extends org.apache.spark.ml.regression.RegressionModel<org.apache.spark.ml.linalg.Vector, org.apache.spark.ml.regression.LinearRegressionModel> implements org.apache.spark.ml.regression.LinearRegressionParams, org.apache.spark.ml.util.GeneralMLWritable, org.apache.spark.ml.util.HasTrainingSummary<org.apache.spark.ml.regression.LinearRegressionTrainingSummary> {
  static public  org.apache.spark.ml.util.MLReader<org.apache.spark.ml.regression.LinearRegressionModel> read ()  { throw new RuntimeException(); }
  static public  org.apache.spark.ml.regression.LinearRegressionModel load (java.lang.String path)  { throw new RuntimeException(); }
   final  scala.Option<org.apache.spark.ml.regression.LinearRegressionTrainingSummary> trainingSummary ()  { throw new RuntimeException(); }
  public final  org.apache.spark.ml.param.Param<java.lang.String> solver ()  { throw new RuntimeException(); }
  public final  org.apache.spark.ml.param.Param<java.lang.String> loss ()  { throw new RuntimeException(); }
  public final  org.apache.spark.ml.param.DoubleParam epsilon ()  { throw new RuntimeException(); }
  public final  org.apache.spark.ml.param.DoubleParam maxBlockSizeInMB ()  { throw new RuntimeException(); }
  public final  org.apache.spark.ml.param.IntParam aggregationDepth ()  { throw new RuntimeException(); }
  public final  org.apache.spark.ml.param.Param<java.lang.String> weightCol ()  { throw new RuntimeException(); }
  public final  org.apache.spark.ml.param.BooleanParam standardization ()  { throw new RuntimeException(); }
  public final  org.apache.spark.ml.param.BooleanParam fitIntercept ()  { throw new RuntimeException(); }
  public final  org.apache.spark.ml.param.DoubleParam tol ()  { throw new RuntimeException(); }
  public final  org.apache.spark.ml.param.IntParam maxIter ()  { throw new RuntimeException(); }
  public final  org.apache.spark.ml.param.DoubleParam elasticNetParam ()  { throw new RuntimeException(); }
  public final  org.apache.spark.ml.param.DoubleParam regParam ()  { throw new RuntimeException(); }
  public  java.lang.String uid ()  { throw new RuntimeException(); }
  public  org.apache.spark.ml.linalg.Vector coefficients ()  { throw new RuntimeException(); }
  public  double intercept ()  { throw new RuntimeException(); }
  public  double scale ()  { throw new RuntimeException(); }
  // not preceding
     LinearRegressionModel (java.lang.String uid, org.apache.spark.ml.linalg.Vector coefficients, double intercept, double scale)  { throw new RuntimeException(); }
     LinearRegressionModel (java.lang.String uid, org.apache.spark.ml.linalg.Vector coefficients, double intercept)  { throw new RuntimeException(); }
  public  int numFeatures ()  { throw new RuntimeException(); }
  /**
   * Gets summary (e.g. residuals, mse, r-squared ) of model on training set. An exception is
   * thrown if <code>hasSummary</code> is false.
   * @return (undocumented)
   */
  public  org.apache.spark.ml.regression.LinearRegressionTrainingSummary summary ()  { throw new RuntimeException(); }
  /**
   * Evaluates the model on a test dataset.
   * <p>
   * @param dataset Test dataset to evaluate model on.
   * @return (undocumented)
   */
  public  org.apache.spark.ml.regression.LinearRegressionSummary evaluate (org.apache.spark.sql.Dataset<?> dataset)  { throw new RuntimeException(); }
  /**
   * If the prediction column is set returns the current model and prediction column,
   * otherwise generates a new column and sets it as the prediction column on a new copy
   * of the current model.
   * @return (undocumented)
   */
    scala.Tuple2<org.apache.spark.ml.regression.LinearRegressionModel, java.lang.String> findSummaryModelAndPredictionCol ()  { throw new RuntimeException(); }
  public  double predict (org.apache.spark.ml.linalg.Vector features)  { throw new RuntimeException(); }
  public  org.apache.spark.ml.regression.LinearRegressionModel copy (org.apache.spark.ml.param.ParamMap extra)  { throw new RuntimeException(); }
  /**
   * Returns a {@link org.apache.spark.ml.util.GeneralMLWriter} instance for this ML instance.
   * <p>
   * For {@link LinearRegressionModel}, this does NOT currently save the training {@link summary}.
   * An option to save {@link summary} may be added in the future.
   * <p>
   * This also does not save the {@link parent} currently.
   * @return (undocumented)
   */
  public  org.apache.spark.ml.util.GeneralMLWriter write ()  { throw new RuntimeException(); }
  public  java.lang.String toString ()  { throw new RuntimeException(); }
}
