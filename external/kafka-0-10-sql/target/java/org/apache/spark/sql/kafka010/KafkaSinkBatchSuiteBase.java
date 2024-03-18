package org.apache.spark.sql.kafka010;
public abstract class KafkaSinkBatchSuiteBase extends org.apache.spark.sql.kafka010.KafkaSinkSuiteBase {
  public   KafkaSinkBatchSuiteBase ()  { throw new RuntimeException(); }
  public  scala.collection.immutable.Set<java.lang.Object> partitionsInTopic (java.lang.String topic)  { throw new RuntimeException(); }
  protected  void testUnsupportedSaveModes (scala.Function1<org.apache.spark.sql.SaveMode, scala.collection.Seq<java.lang.String>> msg)  { throw new RuntimeException(); }
  public  void writeToKafka (org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> df, java.lang.String topic, scala.collection.immutable.Map<java.lang.String, java.lang.String> options)  { throw new RuntimeException(); }
}
