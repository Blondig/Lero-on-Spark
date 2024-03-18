package org.apache.spark.sql.catalyst.plans.logical;
/**
 * Replace groups of data in an existing table during a row-level operation.
 * <p>
 * This node is constructed in rules that rewrite DELETE, UPDATE, MERGE operations for data sources
 * that can replace groups of data (e.g. files, partitions).
 * <p>
 * param:  table a plan that references a row-level operation table
 * param:  condition a condition that defines matching groups
 * param:  query a query with records that should replace the records that were read
 * param:  originalTable a plan for the original table for which the row-level command was triggered
 * param:  write a logical write, if already constructed
 */
public  class ReplaceData extends org.apache.spark.sql.catalyst.plans.logical.LogicalPlan implements org.apache.spark.sql.catalyst.plans.logical.RowLevelWrite, scala.Product, scala.Serializable {
  static public abstract  R apply (T1 v1, T2 v2, T3 v3, T4 v4, T5 v5)  ;
  static public  java.lang.String toString ()  { throw new RuntimeException(); }
  public  boolean resolved ()  { throw new RuntimeException(); }
  public final  scala.collection.Seq<org.apache.spark.sql.catalyst.plans.logical.LogicalPlan> children ()  { throw new RuntimeException(); }
  public final  scala.collection.Seq<scala.Enumeration.Value> nodePatterns ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.analysis.NamedRelation table ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.expressions.Expression condition ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan query ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.analysis.NamedRelation originalTable ()  { throw new RuntimeException(); }
  public  scala.Option<org.apache.spark.sql.connector.write.Write> write ()  { throw new RuntimeException(); }
  // not preceding
  public   ReplaceData (org.apache.spark.sql.catalyst.analysis.NamedRelation table, org.apache.spark.sql.catalyst.expressions.Expression condition, org.apache.spark.sql.catalyst.plans.logical.LogicalPlan query, org.apache.spark.sql.catalyst.analysis.NamedRelation originalTable, scala.Option<org.apache.spark.sql.connector.write.Write> write)  { throw new RuntimeException(); }
  public  boolean isByName ()  { throw new RuntimeException(); }
  public  scala.collection.Iterator<java.lang.Object> stringArgs ()  { throw new RuntimeException(); }
  // not preceding
  public  org.apache.spark.sql.catalyst.expressions.AttributeSet references ()  { throw new RuntimeException(); }
  // not preceding
  public  org.apache.spark.sql.connector.write.RowLevelOperation operation ()  { throw new RuntimeException(); }
  // not preceding
  public  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Attribute> dataInput ()  { throw new RuntimeException(); }
  public  boolean outputResolved ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.plans.logical.ReplaceData withNewQuery (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan newQuery)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.plans.logical.ReplaceData withNewTable (org.apache.spark.sql.catalyst.analysis.NamedRelation newTable)  { throw new RuntimeException(); }
  protected  org.apache.spark.sql.catalyst.plans.logical.ReplaceData withNewChildInternal (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan newChild)  { throw new RuntimeException(); }
}
