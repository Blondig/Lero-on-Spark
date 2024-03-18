package org.apache.spark.internal.io;
/**
 * A helper class that reads Configuration from newer mapreduce API, creates output
 * Format/Committer/Writer.
 */
  class HadoopMapReduceWriteConfigUtil<K extends java.lang.Object, V extends java.lang.Object> extends org.apache.spark.internal.io.HadoopWriteConfigUtil<K, V> implements org.apache.spark.internal.Logging {
  public   HadoopMapReduceWriteConfigUtil (org.apache.spark.util.SerializableConfiguration conf, scala.reflect.ClassTag<V> evidence$4)  { throw new RuntimeException(); }
  public  void assertConf (org.apache.hadoop.mapreduce.JobContext jobContext, org.apache.spark.SparkConf conf)  { throw new RuntimeException(); }
  public  void closeWriter (org.apache.hadoop.mapreduce.TaskAttemptContext taskContext)  { throw new RuntimeException(); }
  public  org.apache.spark.internal.io.HadoopMapReduceCommitProtocol createCommitter (int jobId)  { throw new RuntimeException(); }
  public  org.apache.hadoop.mapreduce.JobContext createJobContext (java.lang.String jobTrackerId, int jobId)  { throw new RuntimeException(); }
  public  org.apache.hadoop.mapreduce.TaskAttemptContext createTaskAttemptContext (java.lang.String jobTrackerId, int jobId, int splitId, int taskAttemptId)  { throw new RuntimeException(); }
  public  void initOutputFormat (org.apache.hadoop.mapreduce.JobContext jobContext)  { throw new RuntimeException(); }
  public  void initWriter (org.apache.hadoop.mapreduce.TaskAttemptContext taskContext, int splitId)  { throw new RuntimeException(); }
  public  void write (scala.Tuple2<K, V> pair)  { throw new RuntimeException(); }
}
