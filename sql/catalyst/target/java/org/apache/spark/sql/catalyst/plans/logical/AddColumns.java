package org.apache.spark.sql.catalyst.plans.logical;
/**
 * The logical plan of the ALTER TABLE ... ADD COLUMNS command.
 */
public  class AddColumns extends org.apache.spark.sql.catalyst.plans.logical.LogicalPlan implements org.apache.spark.sql.catalyst.plans.logical.AlterTableCommand, scala.Product, scala.Serializable {
  static public abstract  R apply (T1 v1, T2 v2)  ;
  static public  java.lang.String toString ()  { throw new RuntimeException(); }
  public final  scala.collection.Seq<org.apache.spark.sql.catalyst.plans.logical.LogicalPlan> children ()  { throw new RuntimeException(); }
  public final  scala.collection.Seq<scala.Enumeration.Value> nodePatterns ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan table ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.sql.catalyst.plans.logical.QualifiedColType> columnsToAdd ()  { throw new RuntimeException(); }
  // not preceding
  public   AddColumns (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan table, scala.collection.Seq<org.apache.spark.sql.catalyst.plans.logical.QualifiedColType> columnsToAdd)  { throw new RuntimeException(); }
  // not preceding
  public  boolean resolved ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.sql.connector.catalog.TableChange> changes ()  { throw new RuntimeException(); }
  protected  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan withNewChildInternal (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan newChild)  { throw new RuntimeException(); }
}
