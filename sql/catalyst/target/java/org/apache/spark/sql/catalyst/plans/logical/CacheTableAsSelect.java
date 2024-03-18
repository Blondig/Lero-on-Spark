package org.apache.spark.sql.catalyst.plans.logical;
/**
 * The logical plan of the CACHE TABLE ... AS SELECT command.
 */
public  class CacheTableAsSelect extends org.apache.spark.sql.catalyst.plans.logical.LogicalPlan implements org.apache.spark.sql.catalyst.plans.logical.AnalysisOnlyCommand, scala.Product, scala.Serializable {
  static public abstract  R apply (T1 v1, T2 v2, T3 v3, T4 v4, T5 v5, T6 v6, T7 v7)  ;
  static public  java.lang.String toString ()  { throw new RuntimeException(); }
  public final  scala.collection.Seq<scala.Enumeration.Value> nodePatterns ()  { throw new RuntimeException(); }
  public  java.lang.String tempViewName ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan ()  { throw new RuntimeException(); }
  public  java.lang.String originalText ()  { throw new RuntimeException(); }
  public  boolean isLazy ()  { throw new RuntimeException(); }
  public  scala.collection.immutable.Map<java.lang.String, java.lang.String> options ()  { throw new RuntimeException(); }
  public  boolean isAnalyzed ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<java.lang.String> referredTempFunctions ()  { throw new RuntimeException(); }
  // not preceding
  public   CacheTableAsSelect (java.lang.String tempViewName, org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan, java.lang.String originalText, boolean isLazy, scala.collection.immutable.Map<java.lang.String, java.lang.String> options, boolean isAnalyzed, scala.collection.Seq<java.lang.String> referredTempFunctions)  { throw new RuntimeException(); }
  protected  org.apache.spark.sql.catalyst.plans.logical.CacheTableAsSelect withNewChildrenInternal (scala.collection.IndexedSeq<org.apache.spark.sql.catalyst.plans.logical.LogicalPlan> newChildren)  { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.sql.catalyst.plans.logical.LogicalPlan> childrenToAnalyze ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan markAsAnalyzed (org.apache.spark.sql.catalyst.analysis.AnalysisContext ac)  { throw new RuntimeException(); }
}
