package org.apache.spark.sql.execution.datasources.parquet;
/**
 * Rich information for a Parquet column together with its SparkSQL type.
 */
public  class ParquetColumn implements scala.Product, scala.Serializable {
  static public  org.apache.spark.sql.execution.datasources.parquet.ParquetColumn apply (org.apache.spark.sql.types.DataType sparkType, org.apache.parquet.io.PrimitiveColumnIO io)  { throw new RuntimeException(); }
  static public  org.apache.spark.sql.execution.datasources.parquet.ParquetColumn apply (org.apache.spark.sql.types.DataType sparkType, org.apache.parquet.io.GroupColumnIO io, scala.collection.Seq<org.apache.spark.sql.execution.datasources.parquet.ParquetColumn> children)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.types.DataType sparkType ()  { throw new RuntimeException(); }
  public  scala.Option<org.apache.parquet.column.ColumnDescriptor> descriptor ()  { throw new RuntimeException(); }
  public  int repetitionLevel ()  { throw new RuntimeException(); }
  public  int definitionLevel ()  { throw new RuntimeException(); }
  public  boolean required ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<java.lang.String> path ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.sql.execution.datasources.parquet.ParquetColumn> children ()  { throw new RuntimeException(); }
  // not preceding
  public   ParquetColumn (org.apache.spark.sql.types.DataType sparkType, scala.Option<org.apache.parquet.column.ColumnDescriptor> descriptor, int repetitionLevel, int definitionLevel, boolean required, scala.collection.Seq<java.lang.String> path, scala.collection.Seq<org.apache.spark.sql.execution.datasources.parquet.ParquetColumn> children)  { throw new RuntimeException(); }
  public  boolean isPrimitive ()  { throw new RuntimeException(); }
}
