package org.apache.spark.sql.execution.adaptive;
/**
 * This rule runs in the AQE optimizer and optimizes more cases
 * compared to {@link PropagateEmptyRelationBase}:
 * 1. Join is single column NULL-aware anti join (NAAJ)
 *    Broadcasted {@link HashedRelation} is {@link HashedRelationWithAllNullKeys}. Eliminate join to an
 *    empty {@link LocalRelation}.
 */
public  class AQEPropagateEmptyRelation$ extends org.apache.spark.sql.catalyst.optimizer.PropagateEmptyRelationBase {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final AQEPropagateEmptyRelation$ MODULE$ = null;
  public   AQEPropagateEmptyRelation$ ()  { throw new RuntimeException(); }
  protected  boolean isEmpty (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan)  { throw new RuntimeException(); }
  protected  boolean nonEmpty (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan apply (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan)  { throw new RuntimeException(); }
}
