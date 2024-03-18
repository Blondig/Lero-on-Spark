package org.apache.spark.sql.execution.aggregate;
/**
 * This class calculates and updates the session window for each element in the given iterator,
 * which makes elements in the same session window having same session spec. Downstream can apply
 * aggregation to finally merge these elements bound to the same session window.
 * <p>
 * This class works on the precondition that given iterator is sorted by "group keys + start time
 * of session window", and this iterator still retains the characteristic of the sort.
 * <p>
 * This class copies the elements to safely update on each element, as well as buffers elements
 * which are bound to the same session window. Due to such overheads, {@link MergingSessionsIterator}
 * should be used whenever possible.
 */
public  class UpdatingSessionsIterator implements scala.collection.Iterator<org.apache.spark.sql.catalyst.InternalRow> {
  public   UpdatingSessionsIterator (scala.collection.Iterator<org.apache.spark.sql.catalyst.InternalRow> iter, scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.NamedExpression> groupingExpressions, org.apache.spark.sql.catalyst.expressions.NamedExpression sessionExpression, scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Attribute> inputSchema, int inMemoryThreshold, int spillThreshold)  { throw new RuntimeException(); }
  public  boolean hasNext ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.InternalRow next ()  { throw new RuntimeException(); }
  public  void updateSessionEnd (org.apache.spark.sql.catalyst.expressions.UnsafeRow sessionStruct, long sessionEnd)  { throw new RuntimeException(); }
}
