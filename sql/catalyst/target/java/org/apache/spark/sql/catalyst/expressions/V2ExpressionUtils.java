package org.apache.spark.sql.catalyst.expressions;
/**
 * A utility class that converts public connector expressions into Catalyst expressions.
 */
public  class V2ExpressionUtils {
  static public <T extends org.apache.spark.sql.catalyst.expressions.NamedExpression> T resolveRef (org.apache.spark.sql.connector.expressions.NamedReference ref, org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan)  { throw new RuntimeException(); }
  static public <T extends org.apache.spark.sql.catalyst.expressions.NamedExpression> scala.collection.Seq<T> resolveRefs (scala.collection.Seq<org.apache.spark.sql.connector.expressions.NamedReference> refs, org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan)  { throw new RuntimeException(); }
  /**
   * Converts the array of input V2 {@link V2SortOrder} into their counterparts in catalyst.
   * @param ordering (undocumented)
   * @param query (undocumented)
   * @return (undocumented)
   */
  static public  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.SortOrder> toCatalystOrdering (org.apache.spark.sql.connector.expressions.SortOrder[] ordering, org.apache.spark.sql.catalyst.plans.logical.LogicalPlan query)  { throw new RuntimeException(); }
  static public  org.apache.spark.sql.catalyst.expressions.Expression toCatalyst (org.apache.spark.sql.connector.expressions.Expression expr, org.apache.spark.sql.catalyst.plans.logical.LogicalPlan query, scala.Option<org.apache.spark.sql.connector.catalog.FunctionCatalog> funCatalogOpt)  { throw new RuntimeException(); }
  static public  scala.Option<org.apache.spark.sql.catalyst.expressions.Expression> toCatalystOpt (org.apache.spark.sql.connector.expressions.Expression expr, org.apache.spark.sql.catalyst.plans.logical.LogicalPlan query, scala.Option<org.apache.spark.sql.connector.catalog.FunctionCatalog> funCatalogOpt)  { throw new RuntimeException(); }
  static public  scala.Option<org.apache.spark.sql.catalyst.expressions.Expression> toCatalystTransformOpt (org.apache.spark.sql.connector.expressions.Transform trans, org.apache.spark.sql.catalyst.plans.logical.LogicalPlan query, scala.Option<org.apache.spark.sql.connector.catalog.FunctionCatalog> funCatalogOpt)  { throw new RuntimeException(); }
  static public  org.apache.spark.sql.internal.SQLConf conf ()  { throw new RuntimeException(); }
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
}
