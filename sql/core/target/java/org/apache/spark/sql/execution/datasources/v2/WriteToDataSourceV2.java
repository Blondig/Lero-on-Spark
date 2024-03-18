package org.apache.spark.sql.execution.datasources.v2;
/**
 * Deprecated logical plan for writing data into data source v2. This is being replaced by more
 * specific logical plans, like {@link org.apache.spark.sql.catalyst.plans.logical.AppendData}.
 *
 * @deprecated Use specific logical plans like AppendData instead. Since 2.4.0. 
 */
public  class WriteToDataSourceV2 extends org.apache.spark.sql.catalyst.plans.logical.LogicalPlan implements org.apache.spark.sql.catalyst.plans.logical.UnaryNode, scala.Product, scala.Serializable {
  static public abstract  R apply (T1 v1, T2 v2, T3 v3, T4 v4)  ;
  static public  java.lang.String toString ()  { throw new RuntimeException(); }
  protected  org.apache.spark.sql.catalyst.expressions.ExpressionSet validConstraints ()  { throw new RuntimeException(); }
  public final  scala.collection.Seq<org.apache.spark.sql.catalyst.plans.logical.LogicalPlan> children ()  { throw new RuntimeException(); }
  public  scala.Option<org.apache.spark.sql.execution.datasources.v2.DataSourceV2Relation> relation ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.connector.write.BatchWrite batchWrite ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan query ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.sql.connector.metric.CustomMetric> customMetrics ()  { throw new RuntimeException(); }
  // not preceding
  public   WriteToDataSourceV2 (scala.Option<org.apache.spark.sql.execution.datasources.v2.DataSourceV2Relation> relation, org.apache.spark.sql.connector.write.BatchWrite batchWrite, org.apache.spark.sql.catalyst.plans.logical.LogicalPlan query, scala.collection.Seq<org.apache.spark.sql.connector.metric.CustomMetric> customMetrics)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan child ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Attribute> output ()  { throw new RuntimeException(); }
  protected  org.apache.spark.sql.execution.datasources.v2.WriteToDataSourceV2 withNewChildInternal (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan newChild)  { throw new RuntimeException(); }
}
