package org.apache.spark.sql.catalyst.expressions;
/**
 * Splits a given string by a specified delimiter and return splits into a
 * GenericArrayData. This expression is different from <code>split</code> function as
 * <code>split</code> takes regex expression as the pattern to split strings while this
 * expression take delimiter (a string without carrying special meaning on its
 * characters, thus is not treated as regex) to split strings.
 */
public  class StringSplitSQL extends org.apache.spark.sql.catalyst.expressions.BinaryExpression implements org.apache.spark.sql.catalyst.expressions.NullIntolerant, scala.Product, scala.Serializable {
  static public abstract  R apply (T1 v1, T2 v2)  ;
  static public  java.lang.String toString ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.expressions.Expression str ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.expressions.Expression delimiter ()  { throw new RuntimeException(); }
  // not preceding
  public   StringSplitSQL (org.apache.spark.sql.catalyst.expressions.Expression str, org.apache.spark.sql.catalyst.expressions.Expression delimiter)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.types.DataType dataType ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.expressions.Expression left ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.expressions.Expression right ()  { throw new RuntimeException(); }
  public  Object nullSafeEval (Object string, Object delimiter)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.expressions.codegen.ExprCode doGenCode (org.apache.spark.sql.catalyst.expressions.codegen.CodegenContext ctx, org.apache.spark.sql.catalyst.expressions.codegen.ExprCode ev)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.expressions.StringSplitSQL withNewChildrenInternal (org.apache.spark.sql.catalyst.expressions.Expression newFirst, org.apache.spark.sql.catalyst.expressions.Expression newSecond)  { throw new RuntimeException(); }
}
