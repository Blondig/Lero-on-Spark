package org.apache.spark.sql.catalyst.expressions;
public  class TimestampDiff extends org.apache.spark.sql.catalyst.expressions.BinaryExpression implements org.apache.spark.sql.catalyst.expressions.ImplicitCastInputTypes, org.apache.spark.sql.catalyst.expressions.NullIntolerant, org.apache.spark.sql.catalyst.expressions.TimeZoneAwareExpression, scala.Product, scala.Serializable {
  static public abstract  R apply (T1 v1, T2 v2, T3 v3, T4 v4)  ;
  static public  java.lang.String toString ()  { throw new RuntimeException(); }
  public  boolean resolved ()  { throw new RuntimeException(); }
  public final  scala.collection.Seq<scala.Enumeration.Value> nodePatterns ()  { throw new RuntimeException(); }
  public  java.time.ZoneId zoneId ()  { throw new RuntimeException(); }
  public  java.lang.String unit ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.expressions.Expression startTimestamp ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.expressions.Expression endTimestamp ()  { throw new RuntimeException(); }
  public  scala.Option<java.lang.String> timeZoneId ()  { throw new RuntimeException(); }
  // not preceding
  public   TimestampDiff (java.lang.String unit, org.apache.spark.sql.catalyst.expressions.Expression startTimestamp, org.apache.spark.sql.catalyst.expressions.Expression endTimestamp, scala.Option<java.lang.String> timeZoneId)  { throw new RuntimeException(); }
  public   TimestampDiff (java.lang.String unit, org.apache.spark.sql.catalyst.expressions.Expression quantity, org.apache.spark.sql.catalyst.expressions.Expression timestamp)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.expressions.Expression left ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.expressions.Expression right ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.sql.types.AbstractDataType> inputTypes ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.types.DataType dataType ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.expressions.TimeZoneAwareExpression withTimeZone (java.lang.String timeZoneId)  { throw new RuntimeException(); }
  public  Object nullSafeEval (Object startMicros, Object endMicros)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.expressions.codegen.ExprCode doGenCode (org.apache.spark.sql.catalyst.expressions.codegen.CodegenContext ctx, org.apache.spark.sql.catalyst.expressions.codegen.ExprCode ev)  { throw new RuntimeException(); }
  public  java.lang.String prettyName ()  { throw new RuntimeException(); }
  public  java.lang.String sql ()  { throw new RuntimeException(); }
  protected  org.apache.spark.sql.catalyst.expressions.TimestampDiff withNewChildrenInternal (org.apache.spark.sql.catalyst.expressions.Expression newLeft, org.apache.spark.sql.catalyst.expressions.Expression newRight)  { throw new RuntimeException(); }
}
