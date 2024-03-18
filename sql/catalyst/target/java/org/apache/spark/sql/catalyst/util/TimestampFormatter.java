package org.apache.spark.sql.catalyst.util;
public  interface TimestampFormatter extends scala.Serializable {
  /**
   * Parses a timestamp in a string and converts it to microseconds.
   * <p>
   * @param s - string with timestamp to parse
   * @return microseconds since epoch.
   * @throws ParseException can be thrown by legacy parser
   * @throws DateTimeParseException can be thrown by new parser
   * @throws DateTimeException unable to obtain local date or time
   */
  public  long parse (java.lang.String s) throws java.text.ParseException, java.time.format.DateTimeParseException, java.time.DateTimeException ;
  /**
   * Parses a timestamp in a string and converts it to an optional number of microseconds.
   * <p>
   * @param s - string with timestamp to parse
   * @return An optional number of microseconds since epoch. The result is None on invalid input.
   * @throws ParseException can be thrown by legacy parser
   * @throws DateTimeParseException can be thrown by new parser
   * @throws DateTimeException unable to obtain local date or time
   */
  public  scala.Option<java.lang.Object> parseOptional (java.lang.String s) throws java.text.ParseException, java.time.format.DateTimeParseException, java.time.DateTimeException ;
  /**
   * Parses a timestamp in a string and converts it to microseconds since Unix Epoch in local time.
   * <p>
   * @param s - string with timestamp to parse
   * @param allowTimeZone - indicates strict parsing of timezone
   * @return microseconds since epoch.
   * @throws ParseException can be thrown by legacy parser
   * @throws DateTimeParseException can be thrown by new parser
   * @throws DateTimeException unable to obtain local date or time
   * @throws IllegalStateException The formatter for timestamp without time zone should always
   *                               implement this method. The exception should never be hit.
   */
  public  long parseWithoutTimeZone (java.lang.String s, boolean allowTimeZone) throws java.text.ParseException, java.time.format.DateTimeParseException, java.time.DateTimeException, java.lang.IllegalStateException ;
  /**
   * Parses a timestamp in a string and converts it to an optional number of microseconds since
   * Unix Epoch in local time.
   * <p>
   * @param s - string with timestamp to parse
   * @param allowTimeZone - indicates strict parsing of timezone
   * @return An optional number of microseconds since epoch. The result is None on invalid input.
   * @throws ParseException can be thrown by legacy parser
   * @throws DateTimeParseException can be thrown by new parser
   * @throws DateTimeException unable to obtain local date or time
   * @throws IllegalStateException The formatter for timestamp without time zone should always
   *                               implement this method. The exception should never be hit.
   */
  public  scala.Option<java.lang.Object> parseWithoutTimeZoneOptional (java.lang.String s, boolean allowTimeZone) throws java.text.ParseException, java.time.format.DateTimeParseException, java.time.DateTimeException, java.lang.IllegalStateException ;
  /**
   * Parses a timestamp in a string and converts it to microseconds since Unix Epoch in local time.
   * Zone-id and zone-offset components are ignored.
   * @param s (undocumented)
   * @return (undocumented)
   */
  public  long parseWithoutTimeZone (java.lang.String s) throws java.text.ParseException, java.time.format.DateTimeParseException, java.time.DateTimeException, java.lang.IllegalStateException ;
  public  java.lang.String format (long us)  ;
  public  java.lang.String format (java.sql.Timestamp ts)  ;
  public  java.lang.String format (java.time.Instant instant)  ;
  public  java.lang.String format (java.time.LocalDateTime localDateTime) throws java.lang.IllegalStateException ;
  /**
   * Validates the pattern string.
   * @param checkLegacy  if true and the pattern is invalid, check whether the pattern is valid for
   *                     legacy formatters and show hints for using legacy formatter.
   *                     Otherwise, simply check the pattern string.
   */
  public  void validatePatternString (boolean checkLegacy)  ;
}
