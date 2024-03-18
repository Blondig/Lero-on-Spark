package org.apache.spark.sql.catalyst.expressions.aggregate;
public  class Average extends org.apache.spark.sql.catalyst.expressions.aggregate.AverageBase implements org.apache.spark.sql.catalyst.expressions.SupportQueryContext, scala.Product, scala.Serializable {
  static public abstract  R apply (T1 v1, T2 v2)  ;
  static public  java.lang.String toString ()  { throw new RuntimeException(); }
  protected  java.lang.String queryContext ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.expressions.Expression child ()  { throw new RuntimeException(); }
  public  boolean useAnsiAdd ()  { throw new RuntimeException(); }
  // not preceding
  public   Average (org.apache.spark.sql.catalyst.expressions.Expression child, boolean useAnsiAdd)  { throw new RuntimeException(); }
  public   Average (org.apache.spark.sql.catalyst.expressions.Expression child)  { throw new RuntimeException(); }
  protected  org.apache.spark.sql.catalyst.expressions.aggregate.Average withNewChildInternal (org.apache.spark.sql.catalyst.expressions.Expression newChild)  { throw new RuntimeException(); }
  // not preceding
  public  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> updateExpressions ()  { throw new RuntimeException(); }
  // not preceding
  public  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> mergeExpressions ()  { throw new RuntimeException(); }
  // not preceding
  public  org.apache.spark.sql.catalyst.expressions.Expression evaluateExpression ()  { throw new RuntimeException(); }
  public  java.lang.String initQueryContext ()  { throw new RuntimeException(); }
}
