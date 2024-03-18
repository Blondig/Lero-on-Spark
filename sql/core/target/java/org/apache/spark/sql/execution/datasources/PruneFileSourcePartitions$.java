package org.apache.spark.sql.execution.datasources;
/**
 * Prune the partitions of file source based table using partition filters. Currently, this rule
 * is applied to {@link HadoopFsRelation} with {@link CatalogFileIndex}.
 * <p>
 * For {@link HadoopFsRelation}, the location will be replaced by pruned file index, and corresponding
 * statistics will be updated. And the partition filters will be kept in the filters of returned
 * logical plan.
 */
public  class PruneFileSourcePartitions$ extends org.apache.spark.sql.catalyst.rules.Rule<org.apache.spark.sql.catalyst.plans.logical.LogicalPlan> implements org.apache.spark.sql.catalyst.expressions.PredicateHelper {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final PruneFileSourcePartitions$ MODULE$ = null;
  public   PruneFileSourcePartitions$ ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan apply (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan)  { throw new RuntimeException(); }
}
