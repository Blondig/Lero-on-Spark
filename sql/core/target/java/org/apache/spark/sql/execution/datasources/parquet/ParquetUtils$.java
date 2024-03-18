package org.apache.spark.sql.execution.datasources.parquet;
public  class ParquetUtils$ {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final ParquetUtils$ MODULE$ = null;
  public   ParquetUtils$ ()  { throw new RuntimeException(); }
  public  scala.Option<org.apache.spark.sql.types.StructType> inferSchema (org.apache.spark.sql.SparkSession sparkSession, scala.collection.immutable.Map<java.lang.String, java.lang.String> parameters, scala.collection.Seq<org.apache.hadoop.fs.FileStatus> files)  { throw new RuntimeException(); }
  /**
   * A StructField metadata key used to set the field id of a column in the Parquet schema.
   * @return (undocumented)
   */
  public  java.lang.String FIELD_ID_METADATA_KEY ()  { throw new RuntimeException(); }
  /**
   * Whether there exists a field in the schema, whether inner or leaf, has the parquet field
   * ID metadata.
   * @param schema (undocumented)
   * @return (undocumented)
   */
  public  boolean hasFieldIds (org.apache.spark.sql.types.StructType schema)  { throw new RuntimeException(); }
  public  boolean hasFieldId (org.apache.spark.sql.types.StructField field)  { throw new RuntimeException(); }
  public  int getFieldId (org.apache.spark.sql.types.StructField field)  { throw new RuntimeException(); }
  /**
   * Whether columnar read is supported for the input <code>schema</code>.
   * @param sqlConf (undocumented)
   * @param schema (undocumented)
   * @return (undocumented)
   */
  public  boolean isBatchReadSupportedForSchema (org.apache.spark.sql.internal.SQLConf sqlConf, org.apache.spark.sql.types.StructType schema)  { throw new RuntimeException(); }
  public  boolean isBatchReadSupported (org.apache.spark.sql.internal.SQLConf sqlConf, org.apache.spark.sql.types.DataType dt)  { throw new RuntimeException(); }
  /**
   * When the partial aggregates (Max/Min/Count) are pushed down to Parquet, we don't need to
   * createRowBaseReader to read data from Parquet and aggregate at Spark layer. Instead we want
   * to get the partial aggregates (Max/Min/Count) result using the statistics information
   * from Parquet file footer, and then construct an InternalRow from these aggregate results.
   * <p>
   * NOTE: if statistics is missing from Parquet file footer, exception would be thrown.
   * <p>
   * @return Aggregate results in the format of InternalRow
   * @param footer (undocumented)
   * @param filePath (undocumented)
   * @param dataSchema (undocumented)
   * @param partitionSchema (undocumented)
   * @param aggregation (undocumented)
   * @param aggSchema (undocumented)
   * @param partitionValues (undocumented)
   * @param datetimeRebaseSpec (undocumented)
   */
    org.apache.spark.sql.catalyst.InternalRow createAggInternalRowFromFooter (org.apache.parquet.hadoop.metadata.ParquetMetadata footer, java.lang.String filePath, org.apache.spark.sql.types.StructType dataSchema, org.apache.spark.sql.types.StructType partitionSchema, org.apache.spark.sql.connector.expressions.aggregate.Aggregation aggregation, org.apache.spark.sql.types.StructType aggSchema, org.apache.spark.sql.catalyst.InternalRow partitionValues, org.apache.spark.sql.catalyst.util.RebaseDateTime.RebaseSpec datetimeRebaseSpec)  { throw new RuntimeException(); }
  /**
   * Calculate the pushed down aggregates (Max/Min/Count) result using the statistics
   * information from Parquet footer file.
   * <p>
   * @return A tuple of <code>Array[PrimitiveType]</code> and Array[Any].
   *         The first element is the Parquet PrimitiveType of the aggregate column,
   *         and the second element is the aggregated value.
   * @param footer (undocumented)
   * @param filePath (undocumented)
   * @param dataSchema (undocumented)
   * @param partitionSchema (undocumented)
   * @param aggregation (undocumented)
   */
    scala.Tuple2<org.apache.parquet.schema.PrimitiveType[], java.lang.Object[]> getPushedDownAggResult (org.apache.parquet.hadoop.metadata.ParquetMetadata footer, java.lang.String filePath, org.apache.spark.sql.types.StructType dataSchema, org.apache.spark.sql.types.StructType partitionSchema, org.apache.spark.sql.connector.expressions.aggregate.Aggregation aggregation)  { throw new RuntimeException(); }
}
