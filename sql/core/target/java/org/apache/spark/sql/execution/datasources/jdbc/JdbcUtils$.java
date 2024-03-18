package org.apache.spark.sql.execution.datasources.jdbc;
/**
 * Util functions for JDBC tables.
 */
public  class JdbcUtils$ implements org.apache.spark.internal.Logging, org.apache.spark.sql.catalyst.SQLConfHelper {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final JdbcUtils$ MODULE$ = null;
  public   JdbcUtils$ ()  { throw new RuntimeException(); }
  /**
   * Returns true if the table already exists in the JDBC database.
   * @param conn (undocumented)
   * @param options (undocumented)
   * @return (undocumented)
   */
  public  boolean tableExists (java.sql.Connection conn, org.apache.spark.sql.execution.datasources.jdbc.JdbcOptionsInWrite options)  { throw new RuntimeException(); }
  /**
   * Drops a table from the JDBC database.
   * @param conn (undocumented)
   * @param table (undocumented)
   * @param options (undocumented)
   */
  public  void dropTable (java.sql.Connection conn, java.lang.String table, org.apache.spark.sql.execution.datasources.jdbc.JDBCOptions options)  { throw new RuntimeException(); }
  /**
   * Truncates a table from the JDBC database without side effects.
   * @param conn (undocumented)
   * @param options (undocumented)
   */
  public  void truncateTable (java.sql.Connection conn, org.apache.spark.sql.execution.datasources.jdbc.JdbcOptionsInWrite options)  { throw new RuntimeException(); }
  public  scala.Option<java.lang.Object> isCascadingTruncateTable (java.lang.String url)  { throw new RuntimeException(); }
  /**
   * Returns an Insert SQL statement for inserting a row into the target table via JDBC conn.
   * @param table (undocumented)
   * @param rddSchema (undocumented)
   * @param tableSchema (undocumented)
   * @param isCaseSensitive (undocumented)
   * @param dialect (undocumented)
   * @return (undocumented)
   */
  public  java.lang.String getInsertStatement (java.lang.String table, org.apache.spark.sql.types.StructType rddSchema, scala.Option<org.apache.spark.sql.types.StructType> tableSchema, boolean isCaseSensitive, org.apache.spark.sql.jdbc.JdbcDialect dialect)  { throw new RuntimeException(); }
  /**
   * Retrieve standard jdbc types.
   * <p>
   * @param dt The datatype (e.g. {@link org.apache.spark.sql.types.StringType})
   * @return The default JdbcType for this DataType
   */
  public  scala.Option<org.apache.spark.sql.jdbc.JdbcType> getCommonJDBCType (org.apache.spark.sql.types.DataType dt)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.jdbc.JdbcType getJdbcType (org.apache.spark.sql.types.DataType dt, org.apache.spark.sql.jdbc.JdbcDialect dialect)  { throw new RuntimeException(); }
  /**
   * Returns the schema if the table already exists in the JDBC database.
   * @param conn (undocumented)
   * @param options (undocumented)
   * @return (undocumented)
   */
  public  scala.Option<org.apache.spark.sql.types.StructType> getSchemaOption (java.sql.Connection conn, org.apache.spark.sql.execution.datasources.jdbc.JDBCOptions options)  { throw new RuntimeException(); }
  /**
   * Takes a {@link ResultSet} and returns its Catalyst schema.
   * <p>
   * @param alwaysNullable If true, all the columns are nullable.
   * @return A {@link StructType} giving the Catalyst schema.
   * @throws SQLException if the schema contains an unsupported type.
   * @param resultSet (undocumented)
   * @param dialect (undocumented)
   */
  public  org.apache.spark.sql.types.StructType getSchema (java.sql.ResultSet resultSet, org.apache.spark.sql.jdbc.JdbcDialect dialect, boolean alwaysNullable)  { throw new RuntimeException(); }
  /**
   * Convert a {@link ResultSet} into an iterator of Catalyst Rows.
   * @param resultSet (undocumented)
   * @param schema (undocumented)
   * @return (undocumented)
   */
  public  scala.collection.Iterator<org.apache.spark.sql.Row> resultSetToRows (java.sql.ResultSet resultSet, org.apache.spark.sql.types.StructType schema)  { throw new RuntimeException(); }
    scala.collection.Iterator<org.apache.spark.sql.catalyst.InternalRow> resultSetToSparkInternalRows (java.sql.ResultSet resultSet, org.apache.spark.sql.types.StructType schema, org.apache.spark.executor.InputMetrics inputMetrics)  { throw new RuntimeException(); }
  /**
   * Saves a partition of a DataFrame to the JDBC database.  This is done in
   * a single database transaction (unless isolation level is "NONE")
   * in order to avoid repeatedly inserting data as much as possible.
   * <p>
   * It is still theoretically possible for rows in a DataFrame to be
   * inserted into the database more than once if a stage somehow fails after
   * the commit occurs but before the stage can return successfully.
   * <p>
   * This is not a closure inside saveTable() because apparently cosmetic
   * implementation changes elsewhere might easily render such a closure
   * non-Serializable.  Instead, we explicitly close over all variables that
   * are used.
   * <p>
   * Note that this method records task output metrics. It assumes the method is
   * running in a task. For now, we only records the number of rows being written
   * because there's no good way to measure the total bytes being written. Only
   * effective outputs are taken into account: for example, metric will not be updated
   * if it supports transaction and transaction is rolled back, but metric will be
   * updated even with error if it doesn't support transaction, as there're dirty outputs.
   * @param table (undocumented)
   * @param iterator (undocumented)
   * @param rddSchema (undocumented)
   * @param insertStmt (undocumented)
   * @param batchSize (undocumented)
   * @param dialect (undocumented)
   * @param isolationLevel (undocumented)
   * @param options (undocumented)
   */
  public  void savePartition (java.lang.String table, scala.collection.Iterator<org.apache.spark.sql.Row> iterator, org.apache.spark.sql.types.StructType rddSchema, java.lang.String insertStmt, int batchSize, org.apache.spark.sql.jdbc.JdbcDialect dialect, int isolationLevel, org.apache.spark.sql.execution.datasources.jdbc.JDBCOptions options)  { throw new RuntimeException(); }
  /**
   * Compute the schema string for this RDD.
   * @param schema (undocumented)
   * @param caseSensitive (undocumented)
   * @param url (undocumented)
   * @param createTableColumnTypes (undocumented)
   * @return (undocumented)
   */
  public  java.lang.String schemaString (org.apache.spark.sql.types.StructType schema, boolean caseSensitive, java.lang.String url, scala.Option<java.lang.String> createTableColumnTypes)  { throw new RuntimeException(); }
  /**
   * Parses the user specified customSchema option value to DataFrame schema, and
   * returns a schema that is replaced by the custom schema's dataType if column name is matched.
   * @param tableSchema (undocumented)
   * @param customSchema (undocumented)
   * @param nameEquality (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.types.StructType getCustomSchema (org.apache.spark.sql.types.StructType tableSchema, java.lang.String customSchema, scala.Function2<java.lang.String, java.lang.String, java.lang.Object> nameEquality)  { throw new RuntimeException(); }
  /**
   * Saves the RDD to the database in a single transaction.
   * @param df (undocumented)
   * @param tableSchema (undocumented)
   * @param isCaseSensitive (undocumented)
   * @param options (undocumented)
   */
  public  void saveTable (org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> df, scala.Option<org.apache.spark.sql.types.StructType> tableSchema, boolean isCaseSensitive, org.apache.spark.sql.execution.datasources.jdbc.JdbcOptionsInWrite options)  { throw new RuntimeException(); }
  /**
   * Creates a table with a given schema.
   * @param conn (undocumented)
   * @param tableName (undocumented)
   * @param schema (undocumented)
   * @param caseSensitive (undocumented)
   * @param options (undocumented)
   */
  public  void createTable (java.sql.Connection conn, java.lang.String tableName, org.apache.spark.sql.types.StructType schema, boolean caseSensitive, org.apache.spark.sql.execution.datasources.jdbc.JdbcOptionsInWrite options)  { throw new RuntimeException(); }
  /**
   * Rename a table from the JDBC database.
   * @param conn (undocumented)
   * @param oldTable (undocumented)
   * @param newTable (undocumented)
   * @param options (undocumented)
   */
  public  void renameTable (java.sql.Connection conn, java.lang.String oldTable, java.lang.String newTable, org.apache.spark.sql.execution.datasources.jdbc.JDBCOptions options)  { throw new RuntimeException(); }
  /**
   * Update a table from the JDBC database.
   * @param conn (undocumented)
   * @param tableName (undocumented)
   * @param changes (undocumented)
   * @param options (undocumented)
   */
  public  void alterTable (java.sql.Connection conn, java.lang.String tableName, scala.collection.Seq<org.apache.spark.sql.connector.catalog.TableChange> changes, org.apache.spark.sql.execution.datasources.jdbc.JDBCOptions options)  { throw new RuntimeException(); }
  /**
   * Creates a schema.
   * @param conn (undocumented)
   * @param options (undocumented)
   * @param schema (undocumented)
   * @param comment (undocumented)
   */
  public  void createSchema (java.sql.Connection conn, org.apache.spark.sql.execution.datasources.jdbc.JDBCOptions options, java.lang.String schema, java.lang.String comment)  { throw new RuntimeException(); }
  public  boolean schemaExists (java.sql.Connection conn, org.apache.spark.sql.execution.datasources.jdbc.JDBCOptions options, java.lang.String schema)  { throw new RuntimeException(); }
  public  java.lang.String[][] listSchemas (java.sql.Connection conn, org.apache.spark.sql.execution.datasources.jdbc.JDBCOptions options)  { throw new RuntimeException(); }
  public  void alterSchemaComment (java.sql.Connection conn, org.apache.spark.sql.execution.datasources.jdbc.JDBCOptions options, java.lang.String schema, java.lang.String comment)  { throw new RuntimeException(); }
  public  void removeSchemaComment (java.sql.Connection conn, org.apache.spark.sql.execution.datasources.jdbc.JDBCOptions options, java.lang.String schema)  { throw new RuntimeException(); }
  /**
   * Drops a schema from the JDBC database.
   * @param conn (undocumented)
   * @param options (undocumented)
   * @param schema (undocumented)
   * @param cascade (undocumented)
   */
  public  void dropSchema (java.sql.Connection conn, org.apache.spark.sql.execution.datasources.jdbc.JDBCOptions options, java.lang.String schema, boolean cascade)  { throw new RuntimeException(); }
  /**
   * Create an index.
   * @param conn (undocumented)
   * @param indexName (undocumented)
   * @param tableName (undocumented)
   * @param columns (undocumented)
   * @param columnsProperties (undocumented)
   * @param properties (undocumented)
   * @param options (undocumented)
   */
  public  void createIndex (java.sql.Connection conn, java.lang.String indexName, java.lang.String tableName, org.apache.spark.sql.connector.expressions.NamedReference[] columns, java.util.Map<org.apache.spark.sql.connector.expressions.NamedReference, java.util.Map<java.lang.String, java.lang.String>> columnsProperties, java.util.Map<java.lang.String, java.lang.String> properties, org.apache.spark.sql.execution.datasources.jdbc.JDBCOptions options)  { throw new RuntimeException(); }
  /**
   * Check if an index exists
   * @param conn (undocumented)
   * @param indexName (undocumented)
   * @param tableName (undocumented)
   * @param options (undocumented)
   * @return (undocumented)
   */
  public  boolean indexExists (java.sql.Connection conn, java.lang.String indexName, java.lang.String tableName, org.apache.spark.sql.execution.datasources.jdbc.JDBCOptions options)  { throw new RuntimeException(); }
  /**
   * Drop an index.
   * @param conn (undocumented)
   * @param indexName (undocumented)
   * @param tableName (undocumented)
   * @param options (undocumented)
   */
  public  void dropIndex (java.sql.Connection conn, java.lang.String indexName, java.lang.String tableName, org.apache.spark.sql.execution.datasources.jdbc.JDBCOptions options)  { throw new RuntimeException(); }
  /**
   * List all the indexes in a table.
   * @param conn (undocumented)
   * @param tableName (undocumented)
   * @param options (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.connector.catalog.index.TableIndex[] listIndexes (java.sql.Connection conn, java.lang.String tableName, org.apache.spark.sql.execution.datasources.jdbc.JDBCOptions options)  { throw new RuntimeException(); }
  /**
   * Check if index exists in a table
   * @param conn (undocumented)
   * @param sql (undocumented)
   * @param options (undocumented)
   * @return (undocumented)
   */
  public  boolean checkIfIndexExists (java.sql.Connection conn, java.lang.String sql, org.apache.spark.sql.execution.datasources.jdbc.JDBCOptions options)  { throw new RuntimeException(); }
  /**
   * Process index properties and return tuple of indexType and list of the other index properties.
   * @param properties (undocumented)
   * @param catalogName (undocumented)
   * @return (undocumented)
   */
  public  scala.Tuple2<java.lang.String, java.lang.String[]> processIndexProperties (java.util.Map<java.lang.String, java.lang.String> properties, java.lang.String catalogName)  { throw new RuntimeException(); }
  public  boolean containsIndexTypeIgnoreCase (java.lang.String[] supportedIndexTypeList, java.lang.String value)  { throw new RuntimeException(); }
  public  java.lang.String[] getSupportedIndexTypeList (java.lang.String catalogName)  { throw new RuntimeException(); }
  public  void executeQuery (java.sql.Connection conn, org.apache.spark.sql.execution.datasources.jdbc.JDBCOptions options, java.lang.String sql, scala.Function1<java.sql.ResultSet, scala.runtime.BoxedUnit> f)  { throw new RuntimeException(); }
  public <T extends java.lang.Object> T classifyException (java.lang.String message, org.apache.spark.sql.jdbc.JdbcDialect dialect, scala.Function0<T> f)  { throw new RuntimeException(); }
  public <T extends java.lang.Object> T withConnection (org.apache.spark.sql.execution.datasources.jdbc.JDBCOptions options, scala.Function1<java.sql.Connection, T> f)  { throw new RuntimeException(); }
}
