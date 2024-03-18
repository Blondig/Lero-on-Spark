package org.apache.spark.sql.catalyst.analysis;
/**
 * A trivial catalog that returns an error when a function is requested. Used for testing when all
 * functions are already filled in and the analyzer needs only to resolve attribute references.
 */
public  interface EmptyFunctionRegistryBase<T extends java.lang.Object> extends org.apache.spark.sql.catalyst.analysis.FunctionRegistryBase<T> {
  public  void clear ()  ;
  public  boolean dropFunction (org.apache.spark.sql.catalyst.FunctionIdentifier name)  ;
  public  scala.collection.Seq<org.apache.spark.sql.catalyst.FunctionIdentifier> listFunction ()  ;
  public  T lookupFunction (org.apache.spark.sql.catalyst.FunctionIdentifier name, scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> children)  ;
  public  scala.Option<org.apache.spark.sql.catalyst.expressions.ExpressionInfo> lookupFunction (org.apache.spark.sql.catalyst.FunctionIdentifier name)  ;
  public  scala.Option<scala.Function1<scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression>, T>> lookupFunctionBuilder (org.apache.spark.sql.catalyst.FunctionIdentifier name)  ;
  public  void registerFunction (org.apache.spark.sql.catalyst.FunctionIdentifier name, org.apache.spark.sql.catalyst.expressions.ExpressionInfo info, scala.Function1<scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression>, T> builder)  ;
}
