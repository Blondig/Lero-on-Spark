package org.apache.spark.sql.types;
/**
 * The type represents day-time intervals of the SQL standard. A day-time interval is made up
 * of a contiguous subset of the following fields:
 *   - SECOND, seconds within minutes and possibly fractions of a second [0..59.999999],
 *   - MINUTE, minutes within hours [0..59],
 *   - HOUR, hours within days [0..23],
 *   - DAY, days in the range [0..106751991].
 * <p>
 * <code>DayTimeIntervalType</code> represents positive as well as negative day-time intervals.
 * <p>
 * param:  startField The leftmost field which the type comprises of. Valid values:
 *                   0 (DAY), 1 (HOUR), 2 (MINUTE), 3 (SECOND).
 * param:  endField The rightmost field which the type comprises of. Valid values:
 *                 0 (DAY), 1 (HOUR), 2 (MINUTE), 3 (SECOND).
 * <p>
 * @since 3.2.0
 */
public  class DayTimeIntervalType extends org.apache.spark.sql.types.AnsiIntervalType implements scala.Product, scala.Serializable {
  static public  byte DAY ()  { throw new RuntimeException(); }
  static public  byte HOUR ()  { throw new RuntimeException(); }
  static public  byte MINUTE ()  { throw new RuntimeException(); }
  static public  byte SECOND ()  { throw new RuntimeException(); }
  static public  scala.collection.Seq<java.lang.Object> dayTimeFields ()  { throw new RuntimeException(); }
  static public  java.lang.String fieldToString (byte field)  { throw new RuntimeException(); }
  static public  scala.collection.immutable.Map<java.lang.String, java.lang.Object> stringToField ()  { throw new RuntimeException(); }
  static public  org.apache.spark.sql.types.DayTimeIntervalType DEFAULT ()  { throw new RuntimeException(); }
  static public  org.apache.spark.sql.types.DayTimeIntervalType apply ()  { throw new RuntimeException(); }
  static public  org.apache.spark.sql.types.DayTimeIntervalType apply (byte field)  { throw new RuntimeException(); }
  static   org.apache.spark.sql.types.DataType defaultConcreteType ()  { throw new RuntimeException(); }
  static   boolean acceptsType (org.apache.spark.sql.types.DataType other)  { throw new RuntimeException(); }
  static   java.lang.String simpleString ()  { throw new RuntimeException(); }
  static public abstract  boolean canEqual (Object that)  ;
  static public abstract  boolean equals (Object that)  ;
  static public abstract  Object productElement (int n)  ;
  static public abstract  int productArity ()  ;
  static public  scala.collection.Iterator<java.lang.Object> productIterator ()  { throw new RuntimeException(); }
  static public  java.lang.String productPrefix ()  { throw new RuntimeException(); }
  public  byte startField ()  { throw new RuntimeException(); }
  public  byte endField ()  { throw new RuntimeException(); }
  // not preceding
  public   DayTimeIntervalType (byte startField, byte endField)  { throw new RuntimeException(); }
  // not preceding
    scala.reflect.api.TypeTags.TypeTag<java.lang.Object> tag ()  { throw new RuntimeException(); }
    scala.math.Ordering<java.lang.Object> ordering ()  { throw new RuntimeException(); }
  /**
   * The day-time interval type has constant precision. A value of the type always occupies 8 bytes.
   * The DAY field is constrained by the upper bound 106751991 to fit to <code>Long</code>.
   * @return (undocumented)
   */
  public  int defaultSize ()  { throw new RuntimeException(); }
    org.apache.spark.sql.types.DayTimeIntervalType asNullable ()  { throw new RuntimeException(); }
  public  java.lang.String typeName ()  { throw new RuntimeException(); }
}
