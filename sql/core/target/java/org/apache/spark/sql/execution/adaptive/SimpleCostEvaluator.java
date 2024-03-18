package org.apache.spark.sql.execution.adaptive;
/**
 * A skew join aware implementation of {@link CostEvaluator}, which counts the number of
 * {@link ShuffleExchangeLike} nodes and skew join nodes in the plan.
 */
public  class SimpleCostEvaluator implements org.apache.spark.sql.execution.adaptive.CostEvaluator, scala.Product, scala.Serializable {
  static public abstract  R apply (T1 v1)  ;
  static public  java.lang.String toString ()  { throw new RuntimeException(); }
  public  boolean forceOptimizeSkewedJoin ()  { throw new RuntimeException(); }
  // not preceding
  public   SimpleCostEvaluator (boolean forceOptimizeSkewedJoin)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.execution.adaptive.Cost evaluateCost (org.apache.spark.sql.execution.SparkPlan plan)  { throw new RuntimeException(); }
}
