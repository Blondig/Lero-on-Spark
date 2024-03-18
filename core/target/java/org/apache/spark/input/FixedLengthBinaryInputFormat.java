package org.apache.spark.input;
  class FixedLengthBinaryInputFormat extends org.apache.hadoop.mapreduce.lib.input.FileInputFormat<org.apache.hadoop.io.LongWritable, org.apache.hadoop.io.BytesWritable> implements org.apache.spark.internal.Logging {
  /** Property name to set in Hadoop JobConfs for record length */
  static public  java.lang.String RECORD_LENGTH_PROPERTY ()  { throw new RuntimeException(); }
  /** Retrieves the record length property from a Hadoop configuration */
  static public  int getRecordLength (org.apache.hadoop.mapreduce.JobContext context)  { throw new RuntimeException(); }
  public   FixedLengthBinaryInputFormat ()  { throw new RuntimeException(); }
  /**
   * Override of isSplitable to ensure initial computation of the record length
   * @param context (undocumented)
   * @param filename (undocumented)
   * @return (undocumented)
   */
  public  boolean isSplitable (org.apache.hadoop.mapreduce.JobContext context, org.apache.hadoop.fs.Path filename)  { throw new RuntimeException(); }
  /**
   * This input format overrides computeSplitSize() to make sure that each split
   * only contains full records. Each InputSplit passed to FixedLengthBinaryRecordReader
   * will start at the first byte of a record, and the last byte will the last byte of a record.
   * @param blockSize (undocumented)
   * @param minSize (undocumented)
   * @param maxSize (undocumented)
   * @return (undocumented)
   */
  public  long computeSplitSize (long blockSize, long minSize, long maxSize)  { throw new RuntimeException(); }
  /**
   * Create a FixedLengthBinaryRecordReader
   * @param split (undocumented)
   * @param context (undocumented)
   * @return (undocumented)
   */
  public  org.apache.hadoop.mapreduce.RecordReader<org.apache.hadoop.io.LongWritable, org.apache.hadoop.io.BytesWritable> createRecordReader (org.apache.hadoop.mapreduce.InputSplit split, org.apache.hadoop.mapreduce.TaskAttemptContext context)  { throw new RuntimeException(); }
}
