package org.apache.spark.sql.jdbc;
/**
 * :: DeveloperApi ::
 * Encapsulates everything (extensions, workarounds, quirks) to handle the
 * SQL dialect of a certain database or jdbc driver.
 * Lots of databases define types that aren't explicitly supported
 * by the JDBC spec.  Some JDBC drivers also report inaccurate
 * information---for instance, BIT(n{@literal >}1) being reported as a BIT type is quite
 * common, even though BIT in JDBC is meant for single-bit values. Also, there
 * does not appear to be a standard name for an unbounded string or binary
 * type; we use BLOB and CLOB by default but override with database-specific
 * alternatives when these are absent or do not behave correctly.
 * <p>
 * Currently, the only thing done by the dialect is type mapping.
 * <code>getCatalystType</code> is used when reading from a JDBC table and <code>getJDBCType</code>
 * is used when writing to a JDBC table.  If <code>getCatalystType</code> returns <code>null</code>,
 * the default type handling is used for the given JDBC type.  Similarly,
 * if <code>getJDBCType</code> returns <code>(null, None)</code>, the default type handling is used
 * for the given Catalyst type.
 */
public abstract class JdbcDialect implements scala.Serializable, org.apache.spark.internal.Logging {
    class JDBCSQLBuilder extends org.apache.spark.sql.connector.util.V2ExpressionSQLBuilder {
    public   JDBCSQLBuilder ()  { throw new RuntimeException(); }
    public  java.lang.String visitCast (java.lang.String l, org.apache.spark.sql.types.DataType dataType)  { throw new RuntimeException(); }
    public  java.lang.String visitLiteral (org.apache.spark.sql.connector.expressions.Literal<?> literal)  { throw new RuntimeException(); }
    public  java.lang.String visitNamedReference (org.apache.spark.sql.connector.expressions.NamedReference namedRef)  { throw new RuntimeException(); }
    public  java.lang.String visitSQLFunction (java.lang.String funcName, java.lang.String[] inputs)  { throw new RuntimeException(); }
  }
  public   JdbcDialect ()  { throw new RuntimeException(); }
  /**
   * Alter an existing table.
   * <p>
   * @param tableName The name of the table to be altered.
   * @param changes Changes to apply to the table.
   * @return The SQL statements to use for altering the table.
   * @param dbMajorVersion (undocumented)
   */
  public  java.lang.String[] alterTable (java.lang.String tableName, scala.collection.Seq<org.apache.spark.sql.connector.catalog.TableChange> changes, int dbMajorVersion)  { throw new RuntimeException(); }
  /**
   * Override connection specific properties to run before a select is made.  This is in place to
   * allow dialects that need special treatment to optimize behavior.
   * @param connection The connection object
   * @param properties The connection properties.  This is passed through from the relation.
   */
  public  void beforeFetch (java.sql.Connection connection, scala.collection.immutable.Map<java.lang.String, java.lang.String> properties)  { throw new RuntimeException(); }
  /**
   * Check if this dialect instance can handle a certain jdbc url.
   * @param url the jdbc url.
   * @return True if the dialect can be applied on the given jdbc url.
   * @throws NullPointerException if the url is null.
   */
  public abstract  boolean canHandle (java.lang.String url)  ;
  /**
   * Gets a dialect exception, classifies it and wraps it by <code>AnalysisException</code>.
   * @param message The error message to be placed to the returned exception.
   * @param e The dialect specific exception.
   * @return <code>AnalysisException</code> or its sub-class.
   */
  public  org.apache.spark.sql.AnalysisException classifyException (java.lang.String message, java.lang.Throwable e)  { throw new RuntimeException(); }
  /**
   * Converts aggregate function to String representing a SQL expression.
   * @param aggFunction The aggregate function to be converted.
   * @return Converted value.
   */
  public  scala.Option<java.lang.String> compileAggregate (org.apache.spark.sql.connector.expressions.aggregate.AggregateFunc aggFunction)  { throw new RuntimeException(); }
  /**
   * Converts V2 expression to String representing a SQL expression.
   * @param expr The V2 expression to be converted.
   * @return Converted value.
   */
  public  scala.Option<java.lang.String> compileExpression (org.apache.spark.sql.connector.expressions.Expression expr)  { throw new RuntimeException(); }
  /**
   * Converts value to SQL expression.
   * @param value The value to be converted.
   * @return Converted value.
   */
  public  Object compileValue (Object value)  { throw new RuntimeException(); }
  /**
   * Returns a factory for creating connections to the given JDBC URL.
   * In general, creating a connection has nothing to do with JDBC partition id.
   * But sometimes it is needed, such as a database with multiple shard nodes.
   * @param options - JDBC options that contains url, table and other information.
   * @return The factory method for creating JDBC connections with the RDD partition ID. -1 means
   the connection is being created at the driver side.
   * @throws IllegalArgumentException if the driver could not open a JDBC connection.
   */
  public  scala.Function1<java.lang.Object, java.sql.Connection> createConnectionFactory (org.apache.spark.sql.execution.datasources.jdbc.JDBCOptions options)  { throw new RuntimeException(); }
  /**
   * Build a create index SQL statement.
   * <p>
   * @param indexName         the name of the index to be created
   * @param tableName         the table on which index to be created
   * @param columns           the columns on which index to be created
   * @param columnsProperties the properties of the columns on which index to be created
   * @param properties        the properties of the index to be created
   * @return                  the SQL statement to use for creating the index.
   */
  public  java.lang.String createIndex (java.lang.String indexName, java.lang.String tableName, org.apache.spark.sql.connector.expressions.NamedReference[] columns, java.util.Map<org.apache.spark.sql.connector.expressions.NamedReference, java.util.Map<java.lang.String, java.lang.String>> columnsProperties, java.util.Map<java.lang.String, java.lang.String> properties)  { throw new RuntimeException(); }
  /**
   * Create schema with an optional comment. Empty string means no comment.
   * @param statement (undocumented)
   * @param schema (undocumented)
   * @param comment (undocumented)
   */
  public  void createSchema (java.sql.Statement statement, java.lang.String schema, java.lang.String comment)  { throw new RuntimeException(); }
  /**
   * Build a drop index SQL statement.
   * <p>
   * @param indexName the name of the index to be dropped.
   * @param tableName the table name on which index to be dropped.
   * @return the SQL statement to use for dropping the index.
   */
  public  java.lang.String dropIndex (java.lang.String indexName, java.lang.String tableName)  { throw new RuntimeException(); }
  public  java.lang.String dropSchema (java.lang.String schema, boolean cascade)  { throw new RuntimeException(); }
  /**
   * Escape special characters in SQL string literals.
   * @param value The string to be escaped.
   * @return Escaped string.
   */
  protected  java.lang.String escapeSql (java.lang.String value)  { throw new RuntimeException(); }
  public  java.lang.String getAddColumnQuery (java.lang.String tableName, java.lang.String columnName, java.lang.String dataType)  { throw new RuntimeException(); }
  /**
   * Get the custom datatype mapping for the given jdbc meta information.
   * @param sqlType The sql type (see java.sql.Types)
   * @param typeName The sql type name (e.g. "BIGINT UNSIGNED")
   * @param size The size of the type.
   * @param md Result metadata associated with this type.
   * @return The actual DataType (subclasses of {@link org.apache.spark.sql.types.DataType})
   *         or null if the default type mapping should be used.
   */
  public  scala.Option<org.apache.spark.sql.types.DataType> getCatalystType (int sqlType, java.lang.String typeName, int size, org.apache.spark.sql.types.MetadataBuilder md)  { throw new RuntimeException(); }
  public  java.lang.String getDeleteColumnQuery (java.lang.String tableName, java.lang.String columnName)  { throw new RuntimeException(); }
  /**
   * Retrieve the jdbc / sql type for a given datatype.
   * @param dt The datatype (e.g. {@link org.apache.spark.sql.types.StringType})
   * @return The new JdbcType if there is an override for this DataType
   */
  public  scala.Option<org.apache.spark.sql.jdbc.JdbcType> getJDBCType (org.apache.spark.sql.types.DataType dt)  { throw new RuntimeException(); }
  /**
   * returns the LIMIT clause for the SELECT statement
   * @param limit (undocumented)
   * @return (undocumented)
   */
  public  java.lang.String getLimitClause (java.lang.Integer limit)  { throw new RuntimeException(); }
  public  java.lang.String getRenameColumnQuery (java.lang.String tableName, java.lang.String columnName, java.lang.String newName, int dbMajorVersion)  { throw new RuntimeException(); }
  public  java.lang.String getSchemaCommentQuery (java.lang.String schema, java.lang.String comment)  { throw new RuntimeException(); }
  /**
   * The SQL query that should be used to discover the schema of a table. It only needs to
   * ensure that the result set has the same schema as the table, such as by calling
   * "SELECT * ...". Dialects can override this method to return a query that works best in a
   * particular database.
   * @param table The name of the table.
   * @return The SQL query to use for discovering the schema.
   */
  public  java.lang.String getSchemaQuery (java.lang.String table)  { throw new RuntimeException(); }
  public  java.lang.String getTableCommentQuery (java.lang.String table, java.lang.String comment)  { throw new RuntimeException(); }
  /**
   * Get the SQL query that should be used to find if the given table exists. Dialects can
   * override this method to return a query that works best in a particular database.
   * @param table  The name of the table.
   * @return The SQL query to use for checking the table.
   */
  public  java.lang.String getTableExistsQuery (java.lang.String table)  { throw new RuntimeException(); }
  public  java.lang.String getTableSample (org.apache.spark.sql.execution.datasources.v2.TableSampleInfo sample)  { throw new RuntimeException(); }
  /**
   * The SQL query that should be used to truncate a table. Dialects can override this method to
   * return a query that is suitable for a particular database. For PostgreSQL, for instance,
   * a different query is used to prevent "TRUNCATE" affecting other tables.
   * @param table The table to truncate
   * @return The SQL query to use for truncating a table
   */
  public  java.lang.String getTruncateQuery (java.lang.String table)  { throw new RuntimeException(); }
  /**
   * The SQL query that should be used to truncate a table. Dialects can override this method to
   * return a query that is suitable for a particular database. For PostgreSQL, for instance,
   * a different query is used to prevent "TRUNCATE" affecting other tables.
   * @param table The table to truncate
   * @param cascade Whether or not to cascade the truncation
   * @return The SQL query to use for truncating a table
   */
  public  java.lang.String getTruncateQuery (java.lang.String table, scala.Option<java.lang.Object> cascade)  { throw new RuntimeException(); }
  public  java.lang.String getUpdateColumnNullabilityQuery (java.lang.String tableName, java.lang.String columnName, boolean isNullable)  { throw new RuntimeException(); }
  public  java.lang.String getUpdateColumnTypeQuery (java.lang.String tableName, java.lang.String columnName, java.lang.String newDataType)  { throw new RuntimeException(); }
  /**
   * Checks whether an index exists
   * <p>
   * @param indexName the name of the index
   * @param tableName the table name on which index to be checked
   * @param options JDBCOptions of the table
   * @return true if the index with <code>indexName</code> exists in the table with <code>tableName</code>,
   *         false otherwise
   * @param conn (undocumented)
   */
  public  boolean indexExists (java.sql.Connection conn, java.lang.String indexName, java.lang.String tableName, org.apache.spark.sql.execution.datasources.jdbc.JDBCOptions options)  { throw new RuntimeException(); }
  /**
   * Return Some[true] iff <code>TRUNCATE TABLE</code> causes cascading default.
   * Some[true] : TRUNCATE TABLE causes cascading.
   * Some[false] : TRUNCATE TABLE does not cause cascading.
   * None: The behavior of TRUNCATE TABLE is unknown (default).
   * @return (undocumented)
   */
  public  scala.Option<java.lang.Object> isCascadingTruncateTable ()  { throw new RuntimeException(); }
  /**
   * Returns whether the database supports function.
   * @param funcName Upper-cased function name
   * @return True if the database supports function.
   */
  public  boolean isSupportedFunction (java.lang.String funcName)  { throw new RuntimeException(); }
  /**
   * Lists all the indexes in this table.
   * @param conn (undocumented)
   * @param tableName (undocumented)
   * @param options (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.connector.catalog.index.TableIndex[] listIndexes (java.sql.Connection conn, java.lang.String tableName, org.apache.spark.sql.execution.datasources.jdbc.JDBCOptions options)  { throw new RuntimeException(); }
  /**
   * Lists all the schemas in this table.
   * @param conn (undocumented)
   * @param options (undocumented)
   * @return (undocumented)
   */
  public  java.lang.String[][] listSchemas (java.sql.Connection conn, org.apache.spark.sql.execution.datasources.jdbc.JDBCOptions options)  { throw new RuntimeException(); }
  /**
   * Quotes the identifier. This is used to put quotes around the identifier in case the column
   * name is a reserved keyword, or in case it contains characters that require quotes (e.g. space).
   * @param colName (undocumented)
   * @return (undocumented)
   */
  public  java.lang.String quoteIdentifier (java.lang.String colName)  { throw new RuntimeException(); }
  public  java.lang.String removeSchemaCommentQuery (java.lang.String schema)  { throw new RuntimeException(); }
  /**
   * Rename an existing table.
   * <p>
   * @param oldTable The existing table.
   * @param newTable New name of the table.
   * @return The SQL statement to use for renaming the table.
   */
  public  java.lang.String renameTable (java.lang.String oldTable, java.lang.String newTable)  { throw new RuntimeException(); }
  /**
   * Check schema exists or not.
   * @param conn (undocumented)
   * @param options (undocumented)
   * @param schema (undocumented)
   * @return (undocumented)
   */
  public  boolean schemasExists (java.sql.Connection conn, org.apache.spark.sql.execution.datasources.jdbc.JDBCOptions options, java.lang.String schema)  { throw new RuntimeException(); }
  public  boolean supportsTableSample ()  { throw new RuntimeException(); }
}
