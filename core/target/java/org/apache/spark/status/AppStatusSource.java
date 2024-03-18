package org.apache.spark.status;
  class AppStatusSource implements org.apache.spark.metrics.source.Source {
  static public  com.codahale.metrics.Counter getCounter (java.lang.String prefix, java.lang.String name, com.codahale.metrics.MetricRegistry metricRegistry)  { throw new RuntimeException(); }
  static public  scala.Option<org.apache.spark.status.AppStatusSource> createSource (org.apache.spark.SparkConf conf)  { throw new RuntimeException(); }
  public   AppStatusSource ()  { throw new RuntimeException(); }
  public  com.codahale.metrics.MetricRegistry metricRegistry ()  { throw new RuntimeException(); }
  public  java.lang.String sourceName ()  { throw new RuntimeException(); }
  public  org.apache.spark.status.JobDuration jobDuration ()  { throw new RuntimeException(); }
  public  org.apache.spark.status.JobDuration JOB_DURATION ()  { throw new RuntimeException(); }
  public  com.codahale.metrics.Counter FAILED_STAGES ()  { throw new RuntimeException(); }
  public  com.codahale.metrics.Counter SKIPPED_STAGES ()  { throw new RuntimeException(); }
  public  com.codahale.metrics.Counter COMPLETED_STAGES ()  { throw new RuntimeException(); }
  public  com.codahale.metrics.Counter SUCCEEDED_JOBS ()  { throw new RuntimeException(); }
  public  com.codahale.metrics.Counter FAILED_JOBS ()  { throw new RuntimeException(); }
  public  com.codahale.metrics.Counter COMPLETED_TASKS ()  { throw new RuntimeException(); }
  public  com.codahale.metrics.Counter FAILED_TASKS ()  { throw new RuntimeException(); }
  public  com.codahale.metrics.Counter KILLED_TASKS ()  { throw new RuntimeException(); }
  public  com.codahale.metrics.Counter SKIPPED_TASKS ()  { throw new RuntimeException(); }
  /**
   * @deprecated use excludedExecutors instead. Since 3.1.0. 
  */
  public  com.codahale.metrics.Counter BLACKLISTED_EXECUTORS ()  { throw new RuntimeException(); }
  /**
   * @deprecated use unexcludedExecutors instead. Since 3.1.0. 
  */
  public  com.codahale.metrics.Counter UNBLACKLISTED_EXECUTORS ()  { throw new RuntimeException(); }
  public  com.codahale.metrics.Counter EXCLUDED_EXECUTORS ()  { throw new RuntimeException(); }
  public  com.codahale.metrics.Counter UNEXCLUDED_EXECUTORS ()  { throw new RuntimeException(); }
}
