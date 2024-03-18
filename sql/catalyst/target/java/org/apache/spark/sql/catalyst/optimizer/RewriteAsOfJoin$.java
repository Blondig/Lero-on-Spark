package org.apache.spark.sql.catalyst.optimizer;
/**
 * Replaces logical {@link AsOfJoin} operator using a combination of Join and Aggregate operator.
 * <p>
 * Input Pseudo-Query:
 * <pre><code>
 *    SELECT * FROM left ASOF JOIN right ON (condition, as_of on(left.t, right.t), tolerance)
 * </code></pre>
 * <p>
 * Rewritten Query:
 * <pre><code>
 *   SELECT left.*, __right__.*
 *   FROM (
 *        SELECT
 *             left.*,
 *             (
 *                  SELECT MIN_BY(STRUCT(right.*), left.t - right.t) AS __nearest_right__
 *                  FROM right
 *                  WHERE condition AND left.t &gt;= right.t AND right.t &gt;= left.t - tolerance
 *             ) as __right__
 *        FROM left
 *        )
 *   WHERE __right__ IS NOT NULL
 * </code></pre>
 */
public  class RewriteAsOfJoin$ extends org.apache.spark.sql.catalyst.rules.Rule<org.apache.spark.sql.catalyst.plans.logical.LogicalPlan> {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final RewriteAsOfJoin$ MODULE$ = null;
  public   RewriteAsOfJoin$ ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan apply (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan)  { throw new RuntimeException(); }
}
