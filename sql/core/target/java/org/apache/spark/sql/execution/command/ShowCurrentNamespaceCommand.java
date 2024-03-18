package org.apache.spark.sql.execution.command;
/**
 * The command for <code>SHOW CURRENT NAMESPACE</code>.
 */
public  class ShowCurrentNamespaceCommand extends org.apache.spark.sql.catalyst.plans.logical.LogicalPlan implements org.apache.spark.sql.execution.command.LeafRunnableCommand, scala.Product, scala.Serializable {
  static public abstract  R apply ()  ;
  static public  java.lang.String toString ()  { throw new RuntimeException(); }
  public  scala.collection.immutable.Map<java.lang.String, org.apache.spark.sql.execution.metric.SQLMetric> metrics ()  { throw new RuntimeException(); }
  public final  scala.collection.Seq<scala.Enumeration.Value> nodePatterns ()  { throw new RuntimeException(); }
  public   ShowCurrentNamespaceCommand ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Attribute> output ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.sql.Row> run (org.apache.spark.sql.SparkSession sparkSession)  { throw new RuntimeException(); }
}
