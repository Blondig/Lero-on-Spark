package org.apache.spark.sql.catalyst.expressions;
/**
 * Expression for the v2 partition transform days.
 */
public  class Days extends org.apache.spark.sql.catalyst.expressions.PartitionTransformExpression implements scala.Product, scala.Serializable {
  static public abstract  R apply (T1 v1)  ;
  static public  java.lang.String toString ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.expressions.Expression child ()  { throw new RuntimeException(); }
  // not preceding
  public   Days (org.apache.spark.sql.catalyst.expressions.Expression child)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.types.DataType dataType ()  { throw new RuntimeException(); }
  protected  org.apache.spark.sql.catalyst.expressions.Days withNewChildInternal (org.apache.spark.sql.catalyst.expressions.Expression newChild)  { throw new RuntimeException(); }
}
