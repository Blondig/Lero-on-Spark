package org.apache.spark.sql.catalyst.optimizer;
/**
 * Infer predicates and column pruning for {@link CTERelationDef} from its reference points, and push
 * the disjunctive predicates as well as the union of attributes down the CTE plan.
 */
public  class PushdownPredicatesAndPruneColumnsForCTEDef$ extends org.apache.spark.sql.catalyst.rules.Rule<org.apache.spark.sql.catalyst.plans.logical.LogicalPlan> {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final PushdownPredicatesAndPruneColumnsForCTEDef$ MODULE$ = null;
  public   PushdownPredicatesAndPruneColumnsForCTEDef$ ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan apply (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan)  { throw new RuntimeException(); }
}
