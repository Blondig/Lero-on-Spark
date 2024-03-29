package org.apache.spark.sql.catalyst.optimizer;
/**
 * Unwrap casts in binary comparison or <code>In/InSet</code> operations with patterns like following:
 * <p>
 * - <code>BinaryComparison(Cast(fromExp, toType), Literal(value, toType))</code>
 * - <code>BinaryComparison(Literal(value, toType), Cast(fromExp, toType))</code>
 * - <code>In(Cast(fromExp, toType), Seq(Literal(v1, toType), Literal(v2, toType), ...)</code>
 * - <code>InSet(Cast(fromExp, toType), Set(v1, v2, ...))</code>
 * <p>
 * This rule optimizes expressions with the above pattern by either replacing the cast with simpler
 * constructs, or moving the cast from the expression side to the literal side, which enables them
 * to be optimized away later and pushed down to data sources.
 * <p>
 * Currently this only handles cases where:
 *   1). <code>fromType</code> (of <code>fromExp</code>) and <code>toType</code> are of numeric types (i.e., short, int, float,
 *     decimal, etc) or boolean type
 *   2). <code>fromType</code> can be safely coerced to <code>toType</code> without precision loss (e.g., short to int,
 *     int to long, but not long to int, nor int to boolean)
 * <p>
 * If the above conditions are satisfied, the rule checks to see if the literal <code>value</code> is within
 * range <code>(min, max)</code>, where <code>min</code> and <code>max</code> are the minimum and maximum value of <code>fromType</code>,
 * respectively. If this is true then it means we may safely cast <code>value</code> to <code>fromType</code> and thus
 * able to move the cast to the literal side. That is:
 * <p>
 *   <code>cast(fromExp, toType) op value</code> ==&gt; <code>fromExp op cast(value, fromType)</code>
 * <p>
 * Note there are some exceptions to the above: if casting from <code>value</code> to <code>fromType</code> causes
 * rounding up or down, the above conversion will no longer be valid. Instead, the rule does the
 * following:
 * <p>
 * if casting <code>value</code> to <code>fromType</code> causes rounding up:
 *  - <code>cast(fromExp, toType) > value</code> ==&gt; <code>fromExp >= cast(value, fromType)</code>
 *  - <code>cast(fromExp, toType) >= value</code> ==&gt; <code>fromExp >= cast(value, fromType)</code>
 *  - <code>cast(fromExp, toType) === value</code> ==&gt; if(isnull(fromExp), null, false)
 *  - <code>cast(fromExp, toType) <=&gt; value</code> ==&gt; false (if <code>fromExp</code> is deterministic)
 *  - <code>cast(fromExp, toType) <= value</code> ==&gt; <code>fromExp < cast(value, fromType)</code>
 *  - <code>cast(fromExp, toType) < value</code> ==&gt; <code>fromExp < cast(value, fromType)</code>
 * <p>
 * Similarly for the case when casting <code>value</code> to <code>fromType</code> causes rounding down.
 * <p>
 * If the <code>value</code> is not within range <code>(min, max)</code>, the rule breaks the scenario into different
 * cases and try to replace each with simpler constructs.
 * <p>
 * if <code>value > max</code>, the cases are of following:
 *  - <code>cast(fromExp, toType) > value</code> ==&gt; if(isnull(fromExp), null, false)
 *  - <code>cast(fromExp, toType) >= value</code> ==&gt; if(isnull(fromExp), null, false)
 *  - <code>cast(fromExp, toType) === value</code> ==&gt; if(isnull(fromExp), null, false)
 *  - <code>cast(fromExp, toType) <=&gt; value</code> ==&gt; false (if <code>fromExp</code> is deterministic)
 *  - <code>cast(fromExp, toType) <= value</code> ==&gt; if(isnull(fromExp), null, true)
 *  - <code>cast(fromExp, toType) < value</code> ==&gt; if(isnull(fromExp), null, true)
 * <p>
 * if <code>value == max</code>, the cases are of following:
 *  - <code>cast(fromExp, toType) > value</code> ==&gt; if(isnull(fromExp), null, false)
 *  - <code>cast(fromExp, toType) >= value</code> ==&gt; fromExp == max
 *  - <code>cast(fromExp, toType) === value</code> ==&gt; fromExp == max
 *  - <code>cast(fromExp, toType) <=&gt; value</code> ==&gt; fromExp <=&gt; max
 *  - <code>cast(fromExp, toType) <= value</code> ==&gt; if(isnull(fromExp), null, true)
 *  - <code>cast(fromExp, toType) < value</code> ==&gt; fromExp =!= max
 * <p>
 * Similarly for the cases when <code>value == min</code> and <code>value < min</code>.
 * <p>
 * Further, the above <code>if(isnull(fromExp), null, false)</code> is represented using conjunction
 * <code>and(isnull(fromExp), null)</code>, to enable further optimization and filter pushdown to data sources.
 * Similarly, <code>if(isnull(fromExp), null, true)</code> is represented with <code>or(isnotnull(fromExp), null)</code>.
 * <p>
 * For <code>In/InSet</code> operation, first the rule transform the expression to Equals:
 * <code>Seq(
 *   EqualTo(Cast(fromExp, toType), Literal(v1, toType)),
 *   EqualTo(Cast(fromExp, toType), Literal(v2, toType)),
 *   ...
 * )</code>
 * and using the same rule with <code>BinaryComparison</code> show as before to optimize each <code>EqualTo</code>.
 */
public  class UnwrapCastInBinaryComparison$ extends org.apache.spark.sql.catalyst.rules.Rule<org.apache.spark.sql.catalyst.plans.logical.LogicalPlan> {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final UnwrapCastInBinaryComparison$ MODULE$ = null;
  public   UnwrapCastInBinaryComparison$ ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan apply (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan)  { throw new RuntimeException(); }
    scala.Option<scala.Tuple2<java.lang.Object, java.lang.Object>> getRange (org.apache.spark.sql.types.DataType dt)  { throw new RuntimeException(); }
  /**
   * Wraps input expression <code>e</code> with <code>if(isnull(e), null, false)</code>. The if-clause is represented
   * using <code>and(isnull(e), null)</code> which is semantically equivalent by applying 3-valued logic.
   * @param e (undocumented)
   * @return (undocumented)
   */
    org.apache.spark.sql.catalyst.expressions.Expression falseIfNotNull (org.apache.spark.sql.catalyst.expressions.Expression e)  { throw new RuntimeException(); }
  /**
   * Wraps input expression <code>e</code> with <code>if(isnull(e), null, true)</code>. The if-clause is represented
   * using <code>or(isnotnull(e), null)</code> which is semantically equivalent by applying 3-valued logic.
   * @param e (undocumented)
   * @return (undocumented)
   */
    org.apache.spark.sql.catalyst.expressions.Expression trueIfNotNull (org.apache.spark.sql.catalyst.expressions.Expression e)  { throw new RuntimeException(); }
}
