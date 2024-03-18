package org.apache.spark.sql.execution.datasources.v2.jdbc;
public  class JDBCTable implements org.apache.spark.sql.connector.catalog.Table, org.apache.spark.sql.connector.catalog.SupportsRead, org.apache.spark.sql.connector.catalog.SupportsWrite, org.apache.spark.sql.connector.catalog.index.SupportsIndex, scala.Product, scala.Serializable {
  static public abstract  R apply (T1 v1, T2 v2, T3 v3)  ;
  static public  java.lang.String toString ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.connector.catalog.Identifier ident ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.types.StructType schema ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.execution.datasources.jdbc.JDBCOptions jdbcOptions ()  { throw new RuntimeException(); }
  // not preceding
  public   JDBCTable (org.apache.spark.sql.connector.catalog.Identifier ident, org.apache.spark.sql.types.StructType schema, org.apache.spark.sql.execution.datasources.jdbc.JDBCOptions jdbcOptions)  { throw new RuntimeException(); }
  public  java.lang.String name ()  { throw new RuntimeException(); }
  public  java.util.Set<org.apache.spark.sql.connector.catalog.TableCapability> capabilities ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.execution.datasources.v2.jdbc.JDBCScanBuilder newScanBuilder (org.apache.spark.sql.util.CaseInsensitiveStringMap options)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.connector.write.WriteBuilder newWriteBuilder (org.apache.spark.sql.connector.write.LogicalWriteInfo info)  { throw new RuntimeException(); }
  public  void createIndex (java.lang.String indexName, org.apache.spark.sql.connector.expressions.NamedReference[] columns, java.util.Map<org.apache.spark.sql.connector.expressions.NamedReference, java.util.Map<java.lang.String, java.lang.String>> columnsProperties, java.util.Map<java.lang.String, java.lang.String> properties)  { throw new RuntimeException(); }
  public  boolean indexExists (java.lang.String indexName)  { throw new RuntimeException(); }
  public  void dropIndex (java.lang.String indexName)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.connector.catalog.index.TableIndex[] listIndexes ()  { throw new RuntimeException(); }
}
