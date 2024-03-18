package org.apache.spark.sql.execution.adaptive;
/**
 * A rule to optimize skewed joins to avoid straggler tasks whose share of data are significantly
 * larger than those of the rest of the tasks.
 * <p>
 * The general idea is to divide each skew partition into smaller partitions and replicate its
 * matching partition on the other side of the join so that they can run in parallel tasks.
 * Note that when matching partitions from the left side and the right side both have skew,
 * it will become a cartesian product of splits from left and right joining together.
 * <p>
 * For example, assume the Sort-Merge join has 4 partitions:
 * left:  [L1, L2, L3, L4]
 * right: [R1, R2, R3, R4]
 * <p>
 * Let's say L2, L4 and R3, R4 are skewed, and each of them get split into 2 sub-partitions. This
 * is scheduled to run 4 tasks at the beginning: (L1, R1), (L2, R2), (L3, R3), (L4, R4).
 * This rule expands it to 9 tasks to increase parallelism:
 * (L1, R1),
 * (L2-1, R2), (L2-2, R2),
 * (L3, R3-1), (L3, R3-2),
 * (L4-1, R4-1), (L4-2, R4-1), (L4-1, R4-2), (L4-2, R4-2)
 */
public  class OptimizeSkewedJoin extends org.apache.spark.sql.catalyst.rules.Rule<org.apache.spark.sql.execution.SparkPlan> implements scala.Product, scala.Serializable {
  public  class ShuffleStage$ {
    public   ShuffleStage$ ()  { throw new RuntimeException(); }
    public  scala.Option<org.apache.spark.sql.execution.adaptive.ShuffleQueryStageExec> unapply (org.apache.spark.sql.execution.SparkPlan plan)  { throw new RuntimeException(); }
  }
  static public  java.lang.String toString ()  { throw new RuntimeException(); }
  /**
   * Accessor for nested Scala object
   * @return (undocumented)
   */
  public  org.apache.spark.sql.execution.adaptive.OptimizeSkewedJoin.ShuffleStage$ ShuffleStage ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.execution.exchange.EnsureRequirements ensureRequirements ()  { throw new RuntimeException(); }
  // not preceding
  public   OptimizeSkewedJoin (org.apache.spark.sql.execution.exchange.EnsureRequirements ensureRequirements)  { throw new RuntimeException(); }
  /**
   * A partition is considered as a skewed partition if its size is larger than the median
   * partition size * SKEW_JOIN_SKEWED_PARTITION_FACTOR and also larger than
   * SKEW_JOIN_SKEWED_PARTITION_THRESHOLD. Thus we pick the larger one as the skew threshold.
   * @param medianSize (undocumented)
   * @return (undocumented)
   */
  public  long getSkewThreshold (long medianSize)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.execution.SparkPlan optimizeSkewJoin (org.apache.spark.sql.execution.SparkPlan plan)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.execution.SparkPlan apply (org.apache.spark.sql.execution.SparkPlan plan)  { throw new RuntimeException(); }
}
