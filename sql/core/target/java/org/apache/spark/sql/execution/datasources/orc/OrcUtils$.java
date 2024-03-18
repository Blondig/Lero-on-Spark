package org.apache.spark.sql.execution.datasources.orc;
public  class OrcUtils$ implements org.apache.spark.internal.Logging {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final OrcUtils$ MODULE$ = null;
  public   OrcUtils$ ()  { throw new RuntimeException(); }
  public  scala.collection.immutable.Map<java.lang.String, java.lang.String> extensionsForCompressionCodecNames ()  { throw new RuntimeException(); }
  public  java.lang.String CATALYST_TYPE_ATTRIBUTE_NAME ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.hadoop.fs.Path> listOrcFiles (java.lang.String pathStr, org.apache.hadoop.conf.Configuration conf)  { throw new RuntimeException(); }
  public  scala.Option<org.apache.orc.TypeDescription> readSchema (org.apache.hadoop.fs.Path file, org.apache.hadoop.conf.Configuration conf, boolean ignoreCorruptFiles)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.types.StructType toCatalystSchema (org.apache.orc.TypeDescription schema)  { throw new RuntimeException(); }
  public  scala.Option<org.apache.spark.sql.types.StructType> readSchema (org.apache.spark.sql.SparkSession sparkSession, scala.collection.Seq<org.apache.hadoop.fs.FileStatus> files, scala.collection.immutable.Map<java.lang.String, java.lang.String> options)  { throw new RuntimeException(); }
  public  scala.Option<org.apache.spark.sql.types.StructType> readCatalystSchema (org.apache.hadoop.fs.Path file, org.apache.hadoop.conf.Configuration conf, boolean ignoreCorruptFiles)  { throw new RuntimeException(); }
  /**
   * Reads ORC file schemas in multi-threaded manner, using native version of ORC.
   * This is visible for testing.
   * @param files (undocumented)
   * @param conf (undocumented)
   * @param ignoreCorruptFiles (undocumented)
   * @return (undocumented)
   */
  public  scala.collection.Seq<org.apache.spark.sql.types.StructType> readOrcSchemasInParallel (scala.collection.Seq<org.apache.hadoop.fs.FileStatus> files, org.apache.hadoop.conf.Configuration conf, boolean ignoreCorruptFiles)  { throw new RuntimeException(); }
  public  scala.Option<org.apache.spark.sql.types.StructType> inferSchema (org.apache.spark.sql.SparkSession sparkSession, scala.collection.Seq<org.apache.hadoop.fs.FileStatus> files, scala.collection.immutable.Map<java.lang.String, java.lang.String> options)  { throw new RuntimeException(); }
  /**
   * @return Returns the combination of requested column ids from the given ORC file and
   *         boolean flag to find if the pruneCols is allowed or not. Requested Column id can be
   *         -1, which means the requested column doesn't exist in the ORC file. Returns None
   *         if the given ORC file is empty.
   * @param isCaseSensitive (undocumented)
   * @param dataSchema (undocumented)
   * @param requiredSchema (undocumented)
   * @param orcSchema (undocumented)
   * @param conf (undocumented)
   */
  public  scala.Option<scala.Tuple2<int[], java.lang.Object>> requestedColumnIds (boolean isCaseSensitive, org.apache.spark.sql.types.StructType dataSchema, org.apache.spark.sql.types.StructType requiredSchema, org.apache.orc.TypeDescription orcSchema, org.apache.hadoop.conf.Configuration conf)  { throw new RuntimeException(); }
  /**
   * Add a metadata specifying Spark version.
   * @param writer (undocumented)
   */
  public  void addSparkVersionMetadata (org.apache.orc.Writer writer)  { throw new RuntimeException(); }
  /**
   * Given a <code>StructType</code> object, this methods converts it to corresponding string representation
   * in ORC.
   * @param dt (undocumented)
   * @return (undocumented)
   */
  public  java.lang.String getOrcSchemaString (org.apache.spark.sql.types.DataType dt)  { throw new RuntimeException(); }
  public  org.apache.orc.TypeDescription orcTypeDescription (org.apache.spark.sql.types.DataType dt)  { throw new RuntimeException(); }
  /**
   * Returns the result schema to read from ORC file. In addition, It sets
   * the schema string to 'orc.mapred.input.schema' so ORC reader can use later.
   * <p>
   * @param canPruneCols Flag to decide whether pruned cols schema is send to resultSchema
   *                     or to send the entire dataSchema to resultSchema.
   * @param dataSchema   Schema of the orc files.
   * @param resultSchema Result data schema created after pruning cols.
   * @param partitionSchema Schema of partitions.
   * @param conf Hadoop Configuration.
   * @return Returns the result schema as string.
   */
  public  java.lang.String orcResultSchemaString (boolean canPruneCols, org.apache.spark.sql.types.StructType dataSchema, org.apache.spark.sql.types.StructType resultSchema, org.apache.spark.sql.types.StructType partitionSchema, org.apache.hadoop.conf.Configuration conf)  { throw new RuntimeException(); }
  /**
   * Checks if <code>dataType</code> supports columnar reads.
   * <p>
   * @param dataType Data type of the orc files.
   * @param nestedColumnEnabled True if columnar reads is enabled for nested column types.
   * @return Returns true if data type supports columnar reads.
   */
  public  boolean supportColumnarReads (org.apache.spark.sql.types.DataType dataType, boolean nestedColumnEnabled)  { throw new RuntimeException(); }
  /**
   * When the partial aggregates (Max/Min/Count) are pushed down to ORC, we don't need to read data
   * from ORC and aggregate at Spark layer. Instead we want to get the partial aggregates
   * (Max/Min/Count) result using the statistics information from ORC file footer, and then
   * construct an InternalRow from these aggregate results.
   * <p>
   * NOTE: if statistics is missing from ORC file footer, exception would be thrown.
   * <p>
   * @return Aggregate results in the format of InternalRow
   * @param reader (undocumented)
   * @param filePath (undocumented)
   * @param dataSchema (undocumented)
   * @param partitionSchema (undocumented)
   * @param aggregation (undocumented)
   * @param aggSchema (undocumented)
   * @param partitionValues (undocumented)
   */
  public  org.apache.spark.sql.catalyst.InternalRow createAggInternalRowFromFooter (org.apache.orc.Reader reader, java.lang.String filePath, org.apache.spark.sql.types.StructType dataSchema, org.apache.spark.sql.types.StructType partitionSchema, org.apache.spark.sql.connector.expressions.aggregate.Aggregation aggregation, org.apache.spark.sql.types.StructType aggSchema, org.apache.spark.sql.catalyst.InternalRow partitionValues)  { throw new RuntimeException(); }
}
