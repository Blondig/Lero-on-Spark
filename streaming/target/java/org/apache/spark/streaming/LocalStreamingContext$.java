package org.apache.spark.streaming;
public  class LocalStreamingContext$ implements org.apache.spark.internal.Logging {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final LocalStreamingContext$ MODULE$ = null;
  public   LocalStreamingContext$ ()  { throw new RuntimeException(); }
  public  void stop (org.apache.spark.streaming.StreamingContext ssc, boolean stopSparkContext)  { throw new RuntimeException(); }
  /**
   * Clean up active SparkContext: try to stop first if there's an active SparkContext.
   * If it fails to stop, log warning message and clear active SparkContext to avoid
   * interfere between tests.
   */
  public  void ensureNoActiveSparkContext ()  { throw new RuntimeException(); }
}
