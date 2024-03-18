package org.apache.spark.sql.catalyst.expressions;
/**
 * An expression that contains conditional expression branches, so not all branches will be hit.
 * All optimization should be careful with the evaluation order.
 */
public  interface ConditionalExpression {
  /**
   * Return the children expressions which can always be hit at runtime.
   * @return (undocumented)
   */
  public  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> alwaysEvaluatedInputs ()  ;
  /**
   * Return groups of branches. For each group, at least one branch will be hit at runtime,
   * so that we can eagerly evaluate the common expressions of a group.
   * @return (undocumented)
   */
  public  scala.collection.Seq<scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression>> branchGroups ()  ;
  public  boolean foldable ()  ;
}
