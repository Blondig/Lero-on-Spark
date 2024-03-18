package org.apache.spark.sql.catalyst.expressions;
public abstract class CastBase extends org.apache.spark.sql.catalyst.expressions.UnaryExpression implements org.apache.spark.sql.catalyst.expressions.TimeZoneAwareExpression, org.apache.spark.sql.catalyst.expressions.NullIntolerant, org.apache.spark.sql.catalyst.expressions.SupportQueryContext {
  public   CastBase ()  { throw new RuntimeException(); }
  protected abstract  boolean ansiEnabled ()  ;
  protected <T extends java.lang.Object> Object buildCast (Object a, scala.Function1<T, java.lang.Object> func)  { throw new RuntimeException(); }
  public abstract  boolean canCast (org.apache.spark.sql.types.DataType from, org.apache.spark.sql.types.DataType to)  ;
  protected  scala.Function1<java.lang.Object, java.lang.Object> cast (org.apache.spark.sql.types.DataType from, org.apache.spark.sql.types.DataType to)  { throw new RuntimeException(); }
  protected  scala.Function1<java.lang.Object, java.lang.Object> cast ()  { throw new RuntimeException(); }
  protected  org.apache.spark.sql.catalyst.expressions.codegen.Block castCode (org.apache.spark.sql.catalyst.expressions.codegen.CodegenContext ctx, org.apache.spark.sql.catalyst.expressions.codegen.ExprValue input, org.apache.spark.sql.catalyst.expressions.codegen.ExprValue inputIsNull, org.apache.spark.sql.catalyst.expressions.codegen.ExprValue result, org.apache.spark.sql.catalyst.expressions.codegen.ExprValue resultIsNull, org.apache.spark.sql.types.DataType resultType, scala.Function3<org.apache.spark.sql.catalyst.expressions.codegen.ExprValue, org.apache.spark.sql.catalyst.expressions.codegen.ExprValue, org.apache.spark.sql.catalyst.expressions.codegen.ExprValue, org.apache.spark.sql.catalyst.expressions.codegen.Block> cast)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.analysis.TypeCheckResult checkInputDataTypes ()  { throw new RuntimeException(); }
  public abstract  org.apache.spark.sql.catalyst.expressions.Expression child ()  ;
  public abstract  org.apache.spark.sql.types.DataType dataType ()  ;
  protected  java.lang.String dateTimeUtilsCls ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.expressions.codegen.ExprCode doGenCode (org.apache.spark.sql.catalyst.expressions.codegen.CodegenContext ctx, org.apache.spark.sql.catalyst.expressions.codegen.ExprCode ev)  { throw new RuntimeException(); }
  public  java.lang.String errorContextCode (org.apache.spark.sql.catalyst.expressions.codegen.CodegenContext codegenContext)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.expressions.codegen.ExprCode genCode (org.apache.spark.sql.catalyst.expressions.codegen.CodegenContext ctx)  { throw new RuntimeException(); }
  public  java.lang.String initQueryContext ()  { throw new RuntimeException(); }
  public  boolean needsTimeZone ()  { throw new RuntimeException(); }
  public final  scala.collection.Seq<scala.Enumeration.Value> nodePatterns ()  { throw new RuntimeException(); }
  protected  Object nullSafeEval (Object input)  { throw new RuntimeException(); }
  public  boolean nullable ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.expressions.Expression preCanonicalized ()  { throw new RuntimeException(); }
  protected  java.lang.String queryContext ()  { throw new RuntimeException(); }
  public  boolean resolved ()  { throw new RuntimeException(); }
  public  java.lang.String sql ()  { throw new RuntimeException(); }
  public  java.lang.String toString ()  { throw new RuntimeException(); }
  public abstract  java.lang.String typeCheckFailureMessage ()  ;
  public  java.time.ZoneId zoneId ()  { throw new RuntimeException(); }
}
