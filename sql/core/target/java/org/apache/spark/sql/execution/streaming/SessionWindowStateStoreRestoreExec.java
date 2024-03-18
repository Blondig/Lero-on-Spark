package org.apache.spark.sql.execution.streaming;
/**
 * This class sorts input rows and existing sessions in state and provides output rows as
 * sorted by "group keys + start time of session window".
 * <p>
 * Refer {@link MergingSortWithSessionWindowStateIterator} for more details.
 */
public  class SessionWindowStateStoreRestoreExec extends org.apache.spark.sql.execution.SparkPlan implements org.apache.spark.sql.execution.UnaryExecNode, org.apache.spark.sql.execution.streaming.StateStoreReader, org.apache.spark.sql.execution.streaming.WatermarkSupport, scala.Product, scala.Serializable {
  static public abstract  R apply (T1 v1, T2 v2, T3 v3, T4 v4, T5 v5, T6 v6)  ;
  static public  java.lang.String toString ()  { throw new RuntimeException(); }
  public  scala.Option<org.apache.spark.sql.catalyst.expressions.Expression> watermarkExpression ()  { throw new RuntimeException(); }
  public  scala.Option<org.apache.spark.sql.catalyst.expressions.BasePredicate> watermarkPredicateForKeys ()  { throw new RuntimeException(); }
  public  scala.Option<org.apache.spark.sql.catalyst.expressions.BasePredicate> watermarkPredicateForData ()  { throw new RuntimeException(); }
  public final  scala.collection.Seq<org.apache.spark.sql.execution.SparkPlan> children ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Attribute> keyWithoutSessionExpressions ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.expressions.Attribute sessionExpression ()  { throw new RuntimeException(); }
  public  scala.Option<org.apache.spark.sql.execution.streaming.StatefulOperatorStateInfo> stateInfo ()  { throw new RuntimeException(); }
  public  scala.Option<java.lang.Object> eventTimeWatermark ()  { throw new RuntimeException(); }
  public  int stateFormatVersion ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.execution.SparkPlan child ()  { throw new RuntimeException(); }
  // not preceding
  public   SessionWindowStateStoreRestoreExec (scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Attribute> keyWithoutSessionExpressions, org.apache.spark.sql.catalyst.expressions.Attribute sessionExpression, scala.Option<org.apache.spark.sql.execution.streaming.StatefulOperatorStateInfo> stateInfo, scala.Option<java.lang.Object> eventTimeWatermark, int stateFormatVersion, org.apache.spark.sql.execution.SparkPlan child)  { throw new RuntimeException(); }
  // not preceding
  public  scala.collection.immutable.Map<java.lang.String, org.apache.spark.sql.execution.metric.SQLMetric> metrics ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Attribute> keyExpressions ()  { throw new RuntimeException(); }
  protected  org.apache.spark.rdd.RDD<org.apache.spark.sql.catalyst.InternalRow> doExecute ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Attribute> output ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.plans.physical.Partitioning outputPartitioning ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.SortOrder> outputOrdering ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.sql.catalyst.plans.physical.Distribution> requiredChildDistribution ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.SortOrder>> requiredChildOrdering ()  { throw new RuntimeException(); }
  protected  org.apache.spark.sql.execution.SparkPlan withNewChildInternal (org.apache.spark.sql.execution.SparkPlan newChild)  { throw new RuntimeException(); }
}
