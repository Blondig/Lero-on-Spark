package org.apache.spark.sql.kafka010;
/**
 * Represents the desire to bind to earliest offset which timestamp for the offset is equal or
 * greater than specific timestamp. This applies the timestamp to the all topics/partitions.
 */
  class GlobalTimestampRangeLimit implements org.apache.spark.sql.kafka010.KafkaOffsetRangeLimit, scala.Product, scala.Serializable {
  static public abstract  R apply (T1 v1, T2 v2)  ;
  static public  java.lang.String toString ()  { throw new RuntimeException(); }
  public  long timestamp ()  { throw new RuntimeException(); }
  public  scala.Enumeration.Value strategyOnNoMatchingStartingOffset ()  { throw new RuntimeException(); }
  // not preceding
  public   GlobalTimestampRangeLimit (long timestamp, scala.Enumeration.Value strategyOnNoMatchingStartingOffset)  { throw new RuntimeException(); }
}
