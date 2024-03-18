package org.apache.spark.internal.io;
/**
 * Interface for create output format/committer/writer used during saving an RDD using a Hadoop
 * OutputFormat (both from the old mapred API and the new mapreduce API)
 * <p>
 * Notes:
 * 1. Implementations should throw {@link IllegalArgumentException} when wrong hadoop API is
 *    referenced;
 * 2. Implementations must be serializable, as the instance instantiated on the driver
 *    will be used for tasks on executors;
 * 3. Implementations should have a constructor with exactly one argument:
 *    (conf: SerializableConfiguration) or (conf: SerializableJobConf).
 */
public abstract class HadoopWriteConfigUtil<K extends java.lang.Object, V extends java.lang.Object> implements scala.Serializable {
  // not preceding
  // TypeTree().setOriginal(TypeBoundsTree(TypeTree(), TypeTree()))
  // TypeTree().setOriginal(TypeBoundsTree(TypeTree(), TypeTree()))
  public   HadoopWriteConfigUtil (scala.reflect.ClassTag<V> evidence$1)  { throw new RuntimeException(); }
  public abstract  void assertConf (org.apache.hadoop.mapreduce.JobContext jobContext, org.apache.spark.SparkConf conf)  ;
  public abstract  void closeWriter (org.apache.hadoop.mapreduce.TaskAttemptContext taskContext)  ;
  public abstract  org.apache.spark.internal.io.HadoopMapReduceCommitProtocol createCommitter (int jobId)  ;
  public abstract  org.apache.hadoop.mapreduce.JobContext createJobContext (java.lang.String jobTrackerId, int jobId)  ;
  public abstract  org.apache.hadoop.mapreduce.TaskAttemptContext createTaskAttemptContext (java.lang.String jobTrackerId, int jobId, int splitId, int taskAttemptId)  ;
  public abstract  void initOutputFormat (org.apache.hadoop.mapreduce.JobContext jobContext)  ;
  public abstract  void initWriter (org.apache.hadoop.mapreduce.TaskAttemptContext taskContext, int splitId)  ;
  public abstract  void write (scala.Tuple2<K, V> pair)  ;
}
