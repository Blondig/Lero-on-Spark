package org.apache.spark.sql.catalyst.expressions;
/**
 * Reorders adjacent commutative operators such as {@link And} in the expression tree, according to
 * the <code>hashCode</code> of non-commutative nodes, to remove cosmetic variations. Caller side should only
 * call it on the root node of an expression tree that needs to be canonicalized.
 */
public  class Canonicalize {
  static public  org.apache.spark.sql.catalyst.expressions.Expression reorderCommutativeOperators (org.apache.spark.sql.catalyst.expressions.Expression e)  { throw new RuntimeException(); }
}
