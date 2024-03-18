package org.apache.spark.sql.kafka010;
public  class KafkaWrite implements org.apache.spark.sql.connector.write.Write, scala.Product, scala.Serializable {
  static public abstract  R apply (T1 v1, T2 v2, T3 v3)  ;
  static public  java.lang.String toString ()  { throw new RuntimeException(); }
  public  scala.Option<java.lang.String> topic ()  { throw new RuntimeException(); }
  public  java.util.Map<java.lang.String, java.lang.Object> producerParams ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.types.StructType schema ()  { throw new RuntimeException(); }
  // not preceding
  public   KafkaWrite (scala.Option<java.lang.String> topic, java.util.Map<java.lang.String, java.lang.Object> producerParams, org.apache.spark.sql.types.StructType schema)  { throw new RuntimeException(); }
  public  java.lang.String description ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.connector.write.BatchWrite toBatch ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.connector.write.streaming.StreamingWrite toStreaming ()  { throw new RuntimeException(); }
}
