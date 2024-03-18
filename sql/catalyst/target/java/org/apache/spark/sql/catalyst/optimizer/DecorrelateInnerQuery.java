package org.apache.spark.sql.catalyst.optimizer;
/**
 * Decorrelate the inner query by eliminating outer references and create domain joins.
 * The implementation is based on the paper: Unnesting Arbitrary Queries by Thomas Neumann
 * and Alfons Kemper. https://dl.gi.de/handle/20.500.12116/2418.
 * <p>
 * A correlated subquery can be viewed as a "dependent" nested loop join between the outer and
 * the inner query. For each row produced by the outer query, we bind the {@link OuterReference}s in
 * in the inner query with the corresponding values in the row, and then evaluate the inner query.
 * <p>
 * Dependent Join
 * :- Outer Query
 * +- Inner Query
 * <p>
 * If the {@link OuterReference}s are bound to the same value, the inner query will return the same
 * result. Based on this, we can reduce the times to evaluate the inner query by first getting
 * all distinct values of the {@link OuterReference}s.
 * <p>
 * Normal Join
 * :- Outer Query
 * +- Dependent Join
 *    :- Inner Query
 *    +- Distinct Aggregate (outer_ref1, outer_ref2, ...)
 *       +- Outer Query
 * <p>
 * The distinct aggregate of the outer references is called a "domain", and the dependent join
 * between the inner query and the domain is called a "domain join". We need to push down the
 * domain join through the inner query until there is no outer reference in the sub-tree and
 * the domain join will turn into a normal join.
 * <p>
 * The decorrelation function returns a new query plan with optional placeholder {@link DomainJoins}s
 * added and a list of join conditions with the outer query. {@link DomainJoin}s need to be rewritten
 * into actual inner join between the inner query sub-tree and the outer query.
 * <p>
 * E.g. decorrelate an inner query with equality predicates:
 * <p>
 * SELECT (SELECT MIN(b) FROM t1 WHERE t2.c = t1.a) FROM t2
 * <p>
 * Aggregate [] [min(b)]            Aggregate [a] [min(b), a]
 * +- Filter (outer(c) = a)   =&gt;   +- Relation [t1]
 *    +- Relation [t1]
 * <p>
 * Join conditions: [c = a]
 * <p>
 * E.g. decorrelate an inner query with non-equality predicates:
 * <p>
 * SELECT (SELECT MIN(b) FROM t1 WHERE t2.c > t1.a) FROM t2
 * <p>
 * Aggregate [] [min(b)]            Aggregate [c'] [min(b), c']
 * +- Filter (outer(c) > a)   =&gt;   +- Filter (c' > a)
 *    +- Relation [t1]                  +- DomainJoin [c']
 *                                         +- Relation [t1]
 * <p>
 * Join conditions: [c <=&gt; c']
 */
public  class DecorrelateInnerQuery {
  /**
   * Check if an expression can be pulled up over an {@link Aggregate} without changing the
   * semantics of the plan. The expression must be an equality predicate that guarantees
   * one-to-one mapping between inner and outer attributes.
   * For example:
   *   (a = outer(c)) -> true
   *   (a > outer(c)) -> false
   *   (a + b = outer(c)) -> false
   *   (a = outer(c) - b) -> false
   * @param expression (undocumented)
   * @return (undocumented)
   */
  static public  boolean canPullUpOverAgg (org.apache.spark.sql.catalyst.expressions.Expression expression)  { throw new RuntimeException(); }
  /**
   * Deduplicate the inner and the outer query attributes and return an aliased
   * subquery plan and join conditions if duplicates are found. Duplicated attributes
   * can break the structural integrity when joining the inner and outer plan together.
   * @param innerPlan (undocumented)
   * @param conditions (undocumented)
   * @param outerOutputSet (undocumented)
   * @return (undocumented)
   */
  static public  scala.Tuple2<org.apache.spark.sql.catalyst.plans.logical.LogicalPlan, scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression>> deduplicate (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan innerPlan, scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> conditions, org.apache.spark.sql.catalyst.expressions.AttributeSet outerOutputSet)  { throw new RuntimeException(); }
  /**
   * Rewrite all {@link DomainJoin}s in the inner query to actual joins with the outer query.
   * @param outerPlan (undocumented)
   * @param innerPlan (undocumented)
   * @param conditions (undocumented)
   * @return (undocumented)
   */
  static public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan rewriteDomainJoins (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan outerPlan, org.apache.spark.sql.catalyst.plans.logical.LogicalPlan innerPlan, scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> conditions)  { throw new RuntimeException(); }
  static public  scala.Tuple2<org.apache.spark.sql.catalyst.plans.logical.LogicalPlan, scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression>> apply (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan innerPlan, org.apache.spark.sql.catalyst.plans.logical.LogicalPlan outerPlan, boolean handleCountBug)  { throw new RuntimeException(); }
  static protected  org.apache.spark.sql.catalyst.expressions.AttributeMap<org.apache.spark.sql.catalyst.expressions.Alias> getAliasMap (org.apache.spark.sql.catalyst.plans.logical.Project plan)  { throw new RuntimeException(); }
  static protected  org.apache.spark.sql.catalyst.expressions.AttributeMap<org.apache.spark.sql.catalyst.expressions.Alias> getAliasMap (org.apache.spark.sql.catalyst.plans.logical.Aggregate plan)  { throw new RuntimeException(); }
  static protected  org.apache.spark.sql.catalyst.expressions.AttributeMap<org.apache.spark.sql.catalyst.expressions.Alias> getAliasMap (scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.NamedExpression> exprs)  { throw new RuntimeException(); }
  static protected  org.apache.spark.sql.catalyst.expressions.Expression replaceAlias (org.apache.spark.sql.catalyst.expressions.Expression expr, org.apache.spark.sql.catalyst.expressions.AttributeMap<org.apache.spark.sql.catalyst.expressions.Alias> aliasMap)  { throw new RuntimeException(); }
  static protected  org.apache.spark.sql.catalyst.expressions.NamedExpression replaceAliasButKeepName (org.apache.spark.sql.catalyst.expressions.NamedExpression expr, org.apache.spark.sql.catalyst.expressions.AttributeMap<org.apache.spark.sql.catalyst.expressions.Alias> aliasMap)  { throw new RuntimeException(); }
  static protected  org.apache.spark.sql.catalyst.expressions.Expression trimAliases (org.apache.spark.sql.catalyst.expressions.Expression e)  { throw new RuntimeException(); }
  static protected <T extends org.apache.spark.sql.catalyst.expressions.Expression> T trimNonTopLevelAliases (T e)  { throw new RuntimeException(); }
  static public  org.slf4j.Logger org$apache$spark$internal$Logging$$log_ ()  { throw new RuntimeException(); }
  static public  void org$apache$spark$internal$Logging$$log__$eq (org.slf4j.Logger x$1)  { throw new RuntimeException(); }
  static protected  java.lang.String logName ()  { throw new RuntimeException(); }
  static protected  org.slf4j.Logger log ()  { throw new RuntimeException(); }
  static protected  void logInfo (scala.Function0<java.lang.String> msg)  { throw new RuntimeException(); }
  static protected  void logDebug (scala.Function0<java.lang.String> msg)  { throw new RuntimeException(); }
  static protected  void logTrace (scala.Function0<java.lang.String> msg)  { throw new RuntimeException(); }
  static protected  void logWarning (scala.Function0<java.lang.String> msg)  { throw new RuntimeException(); }
  static protected  void logError (scala.Function0<java.lang.String> msg)  { throw new RuntimeException(); }
  static protected  void logInfo (scala.Function0<java.lang.String> msg, java.lang.Throwable throwable)  { throw new RuntimeException(); }
  static protected  void logDebug (scala.Function0<java.lang.String> msg, java.lang.Throwable throwable)  { throw new RuntimeException(); }
  static protected  void logTrace (scala.Function0<java.lang.String> msg, java.lang.Throwable throwable)  { throw new RuntimeException(); }
  static protected  void logWarning (scala.Function0<java.lang.String> msg, java.lang.Throwable throwable)  { throw new RuntimeException(); }
  static protected  void logError (scala.Function0<java.lang.String> msg, java.lang.Throwable throwable)  { throw new RuntimeException(); }
  static protected  boolean isTraceEnabled ()  { throw new RuntimeException(); }
  static protected  void initializeLogIfNecessary (boolean isInterpreter)  { throw new RuntimeException(); }
  static protected  boolean initializeLogIfNecessary (boolean isInterpreter, boolean silent)  { throw new RuntimeException(); }
  static protected  boolean initializeLogIfNecessary$default$2 ()  { throw new RuntimeException(); }
  static   void initializeForcefully (boolean isInterpreter, boolean silent)  { throw new RuntimeException(); }
  static protected  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> splitConjunctivePredicates (org.apache.spark.sql.catalyst.expressions.Expression condition)  { throw new RuntimeException(); }
  static public  scala.Option<scala.Tuple2<org.apache.spark.sql.catalyst.expressions.Expression, org.apache.spark.sql.catalyst.plans.logical.LogicalPlan>> findExpressionAndTrackLineageDown (org.apache.spark.sql.catalyst.expressions.Expression exp, org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan)  { throw new RuntimeException(); }
  static protected  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> splitDisjunctivePredicates (org.apache.spark.sql.catalyst.expressions.Expression condition)  { throw new RuntimeException(); }
  static protected  org.apache.spark.sql.catalyst.expressions.Expression buildBalancedPredicate (scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> expressions, scala.Function2<org.apache.spark.sql.catalyst.expressions.Expression, org.apache.spark.sql.catalyst.expressions.Expression, org.apache.spark.sql.catalyst.expressions.Expression> op)  { throw new RuntimeException(); }
  static protected  boolean canEvaluate (org.apache.spark.sql.catalyst.expressions.Expression expr, org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan)  { throw new RuntimeException(); }
  static protected  boolean canEvaluateWithinJoin (org.apache.spark.sql.catalyst.expressions.Expression expr)  { throw new RuntimeException(); }
  static protected  scala.Option<org.apache.spark.sql.catalyst.expressions.Expression> extractPredicatesWithinOutputSet (org.apache.spark.sql.catalyst.expressions.Expression condition, org.apache.spark.sql.catalyst.expressions.AttributeSet outputSet)  { throw new RuntimeException(); }
  static protected  boolean isNullIntolerant (org.apache.spark.sql.catalyst.expressions.Expression expr)  { throw new RuntimeException(); }
  static protected  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Attribute> outputWithNullability (scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Attribute> output, scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.ExprId> nonNullAttrExprIds)  { throw new RuntimeException(); }
  static public  boolean isLikelySelective (org.apache.spark.sql.catalyst.expressions.Expression e)  { throw new RuntimeException(); }
}
