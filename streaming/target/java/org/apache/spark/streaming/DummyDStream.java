package org.apache.spark.streaming;
/**
 * A dummy stream that does absolutely nothing.
 */
  class DummyDStream extends org.apache.spark.streaming.dstream.DStream<java.lang.Object> {
  public   DummyDStream (org.apache.spark.streaming.StreamingContext ssc)  { throw new RuntimeException(); }
  public  scala.Option<org.apache.spark.rdd.RDD<java.lang.Object>> compute (org.apache.spark.streaming.Time time)  { throw new RuntimeException(); }
  public  scala.collection.immutable.List<org.apache.spark.streaming.dstream.DStream<java.lang.Object>> dependencies ()  { throw new RuntimeException(); }
  public  org.apache.spark.streaming.Duration slideDuration ()  { throw new RuntimeException(); }
}
