package org.apache.spark.sql.catalyst.expressions.codegen;
/**
 * Codes and common subexpressions mapping used for subexpression elimination.
 * <p>
 * param:  states Foreach expression that is participating in subexpression elimination,
 *               the state to use.
 * param:  exprCodesNeedEvaluate Some expression codes that need to be evaluated before
 *                              calling common subexpressions.
 */
public  class SubExprCodes implements scala.Product, scala.Serializable {
  static public abstract  R apply (T1 v1, T2 v2)  ;
  static public  java.lang.String toString ()  { throw new RuntimeException(); }
  public  scala.collection.immutable.Map<org.apache.spark.sql.catalyst.expressions.ExpressionEquals, org.apache.spark.sql.catalyst.expressions.codegen.SubExprEliminationState> states ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.codegen.ExprCode> exprCodesNeedEvaluate ()  { throw new RuntimeException(); }
  // not preceding
  public   SubExprCodes (scala.collection.immutable.Map<org.apache.spark.sql.catalyst.expressions.ExpressionEquals, org.apache.spark.sql.catalyst.expressions.codegen.SubExprEliminationState> states, scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.codegen.ExprCode> exprCodesNeedEvaluate)  { throw new RuntimeException(); }
}
