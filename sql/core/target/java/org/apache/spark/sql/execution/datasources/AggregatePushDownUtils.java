package org.apache.spark.sql.execution.datasources;
/**
 * Utility class for aggregate push down to Parquet and ORC.
 */
public  class AggregatePushDownUtils {
  /**
   * Get the data schema for aggregate to be pushed down.
   * @param aggregation (undocumented)
   * @param schema (undocumented)
   * @param partitionNames (undocumented)
   * @param dataFilters (undocumented)
   * @return (undocumented)
   */
  static public  scala.Option<org.apache.spark.sql.types.StructType> getSchemaForPushedAggregation (org.apache.spark.sql.connector.expressions.aggregate.Aggregation aggregation, org.apache.spark.sql.types.StructType schema, scala.collection.immutable.Set<java.lang.String> partitionNames, scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> dataFilters)  { throw new RuntimeException(); }
  /**
   * Check if two Aggregation <code>a</code> and <code>b</code> is equal or not.
   * @param a (undocumented)
   * @param b (undocumented)
   * @return (undocumented)
   */
  static public  boolean equivalentAggregations (org.apache.spark.sql.connector.expressions.aggregate.Aggregation a, org.apache.spark.sql.connector.expressions.aggregate.Aggregation b)  { throw new RuntimeException(); }
  /**
   * Convert the aggregates result from <code>InternalRow</code> to <code>ColumnarBatch</code>.
   * This is used for columnar reader.
   * @param aggregatesAsRow (undocumented)
   * @param aggregatesSchema (undocumented)
   * @param offHeap (undocumented)
   * @return (undocumented)
   */
  static public  org.apache.spark.sql.vectorized.ColumnarBatch convertAggregatesRowToBatch (org.apache.spark.sql.catalyst.InternalRow aggregatesAsRow, org.apache.spark.sql.types.StructType aggregatesSchema, boolean offHeap)  { throw new RuntimeException(); }
  /**
   * Return the schema for aggregates only (exclude group by columns)
   * @param aggSchema (undocumented)
   * @param aggregation (undocumented)
   * @return (undocumented)
   */
  static public  org.apache.spark.sql.types.StructType getSchemaWithoutGroupingExpression (org.apache.spark.sql.types.StructType aggSchema, org.apache.spark.sql.connector.expressions.aggregate.Aggregation aggregation)  { throw new RuntimeException(); }
  /**
   * Reorder partition cols if they are not in the same order as group by columns
   * @param partitionSchema (undocumented)
   * @param aggregation (undocumented)
   * @param partitionValues (undocumented)
   * @return (undocumented)
   */
  static public  org.apache.spark.sql.catalyst.InternalRow reOrderPartitionCol (org.apache.spark.sql.types.StructType partitionSchema, org.apache.spark.sql.connector.expressions.aggregate.Aggregation aggregation, org.apache.spark.sql.catalyst.InternalRow partitionValues)  { throw new RuntimeException(); }
}
