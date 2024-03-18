package org.apache.spark.sql.catalyst.expressions;
public  class TimeWindow extends org.apache.spark.sql.catalyst.expressions.UnaryExpression implements org.apache.spark.sql.catalyst.expressions.ImplicitCastInputTypes, org.apache.spark.sql.catalyst.expressions.Unevaluable, org.apache.spark.sql.catalyst.expressions.NonSQLExpression, scala.Product, scala.Serializable {
  /**
   * Parses the interval string for a valid time duration. CalendarInterval expects interval
   * strings to start with the string <code>interval</code>. For usability, we prepend <code>interval</code> to the string
   * if the user omitted it.
   * <p>
   * @param interval The interval string
   * @return The interval duration in microseconds. SparkSQL casts TimestampType has microsecond
   *         precision.
   */
  static public  long getIntervalInMicroSeconds (java.lang.String interval)  { throw new RuntimeException(); }
  /**
   * Parses the duration expression to generate the long value for the original constructor so
   * that we can use <code>window</code> in SQL.
   * @param expr (undocumented)
   * @return (undocumented)
   */
  static public  long parseExpression (org.apache.spark.sql.catalyst.expressions.Expression expr)  { throw new RuntimeException(); }
  static public  org.apache.spark.sql.catalyst.expressions.TimeWindow apply (org.apache.spark.sql.catalyst.expressions.Expression timeColumn, java.lang.String windowDuration, java.lang.String slideDuration, java.lang.String startTime)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.expressions.Expression timeColumn ()  { throw new RuntimeException(); }
  public  long windowDuration ()  { throw new RuntimeException(); }
  public  long slideDuration ()  { throw new RuntimeException(); }
  public  long startTime ()  { throw new RuntimeException(); }
  // not preceding
  public   TimeWindow (org.apache.spark.sql.catalyst.expressions.Expression timeColumn, long windowDuration, long slideDuration, long startTime)  { throw new RuntimeException(); }
  public   TimeWindow (org.apache.spark.sql.catalyst.expressions.Expression timeColumn, org.apache.spark.sql.catalyst.expressions.Expression windowDuration, org.apache.spark.sql.catalyst.expressions.Expression slideDuration, org.apache.spark.sql.catalyst.expressions.Expression startTime)  { throw new RuntimeException(); }
  public   TimeWindow (org.apache.spark.sql.catalyst.expressions.Expression timeColumn, org.apache.spark.sql.catalyst.expressions.Expression windowDuration, org.apache.spark.sql.catalyst.expressions.Expression slideDuration)  { throw new RuntimeException(); }
  public   TimeWindow (org.apache.spark.sql.catalyst.expressions.Expression timeColumn, org.apache.spark.sql.catalyst.expressions.Expression windowDuration)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.expressions.Expression child ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.sql.types.AbstractDataType> inputTypes ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.types.DataType dataType ()  { throw new RuntimeException(); }
  public  java.lang.String prettyName ()  { throw new RuntimeException(); }
  public final  scala.collection.Seq<scala.Enumeration.Value> nodePatterns ()  { throw new RuntimeException(); }
  // not preceding
  public  boolean resolved ()  { throw new RuntimeException(); }
  /**
   * Validate the inputs for the window duration, slide duration, and start time in addition to
   * the input data type.
   * @return (undocumented)
   */
  public  org.apache.spark.sql.catalyst.analysis.TypeCheckResult checkInputDataTypes ()  { throw new RuntimeException(); }
  protected  org.apache.spark.sql.catalyst.expressions.TimeWindow withNewChildInternal (org.apache.spark.sql.catalyst.expressions.Expression newChild)  { throw new RuntimeException(); }
}
