package org.apache.spark.sql.execution;
/**
 * Transforms the input by forking and running the specified script.
 * <p>
 * param:  script the command that should be executed.
 * param:  output the attributes that are produced by the script.
 * param:  child logical plan whose output is transformed.
 * param:  ioschema the class set that defines how to handle input/output data.
 */
public  class SparkScriptTransformationExec extends org.apache.spark.sql.execution.SparkPlan implements org.apache.spark.sql.execution.BaseScriptTransformationExec, scala.Product, scala.Serializable {
  static public abstract  R apply (T1 v1, T2 v2, T3 v3, T4 v4)  ;
  static public  java.lang.String toString ()  { throw new RuntimeException(); }
  protected  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> inputExpressionsWithoutSerde ()  { throw new RuntimeException(); }
  public final  scala.collection.Seq<org.apache.spark.sql.execution.SparkPlan> children ()  { throw new RuntimeException(); }
  public  java.lang.String script ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Attribute> output ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.execution.SparkPlan child ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.execution.ScriptTransformationIOSchema ioschema ()  { throw new RuntimeException(); }
  // not preceding
  public   SparkScriptTransformationExec (java.lang.String script, scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Attribute> output, org.apache.spark.sql.execution.SparkPlan child, org.apache.spark.sql.execution.ScriptTransformationIOSchema ioschema)  { throw new RuntimeException(); }
  public  scala.collection.Iterator<org.apache.spark.sql.catalyst.InternalRow> processIterator (scala.collection.Iterator<org.apache.spark.sql.catalyst.InternalRow> inputIterator, org.apache.hadoop.conf.Configuration hadoopConf)  { throw new RuntimeException(); }
  protected  org.apache.spark.sql.execution.SparkScriptTransformationExec withNewChildInternal (org.apache.spark.sql.execution.SparkPlan newChild)  { throw new RuntimeException(); }
}
