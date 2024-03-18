package org.apache.spark.status;
public  class LiveEntityHelpers {
  static public  scala.collection.Seq<org.apache.spark.status.api.v1.AccumulableInfo> newAccumulatorInfos (scala.collection.Iterable<org.apache.spark.scheduler.AccumulableInfo> accums)  { throw new RuntimeException(); }
  static public  org.apache.spark.status.api.v1.TaskMetrics createMetrics (long executorDeserializeTime, long executorDeserializeCpuTime, long executorRunTime, long executorCpuTime, long resultSize, long jvmGcTime, long resultSerializationTime, long memoryBytesSpilled, long diskBytesSpilled, long peakExecutionMemory, long inputBytesRead, long inputRecordsRead, long outputBytesWritten, long outputRecordsWritten, long shuffleRemoteBlocksFetched, long shuffleLocalBlocksFetched, long shuffleFetchWaitTime, long shuffleRemoteBytesRead, long shuffleRemoteBytesReadToDisk, long shuffleLocalBytesRead, long shuffleRecordsRead, long shuffleBytesWritten, long shuffleWriteTime, long shuffleRecordsWritten)  { throw new RuntimeException(); }
  static public  org.apache.spark.status.api.v1.TaskMetrics createMetrics (long default_)  { throw new RuntimeException(); }
  /** Add m2 values to m1. */
  static public  org.apache.spark.status.api.v1.TaskMetrics addMetrics (org.apache.spark.status.api.v1.TaskMetrics m1, org.apache.spark.status.api.v1.TaskMetrics m2)  { throw new RuntimeException(); }
  /** Subtract m2 values from m1. */
  static public  org.apache.spark.status.api.v1.TaskMetrics subtractMetrics (org.apache.spark.status.api.v1.TaskMetrics m1, org.apache.spark.status.api.v1.TaskMetrics m2)  { throw new RuntimeException(); }
  /**
   * Convert all the metric values to negative as well as handle zero values.
   * This method assumes that all the metric values are greater than or equal to zero
   * @param m (undocumented)
   * @return (undocumented)
   */
  static public  org.apache.spark.status.api.v1.TaskMetrics makeNegative (org.apache.spark.status.api.v1.TaskMetrics m)  { throw new RuntimeException(); }
}
