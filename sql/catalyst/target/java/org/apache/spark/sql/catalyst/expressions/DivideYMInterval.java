package org.apache.spark.sql.catalyst.expressions;
public  class DivideYMInterval extends org.apache.spark.sql.catalyst.expressions.BinaryExpression implements org.apache.spark.sql.catalyst.expressions.ImplicitCastInputTypes, org.apache.spark.sql.catalyst.expressions.IntervalDivide, org.apache.spark.sql.catalyst.expressions.NullIntolerant, scala.Serializable, scala.Product {
  static public abstract  R apply (T1 v1, T2 v2)  ;
  public  org.apache.spark.sql.catalyst.expressions.Expression interval ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.expressions.Expression num ()  { throw new RuntimeException(); }
  // not preceding
  public   DivideYMInterval (org.apache.spark.sql.catalyst.expressions.Expression interval, org.apache.spark.sql.catalyst.expressions.Expression num)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.expressions.Expression left ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.expressions.Expression right ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.sql.types.AbstractDataType> inputTypes ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.types.DataType dataType ()  { throw new RuntimeException(); }
  public  Object nullSafeEval (Object interval, Object num)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.expressions.codegen.ExprCode doGenCode (org.apache.spark.sql.catalyst.expressions.codegen.CodegenContext ctx, org.apache.spark.sql.catalyst.expressions.codegen.ExprCode ev)  { throw new RuntimeException(); }
  public  java.lang.String toString ()  { throw new RuntimeException(); }
  public  java.lang.String sql ()  { throw new RuntimeException(); }
  protected  org.apache.spark.sql.catalyst.expressions.DivideYMInterval withNewChildrenInternal (org.apache.spark.sql.catalyst.expressions.Expression newLeft, org.apache.spark.sql.catalyst.expressions.Expression newRight)  { throw new RuntimeException(); }
}
