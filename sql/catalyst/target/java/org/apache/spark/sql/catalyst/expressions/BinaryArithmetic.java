package org.apache.spark.sql.catalyst.expressions;
public abstract class BinaryArithmetic extends org.apache.spark.sql.catalyst.expressions.BinaryOperator implements org.apache.spark.sql.catalyst.expressions.NullIntolerant, org.apache.spark.sql.catalyst.expressions.SupportQueryContext {
  static public  scala.Option<scala.Tuple2<org.apache.spark.sql.catalyst.expressions.Expression, org.apache.spark.sql.catalyst.expressions.Expression>> unapply (org.apache.spark.sql.catalyst.expressions.BinaryArithmetic e)  { throw new RuntimeException(); }
  protected  java.lang.String queryContext ()  { throw new RuntimeException(); }
  public   BinaryArithmetic ()  { throw new RuntimeException(); }
  protected abstract  boolean failOnError ()  ;
  public  org.apache.spark.sql.types.DataType dataType ()  { throw new RuntimeException(); }
  public final  scala.collection.Seq<scala.Enumeration.Value> nodePatterns ()  { throw new RuntimeException(); }
  // not preceding
  public  boolean resolved ()  { throw new RuntimeException(); }
  public  java.lang.String initQueryContext ()  { throw new RuntimeException(); }
  /** Name of the function for this expression on a {@link Decimal} type. */
  public  java.lang.String decimalMethod ()  { throw new RuntimeException(); }
  /** Name of the function for this expression on a {@link CalendarInterval} type. */
  public  java.lang.String calendarIntervalMethod ()  { throw new RuntimeException(); }
  public  scala.Option<java.lang.String> exactMathMethod ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.expressions.codegen.ExprCode doGenCode (org.apache.spark.sql.catalyst.expressions.codegen.CodegenContext ctx, org.apache.spark.sql.catalyst.expressions.codegen.ExprCode ev)  { throw new RuntimeException(); }
}
