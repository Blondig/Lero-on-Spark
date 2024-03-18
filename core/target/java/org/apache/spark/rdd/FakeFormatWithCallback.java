package org.apache.spark.rdd;
public  class FakeFormatWithCallback extends org.apache.spark.rdd.FakeOutputFormat {
  public   FakeFormatWithCallback ()  { throw new RuntimeException(); }
  public  org.apache.hadoop.mapred.RecordWriter<java.lang.Integer, java.lang.Integer> getRecordWriter (org.apache.hadoop.fs.FileSystem ignored, org.apache.hadoop.mapred.JobConf job, java.lang.String name, org.apache.hadoop.util.Progressable progress)  { throw new RuntimeException(); }
}
