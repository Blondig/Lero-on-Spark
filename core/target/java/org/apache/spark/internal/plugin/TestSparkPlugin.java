package org.apache.spark.internal.plugin;
public  class TestSparkPlugin implements org.apache.spark.api.plugin.SparkPlugin {
  static public  org.apache.spark.api.plugin.PluginContext driverContext ()  { throw new RuntimeException(); }
  static public  org.apache.spark.api.plugin.PluginContext executorContext ()  { throw new RuntimeException(); }
  static public  java.util.Map<java.lang.String, java.lang.String> extraConf ()  { throw new RuntimeException(); }
  static public  void reset ()  { throw new RuntimeException(); }
  public   TestSparkPlugin ()  { throw new RuntimeException(); }
  public  org.apache.spark.api.plugin.DriverPlugin driverPlugin ()  { throw new RuntimeException(); }
  public  org.apache.spark.api.plugin.ExecutorPlugin executorPlugin ()  { throw new RuntimeException(); }
}
