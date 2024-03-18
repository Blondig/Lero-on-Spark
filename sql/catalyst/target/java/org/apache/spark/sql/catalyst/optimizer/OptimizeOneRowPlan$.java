package org.apache.spark.sql.catalyst.optimizer;
/**
 * The rule is applied both normal and AQE Optimizer. It optimizes plan using max rows:
 *   - if the max rows of the child of sort is less than or equal to 1, remove the sort
 *   - if the max rows per partition of the child of local sort is less than or equal to 1,
 *     remove the local sort
 *   - if the max rows of the child of aggregate is less than or equal to 1 and its child and
 *     it's grouping only(include the rewritten distinct plan), convert aggregate to project
 *   - if the max rows of the child of aggregate is less than or equal to 1,
 *     set distinct to false in all aggregate expression
 */
public  class OptimizeOneRowPlan$ extends org.apache.spark.sql.catalyst.rules.Rule<org.apache.spark.sql.catalyst.plans.logical.LogicalPlan> {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final OptimizeOneRowPlan$ MODULE$ = null;
  public   OptimizeOneRowPlan$ ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan apply (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan)  { throw new RuntimeException(); }
}
