package org.apache.spark.sql.catalyst.analysis;
/**
 * An intermediate expression to hold a resolved (nested) column. Some rules may need to undo the
 * column resolution and use this expression to keep the original column name.
 */
public  class TempResolvedColumn extends org.apache.spark.sql.catalyst.expressions.UnaryExpression implements org.apache.spark.sql.catalyst.expressions.Unevaluable, scala.Product, scala.Serializable {
  static public abstract  R apply (T1 v1, T2 v2)  ;
  static public  java.lang.String toString ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.expressions.Expression child ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<java.lang.String> nameParts ()  { throw new RuntimeException(); }
  // not preceding
  public   TempResolvedColumn (org.apache.spark.sql.catalyst.expressions.Expression child, scala.collection.Seq<java.lang.String> nameParts)  { throw new RuntimeException(); }
  // not preceding
  public  org.apache.spark.sql.catalyst.expressions.Expression preCanonicalized ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.types.DataType dataType ()  { throw new RuntimeException(); }
  protected  org.apache.spark.sql.catalyst.expressions.Expression withNewChildInternal (org.apache.spark.sql.catalyst.expressions.Expression newChild)  { throw new RuntimeException(); }
  public  java.lang.String sql ()  { throw new RuntimeException(); }
}
