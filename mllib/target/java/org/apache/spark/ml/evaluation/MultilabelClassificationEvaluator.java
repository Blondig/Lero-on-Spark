package org.apache.spark.ml.evaluation;
/**
 * :: Experimental ::
 * Evaluator for multi-label classification, which expects two input
 * columns: prediction and label.
 */
public  class MultilabelClassificationEvaluator extends org.apache.spark.ml.evaluation.Evaluator implements org.apache.spark.ml.param.shared.HasPredictionCol, org.apache.spark.ml.param.shared.HasLabelCol, org.apache.spark.ml.util.DefaultParamsWritable {
  static public  org.apache.spark.ml.evaluation.MultilabelClassificationEvaluator load (java.lang.String path)  { throw new RuntimeException(); }
  static public  org.apache.spark.ml.util.MLReader<T> read ()  { throw new RuntimeException(); }
  public final  org.apache.spark.ml.param.Param<java.lang.String> labelCol ()  { throw new RuntimeException(); }
  public final  org.apache.spark.ml.param.Param<java.lang.String> predictionCol ()  { throw new RuntimeException(); }
  public  java.lang.String uid ()  { throw new RuntimeException(); }
  // not preceding
  public   MultilabelClassificationEvaluator (java.lang.String uid)  { throw new RuntimeException(); }
  public   MultilabelClassificationEvaluator ()  { throw new RuntimeException(); }
  /**
   * param for metric name in evaluation (supports <code>"f1Measure"</code> (default), <code>"subsetAccuracy"</code>,
   * <code>"accuracy"</code>, <code>"hammingLoss"</code>, <code>"precision"</code>, <code>"recall"</code>, <code>"precisionByLabel"</code>,
   * <code>"recallByLabel"</code>, <code>"f1MeasureByLabel"</code>, <code>"microPrecision"</code>, <code>"microRecall"</code>,
   * <code>"microF1Measure"</code>)
   * @group param
   * @return (undocumented)
   */
  public final  org.apache.spark.ml.param.Param<java.lang.String> metricName ()  { throw new RuntimeException(); }
  /** @group getParam */
  public  java.lang.String getMetricName ()  { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.evaluation.MultilabelClassificationEvaluator setMetricName (java.lang.String value)  { throw new RuntimeException(); }
  /**
   * param for the class whose metric will be computed in <code>"precisionByLabel"</code>, <code>"recallByLabel"</code>,
   * <code>"f1MeasureByLabel"</code>.
   * @group param
   * @return (undocumented)
   */
  public final  org.apache.spark.ml.param.DoubleParam metricLabel ()  { throw new RuntimeException(); }
  /** @group getParam */
  public  double getMetricLabel ()  { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.evaluation.MultilabelClassificationEvaluator setMetricLabel (double value)  { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.evaluation.MultilabelClassificationEvaluator setPredictionCol (java.lang.String value)  { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.evaluation.MultilabelClassificationEvaluator setLabelCol (java.lang.String value)  { throw new RuntimeException(); }
  public  double evaluate (org.apache.spark.sql.Dataset<?> dataset)  { throw new RuntimeException(); }
  /**
   * Get a MultilabelMetrics, which can be used to get multilabel classification
   * metrics such as accuracy, precision, precisionByLabel, etc.
   * <p>
   * @param dataset a dataset that contains labels/observations and predictions.
   * @return MultilabelMetrics
   */
  public  org.apache.spark.mllib.evaluation.MultilabelMetrics getMetrics (org.apache.spark.sql.Dataset<?> dataset)  { throw new RuntimeException(); }
  public  boolean isLargerBetter ()  { throw new RuntimeException(); }
  public  org.apache.spark.ml.evaluation.MultilabelClassificationEvaluator copy (org.apache.spark.ml.param.ParamMap extra)  { throw new RuntimeException(); }
  public  java.lang.String toString ()  { throw new RuntimeException(); }
}
