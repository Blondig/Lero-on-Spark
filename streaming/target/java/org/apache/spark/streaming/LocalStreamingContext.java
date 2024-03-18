package org.apache.spark.streaming;
/**
 * Manages a local <code>ssc</code> <code>StreamingContext</code> variable, correctly stopping it after each test.
 * Note that it also stops active SparkContext if <code>stopSparkContext</code> is set to true (default).
 * In most cases you may want to leave it, to isolate environment for SparkContext in each test.
 */
public  interface LocalStreamingContext extends org.scalatest.BeforeAndAfterEach {
  public  org.apache.spark.streaming.StreamingContext ssc ()  ;
  public  boolean stopSparkContext ()  ;
  public  void afterEach ()  ;
  public  void resetStreamingContext ()  ;
}
