package org.apache.spark.sql.kafka010;
  class KafkaSourcePartitionOffset implements org.apache.spark.sql.connector.read.streaming.PartitionOffset, scala.Product, scala.Serializable {
  static public abstract  R apply (T1 v1, T2 v2)  ;
  static public  java.lang.String toString ()  { throw new RuntimeException(); }
  public  org.apache.kafka.common.TopicPartition topicPartition ()  { throw new RuntimeException(); }
  public  long partitionOffset ()  { throw new RuntimeException(); }
  // not preceding
  public   KafkaSourcePartitionOffset (org.apache.kafka.common.TopicPartition topicPartition, long partitionOffset)  { throw new RuntimeException(); }
}
