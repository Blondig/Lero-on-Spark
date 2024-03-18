package org.apache.spark.sql.catalyst.analysis;
public  interface ExpressionBuilder {
  public  org.apache.spark.sql.catalyst.expressions.Expression build (java.lang.String funcName, scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> expressions)  ;
}
