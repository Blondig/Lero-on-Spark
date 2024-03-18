package org.apache.spark.status;
  class LiveExecutor extends org.apache.spark.status.LiveEntity {
  // not preceding
  public   LiveExecutor (java.lang.String executorId, long _addTime)  { throw new RuntimeException(); }
  public  int activeTasks ()  { throw new RuntimeException(); }
  public  java.util.Date addTime ()  { throw new RuntimeException(); }
  public  scala.collection.immutable.Map<java.lang.String, java.lang.String> attributes ()  { throw new RuntimeException(); }
  public  int completedTasks ()  { throw new RuntimeException(); }
  public  long diskUsed ()  { throw new RuntimeException(); }
  protected  Object doUpdate ()  { throw new RuntimeException(); }
  public  scala.collection.immutable.Set<java.lang.Object> excludedInStages ()  { throw new RuntimeException(); }
  public  java.lang.String executorId ()  { throw new RuntimeException(); }
  public  scala.collection.immutable.Map<java.lang.String, java.lang.String> executorLogs ()  { throw new RuntimeException(); }
  public  int failedTasks ()  { throw new RuntimeException(); }
  public  boolean hasMemoryInfo ()  { throw new RuntimeException(); }
  public  java.lang.String host ()  { throw new RuntimeException(); }
  public  java.lang.String hostPort ()  { throw new RuntimeException(); }
  public  java.lang.String hostname ()  { throw new RuntimeException(); }
  public  boolean isActive ()  { throw new RuntimeException(); }
  public  boolean isExcluded ()  { throw new RuntimeException(); }
  public  long maxMemory ()  { throw new RuntimeException(); }
  public  int maxTasks ()  { throw new RuntimeException(); }
  public  long memoryUsed ()  { throw new RuntimeException(); }
  public  org.apache.spark.executor.ExecutorMetrics peakExecutorMetrics ()  { throw new RuntimeException(); }
  public  int rddBlocks ()  { throw new RuntimeException(); }
  public  java.lang.String removeReason ()  { throw new RuntimeException(); }
  public  java.util.Date removeTime ()  { throw new RuntimeException(); }
  public  int resourceProfileId ()  { throw new RuntimeException(); }
  public  scala.collection.immutable.Map<java.lang.String, org.apache.spark.resource.ResourceInformation> resources ()  { throw new RuntimeException(); }
  public  int totalCores ()  { throw new RuntimeException(); }
  public  long totalDuration ()  { throw new RuntimeException(); }
  public  long totalGcTime ()  { throw new RuntimeException(); }
  public  long totalInputBytes ()  { throw new RuntimeException(); }
  public  long totalOffHeap ()  { throw new RuntimeException(); }
  public  long totalOnHeap ()  { throw new RuntimeException(); }
  public  long totalShuffleRead ()  { throw new RuntimeException(); }
  public  long totalShuffleWrite ()  { throw new RuntimeException(); }
  public  int totalTasks ()  { throw new RuntimeException(); }
  public  long usedOffHeap ()  { throw new RuntimeException(); }
  public  long usedOnHeap ()  { throw new RuntimeException(); }
}
