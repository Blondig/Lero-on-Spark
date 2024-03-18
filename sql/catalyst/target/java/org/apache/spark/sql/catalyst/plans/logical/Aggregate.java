package org.apache.spark.sql.catalyst.plans.logical;
/**
 * This is a Group by operator with the aggregate functions and projections.
 * <p>
 * param:  groupingExpressions expressions for grouping keys
 * param:  aggregateExpressions expressions for a project list, which could contain
 *                             {@link AggregateExpression}s.
 * <p>
 * Note: Currently, aggregateExpressions is the project list of this Group by operator. Before
 * separating projection from grouping and aggregate, we should avoid expression-level optimization
 * on aggregateExpressions, which could reference an expression in groupingExpressions.
 * For example, see the rule {@link org.apache.spark.sql.catalyst.optimizer.SimplifyExtractValueOps}
 */
public  class Aggregate extends org.apache.spark.sql.catalyst.plans.logical.LogicalPlan implements org.apache.spark.sql.catalyst.plans.logical.UnaryNode, scala.Product, scala.Serializable {
  static public  boolean isAggregateBufferMutable (org.apache.spark.sql.types.StructType schema)  { throw new RuntimeException(); }
  static public  boolean supportsHashAggregate (scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Attribute> aggregateBufferAttributes)  { throw new RuntimeException(); }
  static public  boolean supportsObjectHashAggregate (scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.aggregate.AggregateExpression> aggregateExpressions)  { throw new RuntimeException(); }
  public final  scala.collection.Seq<org.apache.spark.sql.catalyst.plans.logical.LogicalPlan> children ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> groupingExpressions ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.NamedExpression> aggregateExpressions ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan child ()  { throw new RuntimeException(); }
  // not preceding
  public   Aggregate (scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> groupingExpressions, scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.NamedExpression> aggregateExpressions, org.apache.spark.sql.catalyst.plans.logical.LogicalPlan child)  { throw new RuntimeException(); }
  // not preceding
  public  boolean resolved ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Attribute> output ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Attribute> metadataOutput ()  { throw new RuntimeException(); }
  public  scala.Option<java.lang.Object> maxRows ()  { throw new RuntimeException(); }
  public final  scala.collection.Seq<scala.Enumeration.Value> nodePatterns ()  { throw new RuntimeException(); }
  // not preceding
  public  org.apache.spark.sql.catalyst.expressions.ExpressionSet validConstraints ()  { throw new RuntimeException(); }
  protected  org.apache.spark.sql.catalyst.plans.logical.Aggregate withNewChildInternal (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan newChild)  { throw new RuntimeException(); }
    boolean groupOnly ()  { throw new RuntimeException(); }
}
