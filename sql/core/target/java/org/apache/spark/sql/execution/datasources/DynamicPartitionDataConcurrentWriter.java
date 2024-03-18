package org.apache.spark.sql.execution.datasources;
/**
 * Dynamic partition writer with concurrent writers, meaning multiple concurrent writers are opened
 * for writing.
 * <p>
 * The process has the following steps:
 *  - Step 1: Maintain a map of output writers per each partition and/or bucket columns. Keep all
 *            writers opened and write rows one by one.
 *  - Step 2: If number of concurrent writers exceeds limit, sort rest of rows on partition and/or
 *            bucket column(s). Write rows one by one, and eagerly close the writer when finishing
 *            each partition and/or bucket.
 * <p>
 * Caller is expected to call <code>writeWithIterator()</code> instead of <code>write()</code> to write records.
 */
public  class DynamicPartitionDataConcurrentWriter extends org.apache.spark.sql.execution.datasources.BaseDynamicPartitionDataWriter implements org.apache.spark.internal.Logging {
  public   DynamicPartitionDataConcurrentWriter (org.apache.spark.sql.execution.datasources.WriteJobDescription description, org.apache.hadoop.mapreduce.TaskAttemptContext taskAttemptContext, org.apache.spark.internal.io.FileCommitProtocol committer, org.apache.spark.sql.execution.datasources.FileFormatWriter.ConcurrentOutputWriterSpec concurrentOutputWriterSpec, scala.collection.immutable.Map<java.lang.String, org.apache.spark.sql.execution.metric.SQLMetric> customMetrics)  { throw new RuntimeException(); }
  /**
   * Release resources for all concurrent output writers.
   */
  protected  void releaseResources ()  { throw new RuntimeException(); }
  public  void write (org.apache.spark.sql.catalyst.InternalRow record)  { throw new RuntimeException(); }
  /**
   * Write iterator of records with concurrent writers.
   * @param iterator (undocumented)
   */
  public  void writeWithIterator (scala.collection.Iterator<org.apache.spark.sql.catalyst.InternalRow> iterator)  { throw new RuntimeException(); }
}
