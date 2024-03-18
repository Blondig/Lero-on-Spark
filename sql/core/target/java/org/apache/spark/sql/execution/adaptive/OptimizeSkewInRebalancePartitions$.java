package org.apache.spark.sql.execution.adaptive;
/**
 * A rule to optimize the skewed shuffle partitions in {@link RebalancePartitions} based on the map
 * output statistics, which can avoid data skew that hurt performance.
 * <p>
 * We use ADVISORY_PARTITION_SIZE_IN_BYTES size to decide if a partition should be optimized.
 * Let's say we have 3 maps with 3 shuffle partitions, and assuming r1 has data skew issue.
 * the map side looks like:
 *   m0:[b0, b1, b2], m1:[b0, b1, b2], m2:[b0, b1, b2]
 * and the reduce side looks like:
 *                            (without this rule) r1[m0-b1, m1-b1, m2-b1]
 *                              /                                     \
 *   r0:[m0-b0, m1-b0, m2-b0], r1-0:[m0-b1], r1-1:[m1-b1], r1-2:[m2-b1], r2[m0-b2, m1-b2, m2-b2]
 */
public  class OptimizeSkewInRebalancePartitions$ extends org.apache.spark.sql.catalyst.rules.Rule<org.apache.spark.sql.execution.SparkPlan> implements org.apache.spark.sql.execution.adaptive.AQEShuffleReadRule {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final OptimizeSkewInRebalancePartitions$ MODULE$ = null;
  public   OptimizeSkewInRebalancePartitions$ ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.sql.execution.exchange.ShuffleOrigin> supportedShuffleOrigins ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.execution.SparkPlan apply (org.apache.spark.sql.execution.SparkPlan plan)  { throw new RuntimeException(); }
}
