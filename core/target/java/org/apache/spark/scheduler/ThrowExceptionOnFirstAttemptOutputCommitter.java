package org.apache.spark.scheduler;
public  class ThrowExceptionOnFirstAttemptOutputCommitter extends org.apache.hadoop.mapred.FileOutputCommitter {
  public   ThrowExceptionOnFirstAttemptOutputCommitter ()  { throw new RuntimeException(); }
  public  void commitTask (org.apache.hadoop.mapred.TaskAttemptContext context)  { throw new RuntimeException(); }
}
