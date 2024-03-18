package org.apache.spark.sql.jdbc;
public  class DB2Dialect$ extends org.apache.spark.sql.jdbc.JdbcDialect {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final DB2Dialect$ MODULE$ = null;
  public   DB2Dialect$ ()  { throw new RuntimeException(); }
  public  boolean canHandle (java.lang.String url)  { throw new RuntimeException(); }
  public  scala.Option<java.lang.String> compileAggregate (org.apache.spark.sql.connector.expressions.aggregate.AggregateFunc aggFunction)  { throw new RuntimeException(); }
  public  scala.Option<org.apache.spark.sql.types.DataType> getCatalystType (int sqlType, java.lang.String typeName, int size, org.apache.spark.sql.types.MetadataBuilder md)  { throw new RuntimeException(); }
  public  scala.Option<org.apache.spark.sql.jdbc.JdbcType> getJDBCType (org.apache.spark.sql.types.DataType dt)  { throw new RuntimeException(); }
  public  scala.Option<java.lang.Object> isCascadingTruncateTable ()  { throw new RuntimeException(); }
  public  java.lang.String getTruncateQuery (java.lang.String table, scala.Option<java.lang.Object> cascade)  { throw new RuntimeException(); }
  public  java.lang.String renameTable (java.lang.String oldTable, java.lang.String newTable)  { throw new RuntimeException(); }
  public  java.lang.String getUpdateColumnTypeQuery (java.lang.String tableName, java.lang.String columnName, java.lang.String newDataType)  { throw new RuntimeException(); }
  public  java.lang.String getUpdateColumnNullabilityQuery (java.lang.String tableName, java.lang.String columnName, boolean isNullable)  { throw new RuntimeException(); }
  public  java.lang.String removeSchemaCommentQuery (java.lang.String schema)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.AnalysisException classifyException (java.lang.String message, java.lang.Throwable e)  { throw new RuntimeException(); }
  public  java.lang.String dropSchema (java.lang.String schema, boolean cascade)  { throw new RuntimeException(); }
}
