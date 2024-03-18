package org.apache.spark.sql.execution.streaming;
/**
 * Custom stateful operator metric definition to allow operators to expose their own custom metrics.
 * Also provides {@link SQLMetric} instance to show the metric in UI and accumulate it at the query
 * level.
 */
public  interface StatefulOperatorCustomMetric {
  public  org.apache.spark.sql.execution.metric.SQLMetric createSQLMetric (org.apache.spark.SparkContext sparkContext)  ;
  public  java.lang.String desc ()  ;
  public  java.lang.String name ()  ;
}
