package org.apache.spark.sql.catalyst.plans.logical;
/**
 * Logical plan node for holding data from a command.
 * <p>
 * <code>commandLogicalPlan</code> and <code>commandPhysicalPlan</code> are just used to display the plan tree
 * for EXPLAIN.
 * <code>rows</code> may not be serializable and ideally we should not send <code>rows</code> to the executors.
 * Thus marking them as transient.
 */
public  class CommandResult extends org.apache.spark.sql.catalyst.plans.logical.LogicalPlan implements org.apache.spark.sql.catalyst.plans.logical.LeafNode, scala.Product, scala.Serializable {
  static public abstract  R apply (T1 v1, T2 v2, T3 v3, T4 v4)  ;
  static public  java.lang.String toString ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Attribute> output ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan commandLogicalPlan ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.execution.SparkPlan commandPhysicalPlan ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.sql.catalyst.InternalRow> rows ()  { throw new RuntimeException(); }
  // not preceding
  public   CommandResult (scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Attribute> output, org.apache.spark.sql.catalyst.plans.logical.LogicalPlan commandLogicalPlan, org.apache.spark.sql.execution.SparkPlan commandPhysicalPlan, scala.collection.Seq<org.apache.spark.sql.catalyst.InternalRow> rows)  { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.sql.catalyst.plans.QueryPlan<?>> innerChildren ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.plans.logical.Statistics computeStats ()  { throw new RuntimeException(); }
}
