package org.apache.spark.sql.catalyst.plans.logical;
/**
 * The logical plan of the ALTER TABLE ... SET LOCATION command.
 */
public  class SetTableLocation extends org.apache.spark.sql.catalyst.plans.logical.LogicalPlan implements org.apache.spark.sql.catalyst.plans.logical.AlterTableCommand, scala.Product, scala.Serializable {
  static public abstract  R apply (T1 v1, T2 v2, T3 v3)  ;
  static public  java.lang.String toString ()  { throw new RuntimeException(); }
  public final  scala.collection.Seq<org.apache.spark.sql.catalyst.plans.logical.LogicalPlan> children ()  { throw new RuntimeException(); }
  public final  scala.collection.Seq<scala.Enumeration.Value> nodePatterns ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan table ()  { throw new RuntimeException(); }
  public  scala.Option<scala.collection.immutable.Map<java.lang.String, java.lang.String>> partitionSpec ()  { throw new RuntimeException(); }
  public  java.lang.String location ()  { throw new RuntimeException(); }
  // not preceding
  public   SetTableLocation (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan table, scala.Option<scala.collection.immutable.Map<java.lang.String, java.lang.String>> partitionSpec, java.lang.String location)  { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.sql.connector.catalog.TableChange> changes ()  { throw new RuntimeException(); }
  protected  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan withNewChildInternal (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan newChild)  { throw new RuntimeException(); }
}
