package org.apache.spark.sql.catalyst.plans.logical;
/**
 * The logical plan of the MSCK REPAIR TABLE command.
 */
public  class RepairTable extends org.apache.spark.sql.catalyst.plans.logical.LogicalPlan implements org.apache.spark.sql.catalyst.plans.logical.UnaryCommand, scala.Product, scala.Serializable {
  static public abstract  R apply (T1 v1, T2 v2, T3 v3)  ;
  static public  java.lang.String toString ()  { throw new RuntimeException(); }
  public final  scala.collection.Seq<org.apache.spark.sql.catalyst.plans.logical.LogicalPlan> children ()  { throw new RuntimeException(); }
  public final  scala.collection.Seq<scala.Enumeration.Value> nodePatterns ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan child ()  { throw new RuntimeException(); }
  public  boolean enableAddPartitions ()  { throw new RuntimeException(); }
  public  boolean enableDropPartitions ()  { throw new RuntimeException(); }
  // not preceding
  public   RepairTable (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan child, boolean enableAddPartitions, boolean enableDropPartitions)  { throw new RuntimeException(); }
  protected  org.apache.spark.sql.catalyst.plans.logical.RepairTable withNewChildInternal (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan newChild)  { throw new RuntimeException(); }
}
