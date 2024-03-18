package org.apache.spark.internal.io;
/**
 * An {@link FileCommitProtocol} implementation backed by an underlying Hadoop OutputCommitter
 * (from the old mapred API).
 * <p>
 * Unlike Hadoop's OutputCommitter, this implementation is serializable.
 */
public  class HadoopMapRedCommitProtocol extends org.apache.spark.internal.io.HadoopMapReduceCommitProtocol {
  public   HadoopMapRedCommitProtocol (java.lang.String jobId, java.lang.String path)  { throw new RuntimeException(); }
  public  org.apache.hadoop.mapred.OutputCommitter setupCommitter (org.apache.hadoop.mapreduce.TaskAttemptContext context)  { throw new RuntimeException(); }
}
