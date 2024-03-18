package org.apache.spark.sql.kafka010;
/**
 * This is a basic test trait which will set up a Kafka cluster that keeps only several records in
 * a topic and ages out records very quickly. This is a helper trait to test
 * "failonDataLoss=false" case with missing offsets.
 * <p>
 * Note: there is a hard-code 30 seconds delay (kafka.log.LogManager.InitialTaskDelayMs) to clean up
 * records. Hence each class extending this trait needs to wait at least 30 seconds (or even longer
 * when running on a slow Jenkins machine) before records start to be removed. To make sure a test
 * does see missing offsets, you can check the earliest offset in <code>eventually</code> and make sure it's
 * not 0 rather than sleeping a hard-code duration.
 */
public  interface KafkaMissingOffsetsTest extends org.apache.spark.sql.test.SharedSparkSession {
  public  void afterAll ()  ;
  public  void beforeAll ()  ;
  public  org.apache.spark.sql.test.TestSparkSession createSparkSession ()  ;
  public  org.apache.spark.sql.kafka010.KafkaTestUtils testUtils ()  ;
}
