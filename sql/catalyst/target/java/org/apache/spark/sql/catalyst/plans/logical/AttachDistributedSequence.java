package org.apache.spark.sql.catalyst.plans.logical;
/**
 * A logical plan that adds a new long column with the name <code>name</code> that
 * increases one by one. This is for 'distributed-sequence' default index
 * in pandas API on Spark.
 */
public  class AttachDistributedSequence extends org.apache.spark.sql.catalyst.plans.logical.LogicalPlan implements org.apache.spark.sql.catalyst.plans.logical.UnaryNode, scala.Product, scala.Serializable {
  static public abstract  R apply (T1 v1, T2 v2)  ;
  static public  java.lang.String toString ()  { throw new RuntimeException(); }
  protected  org.apache.spark.sql.catalyst.expressions.ExpressionSet validConstraints ()  { throw new RuntimeException(); }
  public final  scala.collection.Seq<org.apache.spark.sql.catalyst.plans.logical.LogicalPlan> children ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.expressions.Attribute sequenceAttr ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan child ()  { throw new RuntimeException(); }
  // not preceding
  public   AttachDistributedSequence (org.apache.spark.sql.catalyst.expressions.Attribute sequenceAttr, org.apache.spark.sql.catalyst.plans.logical.LogicalPlan child)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.expressions.AttributeSet producedAttributes ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Attribute> output ()  { throw new RuntimeException(); }
  protected  org.apache.spark.sql.catalyst.plans.logical.AttachDistributedSequence withNewChildInternal (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan newChild)  { throw new RuntimeException(); }
  public  java.lang.String simpleString (int maxFields)  { throw new RuntimeException(); }
}
