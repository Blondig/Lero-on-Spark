package org.apache.spark.sql.catalyst.analysis;
public  class GetViewColumnByNameAndOrdinal extends org.apache.spark.sql.catalyst.expressions.LeafExpression implements org.apache.spark.sql.catalyst.expressions.Unevaluable, org.apache.spark.sql.catalyst.expressions.NonSQLExpression, scala.Product, scala.Serializable {
  static public abstract  R apply (T1 v1, T2 v2, T3 v3, T4 v4, T5 v5)  ;
  static public  java.lang.String toString ()  { throw new RuntimeException(); }
  public  java.lang.String viewName ()  { throw new RuntimeException(); }
  public  java.lang.String colName ()  { throw new RuntimeException(); }
  public  int ordinal ()  { throw new RuntimeException(); }
  public  int expectedNumCandidates ()  { throw new RuntimeException(); }
  public  scala.Option<java.lang.String> viewDDL ()  { throw new RuntimeException(); }
  // not preceding
  public   GetViewColumnByNameAndOrdinal (java.lang.String viewName, java.lang.String colName, int ordinal, int expectedNumCandidates, scala.Option<java.lang.String> viewDDL)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.types.DataType dataType ()  { throw new RuntimeException(); }
  public  boolean nullable ()  { throw new RuntimeException(); }
  // not preceding
  public  boolean resolved ()  { throw new RuntimeException(); }
  public  scala.collection.Iterator<java.lang.Object> stringArgs ()  { throw new RuntimeException(); }
}
