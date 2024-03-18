package org.apache.spark.scheduler;
  class LiveListenerBusMetrics implements org.apache.spark.metrics.source.Source, org.apache.spark.internal.Logging {
  public   LiveListenerBusMetrics (org.apache.spark.SparkConf conf)  { throw new RuntimeException(); }
  /**
   * Returns a timer tracking the processing time of the given listener class.
   * events processed by that listener. This method is thread-safe.
   * @param cls (undocumented)
   * @return (undocumented)
   */
  public  scala.Option<com.codahale.metrics.Timer> getTimerForListenerClass (java.lang.Class<? extends org.apache.spark.scheduler.SparkListenerInterface> cls)  { throw new RuntimeException(); }
  public  com.codahale.metrics.MetricRegistry metricRegistry ()  { throw new RuntimeException(); }
  /**
   * The total number of events posted to the LiveListenerBus. This is a count of the total number
   * of events which have been produced by the application and sent to the listener bus, NOT a
   * count of the number of events which have been processed and delivered to listeners (or dropped
   * without being delivered).
   * @return (undocumented)
   */
  public  com.codahale.metrics.Counter numEventsPosted ()  { throw new RuntimeException(); }
  public  java.lang.String sourceName ()  { throw new RuntimeException(); }
}
