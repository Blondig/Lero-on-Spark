package org.apache.spark.ml.evaluation;
/**
 * Metrics for clustering, which expects two input columns: prediction and label.
 */
public  class ClusteringMetrics {
     ClusteringMetrics (org.apache.spark.sql.Dataset<?> dataset)  { throw new RuntimeException(); }
  public  java.lang.String getDistanceMeasure ()  { throw new RuntimeException(); }
  public  org.apache.spark.ml.evaluation.ClusteringMetrics setDistanceMeasure (java.lang.String value)  { throw new RuntimeException(); }
  /**
   * Returns the silhouette score
   * @return (undocumented)
   */
  public  double silhouette ()  { throw new RuntimeException(); }
}
