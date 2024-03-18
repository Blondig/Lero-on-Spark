package org.apache.spark.sql.catalyst.plans.logical;
/**
 * A trait to add distinct attributes to {@link LogicalPlan}. For example:
 * <pre><code>
 *   SELECT a, b, SUM(c) FROM Tab1 GROUP BY a, b
 *   // returns a, b
 * </code></pre>
 */
public  interface LogicalPlanDistinctKeys {
  public  scala.collection.immutable.Set<org.apache.spark.sql.catalyst.expressions.ExpressionSet> distinctKeys ()  ;
}
