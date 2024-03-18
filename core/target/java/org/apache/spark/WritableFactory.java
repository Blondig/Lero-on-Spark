package org.apache.spark;
/**
 * A class encapsulating how to convert some type <code>T</code> to <code>Writable</code>. It stores both the <code>Writable</code>
 * class corresponding to <code>T</code> (e.g. <code>IntWritable</code> for <code>Int</code>) and a function for doing the
 * conversion.
 * The <code>Writable</code> class will be used in <code>SequenceFileRDDFunctions</code>.
 */
  class WritableFactory<T extends java.lang.Object> implements java.io.Serializable {
  static  <T extends java.lang.Object, W extends org.apache.hadoop.io.Writable> org.apache.spark.WritableFactory<T> simpleWritableFactory (scala.Function1<T, W> convert, scala.reflect.ClassTag<T> evidence$20, scala.reflect.ClassTag<W> evidence$21)  { throw new RuntimeException(); }
  static public  org.apache.spark.WritableFactory<java.lang.Object> intWritableFactory ()  { throw new RuntimeException(); }
  static public  org.apache.spark.WritableFactory<java.lang.Object> longWritableFactory ()  { throw new RuntimeException(); }
  static public  org.apache.spark.WritableFactory<java.lang.Object> floatWritableFactory ()  { throw new RuntimeException(); }
  static public  org.apache.spark.WritableFactory<java.lang.Object> doubleWritableFactory ()  { throw new RuntimeException(); }
  static public  org.apache.spark.WritableFactory<java.lang.Object> booleanWritableFactory ()  { throw new RuntimeException(); }
  static public  org.apache.spark.WritableFactory<byte[]> bytesWritableFactory ()  { throw new RuntimeException(); }
  static public  org.apache.spark.WritableFactory<java.lang.String> stringWritableFactory ()  { throw new RuntimeException(); }
  static public <T extends org.apache.hadoop.io.Writable> org.apache.spark.WritableFactory<T> writableWritableFactory (scala.reflect.ClassTag<T> evidence$22)  { throw new RuntimeException(); }
  public  scala.Function1<scala.reflect.ClassTag<T>, java.lang.Class<? extends org.apache.hadoop.io.Writable>> writableClass ()  { throw new RuntimeException(); }
  public  scala.Function1<T, org.apache.hadoop.io.Writable> convert ()  { throw new RuntimeException(); }
  // not preceding
  public   WritableFactory (scala.Function1<scala.reflect.ClassTag<T>, java.lang.Class<? extends org.apache.hadoop.io.Writable>> writableClass, scala.Function1<T, org.apache.hadoop.io.Writable> convert)  { throw new RuntimeException(); }
}
