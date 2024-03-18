package org.apache.spark.sql.execution.datasources.v2;
public  class WriteToDataSourceV2Exec extends org.apache.spark.sql.execution.datasources.v2.V2CommandExec implements org.apache.spark.sql.execution.datasources.v2.V2TableWriteExec, scala.Product, scala.Serializable {
  static public abstract  R apply (T1 v1, T2 v2, T3 v3, T4 v4)  ;
  static public  java.lang.String toString ()  { throw new RuntimeException(); }
  public  scala.Option<org.apache.spark.sql.execution.datasources.v2.StreamWriterCommitProgress> commitProgress ()  { throw new RuntimeException(); }
  public  scala.collection.immutable.Map<java.lang.String, org.apache.spark.sql.execution.metric.SQLMetric> metrics ()  { throw new RuntimeException(); }
  public final  scala.collection.Seq<org.apache.spark.sql.execution.SparkPlan> children ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.connector.write.BatchWrite batchWrite ()  { throw new RuntimeException(); }
  public  scala.Function0<scala.runtime.BoxedUnit> refreshCache ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.execution.SparkPlan query ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.sql.connector.metric.CustomMetric> writeMetrics ()  { throw new RuntimeException(); }
  // not preceding
  public   WriteToDataSourceV2Exec (org.apache.spark.sql.connector.write.BatchWrite batchWrite, scala.Function0<scala.runtime.BoxedUnit> refreshCache, org.apache.spark.sql.execution.SparkPlan query, scala.collection.Seq<org.apache.spark.sql.connector.metric.CustomMetric> writeMetrics)  { throw new RuntimeException(); }
  public  scala.collection.immutable.Map<java.lang.String, org.apache.spark.sql.execution.metric.SQLMetric> customMetrics ()  { throw new RuntimeException(); }
  protected  scala.collection.Seq<org.apache.spark.sql.catalyst.InternalRow> run ()  { throw new RuntimeException(); }
  protected  org.apache.spark.sql.execution.datasources.v2.WriteToDataSourceV2Exec withNewChildInternal (org.apache.spark.sql.execution.SparkPlan newChild)  { throw new RuntimeException(); }
}
