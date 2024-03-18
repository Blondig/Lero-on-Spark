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
public  class OptimizeSkewInRebalancePartitions {
  static public  scala.collection.Seq<org.apache.spark.sql.execution.exchange.ShuffleOrigin> supportedShuffleOrigins ()  { throw new RuntimeException(); }
  static public  org.apache.spark.sql.execution.SparkPlan apply (org.apache.spark.sql.execution.SparkPlan plan)  { throw new RuntimeException(); }
  static public  org.apache.spark.sql.internal.SQLConf conf ()  { throw new RuntimeException(); }
  static protected  java.lang.String logName ()  { throw new RuntimeException(); }
  static protected  org.slf4j.Logger log ()  { throw new RuntimeException(); }
  static protected  void logInfo (scala.Function0<java.lang.String> msg)  { throw new RuntimeException(); }
  static protected  void logDebug (scala.Function0<java.lang.String> msg)  { throw new RuntimeException(); }
  static protected  void logTrace (scala.Function0<java.lang.String> msg)  { throw new RuntimeException(); }
  static protected  void logWarning (scala.Function0<java.lang.String> msg)  { throw new RuntimeException(); }
  static protected  void logError (scala.Function0<java.lang.String> msg)  { throw new RuntimeException(); }
  static protected  void logInfo (scala.Function0<java.lang.String> msg, java.lang.Throwable throwable)  { throw new RuntimeException(); }
  static protected  void logDebug (scala.Function0<java.lang.String> msg, java.lang.Throwable throwable)  { throw new RuntimeException(); }
  static protected  void logTrace (scala.Function0<java.lang.String> msg, java.lang.Throwable throwable)  { throw new RuntimeException(); }
  static protected  void logWarning (scala.Function0<java.lang.String> msg, java.lang.Throwable throwable)  { throw new RuntimeException(); }
  static protected  void logError (scala.Function0<java.lang.String> msg, java.lang.Throwable throwable)  { throw new RuntimeException(); }
  static protected  boolean isTraceEnabled ()  { throw new RuntimeException(); }
  static protected  void initializeLogIfNecessary (boolean isInterpreter)  { throw new RuntimeException(); }
  static protected  boolean initializeLogIfNecessary (boolean isInterpreter, boolean silent)  { throw new RuntimeException(); }
  static protected  boolean initializeLogIfNecessary$default$2 ()  { throw new RuntimeException(); }
  static   void initializeForcefully (boolean isInterpreter, boolean silent)  { throw new RuntimeException(); }
  static protected  org.apache.spark.sql.catalyst.rules.RuleId ruleId ()  { throw new RuntimeException(); }
  static public  java.lang.String ruleName ()  { throw new RuntimeException(); }
  static public  org.slf4j.Logger org$apache$spark$internal$Logging$$log_ ()  { throw new RuntimeException(); }
  static public  void org$apache$spark$internal$Logging$$log__$eq (org.slf4j.Logger x$1)  { throw new RuntimeException(); }
  static protected  boolean isSupported (org.apache.spark.sql.execution.exchange.ShuffleExchangeLike shuffle)  { throw new RuntimeException(); }
}
