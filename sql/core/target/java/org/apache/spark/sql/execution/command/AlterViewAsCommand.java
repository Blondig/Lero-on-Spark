package org.apache.spark.sql.execution.command;
/**
 * Alter a view with given query plan. If the view name contains database prefix, this command will
 * alter a permanent view matching the given name, or throw an exception if view not exist. Else,
 * this command will try to alter a temporary view first, if view not exist, try permanent view
 * next, if still not exist, throw an exception.
 * <p>
 * param:  name the name of this view.
 * param:  originalText the original SQL text of this view. Note that we can only alter a view by
 *                     SQL API, which means we always have originalText.
 * param:  query the logical plan that represents the view; this is used to generate the new view
 *              schema.
 */
public  class AlterViewAsCommand extends org.apache.spark.sql.catalyst.plans.logical.LogicalPlan implements org.apache.spark.sql.execution.command.RunnableCommand, org.apache.spark.sql.catalyst.plans.logical.AnalysisOnlyCommand, scala.Product, scala.Serializable {
  static public abstract  R apply (T1 v1, T2 v2, T3 v3, T4 v4, T5 v5)  ;
  static public  java.lang.String toString ()  { throw new RuntimeException(); }
  public  scala.collection.immutable.Map<java.lang.String, org.apache.spark.sql.execution.metric.SQLMetric> metrics ()  { throw new RuntimeException(); }
  public final  scala.collection.Seq<scala.Enumeration.Value> nodePatterns ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.TableIdentifier name ()  { throw new RuntimeException(); }
  public  java.lang.String originalText ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan query ()  { throw new RuntimeException(); }
  public  boolean isAnalyzed ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<java.lang.String> referredTempFunctions ()  { throw new RuntimeException(); }
  // not preceding
  public   AlterViewAsCommand (org.apache.spark.sql.catalyst.TableIdentifier name, java.lang.String originalText, org.apache.spark.sql.catalyst.plans.logical.LogicalPlan query, boolean isAnalyzed, scala.collection.Seq<java.lang.String> referredTempFunctions)  { throw new RuntimeException(); }
  protected  org.apache.spark.sql.execution.command.AlterViewAsCommand withNewChildrenInternal (scala.collection.IndexedSeq<org.apache.spark.sql.catalyst.plans.logical.LogicalPlan> newChildren)  { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.sql.catalyst.plans.logical.LogicalPlan> childrenToAnalyze ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan markAsAnalyzed (org.apache.spark.sql.catalyst.analysis.AnalysisContext analysisContext)  { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.sql.Row> run (org.apache.spark.sql.SparkSession session)  { throw new RuntimeException(); }
}
