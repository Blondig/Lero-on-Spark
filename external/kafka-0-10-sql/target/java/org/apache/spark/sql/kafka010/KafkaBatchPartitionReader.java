package org.apache.spark.sql.kafka010;
/** A {@link PartitionReader} for reading Kafka data in a micro-batch streaming query. */
public  class KafkaBatchPartitionReader implements org.apache.spark.sql.connector.read.PartitionReader<org.apache.spark.sql.catalyst.InternalRow>, org.apache.spark.internal.Logging, scala.Product, scala.Serializable {
  static public abstract  R apply (T1 v1, T2 v2, T3 v3, T4 v4, T5 v5)  ;
  static public  java.lang.String toString ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.kafka010.KafkaOffsetRange offsetRange ()  { throw new RuntimeException(); }
  public  java.util.Map<java.lang.String, java.lang.Object> executorKafkaParams ()  { throw new RuntimeException(); }
  public  long pollTimeoutMs ()  { throw new RuntimeException(); }
  public  boolean failOnDataLoss ()  { throw new RuntimeException(); }
  public  boolean includeHeaders ()  { throw new RuntimeException(); }
  // not preceding
  public   KafkaBatchPartitionReader (org.apache.spark.sql.kafka010.KafkaOffsetRange offsetRange, java.util.Map<java.lang.String, java.lang.Object> executorKafkaParams, long pollTimeoutMs, boolean failOnDataLoss, boolean includeHeaders)  { throw new RuntimeException(); }
  public  boolean next ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.expressions.UnsafeRow get ()  { throw new RuntimeException(); }
  public  void close ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.connector.metric.CustomTaskMetric[] currentMetricsValues ()  { throw new RuntimeException(); }
}
