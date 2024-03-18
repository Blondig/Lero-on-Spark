package org.apache.spark.metrics;
public  class OldCombineTextRecordReaderWrapper implements org.apache.hadoop.mapred.RecordReader<org.apache.hadoop.io.LongWritable, org.apache.hadoop.io.Text> {
  public   OldCombineTextRecordReaderWrapper (org.apache.hadoop.mapred.lib.CombineFileSplit split, org.apache.hadoop.conf.Configuration conf, org.apache.hadoop.mapred.Reporter reporter, java.lang.Integer idx)  { throw new RuntimeException(); }
  public  void close ()  { throw new RuntimeException(); }
  public  org.apache.hadoop.io.LongWritable createKey ()  { throw new RuntimeException(); }
  public  org.apache.hadoop.io.Text createValue ()  { throw new RuntimeException(); }
  public  org.apache.hadoop.mapred.LineRecordReader delegate ()  { throw new RuntimeException(); }
  public  org.apache.hadoop.mapred.FileSplit fileSplit ()  { throw new RuntimeException(); }
  public  long getPos ()  { throw new RuntimeException(); }
  public  float getProgress ()  { throw new RuntimeException(); }
  public  boolean next (org.apache.hadoop.io.LongWritable key, org.apache.hadoop.io.Text value)  { throw new RuntimeException(); }
}
