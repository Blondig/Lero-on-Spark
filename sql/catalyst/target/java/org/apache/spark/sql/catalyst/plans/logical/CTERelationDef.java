package org.apache.spark.sql.catalyst.plans.logical;
/**
 * A wrapper for CTE definition plan with a unique ID.
 * param:  child The CTE definition query plan.
 * param:  id    The unique ID for this CTE definition.
 * param:  originalPlanWithPredicates The original query plan before predicate pushdown and the
 *                                   predicates that have been pushed down into <code>child</code>. This is
 *                                   a temporary field used by optimization rules for CTE predicate
 *                                   pushdown to help ensure rule idempotency.
 * param:  underSubquery If true, it means we don't need to add a shuffle for this CTE relation as
 *                      subquery reuse will be applied to reuse CTE relation output.
 */
public  class CTERelationDef extends org.apache.spark.sql.catalyst.plans.logical.LogicalPlan implements org.apache.spark.sql.catalyst.plans.logical.UnaryNode, scala.Product, scala.Serializable {
  static   java.util.concurrent.atomic.AtomicLong curId ()  { throw new RuntimeException(); }
  static public  long newId ()  { throw new RuntimeException(); }
  protected  org.apache.spark.sql.catalyst.expressions.ExpressionSet validConstraints ()  { throw new RuntimeException(); }
  public final  scala.collection.Seq<org.apache.spark.sql.catalyst.plans.logical.LogicalPlan> children ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan child ()  { throw new RuntimeException(); }
  public  long id ()  { throw new RuntimeException(); }
  public  scala.Option<scala.Tuple2<org.apache.spark.sql.catalyst.plans.logical.LogicalPlan, scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression>>> originalPlanWithPredicates ()  { throw new RuntimeException(); }
  public  boolean underSubquery ()  { throw new RuntimeException(); }
  // not preceding
  public   CTERelationDef (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan child, long id, scala.Option<scala.Tuple2<org.apache.spark.sql.catalyst.plans.logical.LogicalPlan, scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression>>> originalPlanWithPredicates, boolean underSubquery)  { throw new RuntimeException(); }
  public final  scala.collection.Seq<scala.Enumeration.Value> nodePatterns ()  { throw new RuntimeException(); }
  protected  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan withNewChildInternal (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan newChild)  { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Attribute> output ()  { throw new RuntimeException(); }
}
