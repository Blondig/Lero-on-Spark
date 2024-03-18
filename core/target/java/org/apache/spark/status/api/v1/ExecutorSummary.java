package org.apache.spark.status.api.v1;
public  class ExecutorSummary {
  // not preceding
     ExecutorSummary (java.lang.String id, java.lang.String hostPort, boolean isActive, int rddBlocks, long memoryUsed, long diskUsed, int totalCores, int maxTasks, int activeTasks, int failedTasks, int completedTasks, int totalTasks, long totalDuration, long totalGCTime, long totalInputBytes, long totalShuffleRead, long totalShuffleWrite, boolean isBlacklisted, long maxMemory, java.util.Date addTime, scala.Option<java.util.Date> removeTime, scala.Option<java.lang.String> removeReason, scala.collection.immutable.Map<java.lang.String, java.lang.String> executorLogs, scala.Option<org.apache.spark.status.api.v1.MemoryMetrics> memoryMetrics, scala.collection.immutable.Set<java.lang.Object> blacklistedInStages, scala.Option<org.apache.spark.executor.ExecutorMetrics> peakMemoryMetrics, scala.collection.immutable.Map<java.lang.String, java.lang.String> attributes, scala.collection.immutable.Map<java.lang.String, org.apache.spark.resource.ResourceInformation> resources, int resourceProfileId, boolean isExcluded, scala.collection.immutable.Set<java.lang.Object> excludedInStages)  { throw new RuntimeException(); }
  public  int activeTasks ()  { throw new RuntimeException(); }
  public  java.util.Date addTime ()  { throw new RuntimeException(); }
  public  scala.collection.immutable.Map<java.lang.String, java.lang.String> attributes ()  { throw new RuntimeException(); }
  /**
   * @deprecated use excludedInStages instead. Since 3.1.0. 
  */
  public  scala.collection.immutable.Set<java.lang.Object> blacklistedInStages ()  { throw new RuntimeException(); }
  public  int completedTasks ()  { throw new RuntimeException(); }
  public  long diskUsed ()  { throw new RuntimeException(); }
  public  scala.collection.immutable.Set<java.lang.Object> excludedInStages ()  { throw new RuntimeException(); }
  public  scala.collection.immutable.Map<java.lang.String, java.lang.String> executorLogs ()  { throw new RuntimeException(); }
  public  int failedTasks ()  { throw new RuntimeException(); }
  public  java.lang.String hostPort ()  { throw new RuntimeException(); }
  public  java.lang.String id ()  { throw new RuntimeException(); }
  public  boolean isActive ()  { throw new RuntimeException(); }
  /**
   * @deprecated use isExcluded instead. Since 3.1.0. 
  */
  public  boolean isBlacklisted ()  { throw new RuntimeException(); }
  public  boolean isExcluded ()  { throw new RuntimeException(); }
  public  long maxMemory ()  { throw new RuntimeException(); }
  public  int maxTasks ()  { throw new RuntimeException(); }
  public  scala.Option<org.apache.spark.status.api.v1.MemoryMetrics> memoryMetrics ()  { throw new RuntimeException(); }
  public  long memoryUsed ()  { throw new RuntimeException(); }
  public  scala.Option<org.apache.spark.executor.ExecutorMetrics> peakMemoryMetrics ()  { throw new RuntimeException(); }
  public  int rddBlocks ()  { throw new RuntimeException(); }
  public  scala.Option<java.lang.String> removeReason ()  { throw new RuntimeException(); }
  public  scala.Option<java.util.Date> removeTime ()  { throw new RuntimeException(); }
  public  int resourceProfileId ()  { throw new RuntimeException(); }
  public  scala.collection.immutable.Map<java.lang.String, org.apache.spark.resource.ResourceInformation> resources ()  { throw new RuntimeException(); }
  public  int totalCores ()  { throw new RuntimeException(); }
  public  long totalDuration ()  { throw new RuntimeException(); }
  public  long totalGCTime ()  { throw new RuntimeException(); }
  public  long totalInputBytes ()  { throw new RuntimeException(); }
  public  long totalShuffleRead ()  { throw new RuntimeException(); }
  public  long totalShuffleWrite ()  { throw new RuntimeException(); }
  public  int totalTasks ()  { throw new RuntimeException(); }
}
