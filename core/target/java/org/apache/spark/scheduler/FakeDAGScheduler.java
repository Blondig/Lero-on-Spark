package org.apache.spark.scheduler;
public  class FakeDAGScheduler extends org.apache.spark.scheduler.DAGScheduler {
  public   FakeDAGScheduler (org.apache.spark.SparkContext sc, org.apache.spark.scheduler.FakeTaskScheduler taskScheduler)  { throw new RuntimeException(); }
  public  void executorAdded (java.lang.String execId, java.lang.String host)  { throw new RuntimeException(); }
  public  void executorLost (java.lang.String execId, org.apache.spark.scheduler.ExecutorLossReason reason)  { throw new RuntimeException(); }
  public  void speculativeTaskSubmitted (org.apache.spark.scheduler.Task<?> task)  { throw new RuntimeException(); }
  public  void taskEnded (org.apache.spark.scheduler.Task<?> task, org.apache.spark.TaskEndReason reason, Object result, scala.collection.Seq<org.apache.spark.util.AccumulatorV2<?, ?>> accumUpdates, long[] metricPeaks, org.apache.spark.scheduler.TaskInfo taskInfo)  { throw new RuntimeException(); }
  public  void taskSetFailed (org.apache.spark.scheduler.TaskSet taskSet, java.lang.String reason, scala.Option<java.lang.Throwable> exception)  { throw new RuntimeException(); }
  public  void taskStarted (org.apache.spark.scheduler.Task<?> task, org.apache.spark.scheduler.TaskInfo taskInfo)  { throw new RuntimeException(); }
}
