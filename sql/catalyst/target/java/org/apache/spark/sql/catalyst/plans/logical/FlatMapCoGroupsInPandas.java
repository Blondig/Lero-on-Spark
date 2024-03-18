package org.apache.spark.sql.catalyst.plans.logical;
/**
 * Flatmap cogroups using a udf: pandas.Dataframe, pandas.Dataframe -> pandas.Dataframe
 * This is used by DataFrame.groupby().cogroup().apply().
 */
public  class FlatMapCoGroupsInPandas extends org.apache.spark.sql.catalyst.plans.logical.LogicalPlan implements org.apache.spark.sql.catalyst.plans.logical.BinaryNode, scala.Product, scala.Serializable {
  static public abstract  R apply (T1 v1, T2 v2, T3 v3, T4 v4, T5 v5, T6 v6)  ;
  static public  java.lang.String toString ()  { throw new RuntimeException(); }
  public final  scala.collection.Seq<org.apache.spark.sql.catalyst.plans.logical.LogicalPlan> children ()  { throw new RuntimeException(); }
  public  int leftGroupingLen ()  { throw new RuntimeException(); }
  public  int rightGroupingLen ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.expressions.Expression functionExpr ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Attribute> output ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan left ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan right ()  { throw new RuntimeException(); }
  // not preceding
  public   FlatMapCoGroupsInPandas (int leftGroupingLen, int rightGroupingLen, org.apache.spark.sql.catalyst.expressions.Expression functionExpr, scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Attribute> output, org.apache.spark.sql.catalyst.plans.logical.LogicalPlan left, org.apache.spark.sql.catalyst.plans.logical.LogicalPlan right)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.expressions.AttributeSet producedAttributes ()  { throw new RuntimeException(); }
  // not preceding
  public  org.apache.spark.sql.catalyst.expressions.AttributeSet references ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Attribute> leftAttributes ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Attribute> rightAttributes ()  { throw new RuntimeException(); }
  protected  org.apache.spark.sql.catalyst.plans.logical.FlatMapCoGroupsInPandas withNewChildrenInternal (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan newLeft, org.apache.spark.sql.catalyst.plans.logical.LogicalPlan newRight)  { throw new RuntimeException(); }
}
