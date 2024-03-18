package org.apache.spark.sql.catalyst.streaming;
/**
 * A statement for Stream writing. It contains all neccessary param and will be resolved in the
 * rule {@link ResolveStreamWrite}.
 * <p>
 * param:  userSpecifiedName  Query name optionally specified by the user.
 * param:  userSpecifiedCheckpointLocation  Checkpoint location optionally specified by the user.
 * param:  useTempCheckpointLocation  Whether to use a temporary checkpoint location when the user
 *                                   has not specified one. If false, then error will be thrown.
 * param:  recoverFromCheckpointLocation  Whether to recover query from the checkpoint location.
 *                                       If false and the checkpoint location exists, then error
 *                                       will be thrown.
 * param:  sink  Sink to write the streaming outputs.
 * param:  outputMode  Output mode for the sink.
 * param:  hadoopConf  The Hadoop Configuration to get a FileSystem instance
 * param:  isContinuousTrigger  Whether the statement is triggered by a continuous query or not.
 * param:  inputQuery  The analyzed query plan from the streaming DataFrame.
 * param:  catalogAndIdent Catalog and identifier for the sink, set when it is a V2 catalog table
 */
public  class WriteToStreamStatement extends org.apache.spark.sql.catalyst.plans.logical.LogicalPlan implements org.apache.spark.sql.catalyst.plans.logical.UnaryNode, scala.Product, scala.Serializable {
  static public abstract  R apply (T1 v1, T2 v2, T3 v3, T4 v4, T5 v5, T6 v6, T7 v7, T8 v8, T9 v9, T10 v10)  ;
  static public  java.lang.String toString ()  { throw new RuntimeException(); }
  protected  org.apache.spark.sql.catalyst.expressions.ExpressionSet validConstraints ()  { throw new RuntimeException(); }
  public final  scala.collection.Seq<org.apache.spark.sql.catalyst.plans.logical.LogicalPlan> children ()  { throw new RuntimeException(); }
  public  scala.Option<java.lang.String> userSpecifiedName ()  { throw new RuntimeException(); }
  public  scala.Option<java.lang.String> userSpecifiedCheckpointLocation ()  { throw new RuntimeException(); }
  public  boolean useTempCheckpointLocation ()  { throw new RuntimeException(); }
  public  boolean recoverFromCheckpointLocation ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.connector.catalog.Table sink ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.streaming.OutputMode outputMode ()  { throw new RuntimeException(); }
  public  org.apache.hadoop.conf.Configuration hadoopConf ()  { throw new RuntimeException(); }
  public  boolean isContinuousTrigger ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan inputQuery ()  { throw new RuntimeException(); }
  public  scala.Option<scala.Tuple2<org.apache.spark.sql.connector.catalog.TableCatalog, org.apache.spark.sql.connector.catalog.Identifier>> catalogAndIdent ()  { throw new RuntimeException(); }
  // not preceding
  public   WriteToStreamStatement (scala.Option<java.lang.String> userSpecifiedName, scala.Option<java.lang.String> userSpecifiedCheckpointLocation, boolean useTempCheckpointLocation, boolean recoverFromCheckpointLocation, org.apache.spark.sql.connector.catalog.Table sink, org.apache.spark.sql.streaming.OutputMode outputMode, org.apache.hadoop.conf.Configuration hadoopConf, boolean isContinuousTrigger, org.apache.spark.sql.catalyst.plans.logical.LogicalPlan inputQuery, scala.Option<scala.Tuple2<org.apache.spark.sql.connector.catalog.TableCatalog, org.apache.spark.sql.connector.catalog.Identifier>> catalogAndIdent)  { throw new RuntimeException(); }
  public  boolean isStreaming ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Attribute> output ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan child ()  { throw new RuntimeException(); }
  protected  org.apache.spark.sql.catalyst.streaming.WriteToStreamStatement withNewChildInternal (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan newChild)  { throw new RuntimeException(); }
}
