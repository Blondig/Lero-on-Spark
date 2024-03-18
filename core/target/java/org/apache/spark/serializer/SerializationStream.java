package org.apache.spark.serializer;
/**
 * :: DeveloperApi ::
 * A stream for writing serialized objects.
 */
public abstract class SerializationStream implements java.io.Closeable {
  public   SerializationStream ()  { throw new RuntimeException(); }
  public abstract  void close ()  ;
  public abstract  void flush ()  ;
  public <T extends java.lang.Object> org.apache.spark.serializer.SerializationStream writeAll (scala.collection.Iterator<T> iter, scala.reflect.ClassTag<T> evidence$7)  { throw new RuntimeException(); }
  /** Writes the object representing the key of a key-value pair. */
  public <T extends java.lang.Object> org.apache.spark.serializer.SerializationStream writeKey (T key, scala.reflect.ClassTag<T> evidence$5)  { throw new RuntimeException(); }
  /** The most general-purpose method to write an object. */
  public abstract <T extends java.lang.Object> org.apache.spark.serializer.SerializationStream writeObject (T t, scala.reflect.ClassTag<T> evidence$4)  ;
  /** Writes the object representing the value of a key-value pair. */
  public <T extends java.lang.Object> org.apache.spark.serializer.SerializationStream writeValue (T value, scala.reflect.ClassTag<T> evidence$6)  { throw new RuntimeException(); }
}
