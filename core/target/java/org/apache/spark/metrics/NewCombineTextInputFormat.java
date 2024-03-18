package org.apache.spark.metrics;
/**
 * Hadoop 2 has a version of this, but we can't use it for backwards compatibility
 */
public  class NewCombineTextInputFormat extends org.apache.hadoop.mapreduce.lib.input.CombineFileInputFormat<org.apache.hadoop.io.LongWritable, org.apache.hadoop.io.Text> {
  public   NewCombineTextInputFormat ()  { throw new RuntimeException(); }
  public  org.apache.hadoop.mapreduce.RecordReader<org.apache.hadoop.io.LongWritable, org.apache.hadoop.io.Text> createRecordReader (org.apache.hadoop.mapreduce.InputSplit split, org.apache.hadoop.mapreduce.TaskAttemptContext context)  { throw new RuntimeException(); }
}
