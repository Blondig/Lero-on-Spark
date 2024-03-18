package org.apache.spark.sql.catalyst.plans.logical;
/**
 * A logical plan node with single child.
 */
public  interface UnaryNode extends org.apache.spark.sql.catalyst.trees.UnaryLike<org.apache.spark.sql.catalyst.plans.logical.LogicalPlan> {
  /**
   * Generates all valid constraints including an set of aliased constraints by replacing the
   * original constraint expressions with the corresponding alias
   * @param projectList (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.catalyst.expressions.ExpressionSet getAllValidConstraints (scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.NamedExpression> projectList)  ;
  public  org.apache.spark.sql.catalyst.expressions.ExpressionSet validConstraints ()  ;
}
