package org.apache.spark.sql.catalyst.expressions;
public  interface StringBinaryPredicateExpressionBuilderBase extends org.apache.spark.sql.catalyst.analysis.ExpressionBuilder {
  public  org.apache.spark.sql.catalyst.expressions.Expression build (java.lang.String funcName, scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> expressions)  ;
  public  org.apache.spark.sql.catalyst.expressions.Expression createStringPredicate (org.apache.spark.sql.catalyst.expressions.Expression left, org.apache.spark.sql.catalyst.expressions.Expression right)  ;
}
