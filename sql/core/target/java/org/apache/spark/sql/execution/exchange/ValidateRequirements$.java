package org.apache.spark.sql.execution.exchange;
/**
 * Validates that the {@link org.apache.spark.sql.catalyst.plans.physical.Partitioning Partitioning}
 * of input data meets the
 * {@link org.apache.spark.sql.catalyst.plans.physical.Distribution Distribution} requirements for
 * each operator, and so are the ordering requirements.
 */
public  class ValidateRequirements$ implements org.apache.spark.internal.Logging {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final ValidateRequirements$ MODULE$ = null;
  public   ValidateRequirements$ ()  { throw new RuntimeException(); }
  public  boolean validate (org.apache.spark.sql.execution.SparkPlan plan, org.apache.spark.sql.catalyst.plans.physical.Distribution requiredDistribution)  { throw new RuntimeException(); }
  public  boolean validate (org.apache.spark.sql.execution.SparkPlan plan)  { throw new RuntimeException(); }
}
