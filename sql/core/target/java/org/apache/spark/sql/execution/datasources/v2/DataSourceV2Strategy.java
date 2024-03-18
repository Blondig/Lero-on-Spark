package org.apache.spark.sql.execution.datasources.v2;
public  class DataSourceV2Strategy extends org.apache.spark.sql.execution.SparkStrategy implements org.apache.spark.sql.catalyst.expressions.PredicateHelper {
  /**
   * Tries to translate a Catalyst {@link Expression} into data source {@link Filter}.
   * <p>
   * @return a <code>Some[Filter]</code> if the input {@link Expression} is convertible, otherwise a <code>None</code>.
   * @param predicate (undocumented)
   * @param supportNestedPredicatePushdown (undocumented)
   */
  static protected  scala.Option<org.apache.spark.sql.connector.expressions.filter.Predicate> translateFilterV2 (org.apache.spark.sql.catalyst.expressions.Expression predicate, boolean supportNestedPredicatePushdown)  { throw new RuntimeException(); }
  /**
   * Tries to translate a Catalyst {@link Expression} into data source {@link Filter}.
   * <p>
   * @param predicate The input {@link Expression} to be translated as {@link Filter}
   * @param translatedFilterToExpr An optional map from leaf node filter expressions to its
   *                               translated {@link Filter}. The map is used for rebuilding
   *                               {@link Expression} from {@link Filter}.
   * @return a <code>Some[Filter]</code> if the input {@link Expression} is convertible, otherwise a <code>None</code>.
   * @param nestedPredicatePushdownEnabled (undocumented)
   */
  static protected  scala.Option<org.apache.spark.sql.connector.expressions.filter.Predicate> translateFilterV2WithMapping (org.apache.spark.sql.catalyst.expressions.Expression predicate, scala.Option<scala.collection.mutable.HashMap<org.apache.spark.sql.connector.expressions.filter.Predicate, org.apache.spark.sql.catalyst.expressions.Expression>> translatedFilterToExpr, boolean nestedPredicatePushdownEnabled)  { throw new RuntimeException(); }
  static protected  org.apache.spark.sql.catalyst.expressions.Expression rebuildExpressionFromFilter (org.apache.spark.sql.connector.expressions.filter.Predicate predicate, scala.collection.mutable.HashMap<org.apache.spark.sql.connector.expressions.filter.Predicate, org.apache.spark.sql.catalyst.expressions.Expression> translatedFilterToExpr)  { throw new RuntimeException(); }
  public   DataSourceV2Strategy (org.apache.spark.sql.SparkSession session)  { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.sql.execution.SparkPlan> apply (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan)  { throw new RuntimeException(); }
}
