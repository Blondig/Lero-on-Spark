package org.apache.spark.sql.catalyst.optimizer;
/**
 * Combines two {@link Project} operators into one and perform alias substitution,
 * merging the expressions into one single expression for the following cases.
 * 1. When two {@link Project} operators are adjacent.
 * 2. When two {@link Project} operators have LocalLimit/Sample/Repartition operator between them
 *    and the upper project consists of the same number of columns which is equal or aliasing.
 *    <code>GlobalLimit(LocalLimit)</code> pattern is also considered.
 */
public  class CollapseProject$ extends org.apache.spark.sql.catalyst.rules.Rule<org.apache.spark.sql.catalyst.plans.logical.LogicalPlan> implements org.apache.spark.sql.catalyst.expressions.AliasHelper {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final CollapseProject$ MODULE$ = null;
  public   CollapseProject$ ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan apply (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan)  { throw new RuntimeException(); }
  /**
   * Check if we can collapse expressions safely.
   * @param consumers (undocumented)
   * @param producers (undocumented)
   * @param alwaysInline (undocumented)
   * @return (undocumented)
   */
  public  boolean canCollapseExpressions (scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> consumers, scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.NamedExpression> producers, boolean alwaysInline)  { throw new RuntimeException(); }
  /**
   * Check if we can collapse expressions safely.
   * @param consumers (undocumented)
   * @param producerMap (undocumented)
   * @param alwaysInline (undocumented)
   * @return (undocumented)
   */
  public  boolean canCollapseExpressions (scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> consumers, scala.collection.immutable.Map<org.apache.spark.sql.catalyst.expressions.Attribute, org.apache.spark.sql.catalyst.expressions.Expression> producerMap, boolean alwaysInline)  { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.NamedExpression> buildCleanedProjectList (scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.NamedExpression> upper, scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.NamedExpression> lower)  { throw new RuntimeException(); }
}
