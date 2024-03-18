package org.apache.spark.sql.catalyst.plans.logical;
/**
 * A logical plan for as-of join.
 */
public  class AsOfJoin extends org.apache.spark.sql.catalyst.plans.logical.LogicalPlan implements org.apache.spark.sql.catalyst.plans.logical.BinaryNode, scala.Product, scala.Serializable {
  static public  org.apache.spark.sql.catalyst.plans.logical.AsOfJoin apply (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan left, org.apache.spark.sql.catalyst.plans.logical.LogicalPlan right, org.apache.spark.sql.catalyst.expressions.Expression leftAsOf, org.apache.spark.sql.catalyst.expressions.Expression rightAsOf, scala.Option<org.apache.spark.sql.catalyst.expressions.Expression> condition, org.apache.spark.sql.catalyst.plans.JoinType joinType, scala.Option<org.apache.spark.sql.catalyst.expressions.Expression> tolerance, boolean allowExactMatches, org.apache.spark.sql.catalyst.plans.AsOfJoinDirection direction)  { throw new RuntimeException(); }
  public final  scala.collection.Seq<org.apache.spark.sql.catalyst.plans.logical.LogicalPlan> children ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan left ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan right ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.expressions.Expression asOfCondition ()  { throw new RuntimeException(); }
  public  scala.Option<org.apache.spark.sql.catalyst.expressions.Expression> condition ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.plans.JoinType joinType ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.expressions.Expression orderExpression ()  { throw new RuntimeException(); }
  public  scala.Option<org.apache.spark.sql.catalyst.expressions.Expression> toleranceAssertion ()  { throw new RuntimeException(); }
  // not preceding
  public   AsOfJoin (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan left, org.apache.spark.sql.catalyst.plans.logical.LogicalPlan right, org.apache.spark.sql.catalyst.expressions.Expression asOfCondition, scala.Option<org.apache.spark.sql.catalyst.expressions.Expression> condition, org.apache.spark.sql.catalyst.plans.JoinType joinType, org.apache.spark.sql.catalyst.expressions.Expression orderExpression, scala.Option<org.apache.spark.sql.catalyst.expressions.Expression> toleranceAssertion)  { throw new RuntimeException(); }
  protected  scala.collection.Iterator<java.lang.Object> stringArgs ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Attribute> output ()  { throw new RuntimeException(); }
  public  boolean duplicateResolved ()  { throw new RuntimeException(); }
  // not preceding
  public  boolean resolved ()  { throw new RuntimeException(); }
  public final  scala.collection.Seq<scala.Enumeration.Value> nodePatterns ()  { throw new RuntimeException(); }
  protected  org.apache.spark.sql.catalyst.plans.logical.AsOfJoin withNewChildrenInternal (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan newLeft, org.apache.spark.sql.catalyst.plans.logical.LogicalPlan newRight)  { throw new RuntimeException(); }
}
