package org.apache.spark.sql.catalyst.expressions;
/**
 * The trait used to represent special boundaries used in a window frame.
 */
public  interface SpecialFrameBoundary extends org.apache.spark.sql.catalyst.expressions.Unevaluable {
  public  org.apache.spark.sql.types.DataType dataType ()  ;
  public  boolean nullable ()  ;
}
