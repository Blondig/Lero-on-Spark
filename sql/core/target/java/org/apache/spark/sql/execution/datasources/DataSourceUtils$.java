package org.apache.spark.sql.execution.datasources;
public  class DataSourceUtils$ implements org.apache.spark.sql.catalyst.expressions.PredicateHelper {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final DataSourceUtils$ MODULE$ = null;
  public   DataSourceUtils$ ()  { throw new RuntimeException(); }
  /**
   * The key to use for storing partitionBy columns as options.
   * @return (undocumented)
   */
  public  java.lang.String PARTITIONING_COLUMNS_KEY ()  { throw new RuntimeException(); }
  /**
   * The key to use for specifying partition overwrite mode when
   * INSERT OVERWRITE a partitioned data source table.
   * @return (undocumented)
   */
  public  java.lang.String PARTITION_OVERWRITE_MODE ()  { throw new RuntimeException(); }
  public  java.lang.String encodePartitioningColumns (scala.collection.Seq<java.lang.String> columns)  { throw new RuntimeException(); }
  public  scala.collection.Seq<java.lang.String> decodePartitioningColumns (java.lang.String str)  { throw new RuntimeException(); }
  /**
   * Verify if the field name is supported in datasource. This verification should be done
   * in a driver side.
   * @param format (undocumented)
   * @param schema (undocumented)
   */
  public  void checkFieldNames (org.apache.spark.sql.execution.datasources.FileFormat format, org.apache.spark.sql.types.StructType schema)  { throw new RuntimeException(); }
  /**
   * Verify if the schema is supported in datasource. This verification should be done
   * in a driver side.
   * @param format (undocumented)
   * @param schema (undocumented)
   */
  public  void verifySchema (org.apache.spark.sql.execution.datasources.FileFormat format, org.apache.spark.sql.types.StructType schema)  { throw new RuntimeException(); }
    boolean isDataPath (org.apache.hadoop.fs.Path path)  { throw new RuntimeException(); }
    boolean isDataFile (java.lang.String fileName)  { throw new RuntimeException(); }
  /**
   * Returns if the given relation's V1 datasource provider supports nested predicate pushdown.
   * @param relation (undocumented)
   * @return (undocumented)
   */
    boolean supportNestedPredicatePushdown (org.apache.spark.sql.sources.BaseRelation relation)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.util.RebaseDateTime.RebaseSpec datetimeRebaseSpec (scala.Function1<java.lang.String, java.lang.String> lookupFileMeta, java.lang.String modeByConfig)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.util.RebaseDateTime.RebaseSpec int96RebaseSpec (scala.Function1<java.lang.String, java.lang.String> lookupFileMeta, java.lang.String modeByConfig)  { throw new RuntimeException(); }
  public  org.apache.spark.SparkUpgradeException newRebaseExceptionInRead (java.lang.String format)  { throw new RuntimeException(); }
  public  org.apache.spark.SparkUpgradeException newRebaseExceptionInWrite (java.lang.String format)  { throw new RuntimeException(); }
  public  scala.Function1<java.lang.Object, java.lang.Object> createDateRebaseFuncInRead (scala.Enumeration.Value rebaseMode, java.lang.String format)  { throw new RuntimeException(); }
  public  scala.Function1<java.lang.Object, java.lang.Object> createDateRebaseFuncInWrite (scala.Enumeration.Value rebaseMode, java.lang.String format)  { throw new RuntimeException(); }
  public  scala.Function1<java.lang.Object, java.lang.Object> createTimestampRebaseFuncInRead (org.apache.spark.sql.catalyst.util.RebaseDateTime.RebaseSpec rebaseSpec, java.lang.String format)  { throw new RuntimeException(); }
  public  scala.Function1<java.lang.Object, java.lang.Object> createTimestampRebaseFuncInWrite (scala.Enumeration.Value rebaseMode, java.lang.String format)  { throw new RuntimeException(); }
  public  scala.collection.immutable.Map<java.lang.String, java.lang.String> generateDatasourceOptions (org.apache.spark.sql.util.CaseInsensitiveStringMap extraOptions, org.apache.spark.sql.catalyst.catalog.CatalogTable table)  { throw new RuntimeException(); }
  public  scala.Tuple2<scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression>, scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression>> getPartitionFiltersAndDataFilters (org.apache.spark.sql.types.StructType partitionSchema, scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> normalizedFilters)  { throw new RuntimeException(); }
}