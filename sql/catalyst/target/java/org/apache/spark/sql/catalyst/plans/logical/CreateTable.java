package org.apache.spark.sql.catalyst.plans.logical;
/**
 * Create a new table with a v2 catalog.
 */
public  class CreateTable extends org.apache.spark.sql.catalyst.plans.logical.LogicalPlan implements org.apache.spark.sql.catalyst.plans.logical.UnaryCommand, org.apache.spark.sql.catalyst.plans.logical.V2CreateTablePlan, scala.Product, scala.Serializable {
  static public abstract  R apply (T1 v1, T2 v2, T3 v3, T4 v4, T5 v5)  ;
  static public  java.lang.String toString ()  { throw new RuntimeException(); }
  public final  scala.collection.Seq<org.apache.spark.sql.catalyst.plans.logical.LogicalPlan> children ()  { throw new RuntimeException(); }
  public final  scala.collection.Seq<scala.Enumeration.Value> nodePatterns ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan name ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.types.StructType tableSchema ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.sql.connector.expressions.Transform> partitioning ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.plans.logical.TableSpec tableSpec ()  { throw new RuntimeException(); }
  public  boolean ignoreIfExists ()  { throw new RuntimeException(); }
  // not preceding
  public   CreateTable (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan name, org.apache.spark.sql.types.StructType tableSchema, scala.collection.Seq<org.apache.spark.sql.connector.expressions.Transform> partitioning, org.apache.spark.sql.catalyst.plans.logical.TableSpec tableSpec, boolean ignoreIfExists)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan child ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.connector.catalog.Identifier tableName ()  { throw new RuntimeException(); }
  protected  org.apache.spark.sql.catalyst.plans.logical.V2CreateTablePlan withNewChildInternal (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan newChild)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.plans.logical.V2CreateTablePlan withPartitioning (scala.collection.Seq<org.apache.spark.sql.connector.expressions.Transform> rewritten)  { throw new RuntimeException(); }
}
