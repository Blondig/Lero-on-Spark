package org.apache.spark.sql.catalyst.expressions;
/**
 * Parses a column to a timestamp based on the supplied format.
 */
public  class ParseToTimestamp extends org.apache.spark.sql.catalyst.expressions.Expression implements org.apache.spark.sql.catalyst.expressions.RuntimeReplaceable, org.apache.spark.sql.catalyst.expressions.ImplicitCastInputTypes, org.apache.spark.sql.catalyst.expressions.TimeZoneAwareExpression, scala.Product, scala.Serializable {
  static public abstract  R apply (T1 v1, T2 v2, T3 v3, T4 v4)  ;
  static public  java.lang.String toString ()  { throw new RuntimeException(); }
  public  boolean resolved ()  { throw new RuntimeException(); }
  public final  scala.collection.Seq<scala.Enumeration.Value> nodePatterns ()  { throw new RuntimeException(); }
  public  java.time.ZoneId zoneId ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.expressions.Expression preCanonicalized ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.expressions.Expression left ()  { throw new RuntimeException(); }
  public  scala.Option<org.apache.spark.sql.catalyst.expressions.Expression> format ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.types.DataType dataType ()  { throw new RuntimeException(); }
  public  scala.Option<java.lang.String> timeZoneId ()  { throw new RuntimeException(); }
  // not preceding
  public   ParseToTimestamp (org.apache.spark.sql.catalyst.expressions.Expression left, scala.Option<org.apache.spark.sql.catalyst.expressions.Expression> format, org.apache.spark.sql.types.DataType dataType, scala.Option<java.lang.String> timeZoneId)  { throw new RuntimeException(); }
  // not preceding
  public  org.apache.spark.sql.catalyst.expressions.Expression replacement ()  { throw new RuntimeException(); }
  public   ParseToTimestamp (org.apache.spark.sql.catalyst.expressions.Expression left, org.apache.spark.sql.catalyst.expressions.Expression format)  { throw new RuntimeException(); }
  public   ParseToTimestamp (org.apache.spark.sql.catalyst.expressions.Expression left)  { throw new RuntimeException(); }
  public  java.lang.String nodeName ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<scala.Enumeration.Value> nodePatternsInternal ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.expressions.TimeZoneAwareExpression withTimeZone (java.lang.String timeZoneId)  { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> children ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.sql.types.AbstractDataType> inputTypes ()  { throw new RuntimeException(); }
  protected  org.apache.spark.sql.catalyst.expressions.Expression withNewChildrenInternal (scala.collection.IndexedSeq<org.apache.spark.sql.catalyst.expressions.Expression> newChildren)  { throw new RuntimeException(); }
}
