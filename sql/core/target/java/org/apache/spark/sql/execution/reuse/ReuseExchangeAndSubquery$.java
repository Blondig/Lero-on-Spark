package org.apache.spark.sql.execution.reuse;
/**
 * Find out duplicated exchanges and subqueries in the whole spark plan including subqueries, then
 * use the same exchange or subquery for all the references.
 * <p>
 * Note that the Spark plan is a mutually recursive data structure:
 * SparkPlan -> Expr -> Subquery -> SparkPlan -> Expr -> Subquery -> ...
 * Therefore, in this rule, we recursively rewrite the exchanges and subqueries in a bottom-up way,
 * in one go.
 */
public  class ReuseExchangeAndSubquery$ extends org.apache.spark.sql.catalyst.rules.Rule<org.apache.spark.sql.execution.SparkPlan> implements scala.Product, scala.Serializable {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final ReuseExchangeAndSubquery$ MODULE$ = null;
  public   ReuseExchangeAndSubquery$ ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.execution.SparkPlan apply (org.apache.spark.sql.execution.SparkPlan plan)  { throw new RuntimeException(); }
}
