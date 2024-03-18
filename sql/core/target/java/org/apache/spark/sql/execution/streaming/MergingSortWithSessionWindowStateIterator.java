package org.apache.spark.sql.execution.streaming;
/**
 * This class technically does the merge sort between input rows and existing sessions in state,
 * to optimize the cost of sort on "input rows + existing sessions". This is based on the
 * precondition that input rows are sorted by "group keys + start time of session window".
 * <p>
 * This only materializes the existing sessions into memory, which are tend to be not many per
 * group key. The cost of sorting existing sessions would be also minor based on the assumption.
 * <p>
 * The output rows are sorted with "group keys + start time of session window", which is same as
 * the sort condition on input rows.
 */
public  class MergingSortWithSessionWindowStateIterator implements scala.collection.Iterator<org.apache.spark.sql.catalyst.InternalRow>, org.apache.spark.internal.Logging {
  public   MergingSortWithSessionWindowStateIterator (scala.collection.Iterator<org.apache.spark.sql.catalyst.InternalRow> iter, org.apache.spark.sql.execution.streaming.state.StreamingSessionWindowStateManager stateManager, org.apache.spark.sql.execution.streaming.state.ReadStateStore store, scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Attribute> groupWithoutSessionExpressions, org.apache.spark.sql.catalyst.expressions.Attribute sessionExpression, scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Attribute> inputSchema)  { throw new RuntimeException(); }
  public  boolean hasNext ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.InternalRow next ()  { throw new RuntimeException(); }
}
