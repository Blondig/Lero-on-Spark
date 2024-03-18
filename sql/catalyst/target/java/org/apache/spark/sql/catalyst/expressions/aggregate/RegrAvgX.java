package org.apache.spark.sql.catalyst.expressions.aggregate;
public  class RegrAvgX extends org.apache.spark.sql.catalyst.expressions.aggregate.AggregateFunction implements org.apache.spark.sql.catalyst.expressions.RuntimeReplaceableAggregate, org.apache.spark.sql.catalyst.expressions.ImplicitCastInputTypes, org.apache.spark.sql.catalyst.trees.BinaryLike<org.apache.spark.sql.catalyst.expressions.Expression>, scala.Product, scala.Serializable {
  static public abstract  R apply (T1 v1, T2 v2)  ;
  static public  java.lang.String toString ()  { throw new RuntimeException(); }
  public final  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> children ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<scala.Enumeration.Value> nodePatterns ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.expressions.Expression preCanonicalized ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.expressions.Expression left ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.expressions.Expression right ()  { throw new RuntimeException(); }
  // not preceding
  public   RegrAvgX (org.apache.spark.sql.catalyst.expressions.Expression left, org.apache.spark.sql.catalyst.expressions.Expression right)  { throw new RuntimeException(); }
  // not preceding
  public  org.apache.spark.sql.catalyst.expressions.Expression replacement ()  { throw new RuntimeException(); }
  public  java.lang.String nodeName ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.sql.types.AbstractDataType> inputTypes ()  { throw new RuntimeException(); }
  protected  org.apache.spark.sql.catalyst.expressions.aggregate.RegrAvgX withNewChildrenInternal (org.apache.spark.sql.catalyst.expressions.Expression newLeft, org.apache.spark.sql.catalyst.expressions.Expression newRight)  { throw new RuntimeException(); }
}
