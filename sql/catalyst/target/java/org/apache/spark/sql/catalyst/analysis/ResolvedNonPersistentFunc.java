package org.apache.spark.sql.catalyst.analysis;
/**
 * A plan containing resolved non-persistent (temp or built-in) function.
 */
public  class ResolvedNonPersistentFunc extends org.apache.spark.sql.catalyst.plans.logical.LogicalPlan implements org.apache.spark.sql.catalyst.analysis.LeafNodeWithoutStats, scala.Product, scala.Serializable {
  static public abstract  R apply (T1 v1, T2 v2)  ;
  static public  java.lang.String toString ()  { throw new RuntimeException(); }
  public  java.lang.String name ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.connector.catalog.functions.UnboundFunction func ()  { throw new RuntimeException(); }
  // not preceding
  public   ResolvedNonPersistentFunc (java.lang.String name, org.apache.spark.sql.connector.catalog.functions.UnboundFunction func)  { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Attribute> output ()  { throw new RuntimeException(); }
}
