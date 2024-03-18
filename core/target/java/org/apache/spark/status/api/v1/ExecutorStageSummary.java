package org.apache.spark.status.api.v1;
public  class ExecutorStageSummary {
  // not preceding
     ExecutorStageSummary (long taskTime, int failedTasks, int succeededTasks, int killedTasks, long inputBytes, long inputRecords, long outputBytes, long outputRecords, long shuffleRead, long shuffleReadRecords, long shuffleWrite, long shuffleWriteRecords, long memoryBytesSpilled, long diskBytesSpilled, boolean isBlacklistedForStage, scala.Option<org.apache.spark.executor.ExecutorMetrics> peakMemoryMetrics, boolean isExcludedForStage)  { throw new RuntimeException(); }
  public  long diskBytesSpilled ()  { throw new RuntimeException(); }
  public  int failedTasks ()  { throw new RuntimeException(); }
  public  long inputBytes ()  { throw new RuntimeException(); }
  public  long inputRecords ()  { throw new RuntimeException(); }
  /**
   * @deprecated use isExcludedForStage instead. Since 3.1.0. 
  */
  public  boolean isBlacklistedForStage ()  { throw new RuntimeException(); }
  public  boolean isExcludedForStage ()  { throw new RuntimeException(); }
  public  int killedTasks ()  { throw new RuntimeException(); }
  public  long memoryBytesSpilled ()  { throw new RuntimeException(); }
  public  long outputBytes ()  { throw new RuntimeException(); }
  public  long outputRecords ()  { throw new RuntimeException(); }
  public  scala.Option<org.apache.spark.executor.ExecutorMetrics> peakMemoryMetrics ()  { throw new RuntimeException(); }
  public  long shuffleRead ()  { throw new RuntimeException(); }
  public  long shuffleReadRecords ()  { throw new RuntimeException(); }
  public  long shuffleWrite ()  { throw new RuntimeException(); }
  public  long shuffleWriteRecords ()  { throw new RuntimeException(); }
  public  int succeededTasks ()  { throw new RuntimeException(); }
  public  long taskTime ()  { throw new RuntimeException(); }
}
