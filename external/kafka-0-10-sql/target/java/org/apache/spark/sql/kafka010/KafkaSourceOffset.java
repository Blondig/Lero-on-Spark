package org.apache.spark.sql.kafka010;
/**
 * An {@link Offset} for the {@link KafkaSource}. This one tracks all partitions of subscribed topics and
 * their offsets.
 */
  class KafkaSourceOffset extends org.apache.spark.sql.execution.streaming.Offset implements scala.Product, scala.Serializable {
  static public  scala.collection.immutable.Map<org.apache.kafka.common.TopicPartition, java.lang.Object> getPartitionOffsets (org.apache.spark.sql.execution.streaming.Offset offset)  { throw new RuntimeException(); }
  /**
   * Returns {@link KafkaSourceOffset} from a variable sequence of (topic, partitionId, offset)
   * tuples.
   * @param offsetTuples (undocumented)
   * @return (undocumented)
   */
  static public  org.apache.spark.sql.kafka010.KafkaSourceOffset apply (scala.collection.Seq<scala.Tuple3<java.lang.String, java.lang.Object, java.lang.Object>> offsetTuples)  { throw new RuntimeException(); }
  /**
   * Returns {@link KafkaSourceOffset} from a JSON {@link SerializedOffset}
   * @param offset (undocumented)
   * @return (undocumented)
   */
  static public  org.apache.spark.sql.kafka010.KafkaSourceOffset apply (org.apache.spark.sql.execution.streaming.SerializedOffset offset)  { throw new RuntimeException(); }
  /**
   * Returns {@link KafkaSourceOffset} from a streaming.Offset
   * @param offset (undocumented)
   * @return (undocumented)
   */
  static public  org.apache.spark.sql.kafka010.KafkaSourceOffset apply (org.apache.spark.sql.connector.read.streaming.Offset offset)  { throw new RuntimeException(); }
  public  scala.collection.immutable.Map<org.apache.kafka.common.TopicPartition, java.lang.Object> partitionToOffsets ()  { throw new RuntimeException(); }
  // not preceding
  public   KafkaSourceOffset (scala.collection.immutable.Map<org.apache.kafka.common.TopicPartition, java.lang.Object> partitionToOffsets)  { throw new RuntimeException(); }
  public  java.lang.String json ()  { throw new RuntimeException(); }
}
