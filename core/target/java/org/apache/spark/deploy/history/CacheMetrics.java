package org.apache.spark.deploy.history;
/**
 * Metrics of the cache
 * param:  prefix prefix to register all entries under
 */
  class CacheMetrics implements org.apache.spark.metrics.source.Source {
  public   CacheMetrics (java.lang.String prefix)  { throw new RuntimeException(); }
  public  com.codahale.metrics.Counter evictionCount ()  { throw new RuntimeException(); }
  public  com.codahale.metrics.Counter loadCount ()  { throw new RuntimeException(); }
  public  com.codahale.metrics.Timer loadTimer ()  { throw new RuntimeException(); }
  public  com.codahale.metrics.Counter lookupCount ()  { throw new RuntimeException(); }
  public  com.codahale.metrics.Counter lookupFailureCount ()  { throw new RuntimeException(); }
  public  com.codahale.metrics.MetricRegistry metricRegistry ()  { throw new RuntimeException(); }
  /**
   * Name of metric source
   * @return (undocumented)
   */
  public  java.lang.String sourceName ()  { throw new RuntimeException(); }
  public  java.lang.String toString ()  { throw new RuntimeException(); }
}
