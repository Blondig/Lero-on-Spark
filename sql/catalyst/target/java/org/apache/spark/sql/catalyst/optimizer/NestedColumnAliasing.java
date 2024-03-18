package org.apache.spark.sql.catalyst.optimizer;
/**
 * This aims to handle a nested column aliasing pattern inside the {@link ColumnPruning} optimizer rule.
 * If:
 * - A {@link Project} or its child references nested fields
 * - Not all of the fields in a nested attribute are used
 * Then:
 * - Substitute the nested field references with alias attributes
 * - Add grandchild {@link Project}s transforming the nested fields to aliases
 * <p>
 * Example 1: Project
 * ------------------
 * Before:
 * +- Project [concat_ws(s#0.a, s#0.b) AS concat_ws(s.a, s.b)#1]
 *   +- GlobalLimit 5
 *     +- LocalLimit 5
 *       +- LocalRelation <empty>, [s#0]
 * After:
 * +- Project [concat_ws(_extract_a#2, _extract_b#3) AS concat_ws(s.a, s.b)#1]
 *   +- GlobalLimit 5
 *     +- LocalLimit 5
 *       +- Project [s#0.a AS _extract_a#2, s#0.b AS _extract_b#3]
 *         +- LocalRelation <empty>, [s#0]
 * <p>
 * Example 2: Project above Filter
 * -------------------------------
 * Before:
 * +- Project [s#0.a AS s.a#1]
 *   +- Filter (length(s#0.b) > 2)
 *     +- GlobalLimit 5
 *       +- LocalLimit 5
 *         +- LocalRelation <empty>, [s#0]
 * After:
 * +- Project [_extract_a#2 AS s.a#1]
 *   +- Filter (length(_extract_b#3) > 2)
 *     +- GlobalLimit 5
 *       +- LocalLimit 5
 *         +- Project [s#0.a AS _extract_a#2, s#0.b AS _extract_b#3]
 *           +- LocalRelation <empty>, [s#0]
 * <p>
 * Example 3: Nested fields with referenced parents
 * ------------------------------------------------
 * Before:
 * +- Project [s#0.a AS s.a#1, s#0.a.a1 AS s.a.a1#2]
 *   +- GlobalLimit 5
 *     +- LocalLimit 5
 *       +- LocalRelation <empty>, [s#0]
 * After:
 * +- Project [_extract_a#3 AS s.a#1, _extract_a#3.name AS s.a.a1#2]
 *   +- GlobalLimit 5
 *     +- LocalLimit 5
 *       +- Project [s#0.a AS _extract_a#3]
 *         +- LocalRelation <empty>, [s#0]
 * <p>
 * The schema of the datasource relation will be pruned in the {@link SchemaPruning} optimizer rule.
 */
public  class NestedColumnAliasing {
  static public  scala.Option<org.apache.spark.sql.catalyst.plans.logical.LogicalPlan> unapply (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan)  { throw new RuntimeException(); }
  /**
   * Rewrites a plan with aliases if only a subset of the nested fields are used.
   * @param plan (undocumented)
   * @param exprList (undocumented)
   * @param exclusiveAttrs (undocumented)
   * @return (undocumented)
   */
  static public  scala.Option<org.apache.spark.sql.catalyst.plans.logical.LogicalPlan> rewritePlanIfSubsetFieldsUsed (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan, scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> exprList, scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Attribute> exclusiveAttrs)  { throw new RuntimeException(); }
  /**
   * Replace nested columns to prune unused nested columns later.
   * @param plan (undocumented)
   * @param attributeToExtractValues (undocumented)
   * @return (undocumented)
   */
  static public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan rewritePlanWithAliases (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan, scala.collection.immutable.Map<org.apache.spark.sql.catalyst.expressions.Attribute, scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.ExtractValue>> attributeToExtractValues)  { throw new RuntimeException(); }
  /**
   * Replace the {@link ExtractValue}s in a project list with aliased attributes.
   * @param projectList (undocumented)
   * @param nestedFieldToAlias (undocumented)
   * @return (undocumented)
   */
  static public  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.NamedExpression> getNewProjectList (scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.NamedExpression> projectList, scala.collection.immutable.Map<org.apache.spark.sql.catalyst.expressions.Expression, org.apache.spark.sql.catalyst.expressions.Alias> nestedFieldToAlias)  { throw new RuntimeException(); }
  /**
   * Replace the grandchildren of a plan with {@link Project}s of the nested fields as aliases,
   * and replace the {@link ExtractValue} expressions with aliased attributes.
   * @param plan (undocumented)
   * @param nestedFieldToAlias (undocumented)
   * @param attrToAliases (undocumented)
   * @return (undocumented)
   */
  static public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan replaceWithAliases (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan, scala.collection.immutable.Map<org.apache.spark.sql.catalyst.expressions.Expression, org.apache.spark.sql.catalyst.expressions.Alias> nestedFieldToAlias, org.apache.spark.sql.catalyst.expressions.AttributeMap<scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Alias>> attrToAliases)  { throw new RuntimeException(); }
  /**
   * Creates a map from root {@link Attribute}s to non-redundant nested {@link ExtractValue}s.
   * Nested field accessors of <code>exclusiveAttrs</code> are not considered in nested fields aliasing.
   * @param exprList (undocumented)
   * @param exclusiveAttrs (undocumented)
   * @param extractor (undocumented)
   * @return (undocumented)
   */
  static public  scala.collection.immutable.Map<org.apache.spark.sql.catalyst.expressions.Attribute, scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.ExtractValue>> getAttributeToExtractValues (scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> exprList, scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Attribute> exclusiveAttrs, scala.Function1<org.apache.spark.sql.catalyst.expressions.Expression, scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression>> extractor)  { throw new RuntimeException(); }
}
