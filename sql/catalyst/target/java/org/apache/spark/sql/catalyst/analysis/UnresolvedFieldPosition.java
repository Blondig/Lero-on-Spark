package org.apache.spark.sql.catalyst.analysis;
public  class UnresolvedFieldPosition extends org.apache.spark.sql.catalyst.expressions.LeafExpression implements org.apache.spark.sql.catalyst.analysis.FieldPosition, scala.Product, scala.Serializable {
  static public abstract  R apply (T1 v1)  ;
  static public  java.lang.String toString ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.connector.catalog.TableChange.ColumnPosition position ()  { throw new RuntimeException(); }
  // not preceding
  public   UnresolvedFieldPosition (org.apache.spark.sql.connector.catalog.TableChange.ColumnPosition position)  { throw new RuntimeException(); }
  // not preceding
  public  boolean resolved ()  { throw new RuntimeException(); }
}
