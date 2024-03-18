package org.apache.spark.sql.kafka010;
/**
 * This class uses Kafka's own {@link org.apache.kafka.clients.consumer.KafkaConsumer} API to
 * read data offsets from Kafka.
 * The {@link ConsumerStrategy} class defines which Kafka topics and partitions should be read
 * by this source. These strategies directly correspond to the different consumption options
 * in. This class is designed to return a configured
 * {@link org.apache.kafka.clients.consumer.KafkaConsumer} that is used by the
 * {@link KafkaSource} to query for the offsets. See the docs on
 * {@link org.apache.spark.sql.kafka010.ConsumerStrategy}
 * for more details.
 * <p>
 * Note: This class is not ThreadSafe
 */
  class KafkaOffsetReaderConsumer implements org.apache.spark.sql.kafka010.KafkaOffsetReader, org.apache.spark.internal.Logging {
  // not preceding
  public   KafkaOffsetReaderConsumer (org.apache.spark.sql.kafka010.ConsumerStrategy consumerStrategy, java.util.Map<java.lang.String, java.lang.Object> driverKafkaParams, org.apache.spark.sql.catalyst.util.CaseInsensitiveMap<java.lang.String> readerOptions, java.lang.String driverGroupIdPrefix)  { throw new RuntimeException(); }
  /**
   * A KafkaConsumer used in the driver to query the latest Kafka offsets. This only queries the
   * offsets and never commits them.
   * @return (undocumented)
   */
  protected  org.apache.kafka.clients.consumer.Consumer<byte[], byte[]> _consumer ()  { throw new RuntimeException(); }
  public  void close ()  { throw new RuntimeException(); }
  protected  org.apache.kafka.clients.consumer.Consumer<byte[], byte[]> consumer ()  { throw new RuntimeException(); }
  public  java.util.Map<java.lang.String, java.lang.Object> driverKafkaParams ()  { throw new RuntimeException(); }
  public  scala.collection.immutable.Map<org.apache.kafka.common.TopicPartition, java.lang.Object> fetchEarliestOffsets ()  { throw new RuntimeException(); }
  public  scala.collection.immutable.Map<org.apache.kafka.common.TopicPartition, java.lang.Object> fetchEarliestOffsets (scala.collection.Seq<org.apache.kafka.common.TopicPartition> newPartitions)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.kafka010.KafkaSourceOffset fetchGlobalTimestampBasedOffsets (long timestamp, boolean isStartingOffsets, scala.Enumeration.Value strategyOnNoMatchStartingOffset)  { throw new RuntimeException(); }
  /**
   * Specific to <code>KafkaOffsetReaderConsumer</code>:
   * Kafka may return earliest offsets when we are requesting latest offsets if <code>poll</code> is called
   * right before <code>seekToEnd</code> (KAFKA-7703). As a workaround, we will call <code>position</code> right after
   * <code>poll</code> to wait until the potential offset request triggered by <code>poll(0)</code> is done.
   * @param knownOffsets (undocumented)
   * @return (undocumented)
   */
  public  scala.collection.immutable.Map<org.apache.kafka.common.TopicPartition, java.lang.Object> fetchLatestOffsets (scala.Option<scala.collection.immutable.Map<org.apache.kafka.common.TopicPartition, java.lang.Object>> knownOffsets)  { throw new RuntimeException(); }
  public  scala.collection.immutable.Map<org.apache.kafka.common.TopicPartition, java.lang.Object> fetchPartitionOffsets (org.apache.spark.sql.kafka010.KafkaOffsetRangeLimit offsetRangeLimit, boolean isStartingOffsets)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.kafka010.KafkaSourceOffset fetchSpecificOffsets (scala.collection.immutable.Map<org.apache.kafka.common.TopicPartition, java.lang.Object> partitionOffsets, scala.Function1<java.lang.String, scala.runtime.BoxedUnit> reportDataLoss)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.kafka010.KafkaSourceOffset fetchSpecificTimestampBasedOffsets (scala.collection.immutable.Map<org.apache.kafka.common.TopicPartition, java.lang.Object> partitionTimestamps, boolean isStartingOffsets, scala.Enumeration.Value strategyOnNoMatchStartingOffset)  { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.sql.kafka010.KafkaOffsetRange> getOffsetRangesFromResolvedOffsets (scala.collection.immutable.Map<org.apache.kafka.common.TopicPartition, java.lang.Object> fromPartitionOffsets, scala.collection.immutable.Map<org.apache.kafka.common.TopicPartition, java.lang.Object> untilPartitionOffsets, scala.Function1<java.lang.String, scala.runtime.BoxedUnit> reportDataLoss)  { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.sql.kafka010.KafkaOffsetRange> getOffsetRangesFromUnresolvedOffsets (org.apache.spark.sql.kafka010.KafkaOffsetRangeLimit startingOffsets, org.apache.spark.sql.kafka010.KafkaOffsetRangeLimit endingOffsets)  { throw new RuntimeException(); }
    int maxOffsetFetchAttempts ()  { throw new RuntimeException(); }
    long offsetFetchAttemptIntervalMs ()  { throw new RuntimeException(); }
  public  java.lang.String toString ()  { throw new RuntimeException(); }
  /**
   * {@link UninterruptibleThreadRunner} ensures that all
   * {@link org.apache.kafka.clients.consumer.KafkaConsumer} communication called in an
   * {@link UninterruptibleThread}. In the case of streaming queries, we are already running in an
   * {@link UninterruptibleThread}, however for batch mode this is not the case.
   * @return (undocumented)
   */
  public  org.apache.spark.util.UninterruptibleThreadRunner uninterruptibleThreadRunner ()  { throw new RuntimeException(); }
}
