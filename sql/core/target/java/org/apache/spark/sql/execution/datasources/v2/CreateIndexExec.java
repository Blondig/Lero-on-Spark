package org.apache.spark.sql.execution.datasources.v2;
/**
 * Physical plan node for creating an index.
 */
public  class CreateIndexExec extends org.apache.spark.sql.execution.datasources.v2.V2CommandExec implements org.apache.spark.sql.execution.datasources.v2.LeafV2CommandExec, scala.Product, scala.Serializable {
  static public abstract  R apply (T1 v1, T2 v2, T3 v3, T4 v4, T5 v5, T6 v6)  ;
  static public  java.lang.String toString ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.connector.catalog.index.SupportsIndex table ()  { throw new RuntimeException(); }
  public  java.lang.String indexName ()  { throw new RuntimeException(); }
  public  java.lang.String indexType ()  { throw new RuntimeException(); }
  public  boolean ignoreIfExists ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<scala.Tuple2<org.apache.spark.sql.connector.expressions.NamedReference, scala.collection.immutable.Map<java.lang.String, java.lang.String>>> columns ()  { throw new RuntimeException(); }
  public  scala.collection.immutable.Map<java.lang.String, java.lang.String> properties ()  { throw new RuntimeException(); }
  // not preceding
  public   CreateIndexExec (org.apache.spark.sql.connector.catalog.index.SupportsIndex table, java.lang.String indexName, java.lang.String indexType, boolean ignoreIfExists, scala.collection.Seq<scala.Tuple2<org.apache.spark.sql.connector.expressions.NamedReference, scala.collection.immutable.Map<java.lang.String, java.lang.String>>> columns, scala.collection.immutable.Map<java.lang.String, java.lang.String> properties)  { throw new RuntimeException(); }
  protected  scala.collection.Seq<org.apache.spark.sql.catalyst.InternalRow> run ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Attribute> output ()  { throw new RuntimeException(); }
}
