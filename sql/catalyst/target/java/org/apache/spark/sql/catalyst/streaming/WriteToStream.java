package org.apache.spark.sql.catalyst.streaming;
/**
 * Used to create a {@link StreamExecution}.
 */
public  class WriteToStream extends org.apache.spark.sql.catalyst.plans.logical.LogicalPlan implements org.apache.spark.sql.catalyst.plans.logical.UnaryNode, scala.Product, scala.Serializable {
  static public abstract  R apply (T1 v1, T2 v2, T3 v3, T4 v4, T5 v5, T6 v6, T7 v7)  ;
  static public  java.lang.String toString ()  { throw new RuntimeException(); }
  protected  org.apache.spark.sql.catalyst.expressions.ExpressionSet validConstraints ()  { throw new RuntimeException(); }
  public final  scala.collection.Seq<org.apache.spark.sql.catalyst.plans.logical.LogicalPlan> children ()  { throw new RuntimeException(); }
  public  java.lang.String name ()  { throw new RuntimeException(); }
  public  java.lang.String resolvedCheckpointLocation ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.connector.catalog.Table sink ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.streaming.OutputMode outputMode ()  { throw new RuntimeException(); }
  public  boolean deleteCheckpointOnStop ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan inputQuery ()  { throw new RuntimeException(); }
  public  scala.Option<scala.Tuple2<org.apache.spark.sql.connector.catalog.TableCatalog, org.apache.spark.sql.connector.catalog.Identifier>> catalogAndIdent ()  { throw new RuntimeException(); }
  // not preceding
  public   WriteToStream (java.lang.String name, java.lang.String resolvedCheckpointLocation, org.apache.spark.sql.connector.catalog.Table sink, org.apache.spark.sql.streaming.OutputMode outputMode, boolean deleteCheckpointOnStop, org.apache.spark.sql.catalyst.plans.logical.LogicalPlan inputQuery, scala.Option<scala.Tuple2<org.apache.spark.sql.connector.catalog.TableCatalog, org.apache.spark.sql.connector.catalog.Identifier>> catalogAndIdent)  { throw new RuntimeException(); }
  public  boolean isStreaming ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Attribute> output ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan child ()  { throw new RuntimeException(); }
  protected  org.apache.spark.sql.catalyst.streaming.WriteToStream withNewChildInternal (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan newChild)  { throw new RuntimeException(); }
}
