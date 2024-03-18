package org.apache.spark.sql.catalyst.analysis;
public  interface FieldName extends org.apache.spark.sql.catalyst.expressions.Unevaluable {
  public  org.apache.spark.sql.types.DataType dataType ()  ;
  public  scala.collection.Seq<java.lang.String> name ()  ;
  public  boolean nullable ()  ;
}
