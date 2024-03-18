package org.apache.spark.streaming.kafka010;
/**
 * Subscribe to all topics matching specified pattern to get dynamically assigned partitions.
 * The pattern matching will be done periodically against topics existing at the time of check.
 * param:  pattern pattern to subscribe to
 * param:  kafkaParams Kafka
 * <a href="http://kafka.apache.org/documentation.html#newconsumerconfigs">
 * configuration parameters</a> to be used on driver. The same params will be used on executors,
 * with minor automatic modifications applied.
 *  Requires "bootstrap.servers" to be set
 * with Kafka broker(s) specified in host1:port1,host2:port2 form.
 * param:  offsets: offsets to begin at on initial startup.  If no offset is given for a
 * TopicPartition, the committed offset (if applicable) or kafka param
 * auto.offset.reset will be used.
 */
public  class SubscribePattern<K extends java.lang.Object, V extends java.lang.Object> extends org.apache.spark.streaming.kafka010.ConsumerStrategy<K, V> implements org.apache.spark.internal.Logging, scala.Product, scala.Serializable {
  public  java.util.regex.Pattern pattern ()  { throw new RuntimeException(); }
  public  java.util.Map<java.lang.String, java.lang.Object> kafkaParams ()  { throw new RuntimeException(); }
  public  java.util.Map<org.apache.kafka.common.TopicPartition, java.lang.Long> offsets ()  { throw new RuntimeException(); }
  // not preceding
  public   SubscribePattern (java.util.regex.Pattern pattern, java.util.Map<java.lang.String, java.lang.Object> kafkaParams, java.util.Map<org.apache.kafka.common.TopicPartition, java.lang.Long> offsets)  { throw new RuntimeException(); }
  public  java.util.Map<java.lang.String, java.lang.Object> executorKafkaParams ()  { throw new RuntimeException(); }
  public  org.apache.kafka.clients.consumer.Consumer<K, V> onStart (java.util.Map<org.apache.kafka.common.TopicPartition, java.lang.Long> currentOffsets)  { throw new RuntimeException(); }
}
