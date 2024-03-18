package org.apache.spark.sql.catalyst.expressions.codegen;
/**
 * State used for subexpression elimination.
 * <p>
 * param:  eval The source code for evaluating the subexpression.
 * param:  children The sequence of subexpressions as the children expressions. Before
 *                 evaluating this subexpression, we should evaluate all children
 *                 subexpressions first. This is used if we want to selectively evaluate
 *                 particular subexpressions, instead of all at once. In the case, we need
 *                 to make sure we evaluate all children subexpressions too.
 */
public  class SubExprEliminationState implements scala.Product, scala.Serializable {
  static public  org.apache.spark.sql.catalyst.expressions.codegen.SubExprEliminationState apply (org.apache.spark.sql.catalyst.expressions.codegen.ExprCode eval)  { throw new RuntimeException(); }
  static public  org.apache.spark.sql.catalyst.expressions.codegen.SubExprEliminationState apply (org.apache.spark.sql.catalyst.expressions.codegen.ExprCode eval, scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.codegen.SubExprEliminationState> children)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.expressions.codegen.ExprCode eval ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.codegen.SubExprEliminationState> children ()  { throw new RuntimeException(); }
  // not preceding
  public   SubExprEliminationState (org.apache.spark.sql.catalyst.expressions.codegen.ExprCode eval, scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.codegen.SubExprEliminationState> children)  { throw new RuntimeException(); }
}
