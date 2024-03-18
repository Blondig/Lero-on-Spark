package org.apache.spark.sql.catalyst.expressions;
public  interface PadExpressionBuilderBase extends org.apache.spark.sql.catalyst.analysis.ExpressionBuilder {
  public  org.apache.spark.sql.catalyst.expressions.Expression build (java.lang.String funcName, scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> expressions)  ;
  public  org.apache.spark.sql.catalyst.expressions.Expression createStringPad (org.apache.spark.sql.catalyst.expressions.Expression str, org.apache.spark.sql.catalyst.expressions.Expression len, org.apache.spark.sql.catalyst.expressions.Expression pad)  ;
}
