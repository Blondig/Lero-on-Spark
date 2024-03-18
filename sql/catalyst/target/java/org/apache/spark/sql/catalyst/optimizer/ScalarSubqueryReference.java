package org.apache.spark.sql.catalyst.optimizer;
/**
 * Temporal reference to a subquery.
 */
public  class ScalarSubqueryReference extends org.apache.spark.sql.catalyst.expressions.LeafExpression implements org.apache.spark.sql.catalyst.expressions.Unevaluable, scala.Product, scala.Serializable {
  static public abstract  R apply (T1 v1, T2 v2, T3 v3, T4 v4)  ;
  static public  java.lang.String toString ()  { throw new RuntimeException(); }
  public  int subqueryIndex ()  { throw new RuntimeException(); }
  public  int headerIndex ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.types.DataType dataType ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.expressions.ExprId exprId ()  { throw new RuntimeException(); }
  // not preceding
  public   ScalarSubqueryReference (int subqueryIndex, int headerIndex, org.apache.spark.sql.types.DataType dataType, org.apache.spark.sql.catalyst.expressions.ExprId exprId)  { throw new RuntimeException(); }
  public  boolean nullable ()  { throw new RuntimeException(); }
  public final  scala.collection.Seq<scala.Enumeration.Value> nodePatterns ()  { throw new RuntimeException(); }
  public  scala.collection.Iterator<java.lang.Object> stringArgs ()  { throw new RuntimeException(); }
}
