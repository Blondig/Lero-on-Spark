package org.apache.spark.util.collection;
/**
 * An abstraction of a consumer of key-value pairs, primarily used when
 * persisting partitioned data, either through the shuffle writer plugins
 * or via DiskBlockObjectWriter.
 */
public  interface PairsWriter {
  public  void write (Object key, Object value)  ;
}
