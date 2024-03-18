package org.apache.spark.sql.catalyst.plans.logical;
/**
 * The logical plan of the DELETE FROM command.
 */
public  class DeleteFromTable extends org.apache.spark.sql.catalyst.plans.logical.LogicalPlan implements org.apache.spark.sql.catalyst.plans.logical.UnaryCommand, org.apache.spark.sql.catalyst.plans.logical.SupportsSubquery, scala.Product, scala.Serializable {
  static public abstract  R apply (T1 v1, T2 v2)  ;
  static public  java.lang.String toString ()  { throw new RuntimeException(); }
  public final  scala.collection.Seq<org.apache.spark.sql.catalyst.plans.logical.LogicalPlan> children ()  { throw new RuntimeException(); }
  public final  scala.collection.Seq<scala.Enumeration.Value> nodePatterns ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan table ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.expressions.Expression condition ()  { throw new RuntimeException(); }
  // not preceding
  public   DeleteFromTable (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan table, org.apache.spark.sql.catalyst.expressions.Expression condition)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan child ()  { throw new RuntimeException(); }
  protected  org.apache.spark.sql.catalyst.plans.logical.DeleteFromTable withNewChildInternal (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan newChild)  { throw new RuntimeException(); }
}
