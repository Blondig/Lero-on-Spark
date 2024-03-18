package org.apache.spark.sql.execution.datasources.v2;
/**
 * Physical plan node to replace data in existing tables.
 */
public  class ReplaceDataExec extends org.apache.spark.sql.execution.datasources.v2.V2CommandExec implements org.apache.spark.sql.execution.datasources.v2.V2ExistingTableWriteExec, scala.Product, scala.Serializable {
  static public abstract  R apply (T1 v1, T2 v2, T3 v3)  ;
  static public  java.lang.String toString ()  { throw new RuntimeException(); }
  public  scala.collection.immutable.Map<java.lang.String, org.apache.spark.sql.execution.metric.SQLMetric> customMetrics ()  { throw new RuntimeException(); }
  public  scala.Option<org.apache.spark.sql.execution.datasources.v2.StreamWriterCommitProgress> commitProgress ()  { throw new RuntimeException(); }
  public  scala.collection.immutable.Map<java.lang.String, org.apache.spark.sql.execution.metric.SQLMetric> metrics ()  { throw new RuntimeException(); }
  public final  scala.collection.Seq<org.apache.spark.sql.execution.SparkPlan> children ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.execution.SparkPlan query ()  { throw new RuntimeException(); }
  public  scala.Function0<scala.runtime.BoxedUnit> refreshCache ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.connector.write.Write write ()  { throw new RuntimeException(); }
  // not preceding
  public   ReplaceDataExec (org.apache.spark.sql.execution.SparkPlan query, scala.Function0<scala.runtime.BoxedUnit> refreshCache, org.apache.spark.sql.connector.write.Write write)  { throw new RuntimeException(); }
  public  scala.collection.Iterator<java.lang.Object> stringArgs ()  { throw new RuntimeException(); }
  protected  org.apache.spark.sql.execution.datasources.v2.ReplaceDataExec withNewChildInternal (org.apache.spark.sql.execution.SparkPlan newChild)  { throw new RuntimeException(); }
}
