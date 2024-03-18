package org.apache.spark.sql.catalyst.analysis;
/** Maps a time column to a session window. */
public  class SessionWindowing$ extends org.apache.spark.sql.catalyst.rules.Rule<org.apache.spark.sql.catalyst.plans.logical.LogicalPlan> {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final SessionWindowing$ MODULE$ = null;
  public   SessionWindowing$ ()  { throw new RuntimeException(); }
  /**
   * Generates the logical plan for generating session window on a timestamp column.
   * Each session window is initially defined as [timestamp, timestamp + gap).
   * <p>
   * This also adds a marker to the session column so that downstream can easily find the column
   * on session window.
   * @param plan (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan apply (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan)  { throw new RuntimeException(); }
}
