package org.apache.spark.sql.kafka010;
/**
 * A {@link Source} that reads data from Kafka using the following design.
 * <p>
 * - The {@link KafkaSourceOffset} is the custom {@link Offset} defined for this source that contains
 *   a map of TopicPartition -> offset. Note that this offset is 1 + (available offset). For
 *   example if the last record in a Kafka topic "t", partition 2 is offset 5, then
 *   KafkaSourceOffset will contain TopicPartition("t", 2) -> 6. This is done keep it consistent
 *   with the semantics of <code>KafkaConsumer.position()</code>.
 * <p>
 * - The {@link KafkaSource} written to do the following.
 * <p>
 *  - As soon as the source is created, the pre-configured {@link KafkaOffsetReader}
 *    is used to query the initial offsets that this source should
 *    start reading from. This is used to create the first batch.
 * <p>
 *   - <code>getOffset()</code> uses the {@link KafkaOffsetReader} to query the latest
 *      available offsets, which are returned as a {@link KafkaSourceOffset}.
 * <p>
 *   - <code>getBatch()</code> returns a DF that reads from the 'start offset' until the 'end offset' in
 *     for each partition. The end offset is excluded to be consistent with the semantics of
 *     {@link KafkaSourceOffset} and <code>KafkaConsumer.position()</code>.
 * <p>
 *   - The DF returned is based on {@link KafkaSourceRDD} which is constructed such that the
 *     data from Kafka topic + partition is consistently read by the same executors across
 *     batches, and cached KafkaConsumers in the executors can be reused efficiently. See the
 *     docs on {@link KafkaSourceRDD} for more details.
 * <p>
 * Zero data lost is not guaranteed when topics are deleted. If zero data lost is critical, the user
 * must make sure all messages in a topic have been processed when deleting a topic.
 * <p>
 * There is a known issue caused by KAFKA-1894: the query using KafkaSource maybe cannot be stopped.
 * To avoid this issue, you should make sure stopping the query before stopping the Kafka brokers
 * and not use wrong broker addresses.
 */
  class KafkaSource implements org.apache.spark.sql.connector.read.streaming.SupportsTriggerAvailableNow, org.apache.spark.sql.execution.streaming.Source, org.apache.spark.internal.Logging {
  static public  java.lang.String[] getSortedExecutorList (org.apache.spark.SparkContext sc)  { throw new RuntimeException(); }
  public   KafkaSource (org.apache.spark.sql.SQLContext sqlContext, org.apache.spark.sql.kafka010.KafkaOffsetReader kafkaReader, java.util.Map<java.lang.String, java.lang.Object> executorKafkaParams, org.apache.spark.sql.catalyst.util.CaseInsensitiveMap<java.lang.String> sourceOptions, java.lang.String metadataPath, org.apache.spark.sql.kafka010.KafkaOffsetRangeLimit startingOffsets, boolean failOnDataLoss)  { throw new RuntimeException(); }
    scala.Option<java.lang.Object> minOffsetPerTrigger ()  { throw new RuntimeException(); }
    long maxTriggerDelayMs ()  { throw new RuntimeException(); }
    org.apache.spark.util.Clock clock ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.connector.read.streaming.ReadLimit getDefaultReadLimit ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.types.StructType schema ()  { throw new RuntimeException(); }
  /** Returns the maximum available offset for this source. */
  public  scala.Option<org.apache.spark.sql.execution.streaming.Offset> getOffset ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.connector.read.streaming.Offset reportLatestOffset ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.connector.read.streaming.Offset latestOffset (org.apache.spark.sql.connector.read.streaming.Offset startOffset, org.apache.spark.sql.connector.read.streaming.ReadLimit limit)  { throw new RuntimeException(); }
  /**
   * Returns the data that is between the offsets
   * [<code>start.get.partitionToOffsets</code>, <code>end.partitionToOffsets</code>), i.e. end.partitionToOffsets is
   * exclusive.
   * @param start (undocumented)
   * @param end (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> getBatch (scala.Option<org.apache.spark.sql.execution.streaming.Offset> start, org.apache.spark.sql.execution.streaming.Offset end)  { throw new RuntimeException(); }
  /** Stop this source and free any resources it has allocated. */
  public  void stop ()  { throw new RuntimeException(); }
  public  java.lang.String toString ()  { throw new RuntimeException(); }
  public  void prepareForTriggerAvailableNow ()  { throw new RuntimeException(); }
}
