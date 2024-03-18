package org.apache.spark.sql.execution.adaptive;
/**
 * This optimization rule includes three join selection:
 *   1. detects a join child that has a high ratio of empty partitions and adds a
 *      NO_BROADCAST_HASH hint to avoid it being broadcast, as shuffle join is faster in this case:
 *      many tasks complete immediately since one join side is empty.
 *   2. detects a join child that every partition size is less than local map threshold and adds a
 *      PREFER_SHUFFLE_HASH hint to encourage being shuffle hash join instead of sort merge join.
 *   3. if a join satisfies both NO_BROADCAST_HASH and PREFER_SHUFFLE_HASH,
 *      then add a SHUFFLE_HASH hint.
 */
public  class DynamicJoinSelection {
  static public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan apply (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan)  { throw new RuntimeException(); }
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
  static public  scala.Option<org.apache.spark.sql.catalyst.optimizer.BuildSide> getBroadcastBuildSide (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan left, org.apache.spark.sql.catalyst.plans.logical.LogicalPlan right, org.apache.spark.sql.catalyst.plans.JoinType joinType, org.apache.spark.sql.catalyst.plans.logical.JoinHint hint, boolean hintOnly, org.apache.spark.sql.internal.SQLConf conf)  { throw new RuntimeException(); }
  static public  scala.Option<org.apache.spark.sql.catalyst.optimizer.BuildSide> getShuffleHashJoinBuildSide (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan left, org.apache.spark.sql.catalyst.plans.logical.LogicalPlan right, org.apache.spark.sql.catalyst.plans.JoinType joinType, org.apache.spark.sql.catalyst.plans.logical.JoinHint hint, boolean hintOnly, org.apache.spark.sql.internal.SQLConf conf)  { throw new RuntimeException(); }
  static public  org.apache.spark.sql.catalyst.optimizer.BuildSide getSmallerSide (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan left, org.apache.spark.sql.catalyst.plans.logical.LogicalPlan right)  { throw new RuntimeException(); }
  static public  boolean canBroadcastBySize (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan, org.apache.spark.sql.internal.SQLConf conf)  { throw new RuntimeException(); }
  static public  boolean canBuildBroadcastLeft (org.apache.spark.sql.catalyst.plans.JoinType joinType)  { throw new RuntimeException(); }
  static public  boolean canBuildBroadcastRight (org.apache.spark.sql.catalyst.plans.JoinType joinType)  { throw new RuntimeException(); }
  static public  boolean canBuildShuffledHashJoinLeft (org.apache.spark.sql.catalyst.plans.JoinType joinType)  { throw new RuntimeException(); }
  static public  boolean canBuildShuffledHashJoinRight (org.apache.spark.sql.catalyst.plans.JoinType joinType)  { throw new RuntimeException(); }
  static public  boolean canPlanAsBroadcastHashJoin (org.apache.spark.sql.catalyst.plans.logical.Join join, org.apache.spark.sql.internal.SQLConf conf)  { throw new RuntimeException(); }
  static public  boolean canPruneLeft (org.apache.spark.sql.catalyst.plans.JoinType joinType)  { throw new RuntimeException(); }
  static public  boolean canPruneRight (org.apache.spark.sql.catalyst.plans.JoinType joinType)  { throw new RuntimeException(); }
  static public  boolean hintToBroadcastLeft (org.apache.spark.sql.catalyst.plans.logical.JoinHint hint)  { throw new RuntimeException(); }
  static public  boolean hintToBroadcastRight (org.apache.spark.sql.catalyst.plans.logical.JoinHint hint)  { throw new RuntimeException(); }
  static public  boolean hintToNotBroadcastLeft (org.apache.spark.sql.catalyst.plans.logical.JoinHint hint)  { throw new RuntimeException(); }
  static public  boolean hintToNotBroadcastRight (org.apache.spark.sql.catalyst.plans.logical.JoinHint hint)  { throw new RuntimeException(); }
  static public  boolean hintToShuffleHashJoinLeft (org.apache.spark.sql.catalyst.plans.logical.JoinHint hint)  { throw new RuntimeException(); }
  static public  boolean hintToShuffleHashJoinRight (org.apache.spark.sql.catalyst.plans.logical.JoinHint hint)  { throw new RuntimeException(); }
  static public  boolean hintToPreferShuffleHashJoinLeft (org.apache.spark.sql.catalyst.plans.logical.JoinHint hint)  { throw new RuntimeException(); }
  static public  boolean hintToPreferShuffleHashJoinRight (org.apache.spark.sql.catalyst.plans.logical.JoinHint hint)  { throw new RuntimeException(); }
  static public  boolean hintToPreferShuffleHashJoin (org.apache.spark.sql.catalyst.plans.logical.JoinHint hint)  { throw new RuntimeException(); }
  static public  boolean hintToShuffleHashJoin (org.apache.spark.sql.catalyst.plans.logical.JoinHint hint)  { throw new RuntimeException(); }
  static public  boolean hintToSortMergeJoin (org.apache.spark.sql.catalyst.plans.logical.JoinHint hint)  { throw new RuntimeException(); }
  static public  boolean hintToShuffleReplicateNL (org.apache.spark.sql.catalyst.plans.logical.JoinHint hint)  { throw new RuntimeException(); }
}
