package org.apache.spark.sql.catalyst.expressions;
/**
 * A special version of {@link AnsiCast}. It performs the same operation (i.e. converts a value of
 * one data type into another data type), but returns a NULL value instead of raising an error
 * when the conversion can not be performed.
 * <p>
 * When cast from/to timezone related types, we need timeZoneId, which will be resolved with
 * session local timezone by an analyzer {@link ResolveTimeZone}.
 */
public  class TryCast extends org.apache.spark.sql.catalyst.expressions.CastBase implements scala.Product, scala.Serializable {
  static public abstract  R apply (T1 v1, T2 v2, T3 v3)  ;
  // not preceding
  public  org.apache.spark.sql.catalyst.expressions.Expression child ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.types.DataType dataType ()  { throw new RuntimeException(); }
  public  scala.Option<java.lang.String> timeZoneId ()  { throw new RuntimeException(); }
  // not preceding
  public   TryCast (org.apache.spark.sql.catalyst.expressions.Expression child, org.apache.spark.sql.types.DataType dataType, scala.Option<java.lang.String> timeZoneId)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.expressions.TimeZoneAwareExpression withTimeZone (java.lang.String timeZoneId)  { throw new RuntimeException(); }
  protected  boolean ansiEnabled ()  { throw new RuntimeException(); }
  public  boolean nullable ()  { throw new RuntimeException(); }
  public  boolean canCast (org.apache.spark.sql.types.DataType from, org.apache.spark.sql.types.DataType to)  { throw new RuntimeException(); }
  public  scala.Function1<java.lang.Object, java.lang.Object> cast (org.apache.spark.sql.types.DataType from, org.apache.spark.sql.types.DataType to)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.expressions.codegen.Block castCode (org.apache.spark.sql.catalyst.expressions.codegen.CodegenContext ctx, org.apache.spark.sql.catalyst.expressions.codegen.ExprValue input, org.apache.spark.sql.catalyst.expressions.codegen.ExprValue inputIsNull, org.apache.spark.sql.catalyst.expressions.codegen.ExprValue result, org.apache.spark.sql.catalyst.expressions.codegen.ExprValue resultIsNull, org.apache.spark.sql.types.DataType resultType, scala.Function3<org.apache.spark.sql.catalyst.expressions.codegen.ExprValue, org.apache.spark.sql.catalyst.expressions.codegen.ExprValue, org.apache.spark.sql.catalyst.expressions.codegen.ExprValue, org.apache.spark.sql.catalyst.expressions.codegen.Block> cast)  { throw new RuntimeException(); }
  public  java.lang.String typeCheckFailureMessage ()  { throw new RuntimeException(); }
  protected  org.apache.spark.sql.catalyst.expressions.TryCast withNewChildInternal (org.apache.spark.sql.catalyst.expressions.Expression newChild)  { throw new RuntimeException(); }
  public  java.lang.String toString ()  { throw new RuntimeException(); }
  public  java.lang.String sql ()  { throw new RuntimeException(); }
}
