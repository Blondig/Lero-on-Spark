package org.apache.spark.serializer;
public  class TestSerializerInstance extends org.apache.spark.serializer.SerializerInstance {
  public   TestSerializerInstance ()  { throw new RuntimeException(); }
  public <T extends java.lang.Object> T deserialize (java.nio.ByteBuffer bytes, scala.reflect.ClassTag<T> evidence$2)  { throw new RuntimeException(); }
  public <T extends java.lang.Object> T deserialize (java.nio.ByteBuffer bytes, java.lang.ClassLoader loader, scala.reflect.ClassTag<T> evidence$3)  { throw new RuntimeException(); }
  public  org.apache.spark.serializer.TestDeserializationStream deserializeStream (java.io.InputStream s)  { throw new RuntimeException(); }
  public <T extends java.lang.Object> java.nio.ByteBuffer serialize (T t, scala.reflect.ClassTag<T> evidence$1)  { throw new RuntimeException(); }
  public  org.apache.spark.serializer.SerializationStream serializeStream (java.io.OutputStream s)  { throw new RuntimeException(); }
}
