package org.apache.spark.sql.catalyst.expressions.aggregate;
/**
 * Return a percentile value based on a continuous distribution of
 * numeric column at the given percentage (specified in ORDER BY clause).
 * The value of percentage must be between 0.0 and 1.0.
 */
public  class PercentileCont extends org.apache.spark.sql.catalyst.expressions.aggregate.AggregateFunction implements org.apache.spark.sql.catalyst.expressions.RuntimeReplaceableAggregate, org.apache.spark.sql.catalyst.expressions.ImplicitCastInputTypes, org.apache.spark.sql.catalyst.trees.BinaryLike<org.apache.spark.sql.catalyst.expressions.Expression>, scala.Product, scala.Serializable {
  static public abstract  R apply (T1 v1, T2 v2, T3 v3)  ;
  static public  java.lang.String toString ()  { throw new RuntimeException(); }
  public final  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> children ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<scala.Enumeration.Value> nodePatterns ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.expressions.Expression preCanonicalized ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.expressions.Expression left ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.expressions.Expression right ()  { throw new RuntimeException(); }
  public  boolean reverse ()  { throw new RuntimeException(); }
  // not preceding
  public   PercentileCont (org.apache.spark.sql.catalyst.expressions.Expression left, org.apache.spark.sql.catalyst.expressions.Expression right, boolean reverse)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.expressions.Expression replacement ()  { throw new RuntimeException(); }
  public  java.lang.String nodeName ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.sql.types.AbstractDataType> inputTypes ()  { throw new RuntimeException(); }
  public  java.lang.String sql (boolean isDistinct)  { throw new RuntimeException(); }
  protected  org.apache.spark.sql.catalyst.expressions.aggregate.PercentileCont withNewChildrenInternal (org.apache.spark.sql.catalyst.expressions.Expression newLeft, org.apache.spark.sql.catalyst.expressions.Expression newRight)  { throw new RuntimeException(); }
}
