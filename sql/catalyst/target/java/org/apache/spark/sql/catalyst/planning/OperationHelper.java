package org.apache.spark.sql.catalyst.planning;
public  interface OperationHelper extends org.apache.spark.sql.catalyst.expressions.AliasHelper, org.apache.spark.sql.catalyst.expressions.PredicateHelper {
  /**
   * Collects all adjacent projects and filters, in-lining/substituting aliases if necessary.
   * Here are two examples for alias in-lining/substitution.
   * Before:
   * <pre><code>
   *   SELECT c1 FROM (SELECT key AS c1 FROM t1) t2 WHERE c1 &gt; 10
   *   SELECT c1 AS c2 FROM (SELECT key AS c1 FROM t1) t2 WHERE c1 &gt; 10
   * </code></pre>
   * After:
   * <pre><code>
   *   SELECT key AS c1 FROM t1 WHERE key &gt; 10
   *   SELECT key AS c2 FROM t1 WHERE key &gt; 10
   * </code></pre>
   * @param plan (undocumented)
   * @param alwaysInline (undocumented)
   * @return (undocumented)
   */
  public  scala.Tuple4<scala.Option<scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.NamedExpression>>, scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression>, org.apache.spark.sql.catalyst.plans.logical.LogicalPlan, org.apache.spark.sql.catalyst.expressions.AttributeMap<org.apache.spark.sql.catalyst.expressions.Alias>> collectProjectsAndFilters (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan, boolean alwaysInline)  ;
  /**
   * This legacy mode is for PhysicalOperation which has been there for years and we want to be
   * extremely safe to not change its behavior. There are two differences when legacy mode is off:
   *   1. We postpone the deterministic check to the very end (calling <code>canCollapseExpressions</code>),
   *      so that it's more likely to collect more projects and filters.
   *   2. We follow CollapseProject and only collect adjacent projects if they don't produce
   *      repeated expensive expressions.
   * @return (undocumented)
   */
  public  boolean legacyMode ()  ;
  public  scala.Option<scala.Tuple3<scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.NamedExpression>, scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression>, org.apache.spark.sql.catalyst.plans.logical.LogicalPlan>> unapply (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan)  ;
}
