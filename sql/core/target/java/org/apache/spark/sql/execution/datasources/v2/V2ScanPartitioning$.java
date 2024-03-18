package org.apache.spark.sql.execution.datasources.v2;
/**
 * Extracts {@link DataSourceV2ScanRelation} from the input logical plan, converts any V2 partitioning
 * reported by data sources to their catalyst counterparts. Then, annotates the plan with the
 * result.
 */
public  class V2ScanPartitioning$ extends org.apache.spark.sql.catalyst.rules.Rule<org.apache.spark.sql.catalyst.plans.logical.LogicalPlan> implements org.apache.spark.sql.catalyst.SQLConfHelper {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final V2ScanPartitioning$ MODULE$ = null;
  public   V2ScanPartitioning$ ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan apply (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan)  { throw new RuntimeException(); }
}
