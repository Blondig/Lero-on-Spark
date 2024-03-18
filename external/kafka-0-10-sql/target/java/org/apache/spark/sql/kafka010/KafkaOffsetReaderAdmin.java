package org.apache.spark.sql.kafka010;
/**
 * This class uses Kafka's own {@link Admin} API to read data offsets from Kafka.
 * The {@link ConsumerStrategy} class defines which Kafka topics and partitions should be read
 * by this source. These strategies directly correspond to the different consumption options
 * in. This class is designed to return a configured {@link Admin} that is used by the
 * {@link KafkaSource} to query for the offsets. See the docs on
 * {@link org.apache.spark.sql.kafka010.ConsumerStrategy}
 * for more details.
 * <p>
 * Note: This class is not ThreadSafe
 */
  class KafkaOffsetReaderAdmin implements org.apache.spark.sql.kafka010.KafkaOffsetReader, org.apache.spark.internal.Logging {
  // not preceding
  public   KafkaOffsetReaderAdmin (org.apache.spark.sql.kafka010.ConsumerStrategy consumerStrategy, java.util.Map<java.lang.String, java.lang.Object> driverKafkaParams, org.apache.spark.sql.catalyst.util.CaseInsensitiveMap<java.lang.String> readerOptions, java.lang.String driverGroupIdPrefix)  { throw new RuntimeException(); }
  /**
   * An AdminClient used in the driver to query the latest Kafka offsets.
   * This only queries the offsets because AdminClient has no functionality to commit offsets like
   * KafkaConsumer.
   * @return (undocumented)
   */
  protected  org.apache.kafka.clients.admin.Admin _admin ()  { throw new RuntimeException(); }
  protected  org.apache.kafka.clients.admin.Admin admin ()  { throw new RuntimeException(); }
  public  void close ()  { throw new RuntimeException(); }
  public  java.util.Map<java.lang.String, java.lang.Object> driverKafkaParams ()  { throw new RuntimeException(); }
  public  scala.collection.immutable.Map<org.apache.kafka.common.TopicPartition, java.lang.Object> fetchEarliestOffsets ()  { throw new RuntimeException(); }
  public  scala.collection.immutable.Map<org.apache.kafka.common.TopicPartition, java.lang.Object> fetchEarliestOffsets (scala.collection.Seq<org.apache.kafka.common.TopicPartition> newPartitions)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.kafka010.KafkaSourceOffset fetchGlobalTimestampBasedOffsets (long timestamp, boolean isStartingOffsets, scala.Enumeration.Value strategyOnNoMatchStartingOffset)  { throw new RuntimeException(); }
  public  scala.collection.immutable.Map<org.apache.kafka.common.TopicPartition, java.lang.Object> fetchLatestOffsets (scala.Option<scala.collection.immutable.Map<org.apache.kafka.common.TopicPartition, java.lang.Object>> knownOffsets)  { throw new RuntimeException(); }
  public  scala.collection.immutable.Map<org.apache.kafka.common.TopicPartition, java.lang.Object> fetchPartitionOffsets (org.apache.spark.sql.kafka010.KafkaOffsetRangeLimit offsetRangeLimit, boolean isStartingOffsets)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.kafka010.KafkaSourceOffset fetchSpecificOffsets (scala.collection.immutable.Map<org.apache.kafka.common.TopicPartition, java.lang.Object> partitionOffsets, scala.Function1<java.lang.String, scala.runtime.BoxedUnit> reportDataLoss)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.kafka010.KafkaSourceOffset fetchSpecificTimestampBasedOffsets (scala.collection.immutable.Map<org.apache.kafka.common.TopicPartition, java.lang.Object> partitionTimestamps, boolean isStartingOffsets, scala.Enumeration.Value strategyOnNoMatchStartingOffset)  { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.sql.kafka010.KafkaOffsetRange> getOffsetRangesFromResolvedOffsets (scala.collection.immutable.Map<org.apache.kafka.common.TopicPartition, java.lang.Object> fromPartitionOffsets, scala.collection.immutable.Map<org.apache.kafka.common.TopicPartition, java.lang.Object> untilPartitionOffsets, scala.Function1<java.lang.String, scala.runtime.BoxedUnit> reportDataLoss)  { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.sql.kafka010.KafkaOffsetRange> getOffsetRangesFromUnresolvedOffsets (org.apache.spark.sql.kafka010.KafkaOffsetRangeLimit startingOffsets, org.apache.spark.sql.kafka010.KafkaOffsetRangeLimit endingOffsets)  { throw new RuntimeException(); }
  // not preceding
  public  org.apache.kafka.common.IsolationLevel isolationLevel ()  { throw new RuntimeException(); }
    int maxOffsetFetchAttempts ()  { throw new RuntimeException(); }
    long offsetFetchAttemptIntervalMs ()  { throw new RuntimeException(); }
  public  java.lang.String toString ()  { throw new RuntimeException(); }
}
