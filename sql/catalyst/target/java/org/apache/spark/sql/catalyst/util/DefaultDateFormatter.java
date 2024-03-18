package org.apache.spark.sql.catalyst.util;
/**
 * The formatter for dates which doesn't require users to specify a pattern. While formatting,
 * it uses the default pattern {@link DateFormatter.defaultPattern}. In parsing, it follows the CAST
 * logic in conversion of strings to Catalyst's DateType.
 * <p>
 * param:  locale The locale overrides the system locale and is used in formatting.
 * param:  legacyFormat Defines the formatter used for legacy dates.
 * param:  isParsing Whether the formatter is used for parsing (<code>true</code>) or for formatting (<code>false</code>).
 */
public  class DefaultDateFormatter extends org.apache.spark.sql.catalyst.util.Iso8601DateFormatter {
  public   DefaultDateFormatter (java.util.Locale locale, scala.Enumeration.Value legacyFormat, boolean isParsing)  { throw new RuntimeException(); }
  public  int parse (java.lang.String s)  { throw new RuntimeException(); }
}
