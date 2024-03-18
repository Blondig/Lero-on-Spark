package org.apache.spark.sql.catalyst.expressions;
public  class BaseGroupingSets$ {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final BaseGroupingSets$ MODULE$ = null;
  public   BaseGroupingSets$ ()  { throw new RuntimeException(); }
  /**
   * 'GROUP BY a, b, c WITH ROLLUP'
   * is equivalent to
   * 'GROUP BY GROUPING SETS ( (a, b, c), (a, b), (a), ( ) )'.
   * Group Count: N + 1 (N is the number of group expressions)
   * <p>
   * We need to get all of its subsets for the rule described above, the subset is
   * represented as sequence of expressions.
   * @param exprs (undocumented)
   * @return (undocumented)
   */
  public  scala.collection.Seq<scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression>> rollupExprs (scala.collection.Seq<scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression>> exprs)  { throw new RuntimeException(); }
  /**
   * 'GROUP BY a, b, c WITH CUBE'
   * is equivalent to
   * 'GROUP BY GROUPING SETS ( (a, b, c), (a, b), (b, c), (a, c), (a), (b), (c), ( ) )'.
   * Group Count: 2 ^ N (N is the number of group expressions)
   * <p>
   * We need to get all of its subsets for a given GROUPBY expression, the subsets are
   * represented as sequence of expressions.
   * @param exprs (undocumented)
   * @return (undocumented)
   */
  public  scala.collection.Seq<scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression>> cubeExprs (scala.collection.Seq<scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression>> exprs)  { throw new RuntimeException(); }
  public  scala.collection.Seq<scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression>> cubeExprs0 (scala.collection.Seq<scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression>> exprs)  { throw new RuntimeException(); }
  /**
   * This methods converts given grouping sets into the indexes of the flatten grouping sets.
   * Let's say we have a query below:
   *   SELECT k1, k2, avg(v) FROM t GROUP BY GROUPING SETS ((k1), (k1, k2), (k2, k1));
   * In this case, flatten grouping sets are "[k1, k1, k2, k2, k1]" and the method
   * will return indexes "{@link 1], [2, 3], [4, 5}".
   * @param groupingSets (undocumented)
   * @return (undocumented)
   */
  public  scala.collection.Seq<scala.collection.Seq<java.lang.Object>> computeGroupingSetIndexes (scala.collection.Seq<scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression>> groupingSets)  { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> distinctGroupByExprs (scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> exprs)  { throw new RuntimeException(); }
}
