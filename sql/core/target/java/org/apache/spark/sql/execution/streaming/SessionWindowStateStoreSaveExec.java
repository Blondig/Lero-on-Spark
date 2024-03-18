package org.apache.spark.sql.execution.streaming;
/**
 * This class replaces existing sessions for the grouping key with new sessions in state store.
 * All inputs are valid on storing into state store; don't filter out via watermark while storing.
 * Refer the method doc of {@link StreamingSessionWindowStateManager.updateSessions} for more details.
 * <p>
 * This class will provide the output according to the output mode.
 * Update mode is not supported as the semantic is not feasible for session window.
 */
public  class SessionWindowStateStoreSaveExec extends org.apache.spark.sql.execution.SparkPlan implements org.apache.spark.sql.execution.UnaryExecNode, org.apache.spark.sql.execution.streaming.StateStoreWriter, org.apache.spark.sql.execution.streaming.WatermarkSupport, scala.Product, scala.Serializable {
  static public abstract  R apply (T1 v1, T2 v2, T3 v3, T4 v4, T5 v5, T6 v6, T7 v7)  ;
  static public  java.lang.String toString ()  { throw new RuntimeException(); }
  public  scala.Option<org.apache.spark.sql.catalyst.expressions.Expression> watermarkExpression ()  { throw new RuntimeException(); }
  public  scala.Option<org.apache.spark.sql.catalyst.expressions.BasePredicate> watermarkPredicateForKeys ()  { throw new RuntimeException(); }
  public  scala.Option<org.apache.spark.sql.catalyst.expressions.BasePredicate> watermarkPredicateForData ()  { throw new RuntimeException(); }
  public  scala.collection.immutable.Map<java.lang.String, org.apache.spark.sql.execution.metric.SQLMetric> metrics ()  { throw new RuntimeException(); }
  public final  scala.collection.Seq<org.apache.spark.sql.execution.SparkPlan> children ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Attribute> keyWithoutSessionExpressions ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.expressions.Attribute sessionExpression ()  { throw new RuntimeException(); }
  public  scala.Option<org.apache.spark.sql.execution.streaming.StatefulOperatorStateInfo> stateInfo ()  { throw new RuntimeException(); }
  public  scala.Option<org.apache.spark.sql.streaming.OutputMode> outputMode ()  { throw new RuntimeException(); }
  public  scala.Option<java.lang.Object> eventTimeWatermark ()  { throw new RuntimeException(); }
  public  int stateFormatVersion ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.execution.SparkPlan child ()  { throw new RuntimeException(); }
  // not preceding
  public   SessionWindowStateStoreSaveExec (scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Attribute> keyWithoutSessionExpressions, org.apache.spark.sql.catalyst.expressions.Attribute sessionExpression, scala.Option<org.apache.spark.sql.execution.streaming.StatefulOperatorStateInfo> stateInfo, scala.Option<org.apache.spark.sql.streaming.OutputMode> outputMode, scala.Option<java.lang.Object> eventTimeWatermark, int stateFormatVersion, org.apache.spark.sql.execution.SparkPlan child)  { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Attribute> keyExpressions ()  { throw new RuntimeException(); }
  protected  org.apache.spark.rdd.RDD<org.apache.spark.sql.catalyst.InternalRow> doExecute ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Attribute> output ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.plans.physical.Partitioning outputPartitioning ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.sql.catalyst.plans.physical.Distribution> requiredChildDistribution ()  { throw new RuntimeException(); }
  public  boolean shouldRunAnotherBatch (org.apache.spark.sql.execution.streaming.OffsetSeqMetadata newMetadata)  { throw new RuntimeException(); }
  protected  org.apache.spark.sql.execution.SparkPlan withNewChildInternal (org.apache.spark.sql.execution.SparkPlan newChild)  { throw new RuntimeException(); }
  /**
   * The class overrides this method since dropping late events are happening in the upstream node
   * {@link SessionWindowStateStoreRestoreExec}, and this class has responsibility to report the number
   * of dropped late events as a part of StateOperatorProgress.
   * <p>
   * This method should be called in the driver after this SparkPlan has been executed and metrics
   * have been updated.
   * @return (undocumented)
   */
  public  org.apache.spark.sql.streaming.StateOperatorProgress getProgress ()  { throw new RuntimeException(); }
}
