package org.apache.spark.sql.catalyst.plans.logical;
/**
 * The logical plan of the CACHE TABLE command.
 */
public  class CacheTable extends org.apache.spark.sql.catalyst.plans.logical.LogicalPlan implements org.apache.spark.sql.catalyst.plans.logical.AnalysisOnlyCommand, scala.Product, scala.Serializable {
  static public abstract  R apply (T1 v1, T2 v2, T3 v3, T4 v4, T5 v5)  ;
  static public  java.lang.String toString ()  { throw new RuntimeException(); }
  public final  scala.collection.Seq<scala.Enumeration.Value> nodePatterns ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan table ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<java.lang.String> multipartIdentifier ()  { throw new RuntimeException(); }
  public  boolean isLazy ()  { throw new RuntimeException(); }
  public  scala.collection.immutable.Map<java.lang.String, java.lang.String> options ()  { throw new RuntimeException(); }
  public  boolean isAnalyzed ()  { throw new RuntimeException(); }
  // not preceding
  public   CacheTable (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan table, scala.collection.Seq<java.lang.String> multipartIdentifier, boolean isLazy, scala.collection.immutable.Map<java.lang.String, java.lang.String> options, boolean isAnalyzed)  { throw new RuntimeException(); }
  protected  org.apache.spark.sql.catalyst.plans.logical.CacheTable withNewChildrenInternal (scala.collection.IndexedSeq<org.apache.spark.sql.catalyst.plans.logical.LogicalPlan> newChildren)  { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.sql.catalyst.plans.logical.LogicalPlan> childrenToAnalyze ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan markAsAnalyzed (org.apache.spark.sql.catalyst.analysis.AnalysisContext ac)  { throw new RuntimeException(); }
}
