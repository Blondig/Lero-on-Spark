package org.apache.spark.sql.execution;
/**
 * Replace hash-based aggregate with sort aggregate in the spark plan if:
 * <p>
 * 1. The plan is a pair of partial and final {@link HashAggregateExec} or {@link ObjectHashAggregateExec},
 *    and the child of partial aggregate satisfies the sort order of corresponding
 *    {@link SortAggregateExec}.
 * or
 * 2. The plan is a {@link HashAggregateExec} or {@link ObjectHashAggregateExec}, and the child satisfies
 *    the sort order of corresponding {@link SortAggregateExec}.
 * <p>
 * Examples:
 * 1. aggregate after join:
 * <p>
 *  HashAggregate(t1.i, SUM, final)
 *               |                         SortAggregate(t1.i, SUM, complete)
 * HashAggregate(t1.i, SUM, partial)   =&gt;                |
 *               |                            SortMergeJoin(t1.i = t2.j)
 *    SortMergeJoin(t1.i = t2.j)
 * <p>
 * 2. aggregate after sort:
 * <p>
 * HashAggregate(t1.i, SUM, partial)         SortAggregate(t1.i, SUM, partial)
 *               |                     =&gt;                  |
 *           Sort(t1.i)                                Sort(t1.i)
 * <p>
 * Hash-based aggregate can be replaced when its child satisfies the sort order of
 * corresponding sort aggregate. Sort aggregate is faster in the sense that
 * it does not have hashing overhead of hash aggregate.
 */
public  class ReplaceHashWithSortAgg$ extends org.apache.spark.sql.catalyst.rules.Rule<org.apache.spark.sql.execution.SparkPlan> {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final ReplaceHashWithSortAgg$ MODULE$ = null;
  public   ReplaceHashWithSortAgg$ ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.execution.SparkPlan apply (org.apache.spark.sql.execution.SparkPlan plan)  { throw new RuntimeException(); }
}
