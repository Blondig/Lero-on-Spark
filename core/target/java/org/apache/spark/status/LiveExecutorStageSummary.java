package org.apache.spark.status;
public  class LiveExecutorStageSummary extends org.apache.spark.status.LiveEntity {
  public   LiveExecutorStageSummary (int stageId, int attemptId, java.lang.String executorId)  { throw new RuntimeException(); }
  protected  Object doUpdate ()  { throw new RuntimeException(); }
  public  int failedTasks ()  { throw new RuntimeException(); }
  public  boolean isExcluded ()  { throw new RuntimeException(); }
  public  int killedTasks ()  { throw new RuntimeException(); }
  public  org.apache.spark.status.api.v1.TaskMetrics metrics ()  { throw new RuntimeException(); }
  public  org.apache.spark.executor.ExecutorMetrics peakExecutorMetrics ()  { throw new RuntimeException(); }
  public  int succeededTasks ()  { throw new RuntimeException(); }
  public  long taskTime ()  { throw new RuntimeException(); }
}
