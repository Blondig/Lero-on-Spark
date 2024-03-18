package org.apache.spark.sql.catalyst.plans.logical;
/**
 * Replaces a table from a select query with a v2 catalog.
 * <p>
 * If the table does not exist, and orCreate is true, then it will be created.
 * If the table does not exist, and orCreate is false, then an exception will be thrown.
 */
public  class ReplaceTableAsSelect extends org.apache.spark.sql.catalyst.plans.logical.LogicalPlan implements org.apache.spark.sql.catalyst.plans.logical.BinaryCommand, org.apache.spark.sql.catalyst.plans.logical.V2CreateTablePlan, scala.Product, scala.Serializable {
  static public abstract  R apply (T1 v1, T2 v2, T3 v3, T4 v4, T5 v5, T6 v6)  ;
  static public  java.lang.String toString ()  { throw new RuntimeException(); }
  public final  scala.collection.Seq<org.apache.spark.sql.catalyst.plans.logical.LogicalPlan> children ()  { throw new RuntimeException(); }
  public final  scala.collection.Seq<scala.Enumeration.Value> nodePatterns ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan name ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.sql.connector.expressions.Transform> partitioning ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan query ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.plans.logical.TableSpec tableSpec ()  { throw new RuntimeException(); }
  public  scala.collection.immutable.Map<java.lang.String, java.lang.String> writeOptions ()  { throw new RuntimeException(); }
  public  boolean orCreate ()  { throw new RuntimeException(); }
  // not preceding
  public   ReplaceTableAsSelect (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan name, scala.collection.Seq<org.apache.spark.sql.connector.expressions.Transform> partitioning, org.apache.spark.sql.catalyst.plans.logical.LogicalPlan query, org.apache.spark.sql.catalyst.plans.logical.TableSpec tableSpec, scala.collection.immutable.Map<java.lang.String, java.lang.String> writeOptions, boolean orCreate)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.types.StructType tableSchema ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan left ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan right ()  { throw new RuntimeException(); }
  // not preceding
  public  boolean resolved ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.connector.catalog.Identifier tableName ()  { throw new RuntimeException(); }
  protected  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan withNewChildrenInternal (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan newLeft, org.apache.spark.sql.catalyst.plans.logical.LogicalPlan newRight)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.plans.logical.V2CreateTablePlan withPartitioning (scala.collection.Seq<org.apache.spark.sql.connector.expressions.Transform> rewritten)  { throw new RuntimeException(); }
}
