package org.apache.spark.streaming.kafka010;
public  class KafkaDataConsumer$ implements org.apache.spark.internal.Logging {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final KafkaDataConsumer$ MODULE$ = null;
  public   KafkaDataConsumer$ ()  { throw new RuntimeException(); }
    java.util.Map<org.apache.spark.streaming.kafka010.CacheKey, org.apache.spark.streaming.kafka010.InternalKafkaConsumer<?, ?>> cache ()  { throw new RuntimeException(); }
  /**
   * Must be called before acquire, once per JVM, to configure the cache.
   * Further calls are ignored.
   * @param initialCapacity (undocumented)
   * @param maxCapacity (undocumented)
   * @param loadFactor (undocumented)
   */
  public  void init (int initialCapacity, int maxCapacity, float loadFactor)  { throw new RuntimeException(); }
  /**
   * Get a cached consumer for groupId, assigned to topic and partition.
   * If matching consumer doesn't already exist, will be created using kafkaParams.
   * The returned consumer must be released explicitly using {@link KafkaDataConsumer.release()}.
   * <p>
   * Note: This method guarantees that the consumer returned is not currently in use by anyone
   * else. Within this guarantee, this method will make a best effort attempt to re-use consumers by
   * caching them and tracking when they are in use.
   * @param topicPartition (undocumented)
   * @param kafkaParams (undocumented)
   * @param context (undocumented)
   * @param useCache (undocumented)
   * @return (undocumented)
   */
  public <K extends java.lang.Object, V extends java.lang.Object> org.apache.spark.streaming.kafka010.KafkaDataConsumer<K, V> acquire (org.apache.kafka.common.TopicPartition topicPartition, java.util.Map<java.lang.String, java.lang.Object> kafkaParams, org.apache.spark.TaskContext context, boolean useCache)  { throw new RuntimeException(); }
}
