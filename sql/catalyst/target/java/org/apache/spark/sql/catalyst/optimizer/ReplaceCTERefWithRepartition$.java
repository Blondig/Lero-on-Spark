package org.apache.spark.sql.catalyst.optimizer;
/**
 * Replaces CTE references that have not been previously inlined with {@link Repartition} operations
 * which will then be planned as shuffles and reused across different reference points.
 * <p>
 * Note that this rule should be called at the very end of the optimization phase to best guarantee
 * that CTE repartition shuffles are reused.
 */
public  class ReplaceCTERefWithRepartition$ extends org.apache.spark.sql.catalyst.rules.Rule<org.apache.spark.sql.catalyst.plans.logical.LogicalPlan> {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final ReplaceCTERefWithRepartition$ MODULE$ = null;
  public   ReplaceCTERefWithRepartition$ ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan apply (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan)  { throw new RuntimeException(); }
}
