package org.apache.spark.sql.catalyst.optimizer;
/**
 * Unwrap the input of IsNull/IsNotNull if the input is NullIntolerant
 * E.g. IsNull(Not(null)) == IsNull(null)
 */
public  class NullDownPropagation$ extends org.apache.spark.sql.catalyst.rules.Rule<org.apache.spark.sql.catalyst.plans.logical.LogicalPlan> {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final NullDownPropagation$ MODULE$ = null;
  public   NullDownPropagation$ ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan apply (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan)  { throw new RuntimeException(); }
}
