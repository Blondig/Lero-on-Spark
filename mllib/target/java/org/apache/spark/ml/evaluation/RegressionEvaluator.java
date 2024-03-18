package org.apache.spark.ml.evaluation;
/**
 * Evaluator for regression, which expects input columns prediction, label and
 * an optional weight column.
 */
public final class RegressionEvaluator extends org.apache.spark.ml.evaluation.Evaluator implements org.apache.spark.ml.param.shared.HasPredictionCol, org.apache.spark.ml.param.shared.HasLabelCol, org.apache.spark.ml.param.shared.HasWeightCol, org.apache.spark.ml.util.DefaultParamsWritable {
  static public  org.apache.spark.ml.evaluation.RegressionEvaluator load (java.lang.String path)  { throw new RuntimeException(); }
  static public  org.apache.spark.ml.util.MLReader<T> read ()  { throw new RuntimeException(); }
  public final  org.apache.spark.ml.param.Param<java.lang.String> weightCol ()  { throw new RuntimeException(); }
  public final  org.apache.spark.ml.param.Param<java.lang.String> labelCol ()  { throw new RuntimeException(); }
  public final  org.apache.spark.ml.param.Param<java.lang.String> predictionCol ()  { throw new RuntimeException(); }
  public  java.lang.String uid ()  { throw new RuntimeException(); }
  // not preceding
  public   RegressionEvaluator (java.lang.String uid)  { throw new RuntimeException(); }
  public   RegressionEvaluator ()  { throw new RuntimeException(); }
  /**
   * Param for metric name in evaluation. Supports:
   *  - <code>"rmse"</code> (default): root mean squared error
   *  - <code>"mse"</code>: mean squared error
   *  - <code>"r2"</code>: R^2^ metric
   *  - <code>"mae"</code>: mean absolute error
   *  - <code>"var"</code>: explained variance
   * <p>
   * @group param
   * @return (undocumented)
   */
  public  org.apache.spark.ml.param.Param<java.lang.String> metricName ()  { throw new RuntimeException(); }
  /** @group getParam */
  public  java.lang.String getMetricName ()  { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.evaluation.RegressionEvaluator setMetricName (java.lang.String value)  { throw new RuntimeException(); }
  /**
   * param for whether the regression is through the origin.
   * Default: false.
   * @group expertParam
   * @return (undocumented)
   */
  public  org.apache.spark.ml.param.BooleanParam throughOrigin ()  { throw new RuntimeException(); }
  /** @group expertGetParam */
  public  boolean getThroughOrigin ()  { throw new RuntimeException(); }
  /** @group expertSetParam */
  public  org.apache.spark.ml.evaluation.RegressionEvaluator setThroughOrigin (boolean value)  { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.evaluation.RegressionEvaluator setPredictionCol (java.lang.String value)  { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.evaluation.RegressionEvaluator setLabelCol (java.lang.String value)  { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.evaluation.RegressionEvaluator setWeightCol (java.lang.String value)  { throw new RuntimeException(); }
  public  double evaluate (org.apache.spark.sql.Dataset<?> dataset)  { throw new RuntimeException(); }
  /**
   * Get a RegressionMetrics, which can be used to get regression
   * metrics such as rootMeanSquaredError, meanSquaredError, etc.
   * <p>
   * @param dataset a dataset that contains labels/observations and predictions.
   * @return RegressionMetrics
   */
  public  org.apache.spark.mllib.evaluation.RegressionMetrics getMetrics (org.apache.spark.sql.Dataset<?> dataset)  { throw new RuntimeException(); }
  public  boolean isLargerBetter ()  { throw new RuntimeException(); }
  public  org.apache.spark.ml.evaluation.RegressionEvaluator copy (org.apache.spark.ml.param.ParamMap extra)  { throw new RuntimeException(); }
  public  java.lang.String toString ()  { throw new RuntimeException(); }
}
