package org.apache.spark.sql.catalyst.expressions;
public  class UnixMicros extends org.apache.spark.sql.catalyst.expressions.TimestampToLongBase implements scala.Product, scala.Serializable {
  static public abstract  R apply (T1 v1)  ;
  static public  java.lang.String toString ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.expressions.Expression child ()  { throw new RuntimeException(); }
  // not preceding
  public   UnixMicros (org.apache.spark.sql.catalyst.expressions.Expression child)  { throw new RuntimeException(); }
  public  long scaleFactor ()  { throw new RuntimeException(); }
  public  java.lang.String prettyName ()  { throw new RuntimeException(); }
  protected  org.apache.spark.sql.catalyst.expressions.UnixMicros withNewChildInternal (org.apache.spark.sql.catalyst.expressions.Expression newChild)  { throw new RuntimeException(); }
}
