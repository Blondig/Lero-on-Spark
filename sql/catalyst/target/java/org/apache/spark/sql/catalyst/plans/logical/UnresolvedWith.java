package org.apache.spark.sql.catalyst.plans.logical;
/**
 * A container for holding named common table expressions (CTEs) and a query plan.
 * This operator will be removed during analysis and the relations will be substituted into child.
 * <p>
 * param:  child The final query of this CTE.
 * param:  cteRelations A sequence of pair (alias, the CTE definition) that this CTE defined
 *                     Each CTE can see the base tables and the previously defined CTEs only.
 */
public  class UnresolvedWith extends org.apache.spark.sql.catalyst.plans.logical.LogicalPlan implements org.apache.spark.sql.catalyst.plans.logical.UnaryNode, scala.Product, scala.Serializable {
  static public abstract  R apply (T1 v1, T2 v2)  ;
  static public  java.lang.String toString ()  { throw new RuntimeException(); }
  protected  org.apache.spark.sql.catalyst.expressions.ExpressionSet validConstraints ()  { throw new RuntimeException(); }
  public final  scala.collection.Seq<org.apache.spark.sql.catalyst.plans.logical.LogicalPlan> children ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan child ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<scala.Tuple2<java.lang.String, org.apache.spark.sql.catalyst.plans.logical.SubqueryAlias>> cteRelations ()  { throw new RuntimeException(); }
  // not preceding
  public   UnresolvedWith (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan child, scala.collection.Seq<scala.Tuple2<java.lang.String, org.apache.spark.sql.catalyst.plans.logical.SubqueryAlias>> cteRelations)  { throw new RuntimeException(); }
  public final  scala.collection.Seq<scala.Enumeration.Value> nodePatterns ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Attribute> output ()  { throw new RuntimeException(); }
  public  java.lang.String simpleString (int maxFields)  { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.sql.catalyst.plans.logical.LogicalPlan> innerChildren ()  { throw new RuntimeException(); }
  protected  org.apache.spark.sql.catalyst.plans.logical.UnresolvedWith withNewChildInternal (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan newChild)  { throw new RuntimeException(); }
}
