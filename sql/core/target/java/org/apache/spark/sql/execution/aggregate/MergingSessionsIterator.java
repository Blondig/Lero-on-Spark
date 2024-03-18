package org.apache.spark.sql.execution.aggregate;
/**
 * This is a variant of SortAggregateIterator which merges the session windows based on the fact
 * input rows are sorted by "group keys + the start time of session window".
 * <p>
 * When merging windows, it also applies aggregations on merged window, which eliminates the
 * necessity on buffering inputs (which requires copying rows) and update the session spec
 * for each input.
 */
public  class MergingSessionsIterator extends org.apache.spark.sql.execution.aggregate.AggregationIterator {
  public   MergingSessionsIterator (int partIndex, scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.NamedExpression> groupingExpressions, org.apache.spark.sql.catalyst.expressions.NamedExpression sessionExpression, scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Attribute> valueAttributes, scala.collection.Iterator<org.apache.spark.sql.catalyst.InternalRow> inputIterator, scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.aggregate.AggregateExpression> aggregateExpressions, scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Attribute> aggregateAttributes, int initialInputBufferOffset, scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.NamedExpression> resultExpressions, scala.Function2<scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression>, scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Attribute>, org.apache.spark.sql.catalyst.expressions.MutableProjection> newMutableProjection, org.apache.spark.sql.execution.metric.SQLMetric numOutputRows)  { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.NamedExpression> groupingWithoutSession ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Attribute> groupingWithoutSessionAttributes ()  { throw new RuntimeException(); }
  public final  boolean hasNext ()  { throw new RuntimeException(); }
  protected  void initialize ()  { throw new RuntimeException(); }
  public final  org.apache.spark.sql.catalyst.expressions.UnsafeRow next ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.expressions.UnsafeRow outputForEmptyGroupingKeyWithoutInput ()  { throw new RuntimeException(); }
  /** Processes rows in the current group. It will stop when it find a new group. */
  protected  void processCurrentSortedGroup ()  { throw new RuntimeException(); }
}
