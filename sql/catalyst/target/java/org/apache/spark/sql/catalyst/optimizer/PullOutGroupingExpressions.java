package org.apache.spark.sql.catalyst.optimizer;
/**
 * This rule ensures that {@link Aggregate} nodes doesn't contain complex grouping expressions in the
 * optimization phase.
 * <p>
 * Complex grouping expressions are pulled out to a {@link Project} node under {@link Aggregate} and are
 * referenced in both grouping expressions and aggregate expressions without aggregate functions.
 * These references ensure that optimization rules don't change the aggregate expressions to invalid
 * ones that no longer refer to any grouping expressions and also simplify the expression
 * transformations on the node (need to transform the expression only once).
 * <p>
 * For example, in the following query Spark shouldn't optimize the aggregate expression
 * <code>Not(IsNull(c))</code> to <code>IsNotNull(c)</code> as the grouping expression is <code>IsNull(c)</code>:
 * SELECT not(c IS NULL)
 * FROM t
 * GROUP BY c IS NULL
 * Instead, the aggregate expression references a <code>_groupingexpression</code> attribute:
 * Aggregate [_groupingexpression#233], [NOT _groupingexpression#233 AS (NOT (c IS NULL))#230]
 * +- Project [isnull(c#219) AS _groupingexpression#233]
 *    +- LocalRelation [c#219]
 */
public  class PullOutGroupingExpressions {
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
}
