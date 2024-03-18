package org.apache.spark.sql.execution.datasources.v2;
public  class ScanBuilderHolder extends org.apache.spark.sql.catalyst.plans.logical.LogicalPlan implements org.apache.spark.sql.catalyst.plans.logical.LeafNode, scala.Product, scala.Serializable {
  static public abstract  R apply (T1 v1, T2 v2, T3 v3)  ;
  static public  java.lang.String toString ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.AttributeReference> output ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.execution.datasources.v2.DataSourceV2Relation relation ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.connector.read.ScanBuilder builder ()  { throw new RuntimeException(); }
  // not preceding
  public   ScanBuilderHolder (scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.AttributeReference> output, org.apache.spark.sql.execution.datasources.v2.DataSourceV2Relation relation, org.apache.spark.sql.connector.read.ScanBuilder builder)  { throw new RuntimeException(); }
  public  scala.Option<java.lang.Object> pushedLimit ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.sql.connector.expressions.SortOrder> sortOrders ()  { throw new RuntimeException(); }
  public  scala.Option<org.apache.spark.sql.execution.datasources.v2.TableSampleInfo> pushedSample ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.sql.connector.expressions.filter.Predicate> pushedPredicates ()  { throw new RuntimeException(); }
}
