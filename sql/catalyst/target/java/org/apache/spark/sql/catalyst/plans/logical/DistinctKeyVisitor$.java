package org.apache.spark.sql.catalyst.plans.logical;
/**
 * A visitor pattern for traversing a {@link LogicalPlan} tree and propagate the distinct attributes.
 */
public  class DistinctKeyVisitor$ implements org.apache.spark.sql.catalyst.plans.logical.LogicalPlanVisitor<scala.collection.immutable.Set<org.apache.spark.sql.catalyst.expressions.ExpressionSet>> {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final DistinctKeyVisitor$ MODULE$ = null;
  public   DistinctKeyVisitor$ ()  { throw new RuntimeException(); }
  public  scala.collection.immutable.Set<org.apache.spark.sql.catalyst.expressions.ExpressionSet> visitAggregate (org.apache.spark.sql.catalyst.plans.logical.Aggregate p)  { throw new RuntimeException(); }
  public  scala.collection.immutable.Set<org.apache.spark.sql.catalyst.expressions.ExpressionSet> visitDistinct (org.apache.spark.sql.catalyst.plans.logical.Distinct p)  { throw new RuntimeException(); }
  public  scala.collection.immutable.Set<org.apache.spark.sql.catalyst.expressions.ExpressionSet> visitExcept (org.apache.spark.sql.catalyst.plans.logical.Except p)  { throw new RuntimeException(); }
  public  scala.collection.immutable.Set<org.apache.spark.sql.catalyst.expressions.ExpressionSet> visitExpand (org.apache.spark.sql.catalyst.plans.logical.Expand p)  { throw new RuntimeException(); }
  public  scala.collection.immutable.Set<org.apache.spark.sql.catalyst.expressions.ExpressionSet> visitFilter (org.apache.spark.sql.catalyst.plans.logical.Filter p)  { throw new RuntimeException(); }
  public  scala.collection.immutable.Set<org.apache.spark.sql.catalyst.expressions.ExpressionSet> visitGenerate (org.apache.spark.sql.catalyst.plans.logical.Generate p)  { throw new RuntimeException(); }
  public  scala.collection.immutable.Set<org.apache.spark.sql.catalyst.expressions.ExpressionSet> visitGlobalLimit (org.apache.spark.sql.catalyst.plans.logical.GlobalLimit p)  { throw new RuntimeException(); }
  public  scala.collection.immutable.Set<org.apache.spark.sql.catalyst.expressions.ExpressionSet> visitIntersect (org.apache.spark.sql.catalyst.plans.logical.Intersect p)  { throw new RuntimeException(); }
  public  scala.collection.immutable.Set<org.apache.spark.sql.catalyst.expressions.ExpressionSet> visitJoin (org.apache.spark.sql.catalyst.plans.logical.Join p)  { throw new RuntimeException(); }
  public  scala.collection.immutable.Set<org.apache.spark.sql.catalyst.expressions.ExpressionSet> visitLocalLimit (org.apache.spark.sql.catalyst.plans.logical.LocalLimit p)  { throw new RuntimeException(); }
  public  scala.collection.immutable.Set<org.apache.spark.sql.catalyst.expressions.ExpressionSet> visitPivot (org.apache.spark.sql.catalyst.plans.logical.Pivot p)  { throw new RuntimeException(); }
  public  scala.collection.immutable.Set<org.apache.spark.sql.catalyst.expressions.ExpressionSet> visitProject (org.apache.spark.sql.catalyst.plans.logical.Project p)  { throw new RuntimeException(); }
  public  scala.collection.immutable.Set<org.apache.spark.sql.catalyst.expressions.ExpressionSet> visitRepartition (org.apache.spark.sql.catalyst.plans.logical.Repartition p)  { throw new RuntimeException(); }
  public  scala.collection.immutable.Set<org.apache.spark.sql.catalyst.expressions.ExpressionSet> visitRepartitionByExpr (org.apache.spark.sql.catalyst.plans.logical.RepartitionByExpression p)  { throw new RuntimeException(); }
  public  scala.collection.immutable.Set<org.apache.spark.sql.catalyst.expressions.ExpressionSet> visitSample (org.apache.spark.sql.catalyst.plans.logical.Sample p)  { throw new RuntimeException(); }
  public  scala.collection.immutable.Set<org.apache.spark.sql.catalyst.expressions.ExpressionSet> visitScriptTransform (org.apache.spark.sql.catalyst.plans.logical.ScriptTransformation p)  { throw new RuntimeException(); }
  public  scala.collection.immutable.Set<org.apache.spark.sql.catalyst.expressions.ExpressionSet> visitUnion (org.apache.spark.sql.catalyst.plans.logical.Union p)  { throw new RuntimeException(); }
  public  scala.collection.immutable.Set<org.apache.spark.sql.catalyst.expressions.ExpressionSet> visitWindow (org.apache.spark.sql.catalyst.plans.logical.Window p)  { throw new RuntimeException(); }
  public  scala.collection.immutable.Set<org.apache.spark.sql.catalyst.expressions.ExpressionSet> visitTail (org.apache.spark.sql.catalyst.plans.logical.Tail p)  { throw new RuntimeException(); }
  public  scala.collection.immutable.Set<org.apache.spark.sql.catalyst.expressions.ExpressionSet> visitSort (org.apache.spark.sql.catalyst.plans.logical.Sort p)  { throw new RuntimeException(); }
  public  scala.collection.immutable.Set<org.apache.spark.sql.catalyst.expressions.ExpressionSet> visitRebalancePartitions (org.apache.spark.sql.catalyst.plans.logical.RebalancePartitions p)  { throw new RuntimeException(); }
  public  scala.collection.immutable.Set<org.apache.spark.sql.catalyst.expressions.ExpressionSet> visitWithCTE (org.apache.spark.sql.catalyst.plans.logical.WithCTE p)  { throw new RuntimeException(); }
}
