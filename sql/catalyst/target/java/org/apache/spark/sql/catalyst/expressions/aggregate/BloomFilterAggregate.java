package org.apache.spark.sql.catalyst.expressions.aggregate;
/**
 * An internal aggregate function that creates a Bloom filter from input values.
 * <p>
 * param:  child                     Child expression of Long values for creating a Bloom filter.
 * param:  estimatedNumItemsExpression The number of estimated distinct items (optional).
 * param:  numBitsExpression         The number of bits to use (optional).
 */
public  class BloomFilterAggregate extends org.apache.spark.sql.catalyst.expressions.aggregate.TypedImperativeAggregate<org.apache.spark.util.sketch.BloomFilter> implements org.apache.spark.sql.catalyst.trees.TernaryLike<org.apache.spark.sql.catalyst.expressions.Expression>, scala.Product, scala.Serializable {
  public final  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> children ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.expressions.Expression child ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.expressions.Expression estimatedNumItemsExpression ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.expressions.Expression numBitsExpression ()  { throw new RuntimeException(); }
  public  int mutableAggBufferOffset ()  { throw new RuntimeException(); }
  public  int inputAggBufferOffset ()  { throw new RuntimeException(); }
  // not preceding
  public   BloomFilterAggregate (org.apache.spark.sql.catalyst.expressions.Expression child, org.apache.spark.sql.catalyst.expressions.Expression estimatedNumItemsExpression, org.apache.spark.sql.catalyst.expressions.Expression numBitsExpression, int mutableAggBufferOffset, int inputAggBufferOffset)  { throw new RuntimeException(); }
  public   BloomFilterAggregate (org.apache.spark.sql.catalyst.expressions.Expression child, org.apache.spark.sql.catalyst.expressions.Expression estimatedNumItemsExpression, org.apache.spark.sql.catalyst.expressions.Expression numBitsExpression)  { throw new RuntimeException(); }
  public   BloomFilterAggregate (org.apache.spark.sql.catalyst.expressions.Expression child, org.apache.spark.sql.catalyst.expressions.Expression estimatedNumItemsExpression)  { throw new RuntimeException(); }
  public   BloomFilterAggregate (org.apache.spark.sql.catalyst.expressions.Expression child)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.analysis.TypeCheckResult checkInputDataTypes ()  { throw new RuntimeException(); }
  public  boolean nullable ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.types.DataType dataType ()  { throw new RuntimeException(); }
  public  java.lang.String prettyName ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.expressions.Expression first ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.expressions.Expression second ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.expressions.Expression third ()  { throw new RuntimeException(); }
  protected  org.apache.spark.sql.catalyst.expressions.aggregate.BloomFilterAggregate withNewChildrenInternal (org.apache.spark.sql.catalyst.expressions.Expression newChild, org.apache.spark.sql.catalyst.expressions.Expression newEstimatedNumItemsExpression, org.apache.spark.sql.catalyst.expressions.Expression newNumBitsExpression)  { throw new RuntimeException(); }
  public  org.apache.spark.util.sketch.BloomFilter createAggregationBuffer ()  { throw new RuntimeException(); }
  public  org.apache.spark.util.sketch.BloomFilter update (org.apache.spark.util.sketch.BloomFilter buffer, org.apache.spark.sql.catalyst.InternalRow inputRow)  { throw new RuntimeException(); }
  public  org.apache.spark.util.sketch.BloomFilter merge (org.apache.spark.util.sketch.BloomFilter buffer, org.apache.spark.util.sketch.BloomFilter other)  { throw new RuntimeException(); }
  public  Object eval (org.apache.spark.util.sketch.BloomFilter buffer)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.expressions.aggregate.BloomFilterAggregate withNewMutableAggBufferOffset (int newOffset)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.expressions.aggregate.BloomFilterAggregate withNewInputAggBufferOffset (int newOffset)  { throw new RuntimeException(); }
  public  byte[] serialize (org.apache.spark.util.sketch.BloomFilter obj)  { throw new RuntimeException(); }
  public  org.apache.spark.util.sketch.BloomFilter deserialize (byte[] bytes)  { throw new RuntimeException(); }
}
