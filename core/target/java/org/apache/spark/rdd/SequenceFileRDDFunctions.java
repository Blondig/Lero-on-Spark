package org.apache.spark.rdd;
/**
 * Extra functions available on RDDs of (key, value) pairs to create a Hadoop SequenceFile,
 * through an implicit conversion.
 * <p>
 * @note This can't be part of PairRDDFunctions because we need more implicit parameters to
 * convert our keys and values to Writable.
 */
public  class SequenceFileRDDFunctions<K extends java.lang.Object, V extends java.lang.Object> implements org.apache.spark.internal.Logging, scala.Serializable {
  public   SequenceFileRDDFunctions (org.apache.spark.rdd.RDD<scala.Tuple2<K, V>> self, java.lang.Class<? extends org.apache.hadoop.io.Writable> _keyWritableClass, java.lang.Class<? extends org.apache.hadoop.io.Writable> _valueWritableClass, scala.Function1<K, org.apache.hadoop.io.Writable> evidence$1, scala.reflect.ClassTag<K> evidence$2, scala.Function1<V, org.apache.hadoop.io.Writable> evidence$3, scala.reflect.ClassTag<V> evidence$4)  { throw new RuntimeException(); }
  /**
   * Output the RDD as a Hadoop SequenceFile using the Writable types we infer from the RDD's key
   * and value types. If the key or value are Writable, then we use their classes directly;
   * otherwise we map primitive types such as Int and Double to IntWritable, DoubleWritable, etc,
   * byte arrays to BytesWritable, and Strings to Text. The <code>path</code> can be on any Hadoop-supported
   * file system.
   * @param path (undocumented)
   * @param codec (undocumented)
   */
  public  void saveAsSequenceFile (java.lang.String path, scala.Option<java.lang.Class<? extends org.apache.hadoop.io.compress.CompressionCodec>> codec)  { throw new RuntimeException(); }
}
