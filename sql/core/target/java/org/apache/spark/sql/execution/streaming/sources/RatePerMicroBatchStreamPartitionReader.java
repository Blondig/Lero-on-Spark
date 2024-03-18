package org.apache.spark.sql.execution.streaming.sources;
public  class RatePerMicroBatchStreamPartitionReader implements org.apache.spark.sql.connector.read.PartitionReader<org.apache.spark.sql.catalyst.InternalRow> {
  public   RatePerMicroBatchStreamPartitionReader (int partitionId, int numPartitions, long startOffset, long startTimestamp, long endOffset)  { throw new RuntimeException(); }
  public  void close ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.InternalRow get ()  { throw new RuntimeException(); }
  public  boolean next ()  { throw new RuntimeException(); }
}
