package org.apache.spark.sql.kafka010;
/**
 * Base trait to fetch offsets from Kafka. The implementations are
 * {@link KafkaOffsetReaderConsumer} and {@link KafkaOffsetReaderAdmin}.
 */
public  interface KafkaOffsetReader {
    int maxOffsetFetchAttempts ()  ;
    long offsetFetchAttemptIntervalMs ()  ;
  public  java.util.Map<java.lang.String, java.lang.Object> driverKafkaParams ()  ;
  /**
   * Closes the connection to Kafka, and cleans up state.
   */
  public  void close ()  ;
  /**
   * Fetch the partition offsets for the topic partitions that are indicated
   * in the {@link ConsumerStrategy} and {@link KafkaOffsetRangeLimit}.
   * @param offsetRangeLimit (undocumented)
   * @param isStartingOffsets (undocumented)
   * @return (undocumented)
   */
  public  scala.collection.immutable.Map<org.apache.kafka.common.TopicPartition, java.lang.Object> fetchPartitionOffsets (org.apache.spark.sql.kafka010.KafkaOffsetRangeLimit offsetRangeLimit, boolean isStartingOffsets)  ;
  /**
   * Resolves the specific offsets based on Kafka seek positions.
   * This method resolves offset value -1 to the latest and -2 to the
   * earliest Kafka seek position.
   * <p>
   * @param partitionOffsets the specific offsets to resolve
   * @param reportDataLoss callback to either report or log data loss depending on setting
   * @return (undocumented)
   */
  public  org.apache.spark.sql.kafka010.KafkaSourceOffset fetchSpecificOffsets (scala.collection.immutable.Map<org.apache.kafka.common.TopicPartition, java.lang.Object> partitionOffsets, scala.Function1<java.lang.String, scala.runtime.BoxedUnit> reportDataLoss)  ;
  /**
   * Resolves the specific offsets based on timestamp per topic-partition.
   * The returned offset for each partition is the earliest offset whose timestamp is greater
   * than or equal to the given timestamp in the corresponding partition.
   * <p>
   * If the matched offset doesn't exist, the behavior depends on the destination and the option:
   * <p>
   * - isStartingOffsets = false =&gt; implementation should provide the offset same as 'latest'
   * - isStartingOffsets = true  =&gt; implementation should follow the strategy on non-matching
   *                                starting offset, passed as <code>strategyOnNoMatchStartingOffset</code>
   * <p>
   * @param partitionTimestamps the timestamp per topic-partition.
   * @param isStartingOffsets (undocumented)
   * @param strategyOnNoMatchStartingOffset (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.kafka010.KafkaSourceOffset fetchSpecificTimestampBasedOffsets (scala.collection.immutable.Map<org.apache.kafka.common.TopicPartition, java.lang.Object> partitionTimestamps, boolean isStartingOffsets, scala.Enumeration.Value strategyOnNoMatchStartingOffset)  ;
  /**
   * Resolves the specific offsets based on timestamp per all topic-partitions being subscribed.
   * The returned offset for each partition is the earliest offset whose timestamp is greater
   * than or equal to the given timestamp in the corresponding partition.
   * <p>
   * If the matched offset doesn't exist, the behavior depends on the destination and the option:
   * <p>
   * - isStartingOffsets = false =&gt; implementation should provide the offset same as 'latest'
   * - isStartingOffsets = true  =&gt; implementation should follow the strategy on non-matching
   *                                starting offset, passed as <code>strategyOnNoMatchStartingOffset</code>
   * <p>
   * @param timestamp the timestamp.
   * @param isStartingOffsets (undocumented)
   * @param strategyOnNoMatchingStartingOffset (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.kafka010.KafkaSourceOffset fetchGlobalTimestampBasedOffsets (long timestamp, boolean isStartingOffsets, scala.Enumeration.Value strategyOnNoMatchingStartingOffset)  ;
  /**
   * Fetch the earliest offsets for the topic partitions that are indicated
   * in the {@link ConsumerStrategy}.
   * @return (undocumented)
   */
  public  scala.collection.immutable.Map<org.apache.kafka.common.TopicPartition, java.lang.Object> fetchEarliestOffsets ()  ;
  /**
   * Fetch the latest offsets for the topic partitions that are indicated
   * in the {@link ConsumerStrategy}.
   * <p>
   * In order to avoid unknown issues, we use the given <code>knownOffsets</code> to audit the
   * latest offsets returned by Kafka. If we find some incorrect offsets (a latest offset is less
   * than an offset in <code>knownOffsets</code>), we will retry at most <code>maxOffsetFetchAttempts</code> times. When
   * a topic is recreated, the latest offsets may be less than offsets in <code>knownOffsets</code>. We cannot
   * distinguish this with issues like KAFKA-7703, so we just return whatever we get from Kafka
   * after retrying.
   * @param knownOffsets (undocumented)
   * @return (undocumented)
   */
  public  scala.collection.immutable.Map<org.apache.kafka.common.TopicPartition, java.lang.Object> fetchLatestOffsets (scala.Option<scala.collection.immutable.Map<org.apache.kafka.common.TopicPartition, java.lang.Object>> knownOffsets)  ;
  /**
   * Fetch the earliest offsets for specific topic partitions.
   * The return result may not contain some partitions if they are deleted.
   * @param newPartitions (undocumented)
   * @return (undocumented)
   */
  public  scala.collection.immutable.Map<org.apache.kafka.common.TopicPartition, java.lang.Object> fetchEarliestOffsets (scala.collection.Seq<org.apache.kafka.common.TopicPartition> newPartitions)  ;
  /**
   * Return the offset ranges for a Kafka batch query. If <code>minPartitions</code> is set, this method may
   * split partitions to respect it. Since offsets can be early and late binding which are evaluated
   * on the executors, in order to divvy up the partitions we need to perform some substitutions. We
   * don't want to send exact offsets to the executors, because data may age out before we can
   * consume the data. This method makes some approximate splitting, and replaces the special offset
   * values in the final output.
   * @param startingOffsets (undocumented)
   * @param endingOffsets (undocumented)
   * @return (undocumented)
   */
  public  scala.collection.Seq<org.apache.spark.sql.kafka010.KafkaOffsetRange> getOffsetRangesFromUnresolvedOffsets (org.apache.spark.sql.kafka010.KafkaOffsetRangeLimit startingOffsets, org.apache.spark.sql.kafka010.KafkaOffsetRangeLimit endingOffsets)  ;
  /**
   * Return the offset ranges for a Kafka streaming batch. If <code>minPartitions</code> is set, this method
   * may split partitions to respect it. If any data lost issue is detected, <code>reportDataLoss</code> will
   * be called.
   * @param fromPartitionOffsets (undocumented)
   * @param untilPartitionOffsets (undocumented)
   * @param reportDataLoss (undocumented)
   * @return (undocumented)
   */
  public  scala.collection.Seq<org.apache.spark.sql.kafka010.KafkaOffsetRange> getOffsetRangesFromResolvedOffsets (scala.collection.immutable.Map<org.apache.kafka.common.TopicPartition, java.lang.Object> fromPartitionOffsets, scala.collection.immutable.Map<org.apache.kafka.common.TopicPartition, java.lang.Object> untilPartitionOffsets, scala.Function1<java.lang.String, scala.runtime.BoxedUnit> reportDataLoss)  ;
}
