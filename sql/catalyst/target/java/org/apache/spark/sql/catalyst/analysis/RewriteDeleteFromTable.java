package org.apache.spark.sql.catalyst.analysis;
/**
 * A rule that rewrites DELETE operations using plans that operate on individual or groups of rows.
 * <p>
 * If a table implements {@link SupportsDelete} and {@link SupportsRowLevelOperations}, this rule will
 * still rewrite the DELETE operation but the optimizer will check whether this particular DELETE
 * statement can be handled by simply passing delete filters to the connector. If so, the optimizer
 * will discard the rewritten plan and will allow the data source to delete using filters.
 */
public  class RewriteDeleteFromTable {
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
  static protected  org.apache.spark.sql.connector.write.RowLevelOperationTable buildOperationTable (org.apache.spark.sql.connector.catalog.SupportsRowLevelOperations table, org.apache.spark.sql.connector.write.RowLevelOperation.Command command, org.apache.spark.sql.util.CaseInsensitiveStringMap options)  { throw new RuntimeException(); }
  static protected  org.apache.spark.sql.execution.datasources.v2.DataSourceV2Relation buildRelationWithAttrs (org.apache.spark.sql.execution.datasources.v2.DataSourceV2Relation relation, org.apache.spark.sql.connector.write.RowLevelOperationTable table, scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.AttributeReference> metadataAttrs)  { throw new RuntimeException(); }
  static protected  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.AttributeReference> dedupAttrs (scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.AttributeReference> attrs)  { throw new RuntimeException(); }
  static protected  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.AttributeReference> resolveRequiredMetadataAttrs (org.apache.spark.sql.execution.datasources.v2.DataSourceV2Relation relation, org.apache.spark.sql.connector.write.RowLevelOperation operation)  { throw new RuntimeException(); }
}
