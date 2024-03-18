package org.apache.spark.sql.catalyst.plans.logical;
/**
 * The logical plan of the ALTER TABLE ... ALTER COLUMN command.
 */
public  class AlterColumn extends org.apache.spark.sql.catalyst.plans.logical.LogicalPlan implements org.apache.spark.sql.catalyst.plans.logical.AlterTableCommand, scala.Product, scala.Serializable {
  static public abstract  R apply (T1 v1, T2 v2, T3 v3, T4 v4, T5 v5, T6 v6)  ;
  static public  java.lang.String toString ()  { throw new RuntimeException(); }
  public final  scala.collection.Seq<org.apache.spark.sql.catalyst.plans.logical.LogicalPlan> children ()  { throw new RuntimeException(); }
  public final  scala.collection.Seq<scala.Enumeration.Value> nodePatterns ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan table ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.analysis.FieldName column ()  { throw new RuntimeException(); }
  public  scala.Option<org.apache.spark.sql.types.DataType> dataType ()  { throw new RuntimeException(); }
  public  scala.Option<java.lang.Object> nullable ()  { throw new RuntimeException(); }
  public  scala.Option<java.lang.String> comment ()  { throw new RuntimeException(); }
  public  scala.Option<org.apache.spark.sql.catalyst.analysis.FieldPosition> position ()  { throw new RuntimeException(); }
  // not preceding
  public   AlterColumn (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan table, org.apache.spark.sql.catalyst.analysis.FieldName column, scala.Option<org.apache.spark.sql.types.DataType> dataType, scala.Option<java.lang.Object> nullable, scala.Option<java.lang.String> comment, scala.Option<org.apache.spark.sql.catalyst.analysis.FieldPosition> position)  { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.sql.connector.catalog.TableChange> changes ()  { throw new RuntimeException(); }
  protected  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan withNewChildInternal (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan newChild)  { throw new RuntimeException(); }
}
