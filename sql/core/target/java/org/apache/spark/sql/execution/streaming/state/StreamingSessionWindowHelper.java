package org.apache.spark.sql.execution.streaming.state;
public  class StreamingSessionWindowHelper {
  public   StreamingSessionWindowHelper (org.apache.spark.sql.catalyst.expressions.Attribute sessionExpression, scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Attribute> inputSchema)  { throw new RuntimeException(); }
  /** extract session_window (start, end) from UnsafeRow */
  public  scala.Tuple2<java.lang.Object, java.lang.Object> extractTimePair (org.apache.spark.sql.catalyst.InternalRow value)  { throw new RuntimeException(); }
}
