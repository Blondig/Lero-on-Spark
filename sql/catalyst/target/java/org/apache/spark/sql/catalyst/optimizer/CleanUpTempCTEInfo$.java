package org.apache.spark.sql.catalyst.optimizer;
/**
 * Clean up temporary info from {@link CTERelationDef} nodes. This rule should be called after all
 * iterations of {@link PushdownPredicatesAndPruneColumnsForCTEDef} are done.
 */
public  class CleanUpTempCTEInfo$ extends org.apache.spark.sql.catalyst.rules.Rule<org.apache.spark.sql.catalyst.plans.logical.LogicalPlan> {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final CleanUpTempCTEInfo$ MODULE$ = null;
  public   CleanUpTempCTEInfo$ ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan apply (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan)  { throw new RuntimeException(); }
}
