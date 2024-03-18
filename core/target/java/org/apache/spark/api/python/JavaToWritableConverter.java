package org.apache.spark.api.python;
/**
 * A converter that converts common types to {@link org.apache.hadoop.io.Writable}. Note that array
 * types are not supported since the user needs to subclass {@link org.apache.hadoop.io.ArrayWritable}
 * to set the type properly. See {@link org.apache.spark.api.python.DoubleArrayWritable} and
 * {@link org.apache.spark.api.python.DoubleArrayToWritableConverter} for an example. They are used in
 * PySpark RDD <code>saveAsNewAPIHadoopFile</code> doctest.
 */
  class JavaToWritableConverter implements org.apache.spark.api.python.Converter<java.lang.Object, org.apache.hadoop.io.Writable> {
  public   JavaToWritableConverter ()  { throw new RuntimeException(); }
  public  org.apache.hadoop.io.Writable convert (Object obj)  { throw new RuntimeException(); }
}
