package org.apache.spark.sql.catalyst.analysis;
public  class EmptyTableFunctionRegistry {
  static public  org.apache.spark.sql.catalyst.analysis.TableFunctionRegistry clone ()  { throw new RuntimeException(); }
  static public final  void registerFunction (org.apache.spark.sql.catalyst.FunctionIdentifier name, scala.Function1<scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression>, T> builder, java.lang.String source)  { throw new RuntimeException(); }
  static public final  void createOrReplaceTempFunction (java.lang.String name, scala.Function1<scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression>, T> builder, java.lang.String source)  { throw new RuntimeException(); }
  static public  boolean functionExists (org.apache.spark.sql.catalyst.FunctionIdentifier name)  { throw new RuntimeException(); }
  static public  void registerFunction (org.apache.spark.sql.catalyst.FunctionIdentifier name, org.apache.spark.sql.catalyst.expressions.ExpressionInfo info, scala.Function1<scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression>, T> builder)  { throw new RuntimeException(); }
  static public  T lookupFunction (org.apache.spark.sql.catalyst.FunctionIdentifier name, scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> children)  { throw new RuntimeException(); }
  static public  scala.collection.Seq<org.apache.spark.sql.catalyst.FunctionIdentifier> listFunction ()  { throw new RuntimeException(); }
  static public  scala.Option<org.apache.spark.sql.catalyst.expressions.ExpressionInfo> lookupFunction (org.apache.spark.sql.catalyst.FunctionIdentifier name)  { throw new RuntimeException(); }
  static public  scala.Option<scala.Function1<scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression>, T>> lookupFunctionBuilder (org.apache.spark.sql.catalyst.FunctionIdentifier name)  { throw new RuntimeException(); }
  static public  boolean dropFunction (org.apache.spark.sql.catalyst.FunctionIdentifier name)  { throw new RuntimeException(); }
  static public  void clear ()  { throw new RuntimeException(); }
}
