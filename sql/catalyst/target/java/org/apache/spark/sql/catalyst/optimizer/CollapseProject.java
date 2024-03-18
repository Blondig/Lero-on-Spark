package org.apache.spark.sql.catalyst.optimizer;
/**
 * Combines two {@link Project} operators into one and perform alias substitution,
 * merging the expressions into one single expression for the following cases.
 * 1. When two {@link Project} operators are adjacent.
 * 2. When two {@link Project} operators have LocalLimit/Sample/Repartition operator between them
 *    and the upper project consists of the same number of columns which is equal or aliasing.
 *    <code>GlobalLimit(LocalLimit)</code> pattern is also considered.
 */
public  class CollapseProject {
  static public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan apply (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan)  { throw new RuntimeException(); }
  /**
   * Check if we can collapse expressions safely.
   * @param consumers (undocumented)
   * @param producers (undocumented)
   * @param alwaysInline (undocumented)
   * @return (undocumented)
   */
  static public  boolean canCollapseExpressions (scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> consumers, scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.NamedExpression> producers, boolean alwaysInline)  { throw new RuntimeException(); }
  /**
   * Check if we can collapse expressions safely.
   * @param consumers (undocumented)
   * @param producerMap (undocumented)
   * @param alwaysInline (undocumented)
   * @return (undocumented)
   */
  static public  boolean canCollapseExpressions (scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> consumers, scala.collection.immutable.Map<org.apache.spark.sql.catalyst.expressions.Attribute, org.apache.spark.sql.catalyst.expressions.Expression> producerMap, boolean alwaysInline)  { throw new RuntimeException(); }
  static public  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.NamedExpression> buildCleanedProjectList (scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.NamedExpression> upper, scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.NamedExpression> lower)  { throw new RuntimeException(); }
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
  static protected  org.apache.spark.sql.catalyst.expressions.AttributeMap<org.apache.spark.sql.catalyst.expressions.Alias> getAliasMap (org.apache.spark.sql.catalyst.plans.logical.Project plan)  { throw new RuntimeException(); }
  static protected  org.apache.spark.sql.catalyst.expressions.AttributeMap<org.apache.spark.sql.catalyst.expressions.Alias> getAliasMap (org.apache.spark.sql.catalyst.plans.logical.Aggregate plan)  { throw new RuntimeException(); }
  static protected  org.apache.spark.sql.catalyst.expressions.AttributeMap<org.apache.spark.sql.catalyst.expressions.Alias> getAliasMap (scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.NamedExpression> exprs)  { throw new RuntimeException(); }
  static protected  org.apache.spark.sql.catalyst.expressions.Expression replaceAlias (org.apache.spark.sql.catalyst.expressions.Expression expr, org.apache.spark.sql.catalyst.expressions.AttributeMap<org.apache.spark.sql.catalyst.expressions.Alias> aliasMap)  { throw new RuntimeException(); }
  static protected  org.apache.spark.sql.catalyst.expressions.NamedExpression replaceAliasButKeepName (org.apache.spark.sql.catalyst.expressions.NamedExpression expr, org.apache.spark.sql.catalyst.expressions.AttributeMap<org.apache.spark.sql.catalyst.expressions.Alias> aliasMap)  { throw new RuntimeException(); }
  static protected  org.apache.spark.sql.catalyst.expressions.Expression trimAliases (org.apache.spark.sql.catalyst.expressions.Expression e)  { throw new RuntimeException(); }
  static protected <T extends org.apache.spark.sql.catalyst.expressions.Expression> T trimNonTopLevelAliases (T e)  { throw new RuntimeException(); }
}
