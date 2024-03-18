package org.apache.spark.sql.catalyst.expressions;
/**
 * A leaf expression, i.e. one without any child expressions.
 */
public abstract class LeafExpression extends org.apache.spark.sql.catalyst.expressions.Expression implements org.apache.spark.sql.catalyst.trees.LeafLike<org.apache.spark.sql.catalyst.expressions.Expression> {
  public   LeafExpression ()  { throw new RuntimeException(); }
}
