package org.apache.spark.sql.execution.adaptive;
/**
 * A rule that may create {@link AQEShuffleReadExec} on top of {@link ShuffleQueryStageExec} and change the
 * plan output partitioning. The AQE framework will skip the rule if it leads to extra shuffles.
 */
public  interface AQEShuffleReadRule {
  public  boolean isSupported (org.apache.spark.sql.execution.exchange.ShuffleExchangeLike shuffle)  ;
  /**
   * Returns the list of {@link ShuffleOrigin}s supported by this rule.
   * @return (undocumented)
   */
  public  scala.collection.Seq<org.apache.spark.sql.execution.exchange.ShuffleOrigin> supportedShuffleOrigins ()  ;
}
