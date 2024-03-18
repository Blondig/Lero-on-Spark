package org.apache.spark.sql.types;
/**
 * The type represents year-month intervals of the SQL standard. A year-month interval is made up
 * of a contiguous subset of the following fields:
 *   - MONTH, months within years [0..11],
 *   - YEAR, years in the range [0..178956970].
 * <p>
 * <code>YearMonthIntervalType</code> represents positive as well as negative year-month intervals.
 * <p>
 * param:  startField The leftmost field which the type comprises of. Valid values:
 *                   0 (YEAR), 1 (MONTH).
 * param:  endField The rightmost field which the type comprises of. Valid values:
 *                 0 (YEAR), 1 (MONTH).
 * <p>
 * @since 3.2.0
 */
public  class YearMonthIntervalType extends org.apache.spark.sql.types.AnsiIntervalType implements scala.Product, scala.Serializable {
  static public  byte YEAR ()  { throw new RuntimeException(); }
  static public  byte MONTH ()  { throw new RuntimeException(); }
  static public  scala.collection.Seq<java.lang.Object> yearMonthFields ()  { throw new RuntimeException(); }
  static public  java.lang.String fieldToString (byte field)  { throw new RuntimeException(); }
  static public  scala.collection.immutable.Map<java.lang.String, java.lang.Object> stringToField ()  { throw new RuntimeException(); }
  static public  org.apache.spark.sql.types.YearMonthIntervalType DEFAULT ()  { throw new RuntimeException(); }
  static public  org.apache.spark.sql.types.YearMonthIntervalType apply ()  { throw new RuntimeException(); }
  static public  org.apache.spark.sql.types.YearMonthIntervalType apply (byte field)  { throw new RuntimeException(); }
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
  public   YearMonthIntervalType (byte startField, byte endField)  { throw new RuntimeException(); }
  // not preceding
    scala.reflect.api.TypeTags.TypeTag<java.lang.Object> tag ()  { throw new RuntimeException(); }
    scala.math.Ordering<java.lang.Object> ordering ()  { throw new RuntimeException(); }
  /**
   * Year-month interval values always occupy 4 bytes.
   * The YEAR field is constrained by the upper bound 178956970 to fit to <code>Int</code>.
   * @return (undocumented)
   */
  public  int defaultSize ()  { throw new RuntimeException(); }
    org.apache.spark.sql.types.YearMonthIntervalType asNullable ()  { throw new RuntimeException(); }
  public  java.lang.String typeName ()  { throw new RuntimeException(); }
}
