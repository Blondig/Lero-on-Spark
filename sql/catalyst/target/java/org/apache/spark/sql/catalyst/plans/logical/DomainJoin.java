package org.apache.spark.sql.catalyst.plans.logical;
/**
 * A placeholder for domain join that can be added when decorrelating subqueries.
 * It should be rewritten during the optimization phase.
 */
public  class DomainJoin extends org.apache.spark.sql.catalyst.plans.logical.LogicalPlan implements org.apache.spark.sql.catalyst.plans.logical.UnaryNode, scala.Product, scala.Serializable {
  static public abstract  R apply (T1 v1, T2 v2, T3 v3, T4 v4)  ;
  static public  java.lang.String toString ()  { throw new RuntimeException(); }
  protected  org.apache.spark.sql.catalyst.expressions.ExpressionSet validConstraints ()  { throw new RuntimeException(); }
  public final  scala.collection.Seq<org.apache.spark.sql.catalyst.plans.logical.LogicalPlan> children ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Attribute> domainAttrs ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan child ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.plans.JoinType joinType ()  { throw new RuntimeException(); }
  public  scala.Option<org.apache.spark.sql.catalyst.expressions.Expression> condition ()  { throw new RuntimeException(); }
  // not preceding
  public   DomainJoin (scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Attribute> domainAttrs, org.apache.spark.sql.catalyst.plans.logical.LogicalPlan child, org.apache.spark.sql.catalyst.plans.JoinType joinType, scala.Option<org.apache.spark.sql.catalyst.expressions.Expression> condition)  { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Attribute> output ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.expressions.AttributeSet producedAttributes ()  { throw new RuntimeException(); }
  protected  org.apache.spark.sql.catalyst.plans.logical.DomainJoin withNewChildInternal (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan newChild)  { throw new RuntimeException(); }
}
