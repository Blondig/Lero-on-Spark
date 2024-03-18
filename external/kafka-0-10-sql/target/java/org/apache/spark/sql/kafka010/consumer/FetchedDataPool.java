package org.apache.spark.sql.kafka010.consumer;
/**
 * Provides object pool for {@link FetchedData} which is grouped by {@link CacheKey}.
 * <p>
 * Along with CacheKey, it receives desired start offset to find cached FetchedData which
 * may be stored from previous batch. If it can't find one to match, it will create
 * a new FetchedData. As "desired start offset" plays as second level of key which can be
 * modified in same instance, this class cannot be replaced with general pool implementations
 * including Apache Commons Pool which pools KafkaConsumer.
 */
  class FetchedDataPool implements org.apache.spark.internal.Logging {
  static   class CachedFetchedData implements scala.Product, scala.Serializable {
    // not preceding
    public   CachedFetchedData (org.apache.spark.sql.kafka010.consumer.FetchedData fetchedData)  { throw new RuntimeException(); }
    public  org.apache.spark.sql.kafka010.consumer.FetchedData fetchedData ()  { throw new RuntimeException(); }
    public  org.apache.spark.sql.kafka010.consumer.FetchedData getObject ()  { throw new RuntimeException(); }
    public  boolean inUse ()  { throw new RuntimeException(); }
    public  long lastAcquiredTimestamp ()  { throw new RuntimeException(); }
    public  long lastReleasedTimestamp ()  { throw new RuntimeException(); }
  }
  public   FetchedDataPool (java.util.concurrent.ScheduledExecutorService executorService, org.apache.spark.util.Clock clock, org.apache.spark.SparkConf conf)  { throw new RuntimeException(); }
  public   FetchedDataPool (org.apache.spark.SparkConf sparkConf)  { throw new RuntimeException(); }
  public  long numCreated ()  { throw new RuntimeException(); }
  public  long numTotal ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.kafka010.consumer.FetchedData acquire (org.apache.spark.sql.kafka010.consumer.KafkaDataConsumer.CacheKey key, long desiredStartOffset)  { throw new RuntimeException(); }
  public  void invalidate (org.apache.spark.sql.kafka010.consumer.KafkaDataConsumer.CacheKey key)  { throw new RuntimeException(); }
  public  void release (org.apache.spark.sql.kafka010.consumer.KafkaDataConsumer.CacheKey key, org.apache.spark.sql.kafka010.consumer.FetchedData fetchedData)  { throw new RuntimeException(); }
  public  void shutdown ()  { throw new RuntimeException(); }
  public  void reset ()  { throw new RuntimeException(); }
}
