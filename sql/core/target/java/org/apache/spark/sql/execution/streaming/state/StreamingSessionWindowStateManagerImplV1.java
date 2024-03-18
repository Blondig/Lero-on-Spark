package org.apache.spark.sql.execution.streaming.state;
public  class StreamingSessionWindowStateManagerImplV1 implements org.apache.spark.sql.execution.streaming.state.StreamingSessionWindowStateManager, org.apache.spark.internal.Logging {
  public   StreamingSessionWindowStateManagerImplV1 (scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Attribute> keyWithoutSessionExpressions, org.apache.spark.sql.catalyst.expressions.Attribute sessionExpression, scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Attribute> valueAttributes)  { throw new RuntimeException(); }
  public  void abortIfNeeded (org.apache.spark.sql.execution.streaming.state.StateStore store)  { throw new RuntimeException(); }
  public  long commit (org.apache.spark.sql.execution.streaming.state.StateStore store)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.expressions.UnsafeRow extractKeyWithoutSession (org.apache.spark.sql.catalyst.expressions.UnsafeRow value)  { throw new RuntimeException(); }
  public  int getNumColsForPrefixKey ()  { throw new RuntimeException(); }
  public  scala.collection.Iterator<org.apache.spark.sql.catalyst.expressions.UnsafeRow> getSessions (org.apache.spark.sql.execution.streaming.state.ReadStateStore store, org.apache.spark.sql.catalyst.expressions.UnsafeRow key)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.types.StructType getStateKeySchema ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.types.StructType getStateValueSchema ()  { throw new RuntimeException(); }
  public  scala.collection.Iterator<org.apache.spark.sql.catalyst.expressions.UnsafeRow> iterator (org.apache.spark.sql.execution.streaming.state.ReadStateStore store)  { throw new RuntimeException(); }
  public  boolean newOrModified (org.apache.spark.sql.execution.streaming.state.ReadStateStore store, org.apache.spark.sql.catalyst.expressions.UnsafeRow value)  { throw new RuntimeException(); }
  public  scala.collection.Iterator<org.apache.spark.sql.catalyst.expressions.UnsafeRow> removeByValueCondition (org.apache.spark.sql.execution.streaming.state.StateStore store, scala.Function1<org.apache.spark.sql.catalyst.expressions.UnsafeRow, java.lang.Object> removalCondition)  { throw new RuntimeException(); }
  public  scala.Tuple2<java.lang.Object, java.lang.Object> updateSessions (org.apache.spark.sql.execution.streaming.state.StateStore store, org.apache.spark.sql.catalyst.expressions.UnsafeRow key, scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.UnsafeRow> sessions)  { throw new RuntimeException(); }
}
