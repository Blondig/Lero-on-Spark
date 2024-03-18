package org.apache.spark.sql.execution.datasources.noop;
public  class NoopWrite {
  static public  org.apache.spark.sql.connector.write.BatchWrite toBatch ()  { throw new RuntimeException(); }
  static public  org.apache.spark.sql.connector.write.streaming.StreamingWrite toStreaming ()  { throw new RuntimeException(); }
  static public  java.lang.String description ()  { throw new RuntimeException(); }
  static public  org.apache.spark.sql.connector.metric.CustomMetric[] supportedCustomMetrics ()  { throw new RuntimeException(); }
}
