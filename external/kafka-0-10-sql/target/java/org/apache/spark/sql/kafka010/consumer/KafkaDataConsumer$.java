package org.apache.spark.sql.kafka010.consumer;
public  class KafkaDataConsumer$ implements org.apache.spark.internal.Logging {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final KafkaDataConsumer$ MODULE$ = null;
  public   KafkaDataConsumer$ ()  { throw new RuntimeException(); }
  public  long UNKNOWN_OFFSET ()  { throw new RuntimeException(); }
  /**
   * Get a data reader for groupId, assigned to topic and partition.
   * If matching consumer doesn't already exist, will be created using kafkaParams.
   * The returned data reader must be released explicitly.
   * @param topicPartition (undocumented)
   * @param kafkaParams (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.kafka010.consumer.KafkaDataConsumer acquire (org.apache.kafka.common.TopicPartition topicPartition, java.util.Map<java.lang.String, java.lang.Object> kafkaParams)  { throw new RuntimeException(); }
}
