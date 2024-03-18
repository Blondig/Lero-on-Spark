package org.apache.spark.status;
/**
 * Unlike other data types, the task data wrapper does not keep a reference to the API's TaskData.
 * That is to save memory, since for large applications there can be a large number of these
 * elements (by default up to 100,000 per stage), and every bit of wasted memory adds up.
 * <p>
 * It also contains many secondary indices, which are used to sort data efficiently in the UI at the
 * expense of storage space (and slower write times).
 */
  class TaskDataWrapper {
  public  java.lang.Long taskId ()  { throw new RuntimeException(); }
  public  int index ()  { throw new RuntimeException(); }
  public  int attempt ()  { throw new RuntimeException(); }
  public  int partitionId ()  { throw new RuntimeException(); }
  public  long launchTime ()  { throw new RuntimeException(); }
  public  long resultFetchStart ()  { throw new RuntimeException(); }
  public  long duration ()  { throw new RuntimeException(); }
  public  java.lang.String executorId ()  { throw new RuntimeException(); }
  public  java.lang.String host ()  { throw new RuntimeException(); }
  public  java.lang.String status ()  { throw new RuntimeException(); }
  public  java.lang.String taskLocality ()  { throw new RuntimeException(); }
  public  boolean speculative ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.status.api.v1.AccumulableInfo> accumulatorUpdates ()  { throw new RuntimeException(); }
  public  scala.Option<java.lang.String> errorMessage ()  { throw new RuntimeException(); }
  public  boolean hasMetrics ()  { throw new RuntimeException(); }
  public  long executorDeserializeTime ()  { throw new RuntimeException(); }
  public  long executorDeserializeCpuTime ()  { throw new RuntimeException(); }
  public  long executorRunTime ()  { throw new RuntimeException(); }
  public  long executorCpuTime ()  { throw new RuntimeException(); }
  public  long resultSize ()  { throw new RuntimeException(); }
  public  long jvmGcTime ()  { throw new RuntimeException(); }
  public  long resultSerializationTime ()  { throw new RuntimeException(); }
  public  long memoryBytesSpilled ()  { throw new RuntimeException(); }
  public  long diskBytesSpilled ()  { throw new RuntimeException(); }
  public  long peakExecutionMemory ()  { throw new RuntimeException(); }
  public  long inputBytesRead ()  { throw new RuntimeException(); }
  public  long inputRecordsRead ()  { throw new RuntimeException(); }
  public  long outputBytesWritten ()  { throw new RuntimeException(); }
  public  long outputRecordsWritten ()  { throw new RuntimeException(); }
  public  long shuffleRemoteBlocksFetched ()  { throw new RuntimeException(); }
  public  long shuffleLocalBlocksFetched ()  { throw new RuntimeException(); }
  public  long shuffleFetchWaitTime ()  { throw new RuntimeException(); }
  public  long shuffleRemoteBytesRead ()  { throw new RuntimeException(); }
  public  long shuffleRemoteBytesReadToDisk ()  { throw new RuntimeException(); }
  public  long shuffleLocalBytesRead ()  { throw new RuntimeException(); }
  public  long shuffleRecordsRead ()  { throw new RuntimeException(); }
  public  long shuffleBytesWritten ()  { throw new RuntimeException(); }
  public  long shuffleWriteTime ()  { throw new RuntimeException(); }
  public  long shuffleRecordsWritten ()  { throw new RuntimeException(); }
  public  int stageId ()  { throw new RuntimeException(); }
  public  int stageAttemptId ()  { throw new RuntimeException(); }
  // not preceding
  public   TaskDataWrapper (java.lang.Long taskId, int index, int attempt, int partitionId, long launchTime, long resultFetchStart, long duration, java.lang.String executorId, java.lang.String host, java.lang.String status, java.lang.String taskLocality, boolean speculative, scala.collection.Seq<org.apache.spark.status.api.v1.AccumulableInfo> accumulatorUpdates, scala.Option<java.lang.String> errorMessage, boolean hasMetrics, long executorDeserializeTime, long executorDeserializeCpuTime, long executorRunTime, long executorCpuTime, long resultSize, long jvmGcTime, long resultSerializationTime, long memoryBytesSpilled, long diskBytesSpilled, long peakExecutionMemory, long inputBytesRead, long inputRecordsRead, long outputBytesWritten, long outputRecordsWritten, long shuffleRemoteBlocksFetched, long shuffleLocalBlocksFetched, long shuffleFetchWaitTime, long shuffleRemoteBytesRead, long shuffleRemoteBytesReadToDisk, long shuffleLocalBytesRead, long shuffleRecordsRead, long shuffleBytesWritten, long shuffleWriteTime, long shuffleRecordsWritten, int stageId, int stageAttemptId)  { throw new RuntimeException(); }
  public  org.apache.spark.status.api.v1.TaskData toApi ()  { throw new RuntimeException(); }
  public  long schedulerDelay ()  { throw new RuntimeException(); }
  public  long gettingResultTime ()  { throw new RuntimeException(); }
}
