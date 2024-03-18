package org.apache.spark.sql.execution.streaming.sources;
/**
 * The logical plan for writing data to a micro-batch stream.
 * <p>
 * Note that this logical plan does not have a corresponding physical plan, as it will be converted
 * to {@link org.apache.spark.sql.execution.datasources.v2.WriteToDataSourceV2 WriteToDataSourceV2}
 * with {@link MicroBatchWrite} before execution.
 */
public  class WriteToMicroBatchDataSource extends org.apache.spark.sql.catalyst.plans.logical.LogicalPlan implements org.apache.spark.sql.catalyst.plans.logical.UnaryNode, scala.Product, scala.Serializable {
  static public abstract  R apply (T1 v1, T2 v2, T3 v3, T4 v4, T5 v5, T6 v6, T7 v7)  ;
  static public  java.lang.String toString ()  { throw new RuntimeException(); }
  protected  org.apache.spark.sql.catalyst.expressions.ExpressionSet validConstraints ()  { throw new RuntimeException(); }
  public final  scala.collection.Seq<org.apache.spark.sql.catalyst.plans.logical.LogicalPlan> children ()  { throw new RuntimeException(); }
  public  scala.Option<org.apache.spark.sql.execution.datasources.v2.DataSourceV2Relation> relation ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.connector.catalog.SupportsWrite table ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan query ()  { throw new RuntimeException(); }
  public  java.lang.String queryId ()  { throw new RuntimeException(); }
  public  scala.collection.immutable.Map<java.lang.String, java.lang.String> writeOptions ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.streaming.OutputMode outputMode ()  { throw new RuntimeException(); }
  public  scala.Option<java.lang.Object> batchId ()  { throw new RuntimeException(); }
  // not preceding
  public   WriteToMicroBatchDataSource (scala.Option<org.apache.spark.sql.execution.datasources.v2.DataSourceV2Relation> relation, org.apache.spark.sql.connector.catalog.SupportsWrite table, org.apache.spark.sql.catalyst.plans.logical.LogicalPlan query, java.lang.String queryId, scala.collection.immutable.Map<java.lang.String, java.lang.String> writeOptions, org.apache.spark.sql.streaming.OutputMode outputMode, scala.Option<java.lang.Object> batchId)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan child ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Attribute> output ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.execution.streaming.sources.WriteToMicroBatchDataSource withNewBatchId (long batchId)  { throw new RuntimeException(); }
  protected  org.apache.spark.sql.execution.streaming.sources.WriteToMicroBatchDataSource withNewChildInternal (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan newChild)  { throw new RuntimeException(); }
}
