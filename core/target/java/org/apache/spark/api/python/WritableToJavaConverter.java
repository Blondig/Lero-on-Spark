package org.apache.spark.api.python;
/**
 * A converter that handles conversion of common {@link org.apache.hadoop.io.Writable} objects.
 * Other objects are passed through without conversion.
 */
  class WritableToJavaConverter implements org.apache.spark.api.python.Converter<java.lang.Object, java.lang.Object> {
  public   WritableToJavaConverter (org.apache.spark.broadcast.Broadcast<org.apache.spark.util.SerializableConfiguration> conf)  { throw new RuntimeException(); }
  public  Object convert (Object obj)  { throw new RuntimeException(); }
}
