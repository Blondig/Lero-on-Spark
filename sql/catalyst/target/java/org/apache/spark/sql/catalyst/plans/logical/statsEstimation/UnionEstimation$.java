package org.apache.spark.sql.catalyst.plans.logical.statsEstimation;
/**
 * Estimate the number of output rows by doing the sum of output rows for each child of union,
 * and estimate min and max stats for each column by finding the overall min and max of that
 * column coming from its children.
 */
public  class UnionEstimation$ {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final UnionEstimation$ MODULE$ = null;
  public   UnionEstimation$ ()  { throw new RuntimeException(); }
  public  scala.Option<org.apache.spark.sql.catalyst.plans.logical.Statistics> estimate (org.apache.spark.sql.catalyst.plans.logical.Union union)  { throw new RuntimeException(); }
}
