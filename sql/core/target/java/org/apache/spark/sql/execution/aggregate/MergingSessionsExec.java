package org.apache.spark.sql.execution.aggregate;
/**
 * This node is a variant of SortAggregateExec which merges the session windows based on the fact
 * child node will provide inputs as sorted by group keys + the start time of session window.
 * <p>
 * When merging windows, it also applies aggregations on merged window, which eliminates the
 * necessity on buffering inputs (which requires copying rows) and update the session spec
 * for each input.
 * <p>
 * This class receives requiredChildDistribution from caller, to enable merging session in
 * local partition before shuffling. Specifying both parameters to None won't trigger shuffle,
 * but sort would still happen per local partition.
 * <p>
 * Refer {@link MergingSessionsIterator} for more details.
 */
public  class MergingSessionsExec extends org.apache.spark.sql.execution.SparkPlan implements org.apache.spark.sql.execution.aggregate.BaseAggregateExec, scala.Product, scala.Serializable {
  static public abstract  R apply (T1 v1, T2 v2, T3 v3, T4 v4, T5 v5, T6 v6, T7 v7, T8 v8, T9 v9, T10 v10)  ;
  static public  java.lang.String toString ()  { throw new RuntimeException(); }
  protected  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.AttributeReference> aggregateBufferAttributes ()  { throw new RuntimeException(); }
  public final  scala.collection.Seq<org.apache.spark.sql.execution.SparkPlan> children ()  { throw new RuntimeException(); }
  public  scala.Option<scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression>> requiredChildDistributionExpressions ()  { throw new RuntimeException(); }
  public  boolean isStreaming ()  { throw new RuntimeException(); }
  public  scala.Option<java.lang.Object> numShufflePartitions ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.NamedExpression> groupingExpressions ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.expressions.NamedExpression sessionExpression ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.aggregate.AggregateExpression> aggregateExpressions ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Attribute> aggregateAttributes ()  { throw new RuntimeException(); }
  public  int initialInputBufferOffset ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.NamedExpression> resultExpressions ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.execution.SparkPlan child ()  { throw new RuntimeException(); }
  // not preceding
  public   MergingSessionsExec (scala.Option<scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression>> requiredChildDistributionExpressions, boolean isStreaming, scala.Option<java.lang.Object> numShufflePartitions, scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.NamedExpression> groupingExpressions, org.apache.spark.sql.catalyst.expressions.NamedExpression sessionExpression, scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.aggregate.AggregateExpression> aggregateExpressions, scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Attribute> aggregateAttributes, int initialInputBufferOffset, scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.NamedExpression> resultExpressions, org.apache.spark.sql.execution.SparkPlan child)  { throw new RuntimeException(); }
  // not preceding
  public  scala.collection.immutable.Map<java.lang.String, org.apache.spark.sql.execution.metric.SQLMetric> metrics ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Attribute> output ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.SortOrder> outputOrdering ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.SortOrder>> requiredChildOrdering ()  { throw new RuntimeException(); }
  protected  org.apache.spark.rdd.RDD<org.apache.spark.sql.catalyst.InternalRow> doExecute ()  { throw new RuntimeException(); }
  protected  org.apache.spark.sql.execution.aggregate.MergingSessionsExec withNewChildInternal (org.apache.spark.sql.execution.SparkPlan newChild)  { throw new RuntimeException(); }
}
