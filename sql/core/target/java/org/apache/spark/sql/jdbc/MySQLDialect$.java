package org.apache.spark.sql.jdbc;
public  class MySQLDialect$ extends org.apache.spark.sql.jdbc.JdbcDialect implements org.apache.spark.sql.catalyst.SQLConfHelper, scala.Product, scala.Serializable {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final MySQLDialect$ MODULE$ = null;
  public   MySQLDialect$ ()  { throw new RuntimeException(); }
  public  boolean canHandle (java.lang.String url)  { throw new RuntimeException(); }
  public  scala.Option<java.lang.String> compileAggregate (org.apache.spark.sql.connector.expressions.aggregate.AggregateFunc aggFunction)  { throw new RuntimeException(); }
  public  scala.Option<org.apache.spark.sql.types.DataType> getCatalystType (int sqlType, java.lang.String typeName, int size, org.apache.spark.sql.types.MetadataBuilder md)  { throw new RuntimeException(); }
  public  java.lang.String quoteIdentifier (java.lang.String colName)  { throw new RuntimeException(); }
  public  boolean schemasExists (java.sql.Connection conn, org.apache.spark.sql.execution.datasources.jdbc.JDBCOptions options, java.lang.String schema)  { throw new RuntimeException(); }
  public  java.lang.String[][] listSchemas (java.sql.Connection conn, org.apache.spark.sql.execution.datasources.jdbc.JDBCOptions options)  { throw new RuntimeException(); }
  public  java.lang.String getTableExistsQuery (java.lang.String table)  { throw new RuntimeException(); }
  public  scala.Option<java.lang.Object> isCascadingTruncateTable ()  { throw new RuntimeException(); }
  public  java.lang.String getUpdateColumnTypeQuery (java.lang.String tableName, java.lang.String columnName, java.lang.String newDataType)  { throw new RuntimeException(); }
  public  java.lang.String getRenameColumnQuery (java.lang.String tableName, java.lang.String columnName, java.lang.String newName, int dbMajorVersion)  { throw new RuntimeException(); }
  public  java.lang.String getUpdateColumnNullabilityQuery (java.lang.String tableName, java.lang.String columnName, boolean isNullable)  { throw new RuntimeException(); }
  public  java.lang.String getTableCommentQuery (java.lang.String table, java.lang.String comment)  { throw new RuntimeException(); }
  public  scala.Option<org.apache.spark.sql.jdbc.JdbcType> getJDBCType (org.apache.spark.sql.types.DataType dt)  { throw new RuntimeException(); }
  public  java.lang.String getSchemaCommentQuery (java.lang.String schema, java.lang.String comment)  { throw new RuntimeException(); }
  public  java.lang.String removeSchemaCommentQuery (java.lang.String schema)  { throw new RuntimeException(); }
  public  java.lang.String createIndex (java.lang.String indexName, java.lang.String tableName, org.apache.spark.sql.connector.expressions.NamedReference[] columns, java.util.Map<org.apache.spark.sql.connector.expressions.NamedReference, java.util.Map<java.lang.String, java.lang.String>> columnsProperties, java.util.Map<java.lang.String, java.lang.String> properties)  { throw new RuntimeException(); }
  public  boolean indexExists (java.sql.Connection conn, java.lang.String indexName, java.lang.String tableName, org.apache.spark.sql.execution.datasources.jdbc.JDBCOptions options)  { throw new RuntimeException(); }
  public  java.lang.String dropIndex (java.lang.String indexName, java.lang.String tableName)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.connector.catalog.index.TableIndex[] listIndexes (java.sql.Connection conn, java.lang.String tableName, org.apache.spark.sql.execution.datasources.jdbc.JDBCOptions options)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.AnalysisException classifyException (java.lang.String message, java.lang.Throwable e)  { throw new RuntimeException(); }
  public  java.lang.String dropSchema (java.lang.String schema, boolean cascade)  { throw new RuntimeException(); }
}
