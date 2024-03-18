package org.apache.spark.sql.catalyst.plans.logical;
/**
 * The logical plan of the SHOW CREATE TABLE command.
 */
public  class ShowCreateTable extends org.apache.spark.sql.catalyst.plans.logical.LogicalPlan implements org.apache.spark.sql.catalyst.plans.logical.UnaryCommand, scala.Product, scala.Serializable {
  static public  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Attribute> getoutputAttrs ()  { throw new RuntimeException(); }
  public final  scala.collection.Seq<org.apache.spark.sql.catalyst.plans.logical.LogicalPlan> children ()  { throw new RuntimeException(); }
  public final  scala.collection.Seq<scala.Enumeration.Value> nodePatterns ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan child ()  { throw new RuntimeException(); }
  public  boolean asSerde ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Attribute> output ()  { throw new RuntimeException(); }
  // not preceding
  public   ShowCreateTable (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan child, boolean asSerde, scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Attribute> output)  { throw new RuntimeException(); }
  protected  org.apache.spark.sql.catalyst.plans.logical.ShowCreateTable withNewChildInternal (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan newChild)  { throw new RuntimeException(); }
}
