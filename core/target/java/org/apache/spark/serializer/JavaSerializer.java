package org.apache.spark.serializer;
/**
 * :: DeveloperApi ::
 * A Spark serializer that uses Java's built-in serialization.
 * <p>
 * @note This serializer is not guaranteed to be wire-compatible across different versions of
 * Spark. It is intended to be used to serialize/de-serialize data within a single
 * Spark application.
 */
public  class JavaSerializer extends org.apache.spark.serializer.Serializer implements java.io.Externalizable {
  public   JavaSerializer (org.apache.spark.SparkConf conf)  { throw new RuntimeException(); }
  protected   JavaSerializer ()  { throw new RuntimeException(); }
  public  org.apache.spark.serializer.SerializerInstance newInstance ()  { throw new RuntimeException(); }
  public  void readExternal (java.io.ObjectInput in)  { throw new RuntimeException(); }
  public  void writeExternal (java.io.ObjectOutput out)  { throw new RuntimeException(); }
}
