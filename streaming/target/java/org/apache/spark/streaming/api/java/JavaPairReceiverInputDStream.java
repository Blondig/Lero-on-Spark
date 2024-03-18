package org.apache.spark.streaming.api.java;
/**
 * A Java-friendly interface to {@link org.apache.spark.streaming.dstream.ReceiverInputDStream}, the
 * abstract class for defining any input stream that receives data over the network.
 */
public  class JavaPairReceiverInputDStream<K extends java.lang.Object, V extends java.lang.Object> extends org.apache.spark.streaming.api.java.JavaPairInputDStream<K, V> {
  /**
   * Convert a scala {@link org.apache.spark.streaming.dstream.ReceiverInputDStream} to a Java-friendly
   * {@link org.apache.spark.streaming.api.java.JavaReceiverInputDStream}.
   * @param receiverInputDStream (undocumented)
   * @param evidence$1 (undocumented)
   * @param evidence$2 (undocumented)
   * @return (undocumented)
   */
  static public <K extends java.lang.Object, V extends java.lang.Object> org.apache.spark.streaming.api.java.JavaPairReceiverInputDStream<K, V> fromReceiverInputDStream (org.apache.spark.streaming.dstream.ReceiverInputDStream<scala.Tuple2<K, V>> receiverInputDStream, scala.reflect.ClassTag<K> evidence$1, scala.reflect.ClassTag<V> evidence$2)  { throw new RuntimeException(); }
  public  org.apache.spark.streaming.dstream.ReceiverInputDStream<scala.Tuple2<K, V>> receiverInputDStream ()  { throw new RuntimeException(); }
  public  scala.reflect.ClassTag<K> kClassTag ()  { throw new RuntimeException(); }
  public  scala.reflect.ClassTag<V> vClassTag ()  { throw new RuntimeException(); }
  // not preceding
  public   JavaPairReceiverInputDStream (org.apache.spark.streaming.dstream.ReceiverInputDStream<scala.Tuple2<K, V>> receiverInputDStream, scala.reflect.ClassTag<K> kClassTag, scala.reflect.ClassTag<V> vClassTag)  { throw new RuntimeException(); }
}
