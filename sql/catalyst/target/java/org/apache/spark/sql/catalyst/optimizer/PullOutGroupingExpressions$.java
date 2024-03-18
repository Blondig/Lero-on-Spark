package org.apache.spark.sql.catalyst.optimizer;
/**
 * This rule ensures that {@link Aggregate} nodes doesn't contain complex grouping expressions in the
 * optimization phase.
 * <p>
 * Complex grouping expressions are pulled out to a {@link Project} node under {@link Aggregate} and are
 * referenced in both grouping expressions and aggregate expressions without aggregate functions.
 * These references ensure that optimization rules don't change the aggregate expressions to invalid
 * ones that no longer refer to any grouping expressions and also simplify the expression
 * transformations on the node (need to transform the expression only once).
 * <p>
 * For example, in the following query Spark shouldn't optimize the aggregate expression
 * <code>Not(IsNull(c))</code> to <code>IsNotNull(c)</code> as the grouping expression is <code>IsNull(c)</code>:
 * SELECT not(c IS NULL)
 * FROM t
 * GROUP BY c IS NULL
 * Instead, the aggregate expression references a <code>_groupingexpression</code> attribute:
 * Aggregate [_groupingexpression#233], [NOT _groupingexpression#233 AS (NOT (c IS NULL))#230]
 * +- Project [isnull(c#219) AS _groupingexpression#233]
 *    +- LocalRelation [c#219]
 */
public  class PullOutGroupingExpressions$ extends org.apache.spark.sql.catalyst.rules.Rule<org.apache.spark.sql.catalyst.plans.logical.LogicalPlan> {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final PullOutGroupingExpressions$ MODULE$ = null;
  public   PullOutGroupingExpressions$ ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan apply (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan)  { throw new RuntimeException(); }
}
