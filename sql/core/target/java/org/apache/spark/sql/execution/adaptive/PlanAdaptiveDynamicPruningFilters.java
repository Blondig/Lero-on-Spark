package org.apache.spark.sql.execution.adaptive;
/**
 * A rule to insert dynamic pruning predicates in order to reuse the results of broadcast.
 */
public  class PlanAdaptiveDynamicPruningFilters extends org.apache.spark.sql.catalyst.rules.Rule<org.apache.spark.sql.execution.SparkPlan> implements org.apache.spark.sql.execution.adaptive.AdaptiveSparkPlanHelper, scala.Product, scala.Serializable {
  static public  java.lang.String toString ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.execution.adaptive.AdaptiveSparkPlanExec rootPlan ()  { throw new RuntimeException(); }
  // not preceding
  public   PlanAdaptiveDynamicPruningFilters (org.apache.spark.sql.execution.adaptive.AdaptiveSparkPlanExec rootPlan)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.execution.SparkPlan apply (org.apache.spark.sql.execution.SparkPlan plan)  { throw new RuntimeException(); }
}
