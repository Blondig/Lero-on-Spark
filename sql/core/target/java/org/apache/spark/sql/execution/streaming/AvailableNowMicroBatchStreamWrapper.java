package org.apache.spark.sql.execution.streaming;
/**
 * This class wraps a {@link MicroBatchStream} and makes it supports Trigger.AvailableNow.
 * <p>
 * See {@link AvailableNowDataStreamWrapper} for more details.
 */
public  class AvailableNowMicroBatchStreamWrapper extends org.apache.spark.sql.execution.streaming.AvailableNowDataStreamWrapper implements org.apache.spark.sql.connector.read.streaming.MicroBatchStream {
  public   AvailableNowMicroBatchStreamWrapper (org.apache.spark.sql.connector.read.streaming.MicroBatchStream delegate)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.connector.read.PartitionReaderFactory createReaderFactory ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.connector.read.streaming.Offset latestOffset ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.connector.read.InputPartition[] planInputPartitions (org.apache.spark.sql.connector.read.streaming.Offset start, org.apache.spark.sql.connector.read.streaming.Offset end)  { throw new RuntimeException(); }
}
