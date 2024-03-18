package org.apache.spark.sql.catalyst.expressions;
/**
 * A utility class that converts public connector expressions into Catalyst expressions.
 */
public  class V2ExpressionUtils$ implements org.apache.spark.sql.catalyst.SQLConfHelper, org.apache.spark.internal.Logging {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final V2ExpressionUtils$ MODULE$ = null;
  public   V2ExpressionUtils$ ()  { throw new RuntimeException(); }
  public <T extends org.apache.spark.sql.catalyst.expressions.NamedExpression> T resolveRef (org.apache.spark.sql.connector.expressions.NamedReference ref, org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan)  { throw new RuntimeException(); }
  public <T extends org.apache.spark.sql.catalyst.expressions.NamedExpression> scala.collection.Seq<T> resolveRefs (scala.collection.Seq<org.apache.spark.sql.connector.expressions.NamedReference> refs, org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan)  { throw new RuntimeException(); }
  /**
   * Converts the array of input V2 {@link V2SortOrder} into their counterparts in catalyst.
   * @param ordering (undocumented)
   * @param query (undocumented)
   * @return (undocumented)
   */
  public  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.SortOrder> toCatalystOrdering (org.apache.spark.sql.connector.expressions.SortOrder[] ordering, org.apache.spark.sql.catalyst.plans.logical.LogicalPlan query)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.expressions.Expression toCatalyst (org.apache.spark.sql.connector.expressions.Expression expr, org.apache.spark.sql.catalyst.plans.logical.LogicalPlan query, scala.Option<org.apache.spark.sql.connector.catalog.FunctionCatalog> funCatalogOpt)  { throw new RuntimeException(); }
  public  scala.Option<org.apache.spark.sql.catalyst.expressions.Expression> toCatalystOpt (org.apache.spark.sql.connector.expressions.Expression expr, org.apache.spark.sql.catalyst.plans.logical.LogicalPlan query, scala.Option<org.apache.spark.sql.connector.catalog.FunctionCatalog> funCatalogOpt)  { throw new RuntimeException(); }
  public  scala.Option<org.apache.spark.sql.catalyst.expressions.Expression> toCatalystTransformOpt (org.apache.spark.sql.connector.expressions.Transform trans, org.apache.spark.sql.catalyst.plans.logical.LogicalPlan query, scala.Option<org.apache.spark.sql.connector.catalog.FunctionCatalog> funCatalogOpt)  { throw new RuntimeException(); }
}
