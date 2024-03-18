package org.apache.spark.status;
public  class LiveStage extends org.apache.spark.status.LiveEntity {
  // not preceding
  public   LiveStage (org.apache.spark.scheduler.StageInfo info)  { throw new RuntimeException(); }
  public  int activeTasks ()  { throw new RuntimeException(); }
  public  scala.collection.mutable.Map<java.lang.String, java.lang.Object> activeTasksPerExecutor ()  { throw new RuntimeException(); }
  public  boolean cleaning ()  { throw new RuntimeException(); }
  public  org.apache.spark.util.collection.OpenHashSet<java.lang.Object> completedIndices ()  { throw new RuntimeException(); }
  public  int completedTasks ()  { throw new RuntimeException(); }
  public  scala.Option<java.lang.String> description ()  { throw new RuntimeException(); }
  protected  Object doUpdate ()  { throw new RuntimeException(); }
  public  scala.collection.immutable.HashSet<java.lang.String> excludedExecutors ()  { throw new RuntimeException(); }
  public  scala.collection.mutable.HashMap<java.lang.String, org.apache.spark.status.LiveExecutorStageSummary> executorSummaries ()  { throw new RuntimeException(); }
  public  org.apache.spark.status.LiveExecutorStageSummary executorSummary (java.lang.String executorId)  { throw new RuntimeException(); }
  public  int failedTasks ()  { throw new RuntimeException(); }
  public  long firstLaunchTime ()  { throw new RuntimeException(); }
  public  org.apache.spark.scheduler.StageInfo info ()  { throw new RuntimeException(); }
  public  scala.collection.immutable.Set<java.lang.Object> jobIds ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.status.LiveJob> jobs ()  { throw new RuntimeException(); }
  public  scala.collection.immutable.Map<java.lang.String, java.lang.Object> killedSummary ()  { throw new RuntimeException(); }
  public  int killedTasks ()  { throw new RuntimeException(); }
  public  scala.collection.immutable.Map<java.lang.String, java.lang.Object> localitySummary ()  { throw new RuntimeException(); }
  public  org.apache.spark.status.api.v1.TaskMetrics metrics ()  { throw new RuntimeException(); }
  public  org.apache.spark.executor.ExecutorMetrics peakExecutorMetrics ()  { throw new RuntimeException(); }
  public  java.util.concurrent.atomic.AtomicInteger savedTasks ()  { throw new RuntimeException(); }
  public  java.lang.String schedulingPool ()  { throw new RuntimeException(); }
  // not preceding
  public  org.apache.spark.status.LiveSpeculationStageSummary speculationStageSummary ()  { throw new RuntimeException(); }
  public  org.apache.spark.status.api.v1.StageStatus status ()  { throw new RuntimeException(); }
  public  org.apache.spark.status.api.v1.StageData toApi ()  { throw new RuntimeException(); }
}
