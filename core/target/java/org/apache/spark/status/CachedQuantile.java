package org.apache.spark.status;
/**
 * A cached view of a specific quantile for one stage attempt's metrics.
 */
  class CachedQuantile {
  // not preceding
  public   CachedQuantile (int stageId, int stageAttemptId, java.lang.String quantile, long taskCount, double duration, double executorDeserializeTime, double executorDeserializeCpuTime, double executorRunTime, double executorCpuTime, double resultSize, double jvmGcTime, double resultSerializationTime, double gettingResultTime, double schedulerDelay, double peakExecutionMemory, double memoryBytesSpilled, double diskBytesSpilled, double bytesRead, double recordsRead, double bytesWritten, double recordsWritten, double shuffleReadBytes, double shuffleRecordsRead, double shuffleRemoteBlocksFetched, double shuffleLocalBlocksFetched, double shuffleFetchWaitTime, double shuffleRemoteBytesRead, double shuffleRemoteBytesReadToDisk, double shuffleTotalBlocksFetched, double shuffleWriteBytes, double shuffleWriteRecords, double shuffleWriteTime)  { throw new RuntimeException(); }
  public  double bytesRead ()  { throw new RuntimeException(); }
  public  double bytesWritten ()  { throw new RuntimeException(); }
  public  double diskBytesSpilled ()  { throw new RuntimeException(); }
  public  double duration ()  { throw new RuntimeException(); }
  public  double executorCpuTime ()  { throw new RuntimeException(); }
  public  double executorDeserializeCpuTime ()  { throw new RuntimeException(); }
  public  double executorDeserializeTime ()  { throw new RuntimeException(); }
  public  double executorRunTime ()  { throw new RuntimeException(); }
  public  double gettingResultTime ()  { throw new RuntimeException(); }
  public  java.lang.Object[] id ()  { throw new RuntimeException(); }
  public  double jvmGcTime ()  { throw new RuntimeException(); }
  public  double memoryBytesSpilled ()  { throw new RuntimeException(); }
  public  double peakExecutionMemory ()  { throw new RuntimeException(); }
  public  java.lang.String quantile ()  { throw new RuntimeException(); }
  public  double recordsRead ()  { throw new RuntimeException(); }
  public  double recordsWritten ()  { throw new RuntimeException(); }
  public  double resultSerializationTime ()  { throw new RuntimeException(); }
  public  double resultSize ()  { throw new RuntimeException(); }
  public  double schedulerDelay ()  { throw new RuntimeException(); }
  public  double shuffleFetchWaitTime ()  { throw new RuntimeException(); }
  public  double shuffleLocalBlocksFetched ()  { throw new RuntimeException(); }
  public  double shuffleReadBytes ()  { throw new RuntimeException(); }
  public  double shuffleRecordsRead ()  { throw new RuntimeException(); }
  public  double shuffleRemoteBlocksFetched ()  { throw new RuntimeException(); }
  public  double shuffleRemoteBytesRead ()  { throw new RuntimeException(); }
  public  double shuffleRemoteBytesReadToDisk ()  { throw new RuntimeException(); }
  public  double shuffleTotalBlocksFetched ()  { throw new RuntimeException(); }
  public  double shuffleWriteBytes ()  { throw new RuntimeException(); }
  public  double shuffleWriteRecords ()  { throw new RuntimeException(); }
  public  double shuffleWriteTime ()  { throw new RuntimeException(); }
  public  int[] stage ()  { throw new RuntimeException(); }
  public  int stageAttemptId ()  { throw new RuntimeException(); }
  public  int stageId ()  { throw new RuntimeException(); }
  public  long taskCount ()  { throw new RuntimeException(); }
}
