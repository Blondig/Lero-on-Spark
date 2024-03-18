package org.apache.spark.sql.catalyst.expressions.aggregate;
public  class RegrR2 extends org.apache.spark.sql.catalyst.expressions.aggregate.PearsonCorrelation implements scala.Product, scala.Serializable {
  static public abstract  R apply (T1 v1, T2 v2)  ;
  static public  java.lang.String toString ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.expressions.Expression x ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.expressions.Expression y ()  { throw new RuntimeException(); }
  // not preceding
  public   RegrR2 (org.apache.spark.sql.catalyst.expressions.Expression x, org.apache.spark.sql.catalyst.expressions.Expression y)  { throw new RuntimeException(); }
  public  java.lang.String prettyName ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.expressions.Expression evaluateExpression ()  { throw new RuntimeException(); }
  protected  org.apache.spark.sql.catalyst.expressions.aggregate.RegrR2 withNewChildrenInternal (org.apache.spark.sql.catalyst.expressions.Expression newLeft, org.apache.spark.sql.catalyst.expressions.Expression newRight)  { throw new RuntimeException(); }
}
