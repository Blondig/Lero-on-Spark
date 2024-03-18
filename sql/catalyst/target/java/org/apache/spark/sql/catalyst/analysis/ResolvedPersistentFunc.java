package org.apache.spark.sql.catalyst.analysis;
/**
 * A plan containing resolved persistent function.
 */
public  class ResolvedPersistentFunc extends org.apache.spark.sql.catalyst.plans.logical.LogicalPlan implements org.apache.spark.sql.catalyst.analysis.LeafNodeWithoutStats, scala.Product, scala.Serializable {
  static public abstract  R apply (T1 v1, T2 v2, T3 v3)  ;
  static public  java.lang.String toString ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.connector.catalog.FunctionCatalog catalog ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.connector.catalog.Identifier identifier ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.connector.catalog.functions.UnboundFunction func ()  { throw new RuntimeException(); }
  // not preceding
  public   ResolvedPersistentFunc (org.apache.spark.sql.connector.catalog.FunctionCatalog catalog, org.apache.spark.sql.connector.catalog.Identifier identifier, org.apache.spark.sql.connector.catalog.functions.UnboundFunction func)  { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Attribute> output ()  { throw new RuntimeException(); }
}
