package org.apache.spark.rdd;
public  class NewFakeCommitter extends org.apache.hadoop.mapreduce.OutputCommitter {
  public   NewFakeCommitter ()  { throw new RuntimeException(); }
  public  void abortTask (org.apache.hadoop.mapreduce.TaskAttemptContext p1)  { throw new RuntimeException(); }
  public  void commitTask (org.apache.hadoop.mapreduce.TaskAttemptContext p1)  { throw new RuntimeException(); }
  public  boolean needsTaskCommit (org.apache.hadoop.mapreduce.TaskAttemptContext p1)  { throw new RuntimeException(); }
  public  void setupJob (org.apache.hadoop.mapreduce.JobContext p1)  { throw new RuntimeException(); }
  public  void setupTask (org.apache.hadoop.mapreduce.TaskAttemptContext p1)  { throw new RuntimeException(); }
}
