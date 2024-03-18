package org.apache.spark.sql.catalyst.plans.logical;
/**
 * The logical plan of the CREATE FUNCTION command.
 */
public  class CreateFunction extends org.apache.spark.sql.catalyst.plans.logical.LogicalPlan implements org.apache.spark.sql.catalyst.plans.logical.UnaryCommand, scala.Product, scala.Serializable {
  static public abstract  R apply (T1 v1, T2 v2, T3 v3, T4 v4, T5 v5)  ;
  static public  java.lang.String toString ()  { throw new RuntimeException(); }
  public final  scala.collection.Seq<org.apache.spark.sql.catalyst.plans.logical.LogicalPlan> children ()  { throw new RuntimeException(); }
  public final  scala.collection.Seq<scala.Enumeration.Value> nodePatterns ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan child ()  { throw new RuntimeException(); }
  public  java.lang.String className ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.sql.catalyst.catalog.FunctionResource> resources ()  { throw new RuntimeException(); }
  public  boolean ifExists ()  { throw new RuntimeException(); }
  public  boolean replace ()  { throw new RuntimeException(); }
  // not preceding
  public   CreateFunction (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan child, java.lang.String className, scala.collection.Seq<org.apache.spark.sql.catalyst.catalog.FunctionResource> resources, boolean ifExists, boolean replace)  { throw new RuntimeException(); }
  protected  org.apache.spark.sql.catalyst.plans.logical.CreateFunction withNewChildInternal (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan newChild)  { throw new RuntimeException(); }
}
