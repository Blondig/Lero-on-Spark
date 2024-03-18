package org.apache.spark.ml.evaluation;
/**
 * Evaluator for clustering results.
 * The metric computes the Silhouette measure using the specified distance measure.
 * <p>
 * The Silhouette is a measure for the validation of the consistency within clusters. It ranges
 * between 1 and -1, where a value close to 1 means that the points in a cluster are close to the
 * other points in the same cluster and far from the points of the other clusters.
 */
public  class ClusteringEvaluator extends org.apache.spark.ml.evaluation.Evaluator implements org.apache.spark.ml.param.shared.HasPredictionCol, org.apache.spark.ml.param.shared.HasFeaturesCol, org.apache.spark.ml.param.shared.HasWeightCol, org.apache.spark.ml.util.DefaultParamsWritable {
  static public  org.apache.spark.ml.evaluation.ClusteringEvaluator load (java.lang.String path)  { throw new RuntimeException(); }
  static public  org.apache.spark.ml.util.MLReader<T> read ()  { throw new RuntimeException(); }
  public final  org.apache.spark.ml.param.Param<java.lang.String> weightCol ()  { throw new RuntimeException(); }
  public final  org.apache.spark.ml.param.Param<java.lang.String> featuresCol ()  { throw new RuntimeException(); }
  public final  org.apache.spark.ml.param.Param<java.lang.String> predictionCol ()  { throw new RuntimeException(); }
  public  java.lang.String uid ()  { throw new RuntimeException(); }
  // not preceding
  public   ClusteringEvaluator (java.lang.String uid)  { throw new RuntimeException(); }
  public   ClusteringEvaluator ()  { throw new RuntimeException(); }
  public  org.apache.spark.ml.evaluation.ClusteringEvaluator copy (org.apache.spark.ml.param.ParamMap pMap)  { throw new RuntimeException(); }
  public  boolean isLargerBetter ()  { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.evaluation.ClusteringEvaluator setPredictionCol (java.lang.String value)  { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.evaluation.ClusteringEvaluator setFeaturesCol (java.lang.String value)  { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.evaluation.ClusteringEvaluator setWeightCol (java.lang.String value)  { throw new RuntimeException(); }
  /**
   * param for metric name in evaluation
   * (supports <code>"silhouette"</code> (default))
   * @group param
   * @return (undocumented)
   */
  public  org.apache.spark.ml.param.Param<java.lang.String> metricName ()  { throw new RuntimeException(); }
  /** @group getParam */
  public  java.lang.String getMetricName ()  { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.evaluation.ClusteringEvaluator setMetricName (java.lang.String value)  { throw new RuntimeException(); }
  /**
   * param for distance measure to be used in evaluation
   * (supports <code>"squaredEuclidean"</code> (default), <code>"cosine"</code>)
   * @group param
   * @return (undocumented)
   */
  public  org.apache.spark.ml.param.Param<java.lang.String> distanceMeasure ()  { throw new RuntimeException(); }
  /** @group getParam */
  public  java.lang.String getDistanceMeasure ()  { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.evaluation.ClusteringEvaluator setDistanceMeasure (java.lang.String value)  { throw new RuntimeException(); }
  public  double evaluate (org.apache.spark.sql.Dataset<?> dataset)  { throw new RuntimeException(); }
  /**
   * Get a ClusteringMetrics, which can be used to get clustering metrics such as
   * silhouette score.
   * <p>
   * @param dataset a dataset that contains labels/observations and predictions.
   * @return ClusteringMetrics
   */
  public  org.apache.spark.ml.evaluation.ClusteringMetrics getMetrics (org.apache.spark.sql.Dataset<?> dataset)  { throw new RuntimeException(); }
  public  java.lang.String toString ()  { throw new RuntimeException(); }
}
