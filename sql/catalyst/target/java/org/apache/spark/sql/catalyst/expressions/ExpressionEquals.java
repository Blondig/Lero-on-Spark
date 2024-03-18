package org.apache.spark.sql.catalyst.expressions;
/**
 * Wrapper around an Expression that provides semantic equality.
 */
public  class ExpressionEquals implements scala.Product, scala.Serializable {
  static public abstract  R apply (T1 v1)  ;
  static public  java.lang.String toString ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.expressions.Expression e ()  { throw new RuntimeException(); }
  // not preceding
  public   ExpressionEquals (org.apache.spark.sql.catalyst.expressions.Expression e)  { throw new RuntimeException(); }
  // not preceding
  public  int height ()  { throw new RuntimeException(); }
  public  boolean equals (Object o)  { throw new RuntimeException(); }
  public  int hashCode ()  { throw new RuntimeException(); }
}
