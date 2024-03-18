package org.apache.spark.sql.catalyst.plans.logical;
/**
 * A logical node that can be used for a command that requires its children to be only analyzed,
 * but not optimized.
 */
public  interface AnalysisOnlyCommand extends org.apache.spark.sql.catalyst.plans.logical.Command {
  public  scala.collection.Seq<org.apache.spark.sql.catalyst.plans.logical.LogicalPlan> children ()  ;
  public  scala.collection.Seq<org.apache.spark.sql.catalyst.plans.logical.LogicalPlan> childrenToAnalyze ()  ;
  public  scala.collection.Seq<org.apache.spark.sql.catalyst.plans.QueryPlan<?>> innerChildren ()  ;
  public  boolean isAnalyzed ()  ;
  public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan markAsAnalyzed (org.apache.spark.sql.catalyst.analysis.AnalysisContext analysisContext)  ;
}
