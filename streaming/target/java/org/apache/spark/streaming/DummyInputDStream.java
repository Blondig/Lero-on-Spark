package org.apache.spark.streaming;
/**
 * A dummy input stream that does absolutely nothing.
 */
  class DummyInputDStream extends org.apache.spark.streaming.dstream.InputDStream<java.lang.Object> {
  public   DummyInputDStream (org.apache.spark.streaming.StreamingContext ssc)  { throw new RuntimeException(); }
  public  scala.Option<org.apache.spark.rdd.RDD<java.lang.Object>> compute (org.apache.spark.streaming.Time time)  { throw new RuntimeException(); }
  public  void start ()  { throw new RuntimeException(); }
  public  void stop ()  { throw new RuntimeException(); }
}
