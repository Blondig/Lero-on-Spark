package org.apache.spark.metrics;
/**
 * Hadoop 2 has a version of this, but we can't use it for backwards compatibility
 */
public  class OldCombineTextInputFormat extends org.apache.hadoop.mapred.lib.CombineFileInputFormat<org.apache.hadoop.io.LongWritable, org.apache.hadoop.io.Text> {
  public   OldCombineTextInputFormat ()  { throw new RuntimeException(); }
  public  org.apache.hadoop.mapred.RecordReader<org.apache.hadoop.io.LongWritable, org.apache.hadoop.io.Text> getRecordReader (org.apache.hadoop.mapred.InputSplit split, org.apache.hadoop.mapred.JobConf conf, org.apache.hadoop.mapred.Reporter reporter)  { throw new RuntimeException(); }
}
