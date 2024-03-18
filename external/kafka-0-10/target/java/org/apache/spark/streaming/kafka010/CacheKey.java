package org.apache.spark.streaming.kafka010;
  class CacheKey implements scala.Product, scala.Serializable {
  static public abstract  R apply (T1 v1, T2 v2)  ;
  static public  java.lang.String toString ()  { throw new RuntimeException(); }
  public  java.lang.String groupId ()  { throw new RuntimeException(); }
  public  org.apache.kafka.common.TopicPartition topicPartition ()  { throw new RuntimeException(); }
  // not preceding
  public   CacheKey (java.lang.String groupId, org.apache.kafka.common.TopicPartition topicPartition)  { throw new RuntimeException(); }
}
