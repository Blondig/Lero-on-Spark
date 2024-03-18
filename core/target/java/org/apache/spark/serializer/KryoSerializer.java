package org.apache.spark.serializer;
/**
 * A Spark serializer that uses the <a href="https://code.google.com/p/kryo/">
 * Kryo serialization library</a>.
 * <p>
 * @note This serializer is not guaranteed to be wire-compatible across different versions of
 * Spark. It is intended to be used to serialize/de-serialize data within a single
 * Spark application.
 */
public  class KryoSerializer extends org.apache.spark.serializer.Serializer implements org.apache.spark.internal.Logging, java.io.Serializable {
  public   KryoSerializer (org.apache.spark.SparkConf conf)  { throw new RuntimeException(); }
  public  int maxBufferSizeMb ()  { throw new RuntimeException(); }
  public  com.esotericsoftware.kryo.io.Output newKryoOutput ()  { throw new RuntimeException(); }
  public  com.esotericsoftware.kryo.pool.KryoPool pool ()  { throw new RuntimeException(); }
  public  com.esotericsoftware.kryo.Kryo newKryo ()  { throw new RuntimeException(); }
  public  org.apache.spark.serializer.Serializer setDefaultClassLoader (java.lang.ClassLoader classLoader)  { throw new RuntimeException(); }
  public  org.apache.spark.serializer.SerializerInstance newInstance ()  { throw new RuntimeException(); }
  // not preceding
    boolean supportsRelocationOfSerializedObjects ()  { throw new RuntimeException(); }
}
