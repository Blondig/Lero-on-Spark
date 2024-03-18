package org.apache.spark.sql.kafka010;
/**
 * An input partition for continuous Kafka processing. This will be serialized and transformed
 * into a full reader on executors.
 * <p>
 * param:  topicPartition The (topic, partition) pair this task is responsible for.
 * param:  startOffset The offset to start reading from within the partition.
 * param:  kafkaParams Kafka consumer params to use.
 * param:  pollTimeoutMs The timeout for Kafka consumer polling.
 * param:  failOnDataLoss Flag indicating whether data reader should fail if some offsets
 *                       are skipped.
 * param:  includeHeaders Flag indicating whether to include Kafka records' headers.
 */
public  class KafkaContinuousInputPartition implements org.apache.spark.sql.connector.read.InputPartition, scala.Product, scala.Serializable {
  static public abstract  R apply (T1 v1, T2 v2, T3 v3, T4 v4, T5 v5, T6 v6)  ;
  static public  java.lang.String toString ()  { throw new RuntimeException(); }
  public  org.apache.kafka.common.TopicPartition topicPartition ()  { throw new RuntimeException(); }
  public  long startOffset ()  { throw new RuntimeException(); }
  public  java.util.Map<java.lang.String, java.lang.Object> kafkaParams ()  { throw new RuntimeException(); }
  public  long pollTimeoutMs ()  { throw new RuntimeException(); }
  public  boolean failOnDataLoss ()  { throw new RuntimeException(); }
  public  boolean includeHeaders ()  { throw new RuntimeException(); }
  // not preceding
  public   KafkaContinuousInputPartition (org.apache.kafka.common.TopicPartition topicPartition, long startOffset, java.util.Map<java.lang.String, java.lang.Object> kafkaParams, long pollTimeoutMs, boolean failOnDataLoss, boolean includeHeaders)  { throw new RuntimeException(); }
}
