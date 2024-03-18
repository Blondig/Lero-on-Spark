package org.apache.spark.internal.plugin;
public  class TestExecutorPlugin implements org.apache.spark.api.plugin.ExecutorPlugin {
  public   TestExecutorPlugin ()  { throw new RuntimeException(); }
  public  void init (org.apache.spark.api.plugin.PluginContext ctx, java.util.Map<java.lang.String, java.lang.String> extraConf)  { throw new RuntimeException(); }
  public  java.util.concurrent.atomic.AtomicInteger numOnTaskFailed ()  { throw new RuntimeException(); }
  public  java.util.concurrent.atomic.AtomicInteger numOnTaskStart ()  { throw new RuntimeException(); }
  public  java.util.concurrent.atomic.AtomicInteger numOnTaskSucceeded ()  { throw new RuntimeException(); }
  public  void onTaskFailed (org.apache.spark.TaskFailedReason failureReason)  { throw new RuntimeException(); }
  public  void onTaskStart ()  { throw new RuntimeException(); }
  public  void onTaskSucceeded ()  { throw new RuntimeException(); }
}
