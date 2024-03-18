package org.apache.spark.internal.plugin;
public  class DriverPluginContainer extends org.apache.spark.internal.plugin.PluginContainer implements org.apache.spark.internal.Logging {
  public   DriverPluginContainer (org.apache.spark.SparkContext sc, java.util.Map<java.lang.String, org.apache.spark.resource.ResourceInformation> resources, scala.collection.Seq<org.apache.spark.api.plugin.SparkPlugin> plugins)  { throw new RuntimeException(); }
  public  void onTaskFailed (org.apache.spark.TaskFailedReason failureReason)  { throw new RuntimeException(); }
  public  void onTaskStart ()  { throw new RuntimeException(); }
  public  void onTaskSucceeded ()  { throw new RuntimeException(); }
  public  void registerMetrics (java.lang.String appId)  { throw new RuntimeException(); }
  public  void shutdown ()  { throw new RuntimeException(); }
}
