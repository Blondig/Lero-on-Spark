package org.apache.spark.sql.catalyst.expressions;
/**
 * An add-on of {@link AggregateFunction}. This gets rewritten (currently by the optimizer) into a
 * different aggregate expression for evaluation. This is mainly used to provide compatibility
 * with other databases. For example, we use this to support every, any/some aggregates by rewriting
 * them with Min and Max respectively.
 */
public  interface RuntimeReplaceableAggregate extends org.apache.spark.sql.catalyst.expressions.RuntimeReplaceable {
  public  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.AttributeReference> aggBufferAttributes ()  ;
  public  org.apache.spark.sql.types.StructType aggBufferSchema ()  ;
  public  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.AttributeReference> inputAggBufferAttributes ()  ;
}
