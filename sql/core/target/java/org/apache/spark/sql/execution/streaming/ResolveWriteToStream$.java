package org.apache.spark.sql.execution.streaming;
/**
 * Replaces logical {@link WriteToStreamStatement} operator with an {@link WriteToStream} operator.
 */
public  class ResolveWriteToStream$ extends org.apache.spark.sql.catalyst.rules.Rule<org.apache.spark.sql.catalyst.plans.logical.LogicalPlan> implements org.apache.spark.sql.catalyst.SQLConfHelper {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final ResolveWriteToStream$ MODULE$ = null;
  public   ResolveWriteToStream$ ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan apply (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan)  { throw new RuntimeException(); }
  public  scala.Tuple2<java.lang.String, java.lang.Object> resolveCheckpointLocation (org.apache.spark.sql.catalyst.streaming.WriteToStreamStatement s)  { throw new RuntimeException(); }
}
