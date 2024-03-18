package org.apache.spark.sql.catalyst.analysis;
public  class SimpleFunctionRegistry implements org.apache.spark.sql.catalyst.analysis.SimpleFunctionRegistryBase<org.apache.spark.sql.catalyst.expressions.Expression>, org.apache.spark.sql.catalyst.analysis.FunctionRegistry {
  public   SimpleFunctionRegistry ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.analysis.SimpleFunctionRegistry clone ()  { throw new RuntimeException(); }
  protected  scala.collection.mutable.HashMap<org.apache.spark.sql.catalyst.FunctionIdentifier, scala.Tuple2<org.apache.spark.sql.catalyst.expressions.ExpressionInfo, scala.Function1<scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression>, org.apache.spark.sql.catalyst.expressions.Expression>>> functionBuilders ()  { throw new RuntimeException(); }
}
