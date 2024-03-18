package org.apache.spark.sql.kafka010;
  class KafkaRelation extends org.apache.spark.sql.sources.BaseRelation implements org.apache.spark.sql.sources.TableScan, org.apache.spark.internal.Logging {
  // not preceding
  public   KafkaRelation (org.apache.spark.sql.SQLContext sqlContext, org.apache.spark.sql.kafka010.ConsumerStrategy strategy, org.apache.spark.sql.catalyst.util.CaseInsensitiveMap<java.lang.String> sourceOptions, scala.collection.immutable.Map<java.lang.String, java.lang.String> specifiedKafkaParams, boolean failOnDataLoss, boolean includeHeaders, org.apache.spark.sql.kafka010.KafkaOffsetRangeLimit startingOffsets, org.apache.spark.sql.kafka010.KafkaOffsetRangeLimit endingOffsets)  { throw new RuntimeException(); }
  public  org.apache.spark.rdd.RDD<org.apache.spark.sql.Row> buildScan ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.types.StructType schema ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.SQLContext sqlContext ()  { throw new RuntimeException(); }
  public  java.lang.String toString ()  { throw new RuntimeException(); }
}
