package org.apache.spark.sql.catalyst.optimizer;
/**
 * The base class of two rules in the normal and AQE Optimizer. It simplifies query plans with
 * empty or non-empty relations:
 *  1. Higher-node Logical Plans
 *     - Union with all empty children.
 *  2. Binary-node Logical Plans
 *     - Join with one or two empty children (including Intersect/Except).
 *     - Left semi Join
 *       Right side is non-empty and condition is empty. Eliminate join to its left side.
 *     - Left anti join
 *       Right side is non-empty and condition is empty. Eliminate join to an empty
 *       {@link LocalRelation}.
 *  3. Unary-node Logical Plans
 *     - Project/Filter/Sample with all empty children.
 *     - Limit/Repartition/RepartitionByExpression/Rebalance with all empty children.
 *     - Aggregate with all empty children and at least one grouping expression.
 *     - Generate(Explode) with all empty children. Others like Hive UDTF may return results.
 */
public abstract class PropagateEmptyRelationBase extends org.apache.spark.sql.catalyst.rules.Rule<org.apache.spark.sql.catalyst.plans.logical.LogicalPlan> implements org.apache.spark.sql.catalyst.analysis.CastSupport {
  public   PropagateEmptyRelationBase ()  { throw new RuntimeException(); }
  protected  scala.PartialFunction<org.apache.spark.sql.catalyst.plans.logical.LogicalPlan, org.apache.spark.sql.catalyst.plans.logical.LogicalPlan> commonApplyFunc ()  { throw new RuntimeException(); }
  protected  org.apache.spark.sql.catalyst.plans.logical.LocalRelation empty (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan)  { throw new RuntimeException(); }
  protected  boolean isEmpty (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan)  { throw new RuntimeException(); }
  protected  boolean nonEmpty (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan)  { throw new RuntimeException(); }
}
