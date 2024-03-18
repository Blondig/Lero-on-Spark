package org.apache.spark.serializer;
/**
 * A serializer implementation that always returns two elements in a deserialization stream.
 */
public  class TestSerializer extends org.apache.spark.serializer.Serializer {
  public   TestSerializer ()  { throw new RuntimeException(); }
  public  org.apache.spark.serializer.TestSerializerInstance newInstance ()  { throw new RuntimeException(); }
}
