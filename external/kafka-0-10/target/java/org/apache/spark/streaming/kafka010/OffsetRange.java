package org.apache.spark.streaming.kafka010;
/**
 * Represents a range of offsets from a single Kafka TopicPartition. Instances of this class
 * can be created with <code>OffsetRange.create()</code>.
 * param:  topic Kafka topic name
 * param:  partition Kafka partition id
 * param:  fromOffset Inclusive starting offset
 * param:  untilOffset Exclusive ending offset
 */
public final class OffsetRange implements scala.Serializable {
  static public  org.apache.spark.streaming.kafka010.OffsetRange create (java.lang.String topic, int partition, long fromOffset, long untilOffset)  { throw new RuntimeException(); }
  static public  org.apache.spark.streaming.kafka010.OffsetRange create (org.apache.kafka.common.TopicPartition topicPartition, long fromOffset, long untilOffset)  { throw new RuntimeException(); }
  static public  org.apache.spark.streaming.kafka010.OffsetRange apply (java.lang.String topic, int partition, long fromOffset, long untilOffset)  { throw new RuntimeException(); }
  static public  org.apache.spark.streaming.kafka010.OffsetRange apply (org.apache.kafka.common.TopicPartition topicPartition, long fromOffset, long untilOffset)  { throw new RuntimeException(); }
  static   org.apache.spark.streaming.kafka010.OffsetRange apply (scala.Tuple4<java.lang.String, java.lang.Object, java.lang.Object, java.lang.Object> t)  { throw new RuntimeException(); }
  public  java.lang.String topic ()  { throw new RuntimeException(); }
  public  int partition ()  { throw new RuntimeException(); }
  public  long fromOffset ()  { throw new RuntimeException(); }
  public  long untilOffset ()  { throw new RuntimeException(); }
  /** Kafka TopicPartition object, for convenience */
  public  org.apache.kafka.common.TopicPartition topicPartition ()  { throw new RuntimeException(); }
  /** Number of messages this OffsetRange refers to */
  public  long count ()  { throw new RuntimeException(); }
  public  boolean equals (Object obj)  { throw new RuntimeException(); }
  public  int hashCode ()  { throw new RuntimeException(); }
  public  java.lang.String toString ()  { throw new RuntimeException(); }
  /** this is to avoid ClassNotFoundException during checkpoint restore */
    scala.Tuple4<java.lang.String, java.lang.Object, java.lang.Object, java.lang.Object> toTuple ()  { throw new RuntimeException(); }
}
