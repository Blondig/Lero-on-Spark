package org.apache.spark.sql.execution.adaptive;
/**
 * A rule to optimize the shuffle read to local read iff no additional shuffles
 * will be introduced:
 * 1. if the input plan is a shuffle, add local read directly as we can never introduce
 * extra shuffles in this case.
 * 2. otherwise, add local read to the probe side of broadcast hash join and
 * then run <code>EnsureRequirements</code> to check whether additional shuffle introduced.
 * If introduced, we will revert all the local reads.
 */
public  class OptimizeShuffleWithLocalRead$ extends org.apache.spark.sql.catalyst.rules.Rule<org.apache.spark.sql.execution.SparkPlan> implements org.apache.spark.sql.execution.adaptive.AQEShuffleReadRule {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final OptimizeShuffleWithLocalRead$ MODULE$ = null;
  public   OptimizeShuffleWithLocalRead$ ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.sql.execution.exchange.ShuffleOrigin> supportedShuffleOrigins ()  { throw new RuntimeException(); }
  protected  boolean isSupported (org.apache.spark.sql.execution.exchange.ShuffleExchangeLike shuffle)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.execution.SparkPlan apply (org.apache.spark.sql.execution.SparkPlan plan)  { throw new RuntimeException(); }
  public  boolean canUseLocalShuffleRead (org.apache.spark.sql.execution.SparkPlan plan)  { throw new RuntimeException(); }
}
