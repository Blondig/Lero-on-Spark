package org.apache.spark.sql.catalyst.plans.logical;
public  class Project extends org.apache.spark.sql.catalyst.plans.logical.OrderPreservingUnaryNode implements scala.Product, scala.Serializable {
  static public  org.apache.spark.sql.catalyst.trees.TreeNodeTag<scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Attribute>> hiddenOutputTag ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.NamedExpression> projectList ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan child ()  { throw new RuntimeException(); }
  // not preceding
  public   Project (scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.NamedExpression> projectList, org.apache.spark.sql.catalyst.plans.logical.LogicalPlan child)  { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Attribute> output ()  { throw new RuntimeException(); }
  public  scala.Option<java.lang.Object> maxRows ()  { throw new RuntimeException(); }
  public  scala.Option<java.lang.Object> maxRowsPerPartition ()  { throw new RuntimeException(); }
  public final  scala.collection.Seq<scala.Enumeration.Value> nodePatterns ()  { throw new RuntimeException(); }
  // not preceding
  public  boolean resolved ()  { throw new RuntimeException(); }
  // not preceding
  public  org.apache.spark.sql.catalyst.expressions.ExpressionSet validConstraints ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Attribute> metadataOutput ()  { throw new RuntimeException(); }
  protected  org.apache.spark.sql.catalyst.plans.logical.Project withNewChildInternal (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan newChild)  { throw new RuntimeException(); }
}
