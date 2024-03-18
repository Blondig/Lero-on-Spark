package org.apache.spark.sql.catalyst.expressions;
/**
 * Returns the interval from <code>right</code> to <code>left</code> timestamps.
 *   - When the SQL config <code>spark.sql.legacy.interval.enabled</code> is <code>true</code>,
 *     it returns <code>CalendarIntervalType</code> in which the months<code> and </code>day<code> field is set to 0 and
 *     the </code>microseconds<code> field is initialized to the microsecond difference between
 *     the given timestamps.
 *   - Otherwise the expression returns </code>DayTimeIntervalType<code> with the difference in microseconds
 *     between given timestamps.
 */
public  class SubtractTimestamps extends org.apache.spark.sql.catalyst.expressions.BinaryExpression implements org.apache.spark.sql.catalyst.expressions.TimeZoneAwareExpression, org.apache.spark.sql.catalyst.expressions.ExpectsInputTypes, org.apache.spark.sql.catalyst.expressions.NullIntolerant, scala.Product, scala.Serializable {
  static public  org.apache.spark.sql.catalyst.expressions.SubtractTimestamps apply (org.apache.spark.sql.catalyst.expressions.Expression left, org.apache.spark.sql.catalyst.expressions.Expression right)  { throw new RuntimeException(); }
  public  boolean resolved ()  { throw new RuntimeException(); }
  public final  scala.collection.Seq<scala.Enumeration.Value> nodePatterns ()  { throw new RuntimeException(); }
  public  java.time.ZoneId zoneId ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.expressions.Expression left ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.expressions.Expression right ()  { throw new RuntimeException(); }
  public  boolean legacyInterval ()  { throw new RuntimeException(); }
  public  scala.Option<java.lang.String> timeZoneId ()  { throw new RuntimeException(); }
  // not preceding
  public   SubtractTimestamps (org.apache.spark.sql.catalyst.expressions.Expression left, org.apache.spark.sql.catalyst.expressions.Expression right, boolean legacyInterval, scala.Option<java.lang.String> timeZoneId)  { throw new RuntimeException(); }
  public   SubtractTimestamps (org.apache.spark.sql.catalyst.expressions.Expression endTimestamp, org.apache.spark.sql.catalyst.expressions.Expression startTimestamp)  { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.sql.types.AbstractDataType> inputTypes ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.types.DataType dataType ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.expressions.TimeZoneAwareExpression withTimeZone (java.lang.String timeZoneId)  { throw new RuntimeException(); }
  public  Object nullSafeEval (Object leftMicros, Object rightMicros)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.expressions.codegen.ExprCode doGenCode (org.apache.spark.sql.catalyst.expressions.codegen.CodegenContext ctx, org.apache.spark.sql.catalyst.expressions.codegen.ExprCode ev)  { throw new RuntimeException(); }
  public  java.lang.String toString ()  { throw new RuntimeException(); }
  public  java.lang.String sql ()  { throw new RuntimeException(); }
  protected  org.apache.spark.sql.catalyst.expressions.SubtractTimestamps withNewChildrenInternal (org.apache.spark.sql.catalyst.expressions.Expression newLeft, org.apache.spark.sql.catalyst.expressions.Expression newRight)  { throw new RuntimeException(); }
}
