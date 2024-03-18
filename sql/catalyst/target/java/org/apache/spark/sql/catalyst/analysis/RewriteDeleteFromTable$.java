package org.apache.spark.sql.catalyst.analysis;
/**
 * A rule that rewrites DELETE operations using plans that operate on individual or groups of rows.
 * <p>
 * If a table implements {@link SupportsDelete} and {@link SupportsRowLevelOperations}, this rule will
 * still rewrite the DELETE operation but the optimizer will check whether this particular DELETE
 * statement can be handled by simply passing delete filters to the connector. If so, the optimizer
 * will discard the rewritten plan and will allow the data source to delete using filters.
 */
public  class RewriteDeleteFromTable$ extends org.apache.spark.sql.catalyst.rules.Rule<org.apache.spark.sql.catalyst.plans.logical.LogicalPlan> implements org.apache.spark.sql.catalyst.analysis.RewriteRowLevelCommand {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final RewriteDeleteFromTable$ MODULE$ = null;
  public   RewriteDeleteFromTable$ ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan apply (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan)  { throw new RuntimeException(); }
}
