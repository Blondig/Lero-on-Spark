package org.apache.spark.sql.kafka010;
public  class KafkaMicroBatchStream$ implements org.apache.spark.internal.Logging {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final KafkaMicroBatchStream$ MODULE$ = null;
  public   KafkaMicroBatchStream$ ()  { throw new RuntimeException(); }
  /**
   * Compute the difference of offset per partition between latestAvailablePartitionOffsets
   * and partition offsets in the latestConsumedOffset.
   * Report min/max/avg offsets behind the latest for all the partitions in the Kafka stream.
   * <p>
   * Because of rate limit, latest consumed offset per partition can be smaller than
   * the latest available offset per partition.
   * @param latestConsumedOffset latest consumed offset
   * @param latestAvailablePartitionOffsets latest available offset per partition
   * @return the generated metrics map
   */
  public  java.util.Map<java.lang.String, java.lang.String> metrics (java.util.Optional<org.apache.spark.sql.connector.read.streaming.Offset> latestConsumedOffset, scala.collection.immutable.Map<org.apache.kafka.common.TopicPartition, java.lang.Object> latestAvailablePartitionOffsets)  { throw new RuntimeException(); }
}
