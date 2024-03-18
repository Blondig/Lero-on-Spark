package org.apache.spark.sql.catalyst.catalog;
public  interface FunctionExpressionBuilder {
  public  org.apache.spark.sql.catalyst.expressions.Expression makeExpression (java.lang.String name, java.lang.Class<?> clazz, scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> input)  ;
}
