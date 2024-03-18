package org.apache.spark.sql.execution.adaptive;
public  class SkewJoinChildWrapper extends org.apache.spark.sql.execution.SparkPlan implements org.apache.spark.sql.execution.LeafExecNode, scala.Product, scala.Serializable {
  static public abstract  R apply (T1 v1)  ;
  static public  java.lang.String toString ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.execution.SparkPlan plan ()  { throw new RuntimeException(); }
  // not preceding
  public   SkewJoinChildWrapper (org.apache.spark.sql.execution.SparkPlan plan)  { throw new RuntimeException(); }
  protected  org.apache.spark.rdd.RDD<org.apache.spark.sql.catalyst.InternalRow> doExecute ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Attribute> output ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.plans.physical.Partitioning outputPartitioning ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.SortOrder> outputOrdering ()  { throw new RuntimeException(); }
}
