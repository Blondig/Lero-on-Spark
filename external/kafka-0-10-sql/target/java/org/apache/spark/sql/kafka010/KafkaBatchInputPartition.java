package org.apache.spark.sql.kafka010;
/** A {@link InputPartition} for reading Kafka data in a batch based streaming query. */
  class KafkaBatchInputPartition implements org.apache.spark.sql.connector.read.InputPartition, scala.Product, scala.Serializable {
  static public abstract  R apply (T1 v1, T2 v2, T3 v3, T4 v4, T5 v5)  ;
  static public  java.lang.String toString ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.kafka010.KafkaOffsetRange offsetRange ()  { throw new RuntimeException(); }
  public  java.util.Map<java.lang.String, java.lang.Object> executorKafkaParams ()  { throw new RuntimeException(); }
  public  long pollTimeoutMs ()  { throw new RuntimeException(); }
  public  boolean failOnDataLoss ()  { throw new RuntimeException(); }
  public  boolean includeHeaders ()  { throw new RuntimeException(); }
  // not preceding
  public   KafkaBatchInputPartition (org.apache.spark.sql.kafka010.KafkaOffsetRange offsetRange, java.util.Map<java.lang.String, java.lang.Object> executorKafkaParams, long pollTimeoutMs, boolean failOnDataLoss, boolean includeHeaders)  { throw new RuntimeException(); }
}
