package org.apache.spark.sql.catalyst.optimizer;
/**
 * 1. Elimination of outer joins, if the predicates can restrict the result sets so that
 * all null-supplying rows are eliminated
 * <p>
 * - full outer -> inner if both sides have such predicates
 * - left outer -> inner if the right side has such predicates
 * - right outer -> inner if the left side has such predicates
 * - full outer -> left outer if only the left side has such predicates
 * - full outer -> right outer if only the right side has such predicates
 * <p>
 * 2. Removes outer join if it only has distinct on streamed side
 * <pre><code>
 *   SELECT DISTINCT f1 FROM t1 LEFT JOIN t2 ON t1.id = t2.id  ==&gt;  SELECT DISTINCT f1 FROM t1
 * </code></pre>
 * <p>
 * This rule should be executed before pushing down the Filter
 */
public  class EliminateOuterJoin$ extends org.apache.spark.sql.catalyst.rules.Rule<org.apache.spark.sql.catalyst.plans.logical.LogicalPlan> implements org.apache.spark.sql.catalyst.expressions.PredicateHelper {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final EliminateOuterJoin$ MODULE$ = null;
  public   EliminateOuterJoin$ ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan apply (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan)  { throw new RuntimeException(); }
}
