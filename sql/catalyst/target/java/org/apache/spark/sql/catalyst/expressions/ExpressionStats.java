package org.apache.spark.sql.catalyst.expressions;
/**
 * A wrapper in place of using Seq[Expression] to record a group of equivalent expressions.
 * <p>
 * This saves a lot of memory when there are a lot of expressions in a same equivalence group.
 * Instead of appending to a mutable list/buffer of Expressions, just update the "flattened"
 * useCount in this wrapper in-place.
 */
public  class ExpressionStats implements scala.Product, scala.Serializable {
  public  org.apache.spark.sql.catalyst.expressions.Expression expr ()  { throw new RuntimeException(); }
  public  int useCount ()  { throw new RuntimeException(); }
  // not preceding
  public   ExpressionStats (org.apache.spark.sql.catalyst.expressions.Expression expr, int useCount)  { throw new RuntimeException(); }
}
