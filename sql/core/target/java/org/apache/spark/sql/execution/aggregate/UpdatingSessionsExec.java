package org.apache.spark.sql.execution.aggregate;
/**
 * This node updates the session window spec of each input rows via analyzing neighbor rows and
 * determining rows belong to the same session window. The number of input rows remains the same.
 * This node requires sort on input rows by group keys + the start time of session window.
 * <p>
 * There are lots of overhead compared to {@link MergingSessionsExec}. Use {@link MergingSessionsExec}
 * instead whenever possible. Use this node only when we cannot apply both calculations
 * determining session windows and aggregating rows in session window altogether.
 * <p>
 * Refer {@link UpdatingSessionsIterator} for more details.
 */
public  class UpdatingSessionsExec extends org.apache.spark.sql.execution.SparkPlan implements org.apache.spark.sql.execution.UnaryExecNode, scala.Product, scala.Serializable {
  static public abstract  R apply (T1 v1, T2 v2, T3 v3, T4 v4, T5 v5)  ;
  static public  java.lang.String toString ()  { throw new RuntimeException(); }
  public final  scala.collection.Seq<org.apache.spark.sql.execution.SparkPlan> children ()  { throw new RuntimeException(); }
  public  boolean isStreaming ()  { throw new RuntimeException(); }
  public  scala.Option<java.lang.Object> numShufflePartitions ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Attribute> groupingExpression ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.expressions.Attribute sessionExpression ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.execution.SparkPlan child ()  { throw new RuntimeException(); }
  // not preceding
  public   UpdatingSessionsExec (boolean isStreaming, scala.Option<java.lang.Object> numShufflePartitions, scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Attribute> groupingExpression, org.apache.spark.sql.catalyst.expressions.Attribute sessionExpression, org.apache.spark.sql.execution.SparkPlan child)  { throw new RuntimeException(); }
  protected  org.apache.spark.rdd.RDD<org.apache.spark.sql.catalyst.InternalRow> doExecute ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Attribute> output ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.plans.physical.Partitioning outputPartitioning ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.sql.catalyst.plans.physical.Distribution> requiredChildDistribution ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.SortOrder>> requiredChildOrdering ()  { throw new RuntimeException(); }
  protected  org.apache.spark.sql.execution.aggregate.UpdatingSessionsExec withNewChildInternal (org.apache.spark.sql.execution.SparkPlan newChild)  { throw new RuntimeException(); }
}
