package org.apache.spark.sql.catalyst.analysis;
public  interface SimpleFunctionRegistryBase<T extends java.lang.Object> extends org.apache.spark.sql.catalyst.analysis.FunctionRegistryBase<T>, org.apache.spark.internal.Logging {
  public  void clear ()  ;
  public  boolean dropFunction (org.apache.spark.sql.catalyst.FunctionIdentifier name)  ;
  public  scala.collection.mutable.HashMap<org.apache.spark.sql.catalyst.FunctionIdentifier, scala.Tuple2<org.apache.spark.sql.catalyst.expressions.ExpressionInfo, scala.Function1<scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression>, T>>> functionBuilders ()  ;
  /**
   * Perform function registry without any preprocessing.
   * This is used when registering built-in functions and doing <code>FunctionRegistry.clone()</code>
   * @param name (undocumented)
   * @param info (undocumented)
   * @param builder (undocumented)
   */
  public  void internalRegisterFunction (org.apache.spark.sql.catalyst.FunctionIdentifier name, org.apache.spark.sql.catalyst.expressions.ExpressionInfo info, scala.Function1<scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression>, T> builder)  ;
  public  scala.collection.Seq<org.apache.spark.sql.catalyst.FunctionIdentifier> listFunction ()  ;
  public  T lookupFunction (org.apache.spark.sql.catalyst.FunctionIdentifier name, scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> children)  ;
  public  scala.Option<org.apache.spark.sql.catalyst.expressions.ExpressionInfo> lookupFunction (org.apache.spark.sql.catalyst.FunctionIdentifier name)  ;
  public  scala.Option<scala.Function1<scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression>, T>> lookupFunctionBuilder (org.apache.spark.sql.catalyst.FunctionIdentifier name)  ;
  public  org.apache.spark.sql.catalyst.FunctionIdentifier normalizeFuncName (org.apache.spark.sql.catalyst.FunctionIdentifier name)  ;
  public  void registerFunction (org.apache.spark.sql.catalyst.FunctionIdentifier name, org.apache.spark.sql.catalyst.expressions.ExpressionInfo info, scala.Function1<scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression>, T> builder)  ;
}
