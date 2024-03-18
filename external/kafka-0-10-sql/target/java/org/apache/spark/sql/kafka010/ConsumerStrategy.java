package org.apache.spark.sql.kafka010;
/**
 * Subscribe allows you to subscribe to a fixed collection of topics.
 * SubscribePattern allows you to use a regex to specify topics of interest.
 * Note that unlike the 0.8 integration, using Subscribe or SubscribePattern
 * should respond to adding partitions during a running stream.
 * Finally, Assign allows you to specify a fixed collection of partitions.
 * All three strategies have overloaded constructors that allow you to specify
 * the starting offset for a particular partition.
 */
public  interface ConsumerStrategy extends org.apache.spark.internal.Logging {
  /** Returns the assigned or subscribed {@link TopicPartition} */
  public  scala.collection.immutable.Set<org.apache.kafka.common.TopicPartition> assignedTopicPartitions (org.apache.kafka.clients.admin.Admin admin)  ;
  /** Creates an {@link org.apache.kafka.clients.admin.AdminClient} */
  public  org.apache.kafka.clients.admin.Admin createAdmin (java.util.Map<java.lang.String, java.lang.Object> kafkaParams)  ;
  /** Create a {@link KafkaConsumer} and subscribe to topics according to a desired strategy */
  public  org.apache.kafka.clients.consumer.Consumer<byte[], byte[]> createConsumer (java.util.Map<java.lang.String, java.lang.Object> kafkaParams)  ;
  public  scala.collection.immutable.Set<org.apache.kafka.common.TopicPartition> retrieveAllPartitions (org.apache.kafka.clients.admin.Admin admin, scala.collection.immutable.Set<java.lang.String> topics)  ;
  /**
   * Updates the parameters with security if needed.
   * Added a function to hide internals and reduce code duplications because all strategy uses it.
   * @param kafkaParams (undocumented)
   * @return (undocumented)
   */
  public  java.util.Map<java.lang.String, java.lang.Object> setAuthenticationConfigIfNeeded (java.util.Map<java.lang.String, java.lang.Object> kafkaParams)  ;
}
