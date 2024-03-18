package org.apache.spark.sql.catalyst.analysis;
/**
 * A catalog for looking up user defined functions, used by an {@link Analyzer}.
 * <p>
 * Note:
 *   1) The implementation should be thread-safe to allow concurrent access.
 *   2) the database name is always case-sensitive here, callers are responsible to
 *      format the database name w.r.t. case-sensitive config.
 */
public  interface FunctionRegistryBase<T extends java.lang.Object> {
  public  void registerFunction (org.apache.spark.sql.catalyst.FunctionIdentifier name, scala.Function1<scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression>, T> builder, java.lang.String source)  ;
  public  void registerFunction (org.apache.spark.sql.catalyst.FunctionIdentifier name, org.apache.spark.sql.catalyst.expressions.ExpressionInfo info, scala.Function1<scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression>, T> builder)  ;
  public  void createOrReplaceTempFunction (java.lang.String name, scala.Function1<scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression>, T> builder, java.lang.String source)  ;
  public  T lookupFunction (org.apache.spark.sql.catalyst.FunctionIdentifier name, scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> children) throws org.apache.spark.sql.AnalysisException ;
  public  scala.collection.Seq<org.apache.spark.sql.catalyst.FunctionIdentifier> listFunction ()  ;
  public  scala.Option<org.apache.spark.sql.catalyst.expressions.ExpressionInfo> lookupFunction (org.apache.spark.sql.catalyst.FunctionIdentifier name)  ;
  public  scala.Option<scala.Function1<scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression>, T>> lookupFunctionBuilder (org.apache.spark.sql.catalyst.FunctionIdentifier name)  ;
  /** Drop a function and return whether the function existed. */
  public  boolean dropFunction (org.apache.spark.sql.catalyst.FunctionIdentifier name)  ;
  /** Checks if a function with a given name exists. */
  public  boolean functionExists (org.apache.spark.sql.catalyst.FunctionIdentifier name)  ;
  /** Clear all registered functions. */
  public  void clear ()  ;
}
