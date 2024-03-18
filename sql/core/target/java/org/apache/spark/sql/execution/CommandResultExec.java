package org.apache.spark.sql.execution;
/**
 * Physical plan node for holding data from a command.
 * <p>
 * <code>commandPhysicalPlan</code> is just used to display the plan tree for EXPLAIN.
 * <code>rows</code> may not be serializable and ideally we should not send <code>rows</code> to the executors.
 * Thus marking them as transient.
 */
public  class CommandResultExec extends org.apache.spark.sql.execution.SparkPlan implements org.apache.spark.sql.execution.LeafExecNode, org.apache.spark.sql.execution.InputRDDCodegen, scala.Product, scala.Serializable {
  static public abstract  R apply (T1 v1, T2 v2, T3 v3)  ;
  static public  java.lang.String toString ()  { throw new RuntimeException(); }
  protected  org.apache.spark.sql.execution.CodegenSupport parent ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Attribute> output ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.execution.SparkPlan commandPhysicalPlan ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.sql.catalyst.InternalRow> rows ()  { throw new RuntimeException(); }
  // not preceding
  public   CommandResultExec (scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Attribute> output, org.apache.spark.sql.execution.SparkPlan commandPhysicalPlan, scala.collection.Seq<org.apache.spark.sql.catalyst.InternalRow> rows)  { throw new RuntimeException(); }
  // not preceding
  public  scala.collection.immutable.Map<java.lang.String, org.apache.spark.sql.execution.metric.SQLMetric> metrics ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.sql.catalyst.plans.QueryPlan<?>> innerChildren ()  { throw new RuntimeException(); }
  public  org.apache.spark.rdd.RDD<org.apache.spark.sql.catalyst.InternalRow> doExecute ()  { throw new RuntimeException(); }
  protected  scala.collection.Iterator<java.lang.Object> stringArgs ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.InternalRow[] executeCollect ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.InternalRow[] executeTake (int limit)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.InternalRow[] executeTail (int limit)  { throw new RuntimeException(); }
  protected  boolean createUnsafeProjection ()  { throw new RuntimeException(); }
  public  org.apache.spark.rdd.RDD<org.apache.spark.sql.catalyst.InternalRow> inputRDD ()  { throw new RuntimeException(); }
}
