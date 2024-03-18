package org.apache.spark.sql.execution.aggregate;
/**
 * Utility functions used by the query planner to convert our plan to new aggregation code path.
 */
public  class AggUtils$ {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final AggUtils$ MODULE$ = null;
  public   AggUtils$ ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.sql.execution.SparkPlan> planAggregateWithoutDistinct (scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.NamedExpression> groupingExpressions, scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.aggregate.AggregateExpression> aggregateExpressions, scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.NamedExpression> resultExpressions, org.apache.spark.sql.execution.SparkPlan child)  { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.sql.execution.SparkPlan> planAggregateWithOneDistinct (scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.NamedExpression> groupingExpressions, scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.aggregate.AggregateExpression> functionsWithDistinct, scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.aggregate.AggregateExpression> functionsWithoutDistinct, scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> distinctExpressions, scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.NamedExpression> normalizedNamedDistinctExpressions, scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.NamedExpression> resultExpressions, org.apache.spark.sql.execution.SparkPlan child)  { throw new RuntimeException(); }
  /**
   * Plans a streaming aggregation using the following progression:
   *  - Partial Aggregation
   *  - Shuffle
   *  - Partial Merge (now there is at most 1 tuple per group)
   *  - StateStoreRestore (now there is 1 tuple from this batch + optionally one from the previous)
   *  - PartialMerge (now there is at most 1 tuple per group)
   *  - StateStoreSave (saves the tuple for the next batch)
   *  - Complete (output the current result of the aggregation)
   * @param groupingExpressions (undocumented)
   * @param functionsWithoutDistinct (undocumented)
   * @param resultExpressions (undocumented)
   * @param stateFormatVersion (undocumented)
   * @param child (undocumented)
   * @return (undocumented)
   */
  public  scala.collection.Seq<org.apache.spark.sql.execution.SparkPlan> planStreamingAggregation (scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.NamedExpression> groupingExpressions, scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.aggregate.AggregateExpression> functionsWithoutDistinct, scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.NamedExpression> resultExpressions, int stateFormatVersion, org.apache.spark.sql.execution.SparkPlan child)  { throw new RuntimeException(); }
  /**
   * Plans a streaming session aggregation using the following progression:
   * <p>
   *  - Partial Aggregation
   *    - all tuples will have aggregated columns with initial value
   *  - (If "spark.sql.streaming.sessionWindow.merge.sessions.in.local.partition" is enabled)
   *    - Sort within partition (sort: all keys)
   *    - MergingSessionExec
   *      - calculate session among tuples, and aggregate tuples in session with partial merge
   *  - Shuffle &amp; Sort (distribution: keys "without" session, sort: all keys)
   *  - SessionWindowStateStoreRestore (group: keys "without" session)
   *    - merge input tuples with stored tuples (sessions) respecting sort order
   *  - MergingSessionExec
   *    - calculate session among tuples, and aggregate tuples in session with partial merge
   *    - NOTE: it leverages the fact that the output of SessionWindowStateStoreRestore is sorted
   *    - now there is at most 1 tuple per group, key with session
   *  - SessionWindowStateStoreSave (group: keys "without" session)
   *    - saves tuple(s) for the next batch (multiple sessions could co-exist at the same time)
   *  - Complete (output the current result of the aggregation)
   * @param groupingExpressions (undocumented)
   * @param sessionExpression (undocumented)
   * @param functionsWithoutDistinct (undocumented)
   * @param resultExpressions (undocumented)
   * @param stateFormatVersion (undocumented)
   * @param mergeSessionsInLocalPartition (undocumented)
   * @param child (undocumented)
   * @return (undocumented)
   */
  public  scala.collection.Seq<org.apache.spark.sql.execution.SparkPlan> planStreamingAggregationForSession (scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.NamedExpression> groupingExpressions, org.apache.spark.sql.catalyst.expressions.NamedExpression sessionExpression, scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.aggregate.AggregateExpression> functionsWithoutDistinct, scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.NamedExpression> resultExpressions, int stateFormatVersion, boolean mergeSessionsInLocalPartition, org.apache.spark.sql.execution.SparkPlan child)  { throw new RuntimeException(); }
}
