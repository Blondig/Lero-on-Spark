package org.apache.spark.streaming;
/**
 * This is a input stream just for the testsuites. This is equivalent to a checkpointable,
 * replayable, reliable message queue like Kafka. It requires a sequence as input, and
 * returns the i_th element at the i_th batch under manual clock.
 */
public  class TestInputStream<T extends java.lang.Object> extends org.apache.spark.streaming.dstream.InputDStream<T> {
  // not preceding
  // TypeTree().setOriginal(TypeBoundsTree(TypeTree(), TypeTree()))
  public   TestInputStream (org.apache.spark.streaming.StreamingContext _ssc, scala.collection.Seq<scala.collection.Seq<T>> input, int numPartitions, scala.reflect.ClassTag<T> evidence$1)  { throw new RuntimeException(); }
  public  scala.Option<org.apache.spark.rdd.RDD<T>> compute (org.apache.spark.streaming.Time validTime)  { throw new RuntimeException(); }
  public  void start ()  { throw new RuntimeException(); }
  public  void stop ()  { throw new RuntimeException(); }
}
