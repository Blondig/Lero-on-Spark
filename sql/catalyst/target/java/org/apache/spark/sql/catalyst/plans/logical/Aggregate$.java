package org.apache.spark.sql.catalyst.plans.logical;
public  class Aggregate$ implements scala.Serializable {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final Aggregate$ MODULE$ = null;
  public   Aggregate$ ()  { throw new RuntimeException(); }
  public  boolean isAggregateBufferMutable (org.apache.spark.sql.types.StructType schema)  { throw new RuntimeException(); }
  public  boolean supportsHashAggregate (scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Attribute> aggregateBufferAttributes)  { throw new RuntimeException(); }
  public  boolean supportsObjectHashAggregate (scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.aggregate.AggregateExpression> aggregateExpressions)  { throw new RuntimeException(); }
}
