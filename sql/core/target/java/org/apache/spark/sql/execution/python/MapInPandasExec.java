package org.apache.spark.sql.execution.python;
/**
 * A relation produced by applying a function that takes an iterator of pandas DataFrames
 * and outputs an iterator of pandas DataFrames.
 */
public  class MapInPandasExec extends org.apache.spark.sql.execution.SparkPlan implements org.apache.spark.sql.execution.python.MapInBatchExec, scala.Product, scala.Serializable {
  static public abstract  R apply (T1 v1, T2 v2, T3 v3)  ;
  static public  java.lang.String toString ()  { throw new RuntimeException(); }
  public final  scala.collection.Seq<org.apache.spark.sql.execution.SparkPlan> children ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.expressions.Expression func ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Attribute> output ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.execution.SparkPlan child ()  { throw new RuntimeException(); }
  // not preceding
  public   MapInPandasExec (org.apache.spark.sql.catalyst.expressions.Expression func, scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Attribute> output, org.apache.spark.sql.execution.SparkPlan child)  { throw new RuntimeException(); }
  protected  int pythonEvalType ()  { throw new RuntimeException(); }
  protected  org.apache.spark.sql.execution.python.MapInPandasExec withNewChildInternal (org.apache.spark.sql.execution.SparkPlan newChild)  { throw new RuntimeException(); }
}
