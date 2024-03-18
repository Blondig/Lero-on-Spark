package org.apache.spark.rdd;
public  class YetAnotherFakeFormat extends org.apache.hadoop.mapreduce.OutputFormat<java.lang.Integer, java.lang.Integer> {
  public   YetAnotherFakeFormat ()  { throw new RuntimeException(); }
  public  void checkOutputSpecs (org.apache.hadoop.mapreduce.JobContext j)  { throw new RuntimeException(); }
  public  org.apache.hadoop.mapreduce.OutputCommitter getOutputCommitter (org.apache.hadoop.mapreduce.TaskAttemptContext t)  { throw new RuntimeException(); }
  public  org.apache.hadoop.mapreduce.RecordWriter<java.lang.Integer, java.lang.Integer> getRecordWriter (org.apache.hadoop.mapreduce.TaskAttemptContext t)  { throw new RuntimeException(); }
}
