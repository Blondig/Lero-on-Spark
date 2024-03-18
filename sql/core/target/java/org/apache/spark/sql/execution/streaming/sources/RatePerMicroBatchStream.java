package org.apache.spark.sql.execution.streaming.sources;
public  class RatePerMicroBatchStream implements org.apache.spark.sql.connector.read.streaming.SupportsTriggerAvailableNow, org.apache.spark.sql.connector.read.streaming.MicroBatchStream, org.apache.spark.internal.Logging {
  public   RatePerMicroBatchStream (long rowsPerBatch, int numPartitions, long startTimestamp, int advanceMsPerBatch, org.apache.spark.sql.util.CaseInsensitiveStringMap options)  { throw new RuntimeException(); }
  public  void commit (org.apache.spark.sql.connector.read.streaming.Offset end)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.connector.read.PartitionReaderFactory createReaderFactory ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.connector.read.streaming.Offset deserializeOffset (java.lang.String json)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.connector.read.streaming.ReadLimit getDefaultReadLimit ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.connector.read.streaming.Offset initialOffset ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.connector.read.streaming.Offset latestOffset ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.connector.read.streaming.Offset latestOffset (org.apache.spark.sql.connector.read.streaming.Offset startOffset, org.apache.spark.sql.connector.read.streaming.ReadLimit limit)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.connector.read.InputPartition[] planInputPartitions (org.apache.spark.sql.connector.read.streaming.Offset start, org.apache.spark.sql.connector.read.streaming.Offset end)  { throw new RuntimeException(); }
  public  void prepareForTriggerAvailableNow ()  { throw new RuntimeException(); }
  public  void stop ()  { throw new RuntimeException(); }
  public  java.lang.String toString ()  { throw new RuntimeException(); }
}
