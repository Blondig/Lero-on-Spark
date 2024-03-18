package org.apache.spark.rdd;
public  class NewFakeFormat extends org.apache.hadoop.mapreduce.OutputFormat<java.lang.Integer, java.lang.Integer> {
  public   NewFakeFormat ()  { throw new RuntimeException(); }
  public  void checkOutputSpecs (org.apache.hadoop.mapreduce.JobContext p1)  { throw new RuntimeException(); }
  public  org.apache.hadoop.mapreduce.OutputCommitter getOutputCommitter (org.apache.hadoop.mapreduce.TaskAttemptContext p1)  { throw new RuntimeException(); }
  public  org.apache.hadoop.mapreduce.RecordWriter<java.lang.Integer, java.lang.Integer> getRecordWriter (org.apache.hadoop.mapreduce.TaskAttemptContext p1)  { throw new RuntimeException(); }
}
