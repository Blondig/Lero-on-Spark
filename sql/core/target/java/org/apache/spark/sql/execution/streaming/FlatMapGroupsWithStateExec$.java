package org.apache.spark.sql.execution.streaming;
public  class FlatMapGroupsWithStateExec$ implements scala.Serializable {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final FlatMapGroupsWithStateExec$ MODULE$ = null;
  public   FlatMapGroupsWithStateExec$ ()  { throw new RuntimeException(); }
  public  java.lang.Exception foundDuplicateInitialKeyException ()  { throw new RuntimeException(); }
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
  public  org.apache.spark.sql.execution.SparkPlan generateSparkPlanForBatchQueries (scala.Function3<java.lang.Object, scala.collection.Iterator<java.lang.Object>, org.apache.spark.sql.catalyst.plans.logical.LogicalGroupState<java.lang.Object>, scala.collection.Iterator<java.lang.Object>> userFunc, org.apache.spark.sql.catalyst.expressions.Expression keyDeserializer, org.apache.spark.sql.catalyst.expressions.Expression valueDeserializer, org.apache.spark.sql.catalyst.expressions.Expression initialStateDeserializer, scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Attribute> groupingAttributes, scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Attribute> initialStateGroupAttrs, scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Attribute> dataAttributes, scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Attribute> initialStateDataAttrs, org.apache.spark.sql.catalyst.expressions.Attribute outputObjAttr, org.apache.spark.sql.streaming.GroupStateTimeout timeoutConf, boolean hasInitialState, org.apache.spark.sql.execution.SparkPlan initialState, org.apache.spark.sql.execution.SparkPlan child)  { throw new RuntimeException(); }
}
