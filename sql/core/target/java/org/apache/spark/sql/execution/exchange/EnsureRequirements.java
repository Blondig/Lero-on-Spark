package org.apache.spark.sql.execution.exchange;
/**
 * Ensures that the {@link org.apache.spark.sql.catalyst.plans.physical.Partitioning Partitioning}
 * of input data meets the
 * {@link org.apache.spark.sql.catalyst.plans.physical.Distribution Distribution} requirements for
 * each operator by inserting {@link ShuffleExchangeExec} Operators where required.  Also ensure that
 * the input partition ordering requirements are met.
 * <p>
 * param:  optimizeOutRepartition A flag to indicate that if this rule should optimize out
 *                               user-specified repartition shuffles or not. This is mostly true,
 *                               but can be false in AQE when AQE optimization may change the plan
 *                               output partitioning and need to retain the user-specified
 *                               repartition shuffles in the plan.
 * param:  requiredDistribution The root required distribution we should ensure. This value is used
 *                             in AQE in case we change final stage output partitioning.
 */
public  class EnsureRequirements extends org.apache.spark.sql.catalyst.rules.Rule<org.apache.spark.sql.execution.SparkPlan> implements scala.Product, scala.Serializable {
  static public  java.lang.String toString ()  { throw new RuntimeException(); }
  public  boolean optimizeOutRepartition ()  { throw new RuntimeException(); }
  public  scala.Option<org.apache.spark.sql.catalyst.plans.physical.Distribution> requiredDistribution ()  { throw new RuntimeException(); }
  // not preceding
  public   EnsureRequirements (boolean optimizeOutRepartition, scala.Option<org.apache.spark.sql.catalyst.plans.physical.Distribution> requiredDistribution)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.execution.SparkPlan apply (org.apache.spark.sql.execution.SparkPlan plan)  { throw new RuntimeException(); }
}
