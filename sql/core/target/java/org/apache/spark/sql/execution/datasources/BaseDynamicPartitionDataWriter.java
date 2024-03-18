package org.apache.spark.sql.execution.datasources;
/**
 * Holds common logic for writing data with dynamic partition writes, meaning it can write to
 * multiple directories (partitions) or files (bucketing).
 */
public abstract class BaseDynamicPartitionDataWriter extends org.apache.spark.sql.execution.datasources.FileFormatDataWriter {
  public   BaseDynamicPartitionDataWriter (org.apache.spark.sql.execution.datasources.WriteJobDescription description, org.apache.hadoop.mapreduce.TaskAttemptContext taskAttemptContext, org.apache.spark.internal.io.FileCommitProtocol committer, scala.collection.immutable.Map<java.lang.String, org.apache.spark.sql.execution.metric.SQLMetric> customMetrics)  { throw new RuntimeException(); }
  /**
   * File counter for writing current partition or bucket. For same partition or bucket,
   * we may have more than one file, due to number of records limit per file.
   * @return (undocumented)
   */
  protected  int fileCounter ()  { throw new RuntimeException(); }
  // not preceding
  protected  scala.Function1<org.apache.spark.sql.catalyst.InternalRow, java.lang.Object> getBucketId ()  { throw new RuntimeException(); }
  /** Returns the data columns to be written given an input row */
  protected  org.apache.spark.sql.catalyst.expressions.UnsafeProjection getOutputRow ()  { throw new RuntimeException(); }
  // not preceding
  protected  scala.Function1<org.apache.spark.sql.catalyst.InternalRow, org.apache.spark.sql.catalyst.expressions.UnsafeRow> getPartitionValues ()  { throw new RuntimeException(); }
  /** Flag saying whether or not the data to be written out is bucketed. */
  protected  boolean isBucketed ()  { throw new RuntimeException(); }
  /** Flag saying whether or not the data to be written out is partitioned. */
  protected  boolean isPartitioned ()  { throw new RuntimeException(); }
  /** Number of records in current file. */
  protected  long recordsInFile ()  { throw new RuntimeException(); }
  /**
   * Opens a new OutputWriter given a partition key and/or a bucket id.
   * If bucket id is specified, we will append it to the end of the file name, but before the
   * file extension, e.g. part-r-00009-ea518ad4-455a-4431-b471-d24e03814677-00002.gz.parquet
   * <p>
   * @param partitionValues the partition which all tuples being written by this OutputWriter
   *                        belong to
   * @param bucketId the bucket which all tuples being written by this OutputWriter belong to
   * @param closeCurrentWriter close and release resource for current writer
   */
  protected  void renewCurrentWriter (scala.Option<org.apache.spark.sql.catalyst.InternalRow> partitionValues, scala.Option<java.lang.Object> bucketId, boolean closeCurrentWriter)  { throw new RuntimeException(); }
  /**
   * Open a new output writer when number of records exceeding limit.
   * <p>
   * @param partitionValues the partition which all tuples being written by this <code>OutputWriter</code>
   *                        belong to
   * @param bucketId the bucket which all tuples being written by this <code>OutputWriter</code> belong to
   */
  protected  void renewCurrentWriterIfTooManyRecords (scala.Option<org.apache.spark.sql.catalyst.InternalRow> partitionValues, scala.Option<java.lang.Object> bucketId)  { throw new RuntimeException(); }
  /**
   * Writes the given record with current writer.
   * <p>
   * @param record The record to write
   */
  protected  void writeRecord (org.apache.spark.sql.catalyst.InternalRow record)  { throw new RuntimeException(); }
}
