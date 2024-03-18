package org.apache.spark.status.api.v1;
public  class StageData {
  // not preceding
     StageData (org.apache.spark.status.api.v1.StageStatus status, int stageId, int attemptId, int numTasks, int numActiveTasks, int numCompleteTasks, int numFailedTasks, int numKilledTasks, int numCompletedIndices, scala.Option<java.util.Date> submissionTime, scala.Option<java.util.Date> firstTaskLaunchedTime, scala.Option<java.util.Date> completionTime, scala.Option<java.lang.String> failureReason, long executorDeserializeTime, long executorDeserializeCpuTime, long executorRunTime, long executorCpuTime, long resultSize, long jvmGcTime, long resultSerializationTime, long memoryBytesSpilled, long diskBytesSpilled, long peakExecutionMemory, long inputBytes, long inputRecords, long outputBytes, long outputRecords, long shuffleRemoteBlocksFetched, long shuffleLocalBlocksFetched, long shuffleFetchWaitTime, long shuffleRemoteBytesRead, long shuffleRemoteBytesReadToDisk, long shuffleLocalBytesRead, long shuffleReadBytes, long shuffleReadRecords, long shuffleWriteBytes, long shuffleWriteTime, long shuffleWriteRecords, java.lang.String name, scala.Option<java.lang.String> description, java.lang.String details, java.lang.String schedulingPool, scala.collection.Seq<java.lang.Object> rddIds, scala.collection.Seq<org.apache.spark.status.api.v1.AccumulableInfo> accumulatorUpdates, scala.Option<scala.collection.immutable.Map<java.lang.Object, org.apache.spark.status.api.v1.TaskData>> tasks, scala.Option<scala.collection.immutable.Map<java.lang.String, org.apache.spark.status.api.v1.ExecutorStageSummary>> executorSummary, scala.Option<org.apache.spark.status.api.v1.SpeculationStageSummary> speculationSummary, scala.collection.immutable.Map<java.lang.String, java.lang.Object> killedTasksSummary, int resourceProfileId, scala.Option<org.apache.spark.executor.ExecutorMetrics> peakExecutorMetrics, scala.Option<org.apache.spark.status.api.v1.TaskMetricDistributions> taskMetricsDistributions, scala.Option<org.apache.spark.status.api.v1.ExecutorMetricsDistributions> executorMetricsDistributions)  { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.status.api.v1.AccumulableInfo> accumulatorUpdates ()  { throw new RuntimeException(); }
  public  int attemptId ()  { throw new RuntimeException(); }
  public  scala.Option<java.util.Date> completionTime ()  { throw new RuntimeException(); }
  public  scala.Option<java.lang.String> description ()  { throw new RuntimeException(); }
  public  java.lang.String details ()  { throw new RuntimeException(); }
  public  long diskBytesSpilled ()  { throw new RuntimeException(); }
  public  long executorCpuTime ()  { throw new RuntimeException(); }
  public  long executorDeserializeCpuTime ()  { throw new RuntimeException(); }
  public  long executorDeserializeTime ()  { throw new RuntimeException(); }
  public  scala.Option<org.apache.spark.status.api.v1.ExecutorMetricsDistributions> executorMetricsDistributions ()  { throw new RuntimeException(); }
  public  long executorRunTime ()  { throw new RuntimeException(); }
  public  scala.Option<scala.collection.immutable.Map<java.lang.String, org.apache.spark.status.api.v1.ExecutorStageSummary>> executorSummary ()  { throw new RuntimeException(); }
  public  scala.Option<java.lang.String> failureReason ()  { throw new RuntimeException(); }
  public  scala.Option<java.util.Date> firstTaskLaunchedTime ()  { throw new RuntimeException(); }
  public  long inputBytes ()  { throw new RuntimeException(); }
  public  long inputRecords ()  { throw new RuntimeException(); }
  public  long jvmGcTime ()  { throw new RuntimeException(); }
  public  scala.collection.immutable.Map<java.lang.String, java.lang.Object> killedTasksSummary ()  { throw new RuntimeException(); }
  public  long memoryBytesSpilled ()  { throw new RuntimeException(); }
  public  java.lang.String name ()  { throw new RuntimeException(); }
  public  int numActiveTasks ()  { throw new RuntimeException(); }
  public  int numCompleteTasks ()  { throw new RuntimeException(); }
  public  int numCompletedIndices ()  { throw new RuntimeException(); }
  public  int numFailedTasks ()  { throw new RuntimeException(); }
  public  int numKilledTasks ()  { throw new RuntimeException(); }
  public  int numTasks ()  { throw new RuntimeException(); }
  public  long outputBytes ()  { throw new RuntimeException(); }
  public  long outputRecords ()  { throw new RuntimeException(); }
  public  long peakExecutionMemory ()  { throw new RuntimeException(); }
  public  scala.Option<org.apache.spark.executor.ExecutorMetrics> peakExecutorMetrics ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<java.lang.Object> rddIds ()  { throw new RuntimeException(); }
  public  int resourceProfileId ()  { throw new RuntimeException(); }
  public  long resultSerializationTime ()  { throw new RuntimeException(); }
  public  long resultSize ()  { throw new RuntimeException(); }
  public  java.lang.String schedulingPool ()  { throw new RuntimeException(); }
  public  long shuffleFetchWaitTime ()  { throw new RuntimeException(); }
  public  long shuffleLocalBlocksFetched ()  { throw new RuntimeException(); }
  public  long shuffleLocalBytesRead ()  { throw new RuntimeException(); }
  public  long shuffleReadBytes ()  { throw new RuntimeException(); }
  public  long shuffleReadRecords ()  { throw new RuntimeException(); }
  public  long shuffleRemoteBlocksFetched ()  { throw new RuntimeException(); }
  public  long shuffleRemoteBytesRead ()  { throw new RuntimeException(); }
  public  long shuffleRemoteBytesReadToDisk ()  { throw new RuntimeException(); }
  public  long shuffleWriteBytes ()  { throw new RuntimeException(); }
  public  long shuffleWriteRecords ()  { throw new RuntimeException(); }
  public  long shuffleWriteTime ()  { throw new RuntimeException(); }
  public  scala.Option<org.apache.spark.status.api.v1.SpeculationStageSummary> speculationSummary ()  { throw new RuntimeException(); }
  public  int stageId ()  { throw new RuntimeException(); }
  public  org.apache.spark.status.api.v1.StageStatus status ()  { throw new RuntimeException(); }
  public  scala.Option<java.util.Date> submissionTime ()  { throw new RuntimeException(); }
  public  scala.Option<org.apache.spark.status.api.v1.TaskMetricDistributions> taskMetricsDistributions ()  { throw new RuntimeException(); }
  public  scala.Option<scala.collection.immutable.Map<java.lang.Object, org.apache.spark.status.api.v1.TaskData>> tasks ()  { throw new RuntimeException(); }
}
