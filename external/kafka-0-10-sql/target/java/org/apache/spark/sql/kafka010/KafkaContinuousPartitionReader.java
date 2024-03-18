package org.apache.spark.sql.kafka010;
/**
 * A per-task data reader for continuous Kafka processing.
 * <p>
 * param:  topicPartition The (topic, partition) pair this data reader is responsible for.
 * param:  startOffset The offset to start reading from within the partition.
 * param:  kafkaParams Kafka consumer params to use.
 * param:  pollTimeoutMs The timeout for Kafka consumer polling.
 * param:  failOnDataLoss Flag indicating whether data reader should fail if some offsets
 *                       are skipped.
 */
public  class KafkaContinuousPartitionReader implements org.apache.spark.sql.connector.read.streaming.ContinuousPartitionReader<org.apache.spark.sql.catalyst.InternalRow> {
  public   KafkaContinuousPartitionReader (org.apache.kafka.common.TopicPartition topicPartition, long startOffset, java.util.Map<java.lang.String, java.lang.Object> kafkaParams, long pollTimeoutMs, boolean failOnDataLoss, boolean includeHeaders)  { throw new RuntimeException(); }
  public  void close ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.expressions.UnsafeRow get ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.kafka010.KafkaSourcePartitionOffset getOffset ()  { throw new RuntimeException(); }
  public  boolean next ()  { throw new RuntimeException(); }
}
