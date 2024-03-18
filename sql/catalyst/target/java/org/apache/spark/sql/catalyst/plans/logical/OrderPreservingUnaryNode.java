package org.apache.spark.sql.catalyst.plans.logical;
public abstract class OrderPreservingUnaryNode extends org.apache.spark.sql.catalyst.plans.logical.LogicalPlan implements org.apache.spark.sql.catalyst.plans.logical.UnaryNode {
  public   OrderPreservingUnaryNode ()  { throw new RuntimeException(); }
  public final  scala.collection.Seq<org.apache.spark.sql.catalyst.plans.logical.LogicalPlan> children ()  { throw new RuntimeException(); }
  public final  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.SortOrder> outputOrdering ()  { throw new RuntimeException(); }
  protected  org.apache.spark.sql.catalyst.expressions.ExpressionSet validConstraints ()  { throw new RuntimeException(); }
}
