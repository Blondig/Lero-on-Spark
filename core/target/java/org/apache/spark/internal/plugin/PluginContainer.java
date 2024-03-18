package org.apache.spark.internal.plugin;
public abstract class PluginContainer {
  static public  java.lang.String EXTRA_CONF_PREFIX ()  { throw new RuntimeException(); }
  static public  scala.Option<org.apache.spark.internal.plugin.PluginContainer> apply (org.apache.spark.SparkContext sc, java.util.Map<java.lang.String, org.apache.spark.resource.ResourceInformation> resources)  { throw new RuntimeException(); }
  static public  scala.Option<org.apache.spark.internal.plugin.PluginContainer> apply (org.apache.spark.SparkEnv env, java.util.Map<java.lang.String, org.apache.spark.resource.ResourceInformation> resources)  { throw new RuntimeException(); }
  public   PluginContainer ()  { throw new RuntimeException(); }
  public abstract  void shutdown ()  ;
  public abstract  void registerMetrics (java.lang.String appId)  ;
  public abstract  void onTaskStart ()  ;
  public abstract  void onTaskSucceeded ()  ;
  public abstract  void onTaskFailed (org.apache.spark.TaskFailedReason failureReason)  ;
}
