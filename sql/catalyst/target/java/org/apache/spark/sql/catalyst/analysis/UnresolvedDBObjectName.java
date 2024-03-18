package org.apache.spark.sql.catalyst.analysis;
/**
 * Holds the name of a database object (table, view, namespace, function, etc.) that is to be
 * created and we need to determine the catalog to store it. It will be resolved to
 * {@link ResolvedDBObjectName} during analysis.
 */
public  class UnresolvedDBObjectName extends org.apache.spark.sql.catalyst.plans.logical.LogicalPlan implements org.apache.spark.sql.catalyst.plans.logical.LeafNode, scala.Product, scala.Serializable {
  static public abstract  R apply (T1 v1, T2 v2)  ;
  static public  java.lang.String toString ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<java.lang.String> nameParts ()  { throw new RuntimeException(); }
  public  boolean isNamespace ()  { throw new RuntimeException(); }
  // not preceding
  public   UnresolvedDBObjectName (scala.collection.Seq<java.lang.String> nameParts, boolean isNamespace)  { throw new RuntimeException(); }
  // not preceding
  public  boolean resolved ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Attribute> output ()  { throw new RuntimeException(); }
}
