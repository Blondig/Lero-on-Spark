package org.apache.spark.sql.catalyst.util;
/**
 * The formatter for timestamps which doesn't require users to specify a pattern. While formatting,
 * it uses the default pattern {@link TimestampFormatter.defaultPattern()}. In parsing, it follows
 * the CAST logic in conversion of strings to Catalyst's TimestampType.
 * <p>
 * param:  zoneId The time zone ID in which timestamps should be formatted or parsed.
 * param:  locale The locale overrides the system locale and is used in formatting.
 * param:  legacyFormat Defines the formatter used for legacy timestamps.
 * param:  isParsing Whether the formatter is used for parsing (<code>true</code>) or for formatting (<code>false</code>).
 */
public  class DefaultTimestampFormatter extends org.apache.spark.sql.catalyst.util.Iso8601TimestampFormatter {
  public   DefaultTimestampFormatter (java.time.ZoneId zoneId, java.util.Locale locale, scala.Enumeration.Value legacyFormat, boolean isParsing)  { throw new RuntimeException(); }
  public  long parse (java.lang.String s)  { throw new RuntimeException(); }
  public  scala.Option<java.lang.Object> parseOptional (java.lang.String s)  { throw new RuntimeException(); }
  public  long parseWithoutTimeZone (java.lang.String s, boolean allowTimeZone)  { throw new RuntimeException(); }
  public  scala.Option<java.lang.Object> parseWithoutTimeZoneOptional (java.lang.String s, boolean allowTimeZone)  { throw new RuntimeException(); }
}
