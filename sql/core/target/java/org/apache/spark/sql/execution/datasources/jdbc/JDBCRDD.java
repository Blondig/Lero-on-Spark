package org.apache.spark.sql.execution.datasources.jdbc;
/**
 * An RDD representing a query is related to a table in a database accessed via JDBC.
 * Both the driver code and the workers must be able to access the database; the driver
 * needs to fetch the schema while the workers need to fetch the data.
 */
  class JDBCRDD extends org.apache.spark.rdd.RDD<org.apache.spark.sql.catalyst.InternalRow> {
  /**
   * Takes a (schema, table) specification and returns the table's Catalyst
   * schema.
   * <p>
   * @param options - JDBC options that contains url, table and other information.
   * <p>
   * @return A StructType giving the table's Catalyst schema.
   * @throws java.sql.SQLException if the table specification is garbage.
   * @throws java.sql.SQLException if the table contains an unsupported type.
   */
  static public  org.apache.spark.sql.types.StructType resolveTable (org.apache.spark.sql.execution.datasources.jdbc.JDBCOptions options)  { throw new RuntimeException(); }
  static public  org.apache.spark.sql.types.StructType getQueryOutputSchema (java.lang.String query, org.apache.spark.sql.execution.datasources.jdbc.JDBCOptions options, org.apache.spark.sql.jdbc.JdbcDialect dialect)  { throw new RuntimeException(); }
  /**
   * Build and return JDBCRDD from the given information.
   * <p>
   * @param sc - Your SparkContext.
   * @param schema - The Catalyst schema of the underlying database table.
   * @param requiredColumns - The names of the columns or aggregate columns to SELECT.
   * @param predicates - The predicates to include in all WHERE clauses.
   * @param parts - An array of JDBCPartitions specifying partition ids and
   *    per-partition WHERE clauses.
   * @param options - JDBC options that contains url, table and other information.
   * @param outputSchema - The schema of the columns or aggregate columns to SELECT.
   * @param groupByColumns - The pushed down group by columns.
   * @param sample - The pushed down tableSample.
   * @param limit - The pushed down limit. If the value is 0, it means no limit or limit
   *                is not pushed down.
   * @param sortOrders - The sort orders cooperates with limit to realize top N.
   * <p>
   * @return An RDD representing "SELECT requiredColumns FROM fqTable".
   */
  static public  org.apache.spark.rdd.RDD<org.apache.spark.sql.catalyst.InternalRow> scanTable (org.apache.spark.SparkContext sc, org.apache.spark.sql.types.StructType schema, java.lang.String[] requiredColumns, org.apache.spark.sql.connector.expressions.filter.Predicate[] predicates, org.apache.spark.Partition[] parts, org.apache.spark.sql.execution.datasources.jdbc.JDBCOptions options, scala.Option<org.apache.spark.sql.types.StructType> outputSchema, scala.Option<java.lang.String[]> groupByColumns, scala.Option<org.apache.spark.sql.execution.datasources.v2.TableSampleInfo> sample, int limit, org.apache.spark.sql.connector.expressions.SortOrder[] sortOrders)  { throw new RuntimeException(); }
  static public  org.slf4j.Logger org$apache$spark$internal$Logging$$log_ ()  { throw new RuntimeException(); }
  static public  void org$apache$spark$internal$Logging$$log__$eq (org.slf4j.Logger x$1)  { throw new RuntimeException(); }
  static protected  java.lang.String logName ()  { throw new RuntimeException(); }
  static protected  org.slf4j.Logger log ()  { throw new RuntimeException(); }
  static protected  void logInfo (scala.Function0<java.lang.String> msg)  { throw new RuntimeException(); }
  static protected  void logDebug (scala.Function0<java.lang.String> msg)  { throw new RuntimeException(); }
  static protected  void logTrace (scala.Function0<java.lang.String> msg)  { throw new RuntimeException(); }
  static protected  void logWarning (scala.Function0<java.lang.String> msg)  { throw new RuntimeException(); }
  static protected  void logError (scala.Function0<java.lang.String> msg)  { throw new RuntimeException(); }
  static protected  void logInfo (scala.Function0<java.lang.String> msg, java.lang.Throwable throwable)  { throw new RuntimeException(); }
  static protected  void logDebug (scala.Function0<java.lang.String> msg, java.lang.Throwable throwable)  { throw new RuntimeException(); }
  static protected  void logTrace (scala.Function0<java.lang.String> msg, java.lang.Throwable throwable)  { throw new RuntimeException(); }
  static protected  void logWarning (scala.Function0<java.lang.String> msg, java.lang.Throwable throwable)  { throw new RuntimeException(); }
  static protected  void logError (scala.Function0<java.lang.String> msg, java.lang.Throwable throwable)  { throw new RuntimeException(); }
  static protected  boolean isTraceEnabled ()  { throw new RuntimeException(); }
  static protected  void initializeLogIfNecessary (boolean isInterpreter)  { throw new RuntimeException(); }
  static protected  boolean initializeLogIfNecessary (boolean isInterpreter, boolean silent)  { throw new RuntimeException(); }
  static protected  boolean initializeLogIfNecessary$default$2 ()  { throw new RuntimeException(); }
  static   void initializeForcefully (boolean isInterpreter, boolean silent)  { throw new RuntimeException(); }
  public   JDBCRDD (org.apache.spark.SparkContext sc, scala.Function1<java.lang.Object, java.sql.Connection> getConnection, org.apache.spark.sql.types.StructType schema, java.lang.String[] columns, org.apache.spark.sql.connector.expressions.filter.Predicate[] predicates, org.apache.spark.Partition[] partitions, java.lang.String url, org.apache.spark.sql.execution.datasources.jdbc.JDBCOptions options, scala.Option<java.lang.String[]> groupByColumns, scala.Option<org.apache.spark.sql.execution.datasources.v2.TableSampleInfo> sample, int limit, org.apache.spark.sql.connector.expressions.SortOrder[] sortOrders)  { throw new RuntimeException(); }
  /**
   * Retrieve the list of partitions corresponding to this RDD.
   * @return (undocumented)
   */
  public  org.apache.spark.Partition[] getPartitions ()  { throw new RuntimeException(); }
  /**
   * Runs the SQL query against the JDBC driver.
   * <p>
   * @param thePart (undocumented)
   * @param context (undocumented)
   * @return (undocumented)
   */
  public  scala.collection.Iterator<org.apache.spark.sql.catalyst.InternalRow> compute (org.apache.spark.Partition thePart, org.apache.spark.TaskContext context)  { throw new RuntimeException(); }
}
