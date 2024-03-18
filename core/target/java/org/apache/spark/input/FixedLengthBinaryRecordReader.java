package org.apache.spark.input;
/**
 * FixedLengthBinaryRecordReader is returned by FixedLengthBinaryInputFormat.
 * It uses the record length set in FixedLengthBinaryInputFormat to
 * read one record at a time from the given InputSplit.
 * <p>
 * Each call to nextKeyValue() updates the LongWritable key and BytesWritable value.
 * <p>
 * key = record index (Long)
 * value = the record itself (BytesWritable)
 */
  class FixedLengthBinaryRecordReader extends org.apache.hadoop.mapreduce.RecordReader<org.apache.hadoop.io.LongWritable, org.apache.hadoop.io.BytesWritable> {
  public   FixedLengthBinaryRecordReader ()  { throw new RuntimeException(); }
  public  void close ()  { throw new RuntimeException(); }
  public  org.apache.hadoop.io.LongWritable getCurrentKey ()  { throw new RuntimeException(); }
  public  org.apache.hadoop.io.BytesWritable getCurrentValue ()  { throw new RuntimeException(); }
  public  float getProgress ()  { throw new RuntimeException(); }
  public  void initialize (org.apache.hadoop.mapreduce.InputSplit inputSplit, org.apache.hadoop.mapreduce.TaskAttemptContext context)  { throw new RuntimeException(); }
  public  boolean nextKeyValue ()  { throw new RuntimeException(); }
}
