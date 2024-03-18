package org.apache.spark.sql.catalyst.analysis;
/**
 * Analyze WITH nodes and substitute child plan with CTE references or CTE definitions depending
 * on the conditions below:
 * 1. If in legacy mode, or if the query is a SQL command or DML statement, replace with CTE
 *    definitions, i.e., inline CTEs.
 * 2. Otherwise, replace with CTE references <code>CTERelationRef</code>s. The decision to inline or not
 *    inline will be made later by the rule <code>InlineCTE</code> after query analysis.
 * <p>
 * All the CTE definitions that are not inlined after this substitution will be grouped together
 * under one <code>WithCTE</code> node for each of the main query and the subqueries. Any of the main query
 * or the subqueries that do not contain CTEs or have had all CTEs inlined will obviously not have
 * any <code>WithCTE</code> nodes. If any though, the <code>WithCTE</code> node will be in the same place as where the
 * outermost <code>With</code> node once was.
 * <p>
 * The CTE definitions in a <code>WithCTE</code> node are kept in the order of how they have been resolved.
 * That means the CTE definitions are guaranteed to be in topological order base on their
 * dependency for any valid CTE query (i.e., given CTE definitions A and B with B referencing A,
 * A is guaranteed to appear before B). Otherwise, it must be an invalid user query, and an
 * analysis exception will be thrown later by relation resolving rules.
 */
public  class CTESubstitution {
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
