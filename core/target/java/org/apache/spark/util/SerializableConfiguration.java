package org.apache.spark.util;
/**
 * Hadoop configuration but serializable. Use <code>value</code> to access the Hadoop configuration.
 * <p>
 * param:  value Hadoop configuration
 */
public  class SerializableConfiguration implements scala.Serializable {
  // not preceding
  public   SerializableConfiguration (org.apache.hadoop.conf.Configuration value)  { throw new RuntimeException(); }
  public  org.apache.hadoop.conf.Configuration value ()  { throw new RuntimeException(); }
}
