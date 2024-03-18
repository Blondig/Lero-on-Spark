package org.apache.spark.sql.catalyst.analysis;
/**
 * Removes all {@link TempResolvedColumn}s in the query plan. This is the last resort, in case some
 * rules in the main resolution batch miss to remove {@link TempResolvedColumn}s. We should run this
 * rule right after the main resolution batch.
 */
public  class RemoveTempResolvedColumn$ extends org.apache.spark.sql.catalyst.rules.Rule<org.apache.spark.sql.catalyst.plans.logical.LogicalPlan> {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final RemoveTempResolvedColumn$ MODULE$ = null;
  public   RemoveTempResolvedColumn$ ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan apply (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan)  { throw new RuntimeException(); }
}
