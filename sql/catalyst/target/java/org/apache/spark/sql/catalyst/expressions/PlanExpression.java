package org.apache.spark.sql.catalyst.expressions;
/**
 * An interface for expressions that contain a {@link QueryPlan}.
 */
public abstract class PlanExpression<T extends org.apache.spark.sql.catalyst.plans.QueryPlan<?>> extends org.apache.spark.sql.catalyst.expressions.Expression {
  // not preceding
  // TypeTree().setOriginal(TypeBoundsTree(TypeTree(), TypeTree().setOriginal(ExistentialTypeTree(AppliedTypeTree(Select(Select(Select(Select(Select(Select(Ident(org), org.apache), org.apache.spark), org.apache.spark.sql), org.apache.spark.sql.catalyst), org.apache.spark.sql.catalyst.plans), org.apache.spark.sql.catalyst.plans.QueryPlan), List(TypeTree().setOriginal(Ident(TypeName("_$1"))))), List(TypeDef(Modifiers(DEFERRED | SYNTHETIC), TypeName("_$1"), List(), TypeBoundsTree(EmptyTree, EmptyTree)))))))
  public   PlanExpression ()  { throw new RuntimeException(); }
  protected  java.lang.String conditionString ()  { throw new RuntimeException(); }
  // not preceding
  public  boolean deterministic ()  { throw new RuntimeException(); }
  /**  The id of the subquery expression. */
  public abstract  org.apache.spark.sql.catalyst.expressions.ExprId exprId ()  ;
  public final  scala.collection.Seq<scala.Enumeration.Value> nodePatterns ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<scala.Enumeration.Value> nodePatternsInternal ()  { throw new RuntimeException(); }
  /** The plan being wrapped in the query. */
  public abstract  T plan ()  ;
  // not preceding
  public  org.apache.spark.util.collection.BitSet treePatternBits ()  { throw new RuntimeException(); }
  /** Updates the expression with a new plan. */
  public abstract  org.apache.spark.sql.catalyst.expressions.PlanExpression<T> withNewPlan (T plan)  ;
}
