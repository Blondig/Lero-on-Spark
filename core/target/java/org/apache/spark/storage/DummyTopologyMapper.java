package org.apache.spark.storage;
public  class DummyTopologyMapper extends org.apache.spark.storage.TopologyMapper implements org.apache.spark.internal.Logging {
  public   DummyTopologyMapper (org.apache.spark.SparkConf conf)  { throw new RuntimeException(); }
  /**
   * Gets the topology information given the host name
   * <p>
   * @param hostname Hostname
   * @return random topology
   */
  public  scala.Option<java.lang.String> getTopologyForHost (java.lang.String hostname)  { throw new RuntimeException(); }
  public  int numRacks ()  { throw new RuntimeException(); }
}
