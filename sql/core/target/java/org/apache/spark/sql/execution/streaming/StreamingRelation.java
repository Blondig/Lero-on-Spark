package org.apache.spark.sql.execution.streaming;
public  class StreamingRelation extends org.apache.spark.sql.catalyst.plans.logical.LogicalPlan implements org.apache.spark.sql.catalyst.plans.logical.LeafNode, org.apache.spark.sql.catalyst.analysis.MultiInstanceRelation, org.apache.spark.sql.catalyst.plans.logical.ExposesMetadataColumns, scala.Product, scala.Serializable {
  static public  org.apache.spark.sql.execution.streaming.StreamingRelation apply (org.apache.spark.sql.execution.datasources.DataSource dataSource)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.execution.datasources.DataSource dataSource ()  { throw new RuntimeException(); }
  public  java.lang.String sourceName ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Attribute> output ()  { throw new RuntimeException(); }
  // not preceding
  public   StreamingRelation (org.apache.spark.sql.execution.datasources.DataSource dataSource, java.lang.String sourceName, scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Attribute> output)  { throw new RuntimeException(); }
  public  boolean isStreaming ()  { throw new RuntimeException(); }
  public  java.lang.String toString ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.plans.logical.Statistics computeStats ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan newInstance ()  { throw new RuntimeException(); }
  // not preceding
  public  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.AttributeReference> metadataOutput ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan withMetadataColumns ()  { throw new RuntimeException(); }
}
