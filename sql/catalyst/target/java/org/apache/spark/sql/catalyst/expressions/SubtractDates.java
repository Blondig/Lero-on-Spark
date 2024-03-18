package org.apache.spark.sql.catalyst.expressions;
/**
 * Returns the interval from the <code>left</code> date (inclusive) to the <code>right</code> date (exclusive).
 *   - When the SQL config <code>spark.sql.legacy.interval.enabled</code> is <code>true</code>,
 *     it returns <code>CalendarIntervalType</code> in which the <code>microseconds</code> field is set to 0 and
 *     the <code>months</code> and <code>days</code> fields are initialized to the difference between the given dates.
 *   - Otherwise the expression returns <code>DayTimeIntervalType</code> with the difference in days
 *     between the given dates.
 */
public  class SubtractDates extends org.apache.spark.sql.catalyst.expressions.BinaryExpression implements org.apache.spark.sql.catalyst.expressions.ImplicitCastInputTypes, org.apache.spark.sql.catalyst.expressions.NullIntolerant, scala.Product, scala.Serializable {
  static public  org.apache.spark.sql.catalyst.expressions.SubtractDates apply (org.apache.spark.sql.catalyst.expressions.Expression left, org.apache.spark.sql.catalyst.expressions.Expression right)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.expressions.Expression left ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.expressions.Expression right ()  { throw new RuntimeException(); }
  public  boolean legacyInterval ()  { throw new RuntimeException(); }
  // not preceding
  public   SubtractDates (org.apache.spark.sql.catalyst.expressions.Expression left, org.apache.spark.sql.catalyst.expressions.Expression right, boolean legacyInterval)  { throw new RuntimeException(); }
  public   SubtractDates (org.apache.spark.sql.catalyst.expressions.Expression left, org.apache.spark.sql.catalyst.expressions.Expression right)  { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.sql.types.AbstractDataType> inputTypes ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.types.DataType dataType ()  { throw new RuntimeException(); }
  public  Object nullSafeEval (Object leftDays, Object rightDays)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.expressions.codegen.ExprCode doGenCode (org.apache.spark.sql.catalyst.expressions.codegen.CodegenContext ctx, org.apache.spark.sql.catalyst.expressions.codegen.ExprCode ev)  { throw new RuntimeException(); }
  public  java.lang.String toString ()  { throw new RuntimeException(); }
  public  java.lang.String sql ()  { throw new RuntimeException(); }
  protected  org.apache.spark.sql.catalyst.expressions.SubtractDates withNewChildrenInternal (org.apache.spark.sql.catalyst.expressions.Expression newLeft, org.apache.spark.sql.catalyst.expressions.Expression newRight)  { throw new RuntimeException(); }
}
