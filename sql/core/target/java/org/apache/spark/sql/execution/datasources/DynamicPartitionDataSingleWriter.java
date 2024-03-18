package org.apache.spark.sql.execution.datasources;
/**
 * Dynamic partition writer with single writer, meaning only one writer is opened at any time for
 * writing. The records to be written are required to be sorted on partition and/or bucket
 * column(s) before writing.
 */
public  class DynamicPartitionDataSingleWriter extends org.apache.spark.sql.execution.datasources.BaseDynamicPartitionDataWriter {
  public   DynamicPartitionDataSingleWriter (org.apache.spark.sql.execution.datasources.WriteJobDescription description, org.apache.hadoop.mapreduce.TaskAttemptContext taskAttemptContext, org.apache.spark.internal.io.FileCommitProtocol committer, scala.collection.immutable.Map<java.lang.String, org.apache.spark.sql.execution.metric.SQLMetric> customMetrics)  { throw new RuntimeException(); }
  public  void write (org.apache.spark.sql.catalyst.InternalRow record)  { throw new RuntimeException(); }
}
