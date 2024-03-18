package org.apache.spark.sql.catalyst.optimizer;
/**
 * Insert a filter on one side of the join if the other side has a selective predicate.
 * The filter could be an IN subquery (converted to a semi join), a bloom filter, or something
 * else in the future.
 */
public  class InjectRuntimeFilter$ extends org.apache.spark.sql.catalyst.rules.Rule<org.apache.spark.sql.catalyst.plans.logical.LogicalPlan> implements org.apache.spark.sql.catalyst.expressions.PredicateHelper, org.apache.spark.sql.catalyst.optimizer.JoinSelectionHelper {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final InjectRuntimeFilter$ MODULE$ = null;
  public   InjectRuntimeFilter$ ()  { throw new RuntimeException(); }
  public  boolean hasRuntimeFilter (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan left, org.apache.spark.sql.catalyst.plans.logical.LogicalPlan right, org.apache.spark.sql.catalyst.expressions.Expression leftKey, org.apache.spark.sql.catalyst.expressions.Expression rightKey)  { throw new RuntimeException(); }
  public  boolean hasDynamicPruningSubquery (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan left, org.apache.spark.sql.catalyst.plans.logical.LogicalPlan right, org.apache.spark.sql.catalyst.expressions.Expression leftKey, org.apache.spark.sql.catalyst.expressions.Expression rightKey)  { throw new RuntimeException(); }
  public  boolean hasBloomFilter (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan left, org.apache.spark.sql.catalyst.plans.logical.LogicalPlan right, org.apache.spark.sql.catalyst.expressions.Expression leftKey, org.apache.spark.sql.catalyst.expressions.Expression rightKey)  { throw new RuntimeException(); }
  public  boolean hasInSubquery (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan left, org.apache.spark.sql.catalyst.plans.logical.LogicalPlan right, org.apache.spark.sql.catalyst.expressions.Expression leftKey, org.apache.spark.sql.catalyst.expressions.Expression rightKey)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan apply (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan)  { throw new RuntimeException(); }
}
