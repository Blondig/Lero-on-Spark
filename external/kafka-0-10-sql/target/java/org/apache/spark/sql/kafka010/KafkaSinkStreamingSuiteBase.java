package org.apache.spark.sql.kafka010;
public abstract class KafkaSinkStreamingSuiteBase extends org.apache.spark.sql.kafka010.KafkaSinkSuiteBase {
  public   KafkaSinkStreamingSuiteBase ()  { throw new RuntimeException(); }
  protected  org.apache.spark.sql.streaming.StreamingQuery createKafkaWriter (org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> input, scala.Option<java.lang.String> withTopic, scala.Option<org.apache.spark.sql.streaming.OutputMode> withOutputMode, scala.collection.immutable.Map<java.lang.String, java.lang.String> withOptions, scala.collection.Seq<java.lang.String> withSelectExpr)  { throw new RuntimeException(); }
  protected abstract  org.apache.spark.sql.execution.streaming.MemoryStreamBase<java.lang.String> createMemoryStream ()  ;
  protected abstract  scala.Option<org.apache.spark.sql.streaming.Trigger> defaultTrigger ()  ;
  protected  org.scalatest.time.Span streamingTimeout ()  { throw new RuntimeException(); }
  protected abstract  void verifyResult (org.apache.spark.sql.streaming.StreamingQuery writer, scala.Function0<scala.runtime.BoxedUnit> verifyFn)  ;
}
