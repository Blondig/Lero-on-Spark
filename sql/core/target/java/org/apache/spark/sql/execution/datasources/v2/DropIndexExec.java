package org.apache.spark.sql.execution.datasources.v2;
/**
 * Physical plan node for dropping an index.
 */
public  class DropIndexExec extends org.apache.spark.sql.execution.datasources.v2.V2CommandExec implements org.apache.spark.sql.execution.datasources.v2.LeafV2CommandExec, scala.Product, scala.Serializable {
  static public abstract  R apply (T1 v1, T2 v2, T3 v3)  ;
  static public  java.lang.String toString ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.connector.catalog.index.SupportsIndex table ()  { throw new RuntimeException(); }
  public  java.lang.String indexName ()  { throw new RuntimeException(); }
  public  boolean ignoreIfNotExists ()  { throw new RuntimeException(); }
  // not preceding
  public   DropIndexExec (org.apache.spark.sql.connector.catalog.index.SupportsIndex table, java.lang.String indexName, boolean ignoreIfNotExists)  { throw new RuntimeException(); }
  protected  scala.collection.Seq<org.apache.spark.sql.catalyst.InternalRow> run ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Attribute> output ()  { throw new RuntimeException(); }
}
