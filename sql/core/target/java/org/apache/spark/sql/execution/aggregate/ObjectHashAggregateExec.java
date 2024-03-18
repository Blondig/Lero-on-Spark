package org.apache.spark.sql.execution.aggregate;
/**
 * A hash-based aggregate operator that supports {@link TypedImperativeAggregate} functions that may
 * use arbitrary JVM objects as aggregation states.
 * <p>
 * Similar to {@link HashAggregateExec}, this operator also falls back to sort-based aggregation when
 * the size of the internal hash map exceeds the threshold. The differences are:
 * <p>
 *  - It uses safe rows as aggregation buffer since it must support JVM objects as aggregation
 *    states.
 * <p>
 *  - It tracks entry count of the hash map instead of byte size to decide when we should fall back.
 *    This is because it's hard to estimate the accurate size of arbitrary JVM objects in a
 *    lightweight way.
 * <p>
 *  - Whenever fallen back to sort-based aggregation, this operator feeds all of the rest input rows
 *    into external sorters instead of building more hash map(s) as what {@link HashAggregateExec} does.
 *    This is because having too many JVM object aggregation states floating there can be dangerous
 *    for GC.
 * <p>
 *  - CodeGen is not supported yet.
 * <p>
 * This operator may be turned off by setting the following SQL configuration to <code>false</code>:
 * <pre><code>
 *   spark.sql.execution.useObjectHashAggregateExec
 * </code></pre>
 * The fallback threshold can be configured by tuning:
 * <pre><code>
 *   spark.sql.objectHashAggregate.sortBased.fallbackThreshold
 * </code></pre>
 */
public  class ObjectHashAggregateExec extends org.apache.spark.sql.execution.SparkPlan implements org.apache.spark.sql.execution.aggregate.BaseAggregateExec, scala.Product, scala.Serializable {
  static public abstract  R apply (T1 v1, T2 v2, T3 v3, T4 v4, T5 v5, T6 v6, T7 v7, T8 v8, T9 v9)  ;
  static public  java.lang.String toString ()  { throw new RuntimeException(); }
  protected  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.AttributeReference> aggregateBufferAttributes ()  { throw new RuntimeException(); }
  public final  scala.collection.Seq<org.apache.spark.sql.execution.SparkPlan> children ()  { throw new RuntimeException(); }
  public  scala.Option<scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression>> requiredChildDistributionExpressions ()  { throw new RuntimeException(); }
  public  boolean isStreaming ()  { throw new RuntimeException(); }
  public  scala.Option<java.lang.Object> numShufflePartitions ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.NamedExpression> groupingExpressions ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.aggregate.AggregateExpression> aggregateExpressions ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Attribute> aggregateAttributes ()  { throw new RuntimeException(); }
  public  int initialInputBufferOffset ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.NamedExpression> resultExpressions ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.execution.SparkPlan child ()  { throw new RuntimeException(); }
  // not preceding
  public   ObjectHashAggregateExec (scala.Option<scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression>> requiredChildDistributionExpressions, boolean isStreaming, scala.Option<java.lang.Object> numShufflePartitions, scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.NamedExpression> groupingExpressions, scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.aggregate.AggregateExpression> aggregateExpressions, scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Attribute> aggregateAttributes, int initialInputBufferOffset, scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.NamedExpression> resultExpressions, org.apache.spark.sql.execution.SparkPlan child)  { throw new RuntimeException(); }
  // not preceding
  public  org.apache.spark.sql.catalyst.expressions.AttributeSeq allAttributes ()  { throw new RuntimeException(); }
  // not preceding
  public  scala.collection.immutable.Map<java.lang.String, org.apache.spark.sql.execution.metric.SQLMetric> metrics ()  { throw new RuntimeException(); }
  protected  org.apache.spark.rdd.RDD<org.apache.spark.sql.catalyst.InternalRow> doExecute ()  { throw new RuntimeException(); }
  public  java.lang.String verboseString (int maxFields)  { throw new RuntimeException(); }
  public  java.lang.String simpleString (int maxFields)  { throw new RuntimeException(); }
  protected  org.apache.spark.sql.execution.aggregate.ObjectHashAggregateExec withNewChildInternal (org.apache.spark.sql.execution.SparkPlan newChild)  { throw new RuntimeException(); }
}
