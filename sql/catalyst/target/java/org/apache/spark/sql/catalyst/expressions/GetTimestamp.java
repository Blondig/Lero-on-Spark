package org.apache.spark.sql.catalyst.expressions;
/**
 * Gets a timestamp from a string or a date.
 */
public  class GetTimestamp extends org.apache.spark.sql.catalyst.expressions.ToTimestamp implements scala.Product, scala.Serializable {
  static public abstract  R apply (T1 v1, T2 v2, T3 v3, T4 v4, T5 v5)  ;
  static public  java.lang.String toString ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.expressions.Expression left ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.expressions.Expression right ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.types.DataType dataType ()  { throw new RuntimeException(); }
  public  scala.Option<java.lang.String> timeZoneId ()  { throw new RuntimeException(); }
  public  boolean failOnError ()  { throw new RuntimeException(); }
  // not preceding
  public   GetTimestamp (org.apache.spark.sql.catalyst.expressions.Expression left, org.apache.spark.sql.catalyst.expressions.Expression right, org.apache.spark.sql.types.DataType dataType, scala.Option<java.lang.String> timeZoneId, boolean failOnError)  { throw new RuntimeException(); }
  public  boolean forTimestampNTZ ()  { throw new RuntimeException(); }
  protected  long downScaleFactor ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.expressions.TimeZoneAwareExpression withTimeZone (java.lang.String timeZoneId)  { throw new RuntimeException(); }
  protected  org.apache.spark.sql.catalyst.expressions.Expression withNewChildrenInternal (org.apache.spark.sql.catalyst.expressions.Expression newLeft, org.apache.spark.sql.catalyst.expressions.Expression newRight)  { throw new RuntimeException(); }
}
