package org.apache.spark.sql.kafka010;
public  class KafkaContinuousSinkSuite extends org.apache.spark.sql.kafka010.KafkaSinkStreamingSuiteBase {
  public   KafkaContinuousSinkSuite ()  { throw new RuntimeException(); }
  protected  org.apache.spark.sql.execution.streaming.MemoryStreamBase<java.lang.String> createMemoryStream ()  { throw new RuntimeException(); }
  protected  org.apache.spark.sql.test.TestSparkSession createSparkSession ()  { throw new RuntimeException(); }
  protected  scala.Option<org.apache.spark.sql.streaming.Trigger> defaultTrigger ()  { throw new RuntimeException(); }
  protected  void verifyResult (org.apache.spark.sql.streaming.StreamingQuery writer, scala.Function0<scala.runtime.BoxedUnit> verifyFn)  { throw new RuntimeException(); }
}
