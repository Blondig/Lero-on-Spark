package org.apache.spark.rdd;
public  class FakeOutputCommitter extends org.apache.hadoop.mapred.OutputCommitter {
  static public  boolean ran ()  { throw new RuntimeException(); }
  public   FakeOutputCommitter ()  { throw new RuntimeException(); }
  public  void setupJob (org.apache.hadoop.mapred.JobContext jobContext)  { throw new RuntimeException(); }
  public  boolean needsTaskCommit (org.apache.hadoop.mapred.TaskAttemptContext taskContext)  { throw new RuntimeException(); }
  public  void setupTask (org.apache.hadoop.mapred.TaskAttemptContext taskContext)  { throw new RuntimeException(); }
  public  void commitTask (org.apache.hadoop.mapred.TaskAttemptContext taskContext)  { throw new RuntimeException(); }
  public  void abortTask (org.apache.hadoop.mapred.TaskAttemptContext taskContext)  { throw new RuntimeException(); }
}
