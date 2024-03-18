package org.apache.spark.sql.catalyst.plans.logical;
/**
 * The logical plan of the DESCRIBE relation_name col_name command.
 */
public  class DescribeColumn extends org.apache.spark.sql.catalyst.plans.logical.LogicalPlan implements org.apache.spark.sql.catalyst.plans.logical.UnaryCommand, scala.Product, scala.Serializable {
  static public  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Attribute> getOutputAttrs ()  { throw new RuntimeException(); }
  public final  scala.collection.Seq<org.apache.spark.sql.catalyst.plans.logical.LogicalPlan> children ()  { throw new RuntimeException(); }
  public final  scala.collection.Seq<scala.Enumeration.Value> nodePatterns ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan relation ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.expressions.Expression column ()  { throw new RuntimeException(); }
  public  boolean isExtended ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Attribute> output ()  { throw new RuntimeException(); }
  // not preceding
  public   DescribeColumn (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan relation, org.apache.spark.sql.catalyst.expressions.Expression column, boolean isExtended, scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Attribute> output)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan child ()  { throw new RuntimeException(); }
  protected  org.apache.spark.sql.catalyst.plans.logical.DescribeColumn withNewChildInternal (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan newChild)  { throw new RuntimeException(); }
}
