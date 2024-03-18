package org.apache.spark.sql.catalyst.util;
/**
 * The collection of functions for rebasing days and microseconds from/to the hybrid calendar
 * (Julian + Gregorian since 1582-10-15) which is used by Spark 2.4 and earlier versions
 * to/from Proleptic Gregorian calendar which is used by Spark since version 3.0. See SPARK-26651.
 */
public  class RebaseDateTime {
  static public  class RebaseSpec implements scala.Product, scala.Serializable {
    public  scala.Enumeration.Value mode ()  { throw new RuntimeException(); }
    public  scala.Option<java.lang.String> originTimeZone ()  { throw new RuntimeException(); }
    // not preceding
    public   RebaseSpec (scala.Enumeration.Value mode, scala.Option<java.lang.String> originTimeZone)  { throw new RuntimeException(); }
    public  java.lang.String timeZone ()  { throw new RuntimeException(); }
  }
  static public  class RebaseSpec$ extends scala.runtime.AbstractFunction2<scala.Enumeration.Value, scala.Option<java.lang.String>, org.apache.spark.sql.catalyst.util.RebaseDateTime.RebaseSpec> implements scala.Serializable {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final RebaseSpec$ MODULE$ = null;
    public   RebaseSpec$ ()  { throw new RuntimeException(); }
  }
  /**
   * Rebasing info used to convert microseconds from an original to a target calendar.
   * <p>
   * param:  switches An ordered array of microseconds since the epoch when the diff between
   *                 two calendars are changed.
   * param:  diffs Differences in microseconds associated with elements of <code>switches</code>.
   */
  static   class RebaseInfo implements scala.Product, scala.Serializable {
    public  long[] switches ()  { throw new RuntimeException(); }
    public  long[] diffs ()  { throw new RuntimeException(); }
    // not preceding
    public   RebaseInfo (long[] switches, long[] diffs)  { throw new RuntimeException(); }
  }
  static public  class RebaseInfo$ extends scala.runtime.AbstractFunction2<long[], long[], org.apache.spark.sql.catalyst.util.RebaseDateTime.RebaseInfo> implements scala.Serializable {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final RebaseInfo$ MODULE$ = null;
    public   RebaseInfo$ ()  { throw new RuntimeException(); }
  }
  static public final  int lastSwitchJulianDay ()  { throw new RuntimeException(); }
  /**
   * Converts the given number of days since the epoch day 1970-01-01 to a local date in Julian
   * calendar, interprets the result as a local date in Proleptic Gregorian calendar, and takes the
   * number of days since the epoch from the Gregorian local date.
   * <p>
   * This is used to guarantee backward compatibility, as Spark 2.4 and earlier versions use
   * Julian calendar for dates before 1582-10-15, while Spark 3.0 and later use Proleptic Gregorian
   * calendar. See SPARK-26651.
   * <p>
   * For example:
   *   Julian calendar: 1582-01-01 -> -141704
   *   Proleptic Gregorian calendar: 1582-01-01 -> -141714
   * The code below converts -141704 to -141714.
   * <p>
   * @param days The number of days since the epoch in Julian calendar. It can be negative.
   * @return The rebased number of days in Gregorian calendar.
   */
  static   int localRebaseJulianToGregorianDays (int days)  { throw new RuntimeException(); }
  /**
   * An optimized version of {@link localRebaseJulianToGregorianDays(Int)}. This method leverages the
   * pre-calculated rebasing array to save calculation. For dates of Before Common Era, the
   * function falls back to the regular unoptimized version.
   * <p>
   * @param days The number of days since the epoch in Julian calendar. It can be negative.
   * @return The rebased number of days in Gregorian calendar.
   */
  static public  int rebaseJulianToGregorianDays (int days)  { throw new RuntimeException(); }
  static public final  int lastSwitchGregorianDay ()  { throw new RuntimeException(); }
  /**
   * Converts the given number of days since the epoch day 1970-01-01 to a local date in Proleptic
   * Gregorian calendar, interprets the result as a local date in Julian calendar, and takes the
   * number of days since the epoch from the Julian local date.
   * <p>
   * This is used to guarantee backward compatibility, as Spark 2.4 and earlier versions use
   * Julian calendar for dates before 1582-10-15, while Spark 3.0 and later use Proleptic Gregorian
   * calendar. See SPARK-26651.
   * <p>
   * For example:
   *   Proleptic Gregorian calendar: 1582-01-01 -> -141714
   *   Julian calendar: 1582-01-01 -> -141704
   * The code below converts -141714 to -141704.
   * <p>
   * @param days The number of days since the epoch in Proleptic Gregorian calendar.
   *             It can be negative.
   * @return The rebased number of days in Julian calendar.
   */
  static   int localRebaseGregorianToJulianDays (int days)  { throw new RuntimeException(); }
  /**
   * An optimized version of {@link localRebaseGregorianToJulianDays(Int)}. This method leverages the
   * pre-calculated rebasing array to save calculation. For dates of Before Common Era, the
   * function falls back to the regular unoptimized version.
   * <p>
   * @param days The number of days since the epoch in Gregorian calendar. It can be negative.
   * @return The rebased number of days since the epoch in Julian calendar.
   */
  static public  int rebaseGregorianToJulianDays (int days)  { throw new RuntimeException(); }
  static   scala.collection.mutable.AnyRefMap<java.lang.String, org.apache.spark.sql.catalyst.util.RebaseDateTime.RebaseInfo> loadRebaseRecords (java.lang.String fileName)  { throw new RuntimeException(); }
  static public final  long lastSwitchGregorianTs ()  { throw new RuntimeException(); }
  /**
   * Converts the given number of microseconds since the epoch '1970-01-01T00:00:00Z', to a local
   * date-time in Proleptic Gregorian calendar with timezone identified by <code>zoneId</code>, interprets the
   * result as a local date-time in Julian calendar with the same timezone, and takes microseconds
   * since the epoch from the Julian local date-time.
   * <p>
   * This is used to guarantee backward compatibility, as Spark 2.4 and earlier versions use
   * Julian calendar for dates before 1582-10-15, while Spark 3.0 and later use Proleptic Gregorian
   * calendar. See SPARK-26651.
   * <p>
   * For example:
   *   Proleptic Gregorian calendar: 1582-01-01 00:00:00.123456 -> -12244061221876544
   *   Julian calendar: 1582-01-01 00:00:00.123456 -> -12243196799876544
   * The code below converts -12244061221876544 to -12243196799876544.
   * <p>
   * @param tz The time zone at which the rebasing should be performed.
   * @param micros The number of microseconds since the epoch '1970-01-01T00:00:00Z'
   *               in Proleptic Gregorian calendar. It can be negative.
   * @return The rebased microseconds since the epoch in Julian calendar.
   */
  static   long rebaseGregorianToJulianMicros (java.util.TimeZone tz, long micros)  { throw new RuntimeException(); }
  /**
   * An optimized version of {@link rebaseGregorianToJulianMicros(TimeZone, Long)}. This method
   * leverages the pre-calculated rebasing maps to save calculation. If the rebasing map doesn't
   * contain information about the given time zone <code>timeZoneId</code> or <code>micros</code> is related to Before
   * Common Era, the function falls back to the regular unoptimized version.
   * <p>
   * @param timeZoneId A string identifier of a time zone.
   * @param micros The number of microseconds since the epoch '1970-01-01T00:00:00Z'
   *               in Proleptic Gregorian calendar. It can be negative.
   * @return The rebased microseconds since the epoch in Julian calendar.
   */
  static public  long rebaseGregorianToJulianMicros (java.lang.String timeZoneId, long micros)  { throw new RuntimeException(); }
  /**
   * An optimized version of {@link rebaseGregorianToJulianMicros(TimeZone, Long)}. This method
   * leverages the pre-calculated rebasing maps to save calculation. If the rebasing map doesn't
   * contain information about the current JVM system time zone or <code>micros</code> is related to Before
   * Common Era, the function falls back to the regular unoptimized version.
   * <p>
   * Note: The function assumes that the input micros was derived from a local timestamp
   *       at the default system JVM time zone in Proleptic Gregorian calendar.
   * <p>
   * @param micros The number of microseconds since the epoch '1970-01-01T00:00:00Z'
   *               in Proleptic Gregorian calendar. It can be negative.
   * @return The rebased microseconds since the epoch in Julian calendar.
   */
  static public  long rebaseGregorianToJulianMicros (long micros)  { throw new RuntimeException(); }
  /**
   * Converts the given number of microseconds since the epoch '1970-01-01T00:00:00Z', to a local
   * date-time in Julian calendar with timezone identified by <code>zoneId</code>, interprets the result as a
   * local date-time in Proleptic Gregorian calendar with the same timezone, and takes microseconds
   * since the epoch from the Gregorian local date-time.
   * <p>
   * This is used to guarantee backward compatibility, as Spark 2.4 and earlier versions use
   * Julian calendar for dates before 1582-10-15, while Spark 3.0 and later use Proleptic Gregorian
   * calendar. See SPARK-26651.
   * <p>
   * For example:
   *   Julian calendar: 1582-01-01 00:00:00.123456 -> -12243196799876544
   *   Proleptic Gregorian calendar: 1582-01-01 00:00:00.123456 -> -12244061221876544
   * The code below converts -12243196799876544 to -12244061221876544.
   * <p>
   * @param tz The time zone at which the rebasing should be performed.
   * @param micros The number of microseconds since the epoch '1970-01-01T00:00:00Z'
   *               in the Julian calendar. It can be negative.
   * @return The rebased microseconds since the epoch in Proleptic Gregorian calendar.
   */
  static   long rebaseJulianToGregorianMicros (java.util.TimeZone tz, long micros)  { throw new RuntimeException(); }
  static public final  long lastSwitchJulianTs ()  { throw new RuntimeException(); }
  /**
   * An optimized version of {@link rebaseJulianToGregorianMicros(TimeZone, Long)}. This method
   * leverages the pre-calculated rebasing maps to save calculation. If the rebasing map doesn't
   * contain information about the given time zone <code>timeZoneId</code> or <code>micros</code> is related to Before
   * Common Era, the function falls back to the regular unoptimized version.
   * <p>
   * @param timeZoneId A string identifier of a time zone.
   * @param micros The number of microseconds since the epoch '1970-01-01T00:00:00Z'
   *               in the Julian calendar. It can be negative.
   * @return The rebased microseconds since the epoch in Proleptic Gregorian calendar.
   */
  static public  long rebaseJulianToGregorianMicros (java.lang.String timeZoneId, long micros)  { throw new RuntimeException(); }
  /**
   * An optimized version of {@link rebaseJulianToGregorianMicros(TimeZone, Long)}. This method
   * leverages the pre-calculated rebasing maps to save calculation. If the rebasing map doesn't
   * contain information about the current JVM system time zone or <code>micros</code> is related to Before
   * Common Era, the function falls back to the regular unoptimized version.
   * <p>
   * Note: The function assumes that the input micros was derived from a local timestamp
   *       at the default system JVM time zone in the Julian calendar.
   * <p>
   * @param micros The number of microseconds since the epoch '1970-01-01T00:00:00Z'
   *               in the Julian calendar. It can be negative.
   * @return The rebased microseconds since the epoch in Proleptic Gregorian calendar.
   */
  static public  long rebaseJulianToGregorianMicros (long micros)  { throw new RuntimeException(); }
}
