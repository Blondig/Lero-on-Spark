package org.apache.spark.sql.catalyst.analysis;
public  class SimpleTableFunctionRegistry implements org.apache.spark.sql.catalyst.analysis.SimpleFunctionRegistryBase<org.apache.spark.sql.catalyst.plans.logical.LogicalPlan>, org.apache.spark.sql.catalyst.analysis.TableFunctionRegistry {
  public   SimpleTableFunctionRegistry ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.analysis.SimpleTableFunctionRegistry clone ()  { throw new RuntimeException(); }
  protected  scala.collection.mutable.HashMap<org.apache.spark.sql.catalyst.FunctionIdentifier, scala.Tuple2<org.apache.spark.sql.catalyst.expressions.ExpressionInfo, scala.Function1<scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression>, org.apache.spark.sql.catalyst.plans.logical.LogicalPlan>>> functionBuilders ()  { throw new RuntimeException(); }
}
