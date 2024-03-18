package org.apache.spark.sql.catalyst.optimizer;
/**
 * Prunes unnecessary fields from a {@link Generate} if it is under a project which does not refer
 * any generated attributes, .e.g., count-like aggregation on an exploded array.
 */
public  class GenerateOptimization$ extends org.apache.spark.sql.catalyst.rules.Rule<org.apache.spark.sql.catalyst.plans.logical.LogicalPlan> {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final GenerateOptimization$ MODULE$ = null;
  public   GenerateOptimization$ ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan apply (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan)  { throw new RuntimeException(); }
}
