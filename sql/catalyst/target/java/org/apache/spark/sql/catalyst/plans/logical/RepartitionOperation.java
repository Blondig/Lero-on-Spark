package org.apache.spark.sql.catalyst.plans.logical;
/**
 * A base interface for {@link RepartitionByExpression} and {@link Repartition}
 */
public abstract class RepartitionOperation extends org.apache.spark.sql.catalyst.plans.logical.LogicalPlan implements org.apache.spark.sql.catalyst.plans.logical.UnaryNode {
  public   RepartitionOperation ()  { throw new RuntimeException(); }
  public final  scala.collection.Seq<org.apache.spark.sql.catalyst.plans.logical.LogicalPlan> children ()  { throw new RuntimeException(); }
  public final  scala.Option<java.lang.Object> maxRows ()  { throw new RuntimeException(); }
  public final  scala.collection.Seq<scala.Enumeration.Value> nodePatterns ()  { throw new RuntimeException(); }
  public abstract  int numPartitions ()  ;
  public  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Attribute> output ()  { throw new RuntimeException(); }
  public abstract  org.apache.spark.sql.catalyst.plans.physical.Partitioning partitioning ()  ;
  public abstract  boolean shuffle ()  ;
  protected  org.apache.spark.sql.catalyst.expressions.ExpressionSet validConstraints ()  { throw new RuntimeException(); }
}
