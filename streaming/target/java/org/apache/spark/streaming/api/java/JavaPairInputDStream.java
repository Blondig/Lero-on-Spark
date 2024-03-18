package org.apache.spark.streaming.api.java;
/**
 * A Java-friendly interface to {@link org.apache.spark.streaming.dstream.InputDStream} of
 * key-value pairs.
 */
public  class JavaPairInputDStream<K extends java.lang.Object, V extends java.lang.Object> extends org.apache.spark.streaming.api.java.JavaPairDStream<K, V> {
  /**
   * Convert a scala {@link org.apache.spark.streaming.dstream.InputDStream} of pairs to a
   * Java-friendly {@link org.apache.spark.streaming.api.java.JavaPairInputDStream}.
   * @param inputDStream (undocumented)
   * @param evidence$1 (undocumented)
   * @param evidence$2 (undocumented)
   * @return (undocumented)
   */
  static public <K extends java.lang.Object, V extends java.lang.Object> org.apache.spark.streaming.api.java.JavaPairInputDStream<K, V> fromInputDStream (org.apache.spark.streaming.dstream.InputDStream<scala.Tuple2<K, V>> inputDStream, scala.reflect.ClassTag<K> evidence$1, scala.reflect.ClassTag<V> evidence$2)  { throw new RuntimeException(); }
  public  org.apache.spark.streaming.dstream.InputDStream<scala.Tuple2<K, V>> inputDStream ()  { throw new RuntimeException(); }
  public  scala.reflect.ClassTag<K> kClassTag ()  { throw new RuntimeException(); }
  public  scala.reflect.ClassTag<V> vClassTag ()  { throw new RuntimeException(); }
  // not preceding
  public   JavaPairInputDStream (org.apache.spark.streaming.dstream.InputDStream<scala.Tuple2<K, V>> inputDStream, scala.reflect.ClassTag<K> kClassTag, scala.reflect.ClassTag<V> vClassTag)  { throw new RuntimeException(); }
}
