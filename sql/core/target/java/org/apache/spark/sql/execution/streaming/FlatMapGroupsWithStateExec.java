package org.apache.spark.sql.execution.streaming;
/**
 * Physical operator for executing <code>FlatMapGroupsWithState</code>
 * <p>
 * param:  func function called on each group
 * param:  keyDeserializer used to extract the key object for each group.
 * param:  valueDeserializer used to extract the items in the iterator from an input row.
 * param:  initialStateDeserializer used to extract the state object from the initialState dataset
 * param:  groupingAttributes used to group the data
 * param:  dataAttributes used to read the data
 * param:  outputObjAttr Defines the output object
 * param:  stateEncoder used to serialize/deserialize state before calling <code>func</code>
 * param:  outputMode the output mode of <code>func</code>
 * param:  timeoutConf used to timeout groups that have not received data in a while
 * param:  batchTimestampMs processing timestamp of the current batch.
 * param:  eventTimeWatermark event time watermark for the current batch
 * param:  initialState the user specified initial state
 * param:  hasInitialState indicates whether the initial state is provided or not
 * param:  child the physical plan for the underlying data
 */
public  class FlatMapGroupsWithStateExec extends org.apache.spark.sql.execution.SparkPlan implements org.apache.spark.sql.execution.BinaryExecNode, org.apache.spark.sql.execution.ObjectProducerExec, org.apache.spark.sql.execution.streaming.StateStoreWriter, org.apache.spark.sql.execution.streaming.WatermarkSupport, scala.Product, scala.Serializable {
  /** Helper class to update the state store */
  public  class InputProcessor {
    public   InputProcessor (org.apache.spark.sql.execution.streaming.state.StateStore store)  { throw new RuntimeException(); }
    /**
     * For every group, get the key, values and corresponding state and call the function,
     * and return an iterator of rows
     * @param dataIter (undocumented)
     * @return (undocumented)
     */
    public  scala.collection.Iterator<org.apache.spark.sql.catalyst.InternalRow> processNewData (scala.collection.Iterator<org.apache.spark.sql.catalyst.InternalRow> dataIter)  { throw new RuntimeException(); }
    /**
     * Process the new data iterator along with the initial state. The initial state is applied
     * before processing the new data for every key. The user defined function is called only
     * once for every key that has either initial state or data or both.
     * @param childDataIter (undocumented)
     * @param initStateIter (undocumented)
     * @return (undocumented)
     */
    public  scala.collection.Iterator<org.apache.spark.sql.catalyst.InternalRow> processNewDataWithInitialState (scala.collection.Iterator<org.apache.spark.sql.catalyst.InternalRow> childDataIter, scala.collection.Iterator<org.apache.spark.sql.catalyst.InternalRow> initStateIter)  { throw new RuntimeException(); }
    /** Find the groups that have timeout set and are timing out right now, and call the function */
    public  scala.collection.Iterator<org.apache.spark.sql.catalyst.InternalRow> processTimedOutState ()  { throw new RuntimeException(); }
  }
  static public  java.lang.Exception foundDuplicateInitialKeyException ()  { throw new RuntimeException(); }
  /**
   * Plan logical flatmapGroupsWIthState for batch queries
   * If the initial state is provided, we create an instance of the CoGroupExec, if the initial
   * state is not provided we create an instance of the MapGroupsExec
   * @param userFunc (undocumented)
   * @param keyDeserializer (undocumented)
   * @param valueDeserializer (undocumented)
   * @param initialStateDeserializer (undocumented)
   * @param groupingAttributes (undocumented)
   * @param initialStateGroupAttrs (undocumented)
   * @param dataAttributes (undocumented)
   * @param initialStateDataAttrs (undocumented)
   * @param outputObjAttr (undocumented)
   * @param timeoutConf (undocumented)
   * @param hasInitialState (undocumented)
   * @param initialState (undocumented)
   * @param child (undocumented)
   * @return (undocumented)
   */
  static public  org.apache.spark.sql.execution.SparkPlan generateSparkPlanForBatchQueries (scala.Function3<java.lang.Object, scala.collection.Iterator<java.lang.Object>, org.apache.spark.sql.catalyst.plans.logical.LogicalGroupState<java.lang.Object>, scala.collection.Iterator<java.lang.Object>> userFunc, org.apache.spark.sql.catalyst.expressions.Expression keyDeserializer, org.apache.spark.sql.catalyst.expressions.Expression valueDeserializer, org.apache.spark.sql.catalyst.expressions.Expression initialStateDeserializer, scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Attribute> groupingAttributes, scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Attribute> initialStateGroupAttrs, scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Attribute> dataAttributes, scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Attribute> initialStateDataAttrs, org.apache.spark.sql.catalyst.expressions.Attribute outputObjAttr, org.apache.spark.sql.streaming.GroupStateTimeout timeoutConf, boolean hasInitialState, org.apache.spark.sql.execution.SparkPlan initialState, org.apache.spark.sql.execution.SparkPlan child)  { throw new RuntimeException(); }
  public  scala.Option<org.apache.spark.sql.catalyst.expressions.Expression> watermarkExpression ()  { throw new RuntimeException(); }
  public  scala.Option<org.apache.spark.sql.catalyst.expressions.BasePredicate> watermarkPredicateForKeys ()  { throw new RuntimeException(); }
  public  scala.Option<org.apache.spark.sql.catalyst.expressions.BasePredicate> watermarkPredicateForData ()  { throw new RuntimeException(); }
  public  scala.collection.immutable.Map<java.lang.String, org.apache.spark.sql.execution.metric.SQLMetric> metrics ()  { throw new RuntimeException(); }
  public final  scala.collection.Seq<org.apache.spark.sql.execution.SparkPlan> children ()  { throw new RuntimeException(); }
  public  scala.Function3<java.lang.Object, scala.collection.Iterator<java.lang.Object>, org.apache.spark.sql.catalyst.plans.logical.LogicalGroupState<java.lang.Object>, scala.collection.Iterator<java.lang.Object>> func ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.expressions.Expression keyDeserializer ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.expressions.Expression valueDeserializer ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.expressions.Expression initialStateDeserializer ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Attribute> groupingAttributes ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Attribute> initialStateGroupAttrs ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Attribute> dataAttributes ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Attribute> initialStateDataAttrs ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.expressions.Attribute outputObjAttr ()  { throw new RuntimeException(); }
  public  scala.Option<org.apache.spark.sql.execution.streaming.StatefulOperatorStateInfo> stateInfo ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.encoders.ExpressionEncoder<java.lang.Object> stateEncoder ()  { throw new RuntimeException(); }
  public  int stateFormatVersion ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.streaming.OutputMode outputMode ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.streaming.GroupStateTimeout timeoutConf ()  { throw new RuntimeException(); }
  public  scala.Option<java.lang.Object> batchTimestampMs ()  { throw new RuntimeException(); }
  public  scala.Option<java.lang.Object> eventTimeWatermark ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.execution.SparkPlan initialState ()  { throw new RuntimeException(); }
  public  boolean hasInitialState ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.execution.SparkPlan child ()  { throw new RuntimeException(); }
  // not preceding
  public   FlatMapGroupsWithStateExec (scala.Function3<java.lang.Object, scala.collection.Iterator<java.lang.Object>, org.apache.spark.sql.catalyst.plans.logical.LogicalGroupState<java.lang.Object>, scala.collection.Iterator<java.lang.Object>> func, org.apache.spark.sql.catalyst.expressions.Expression keyDeserializer, org.apache.spark.sql.catalyst.expressions.Expression valueDeserializer, org.apache.spark.sql.catalyst.expressions.Expression initialStateDeserializer, scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Attribute> groupingAttributes, scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Attribute> initialStateGroupAttrs, scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Attribute> dataAttributes, scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Attribute> initialStateDataAttrs, org.apache.spark.sql.catalyst.expressions.Attribute outputObjAttr, scala.Option<org.apache.spark.sql.execution.streaming.StatefulOperatorStateInfo> stateInfo, org.apache.spark.sql.catalyst.encoders.ExpressionEncoder<java.lang.Object> stateEncoder, int stateFormatVersion, org.apache.spark.sql.streaming.OutputMode outputMode, org.apache.spark.sql.streaming.GroupStateTimeout timeoutConf, scala.Option<java.lang.Object> batchTimestampMs, scala.Option<java.lang.Object> eventTimeWatermark, org.apache.spark.sql.execution.SparkPlan initialState, boolean hasInitialState, org.apache.spark.sql.execution.SparkPlan child)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.execution.SparkPlan left ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.execution.SparkPlan right ()  { throw new RuntimeException(); }
    org.apache.spark.sql.execution.streaming.state.FlatMapGroupsWithStateExecHelper.StateManager stateManager ()  { throw new RuntimeException(); }
  /**
   * Distribute by grouping attributes - We need the underlying data and the initial state data
   * to have the same grouping so that the data are co-lacated on the same task.
   * @return (undocumented)
   */
  public  scala.collection.Seq<org.apache.spark.sql.catalyst.plans.physical.Distribution> requiredChildDistribution ()  { throw new RuntimeException(); }
  /**
   * Ordering needed for using GroupingIterator.
   * We need the initial state to also use the ordering as the data so that we can co-locate the
   * keys from the underlying data and the initial state.
   * @return (undocumented)
   */
  public  scala.collection.Seq<scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.SortOrder>> requiredChildOrdering ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Attribute> keyExpressions ()  { throw new RuntimeException(); }
  public  java.lang.String shortName ()  { throw new RuntimeException(); }
  public  boolean shouldRunAnotherBatch (org.apache.spark.sql.execution.streaming.OffsetSeqMetadata newMetadata)  { throw new RuntimeException(); }
  /**
   * Process data by applying the user defined function on a per partition basis.
   * <p>
   * @param iter - Iterator of the data rows
   * @param store - associated state store for this partition
   * @param processor - handle to the input processor object.
   * @param initialStateIterOption - optional initial state iterator
   * @return (undocumented)
   */
  public  org.apache.spark.util.CompletionIterator<org.apache.spark.sql.catalyst.InternalRow, scala.collection.Iterator<org.apache.spark.sql.catalyst.InternalRow>> processDataWithPartition (scala.collection.Iterator<org.apache.spark.sql.catalyst.InternalRow> iter, org.apache.spark.sql.execution.streaming.state.StateStore store, org.apache.spark.sql.execution.streaming.FlatMapGroupsWithStateExec.InputProcessor processor, scala.Option<scala.collection.Iterator<org.apache.spark.sql.catalyst.InternalRow>> initialStateIterOption)  { throw new RuntimeException(); }
  protected  org.apache.spark.rdd.RDD<org.apache.spark.sql.catalyst.InternalRow> doExecute ()  { throw new RuntimeException(); }
  protected  org.apache.spark.sql.execution.streaming.FlatMapGroupsWithStateExec withNewChildrenInternal (org.apache.spark.sql.execution.SparkPlan newLeft, org.apache.spark.sql.execution.SparkPlan newRight)  { throw new RuntimeException(); }
}
