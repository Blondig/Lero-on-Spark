package org.apache.spark.sql.catalyst.analysis;
/**
 * Represents unresolved having clause, the child for it can be Aggregate, GroupingSets, Rollup
 * and Cube. It is turned by the analyzer into a Filter.
 */
public  class UnresolvedHaving extends org.apache.spark.sql.catalyst.plans.logical.LogicalPlan implements org.apache.spark.sql.catalyst.plans.logical.UnaryNode, scala.Product, scala.Serializable {
  static public abstract  R apply (T1 v1, T2 v2)  ;
  static public  java.lang.String toString ()  { throw new RuntimeException(); }
  protected  org.apache.spark.sql.catalyst.expressions.ExpressionSet validConstraints ()  { throw new RuntimeException(); }
  public final  scala.collection.Seq<org.apache.spark.sql.catalyst.plans.logical.LogicalPlan> children ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.expressions.Expression havingCondition ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan child ()  { throw new RuntimeException(); }
  // not preceding
  public   UnresolvedHaving (org.apache.spark.sql.catalyst.expressions.Expression havingCondition, org.apache.spark.sql.catalyst.plans.logical.LogicalPlan child)  { throw new RuntimeException(); }
  // not preceding
  public  boolean resolved ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Attribute> output ()  { throw new RuntimeException(); }
  protected  org.apache.spark.sql.catalyst.analysis.UnresolvedHaving withNewChildInternal (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan newChild)  { throw new RuntimeException(); }
}
