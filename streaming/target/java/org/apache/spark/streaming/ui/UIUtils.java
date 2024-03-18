package org.apache.spark.streaming.ui;
public  class UIUtils {
  /**
   * Return the short string for a <code>TimeUnit</code>.
   * @param unit (undocumented)
   * @return (undocumented)
   */
  static public  java.lang.String shortTimeUnitString (java.util.concurrent.TimeUnit unit)  { throw new RuntimeException(); }
  /**
   * Find the best <code>TimeUnit</code> for converting milliseconds to a friendly string. Return the value
   * after converting, also with its TimeUnit.
   * @param milliseconds (undocumented)
   * @return (undocumented)
   */
  static public  scala.Tuple2<java.lang.Object, java.util.concurrent.TimeUnit> normalizeDuration (long milliseconds)  { throw new RuntimeException(); }
  /**
   * Convert <code>milliseconds</code> to the specified <code>unit</code>. We cannot use <code>TimeUnit.convert</code> because it
   * will discard the fractional part.
   * @param milliseconds (undocumented)
   * @param unit (undocumented)
   * @return (undocumented)
   */
  static public  double convertToTimeUnit (long milliseconds, java.util.concurrent.TimeUnit unit)  { throw new RuntimeException(); }
  static public  java.lang.String createOutputOperationFailureForUI (java.lang.String failure)  { throw new RuntimeException(); }
  static public  scala.collection.Seq<scala.xml.Node> failureReasonCell (java.lang.String failureReason, int rowspan, boolean includeFirstLineInExpandDetails)  { throw new RuntimeException(); }
}
