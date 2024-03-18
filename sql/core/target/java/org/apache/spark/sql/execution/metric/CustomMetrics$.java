package org.apache.spark.sql.execution.metric;
public  class CustomMetrics$ {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final CustomMetrics$ MODULE$ = null;
  public   CustomMetrics$ ()  { throw new RuntimeException(); }
    java.lang.String V2_CUSTOM ()  { throw new RuntimeException(); }
    int NUM_ROWS_PER_UPDATE ()  { throw new RuntimeException(); }
    scala.collection.immutable.Set<java.lang.String> BUILTIN_OUTPUT_METRICS ()  { throw new RuntimeException(); }
  /**
   * Given a class name, builds and returns a metric type for a V2 custom metric class
   * <code>CustomMetric</code>.
   * @param customMetric (undocumented)
   * @return (undocumented)
   */
  public  java.lang.String buildV2CustomMetricTypeName (org.apache.spark.sql.connector.metric.CustomMetric customMetric)  { throw new RuntimeException(); }
  /**
   * Given a V2 custom metric type name, this method parses it and returns the corresponding
   * <code>CustomMetric</code> class name.
   * @param metricType (undocumented)
   * @return (undocumented)
   */
  public  scala.Option<java.lang.String> parseV2CustomMetricType (java.lang.String metricType)  { throw new RuntimeException(); }
  /**
   * Updates given custom metrics. If <code>currentMetricsValues</code> has metric which does not exist
   * in <code>customMetrics</code> map, it is non-op.
   * @param currentMetricsValues (undocumented)
   * @param customMetrics (undocumented)
   */
  public  void updateMetrics (scala.collection.Seq<org.apache.spark.sql.connector.metric.CustomTaskMetric> currentMetricsValues, scala.collection.immutable.Map<java.lang.String, org.apache.spark.sql.execution.metric.SQLMetric> customMetrics)  { throw new RuntimeException(); }
}
