package org.apache.spark.streaming.kafka010;
/**
 * This is a helper class for Kafka test suites. This has the functionality to set up
 * and tear down local Kafka servers, and to push data using Kafka producers.
 * <p>
 * The reason to put Kafka test utility class in src is to test Python related Kafka APIs.
 */
  class KafkaTestUtils implements org.apache.spark.internal.Logging {
  public   KafkaTestUtils ()  { throw new RuntimeException(); }
  public  kafka.zk.AdminZkClient adminClient ()  { throw new RuntimeException(); }
  public  java.lang.String brokerAddress ()  { throw new RuntimeException(); }
  public  java.lang.String brokerLogDir ()  { throw new RuntimeException(); }
  /** Create a Kafka topic and wait until it is propagated to the whole cluster */
  public  void createTopic (java.lang.String topic, int partitions, java.util.Properties config)  { throw new RuntimeException(); }
  /** Create a Kafka topic and wait until it is propagated to the whole cluster */
  public  void createTopic (java.lang.String topic, int partitions)  { throw new RuntimeException(); }
  /** Create a Kafka topic and wait until it is propagated to the whole cluster */
  public  void createTopic (java.lang.String topic)  { throw new RuntimeException(); }
  public <T extends java.lang.Object> T eventually (org.apache.spark.streaming.Time timeout, org.apache.spark.streaming.Time interval, scala.Function0<T> func)  { throw new RuntimeException(); }
  /** Java-friendly function for sending messages to the Kafka broker */
  public  void sendMessages (java.lang.String topic, java.util.Map<java.lang.String, java.lang.Integer> messageToFreq)  { throw new RuntimeException(); }
  /** Send the messages to the Kafka broker */
  public  void sendMessages (java.lang.String topic, scala.collection.immutable.Map<java.lang.String, java.lang.Object> messageToFreq)  { throw new RuntimeException(); }
  /** Send the array of messages to the Kafka broker */
  public  void sendMessages (java.lang.String topic, java.lang.String[] messages)  { throw new RuntimeException(); }
  /** Send the array of (key, value) messages to the Kafka broker */
  public  void sendMessages (java.lang.String topic, scala.Tuple2<java.lang.String, java.lang.String>[] messages)  { throw new RuntimeException(); }
  /** setup the whole embedded servers, including Zookeeper and Kafka brokers */
  public  void setup ()  { throw new RuntimeException(); }
  /** Teardown the whole servers, including Kafka broker and Zookeeper */
  public  void teardown ()  { throw new RuntimeException(); }
  public  java.lang.String zkAddress ()  { throw new RuntimeException(); }
  public  kafka.zk.KafkaZkClient zookeeperClient ()  { throw new RuntimeException(); }
}
