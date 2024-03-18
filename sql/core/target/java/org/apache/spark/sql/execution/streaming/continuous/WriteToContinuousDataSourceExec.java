package org.apache.spark.sql.execution.streaming.continuous;
/**
 * The physical plan for writing data into a continuous processing {@link StreamingWrite}.
 */
public  class WriteToContinuousDataSourceExec extends org.apache.spark.sql.execution.SparkPlan implements org.apache.spark.sql.execution.UnaryExecNode, org.apache.spark.internal.Logging, scala.Product, scala.Serializable {
  static public abstract  R apply (T1 v1, T2 v2, T3 v3)  ;
  static public  java.lang.String toString ()  { throw new RuntimeException(); }
  public final  scala.collection.Seq<org.apache.spark.sql.execution.SparkPlan> children ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.connector.write.streaming.StreamingWrite write ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.execution.SparkPlan query ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.sql.connector.metric.CustomMetric> customMetrics ()  { throw new RuntimeException(); }
  // not preceding
  public   WriteToContinuousDataSourceExec (org.apache.spark.sql.connector.write.streaming.StreamingWrite write, org.apache.spark.sql.execution.SparkPlan query, scala.collection.Seq<org.apache.spark.sql.connector.metric.CustomMetric> customMetrics)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.execution.SparkPlan child ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Attribute> output ()  { throw new RuntimeException(); }
  // not preceding
  public  scala.collection.immutable.Map<java.lang.String, org.apache.spark.sql.execution.metric.SQLMetric> metrics ()  { throw new RuntimeException(); }
  protected  org.apache.spark.rdd.RDD<org.apache.spark.sql.catalyst.InternalRow> doExecute ()  { throw new RuntimeException(); }
  protected  org.apache.spark.sql.execution.streaming.continuous.WriteToContinuousDataSourceExec withNewChildInternal (org.apache.spark.sql.execution.SparkPlan newChild)  { throw new RuntimeException(); }
}
