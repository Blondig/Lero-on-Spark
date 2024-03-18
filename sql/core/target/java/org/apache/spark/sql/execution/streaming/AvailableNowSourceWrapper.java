package org.apache.spark.sql.execution.streaming;
/**
 * This class wraps a {@link Source} and makes it supports Trigger.AvailableNow.
 * <p>
 * See {@link AvailableNowDataStreamWrapper} for more details.
 */
public  class AvailableNowSourceWrapper extends org.apache.spark.sql.execution.streaming.AvailableNowDataStreamWrapper implements org.apache.spark.sql.execution.streaming.Source {
  public   AvailableNowSourceWrapper (org.apache.spark.sql.execution.streaming.Source delegate)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> getBatch (scala.Option<org.apache.spark.sql.execution.streaming.Offset> start, org.apache.spark.sql.execution.streaming.Offset end)  { throw new RuntimeException(); }
  public  scala.Option<org.apache.spark.sql.execution.streaming.Offset> getOffset ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.types.StructType schema ()  { throw new RuntimeException(); }
}
