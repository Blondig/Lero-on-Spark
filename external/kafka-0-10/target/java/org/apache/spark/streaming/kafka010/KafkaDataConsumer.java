package org.apache.spark.streaming.kafka010;
public  interface KafkaDataConsumer<K extends java.lang.Object, V extends java.lang.Object> {
  /**
   * Get the record for the given offset if available.
   * <p>
   * @param offset         the offset to fetch.
   * @param pollTimeoutMs  timeout in milliseconds to poll data from Kafka.
   * @return (undocumented)
   */
  public  org.apache.kafka.clients.consumer.ConsumerRecord<K, V> get (long offset, long pollTimeoutMs)  ;
  /**
   * Start a batch on a compacted topic
   * <p>
   * @param offset         the offset to fetch.
   * @param pollTimeoutMs  timeout in milliseconds to poll data from Kafka.
   */
  public  void compactedStart (long offset, long pollTimeoutMs)  ;
  /**
   * Get the next record in the batch from a compacted topic.
   * Assumes compactedStart has been called first, and ignores gaps.
   * <p>
   * @param pollTimeoutMs  timeout in milliseconds to poll data from Kafka.
   * @return (undocumented)
   */
  public  org.apache.kafka.clients.consumer.ConsumerRecord<K, V> compactedNext (long pollTimeoutMs)  ;
  /**
   * Rewind to previous record in the batch from a compacted topic.
   * <p>
   * @throws NoSuchElementException if no previous element
   * @return (undocumented)
   */
  public  org.apache.kafka.clients.consumer.ConsumerRecord<K, V> compactedPrevious ()  ;
  /**
   * Release this consumer from being further used. Depending on its implementation,
   * this consumer will be either finalized, or reset for reuse later.
   */
  public  void release ()  ;
  /** Reference to the internal implementation that this wrapper delegates to */
  public  org.apache.spark.streaming.kafka010.InternalKafkaConsumer<K, V> internalConsumer ()  ;
}
