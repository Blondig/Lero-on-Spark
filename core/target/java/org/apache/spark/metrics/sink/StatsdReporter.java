package org.apache.spark.metrics.sink;
  class StatsdReporter extends com.codahale.metrics.ScheduledReporter implements org.apache.spark.internal.Logging {
  public   StatsdReporter (com.codahale.metrics.MetricRegistry registry, java.lang.String host, int port, java.lang.String prefix, com.codahale.metrics.MetricFilter filter, java.util.concurrent.TimeUnit rateUnit, java.util.concurrent.TimeUnit durationUnit)  { throw new RuntimeException(); }
  public  void report (java.util.SortedMap<java.lang.String, com.codahale.metrics.Gauge<?>> gauges, java.util.SortedMap<java.lang.String, com.codahale.metrics.Counter> counters, java.util.SortedMap<java.lang.String, com.codahale.metrics.Histogram> histograms, java.util.SortedMap<java.lang.String, com.codahale.metrics.Meter> meters, java.util.SortedMap<java.lang.String, com.codahale.metrics.Timer> timers)  { throw new RuntimeException(); }
}
