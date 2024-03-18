package org.apache.spark.sql.kafka010;
  class KafkaBatch implements org.apache.spark.sql.connector.read.Batch, org.apache.spark.internal.Logging {
  public   KafkaBatch (org.apache.spark.sql.kafka010.ConsumerStrategy strategy, org.apache.spark.sql.catalyst.util.CaseInsensitiveMap<java.lang.String> sourceOptions, scala.collection.immutable.Map<java.lang.String, java.lang.String> specifiedKafkaParams, boolean failOnDataLoss, org.apache.spark.sql.kafka010.KafkaOffsetRangeLimit startingOffsets, org.apache.spark.sql.kafka010.KafkaOffsetRangeLimit endingOffsets, boolean includeHeaders)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.connector.read.PartitionReaderFactory createReaderFactory ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.connector.read.InputPartition[] planInputPartitions ()  { throw new RuntimeException(); }
    long pollTimeoutMs ()  { throw new RuntimeException(); }
  public  java.lang.String toString ()  { throw new RuntimeException(); }
}
