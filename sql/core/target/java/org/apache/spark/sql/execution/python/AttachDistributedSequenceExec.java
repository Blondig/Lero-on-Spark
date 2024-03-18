package org.apache.spark.sql.execution.python;
/**
 * A physical plan that adds a new long column with <code>sequenceAttr</code> that
 * increases one by one. This is for 'distributed-sequence' default index
 * in pandas API on Spark.
 */
public  class AttachDistributedSequenceExec extends org.apache.spark.sql.execution.SparkPlan implements org.apache.spark.sql.execution.UnaryExecNode, scala.Product, scala.Serializable {
  static public abstract  R apply (T1 v1, T2 v2)  ;
  static public  java.lang.String toString ()  { throw new RuntimeException(); }
  public final  scala.collection.Seq<org.apache.spark.sql.execution.SparkPlan> children ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.expressions.Attribute sequenceAttr ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.execution.SparkPlan child ()  { throw new RuntimeException(); }
  // not preceding
  public   AttachDistributedSequenceExec (org.apache.spark.sql.catalyst.expressions.Attribute sequenceAttr, org.apache.spark.sql.execution.SparkPlan child)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.expressions.AttributeSet producedAttributes ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Attribute> output ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.plans.physical.Partitioning outputPartitioning ()  { throw new RuntimeException(); }
  protected  org.apache.spark.rdd.RDD<org.apache.spark.sql.catalyst.InternalRow> doExecute ()  { throw new RuntimeException(); }
  protected  org.apache.spark.sql.execution.python.AttachDistributedSequenceExec withNewChildInternal (org.apache.spark.sql.execution.SparkPlan newChild)  { throw new RuntimeException(); }
  public  java.lang.String simpleString (int maxFields)  { throw new RuntimeException(); }
}
