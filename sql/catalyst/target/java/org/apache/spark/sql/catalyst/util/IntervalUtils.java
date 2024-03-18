package org.apache.spark.sql.catalyst.util;
public  class IntervalUtils {
  static public  int getYears (int months)  { throw new RuntimeException(); }
  static public  int getYears (org.apache.spark.unsafe.types.CalendarInterval interval)  { throw new RuntimeException(); }
  static public  byte getMonths (int months)  { throw new RuntimeException(); }
  static public  byte getMonths (org.apache.spark.unsafe.types.CalendarInterval interval)  { throw new RuntimeException(); }
  static public  int getDays (long microseconds)  { throw new RuntimeException(); }
  static public  int getDays (org.apache.spark.unsafe.types.CalendarInterval interval)  { throw new RuntimeException(); }
  static public  byte getHours (long microseconds)  { throw new RuntimeException(); }
  static public  byte getHours (org.apache.spark.unsafe.types.CalendarInterval interval)  { throw new RuntimeException(); }
  static public  byte getMinutes (long microseconds)  { throw new RuntimeException(); }
  static public  byte getMinutes (org.apache.spark.unsafe.types.CalendarInterval interval)  { throw new RuntimeException(); }
  static public  org.apache.spark.sql.types.Decimal getSeconds (long microseconds)  { throw new RuntimeException(); }
  static public  org.apache.spark.sql.types.Decimal getSeconds (org.apache.spark.unsafe.types.CalendarInterval interval)  { throw new RuntimeException(); }
  static public  scala.collection.immutable.Map<scala.Tuple2<java.lang.Object, java.lang.Object>, scala.collection.Seq<java.lang.String>> supportedFormat ()  { throw new RuntimeException(); }
  static public  int castStringToYMInterval (org.apache.spark.unsafe.types.UTF8String input, byte startField, byte endField)  { throw new RuntimeException(); }
  /**
   * Parse year-month interval in form: [+|-]YYYY-MM
   * <p>
   * adapted from HiveIntervalYearMonth.valueOf
   * @param input (undocumented)
   * @return (undocumented)
   */
  static public  org.apache.spark.unsafe.types.CalendarInterval fromYearMonthString (java.lang.String input)  { throw new RuntimeException(); }
  /**
   * Parse year-month interval in form: [+|-]YYYY-MM
   * <p>
   * adapted from HiveIntervalYearMonth.valueOf
   * Below interval conversion patterns are supported:
   * - YEAR TO (YEAR|MONTH)
   * @param input (undocumented)
   * @param startField (undocumented)
   * @param endField (undocumented)
   * @return (undocumented)
   */
  static public  org.apache.spark.unsafe.types.CalendarInterval fromYearMonthString (java.lang.String input, byte startField, byte endField)  { throw new RuntimeException(); }
  static public  long castStringToDTInterval (org.apache.spark.unsafe.types.UTF8String input, byte startField, byte endField)  { throw new RuntimeException(); }
  static public  long toDTInterval (java.lang.String day, java.lang.String hour, java.lang.String minute, java.lang.String second, int sign)  { throw new RuntimeException(); }
  static public  long toDTInterval (java.lang.String hour, java.lang.String minute, java.lang.String second, int sign)  { throw new RuntimeException(); }
  static public  long toDTInterval (java.lang.String minute, java.lang.String second, int sign)  { throw new RuntimeException(); }
  static public  org.apache.spark.unsafe.types.CalendarInterval castDayTimeStringToInterval (java.lang.String input, byte startField, byte endField)  { throw new RuntimeException(); }
  /**
   * Parse day-time interval in form: [-]d HH:mm:ss.nnnnnnnnn and [-]HH:mm:ss.nnnnnnnnn
   * <p>
   * adapted from HiveIntervalDayTime.valueOf
   * @param s (undocumented)
   * @return (undocumented)
   */
  static public  org.apache.spark.unsafe.types.CalendarInterval fromDayTimeString (java.lang.String s)  { throw new RuntimeException(); }
  /**
   * Parse day-time interval in form: [-]d HH:mm:ss.nnnnnnnnn and [-]HH:mm:ss.nnnnnnnnn
   * <p>
   * adapted from HiveIntervalDayTime.valueOf.
   * Below interval conversion patterns are supported:
   * - DAY TO (DAY|HOUR|MINUTE|SECOND)
   * - HOUR TO (HOUR|MINUTE|SECOND)
   * - MINUTE TO (MINUTE|SECOND)
   * @param input (undocumented)
   * @param from (undocumented)
   * @param to (undocumented)
   * @return (undocumented)
   */
  static public  org.apache.spark.unsafe.types.CalendarInterval fromDayTimeString (java.lang.String input, byte from, byte to)  { throw new RuntimeException(); }
  /**
   * Parse all kinds of interval literals including unit-to-unit form and unit list form
   * @param input (undocumented)
   * @return (undocumented)
   */
  static public  org.apache.spark.unsafe.types.CalendarInterval fromIntervalString (java.lang.String input)  { throw new RuntimeException(); }
  /**
   * Gets interval duration
   * <p>
   * @param interval The interval to get duration
   * @param targetUnit Time units of the result
   * @param daysPerMonth The number of days per one month. The default value is 31 days
   *                     per month. This value was taken as the default because it is used
   *                     in Structured Streaming for watermark calculations. Having 31 days
   *                     per month, we can guarantee that events are not dropped before
   *                     the end of any month (February with 29 days or January with 31 days).
   * @return Duration in the specified time units
   */
  static public  long getDuration (org.apache.spark.unsafe.types.CalendarInterval interval, java.util.concurrent.TimeUnit targetUnit, int daysPerMonth)  { throw new RuntimeException(); }
  /**
   * Checks the interval is negative
   * <p>
   * @param interval The checked interval
   * @param daysPerMonth The number of days per one month. The default value is 31 days
   *                     per month. This value was taken as the default because it is used
   *                     in Structured Streaming for watermark calculations. Having 31 days
   *                     per month, we can guarantee that events are not dropped before
   *                     the end of any month (February with 29 days or January with 31 days).
   * @return true if duration of the given interval is less than 0 otherwise false
   */
  static public  boolean isNegative (org.apache.spark.unsafe.types.CalendarInterval interval, int daysPerMonth)  { throw new RuntimeException(); }
  /**
   * Unary minus, return the negated the calendar interval value.
   * <p>
   * @throws ArithmeticException if the result overflows any field value
   * @param interval (undocumented)
   * @return (undocumented)
   */
  static public  org.apache.spark.unsafe.types.CalendarInterval negateExact (org.apache.spark.unsafe.types.CalendarInterval interval)  { throw new RuntimeException(); }
  /**
   * Unary minus, return the negated the calendar interval value.
   * @param interval (undocumented)
   * @return (undocumented)
   */
  static public  org.apache.spark.unsafe.types.CalendarInterval negate (org.apache.spark.unsafe.types.CalendarInterval interval)  { throw new RuntimeException(); }
  /**
   * Return a new calendar interval instance of the sum of two intervals.
   * <p>
   * @throws ArithmeticException if the result overflows any field value
   * @param left (undocumented)
   * @param right (undocumented)
   * @return (undocumented)
   */
  static public  org.apache.spark.unsafe.types.CalendarInterval addExact (org.apache.spark.unsafe.types.CalendarInterval left, org.apache.spark.unsafe.types.CalendarInterval right)  { throw new RuntimeException(); }
  /**
   * Return a new calendar interval instance of the sum of two intervals.
   * @param left (undocumented)
   * @param right (undocumented)
   * @return (undocumented)
   */
  static public  org.apache.spark.unsafe.types.CalendarInterval add (org.apache.spark.unsafe.types.CalendarInterval left, org.apache.spark.unsafe.types.CalendarInterval right)  { throw new RuntimeException(); }
  /**
   * Return a new calendar interval instance of the left interval minus the right one.
   * <p>
   * @throws ArithmeticException if the result overflows any field value
   * @param left (undocumented)
   * @param right (undocumented)
   * @return (undocumented)
   */
  static public  org.apache.spark.unsafe.types.CalendarInterval subtractExact (org.apache.spark.unsafe.types.CalendarInterval left, org.apache.spark.unsafe.types.CalendarInterval right)  { throw new RuntimeException(); }
  /**
   * Return a new calendar interval instance of the left interval minus the right one.
   * @param left (undocumented)
   * @param right (undocumented)
   * @return (undocumented)
   */
  static public  org.apache.spark.unsafe.types.CalendarInterval subtract (org.apache.spark.unsafe.types.CalendarInterval left, org.apache.spark.unsafe.types.CalendarInterval right)  { throw new RuntimeException(); }
  /**
   * Return a new calendar interval instance of the left interval times a multiplier.
   * @param interval (undocumented)
   * @param num (undocumented)
   * @return (undocumented)
   */
  static public  org.apache.spark.unsafe.types.CalendarInterval multiply (org.apache.spark.unsafe.types.CalendarInterval interval, double num)  { throw new RuntimeException(); }
  /**
   * Return a new calendar interval instance of the left interval times a multiplier.
   * <p>
   * @throws ArithmeticException if the result overflows any field value
   * @param interval (undocumented)
   * @param num (undocumented)
   * @return (undocumented)
   */
  static public  org.apache.spark.unsafe.types.CalendarInterval multiplyExact (org.apache.spark.unsafe.types.CalendarInterval interval, double num)  { throw new RuntimeException(); }
  /**
   * Return a new calendar interval instance of the left interval divides by a dividend.
   * @param interval (undocumented)
   * @param num (undocumented)
   * @return (undocumented)
   */
  static public  org.apache.spark.unsafe.types.CalendarInterval divide (org.apache.spark.unsafe.types.CalendarInterval interval, double num)  { throw new RuntimeException(); }
  /**
   * Return a new calendar interval instance of the left interval divides by a dividend.
   * <p>
   * @throws ArithmeticException if the result overflows any field value or divided by zero
   * @param interval (undocumented)
   * @param num (undocumented)
   * @return (undocumented)
   */
  static public  org.apache.spark.unsafe.types.CalendarInterval divideExact (org.apache.spark.unsafe.types.CalendarInterval interval, double num)  { throw new RuntimeException(); }
  /**
   * A safe version of <code>stringToInterval</code>. It returns null for invalid input string.
   * @param input (undocumented)
   * @return (undocumented)
   */
  static public  org.apache.spark.unsafe.types.CalendarInterval safeStringToInterval (org.apache.spark.unsafe.types.UTF8String input)  { throw new RuntimeException(); }
  /**
   * Converts a string to {@link CalendarInterval} case-insensitively.
   * <p>
   * @throws IllegalArgumentException if the input string is not in valid interval format.
   * @param input (undocumented)
   * @return (undocumented)
   */
  static public  org.apache.spark.unsafe.types.CalendarInterval stringToInterval (org.apache.spark.unsafe.types.UTF8String input)  { throw new RuntimeException(); }
  static public  org.apache.spark.unsafe.types.CalendarInterval makeInterval (int years, int months, int weeks, int days, int hours, int mins, org.apache.spark.sql.types.Decimal secs)  { throw new RuntimeException(); }
  static public  long makeDayTimeInterval (int days, int hours, int mins, org.apache.spark.sql.types.Decimal secs)  { throw new RuntimeException(); }
  /**
   * Converts this duration to the total length in microseconds.
   * <p>
   * If this duration is too large to fit in a {@link Long} microseconds, then an
   * exception is thrown.
   * <p>
   * If this duration has greater than microsecond precision, then the conversion
   * will drop any excess precision information as though the amount in nanoseconds
   * was subject to integer division by one thousand.
   * <p>
   * @return The total length of the duration in microseconds
   * @throws ArithmeticException If numeric overflow occurs
   * @param duration (undocumented)
   */
  static public  long durationToMicros (java.time.Duration duration)  { throw new RuntimeException(); }
  static public  long durationToMicros (java.time.Duration duration, byte endField)  { throw new RuntimeException(); }
  /**
   * Obtains a {@link Duration} representing a number of microseconds.
   * <p>
   * @param micros The number of microseconds, positive or negative
   * @return A {@link Duration}, not null
   */
  static public  java.time.Duration microsToDuration (long micros)  { throw new RuntimeException(); }
  /**
   * Gets the total number of months in this period.
   * <p>
   * This returns the total number of months in the period by multiplying the
   * number of years by 12 and adding the number of months.
   * <p>
   * <p>
   * @return The total number of months in the period, may be negative
   * @throws ArithmeticException If numeric overflow occurs
   * @param period (undocumented)
   */
  static public  int periodToMonths (java.time.Period period)  { throw new RuntimeException(); }
  static public  int periodToMonths (java.time.Period period, byte endField)  { throw new RuntimeException(); }
  /**
   * Obtains a {@link Period} representing a number of months. The days unit will be zero, and the years
   * and months units will be normalized.
   * <p>
   * <p>
   * The months unit is adjusted to have an absolute value < 12, with the years unit being adjusted
   * to compensate. For example, the method returns "2 years and 3 months" for the 27 input months.
   * <p>
   * The sign of the years and months units will be the same after normalization.
   * For example, -13 months will be converted to "-1 year and -1 month".
   * <p>
   * @param months The number of months, positive or negative
   * @return The period of months, not null
   */
  static public  java.time.Period monthsToPeriod (int months)  { throw new RuntimeException(); }
  /**
   * Converts an year-month interval as a number of months to its textual representation
   * which conforms to the ANSI SQL standard.
   * <p>
   * @param months The number of months, positive or negative
   * @param style The style of textual representation of the interval
   * @param startField The start field (YEAR or MONTH) which the interval comprises of.
   * @param endField The end field (YEAR or MONTH) which the interval comprises of.
   * @return Year-month interval string
   */
  static public  java.lang.String toYearMonthIntervalString (int months, scala.Enumeration.Value style, byte startField, byte endField)  { throw new RuntimeException(); }
  /**
   * Converts a day-time interval as a number of microseconds to its textual representation
   * which conforms to the ANSI SQL standard.
   * <p>
   * @param micros The number of microseconds, positive or negative
   * @param style The style of textual representation of the interval
   * @param startField The start field (DAY, HOUR, MINUTE, SECOND) which the interval comprises of.
   * @param endField The end field (DAY, HOUR, MINUTE, SECOND) which the interval comprises of.
   * @return Day-time interval string
   */
  static public  java.lang.String toDayTimeIntervalString (long micros, scala.Enumeration.Value style, byte startField, byte endField)  { throw new RuntimeException(); }
  static public  int intToYearMonthInterval (int v, byte endField)  { throw new RuntimeException(); }
  static public  int longToYearMonthInterval (long v, byte endField)  { throw new RuntimeException(); }
  static public  int yearMonthIntervalToInt (int v, byte startField, byte endField)  { throw new RuntimeException(); }
  static public  short yearMonthIntervalToShort (int v, byte startField, byte endField)  { throw new RuntimeException(); }
  static public  byte yearMonthIntervalToByte (int v, byte startField, byte endField)  { throw new RuntimeException(); }
  static public  long intToDayTimeInterval (int v, byte endField)  { throw new RuntimeException(); }
  static public  long longToDayTimeInterval (long v, byte endField)  { throw new RuntimeException(); }
  static public  long dayTimeIntervalToLong (long v, byte startField, byte endField)  { throw new RuntimeException(); }
  static public  int dayTimeIntervalToInt (long v, byte startField, byte endField)  { throw new RuntimeException(); }
  static public  short dayTimeIntervalToShort (long v, byte startField, byte endField)  { throw new RuntimeException(); }
  static public  byte dayTimeIntervalToByte (long v, byte startField, byte endField)  { throw new RuntimeException(); }
}
