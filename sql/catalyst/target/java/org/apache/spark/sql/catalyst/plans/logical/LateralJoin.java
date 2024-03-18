package org.apache.spark.sql.catalyst.plans.logical;
/**
 * A logical plan for lateral join.
 */
public  class LateralJoin extends org.apache.spark.sql.catalyst.plans.logical.LogicalPlan implements org.apache.spark.sql.catalyst.plans.logical.UnaryNode, scala.Product, scala.Serializable {
  static public abstract  R apply (T1 v1, T2 v2, T3 v3, T4 v4)  ;
  static public  java.lang.String toString ()  { throw new RuntimeException(); }
  protected  org.apache.spark.sql.catalyst.expressions.ExpressionSet validConstraints ()  { throw new RuntimeException(); }
  public final  scala.collection.Seq<org.apache.spark.sql.catalyst.plans.logical.LogicalPlan> children ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan left ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.expressions.LateralSubquery right ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.plans.JoinType joinType ()  { throw new RuntimeException(); }
  public  scala.Option<org.apache.spark.sql.catalyst.expressions.Expression> condition ()  { throw new RuntimeException(); }
  // not preceding
  public   LateralJoin (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan left, org.apache.spark.sql.catalyst.expressions.LateralSubquery right, org.apache.spark.sql.catalyst.plans.JoinType joinType, scala.Option<org.apache.spark.sql.catalyst.expressions.Expression> condition)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan child ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Attribute> output ()  { throw new RuntimeException(); }
  /**
   * Optionally resolves the given strings to a {@link NamedExpression} using the input from
   * both the left plan and the lateral subquery's plan.
   * @param nameParts (undocumented)
   * @param resolver (undocumented)
   * @return (undocumented)
   */
  public  scala.Option<org.apache.spark.sql.catalyst.expressions.NamedExpression> resolveChildren (scala.collection.Seq<java.lang.String> nameParts, scala.Function2<java.lang.String, java.lang.String, java.lang.Object> resolver)  { throw new RuntimeException(); }
  public  boolean childrenResolved ()  { throw new RuntimeException(); }
  public  boolean duplicateResolved ()  { throw new RuntimeException(); }
  // not preceding
  public  boolean resolved ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.expressions.AttributeSet producedAttributes ()  { throw new RuntimeException(); }
  public final  scala.collection.Seq<scala.Enumeration.Value> nodePatterns ()  { throw new RuntimeException(); }
  protected  org.apache.spark.sql.catalyst.plans.logical.LateralJoin withNewChildInternal (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan newChild)  { throw new RuntimeException(); }
}
