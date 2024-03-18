package org.apache.spark.sql.execution.streaming.state;
/**
 * Name and description of custom implementation-specific metrics that a
 * state store may wish to expose. Also provides {@link SQLMetric} instance to
 * show the metric in UI and accumulate it at the query level.
 */
public  interface StateStoreCustomMetric {
  public  org.apache.spark.sql.execution.metric.SQLMetric createSQLMetric (org.apache.spark.SparkContext sparkContext)  ;
  public  java.lang.String desc ()  ;
  public  java.lang.String name ()  ;
  public  org.apache.spark.sql.execution.streaming.state.StateStoreCustomMetric withNewDesc (java.lang.String desc)  ;
}
