package org.apache.spark.sql.catalyst.optimizer;
/**
 * Inlines CTE definitions into corresponding references if either of the conditions satisfies:
 * 1. The CTE definition does not contain any non-deterministic expressions or contains attribute
 *    references to an outer query. If this CTE definition references another CTE definition that
 *    has non-deterministic expressions, it is still OK to inline the current CTE definition.
 * 2. The CTE definition is only referenced once throughout the main query and all the subqueries.
 * <p>
 * CTE definitions that appear in subqueries and are not inlined will be pulled up to the main
 * query level.
 * <p>
 * param:  alwaysInline if true, inline all CTEs in the query plan.
 */
public  class InlineCTE extends org.apache.spark.sql.catalyst.rules.Rule<org.apache.spark.sql.catalyst.plans.logical.LogicalPlan> implements scala.Product, scala.Serializable {
  static public  java.lang.String toString ()  { throw new RuntimeException(); }
  public  boolean alwaysInline ()  { throw new RuntimeException(); }
  // not preceding
  public   InlineCTE (boolean alwaysInline)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan apply (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan)  { throw new RuntimeException(); }
}
