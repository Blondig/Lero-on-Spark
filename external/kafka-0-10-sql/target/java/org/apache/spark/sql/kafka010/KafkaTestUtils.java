package org.apache.spark.sql.kafka010;
/**
 * This is a helper class for Kafka test suites. This has the functionality to set up
 * and tear down local Kafka servers, and to push data using Kafka producers.
 * <p>
 * The reason to put Kafka test utility class in src is to test Python related Kafka APIs.
 */
public  class KafkaTestUtils implements org.apache.spark.internal.Logging {
  public   KafkaTestUtils (scala.collection.immutable.Map<java.lang.String, java.lang.Object> withBrokerProps, boolean secure)  { throw new RuntimeException(); }
  public  java.lang.String zkAddress ()  { throw new RuntimeException(); }
  public  java.lang.String brokerAddress ()  { throw new RuntimeException(); }
  public  kafka.zk.KafkaZkClient zookeeperClient ()  { throw new RuntimeException(); }
  public  java.lang.String clientPrincipal ()  { throw new RuntimeException(); }
  public  java.lang.String clientKeytab ()  { throw new RuntimeException(); }
  /** setup the whole embedded servers, including Zookeeper and Kafka brokers */
  public  void setup ()  { throw new RuntimeException(); }
  /** Teardown the whole servers, including Kafka broker and Zookeeper */
  public  void teardown ()  { throw new RuntimeException(); }
  /** Create a Kafka topic and wait until it is propagated to the whole cluster */
  public  void createTopic (java.lang.String topic, int partitions, boolean overwrite)  { throw new RuntimeException(); }
  public  scala.collection.Seq<scala.Tuple2<java.lang.String, java.lang.Object>> getAllTopicsAndPartitionSize ()  { throw new RuntimeException(); }
  /** Create a Kafka topic and wait until it is propagated to the whole cluster */
  public  void createTopic (java.lang.String topic)  { throw new RuntimeException(); }
  /** Delete a Kafka topic and wait until it is propagated to the whole cluster */
  public  void deleteTopic (java.lang.String topic)  { throw new RuntimeException(); }
  /** Add new partitions to a Kafka topic */
  public  void addPartitions (java.lang.String topic, int partitions)  { throw new RuntimeException(); }
  public  scala.collection.Seq<scala.Tuple2<java.lang.String, org.apache.kafka.clients.producer.RecordMetadata>> sendMessages (java.lang.String topic, java.lang.String[] msgs)  { throw new RuntimeException(); }
  public  scala.collection.Seq<scala.Tuple2<java.lang.String, org.apache.kafka.clients.producer.RecordMetadata>> sendMessages (java.lang.String topic, java.lang.String[] msgs, scala.Option<java.lang.Object> part)  { throw new RuntimeException(); }
  public  scala.collection.Seq<scala.Tuple2<java.lang.String, org.apache.kafka.clients.producer.RecordMetadata>> sendMessage (org.apache.kafka.clients.producer.ProducerRecord<java.lang.String, java.lang.String> msg)  { throw new RuntimeException(); }
  public  scala.collection.Seq<scala.Tuple2<java.lang.String, org.apache.kafka.clients.producer.RecordMetadata>> sendMessages (scala.collection.Seq<org.apache.kafka.clients.producer.ProducerRecord<java.lang.String, java.lang.String>> msgs)  { throw new RuntimeException(); }
  public  void cleanupLogs ()  { throw new RuntimeException(); }
  public  scala.collection.immutable.Map<org.apache.kafka.common.TopicPartition, java.lang.Object> getEarliestOffsets (scala.collection.immutable.Set<java.lang.String> topics)  { throw new RuntimeException(); }
  public  scala.collection.immutable.Map<org.apache.kafka.common.TopicPartition, java.lang.Object> getLatestOffsets (scala.collection.immutable.Set<java.lang.String> topics)  { throw new RuntimeException(); }
  public  org.apache.kafka.clients.admin.ListConsumerGroupsResult listConsumerGroups ()  { throw new RuntimeException(); }
  protected  java.util.Properties brokerConfiguration ()  { throw new RuntimeException(); }
  /** Call `f` with a `KafkaProducer` that has initialized transactions. */
  public  void withTransactionalProducer (scala.Function1<org.apache.kafka.clients.producer.KafkaProducer<java.lang.String, java.lang.String>, scala.runtime.BoxedUnit> f)  { throw new RuntimeException(); }
  /**
   * Wait until the latest offset of the given <code>TopicPartition</code> is not less than <code>offset</code>.
   * @param topicPartition (undocumented)
   * @param offset (undocumented)
   */
  public  void waitUntilOffsetAppears (org.apache.kafka.common.TopicPartition topicPartition, long offset)  { throw new RuntimeException(); }
}
