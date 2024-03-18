package org.apache.spark.streaming;
/**
 * This is a output stream just for the testsuites. All the output is collected into a
 * ConcurrentLinkedQueue. This queue is wiped clean on being restored from checkpoint.
 * <p>
 * The buffer contains a sequence of RDD's, each containing a sequence of items.
 */
public  class TestOutputStream<T extends java.lang.Object> extends org.apache.spark.streaming.dstream.ForEachDStream<T> {
  public  java.util.concurrent.ConcurrentLinkedQueue<scala.collection.Seq<T>> output ()  { throw new RuntimeException(); }
  // not preceding
  public   TestOutputStream (org.apache.spark.streaming.dstream.DStream<T> parent, java.util.concurrent.ConcurrentLinkedQueue<scala.collection.Seq<T>> output, scala.reflect.ClassTag<T> evidence$2)  { throw new RuntimeException(); }
}
