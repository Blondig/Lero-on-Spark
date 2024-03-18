package org.apache.spark.sql.execution.streaming.sources;
public  class ForeachWrite<T extends java.lang.Object> implements org.apache.spark.sql.connector.write.Write {
  // not preceding
  // TypeTree().setOriginal(TypeBoundsTree(TypeTree(), TypeTree()))
  public   ForeachWrite (org.apache.spark.sql.connector.write.LogicalWriteInfo info, org.apache.spark.sql.ForeachWriter<T> writer, scala.util.Either<org.apache.spark.sql.catalyst.encoders.ExpressionEncoder<T>, scala.Function1<org.apache.spark.sql.catalyst.InternalRow, T>> converter)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.connector.write.streaming.StreamingWrite toStreaming ()  { throw new RuntimeException(); }
}
