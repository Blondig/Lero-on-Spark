package org.apache.spark.sql.catalyst.expressions;
/**
 * Simple RegEx case-insensitive pattern matching function
 */
public  class ILike extends org.apache.spark.sql.catalyst.expressions.Expression implements org.apache.spark.sql.catalyst.expressions.RuntimeReplaceable, org.apache.spark.sql.catalyst.expressions.ImplicitCastInputTypes, org.apache.spark.sql.catalyst.trees.BinaryLike<org.apache.spark.sql.catalyst.expressions.Expression>, scala.Product, scala.Serializable {
  static public abstract  R apply (T1 v1, T2 v2, T3 v3)  ;
  static public  java.lang.String toString ()  { throw new RuntimeException(); }
  public final  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> children ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<scala.Enumeration.Value> nodePatterns ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.expressions.Expression preCanonicalized ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.expressions.Expression left ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.expressions.Expression right ()  { throw new RuntimeException(); }
  public  char escapeChar ()  { throw new RuntimeException(); }
  // not preceding
  public   ILike (org.apache.spark.sql.catalyst.expressions.Expression left, org.apache.spark.sql.catalyst.expressions.Expression right, char escapeChar)  { throw new RuntimeException(); }
  // not preceding
  public  org.apache.spark.sql.catalyst.expressions.Expression replacement ()  { throw new RuntimeException(); }
  public   ILike (org.apache.spark.sql.catalyst.expressions.Expression left, org.apache.spark.sql.catalyst.expressions.Expression right)  { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.sql.types.AbstractDataType> inputTypes ()  { throw new RuntimeException(); }
  protected  org.apache.spark.sql.catalyst.expressions.Expression withNewChildrenInternal (org.apache.spark.sql.catalyst.expressions.Expression newLeft, org.apache.spark.sql.catalyst.expressions.Expression newRight)  { throw new RuntimeException(); }
}
