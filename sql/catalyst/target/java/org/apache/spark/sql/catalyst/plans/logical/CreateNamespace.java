package org.apache.spark.sql.catalyst.plans.logical;
/**
 * The logical plan of the CREATE NAMESPACE command.
 */
public  class CreateNamespace extends org.apache.spark.sql.catalyst.plans.logical.LogicalPlan implements org.apache.spark.sql.catalyst.plans.logical.UnaryCommand, scala.Product, scala.Serializable {
  static public abstract  R apply (T1 v1, T2 v2, T3 v3)  ;
  static public  java.lang.String toString ()  { throw new RuntimeException(); }
  public final  scala.collection.Seq<org.apache.spark.sql.catalyst.plans.logical.LogicalPlan> children ()  { throw new RuntimeException(); }
  public final  scala.collection.Seq<scala.Enumeration.Value> nodePatterns ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan name ()  { throw new RuntimeException(); }
  public  boolean ifNotExists ()  { throw new RuntimeException(); }
  public  scala.collection.immutable.Map<java.lang.String, java.lang.String> properties ()  { throw new RuntimeException(); }
  // not preceding
  public   CreateNamespace (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan name, boolean ifNotExists, scala.collection.immutable.Map<java.lang.String, java.lang.String> properties)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan child ()  { throw new RuntimeException(); }
  protected  org.apache.spark.sql.catalyst.plans.logical.CreateNamespace withNewChildInternal (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan newChild)  { throw new RuntimeException(); }
}
