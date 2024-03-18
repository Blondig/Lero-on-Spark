package org.apache.spark.sql.catalyst.optimizer;
/**
 * Finds all the {@link RuntimeReplaceable} expressions that are unevaluable and replace them
 * with semantically equivalent expressions that can be evaluated.
 * <p>
 * This is mainly used to provide compatibility with other databases.
 * Few examples are:
 *   we use this to support "left" by replacing it with "substring".
 *   we use this to replace Every and Any with Min and Max respectively.
 */
public  class ReplaceExpressions$ extends org.apache.spark.sql.catalyst.rules.Rule<org.apache.spark.sql.catalyst.plans.logical.LogicalPlan> {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final ReplaceExpressions$ MODULE$ = null;
  public   ReplaceExpressions$ ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan apply (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan)  { throw new RuntimeException(); }
}
