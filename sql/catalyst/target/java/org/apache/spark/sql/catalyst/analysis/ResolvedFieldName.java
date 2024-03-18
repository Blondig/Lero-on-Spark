package org.apache.spark.sql.catalyst.analysis;
public  class ResolvedFieldName extends org.apache.spark.sql.catalyst.expressions.LeafExpression implements org.apache.spark.sql.catalyst.analysis.FieldName, scala.Product, scala.Serializable {
  static public abstract  R apply (T1 v1, T2 v2)  ;
  static public  java.lang.String toString ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<java.lang.String> path ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.types.StructField field ()  { throw new RuntimeException(); }
  // not preceding
  public   ResolvedFieldName (scala.collection.Seq<java.lang.String> path, org.apache.spark.sql.types.StructField field)  { throw new RuntimeException(); }
  public  scala.collection.Seq<java.lang.String> name ()  { throw new RuntimeException(); }
}
