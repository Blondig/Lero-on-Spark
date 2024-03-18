package org.apache.spark;
/**
 * A class encapsulating how to convert some type <code>T</code> from <code>Writable</code>. It stores both the <code>Writable</code>
 * class corresponding to <code>T</code> (e.g. <code>IntWritable</code> for <code>Int</code>) and a function for doing the
 * conversion.
 * The getter for the writable class takes a <code>ClassTag[T]</code> in case this is a generic object
 * that doesn't know the type of <code>T</code> when it is created. This sounds strange but is necessary to
 * support converting subclasses of <code>Writable</code> to themselves (<code>writableWritableConverter()</code>).
 */
  class WritableConverter<T extends java.lang.Object> implements java.io.Serializable {
  static  <T extends java.lang.Object, W extends org.apache.hadoop.io.Writable> org.apache.spark.WritableConverter<T> simpleWritableConverter (scala.Function1<W, T> convert, scala.reflect.ClassTag<W> evidence$18)  { throw new RuntimeException(); }
  static public  scala.Function0<org.apache.spark.WritableConverter<java.lang.Object>> intWritableConverterFn ()  { throw new RuntimeException(); }
  static public  scala.Function0<org.apache.spark.WritableConverter<java.lang.Object>> longWritableConverterFn ()  { throw new RuntimeException(); }
  static public  scala.Function0<org.apache.spark.WritableConverter<java.lang.Object>> doubleWritableConverterFn ()  { throw new RuntimeException(); }
  static public  scala.Function0<org.apache.spark.WritableConverter<java.lang.Object>> floatWritableConverterFn ()  { throw new RuntimeException(); }
  static public  scala.Function0<org.apache.spark.WritableConverter<java.lang.Object>> booleanWritableConverterFn ()  { throw new RuntimeException(); }
  static public  scala.Function0<org.apache.spark.WritableConverter<byte[]>> bytesWritableConverterFn ()  { throw new RuntimeException(); }
  static public  scala.Function0<org.apache.spark.WritableConverter<java.lang.String>> stringWritableConverterFn ()  { throw new RuntimeException(); }
  static public <T extends org.apache.hadoop.io.Writable> scala.Function0<org.apache.spark.WritableConverter<T>> writableWritableConverterFn (scala.reflect.ClassTag<T> evidence$19)  { throw new RuntimeException(); }
  static public  org.apache.spark.WritableConverter<java.lang.Object> intWritableConverter ()  { throw new RuntimeException(); }
  static public  org.apache.spark.WritableConverter<java.lang.Object> longWritableConverter ()  { throw new RuntimeException(); }
  static public  org.apache.spark.WritableConverter<java.lang.Object> doubleWritableConverter ()  { throw new RuntimeException(); }
  static public  org.apache.spark.WritableConverter<java.lang.Object> floatWritableConverter ()  { throw new RuntimeException(); }
  static public  org.apache.spark.WritableConverter<java.lang.Object> booleanWritableConverter ()  { throw new RuntimeException(); }
  static public  org.apache.spark.WritableConverter<byte[]> bytesWritableConverter ()  { throw new RuntimeException(); }
  static public  org.apache.spark.WritableConverter<java.lang.String> stringWritableConverter ()  { throw new RuntimeException(); }
  static public <T extends org.apache.hadoop.io.Writable> org.apache.spark.WritableConverter<T> writableWritableConverter ()  { throw new RuntimeException(); }
  public  scala.Function1<scala.reflect.ClassTag<T>, java.lang.Class<? extends org.apache.hadoop.io.Writable>> writableClass ()  { throw new RuntimeException(); }
  public  scala.Function1<org.apache.hadoop.io.Writable, T> convert ()  { throw new RuntimeException(); }
  // not preceding
  public   WritableConverter (scala.Function1<scala.reflect.ClassTag<T>, java.lang.Class<? extends org.apache.hadoop.io.Writable>> writableClass, scala.Function1<org.apache.hadoop.io.Writable, T> convert)  { throw new RuntimeException(); }
}
