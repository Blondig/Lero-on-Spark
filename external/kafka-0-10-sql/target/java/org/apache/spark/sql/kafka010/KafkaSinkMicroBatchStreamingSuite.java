package org.apache.spark.sql.kafka010;
public  class KafkaSinkMicroBatchStreamingSuite extends org.apache.spark.sql.kafka010.KafkaSinkStreamingSuiteBase {
  public   KafkaSinkMicroBatchStreamingSuite ()  { throw new RuntimeException(); }
  protected  org.apache.spark.sql.execution.streaming.MemoryStreamBase<java.lang.String> createMemoryStream ()  { throw new RuntimeException(); }
  protected  scala.Option<org.apache.spark.sql.streaming.Trigger> defaultTrigger ()  { throw new RuntimeException(); }
  public  org.scalatest.time.Span streamingTimeout ()  { throw new RuntimeException(); }
  protected  void verifyResult (org.apache.spark.sql.streaming.StreamingQuery writer, scala.Function0<scala.runtime.BoxedUnit> verifyFn)  { throw new RuntimeException(); }
}
