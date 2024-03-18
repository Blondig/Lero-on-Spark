package org.apache.spark.sql.execution.adaptive;
/**
 * An interface to evaluate the cost of a physical plan.
 * <p>
 * @note This class is subject to be changed and/or moved in the near future.
 */
public  interface CostEvaluator {
  public  org.apache.spark.sql.execution.adaptive.Cost evaluateCost (org.apache.spark.sql.execution.SparkPlan plan)  ;
}
