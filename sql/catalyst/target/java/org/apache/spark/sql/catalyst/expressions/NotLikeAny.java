package org.apache.spark.sql.catalyst.expressions;
public  class NotLikeAny extends org.apache.spark.sql.catalyst.expressions.LikeAnyBase implements scala.Product, scala.Serializable {
  static public abstract  R apply (T1 v1, T2 v2)  ;
  static public  java.lang.String toString ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.expressions.Expression child ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.unsafe.types.UTF8String> patterns ()  { throw new RuntimeException(); }
  // not preceding
  public   NotLikeAny (org.apache.spark.sql.catalyst.expressions.Expression child, scala.collection.Seq<org.apache.spark.unsafe.types.UTF8String> patterns)  { throw new RuntimeException(); }
  public  boolean isNotSpecified ()  { throw new RuntimeException(); }
  protected  org.apache.spark.sql.catalyst.expressions.NotLikeAny withNewChildInternal (org.apache.spark.sql.catalyst.expressions.Expression newChild)  { throw new RuntimeException(); }
}
