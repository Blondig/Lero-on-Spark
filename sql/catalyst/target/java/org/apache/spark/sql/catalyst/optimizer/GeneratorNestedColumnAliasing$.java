package org.apache.spark.sql.catalyst.optimizer;
/**
 * This prunes unnecessary nested columns from {@link Generate}, or {@link Project} -> {@link Generate}
 */
public  class GeneratorNestedColumnAliasing$ {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final GeneratorNestedColumnAliasing$ MODULE$ = null;
  public   GeneratorNestedColumnAliasing$ ()  { throw new RuntimeException(); }
  public  scala.Option<org.apache.spark.sql.catalyst.plans.logical.LogicalPlan> unapply (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan)  { throw new RuntimeException(); }
  /**
   * Types of {@link Generator} on which we can prune nested fields.
   * @param g (undocumented)
   * @return (undocumented)
   */
  public  boolean canPruneGenerator (org.apache.spark.sql.catalyst.expressions.Generator g)  { throw new RuntimeException(); }
}
