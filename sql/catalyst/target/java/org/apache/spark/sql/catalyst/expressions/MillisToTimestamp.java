package org.apache.spark.sql.catalyst.expressions;
public  class MillisToTimestamp extends org.apache.spark.sql.catalyst.expressions.IntegralToTimestampBase implements scala.Product, scala.Serializable {
  static public abstract  R apply (T1 v1)  ;
  static public  java.lang.String toString ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.expressions.Expression child ()  { throw new RuntimeException(); }
  // not preceding
  public   MillisToTimestamp (org.apache.spark.sql.catalyst.expressions.Expression child)  { throw new RuntimeException(); }
  public  long upScaleFactor ()  { throw new RuntimeException(); }
  public  java.lang.String prettyName ()  { throw new RuntimeException(); }
  protected  org.apache.spark.sql.catalyst.expressions.MillisToTimestamp withNewChildInternal (org.apache.spark.sql.catalyst.expressions.Expression newChild)  { throw new RuntimeException(); }
}
