package org.apache.spark.sql.execution.streaming.continuous;
/**
 * The logical plan for writing data in a continuous stream.
 */
public  class WriteToContinuousDataSource extends org.apache.spark.sql.catalyst.plans.logical.LogicalPlan implements org.apache.spark.sql.catalyst.plans.logical.UnaryNode, scala.Product, scala.Serializable {
  static public abstract  R apply (T1 v1, T2 v2, T3 v3)  ;
  static public  java.lang.String toString ()  { throw new RuntimeException(); }
  protected  org.apache.spark.sql.catalyst.expressions.ExpressionSet validConstraints ()  { throw new RuntimeException(); }
  public final  scala.collection.Seq<org.apache.spark.sql.catalyst.plans.logical.LogicalPlan> children ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.connector.write.streaming.StreamingWrite write ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan query ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.sql.connector.metric.CustomMetric> customMetrics ()  { throw new RuntimeException(); }
  // not preceding
  public   WriteToContinuousDataSource (org.apache.spark.sql.connector.write.streaming.StreamingWrite write, org.apache.spark.sql.catalyst.plans.logical.LogicalPlan query, scala.collection.Seq<org.apache.spark.sql.connector.metric.CustomMetric> customMetrics)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan child ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Attribute> output ()  { throw new RuntimeException(); }
  protected  org.apache.spark.sql.execution.streaming.continuous.WriteToContinuousDataSource withNewChildInternal (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan newChild)  { throw new RuntimeException(); }
}
