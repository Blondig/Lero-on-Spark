package org.apache.spark.sql.execution.python;
/**
 * A relation produced by applying a function that takes an iterator of batches
 * such as pandas DataFrame or PyArrow's record batches, and outputs an iterator of them.
 * <p>
 * This is somewhat similar with {@link FlatMapGroupsInPandasExec} and
 * <code>org.apache.spark.sql.catalyst.plans.logical.MapPartitionsInRWithArrow</code>
 */
public  interface MapInBatchExec extends org.apache.spark.sql.execution.UnaryExecNode {
  public  org.apache.spark.rdd.RDD<org.apache.spark.sql.catalyst.InternalRow> doExecute ()  ;
  public  org.apache.spark.sql.catalyst.expressions.Expression func ()  ;
  public  org.apache.spark.sql.catalyst.plans.physical.Partitioning outputPartitioning ()  ;
  public  org.apache.spark.sql.catalyst.expressions.AttributeSet producedAttributes ()  ;
  public  int pythonEvalType ()  ;
}
