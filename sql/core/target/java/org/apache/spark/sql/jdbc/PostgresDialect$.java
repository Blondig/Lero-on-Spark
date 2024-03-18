package org.apache.spark.sql.jdbc;
public  class PostgresDialect$ extends org.apache.spark.sql.jdbc.JdbcDialect implements org.apache.spark.sql.catalyst.SQLConfHelper {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final PostgresDialect$ MODULE$ = null;
  public   PostgresDialect$ ()  { throw new RuntimeException(); }
  public  boolean canHandle (java.lang.String url)  { throw new RuntimeException(); }
  public  scala.Option<java.lang.String> compileAggregate (org.apache.spark.sql.connector.expressions.aggregate.AggregateFunc aggFunction)  { throw new RuntimeException(); }
  public  scala.Option<org.apache.spark.sql.types.DataType> getCatalystType (int sqlType, java.lang.String typeName, int size, org.apache.spark.sql.types.MetadataBuilder md)  { throw new RuntimeException(); }
  public  scala.Option<org.apache.spark.sql.jdbc.JdbcType> getJDBCType (org.apache.spark.sql.types.DataType dt)  { throw new RuntimeException(); }
  public  java.lang.String getTableExistsQuery (java.lang.String table)  { throw new RuntimeException(); }
  public  scala.Option<java.lang.Object> isCascadingTruncateTable ()  { throw new RuntimeException(); }
  /**
   * The SQL query used to truncate a table. For Postgres, the default behaviour is to
   * also truncate any descendant tables. As this is a (possibly unwanted) side-effect,
   * the Postgres dialect adds 'ONLY' to truncate only the table in question
   * @param table The table to truncate
   * @param cascade Whether or not to cascade the truncation. Default value is the value of
   *                isCascadingTruncateTable(). Cascading a truncation will truncate tables
   *               with a foreign key relationship to the target table. However, it will not
   *               truncate tables with an inheritance relationship to the target table, as
   *               the truncate query always includes "ONLY" to prevent this behaviour.
   * @return The SQL query to use for truncating a table
   */
  public  java.lang.String getTruncateQuery (java.lang.String table, scala.Option<java.lang.Object> cascade)  { throw new RuntimeException(); }
  public  void beforeFetch (java.sql.Connection connection, scala.collection.immutable.Map<java.lang.String, java.lang.String> properties)  { throw new RuntimeException(); }
  public  java.lang.String getUpdateColumnTypeQuery (java.lang.String tableName, java.lang.String columnName, java.lang.String newDataType)  { throw new RuntimeException(); }
  public  java.lang.String getUpdateColumnNullabilityQuery (java.lang.String tableName, java.lang.String columnName, boolean isNullable)  { throw new RuntimeException(); }
  public  boolean supportsTableSample ()  { throw new RuntimeException(); }
  public  java.lang.String getTableSample (org.apache.spark.sql.execution.datasources.v2.TableSampleInfo sample)  { throw new RuntimeException(); }
  public  java.lang.String createIndex (java.lang.String indexName, java.lang.String tableName, org.apache.spark.sql.connector.expressions.NamedReference[] columns, java.util.Map<org.apache.spark.sql.connector.expressions.NamedReference, java.util.Map<java.lang.String, java.lang.String>> columnsProperties, java.util.Map<java.lang.String, java.lang.String> properties)  { throw new RuntimeException(); }
  public  boolean indexExists (java.sql.Connection conn, java.lang.String indexName, java.lang.String tableName, org.apache.spark.sql.execution.datasources.jdbc.JDBCOptions options)  { throw new RuntimeException(); }
  public  java.lang.String dropIndex (java.lang.String indexName, java.lang.String tableName)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.AnalysisException classifyException (java.lang.String message, java.lang.Throwable e)  { throw new RuntimeException(); }
}
