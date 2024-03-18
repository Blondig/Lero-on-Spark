package org.apache.spark.sql.catalyst.expressions.aggregate;
/**
 * The Percentile aggregate function returns the percentile(s) based on a discrete distribution of
 * numeric column <code>expr</code> at the given percentage(s) with value range in [0.0, 1.0].
 * <p>
 * Because the number of elements and their partial order cannot be determined in advance.
 * Therefore we have to store all the elements in memory, and so notice that too many elements can
 * cause GC paused and eventually OutOfMemory Errors.
 */
public  class PercentileDisc extends org.apache.spark.sql.catalyst.expressions.aggregate.PercentileBase implements org.apache.spark.sql.catalyst.trees.BinaryLike<org.apache.spark.sql.catalyst.expressions.Expression>, scala.Product, scala.Serializable {
  static public abstract  R apply (T1 v1, T2 v2, T3 v3, T4 v4, T5 v5)  ;
  static public  java.lang.String toString ()  { throw new RuntimeException(); }
  public final  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> children ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.expressions.Expression child ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.expressions.Expression percentageExpression ()  { throw new RuntimeException(); }
  public  boolean reverse ()  { throw new RuntimeException(); }
  public  int mutableAggBufferOffset ()  { throw new RuntimeException(); }
  public  int inputAggBufferOffset ()  { throw new RuntimeException(); }
  // not preceding
  public   PercentileDisc (org.apache.spark.sql.catalyst.expressions.Expression child, org.apache.spark.sql.catalyst.expressions.Expression percentageExpression, boolean reverse, int mutableAggBufferOffset, int inputAggBufferOffset)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.expressions.Expression frequencyExpression ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.expressions.Expression left ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.expressions.Expression right ()  { throw new RuntimeException(); }
  public  java.lang.String prettyName ()  { throw new RuntimeException(); }
  public  boolean discrete ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.expressions.aggregate.PercentileDisc withNewMutableAggBufferOffset (int newMutableAggBufferOffset)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.expressions.aggregate.PercentileDisc withNewInputAggBufferOffset (int newInputAggBufferOffset)  { throw new RuntimeException(); }
  public  java.lang.String sql (boolean isDistinct)  { throw new RuntimeException(); }
  protected  org.apache.spark.sql.catalyst.expressions.aggregate.PercentileDisc withNewChildrenInternal (org.apache.spark.sql.catalyst.expressions.Expression newLeft, org.apache.spark.sql.catalyst.expressions.Expression newRight)  { throw new RuntimeException(); }
}
