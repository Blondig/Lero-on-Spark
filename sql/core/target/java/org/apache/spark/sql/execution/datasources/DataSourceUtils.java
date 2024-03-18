package org.apache.spark.sql.execution.datasources;
public  class DataSourceUtils {
  /**
   * The key to use for storing partitionBy columns as options.
   * @return (undocumented)
   */
  static public  java.lang.String PARTITIONING_COLUMNS_KEY ()  { throw new RuntimeException(); }
  /**
   * The key to use for specifying partition overwrite mode when
   * INSERT OVERWRITE a partitioned data source table.
   * @return (undocumented)
   */
  static public  java.lang.String PARTITION_OVERWRITE_MODE ()  { throw new RuntimeException(); }
  static public  java.lang.String encodePartitioningColumns (scala.collection.Seq<java.lang.String> columns)  { throw new RuntimeException(); }
  static public  scala.collection.Seq<java.lang.String> decodePartitioningColumns (java.lang.String str)  { throw new RuntimeException(); }
  /**
   * Verify if the field name is supported in datasource. This verification should be done
   * in a driver side.
   * @param format (undocumented)
   * @param schema (undocumented)
   */
  static public  void checkFieldNames (org.apache.spark.sql.execution.datasources.FileFormat format, org.apache.spark.sql.types.StructType schema)  { throw new RuntimeException(); }
  /**
   * Verify if the schema is supported in datasource. This verification should be done
   * in a driver side.
   * @param format (undocumented)
   * @param schema (undocumented)
   */
  static public  void verifySchema (org.apache.spark.sql.execution.datasources.FileFormat format, org.apache.spark.sql.types.StructType schema)  { throw new RuntimeException(); }
  static   boolean isDataPath (org.apache.hadoop.fs.Path path)  { throw new RuntimeException(); }
  static   boolean isDataFile (java.lang.String fileName)  { throw new RuntimeException(); }
  /**
   * Returns if the given relation's V1 datasource provider supports nested predicate pushdown.
   * @param relation (undocumented)
   * @return (undocumented)
   */
  static   boolean supportNestedPredicatePushdown (org.apache.spark.sql.sources.BaseRelation relation)  { throw new RuntimeException(); }
  static public  org.apache.spark.sql.catalyst.util.RebaseDateTime.RebaseSpec datetimeRebaseSpec (scala.Function1<java.lang.String, java.lang.String> lookupFileMeta, java.lang.String modeByConfig)  { throw new RuntimeException(); }
  static public  org.apache.spark.sql.catalyst.util.RebaseDateTime.RebaseSpec int96RebaseSpec (scala.Function1<java.lang.String, java.lang.String> lookupFileMeta, java.lang.String modeByConfig)  { throw new RuntimeException(); }
  static public  org.apache.spark.SparkUpgradeException newRebaseExceptionInRead (java.lang.String format)  { throw new RuntimeException(); }
  static public  org.apache.spark.SparkUpgradeException newRebaseExceptionInWrite (java.lang.String format)  { throw new RuntimeException(); }
  static public  scala.Function1<java.lang.Object, java.lang.Object> createDateRebaseFuncInRead (scala.Enumeration.Value rebaseMode, java.lang.String format)  { throw new RuntimeException(); }
  static public  scala.Function1<java.lang.Object, java.lang.Object> createDateRebaseFuncInWrite (scala.Enumeration.Value rebaseMode, java.lang.String format)  { throw new RuntimeException(); }
  static public  scala.Function1<java.lang.Object, java.lang.Object> createTimestampRebaseFuncInRead (org.apache.spark.sql.catalyst.util.RebaseDateTime.RebaseSpec rebaseSpec, java.lang.String format)  { throw new RuntimeException(); }
  static public  scala.Function1<java.lang.Object, java.lang.Object> createTimestampRebaseFuncInWrite (scala.Enumeration.Value rebaseMode, java.lang.String format)  { throw new RuntimeException(); }
  static public  scala.collection.immutable.Map<java.lang.String, java.lang.String> generateDatasourceOptions (org.apache.spark.sql.util.CaseInsensitiveStringMap extraOptions, org.apache.spark.sql.catalyst.catalog.CatalogTable table)  { throw new RuntimeException(); }
  static public  scala.Tuple2<scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression>, scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression>> getPartitionFiltersAndDataFilters (org.apache.spark.sql.types.StructType partitionSchema, scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> normalizedFilters)  { throw new RuntimeException(); }
  static protected  org.apache.spark.sql.catalyst.expressions.AttributeMap<org.apache.spark.sql.catalyst.expressions.Alias> getAliasMap (org.apache.spark.sql.catalyst.plans.logical.Project plan)  { throw new RuntimeException(); }
  static protected  org.apache.spark.sql.catalyst.expressions.AttributeMap<org.apache.spark.sql.catalyst.expressions.Alias> getAliasMap (org.apache.spark.sql.catalyst.plans.logical.Aggregate plan)  { throw new RuntimeException(); }
  static protected  org.apache.spark.sql.catalyst.expressions.AttributeMap<org.apache.spark.sql.catalyst.expressions.Alias> getAliasMap (scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.NamedExpression> exprs)  { throw new RuntimeException(); }
  static protected  org.apache.spark.sql.catalyst.expressions.Expression replaceAlias (org.apache.spark.sql.catalyst.expressions.Expression expr, org.apache.spark.sql.catalyst.expressions.AttributeMap<org.apache.spark.sql.catalyst.expressions.Alias> aliasMap)  { throw new RuntimeException(); }
  static protected  org.apache.spark.sql.catalyst.expressions.NamedExpression replaceAliasButKeepName (org.apache.spark.sql.catalyst.expressions.NamedExpression expr, org.apache.spark.sql.catalyst.expressions.AttributeMap<org.apache.spark.sql.catalyst.expressions.Alias> aliasMap)  { throw new RuntimeException(); }
  static protected  org.apache.spark.sql.catalyst.expressions.Expression trimAliases (org.apache.spark.sql.catalyst.expressions.Expression e)  { throw new RuntimeException(); }
  static protected <T extends org.apache.spark.sql.catalyst.expressions.Expression> T trimNonTopLevelAliases (T e)  { throw new RuntimeException(); }
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
  static protected  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> splitConjunctivePredicates (org.apache.spark.sql.catalyst.expressions.Expression condition)  { throw new RuntimeException(); }
  static public  scala.Option<scala.Tuple2<org.apache.spark.sql.catalyst.expressions.Expression, org.apache.spark.sql.catalyst.plans.logical.LogicalPlan>> findExpressionAndTrackLineageDown (org.apache.spark.sql.catalyst.expressions.Expression exp, org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan)  { throw new RuntimeException(); }
  static protected  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> splitDisjunctivePredicates (org.apache.spark.sql.catalyst.expressions.Expression condition)  { throw new RuntimeException(); }
  static protected  org.apache.spark.sql.catalyst.expressions.Expression buildBalancedPredicate (scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> expressions, scala.Function2<org.apache.spark.sql.catalyst.expressions.Expression, org.apache.spark.sql.catalyst.expressions.Expression, org.apache.spark.sql.catalyst.expressions.Expression> op)  { throw new RuntimeException(); }
  static protected  boolean canEvaluate (org.apache.spark.sql.catalyst.expressions.Expression expr, org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan)  { throw new RuntimeException(); }
  static protected  boolean canEvaluateWithinJoin (org.apache.spark.sql.catalyst.expressions.Expression expr)  { throw new RuntimeException(); }
  static protected  scala.Option<org.apache.spark.sql.catalyst.expressions.Expression> extractPredicatesWithinOutputSet (org.apache.spark.sql.catalyst.expressions.Expression condition, org.apache.spark.sql.catalyst.expressions.AttributeSet outputSet)  { throw new RuntimeException(); }
  static protected  boolean isNullIntolerant (org.apache.spark.sql.catalyst.expressions.Expression expr)  { throw new RuntimeException(); }
  static protected  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Attribute> outputWithNullability (scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Attribute> output, scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.ExprId> nonNullAttrExprIds)  { throw new RuntimeException(); }
  static public  boolean isLikelySelective (org.apache.spark.sql.catalyst.expressions.Expression e)  { throw new RuntimeException(); }
}
