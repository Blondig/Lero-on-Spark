package org.apache.spark.ml.evaluation;
/**
 * :: Experimental ::
 * Evaluator for ranking, which expects two input columns: prediction and label.
 */
public  class RankingEvaluator extends org.apache.spark.ml.evaluation.Evaluator implements org.apache.spark.ml.param.shared.HasPredictionCol, org.apache.spark.ml.param.shared.HasLabelCol, org.apache.spark.ml.util.DefaultParamsWritable {
  static public  org.apache.spark.ml.evaluation.RankingEvaluator load (java.lang.String path)  { throw new RuntimeException(); }
  static public  org.apache.spark.ml.util.MLReader<T> read ()  { throw new RuntimeException(); }
  public final  org.apache.spark.ml.param.Param<java.lang.String> labelCol ()  { throw new RuntimeException(); }
  public final  org.apache.spark.ml.param.Param<java.lang.String> predictionCol ()  { throw new RuntimeException(); }
  public  java.lang.String uid ()  { throw new RuntimeException(); }
  // not preceding
  public   RankingEvaluator (java.lang.String uid)  { throw new RuntimeException(); }
  public   RankingEvaluator ()  { throw new RuntimeException(); }
  /**
   * param for metric name in evaluation (supports <code>"meanAveragePrecision"</code> (default),
   * <code>"meanAveragePrecisionAtK"</code>, <code>"precisionAtK"</code>, <code>"ndcgAtK"</code>, <code>"recallAtK"</code>)
   * @group param
   * @return (undocumented)
   */
  public final  org.apache.spark.ml.param.Param<java.lang.String> metricName ()  { throw new RuntimeException(); }
  /** @group getParam */
  public  java.lang.String getMetricName ()  { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.evaluation.RankingEvaluator setMetricName (java.lang.String value)  { throw new RuntimeException(); }
  /**
   * param for ranking position value used in <code>"meanAveragePrecisionAtK"</code>, <code>"precisionAtK"</code>,
   * <code>"ndcgAtK"</code>, <code>"recallAtK"</code>. Must be &amp;gt; 0. The default value is 10.
   * @group param
   * @return (undocumented)
   */
  public final  org.apache.spark.ml.param.IntParam k ()  { throw new RuntimeException(); }
  /** @group getParam */
  public  int getK ()  { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.evaluation.RankingEvaluator setK (int value)  { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.evaluation.RankingEvaluator setPredictionCol (java.lang.String value)  { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.evaluation.RankingEvaluator setLabelCol (java.lang.String value)  { throw new RuntimeException(); }
  public  double evaluate (org.apache.spark.sql.Dataset<?> dataset)  { throw new RuntimeException(); }
  /**
   * Get a RankingMetrics, which can be used to get ranking metrics
   * such as meanAveragePrecision, meanAveragePrecisionAtK, etc.
   * <p>
   * @param dataset a dataset that contains labels/observations and predictions.
   * @return RankingMetrics
   */
  public  org.apache.spark.mllib.evaluation.RankingMetrics<java.lang.Object> getMetrics (org.apache.spark.sql.Dataset<?> dataset)  { throw new RuntimeException(); }
  public  boolean isLargerBetter ()  { throw new RuntimeException(); }
  public  org.apache.spark.ml.evaluation.RankingEvaluator copy (org.apache.spark.ml.param.ParamMap extra)  { throw new RuntimeException(); }
  public  java.lang.String toString ()  { throw new RuntimeException(); }
}
