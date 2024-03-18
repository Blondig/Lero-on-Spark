package org.apache.spark.sql.execution.command;
public abstract class DescribeCommandBase extends org.apache.spark.sql.catalyst.plans.logical.LogicalPlan implements org.apache.spark.sql.execution.command.LeafRunnableCommand {
  public   DescribeCommandBase ()  { throw new RuntimeException(); }
  protected  void append (scala.collection.mutable.ArrayBuffer<org.apache.spark.sql.Row> buffer, java.lang.String column, java.lang.String dataType, java.lang.String comment)  { throw new RuntimeException(); }
  protected  void describeSchema (org.apache.spark.sql.types.StructType schema, scala.collection.mutable.ArrayBuffer<org.apache.spark.sql.Row> buffer, boolean header)  { throw new RuntimeException(); }
  public  scala.collection.immutable.Map<java.lang.String, org.apache.spark.sql.execution.metric.SQLMetric> metrics ()  { throw new RuntimeException(); }
  public final  scala.collection.Seq<scala.Enumeration.Value> nodePatterns ()  { throw new RuntimeException(); }
}
