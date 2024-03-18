package org.apache.spark.sql.catalyst.planning;
public  class ExtractSingleColumnNullAwareAntiJoin {
  /**
   * See. [SPARK-32290]
   * LeftAnti(condition: Or(EqualTo(a=b), IsNull(EqualTo(a=b)))
   * will almost certainly be planned as a Broadcast Nested Loop join,
   * which is very time consuming because it's an O(M*N) calculation.
   * But if it's a single column case O(M*N) calculation could be optimized into O(M)
   * using hash lookup instead of loop lookup.
   * @param join (undocumented)
   * @return (undocumented)
   */
  static public  scala.Option<scala.Tuple2<scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression>, scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression>>> unapply (org.apache.spark.sql.catalyst.plans.logical.Join join)  { throw new RuntimeException(); }
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
  static protected  org.apache.spark.sql.catalyst.expressions.AttributeMap<org.apache.spark.sql.catalyst.expressions.Alias> getAliasMap (org.apache.spark.sql.catalyst.plans.logical.Project plan)  { throw new RuntimeException(); }
  static protected  org.apache.spark.sql.catalyst.expressions.AttributeMap<org.apache.spark.sql.catalyst.expressions.Alias> getAliasMap (org.apache.spark.sql.catalyst.plans.logical.Aggregate plan)  { throw new RuntimeException(); }
  static protected  org.apache.spark.sql.catalyst.expressions.AttributeMap<org.apache.spark.sql.catalyst.expressions.Alias> getAliasMap (scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.NamedExpression> exprs)  { throw new RuntimeException(); }
  static protected  org.apache.spark.sql.catalyst.expressions.Expression replaceAlias (org.apache.spark.sql.catalyst.expressions.Expression expr, org.apache.spark.sql.catalyst.expressions.AttributeMap<org.apache.spark.sql.catalyst.expressions.Alias> aliasMap)  { throw new RuntimeException(); }
  static protected  org.apache.spark.sql.catalyst.expressions.NamedExpression replaceAliasButKeepName (org.apache.spark.sql.catalyst.expressions.NamedExpression expr, org.apache.spark.sql.catalyst.expressions.AttributeMap<org.apache.spark.sql.catalyst.expressions.Alias> aliasMap)  { throw new RuntimeException(); }
  static protected  org.apache.spark.sql.catalyst.expressions.Expression trimAliases (org.apache.spark.sql.catalyst.expressions.Expression e)  { throw new RuntimeException(); }
  static protected <T extends org.apache.spark.sql.catalyst.expressions.Expression> T trimNonTopLevelAliases (T e)  { throw new RuntimeException(); }
  static public  org.slf4j.Logger org$apache$spark$internal$Logging$$log_ ()  { throw new RuntimeException(); }
  static public  void org$apache$spark$internal$Logging$$log__$eq (org.slf4j.Logger x$1)  { throw new RuntimeException(); }
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
  static protected  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> splitConjunctivePredicates (org.apache.spark.sql.catalyst.expressions.Expression condition)  { throw new RuntimeException(); }
  static public  scala.Option<scala.Tuple2<org.apache.spark.sql.catalyst.expressions.Expression, org.apache.spark.sql.catalyst.plans.logical.LogicalPlan>> findExpressionAndTrackLineageDown (org.apache.spark.sql.catalyst.expressions.Expression exp, org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan)  { throw new RuntimeException(); }
  static protected  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> splitDisjunctivePredicates (org.apache.spark.sql.catalyst.expressions.Expression condition)  { throw new RuntimeException(); }
  static protected  org.apache.spark.sql.catalyst.expressions.Expression buildBalancedPredicate (scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> expressions, scala.Function2<org.apache.spark.sql.catalyst.expressions.Expression, org.apache.spark.sql.catalyst.expressions.Expression, org.apache.spark.sql.catalyst.expressions.Expression> op)  { throw new RuntimeException(); }
  static protected  boolean canEvaluate (org.apache.spark.sql.catalyst.expressions.Expression expr, org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan)  { throw new RuntimeException(); }
  static protected  boolean canEvaluateWithinJoin (org.apache.spark.sql.catalyst.expressions.Expression expr)  { throw new RuntimeException(); }
  static protected  scala.Option<org.apache.spark.sql.catalyst.expressions.Expression> extractPredicatesWithinOutputSet (org.apache.spark.sql.catalyst.expressions.Expression condition, org.apache.spark.sql.catalyst.expressions.AttributeSet outputSet)  { throw new RuntimeException(); }
  static protected  boolean isNullIntolerant (org.apache.spark.sql.catalyst.expressions.Expression expr)  { throw new RuntimeException(); }
  static protected  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Attribute> outputWithNullability (scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Attribute> output, scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.ExprId> nonNullAttrExprIds)  { throw new RuntimeException(); }
  static public  boolean isLikelySelective (org.apache.spark.sql.catalyst.expressions.Expression e)  { throw new RuntimeException(); }
}