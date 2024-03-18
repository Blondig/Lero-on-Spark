package org.apache.spark.internal.plugin;
public  class ExecutorPluginContainer extends org.apache.spark.internal.plugin.PluginContainer implements org.apache.spark.internal.Logging {
  public   ExecutorPluginContainer (org.apache.spark.SparkEnv env, java.util.Map<java.lang.String, org.apache.spark.resource.ResourceInformation> resources, scala.collection.Seq<org.apache.spark.api.plugin.SparkPlugin> plugins)  { throw new RuntimeException(); }
  public  void onTaskFailed (org.apache.spark.TaskFailedReason failureReason)  { throw new RuntimeException(); }
  public  void onTaskStart ()  { throw new RuntimeException(); }
  public  void onTaskSucceeded ()  { throw new RuntimeException(); }
  public  void registerMetrics (java.lang.String appId)  { throw new RuntimeException(); }
  public  void shutdown ()  { throw new RuntimeException(); }
}
