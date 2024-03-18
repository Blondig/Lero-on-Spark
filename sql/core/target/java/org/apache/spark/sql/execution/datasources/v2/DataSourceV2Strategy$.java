package org.apache.spark.sql.execution.datasources.v2;
public  class DataSourceV2Strategy$ {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final DataSourceV2Strategy$ MODULE$ = null;
  public   DataSourceV2Strategy$ ()  { throw new RuntimeException(); }
  /**
   * Tries to translate a Catalyst {@link Expression} into data source {@link Filter}.
   * <p>
   * @return a <code>Some[Filter]</code> if the input {@link Expression} is convertible, otherwise a <code>None</code>.
   * @param predicate (undocumented)
   * @param supportNestedPredicatePushdown (undocumented)
   */
  protected  scala.Option<org.apache.spark.sql.connector.expressions.filter.Predicate> translateFilterV2 (org.apache.spark.sql.catalyst.expressions.Expression predicate, boolean supportNestedPredicatePushdown)  { throw new RuntimeException(); }
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
  protected  scala.Option<org.apache.spark.sql.connector.expressions.filter.Predicate> translateFilterV2WithMapping (org.apache.spark.sql.catalyst.expressions.Expression predicate, scala.Option<scala.collection.mutable.HashMap<org.apache.spark.sql.connector.expressions.filter.Predicate, org.apache.spark.sql.catalyst.expressions.Expression>> translatedFilterToExpr, boolean nestedPredicatePushdownEnabled)  { throw new RuntimeException(); }
  protected  org.apache.spark.sql.catalyst.expressions.Expression rebuildExpressionFromFilter (org.apache.spark.sql.connector.expressions.filter.Predicate predicate, scala.collection.mutable.HashMap<org.apache.spark.sql.connector.expressions.filter.Predicate, org.apache.spark.sql.catalyst.expressions.Expression> translatedFilterToExpr)  { throw new RuntimeException(); }
}
