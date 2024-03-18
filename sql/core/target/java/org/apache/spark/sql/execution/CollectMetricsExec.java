package org.apache.spark.sql.execution;
/**
 * Collect arbitrary (named) metrics from a {@link SparkPlan}.
 */
public  class CollectMetricsExec extends org.apache.spark.sql.execution.SparkPlan implements org.apache.spark.sql.execution.UnaryExecNode, scala.Product, scala.Serializable {
  /**
   * Recursively collect all collected metrics from a query tree.
   * @param plan (undocumented)
   * @return (undocumented)
   */
  static public  scala.collection.immutable.Map<java.lang.String, org.apache.spark.sql.Row> collect (org.apache.spark.sql.execution.SparkPlan plan)  { throw new RuntimeException(); }
  static public  scala.Option<org.apache.spark.sql.execution.SparkPlan> find (org.apache.spark.sql.execution.SparkPlan p, scala.Function1<org.apache.spark.sql.execution.SparkPlan, java.lang.Object> f)  { throw new RuntimeException(); }
  static public  void foreach (org.apache.spark.sql.execution.SparkPlan p, scala.Function1<org.apache.spark.sql.execution.SparkPlan, scala.runtime.BoxedUnit> f)  { throw new RuntimeException(); }
  static public  void foreachUp (org.apache.spark.sql.execution.SparkPlan p, scala.Function1<org.apache.spark.sql.execution.SparkPlan, scala.runtime.BoxedUnit> f)  { throw new RuntimeException(); }
  static public <A extends java.lang.Object> scala.collection.Seq<A> mapPlans (org.apache.spark.sql.execution.SparkPlan p, scala.Function1<org.apache.spark.sql.execution.SparkPlan, A> f)  { throw new RuntimeException(); }
  static public <A extends java.lang.Object> scala.collection.Seq<A> flatMap (org.apache.spark.sql.execution.SparkPlan p, scala.Function1<org.apache.spark.sql.execution.SparkPlan, scala.collection.TraversableOnce<A>> f)  { throw new RuntimeException(); }
  static public  scala.collection.Seq<org.apache.spark.sql.execution.SparkPlan> collectLeaves (org.apache.spark.sql.execution.SparkPlan p)  { throw new RuntimeException(); }
  static public <B extends java.lang.Object> scala.Option<B> collectFirst (org.apache.spark.sql.execution.SparkPlan p, scala.PartialFunction<org.apache.spark.sql.execution.SparkPlan, B> pf)  { throw new RuntimeException(); }
  static public <B extends java.lang.Object> scala.collection.Seq<B> collectWithSubqueries (org.apache.spark.sql.execution.SparkPlan p, scala.PartialFunction<org.apache.spark.sql.execution.SparkPlan, B> f)  { throw new RuntimeException(); }
  static public  scala.collection.Seq<org.apache.spark.sql.execution.SparkPlan> subqueriesAll (org.apache.spark.sql.execution.SparkPlan p)  { throw new RuntimeException(); }
  static public  org.apache.spark.sql.execution.SparkPlan stripAQEPlan (org.apache.spark.sql.execution.SparkPlan p)  { throw new RuntimeException(); }
  public final  scala.collection.Seq<org.apache.spark.sql.execution.SparkPlan> children ()  { throw new RuntimeException(); }
  public  java.lang.String name ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.NamedExpression> metricExpressions ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.execution.SparkPlan child ()  { throw new RuntimeException(); }
  // not preceding
  public   CollectMetricsExec (java.lang.String name, scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.NamedExpression> metricExpressions, org.apache.spark.sql.execution.SparkPlan child)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.types.StructType metricsSchema ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.Row collectedMetrics ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Attribute> output ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.plans.physical.Partitioning outputPartitioning ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.SortOrder> outputOrdering ()  { throw new RuntimeException(); }
  protected  org.apache.spark.rdd.RDD<org.apache.spark.sql.catalyst.InternalRow> doExecute ()  { throw new RuntimeException(); }
  protected  org.apache.spark.sql.execution.CollectMetricsExec withNewChildInternal (org.apache.spark.sql.execution.SparkPlan newChild)  { throw new RuntimeException(); }
}
