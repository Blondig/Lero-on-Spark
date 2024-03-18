package org.apache.spark.sql.catalyst.expressions.aggregate;
public  class V2Aggregator<BUF extends java.io.Serializable, OUT extends java.lang.Object> extends org.apache.spark.sql.catalyst.expressions.aggregate.TypedImperativeAggregate<BUF> implements org.apache.spark.sql.catalyst.expressions.ImplicitCastInputTypes, scala.Product, scala.Serializable {
  public  org.apache.spark.sql.connector.catalog.functions.AggregateFunction<BUF, OUT> aggrFunc ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> children ()  { throw new RuntimeException(); }
  public  int mutableAggBufferOffset ()  { throw new RuntimeException(); }
  public  int inputAggBufferOffset ()  { throw new RuntimeException(); }
  // not preceding
  public   V2Aggregator (org.apache.spark.sql.connector.catalog.functions.AggregateFunction<BUF, OUT> aggrFunc, scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> children, int mutableAggBufferOffset, int inputAggBufferOffset)  { throw new RuntimeException(); }
  public  boolean nullable ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.types.DataType dataType ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.sql.types.AbstractDataType> inputTypes ()  { throw new RuntimeException(); }
  public  BUF createAggregationBuffer ()  { throw new RuntimeException(); }
  public  BUF update (BUF buffer, org.apache.spark.sql.catalyst.InternalRow input)  { throw new RuntimeException(); }
  public  BUF merge (BUF buffer, BUF input)  { throw new RuntimeException(); }
  public  Object eval (BUF buffer)  { throw new RuntimeException(); }
  public  byte[] serialize (BUF buffer)  { throw new RuntimeException(); }
  public  BUF deserialize (byte[] bytes)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.expressions.aggregate.V2Aggregator<BUF, OUT> withNewMutableAggBufferOffset (int newMutableAggBufferOffset)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.expressions.aggregate.V2Aggregator<BUF, OUT> withNewInputAggBufferOffset (int newInputAggBufferOffset)  { throw new RuntimeException(); }
  protected  org.apache.spark.sql.catalyst.expressions.Expression withNewChildrenInternal (scala.collection.IndexedSeq<org.apache.spark.sql.catalyst.expressions.Expression> newChildren)  { throw new RuntimeException(); }
}
