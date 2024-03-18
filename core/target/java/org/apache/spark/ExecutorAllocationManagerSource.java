package org.apache.spark;
/**
 * Metric source for ExecutorAllocationManager to expose its internal executor allocation
 * status to MetricsSystem.
 * Note: These metrics heavily rely on the internal implementation of
 * ExecutorAllocationManager, metrics or value of metrics will be changed when internal
 * implementation is changed, so these metrics are not stable across Spark version.
 */
  class ExecutorAllocationManagerSource implements org.apache.spark.metrics.source.Source {
  public   ExecutorAllocationManagerSource (org.apache.spark.ExecutorAllocationManager executorAllocationManager)  { throw new RuntimeException(); }
  public  com.codahale.metrics.Counter decommissionUnfinished ()  { throw new RuntimeException(); }
  public  com.codahale.metrics.Counter driverKilled ()  { throw new RuntimeException(); }
  public  com.codahale.metrics.Counter exitedUnexpectedly ()  { throw new RuntimeException(); }
  public  com.codahale.metrics.Counter gracefullyDecommissioned ()  { throw new RuntimeException(); }
  public  com.codahale.metrics.MetricRegistry metricRegistry ()  { throw new RuntimeException(); }
  public  java.lang.String sourceName ()  { throw new RuntimeException(); }
}
