package org.apache.spark.streaming.kafka010;
/**
 * An iterator that fetches messages directly from Kafka for the offsets in partition.
 * Uses a cached consumer where possible to take advantage of prefetching.
 * Intended for compacted topics, or other cases when non-consecutive offsets are ok.
 */
public  class CompactedKafkaRDDIterator<K extends java.lang.Object, V extends java.lang.Object> extends org.apache.spark.streaming.kafka010.KafkaRDDIterator<K, V> {
  // not preceding
  // TypeTree().setOriginal(TypeBoundsTree(TypeTree(), TypeTree()))
  // TypeTree().setOriginal(TypeBoundsTree(TypeTree(), TypeTree()))
  public   CompactedKafkaRDDIterator (org.apache.spark.streaming.kafka010.KafkaRDDPartition part, org.apache.spark.TaskContext context, java.util.Map<java.lang.String, java.lang.Object> kafkaParams, boolean useConsumerCache, long pollTimeout, int cacheInitialCapacity, int cacheMaxCapacity, float cacheLoadFactor)  { throw new RuntimeException(); }
  public  boolean hasNext ()  { throw new RuntimeException(); }
  public  org.apache.kafka.clients.consumer.ConsumerRecord<K, V> next ()  { throw new RuntimeException(); }
}
