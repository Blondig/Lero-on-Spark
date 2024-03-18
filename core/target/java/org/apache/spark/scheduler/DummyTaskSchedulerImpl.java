package org.apache.spark.scheduler;
public  class DummyTaskSchedulerImpl extends org.apache.spark.scheduler.TaskSchedulerImpl {
  public   DummyTaskSchedulerImpl (org.apache.spark.SparkContext sc)  { throw new RuntimeException(); }
  public  void handleFailedTask (org.apache.spark.scheduler.TaskSetManager taskSetManager, long tid, scala.Enumeration.Value taskState, org.apache.spark.TaskFailedReason reason)  { throw new RuntimeException(); }
}
