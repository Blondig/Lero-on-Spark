package org.apache.spark.sql.execution.datasources.v2;
public  class PushDownUtils {
  /**
   * Pushes down filters to the data source reader
   * <p>
   * @return pushed filter and post-scan filters.
   * @param scanBuilder (undocumented)
   * @param filters (undocumented)
   */
  static public  scala.Tuple2<scala.util.Either<scala.collection.Seq<org.apache.spark.sql.sources.Filter>, scala.collection.Seq<org.apache.spark.sql.connector.expressions.filter.Predicate>>, scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression>> pushFilters (org.apache.spark.sql.connector.read.ScanBuilder scanBuilder, scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> filters)  { throw new RuntimeException(); }
  /**
   * Pushes down TableSample to the data source Scan
   * @param scanBuilder (undocumented)
   * @param sample (undocumented)
   * @return (undocumented)
   */
  static public  boolean pushTableSample (org.apache.spark.sql.connector.read.ScanBuilder scanBuilder, org.apache.spark.sql.execution.datasources.v2.TableSampleInfo sample)  { throw new RuntimeException(); }
  /**
   * Pushes down LIMIT to the data source Scan.
   * <p>
   * @return the tuple of Boolean. The first Boolean value represents whether to push down, and
   *         the second Boolean value represents whether to push down partially, which means
   *         Spark will keep the Limit and do it again.
   * @param scanBuilder (undocumented)
   * @param limit (undocumented)
   */
  static public  boolean pushLimit (org.apache.spark.sql.connector.read.ScanBuilder scanBuilder, int limit)  { throw new RuntimeException(); }
  /**
   * Pushes down top N to the data source Scan.
   * <p>
   * @return the tuple of Boolean. The first Boolean value represents whether to push down, and
   *         the second Boolean value represents whether to push down partially, which means
   *         Spark will keep the Sort and Limit and do it again.
   * @param scanBuilder (undocumented)
   * @param order (undocumented)
   * @param limit (undocumented)
   */
  static public  scala.Tuple2<java.lang.Object, java.lang.Object> pushTopN (org.apache.spark.sql.connector.read.ScanBuilder scanBuilder, org.apache.spark.sql.connector.expressions.SortOrder[] order, int limit)  { throw new RuntimeException(); }
  /**
   * Applies column pruning to the data source, w.r.t. the references of the given expressions.
   * <p>
   * @return the <code>Scan</code> instance (since column pruning is the last step of operator pushdown),
   *         and new output attributes after column pruning.
   * @param scanBuilder (undocumented)
   * @param relation (undocumented)
   * @param projects (undocumented)
   * @param filters (undocumented)
   */
  static public  scala.Tuple2<org.apache.spark.sql.connector.read.Scan, scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.AttributeReference>> pruneColumns (org.apache.spark.sql.connector.read.ScanBuilder scanBuilder, org.apache.spark.sql.execution.datasources.v2.DataSourceV2Relation relation, scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.NamedExpression> projects, scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> filters)  { throw new RuntimeException(); }
  static public  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.AttributeReference> toOutputAttrs (org.apache.spark.sql.types.StructType schema, org.apache.spark.sql.execution.datasources.v2.DataSourceV2Relation relation)  { throw new RuntimeException(); }
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
