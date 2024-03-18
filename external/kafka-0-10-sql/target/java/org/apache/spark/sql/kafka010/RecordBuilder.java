package org.apache.spark.sql.kafka010;
public  class RecordBuilder {
  public   RecordBuilder (java.lang.String topic, java.lang.String value)  { throw new RuntimeException(); }
  public  scala.Option<scala.collection.Seq<scala.Tuple2<java.lang.String, byte[]>>> _headers ()  { throw new RuntimeException(); }
  public  scala.Option<java.lang.String> _key ()  { throw new RuntimeException(); }
  public  scala.Option<java.lang.Integer> _partition ()  { throw new RuntimeException(); }
  public  scala.Option<java.lang.Long> _timestamp ()  { throw new RuntimeException(); }
  public  org.apache.kafka.clients.producer.ProducerRecord<java.lang.String, java.lang.String> build ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.kafka010.RecordBuilder headers (scala.collection.Seq<scala.Tuple2<java.lang.String, byte[]>> hdrs)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.kafka010.RecordBuilder key (java.lang.String k)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.kafka010.RecordBuilder partition (java.lang.Integer part)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.kafka010.RecordBuilder partition (int part)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.kafka010.RecordBuilder timestamp (java.lang.Long ts)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.kafka010.RecordBuilder timestamp (long ts)  { throw new RuntimeException(); }
}
