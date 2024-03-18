package org.apache.spark.sql.execution.adaptive;
/**
 * This optimization rule includes three join selection:
 *   1. detects a join child that has a high ratio of empty partitions and adds a
 *      NO_BROADCAST_HASH hint to avoid it being broadcast, as shuffle join is faster in this case:
 *      many tasks complete immediately since one join side is empty.
 *   2. detects a join child that every partition size is less than local map threshold and adds a
 *      PREFER_SHUFFLE_HASH hint to encourage being shuffle hash join instead of sort merge join.
 *   3. if a join satisfies both NO_BROADCAST_HASH and PREFER_SHUFFLE_HASH,
 *      then add a SHUFFLE_HASH hint.
 */
public  class DynamicJoinSelection$ extends org.apache.spark.sql.catalyst.rules.Rule<org.apache.spark.sql.catalyst.plans.logical.LogicalPlan> implements org.apache.spark.sql.catalyst.optimizer.JoinSelectionHelper {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final DynamicJoinSelection$ MODULE$ = null;
  public   DynamicJoinSelection$ ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan apply (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan)  { throw new RuntimeException(); }
}
