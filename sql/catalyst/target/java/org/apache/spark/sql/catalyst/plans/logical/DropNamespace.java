package org.apache.spark.sql.catalyst.plans.logical;
/**
 * The logical plan of the DROP NAMESPACE command.
 */
public  class DropNamespace extends org.apache.spark.sql.catalyst.plans.logical.LogicalPlan implements org.apache.spark.sql.catalyst.plans.logical.UnaryCommand, scala.Product, scala.Serializable {
  static public abstract  R apply (T1 v1, T2 v2, T3 v3)  ;
  static public  java.lang.String toString ()  { throw new RuntimeException(); }
  public final  scala.collection.Seq<org.apache.spark.sql.catalyst.plans.logical.LogicalPlan> children ()  { throw new RuntimeException(); }
  public final  scala.collection.Seq<scala.Enumeration.Value> nodePatterns ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan namespace ()  { throw new RuntimeException(); }
  public  boolean ifExists ()  { throw new RuntimeException(); }
  public  boolean cascade ()  { throw new RuntimeException(); }
  // not preceding
  public   DropNamespace (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan namespace, boolean ifExists, boolean cascade)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan child ()  { throw new RuntimeException(); }
  protected  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan withNewChildInternal (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan newChild)  { throw new RuntimeException(); }
}
