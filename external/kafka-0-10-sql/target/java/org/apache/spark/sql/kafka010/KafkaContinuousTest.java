package org.apache.spark.sql.kafka010;
public  interface KafkaContinuousTest {
  public  void afterEach ()  ;
  public  void beforeEach ()  ;
  public  org.apache.spark.sql.test.TestSparkSession createSparkSession ()  ;
  public  org.apache.spark.sql.streaming.Trigger defaultTrigger ()  ;
  public  void setTopicPartitions (java.lang.String topic, int newCount, org.apache.spark.sql.execution.streaming.StreamExecution query)  ;
}
