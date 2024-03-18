package org.apache.spark.sql.catalyst.expressions.aggregate;
/**
 * The Percentile aggregate function returns the exact percentile(s) of numeric column <code>expr</code> at
 * the given percentage(s) with value range in [0.0, 1.0].
 * <p>
 * Because the number of elements and their partial order cannot be determined in advance.
 * Therefore we have to store all the elements in memory, and so notice that too many elements can
 * cause GC paused and eventually OutOfMemory Errors.
 * <p>
 * param:  child child expression that produce numeric column value with <code>child.eval(inputRow)</code>
 * param:  percentageExpression Expression that represents a single percentage value or an array of
 *                             percentage values. Each percentage value must be in the range
 *                             [0.0, 1.0].
 */
public  class Percentile extends org.apache.spark.sql.catalyst.expressions.aggregate.PercentileBase implements org.apache.spark.sql.catalyst.trees.TernaryLike<org.apache.spark.sql.catalyst.expressions.Expression>, scala.Product, scala.Serializable {
  static public abstract  R apply (T1 v1, T2 v2, T3 v3, T4 v4, T5 v5, T6 v6)  ;
  static public  java.lang.String toString ()  { throw new RuntimeException(); }
  public final  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> children ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.expressions.Expression child ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.expressions.Expression percentageExpression ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.expressions.Expression frequencyExpression ()  { throw new RuntimeException(); }
  public  int mutableAggBufferOffset ()  { throw new RuntimeException(); }
  public  int inputAggBufferOffset ()  { throw new RuntimeException(); }
  public  boolean reverse ()  { throw new RuntimeException(); }
  // not preceding
  public   Percentile (org.apache.spark.sql.catalyst.expressions.Expression child, org.apache.spark.sql.catalyst.expressions.Expression percentageExpression, org.apache.spark.sql.catalyst.expressions.Expression frequencyExpression, int mutableAggBufferOffset, int inputAggBufferOffset, boolean reverse)  { throw new RuntimeException(); }
  public   Percentile (org.apache.spark.sql.catalyst.expressions.Expression child, org.apache.spark.sql.catalyst.expressions.Expression percentageExpression)  { throw new RuntimeException(); }
  public   Percentile (org.apache.spark.sql.catalyst.expressions.Expression child, org.apache.spark.sql.catalyst.expressions.Expression percentageExpression, org.apache.spark.sql.catalyst.expressions.Expression frequency)  { throw new RuntimeException(); }
  public   Percentile (org.apache.spark.sql.catalyst.expressions.Expression child, org.apache.spark.sql.catalyst.expressions.Expression percentageExpression, boolean reverse)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.expressions.Expression first ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.expressions.Expression second ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.expressions.Expression third ()  { throw new RuntimeException(); }
  public  java.lang.String prettyName ()  { throw new RuntimeException(); }
  public  boolean discrete ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.expressions.aggregate.Percentile withNewMutableAggBufferOffset (int newMutableAggBufferOffset)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.expressions.aggregate.Percentile withNewInputAggBufferOffset (int newInputAggBufferOffset)  { throw new RuntimeException(); }
  protected  scala.collection.Iterator<java.lang.Object> stringArgs ()  { throw new RuntimeException(); }
  protected  org.apache.spark.sql.catalyst.expressions.aggregate.Percentile withNewChildrenInternal (org.apache.spark.sql.catalyst.expressions.Expression newFirst, org.apache.spark.sql.catalyst.expressions.Expression newSecond, org.apache.spark.sql.catalyst.expressions.Expression newThird)  { throw new RuntimeException(); }
}
