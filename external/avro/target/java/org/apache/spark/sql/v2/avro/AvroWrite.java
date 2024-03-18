package org.apache.spark.sql.v2.avro;
public  class AvroWrite implements org.apache.spark.sql.execution.datasources.v2.FileWrite, scala.Product, scala.Serializable {
  static public abstract  R apply (T1 v1, T2 v2, T3 v3, T4 v4)  ;
  static public  java.lang.String toString ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<java.lang.String> paths ()  { throw new RuntimeException(); }
  public  java.lang.String formatName ()  { throw new RuntimeException(); }
  public  scala.Function1<org.apache.spark.sql.types.DataType, java.lang.Object> supportsDataType ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.connector.write.LogicalWriteInfo info ()  { throw new RuntimeException(); }
  // not preceding
  public   AvroWrite (scala.collection.Seq<java.lang.String> paths, java.lang.String formatName, scala.Function1<org.apache.spark.sql.types.DataType, java.lang.Object> supportsDataType, org.apache.spark.sql.connector.write.LogicalWriteInfo info)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.execution.datasources.OutputWriterFactory prepareWrite (org.apache.spark.sql.internal.SQLConf sqlConf, org.apache.hadoop.mapreduce.Job job, scala.collection.immutable.Map<java.lang.String, java.lang.String> options, org.apache.spark.sql.types.StructType dataSchema)  { throw new RuntimeException(); }
}
