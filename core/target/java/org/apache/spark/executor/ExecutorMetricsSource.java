package org.apache.spark.executor;
/**
 * Expose executor metrics from {@link ExecutorMetricsType} using the Dropwizard metrics system.
 * <p>
 * Metrics related to the memory system can be expensive to gather, therefore
 * we implement some optimizations:
 * (1) Metrics values are cached, updated at each heartbeat (default period is 10 seconds).
 * An alternative faster polling mechanism is used, only if activated, by setting
 * spark.executor.metrics.pollingInterval=<interval in ms>.
 * (2) Procfs metrics are gathered all in one-go and only conditionally:
 * if the /proc filesystem exists
 * and spark.executor.processTreeMetrics.enabled=true.
 */
  class ExecutorMetricsSource implements org.apache.spark.metrics.source.Source {
  public   ExecutorMetricsSource ()  { throw new RuntimeException(); }
  public  com.codahale.metrics.MetricRegistry metricRegistry ()  { throw new RuntimeException(); }
  public  long[] metricsSnapshot ()  { throw new RuntimeException(); }
  public  void register (org.apache.spark.metrics.MetricsSystem metricsSystem)  { throw new RuntimeException(); }
  public  java.lang.String sourceName ()  { throw new RuntimeException(); }
  public  void updateMetricsSnapshot (long[] metricsUpdates)  { throw new RuntimeException(); }
}
