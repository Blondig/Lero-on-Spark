package org.apache.spark.streaming.api.java;
/**
 * A Java-friendly interface to {@link org.apache.spark.streaming.dstream.ReceiverInputDStream}, the
 * abstract class for defining any input stream that receives data over the network.
 */
public  class JavaReceiverInputDStream<T extends java.lang.Object> extends org.apache.spark.streaming.api.java.JavaInputDStream<T> {
  /**
   * Convert a scala {@link org.apache.spark.streaming.dstream.ReceiverInputDStream} to a Java-friendly
   * {@link org.apache.spark.streaming.api.java.JavaReceiverInputDStream}.
   * @param receiverInputDStream (undocumented)
   * @param evidence$1 (undocumented)
   * @return (undocumented)
   */
  static public <T extends java.lang.Object> org.apache.spark.streaming.api.java.JavaReceiverInputDStream<T> fromReceiverInputDStream (org.apache.spark.streaming.dstream.ReceiverInputDStream<T> receiverInputDStream, scala.reflect.ClassTag<T> evidence$1)  { throw new RuntimeException(); }
  public  org.apache.spark.streaming.dstream.ReceiverInputDStream<T> receiverInputDStream ()  { throw new RuntimeException(); }
  public  scala.reflect.ClassTag<T> classTag ()  { throw new RuntimeException(); }
  // not preceding
  public   JavaReceiverInputDStream (org.apache.spark.streaming.dstream.ReceiverInputDStream<T> receiverInputDStream, scala.reflect.ClassTag<T> classTag)  { throw new RuntimeException(); }
}
