package org.apache.spark.rdd;
public  class FakeOutputFormat implements org.apache.hadoop.mapred.OutputFormat<java.lang.Integer, java.lang.Integer> {
  public   FakeOutputFormat ()  { throw new RuntimeException(); }
  public  void checkOutputSpecs (org.apache.hadoop.fs.FileSystem ignored, org.apache.hadoop.mapred.JobConf job)  { throw new RuntimeException(); }
  public  org.apache.hadoop.mapred.RecordWriter<java.lang.Integer, java.lang.Integer> getRecordWriter (org.apache.hadoop.fs.FileSystem ignored, org.apache.hadoop.mapred.JobConf job, java.lang.String name, org.apache.hadoop.util.Progressable progress)  { throw new RuntimeException(); }
}
