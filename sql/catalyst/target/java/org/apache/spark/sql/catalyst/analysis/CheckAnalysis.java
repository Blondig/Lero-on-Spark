package org.apache.spark.sql.catalyst.analysis;
/**
 * Throws user facing errors when passed invalid queries that fail to analyze.
 */
public  interface CheckAnalysis extends org.apache.spark.sql.catalyst.expressions.PredicateHelper, org.apache.spark.sql.connector.catalog.LookupCatalog {
  public  org.apache.spark.sql.catalyst.trees.TreeNodeTag<java.lang.Object> DATA_TYPE_MISMATCH_ERROR ()  ;
  public  org.apache.spark.sql.catalyst.trees.TreeNodeTag<java.lang.String> DATA_TYPE_MISMATCH_ERROR_MESSAGE ()  ;
  /**
   * Validates the options used for alter table commands after table and columns are resolved.
   * @param alter (undocumented)
   */
  public  void checkAlterTableCommand (org.apache.spark.sql.catalyst.plans.logical.AlterTableCommand alter)  ;
  public  void checkAnalysis (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan)  ;
  /**
   * Validate that collected metrics names are unique. The same name cannot be used for metrics
   * with different results. However multiple instances of metrics with with same result and name
   * are allowed (e.g. self-joins).
   * @param plan (undocumented)
   */
  public  void checkCollectedMetrics (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan)  ;
  /**
   * Validates to make sure the outer references appearing inside the subquery
   * are allowed.
   * @param sub (undocumented)
   * @param isScalar (undocumented)
   * @param isLateral (undocumented)
   */
  public  void checkCorrelationsInSubquery (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan sub, boolean isScalar, boolean isLateral)  ;
  public  void checkLimitLikeClause (java.lang.String name, org.apache.spark.sql.catalyst.expressions.Expression limitExpr)  ;
  /**
   * Validates subquery expressions in the plan. Upon failure, returns an user facing error.
   * @param plan (undocumented)
   * @param expr (undocumented)
   */
  public  void checkSubqueryExpression (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan, org.apache.spark.sql.catalyst.expressions.SubqueryExpression expr)  ;
  public  boolean containsMultipleGenerators (scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> exprs)  ;
  /**
   * Override to provide additional checks for correct analysis.
   * These rules will be evaluated after our built-in check rules.
   * @return (undocumented)
   */
  public  scala.collection.Seq<scala.Function1<org.apache.spark.sql.catalyst.plans.logical.LogicalPlan, scala.runtime.BoxedUnit>> extendedCheckRules ()  ;
    java.lang.String extraHintForAnsiTypeCoercionExpression (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan)  ;
  public  java.lang.String extraHintForAnsiTypeCoercionPlan (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan)  ;
  public  java.lang.String extraHintMessage (boolean issueFixedIfAnsiOff)  ;
  public  scala.runtime.Nothing$ failAnalysis (java.lang.String msg)  ;
  public  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> getAllExpressions (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan)  ;
  public  scala.Function2<org.apache.spark.sql.types.DataType, org.apache.spark.sql.types.DataType, java.lang.Object> getDataTypesAreCompatibleFn (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan)  ;
  public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan getDefaultTypeCoercionPlan (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan)  ;
  public  boolean hasMapType (org.apache.spark.sql.types.DataType dt)  ;
  public  boolean isView (scala.collection.Seq<java.lang.String> nameParts)  ;
  public  scala.Option<org.apache.spark.sql.catalyst.expressions.Attribute> mapColumnInSetOperation (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan)  ;
}
