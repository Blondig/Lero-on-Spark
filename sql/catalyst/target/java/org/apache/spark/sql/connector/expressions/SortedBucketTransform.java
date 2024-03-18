package org.apache.spark.sql.connector.expressions;
 final class SortedBucketTransform implements org.apache.spark.sql.connector.expressions.RewritableTransform, scala.Product, scala.Serializable {
  static public abstract  R apply (T1 v1, T2 v2, T3 v3)  ;
  public  org.apache.spark.sql.connector.expressions.Literal<java.lang.Object> numBuckets ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.sql.connector.expressions.NamedReference> columns ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.sql.connector.expressions.NamedReference> sortedColumns ()  { throw new RuntimeException(); }
  // not preceding
  public   SortedBucketTransform (org.apache.spark.sql.connector.expressions.Literal<java.lang.Object> numBuckets, scala.collection.Seq<org.apache.spark.sql.connector.expressions.NamedReference> columns, scala.collection.Seq<org.apache.spark.sql.connector.expressions.NamedReference> sortedColumns)  { throw new RuntimeException(); }
  public  java.lang.String name ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.connector.expressions.NamedReference[] references ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.connector.expressions.Expression[] arguments ()  { throw new RuntimeException(); }
  public  java.lang.String toString ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.connector.expressions.Transform withReferences (scala.collection.Seq<org.apache.spark.sql.connector.expressions.NamedReference> newReferences)  { throw new RuntimeException(); }
}
