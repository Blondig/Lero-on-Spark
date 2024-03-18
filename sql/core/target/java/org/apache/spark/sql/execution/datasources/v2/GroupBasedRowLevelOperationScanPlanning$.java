package org.apache.spark.sql.execution.datasources.v2;
/**
 * A rule that builds scans for group-based row-level operations.
 * <p>
 * Note this rule must be run before {@link V2ScanRelationPushDown} as scans for group-based
 * row-level operations must be planned in a special way.
 */
public  class GroupBasedRowLevelOperationScanPlanning$ extends org.apache.spark.sql.catalyst.rules.Rule<org.apache.spark.sql.catalyst.plans.logical.LogicalPlan> implements org.apache.spark.sql.catalyst.expressions.PredicateHelper {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final GroupBasedRowLevelOperationScanPlanning$ MODULE$ = null;
  public   GroupBasedRowLevelOperationScanPlanning$ ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan apply (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan)  { throw new RuntimeException(); }
}
