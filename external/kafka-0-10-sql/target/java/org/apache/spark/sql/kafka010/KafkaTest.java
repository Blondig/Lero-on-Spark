package org.apache.spark.sql.kafka010;
/** A trait to clean cached Kafka producers in `afterAll` */
public  interface KafkaTest extends org.scalatest.BeforeAndAfterAll {
  public  void afterAll ()  ;
}
