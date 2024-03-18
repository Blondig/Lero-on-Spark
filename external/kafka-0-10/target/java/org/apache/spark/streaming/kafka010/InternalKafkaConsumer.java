package org.apache.spark.streaming.kafka010;
/**
 * A wrapper around Kafka's KafkaConsumer.
 * This is not for direct use outside this file.
 */
  class InternalKafkaConsumer<K extends java.lang.Object, V extends java.lang.Object> implements org.apache.spark.internal.Logging {
  public  org.apache.kafka.common.TopicPartition topicPartition ()  { throw new RuntimeException(); }
  public  java.util.Map<java.lang.String, java.lang.Object> kafkaParams ()  { throw new RuntimeException(); }
  // not preceding
  public   InternalKafkaConsumer (org.apache.kafka.common.TopicPartition topicPartition, java.util.Map<java.lang.String, java.lang.Object> kafkaParams)  { throw new RuntimeException(); }
    java.lang.String groupId ()  { throw new RuntimeException(); }
  /** indicates whether this consumer is in use or not */
  public  boolean inUse ()  { throw new RuntimeException(); }
  /** indicate whether this consumer is going to be stopped in the next release */
  public  boolean markedForClose ()  { throw new RuntimeException(); }
  public  java.lang.String toString ()  { throw new RuntimeException(); }
  public  void close ()  { throw new RuntimeException(); }
  /**
   * Get the record for the given offset, waiting up to timeout ms if IO is necessary.
   * Sequential forward access will use buffers, but random access will be horribly inefficient.
   * @param offset (undocumented)
   * @param timeout (undocumented)
   * @return (undocumented)
   */
  public  org.apache.kafka.clients.consumer.ConsumerRecord<K, V> get (long offset, long timeout)  { throw new RuntimeException(); }
  /**
   * Start a batch on a compacted topic
   * @param offset (undocumented)
   * @param pollTimeoutMs (undocumented)
   */
  public  void compactedStart (long offset, long pollTimeoutMs)  { throw new RuntimeException(); }
  /**
   * Get the next record in the batch from a compacted topic.
   * Assumes compactedStart has been called first, and ignores gaps.
   * @param pollTimeoutMs (undocumented)
   * @return (undocumented)
   */
  public  org.apache.kafka.clients.consumer.ConsumerRecord<K, V> compactedNext (long pollTimeoutMs)  { throw new RuntimeException(); }
  /**
   * Rewind to previous record in the batch from a compacted topic.
   * @throws NoSuchElementException if no previous element
   * @return (undocumented)
   */
  public  org.apache.kafka.clients.consumer.ConsumerRecord<K, V> compactedPrevious ()  { throw new RuntimeException(); }
}
