package org.apache.spark.sql.catalyst.expressions.aggregate;
public  class BitAndAgg extends org.apache.spark.sql.catalyst.expressions.aggregate.BitAggregate implements scala.Product, scala.Serializable {
  static public abstract  R apply (T1 v1)  ;
  static public  java.lang.String toString ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.expressions.Expression child ()  { throw new RuntimeException(); }
  // not preceding
  public   BitAndAgg (org.apache.spark.sql.catalyst.expressions.Expression child)  { throw new RuntimeException(); }
  public  java.lang.String nodeName ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.expressions.BinaryArithmetic bitOperator (org.apache.spark.sql.catalyst.expressions.Expression left, org.apache.spark.sql.catalyst.expressions.Expression right)  { throw new RuntimeException(); }
  protected  org.apache.spark.sql.catalyst.expressions.aggregate.BitAndAgg withNewChildInternal (org.apache.spark.sql.catalyst.expressions.Expression newChild)  { throw new RuntimeException(); }
}