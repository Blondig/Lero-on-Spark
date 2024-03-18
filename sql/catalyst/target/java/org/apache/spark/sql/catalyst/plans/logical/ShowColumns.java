package org.apache.spark.sql.catalyst.plans.logical;
/**
 * The logical plan of the SHOW COLUMN command.
 */
public  class ShowColumns extends org.apache.spark.sql.catalyst.plans.logical.LogicalPlan implements org.apache.spark.sql.catalyst.plans.logical.UnaryCommand, scala.Product, scala.Serializable {
  static public  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Attribute> getOutputAttrs ()  { throw new RuntimeException(); }
  public final  scala.collection.Seq<org.apache.spark.sql.catalyst.plans.logical.LogicalPlan> children ()  { throw new RuntimeException(); }
  public final  scala.collection.Seq<scala.Enumeration.Value> nodePatterns ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan child ()  { throw new RuntimeException(); }
  public  scala.Option<scala.collection.Seq<java.lang.String>> namespace ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Attribute> output ()  { throw new RuntimeException(); }
  // not preceding
  public   ShowColumns (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan child, scala.Option<scala.collection.Seq<java.lang.String>> namespace, scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Attribute> output)  { throw new RuntimeException(); }
  protected  org.apache.spark.sql.catalyst.plans.logical.ShowColumns withNewChildInternal (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan newChild)  { throw new RuntimeException(); }
}
