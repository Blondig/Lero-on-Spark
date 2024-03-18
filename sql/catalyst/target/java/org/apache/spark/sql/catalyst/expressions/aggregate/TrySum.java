package org.apache.spark.sql.catalyst.expressions.aggregate;
public  class TrySum extends org.apache.spark.sql.catalyst.expressions.aggregate.SumBase implements scala.Product, scala.Serializable {
  static public abstract  R apply (T1 v1)  ;
  static public  java.lang.String toString ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.expressions.Expression child ()  { throw new RuntimeException(); }
  // not preceding
  public   TrySum (org.apache.spark.sql.catalyst.expressions.Expression child)  { throw new RuntimeException(); }
  public  boolean useAnsiAdd ()  { throw new RuntimeException(); }
  public  boolean shouldTrackIsEmpty ()  { throw new RuntimeException(); }
  // not preceding
  public  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> updateExpressions ()  { throw new RuntimeException(); }
  // not preceding
  public  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> mergeExpressions ()  { throw new RuntimeException(); }
  // not preceding
  public  org.apache.spark.sql.catalyst.expressions.Expression evaluateExpression ()  { throw new RuntimeException(); }
  protected  org.apache.spark.sql.catalyst.expressions.Expression withNewChildInternal (org.apache.spark.sql.catalyst.expressions.Expression newChild)  { throw new RuntimeException(); }
  public  java.lang.String prettyName ()  { throw new RuntimeException(); }
}
