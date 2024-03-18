package org.apache.spark.sql.execution.datasources.jdbc;
public  class JDBCRDD$ implements org.apache.spark.internal.Logging, scala.Serializable {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final JDBCRDD$ MODULE$ = null;
  public   JDBCRDD$ ()  { throw new RuntimeException(); }
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
  public  org.apache.spark.sql.types.StructType resolveTable (org.apache.spark.sql.execution.datasources.jdbc.JDBCOptions options)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.types.StructType getQueryOutputSchema (java.lang.String query, org.apache.spark.sql.execution.datasources.jdbc.JDBCOptions options, org.apache.spark.sql.jdbc.JdbcDialect dialect)  { throw new RuntimeException(); }
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
  public  org.apache.spark.rdd.RDD<org.apache.spark.sql.catalyst.InternalRow> scanTable (org.apache.spark.SparkContext sc, org.apache.spark.sql.types.StructType schema, java.lang.String[] requiredColumns, org.apache.spark.sql.connector.expressions.filter.Predicate[] predicates, org.apache.spark.Partition[] parts, org.apache.spark.sql.execution.datasources.jdbc.JDBCOptions options, scala.Option<org.apache.spark.sql.types.StructType> outputSchema, scala.Option<java.lang.String[]> groupByColumns, scala.Option<org.apache.spark.sql.execution.datasources.v2.TableSampleInfo> sample, int limit, org.apache.spark.sql.connector.expressions.SortOrder[] sortOrders)  { throw new RuntimeException(); }
}
