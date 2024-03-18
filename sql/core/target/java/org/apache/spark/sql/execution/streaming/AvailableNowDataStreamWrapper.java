package org.apache.spark.sql.execution.streaming;
/**
 * This class wraps a {@link SparkDataStream} and makes it support Trigger.AvailableNow, by overriding
 * its {@link latestOffset} method to always return the latest offset at the beginning of the query.
 */
public  class AvailableNowDataStreamWrapper implements org.apache.spark.sql.connector.read.streaming.SparkDataStream, org.apache.spark.sql.connector.read.streaming.SupportsTriggerAvailableNow, org.apache.spark.internal.Logging {
  // not preceding
  public   AvailableNowDataStreamWrapper (org.apache.spark.sql.connector.read.streaming.SparkDataStream delegate)  { throw new RuntimeException(); }
  public  void commit (org.apache.spark.sql.connector.read.streaming.Offset end)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.connector.read.streaming.SparkDataStream delegate ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.connector.read.streaming.Offset deserializeOffset (java.lang.String json)  { throw new RuntimeException(); }
  /**
   * Always return {@link ReadLimit.allAvailable}
   * @return (undocumented)
   */
  public  org.apache.spark.sql.connector.read.streaming.ReadLimit getDefaultReadLimit ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.connector.read.streaming.Offset initialOffset ()  { throw new RuntimeException(); }
  /**
   * Return the latest offset pre-fetched in {@link prepareForTriggerAvailableNow}.
   * @param startOffset (undocumented)
   * @param limit (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.connector.read.streaming.Offset latestOffset (org.apache.spark.sql.connector.read.streaming.Offset startOffset, org.apache.spark.sql.connector.read.streaming.ReadLimit limit)  { throw new RuntimeException(); }
  /**
   * Fetch and store the latest offset for all available data at the beginning of the query.
   */
  public  void prepareForTriggerAvailableNow ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.connector.read.streaming.Offset reportLatestOffset ()  { throw new RuntimeException(); }
  public  void stop ()  { throw new RuntimeException(); }
}
