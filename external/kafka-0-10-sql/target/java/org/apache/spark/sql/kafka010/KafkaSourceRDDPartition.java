package org.apache.spark.sql.kafka010;
/** Partition of the KafkaSourceRDD */
  class KafkaSourceRDDPartition implements org.apache.spark.Partition, scala.Product, scala.Serializable {
  static public abstract  R apply (T1 v1, T2 v2)  ;
  static public  java.lang.String toString ()  { throw new RuntimeException(); }
  public  int index ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.kafka010.KafkaOffsetRange offsetRange ()  { throw new RuntimeException(); }
  // not preceding
  public   KafkaSourceRDDPartition (int index, org.apache.spark.sql.kafka010.KafkaOffsetRange offsetRange)  { throw new RuntimeException(); }
}
