package org.apache.spark.sql.catalyst.analysis;
public  interface FieldPosition extends org.apache.spark.sql.catalyst.expressions.Unevaluable {
  public  org.apache.spark.sql.types.DataType dataType ()  ;
  public  boolean nullable ()  ;
  public  org.apache.spark.sql.connector.catalog.TableChange.ColumnPosition position ()  ;
}
