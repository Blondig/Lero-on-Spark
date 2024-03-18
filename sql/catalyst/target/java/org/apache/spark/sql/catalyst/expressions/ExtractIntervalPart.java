package org.apache.spark.sql.catalyst.expressions;
public abstract class ExtractIntervalPart<T extends java.lang.Object> extends org.apache.spark.sql.catalyst.expressions.UnaryExpression implements org.apache.spark.sql.catalyst.expressions.NullIntolerant, scala.Serializable {
  static public  org.apache.spark.sql.catalyst.expressions.Expression parseExtractField (java.lang.String extractField, org.apache.spark.sql.catalyst.expressions.Expression source)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.types.DataType dataType ()  { throw new RuntimeException(); }
  // not preceding
  public   ExtractIntervalPart (org.apache.spark.sql.types.DataType dataType, scala.Function1<T, java.lang.Object> func, java.lang.String funcName)  { throw new RuntimeException(); }
  protected  org.apache.spark.sql.catalyst.expressions.codegen.ExprCode doGenCode (org.apache.spark.sql.catalyst.expressions.codegen.CodegenContext ctx, org.apache.spark.sql.catalyst.expressions.codegen.ExprCode ev)  { throw new RuntimeException(); }
  protected  Object nullSafeEval (Object interval)  { throw new RuntimeException(); }
}
