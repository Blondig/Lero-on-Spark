package org.apache.spark.sql.execution;
/**
 * The physical node of in-subquery. When this is used for Dynamic Partition Pruning, as the pruning
 * happens at the driver side, we don't broadcast subquery result.
 */
public  class InSubqueryExec extends org.apache.spark.sql.execution.ExecSubqueryExpression implements org.apache.spark.sql.catalyst.trees.UnaryLike<org.apache.spark.sql.catalyst.expressions.Expression>, scala.Product, scala.Serializable {
  static public abstract  R apply (T1 v1, T2 v2, T3 v3, T4 v4, T5 v5, T6 v6)  ;
  public final  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> children ()  { throw new RuntimeException(); }
  // not preceding
  public  org.apache.spark.sql.catalyst.expressions.Expression child ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.execution.BaseSubqueryExec plan ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.expressions.ExprId exprId ()  { throw new RuntimeException(); }
  public  boolean shouldBroadcast ()  { throw new RuntimeException(); }
  // not preceding
  public   InSubqueryExec (org.apache.spark.sql.catalyst.expressions.Expression child, org.apache.spark.sql.execution.BaseSubqueryExec plan, org.apache.spark.sql.catalyst.expressions.ExprId exprId, boolean shouldBroadcast, org.apache.spark.broadcast.Broadcast<java.lang.Object[]> resultBroadcast, java.lang.Object[] result)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.types.DataType dataType ()  { throw new RuntimeException(); }
  public  boolean nullable ()  { throw new RuntimeException(); }
  public  java.lang.String toString ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.execution.InSubqueryExec withNewPlan (org.apache.spark.sql.execution.BaseSubqueryExec plan)  { throw new RuntimeException(); }
  public final  scala.collection.Seq<scala.Enumeration.Value> nodePatternsInternal ()  { throw new RuntimeException(); }
  public  void updateResult ()  { throw new RuntimeException(); }
  public  scala.Option<java.lang.Object[]> values ()  { throw new RuntimeException(); }
  public  Object eval (org.apache.spark.sql.catalyst.InternalRow input)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.expressions.codegen.ExprCode doGenCode (org.apache.spark.sql.catalyst.expressions.codegen.CodegenContext ctx, org.apache.spark.sql.catalyst.expressions.codegen.ExprCode ev)  { throw new RuntimeException(); }
  // not preceding
  public  org.apache.spark.sql.execution.InSubqueryExec preCanonicalized ()  { throw new RuntimeException(); }
  protected  org.apache.spark.sql.execution.InSubqueryExec withNewChildInternal (org.apache.spark.sql.catalyst.expressions.Expression newChild)  { throw new RuntimeException(); }
}
