package org.apache.spark.streaming;
/**
 * Test that closures passed to DStream operations are actually cleaned.
 */
public  class DStreamClosureSuite extends org.apache.spark.SparkFunSuite implements org.apache.spark.streaming.LocalStreamingContext, org.scalatest.BeforeAndAfterAll {
  public   DStreamClosureSuite ()  { throw new RuntimeException(); }
  protected  void beforeEach ()  { throw new RuntimeException(); }
  public  org.apache.spark.streaming.StreamingContext ssc ()  { throw new RuntimeException(); }
  public  boolean stopSparkContext ()  { throw new RuntimeException(); }
}
