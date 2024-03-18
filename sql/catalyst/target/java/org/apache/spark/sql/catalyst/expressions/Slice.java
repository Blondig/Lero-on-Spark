package org.apache.spark.sql.catalyst.expressions;
/**
 * Slices an array according to the requested start index and length
 */
public  class Slice extends org.apache.spark.sql.catalyst.expressions.TernaryExpression implements org.apache.spark.sql.catalyst.expressions.ImplicitCastInputTypes, org.apache.spark.sql.catalyst.expressions.NullIntolerant, scala.Product, scala.Serializable {
  static public abstract  R apply (T1 v1, T2 v2, T3 v3)  ;
  static public  java.lang.String toString ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.expressions.Expression x ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.expressions.Expression start ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.expressions.Expression length ()  { throw new RuntimeException(); }
  // not preceding
  public   Slice (org.apache.spark.sql.catalyst.expressions.Expression x, org.apache.spark.sql.catalyst.expressions.Expression start, org.apache.spark.sql.catalyst.expressions.Expression length)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.types.DataType dataType ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.sql.types.AbstractDataType> inputTypes ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.expressions.Expression first ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.expressions.Expression second ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.expressions.Expression third ()  { throw new RuntimeException(); }
  public  Object nullSafeEval (Object xVal, Object startVal, Object lengthVal)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.expressions.codegen.ExprCode doGenCode (org.apache.spark.sql.catalyst.expressions.codegen.CodegenContext ctx, org.apache.spark.sql.catalyst.expressions.codegen.ExprCode ev)  { throw new RuntimeException(); }
  public  java.lang.String genCodeForResult (org.apache.spark.sql.catalyst.expressions.codegen.CodegenContext ctx, org.apache.spark.sql.catalyst.expressions.codegen.ExprCode ev, java.lang.String inputArray, java.lang.String startIdx, java.lang.String resLength)  { throw new RuntimeException(); }
  protected  org.apache.spark.sql.catalyst.expressions.Slice withNewChildrenInternal (org.apache.spark.sql.catalyst.expressions.Expression newFirst, org.apache.spark.sql.catalyst.expressions.Expression newSecond, org.apache.spark.sql.catalyst.expressions.Expression newThird)  { throw new RuntimeException(); }
}
