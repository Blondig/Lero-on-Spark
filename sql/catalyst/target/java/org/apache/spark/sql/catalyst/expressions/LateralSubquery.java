package org.apache.spark.sql.catalyst.expressions;
/**
 * A subquery that can return multiple rows and columns. This should be rewritten as a join
 * with the outer query during the optimization phase.
 * <p>
 * Note: <code>exprId</code> is used to have a unique name in explain string output.
 */
public  class LateralSubquery extends org.apache.spark.sql.catalyst.expressions.SubqueryExpression implements org.apache.spark.sql.catalyst.expressions.Unevaluable, scala.Product, scala.Serializable {
  static public abstract  R apply (T1 v1, T2 v2, T3 v3, T4 v4)  ;
  public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> outerAttrs ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.expressions.ExprId exprId ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> joinCond ()  { throw new RuntimeException(); }
  // not preceding
  public   LateralSubquery (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan, scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> outerAttrs, org.apache.spark.sql.catalyst.expressions.ExprId exprId, scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> joinCond)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.types.DataType dataType ()  { throw new RuntimeException(); }
  public  boolean nullable ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.expressions.LateralSubquery withNewPlan (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan)  { throw new RuntimeException(); }
  public  java.lang.String toString ()  { throw new RuntimeException(); }
  // not preceding
  public  org.apache.spark.sql.catalyst.expressions.Expression preCanonicalized ()  { throw new RuntimeException(); }
  protected  org.apache.spark.sql.catalyst.expressions.LateralSubquery withNewChildrenInternal (scala.collection.IndexedSeq<org.apache.spark.sql.catalyst.expressions.Expression> newChildren)  { throw new RuntimeException(); }
  public final  scala.collection.Seq<scala.Enumeration.Value> nodePatternsInternal ()  { throw new RuntimeException(); }
}
