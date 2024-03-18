package org.apache.spark.sql.catalyst.expressions;
/**
 * A base interface for expressions that contain a {@link LogicalPlan}.
 * <p>
 * param:  plan: the subquery plan
 * param:  outerAttrs: the outer references in the subquery plan
 * param:  exprId: ID of the expression
 * param:  joinCond: the join conditions with the outer query. It contains both inner and outer
 *                  query references.
 */
public abstract class SubqueryExpression extends org.apache.spark.sql.catalyst.expressions.PlanExpression<org.apache.spark.sql.catalyst.plans.logical.LogicalPlan> {
  /**
   * Returns true when an expression contains an IN or correlated EXISTS subquery
   * and false otherwise.
   * @param e (undocumented)
   * @return (undocumented)
   */
  static public  boolean hasInOrCorrelatedExistsSubquery (org.apache.spark.sql.catalyst.expressions.Expression e)  { throw new RuntimeException(); }
  /**
   * Returns true when an expression contains a subquery that has outer reference(s). The outer
   * reference attributes are kept as children of subquery expression by
   * {@link org.apache.spark.sql.catalyst.analysis.Analyzer.ResolveSubquery}
   * @param e (undocumented)
   * @return (undocumented)
   */
  static public  boolean hasCorrelatedSubquery (org.apache.spark.sql.catalyst.expressions.Expression e)  { throw new RuntimeException(); }
  /**
   * Returns true when an expression contains a subquery
   * @param e (undocumented)
   * @return (undocumented)
   */
  static public  boolean hasSubquery (org.apache.spark.sql.catalyst.expressions.Expression e)  { throw new RuntimeException(); }
  public   SubqueryExpression (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan, scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> outerAttrs, org.apache.spark.sql.catalyst.expressions.ExprId exprId, scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> joinCond)  { throw new RuntimeException(); }
  // not preceding
  public  boolean resolved ()  { throw new RuntimeException(); }
  // not preceding
  public  org.apache.spark.sql.catalyst.expressions.AttributeSet references ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> children ()  { throw new RuntimeException(); }
  public abstract  org.apache.spark.sql.catalyst.expressions.SubqueryExpression withNewPlan (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan)  ;
  public  boolean isCorrelated ()  { throw new RuntimeException(); }
}
