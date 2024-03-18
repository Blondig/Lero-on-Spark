package org.apache.spark.sql.catalyst.expressions;
/**
 * This class is used to compute equality of (sub)expression trees. Expressions can be added
 * to this class and they subsequently query for expression equality. Expression trees are
 * considered equal if for the same input(s), the same result is produced.
 */
public  class EquivalentExpressions {
  public   EquivalentExpressions ()  { throw new RuntimeException(); }
  /**
   * Adds each expression to this data structure, grouping them with existing equivalent
   * expressions. Non-recursive.
   * Returns true if there was already a matching expression.
   * @param expr (undocumented)
   * @return (undocumented)
   */
  public  boolean addExpr (org.apache.spark.sql.catalyst.expressions.Expression expr)  { throw new RuntimeException(); }
  /**
   * Adds the expression to this data structure recursively. Stops if a matching expression
   * is found. That is, if <code>expr</code> has already been added, its children are not added.
   * @param expr (undocumented)
   * @param map (undocumented)
   */
  public  void addExprTree (org.apache.spark.sql.catalyst.expressions.Expression expr, scala.collection.mutable.HashMap<org.apache.spark.sql.catalyst.expressions.ExpressionEquals, org.apache.spark.sql.catalyst.expressions.ExpressionStats> map)  { throw new RuntimeException(); }
  /**
   * Returns the state of the data structure as a string. If <code>all</code> is false, skips sets of
   * equivalent expressions with cardinality 1.
   * @param all (undocumented)
   * @return (undocumented)
   */
  public  java.lang.String debugString (boolean all)  { throw new RuntimeException(); }
    scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.ExpressionStats> getAllExprStates (int count)  { throw new RuntimeException(); }
  /**
   * Returns a sequence of expressions that more than one equivalent expressions.
   * @return (undocumented)
   */
  public  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> getCommonSubexpressions ()  { throw new RuntimeException(); }
  /**
   * Returns the state of the given expression in the <code>equivalenceMap</code>. Returns None if there is no
   * equivalent expressions.
   * @param e (undocumented)
   * @return (undocumented)
   */
  public  scala.Option<org.apache.spark.sql.catalyst.expressions.ExpressionStats> getExprState (org.apache.spark.sql.catalyst.expressions.Expression e)  { throw new RuntimeException(); }
}
