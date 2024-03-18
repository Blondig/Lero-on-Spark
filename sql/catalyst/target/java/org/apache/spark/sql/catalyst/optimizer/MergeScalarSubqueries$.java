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
public  class MergeScalarSubqueries$ extends org.apache.spark.sql.catalyst.rules.Rule<org.apache.spark.sql.catalyst.plans.logical.LogicalPlan> implements org.apache.spark.sql.catalyst.expressions.PredicateHelper {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final MergeScalarSubqueries$ MODULE$ = null;
  public   MergeScalarSubqueries$ ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan apply (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan)  { throw new RuntimeException(); }
}
