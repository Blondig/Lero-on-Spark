package org.apache.spark.sql.catalyst.expressions;
/**
 * Returns the current catalog.
 */
public  class CurrentCatalog extends org.apache.spark.sql.catalyst.expressions.LeafExpression implements org.apache.spark.sql.catalyst.expressions.Unevaluable, scala.Product, scala.Serializable {
  static public abstract  R apply ()  ;
  static public  java.lang.String toString ()  { throw new RuntimeException(); }
  public   CurrentCatalog ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.types.DataType dataType ()  { throw new RuntimeException(); }
  public  boolean nullable ()  { throw new RuntimeException(); }
  public  java.lang.String prettyName ()  { throw new RuntimeException(); }
  public final  scala.collection.Seq<scala.Enumeration.Value> nodePatterns ()  { throw new RuntimeException(); }
}
