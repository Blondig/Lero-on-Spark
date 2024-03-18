package org.apache.spark.sql.catalyst.planning;
/**
 * An extractor for row-level commands such as DELETE, UPDATE, MERGE that were rewritten using plans
 * that operate on groups of rows.
 * <p>
 * This class extracts the following entities:
 *  - the group-based rewrite plan;
 *  - the condition that defines matching groups;
 *  - the read relation that can be either {@link DataSourceV2Relation} or {@link DataSourceV2ScanRelation}
 *  depending on whether the planning has already happened;
 */
public  class GroupBasedRowLevelOperation {
  static public  scala.Option<scala.Tuple3<org.apache.spark.sql.catalyst.plans.logical.ReplaceData, org.apache.spark.sql.catalyst.expressions.Expression, org.apache.spark.sql.catalyst.plans.logical.LogicalPlan>> unapply (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan)  { throw new RuntimeException(); }
}
