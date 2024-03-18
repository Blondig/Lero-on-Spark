package org.apache.spark.sql.execution.datasources.v2;
/**
 * A rule that replaces a rewritten DELETE operation with a delete using filters if the data source
 * can handle this DELETE command without executing the plan that operates on individual or groups
 * of rows.
 * <p>
 * Note this rule must be run after expression optimization but before scan planning.
 */
public  class OptimizeMetadataOnlyDeleteFromTable$ extends org.apache.spark.sql.catalyst.rules.Rule<org.apache.spark.sql.catalyst.plans.logical.LogicalPlan> implements org.apache.spark.sql.catalyst.expressions.PredicateHelper {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final OptimizeMetadataOnlyDeleteFromTable$ MODULE$ = null;
  public   OptimizeMetadataOnlyDeleteFromTable$ ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan apply (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan)  { throw new RuntimeException(); }
}
