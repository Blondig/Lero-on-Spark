package org.apache.spark.sql.internal.connector;
public  class V1Function implements org.apache.spark.sql.connector.catalog.functions.UnboundFunction, scala.Product, scala.Serializable {
  static public abstract  R apply (T1 v1)  ;
  static public  java.lang.String toString ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.expressions.ExpressionInfo info ()  { throw new RuntimeException(); }
  // not preceding
  public   V1Function (org.apache.spark.sql.catalyst.expressions.ExpressionInfo info)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.connector.catalog.functions.BoundFunction bind (org.apache.spark.sql.types.StructType inputType)  { throw new RuntimeException(); }
  public  java.lang.String name ()  { throw new RuntimeException(); }
  public  java.lang.String description ()  { throw new RuntimeException(); }
}
