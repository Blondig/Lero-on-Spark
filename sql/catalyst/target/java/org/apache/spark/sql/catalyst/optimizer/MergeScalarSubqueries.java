package org.apache.spark.sql.catalyst.optimizer;
/**
 * This rule tries to merge multiple non-correlated {@link ScalarSubquery}s to compute multiple scalar
 * values once.
 * <p>
 * The process is the following:
 * - While traversing through the plan each {@link ScalarSubquery} plan is tried to merge into the cache
 *   of already seen subquery plans. If merge is possible then cache is updated with the merged
 *   subquery plan, if not then the new subquery plan is added to the cache.
 *   During this first traversal each {@link ScalarSubquery} expression is replaced to a temporal
 *   {@link ScalarSubqueryReference} reference pointing to its cached version.
 *   The cache uses a flag to keep track of if a cache entry is a result of merging 2 or more
 *   plans, or it is a plan that was seen only once.
 *   Merged plans in the cache get a "Header", that contains the list of attributes form the scalar
 *   return value of a merged subquery.
 * - A second traversal checks if there are merged subqueries in the cache and builds a <code>WithCTE</code>
 *   node from these queries. The <code>CTERelationDef</code> nodes contain the merged subquery in the
 *   following form:
 *   <code>Project(Seq(CreateNamedStruct(name1, attribute1, ...) AS mergedValue), mergedSubqueryPlan)</code>
 *   and the definitions are flagged that they host a subquery, that can return maximum one row.
 *   During the second traversal {@link ScalarSubqueryReference} expressions that pont to a merged
 *   subquery is either transformed to a <code>GetStructField(ScalarSubquery(CTERelationRef(...)))</code>
 *   expression or restored to the original {@link ScalarSubquery}.
 * <p>
 * Eg. the following query:
 * <p>
 * SELECT
 *   (SELECT avg(a) FROM t),
 *   (SELECT sum(b) FROM t)
 * <p>
 * is optimized from:
 * <p>
 * == Optimized Logical Plan ==
 * Project [scalar-subquery#242 [] AS scalarsubquery()#253,
 *          scalar-subquery#243 [] AS scalarsubquery()#254L]
 * :  :- Aggregate [avg(a#244) AS avg(a)#247]
 * :  :  +- Project [a#244]
 * :  :     +- Relation default.t[a#244,b#245] parquet
 * :  +- Aggregate [sum(a#251) AS sum(a)#250L]
 * :     +- Project [a#251]
 * :        +- Relation default.t[a#251,b#252] parquet
 * +- OneRowRelation
 * <p>
 * to:
 * <p>
 * == Optimized Logical Plan ==
 * Project [scalar-subquery#242 [].avg(a) AS scalarsubquery()#253,
 *          scalar-subquery#243 [].sum(a) AS scalarsubquery()#254L]
 * :  :- Project [named_struct(avg(a), avg(a)#247, sum(a), sum(a)#250L) AS mergedValue#260]
 * :  :  +- Aggregate [avg(a#244) AS avg(a)#247, sum(a#244) AS sum(a)#250L]
 * :  :     +- Project [a#244]
 * :  :        +- Relation default.t[a#244,b#245] parquet
 * :  +- Project [named_struct(avg(a), avg(a)#247, sum(a), sum(a)#250L) AS mergedValue#260]
 * :     +- Aggregate [avg(a#244) AS avg(a)#247, sum(a#244) AS sum(a)#250L]
 * :        +- Project [a#244]
 * :           +- Relation default.t[a#244,b#245] parquet
 * +- OneRowRelation
 * <p>
 * == Physical Plan ==
 *  *(1) Project [Subquery scalar-subquery#242, [id=#125].avg(a) AS scalarsubquery()#253,
 *                ReusedSubquery
 *                  Subquery scalar-subquery#242, [id=#125].sum(a) AS scalarsubquery()#254L]
 * :  :- Subquery scalar-subquery#242, [id=#125]
 * :  :  +- *(2) Project [named_struct(avg(a), avg(a)#247, sum(a), sum(a)#250L) AS mergedValue#260]
 * :  :     +- *(2) HashAggregate(keys=[], functions=[avg(a#244), sum(a#244)],
 *                                output=[avg(a)#247, sum(a)#250L])
 * :  :        +- Exchange SinglePartition, ENSURE_REQUIREMENTS, [id=#120]
 * :  :           +- *(1) HashAggregate(keys=[], functions=[partial_avg(a#244), partial_sum(a#244)],
 *                                      output=[sum#262, count#263L, sum#264L])
 * :  :              +- *(1) ColumnarToRow
 * :  :                 +- FileScan parquet default.t[a#244] ...
 * :  +- ReusedSubquery Subquery scalar-subquery#242, [id=#125]
 * +- *(1) Scan OneRowRelation[]
 */
public  class MergeScalarSubqueries {
  /**
   * An item in the cache of merged scalar subqueries.
   * <p>
   * param:  attributes Attributes that form the struct scalar return value of a merged subquery.
   * param:  plan The plan of a merged scalar subquery.
   * param:  merged A flag to identify if this item is the result of merging subqueries.
   *               Please note that <code>attributes.size == 1</code> doesn't always mean that the plan is not
   *               merged as there can be subqueries that are different ({@link checkIdenticalPlans} is
   *               false) due to an extra {@link Project} node in one of them. In that case
   *               <code>attributes.size</code> remains 1 after merging, but the merged flag becomes true.
   */
  static public  class Header implements scala.Product, scala.Serializable {
    public  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Attribute> attributes ()  { throw new RuntimeException(); }
    public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan ()  { throw new RuntimeException(); }
    public  boolean merged ()  { throw new RuntimeException(); }
    // not preceding
    public   Header (scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Attribute> attributes, org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan, boolean merged)  { throw new RuntimeException(); }
  }
  static public  class Header$ extends scala.runtime.AbstractFunction3<scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Attribute>, org.apache.spark.sql.catalyst.plans.logical.LogicalPlan, java.lang.Object, org.apache.spark.sql.catalyst.optimizer.MergeScalarSubqueries.Header> implements scala.Serializable {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final Header$ MODULE$ = null;
    public   Header$ ()  { throw new RuntimeException(); }
  }
  static public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan apply (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan)  { throw new RuntimeException(); }
  static public  org.apache.spark.sql.internal.SQLConf conf ()  { throw new RuntimeException(); }
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
  static protected  org.apache.spark.sql.catalyst.rules.RuleId ruleId ()  { throw new RuntimeException(); }
  static public  java.lang.String ruleName ()  { throw new RuntimeException(); }
  static public  org.slf4j.Logger org$apache$spark$internal$Logging$$log_ ()  { throw new RuntimeException(); }
  static public  void org$apache$spark$internal$Logging$$log__$eq (org.slf4j.Logger x$1)  { throw new RuntimeException(); }
  static protected  org.apache.spark.sql.catalyst.expressions.AttributeMap<org.apache.spark.sql.catalyst.expressions.Alias> getAliasMap (org.apache.spark.sql.catalyst.plans.logical.Project plan)  { throw new RuntimeException(); }
  static protected  org.apache.spark.sql.catalyst.expressions.AttributeMap<org.apache.spark.sql.catalyst.expressions.Alias> getAliasMap (org.apache.spark.sql.catalyst.plans.logical.Aggregate plan)  { throw new RuntimeException(); }
  static protected  org.apache.spark.sql.catalyst.expressions.AttributeMap<org.apache.spark.sql.catalyst.expressions.Alias> getAliasMap (scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.NamedExpression> exprs)  { throw new RuntimeException(); }
  static protected  org.apache.spark.sql.catalyst.expressions.Expression replaceAlias (org.apache.spark.sql.catalyst.expressions.Expression expr, org.apache.spark.sql.catalyst.expressions.AttributeMap<org.apache.spark.sql.catalyst.expressions.Alias> aliasMap)  { throw new RuntimeException(); }
  static protected  org.apache.spark.sql.catalyst.expressions.NamedExpression replaceAliasButKeepName (org.apache.spark.sql.catalyst.expressions.NamedExpression expr, org.apache.spark.sql.catalyst.expressions.AttributeMap<org.apache.spark.sql.catalyst.expressions.Alias> aliasMap)  { throw new RuntimeException(); }
  static protected  org.apache.spark.sql.catalyst.expressions.Expression trimAliases (org.apache.spark.sql.catalyst.expressions.Expression e)  { throw new RuntimeException(); }
  static protected <T extends org.apache.spark.sql.catalyst.expressions.Expression> T trimNonTopLevelAliases (T e)  { throw new RuntimeException(); }
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
