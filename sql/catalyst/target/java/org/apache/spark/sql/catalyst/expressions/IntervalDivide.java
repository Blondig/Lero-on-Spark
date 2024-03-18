package org.apache.spark.sql.catalyst.expressions;
public  interface IntervalDivide {
  public  void checkDivideOverflow (Object value, Object minValue, org.apache.spark.sql.catalyst.expressions.Expression num, Object numValue, java.lang.String context)  ;
  public  void divideByZeroCheck (org.apache.spark.sql.types.DataType dataType, Object num, java.lang.String context)  ;
  public  java.lang.String divideByZeroCheckCodegen (org.apache.spark.sql.types.DataType dataType, java.lang.String value, java.lang.String errorContextReference)  ;
}
