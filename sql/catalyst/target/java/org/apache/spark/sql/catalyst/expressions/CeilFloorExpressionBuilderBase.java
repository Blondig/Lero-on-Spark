package org.apache.spark.sql.catalyst.expressions;
public  interface CeilFloorExpressionBuilderBase extends org.apache.spark.sql.catalyst.analysis.ExpressionBuilder {
  public  org.apache.spark.sql.catalyst.expressions.Expression build (java.lang.String funcName, scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> expressions)  ;
  public  org.apache.spark.sql.catalyst.expressions.Expression buildWithOneParam (org.apache.spark.sql.catalyst.expressions.Expression param)  ;
  public  org.apache.spark.sql.catalyst.expressions.Expression buildWithTwoParams (org.apache.spark.sql.catalyst.expressions.Expression param1, org.apache.spark.sql.catalyst.expressions.Expression param2)  ;
}
