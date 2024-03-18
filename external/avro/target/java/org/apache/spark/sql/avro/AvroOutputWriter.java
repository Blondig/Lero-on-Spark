package org.apache.spark.sql.avro;
  class AvroOutputWriter extends org.apache.spark.sql.execution.datasources.OutputWriter {
  // not preceding
  public   AvroOutputWriter (java.lang.String path, org.apache.hadoop.mapreduce.TaskAttemptContext context, org.apache.spark.sql.types.StructType schema, boolean positionalFieldMatching, org.apache.avro.Schema avroSchema)  { throw new RuntimeException(); }
  public  void close ()  { throw new RuntimeException(); }
  public  java.lang.String path ()  { throw new RuntimeException(); }
  public  void write (org.apache.spark.sql.catalyst.InternalRow row)  { throw new RuntimeException(); }
}
