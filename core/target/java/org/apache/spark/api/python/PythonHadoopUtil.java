package org.apache.spark.api.python;
/** Utilities for working with Python objects <-> Hadoop-related objects */
public  class PythonHadoopUtil {
  /**
   * Convert a {@link java.util.Map} of properties to a {@link org.apache.hadoop.conf.Configuration}
   * @param map (undocumented)
   * @return (undocumented)
   */
  static public  org.apache.hadoop.conf.Configuration mapToConf (java.util.Map<java.lang.String, java.lang.String> map)  { throw new RuntimeException(); }
  /**
   * Merges two configurations, returns a copy of left with keys from right overwriting
   * any matching keys in left
   * @param left (undocumented)
   * @param right (undocumented)
   * @return (undocumented)
   */
  static public  org.apache.hadoop.conf.Configuration mergeConfs (org.apache.hadoop.conf.Configuration left, org.apache.hadoop.conf.Configuration right)  { throw new RuntimeException(); }
  /**
   * Converts an RDD of key-value pairs, where key and/or value could be instances of
   * {@link org.apache.hadoop.io.Writable}, into an RDD of base types, or vice versa.
   * @param rdd (undocumented)
   * @param keyConverter (undocumented)
   * @param valueConverter (undocumented)
   * @return (undocumented)
   */
  static public <K extends java.lang.Object, V extends java.lang.Object> org.apache.spark.rdd.RDD<scala.Tuple2<java.lang.Object, java.lang.Object>> convertRDD (org.apache.spark.rdd.RDD<scala.Tuple2<K, V>> rdd, org.apache.spark.api.python.Converter<K, java.lang.Object> keyConverter, org.apache.spark.api.python.Converter<V, java.lang.Object> valueConverter)  { throw new RuntimeException(); }
}
