package org.apache.spark.executor;
/**
 * :: DeveloperApi ::
 * A collection of accumulators that represent metrics about writing shuffle data.
 * Operations are not thread-safe.
 */
public  class ShuffleWriteMetrics implements org.apache.spark.shuffle.ShuffleWriteMetricsReporter, scala.Serializable {
     ShuffleWriteMetrics ()  { throw new RuntimeException(); }
    org.apache.spark.util.LongAccumulator _bytesWritten ()  { throw new RuntimeException(); }
    org.apache.spark.util.LongAccumulator _recordsWritten ()  { throw new RuntimeException(); }
    org.apache.spark.util.LongAccumulator _writeTime ()  { throw new RuntimeException(); }
  /**
   * Number of bytes written for the shuffle by this task.
   * @return (undocumented)
   */
  public  long bytesWritten ()  { throw new RuntimeException(); }
    void decBytesWritten (long v)  { throw new RuntimeException(); }
    void decRecordsWritten (long v)  { throw new RuntimeException(); }
    void incBytesWritten (long v)  { throw new RuntimeException(); }
    void incRecordsWritten (long v)  { throw new RuntimeException(); }
    void incWriteTime (long v)  { throw new RuntimeException(); }
  /**
   * Total number of records written to the shuffle by this task.
   * @return (undocumented)
   */
  public  long recordsWritten ()  { throw new RuntimeException(); }
  /**
   * Time the task spent blocking on writes to disk or buffer cache, in nanoseconds.
   * @return (undocumented)
   */
  public  long writeTime ()  { throw new RuntimeException(); }
}
