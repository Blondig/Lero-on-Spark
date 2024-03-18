package org.apache.spark.internal.io;
/**
 * An {@link FileCommitProtocol} implementation backed by an underlying Hadoop OutputCommitter
 * (from the newer mapreduce API, not the old mapred API).
 * <p>
 * Unlike Hadoop's OutputCommitter, this implementation is serializable.
 * <p>
 * param:  jobId the job's or stage's id
 * param:  path the job's output path, or null if committer acts as a noop
 * param:  dynamicPartitionOverwrite If true, Spark will overwrite partition directories at runtime
 *                                  dynamically. Suppose final path is /path/to/outputPath, output
 *                                  path of {@link FileOutputCommitter} is an intermediate path, e.g.
 *                                  /path/to/outputPath/.spark-staging-{jobId}, which is a staging
 *                                  directory. Task attempts firstly write files under the
 *                                  intermediate path, e.g.
 *                                  /path/to/outputPath/.spark-staging-{jobId}/_temporary/
 *                                  {appAttemptId}/_temporary/{taskAttemptId}/a=1/b=1/xxx.parquet.
 * <p>
 *                                  1. When {@link FileOutputCommitter} algorithm version set to 1,
 *                                  we firstly move task attempt output files to
 *                                  /path/to/outputPath/.spark-staging-{jobId}/_temporary/
 *                                  {appAttemptId}/{taskId}/a=1/b=1,
 *                                  then move them to
 *                                  /path/to/outputPath/.spark-staging-{jobId}/a=1/b=1.
 *                                  2. When {@link FileOutputCommitter} algorithm version set to 2,
 *                                  committing tasks directly move task attempt output files to
 *                                  /path/to/outputPath/.spark-staging-{jobId}/a=1/b=1.
 * <p>
 *                                  At the end of committing job, we move output files from
 *                                  intermediate path to final path, e.g., move files from
 *                                  /path/to/outputPath/.spark-staging-{jobId}/a=1/b=1
 *                                  to /path/to/outputPath/a=1/b=1
 */
public  class HadoopMapReduceCommitProtocol extends org.apache.spark.internal.io.FileCommitProtocol implements scala.Serializable, org.apache.spark.internal.Logging {
  public   HadoopMapReduceCommitProtocol (java.lang.String jobId, java.lang.String path, boolean dynamicPartitionOverwrite)  { throw new RuntimeException(); }
  // not preceding
  protected  org.apache.hadoop.fs.Path stagingDir ()  { throw new RuntimeException(); }
  protected  org.apache.hadoop.mapreduce.OutputCommitter setupCommitter (org.apache.hadoop.mapreduce.TaskAttemptContext context)  { throw new RuntimeException(); }
  public  java.lang.String newTaskTempFile (org.apache.hadoop.mapreduce.TaskAttemptContext taskContext, scala.Option<java.lang.String> dir, java.lang.String ext)  { throw new RuntimeException(); }
  public  java.lang.String newTaskTempFile (org.apache.hadoop.mapreduce.TaskAttemptContext taskContext, scala.Option<java.lang.String> dir, org.apache.spark.internal.io.FileNameSpec spec)  { throw new RuntimeException(); }
  public  java.lang.String newTaskTempFileAbsPath (org.apache.hadoop.mapreduce.TaskAttemptContext taskContext, java.lang.String absoluteDir, java.lang.String ext)  { throw new RuntimeException(); }
  public  java.lang.String newTaskTempFileAbsPath (org.apache.hadoop.mapreduce.TaskAttemptContext taskContext, java.lang.String absoluteDir, org.apache.spark.internal.io.FileNameSpec spec)  { throw new RuntimeException(); }
  protected  java.lang.String getFilename (org.apache.hadoop.mapreduce.TaskAttemptContext taskContext, org.apache.spark.internal.io.FileNameSpec spec)  { throw new RuntimeException(); }
  public  void setupJob (org.apache.hadoop.mapreduce.JobContext jobContext)  { throw new RuntimeException(); }
  public  void commitJob (org.apache.hadoop.mapreduce.JobContext jobContext, scala.collection.Seq<org.apache.spark.internal.io.FileCommitProtocol.TaskCommitMessage> taskCommits)  { throw new RuntimeException(); }
  /**
   * Abort the job; log and ignore any IO exception thrown.
   * This is invariably invoked in an exception handler; raising
   * an exception here will lose the root cause of the failure.
   * <p>
   * @param jobContext job context
   */
  public  void abortJob (org.apache.hadoop.mapreduce.JobContext jobContext)  { throw new RuntimeException(); }
  public  void setupTask (org.apache.hadoop.mapreduce.TaskAttemptContext taskContext)  { throw new RuntimeException(); }
  public  org.apache.spark.internal.io.FileCommitProtocol.TaskCommitMessage commitTask (org.apache.hadoop.mapreduce.TaskAttemptContext taskContext)  { throw new RuntimeException(); }
  /**
   * Abort the task; log and ignore any failure thrown.
   * This is invariably invoked in an exception handler; raising
   * an exception here will lose the root cause of the failure.
   * <p>
   * @param taskContext context
   */
  public  void abortTask (org.apache.hadoop.mapreduce.TaskAttemptContext taskContext)  { throw new RuntimeException(); }
}
