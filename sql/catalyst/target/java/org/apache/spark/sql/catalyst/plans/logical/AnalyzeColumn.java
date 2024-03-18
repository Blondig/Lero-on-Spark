package org.apache.spark.sql.catalyst.plans.logical;
/**
 * The logical plan of the ANALYZE TABLE FOR COLUMNS command.
 */
public  class AnalyzeColumn extends org.apache.spark.sql.catalyst.plans.logical.LogicalPlan implements org.apache.spark.sql.catalyst.plans.logical.UnaryCommand, scala.Product, scala.Serializable {
  static public abstract  R apply (T1 v1, T2 v2, T3 v3)  ;
  static public  java.lang.String toString ()  { throw new RuntimeException(); }
  public final  scala.collection.Seq<org.apache.spark.sql.catalyst.plans.logical.LogicalPlan> children ()  { throw new RuntimeException(); }
  public final  scala.collection.Seq<scala.Enumeration.Value> nodePatterns ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan child ()  { throw new RuntimeException(); }
  public  scala.Option<scala.collection.Seq<java.lang.String>> columnNames ()  { throw new RuntimeException(); }
  public  boolean allColumns ()  { throw new RuntimeException(); }
  // not preceding
  public   AnalyzeColumn (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan child, scala.Option<scala.collection.Seq<java.lang.String>> columnNames, boolean allColumns)  { throw new RuntimeException(); }
  protected  org.apache.spark.sql.catalyst.plans.logical.AnalyzeColumn withNewChildInternal (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan newChild)  { throw new RuntimeException(); }
}
