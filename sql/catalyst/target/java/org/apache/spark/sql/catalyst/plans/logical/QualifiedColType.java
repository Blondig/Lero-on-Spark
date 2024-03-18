package org.apache.spark.sql.catalyst.plans.logical;
/**
 * Column data as parsed by ALTER TABLE ... (ADD|REPLACE) COLUMNS.
 */
public  class QualifiedColType implements scala.Product, scala.Serializable {
  static public abstract  R apply (T1 v1, T2 v2, T3 v3, T4 v4, T5 v5, T6 v6)  ;
  static public  java.lang.String toString ()  { throw new RuntimeException(); }
  public  scala.Option<org.apache.spark.sql.catalyst.analysis.FieldName> path ()  { throw new RuntimeException(); }
  public  java.lang.String colName ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.types.DataType dataType ()  { throw new RuntimeException(); }
  public  boolean nullable ()  { throw new RuntimeException(); }
  public  scala.Option<java.lang.String> comment ()  { throw new RuntimeException(); }
  public  scala.Option<org.apache.spark.sql.catalyst.analysis.FieldPosition> position ()  { throw new RuntimeException(); }
  // not preceding
  public   QualifiedColType (scala.Option<org.apache.spark.sql.catalyst.analysis.FieldName> path, java.lang.String colName, org.apache.spark.sql.types.DataType dataType, boolean nullable, scala.Option<java.lang.String> comment, scala.Option<org.apache.spark.sql.catalyst.analysis.FieldPosition> position)  { throw new RuntimeException(); }
  public  scala.collection.Seq<java.lang.String> name ()  { throw new RuntimeException(); }
  public  boolean resolved ()  { throw new RuntimeException(); }
}
