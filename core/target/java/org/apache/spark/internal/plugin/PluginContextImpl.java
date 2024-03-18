package org.apache.spark.internal.plugin;
public  class PluginContextImpl implements org.apache.spark.api.plugin.PluginContext, org.apache.spark.internal.Logging {
  public  class PluginMetricsSource implements org.apache.spark.metrics.source.Source {
    // not preceding
    public   PluginMetricsSource (java.lang.String sourceName, com.codahale.metrics.MetricRegistry metricRegistry)  { throw new RuntimeException(); }
    public  com.codahale.metrics.MetricRegistry metricRegistry ()  { throw new RuntimeException(); }
    public  java.lang.String sourceName ()  { throw new RuntimeException(); }
  }
  // not preceding
  public   PluginContextImpl (java.lang.String pluginName, org.apache.spark.rpc.RpcEnv rpcEnv, org.apache.spark.metrics.MetricsSystem metricsSystem, org.apache.spark.SparkConf conf, java.lang.String executorID, java.util.Map<java.lang.String, org.apache.spark.resource.ResourceInformation> resources)  { throw new RuntimeException(); }
  public  java.lang.Object ask (java.lang.Object message)  { throw new RuntimeException(); }
  public  org.apache.spark.SparkConf conf ()  { throw new RuntimeException(); }
  public  java.lang.String executorID ()  { throw new RuntimeException(); }
  public  java.lang.String hostname ()  { throw new RuntimeException(); }
  public  com.codahale.metrics.MetricRegistry metricRegistry ()  { throw new RuntimeException(); }
  public  void registerMetrics ()  { throw new RuntimeException(); }
  public  java.util.Map<java.lang.String, org.apache.spark.resource.ResourceInformation> resources ()  { throw new RuntimeException(); }
  public  void send (java.lang.Object message)  { throw new RuntimeException(); }
}
