package org.apache.spark.sql.catalyst.analysis;
/**
 * Holds the name of a function that has yet to be looked up. It will be resolved to
 * {@link ResolvedPersistentFunc} or {@link ResolvedNonPersistentFunc} during analysis.
 */
public  class UnresolvedFunc extends org.apache.spark.sql.catalyst.plans.logical.LogicalPlan implements org.apache.spark.sql.catalyst.plans.logical.LeafNode, scala.Product, scala.Serializable {
  static public abstract  R apply (T1 v1, T2 v2, T3 v3, T4 v4, T5 v5)  ;
  static public  java.lang.String toString ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<java.lang.String> multipartIdentifier ()  { throw new RuntimeException(); }
  public  java.lang.String commandName ()  { throw new RuntimeException(); }
  public  boolean requirePersistent ()  { throw new RuntimeException(); }
  public  scala.Option<java.lang.String> funcTypeMismatchHint ()  { throw new RuntimeException(); }
  public  scala.Option<scala.collection.Seq<java.lang.String>> possibleQualifiedName ()  { throw new RuntimeException(); }
  // not preceding
  public   UnresolvedFunc (scala.collection.Seq<java.lang.String> multipartIdentifier, java.lang.String commandName, boolean requirePersistent, scala.Option<java.lang.String> funcTypeMismatchHint, scala.Option<scala.collection.Seq<java.lang.String>> possibleQualifiedName)  { throw new RuntimeException(); }
  // not preceding
  public  boolean resolved ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Attribute> output ()  { throw new RuntimeException(); }
  public final  scala.collection.Seq<scala.Enumeration.Value> nodePatterns ()  { throw new RuntimeException(); }
}
