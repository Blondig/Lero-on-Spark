package org.apache.spark.streaming.api.java;
/**
 * A Java-friendly interface to {@link org.apache.spark.streaming.dstream.InputDStream}.
 */
public  class JavaInputDStream<T extends java.lang.Object> extends org.apache.spark.streaming.api.java.JavaDStream<T> {
  /**
   * Convert a scala {@link org.apache.spark.streaming.dstream.InputDStream} to a Java-friendly
   * {@link org.apache.spark.streaming.api.java.JavaInputDStream}.
   * @param inputDStream (undocumented)
   * @param evidence$1 (undocumented)
   * @return (undocumented)
   */
  static public <T extends java.lang.Object> org.apache.spark.streaming.api.java.JavaInputDStream<T> fromInputDStream (org.apache.spark.streaming.dstream.InputDStream<T> inputDStream, scala.reflect.ClassTag<T> evidence$1)  { throw new RuntimeException(); }
  public  org.apache.spark.streaming.dstream.InputDStream<T> inputDStream ()  { throw new RuntimeException(); }
  public  scala.reflect.ClassTag<T> classTag ()  { throw new RuntimeException(); }
  // not preceding
  public   JavaInputDStream (org.apache.spark.streaming.dstream.InputDStream<T> inputDStream, scala.reflect.ClassTag<T> classTag)  { throw new RuntimeException(); }
}
