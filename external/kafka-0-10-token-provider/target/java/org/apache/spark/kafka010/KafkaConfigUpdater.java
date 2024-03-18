package org.apache.spark.kafka010;
/**
 * Class to conveniently update Kafka config params, while logging the changes
 */
  class KafkaConfigUpdater implements org.apache.spark.internal.Logging, scala.Product, scala.Serializable {
  static public abstract  R apply (T1 v1, T2 v2)  ;
  static public  java.lang.String toString ()  { throw new RuntimeException(); }
  public  java.lang.String module ()  { throw new RuntimeException(); }
  public  scala.collection.immutable.Map<java.lang.String, java.lang.Object> kafkaParams ()  { throw new RuntimeException(); }
  // not preceding
  public   KafkaConfigUpdater (java.lang.String module, scala.collection.immutable.Map<java.lang.String, java.lang.Object> kafkaParams)  { throw new RuntimeException(); }
  public  org.apache.spark.kafka010.KafkaConfigUpdater set (java.lang.String key, java.lang.Object value)  { throw new RuntimeException(); }
  public  org.apache.spark.kafka010.KafkaConfigUpdater setIfUnset (java.lang.String key, java.lang.Object value)  { throw new RuntimeException(); }
  public  org.apache.spark.kafka010.KafkaConfigUpdater setAuthenticationConfigIfNeeded ()  { throw new RuntimeException(); }
  public  org.apache.spark.kafka010.KafkaConfigUpdater setAuthenticationConfigIfNeeded (scala.Option<org.apache.spark.kafka010.KafkaTokenClusterConf> clusterConfig)  { throw new RuntimeException(); }
  public  java.util.Map<java.lang.String, java.lang.Object> build ()  { throw new RuntimeException(); }
}
