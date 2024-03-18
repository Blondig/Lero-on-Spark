package org.apache.spark.internal.plugin;
public  class NonLocalModeSparkPlugin implements org.apache.spark.api.plugin.SparkPlugin {
  static public  java.lang.String TEST_PATH_CONF ()  { throw new RuntimeException(); }
  static public  org.apache.spark.api.plugin.PluginContext driverContext ()  { throw new RuntimeException(); }
  static public  java.lang.String executorFileStr ()  { throw new RuntimeException(); }
  static public  java.lang.String driverFileStr ()  { throw new RuntimeException(); }
  static public  java.lang.String[] extractGpuAddrs (java.lang.String str)  { throw new RuntimeException(); }
  static public  void writeDriverFile (java.lang.String filePrefix, org.apache.spark.SparkConf conf, java.lang.String id)  { throw new RuntimeException(); }
  static public  void writeFile (java.lang.String filePrefix, org.apache.spark.SparkConf conf, java.lang.String id, scala.collection.immutable.Map<java.lang.String, org.apache.spark.resource.ResourceInformation> resources)  { throw new RuntimeException(); }
  static public  void reset ()  { throw new RuntimeException(); }
  public   NonLocalModeSparkPlugin ()  { throw new RuntimeException(); }
  public  org.apache.spark.api.plugin.DriverPlugin driverPlugin ()  { throw new RuntimeException(); }
  public  org.apache.spark.api.plugin.ExecutorPlugin executorPlugin ()  { throw new RuntimeException(); }
}
