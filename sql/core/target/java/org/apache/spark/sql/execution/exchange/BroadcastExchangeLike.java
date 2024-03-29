package org.apache.spark.sql.execution.exchange;
/**
 * Common trait for all broadcast exchange implementations to facilitate pattern matching.
 */
public  interface BroadcastExchangeLike {
  public  scala.concurrent.Future<org.apache.spark.broadcast.Broadcast<java.lang.Object>> completionFuture ()  ;
  /**
   * The asynchronous job that prepares the broadcast relation.
   * @return (undocumented)
   */
  public  java.util.concurrent.Future<org.apache.spark.broadcast.Broadcast<java.lang.Object>> relationFuture ()  ;
  /**
   * The broadcast job group ID
   * @return (undocumented)
   */
  public  java.util.UUID runId ()  ;
  /**
   * Returns the runtime statistics after broadcast materialization.
   * @return (undocumented)
   */
  public  org.apache.spark.sql.catalyst.plans.logical.Statistics runtimeStatistics ()  ;
  /**
   * The asynchronous job that materializes the broadcast. It's used for registering callbacks on
   * <code>relationFuture</code>. Note that calling this method may not start the execution of broadcast job.
   * It also does the preparations work, such as waiting for the subqueries.
   * @return (undocumented)
   */
  public  scala.concurrent.Future<org.apache.spark.broadcast.Broadcast<java.lang.Object>> submitBroadcastJob ()  ;
}
