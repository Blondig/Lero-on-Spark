package org.apache.spark.sql.catalyst.expressions;
/**
 * Splits a given string by a specified delimiter and returns the requested part.
 * If any input is null, returns null.
 * If index is out of range of split parts, return empty string.
 * If index is 0, throws an ArrayIndexOutOfBoundsException.
 */
public  class SplitPart extends org.apache.spark.sql.catalyst.expressions.Expression implements org.apache.spark.sql.catalyst.expressions.RuntimeReplaceable, org.apache.spark.sql.catalyst.expressions.ImplicitCastInputTypes, scala.Product, scala.Serializable {
  static public abstract  R apply (T1 v1, T2 v2, T3 v3)  ;
  static public  java.lang.String toString ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<scala.Enumeration.Value> nodePatterns ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.expressions.Expression preCanonicalized ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.expressions.Expression str ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.expressions.Expression delimiter ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.expressions.Expression partNum ()  { throw new RuntimeException(); }
  // not preceding
  public   SplitPart (org.apache.spark.sql.catalyst.expressions.Expression str, org.apache.spark.sql.catalyst.expressions.Expression delimiter, org.apache.spark.sql.catalyst.expressions.Expression partNum)  { throw new RuntimeException(); }
  // not preceding
  public  org.apache.spark.sql.catalyst.expressions.Expression replacement ()  { throw new RuntimeException(); }
  public  java.lang.String nodeName ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.sql.types.DataType> inputTypes ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> children ()  { throw new RuntimeException(); }
  protected  org.apache.spark.sql.catalyst.expressions.Expression withNewChildrenInternal (scala.collection.IndexedSeq<org.apache.spark.sql.catalyst.expressions.Expression> newChildren)  { throw new RuntimeException(); }
}
