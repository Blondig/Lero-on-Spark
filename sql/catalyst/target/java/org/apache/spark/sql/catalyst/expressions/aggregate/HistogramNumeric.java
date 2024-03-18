package org.apache.spark.sql.catalyst.expressions.aggregate;
/**
 * Computes an approximate histogram of a numerical column using a user-specified number of bins.
 * <p>
 * The output is an array of (x,y) pairs as struct objects that represents the histogram's
 * bin centers and heights.
 */
public  class HistogramNumeric extends org.apache.spark.sql.catalyst.expressions.aggregate.TypedImperativeAggregate<org.apache.spark.sql.util.NumericHistogram> implements org.apache.spark.sql.catalyst.expressions.ImplicitCastInputTypes, org.apache.spark.sql.catalyst.trees.BinaryLike<org.apache.spark.sql.catalyst.expressions.Expression>, scala.Product, scala.Serializable {
  static public abstract  R apply (T1 v1, T2 v2, T3 v3, T4 v4)  ;
  static public  java.lang.String toString ()  { throw new RuntimeException(); }
  public final  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> children ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.expressions.Expression child ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.expressions.Expression nBins ()  { throw new RuntimeException(); }
  public  int mutableAggBufferOffset ()  { throw new RuntimeException(); }
  public  int inputAggBufferOffset ()  { throw new RuntimeException(); }
  // not preceding
  public   HistogramNumeric (org.apache.spark.sql.catalyst.expressions.Expression child, org.apache.spark.sql.catalyst.expressions.Expression nBins, int mutableAggBufferOffset, int inputAggBufferOffset)  { throw new RuntimeException(); }
  public   HistogramNumeric (org.apache.spark.sql.catalyst.expressions.Expression child, org.apache.spark.sql.catalyst.expressions.Expression nBins)  { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.sql.types.AbstractDataType> inputTypes ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.analysis.TypeCheckResult checkInputDataTypes ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.util.NumericHistogram createAggregationBuffer ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.util.NumericHistogram update (org.apache.spark.sql.util.NumericHistogram buffer, org.apache.spark.sql.catalyst.InternalRow inputRow)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.util.NumericHistogram merge (org.apache.spark.sql.util.NumericHistogram buffer, org.apache.spark.sql.util.NumericHistogram other)  { throw new RuntimeException(); }
  public  Object eval (org.apache.spark.sql.util.NumericHistogram buffer)  { throw new RuntimeException(); }
  public  byte[] serialize (org.apache.spark.sql.util.NumericHistogram obj)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.util.NumericHistogram deserialize (byte[] bytes)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.expressions.Expression left ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.expressions.Expression right ()  { throw new RuntimeException(); }
  protected  org.apache.spark.sql.catalyst.expressions.aggregate.HistogramNumeric withNewChildrenInternal (org.apache.spark.sql.catalyst.expressions.Expression newLeft, org.apache.spark.sql.catalyst.expressions.Expression newRight)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.expressions.aggregate.HistogramNumeric withNewMutableAggBufferOffset (int newOffset)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.expressions.aggregate.HistogramNumeric withNewInputAggBufferOffset (int newOffset)  { throw new RuntimeException(); }
  public  boolean nullable ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.types.DataType dataType ()  { throw new RuntimeException(); }
  public  java.lang.String prettyName ()  { throw new RuntimeException(); }
}
