package org.apache.spark.sql.types;
/**
 * The timestamp without time zone type represents a local time in microsecond precision,
 * which is independent of time zone.
 * Its valid range is [0001-01-01T00:00:00.000000, 9999-12-31T23:59:59.999999].
 * To represent an absolute point in time, use <code>TimestampType</code> instead.
 * <p>
 * Please use the singleton <code>DataTypes.TimestampNTZType</code> to refer the type.
 */
  class TimestampNTZType extends org.apache.spark.sql.types.DatetimeType {
  static   boolean unapply (org.apache.spark.sql.catalyst.expressions.Expression e)  { throw new RuntimeException(); }
  static   org.json4s.JsonAST.JValue jsonValue ()  { throw new RuntimeException(); }
  static public  java.lang.String json ()  { throw new RuntimeException(); }
  static public  java.lang.String prettyJson ()  { throw new RuntimeException(); }
  static public  java.lang.String simpleString ()  { throw new RuntimeException(); }
  static public  java.lang.String catalogString ()  { throw new RuntimeException(); }
  static   java.lang.String simpleString (int maxNumberFields)  { throw new RuntimeException(); }
  static public  java.lang.String sql ()  { throw new RuntimeException(); }
  static   boolean sameType (org.apache.spark.sql.types.DataType other)  { throw new RuntimeException(); }
  static   boolean existsRecursively (scala.Function1<org.apache.spark.sql.types.DataType, java.lang.Object> f)  { throw new RuntimeException(); }
  static   org.apache.spark.sql.types.DataType defaultConcreteType ()  { throw new RuntimeException(); }
  static   boolean acceptsType (org.apache.spark.sql.types.DataType other)  { throw new RuntimeException(); }
  static public abstract  boolean canEqual (Object that)  ;
  static public abstract  boolean equals (Object that)  ;
  static public abstract  Object productElement (int n)  ;
  static public abstract  int productArity ()  ;
  static public  scala.collection.Iterator<java.lang.Object> productIterator ()  { throw new RuntimeException(); }
  static public  java.lang.String productPrefix ()  { throw new RuntimeException(); }
  // not preceding
    scala.reflect.api.TypeTags.TypeTag<java.lang.Object> tag ()  { throw new RuntimeException(); }
    scala.math.Ordering<java.lang.Object> ordering ()  { throw new RuntimeException(); }
  /**
   * The default size of a value of the TimestampNTZType is 8 bytes.
   * @return (undocumented)
   */
  public  int defaultSize ()  { throw new RuntimeException(); }
  public  java.lang.String typeName ()  { throw new RuntimeException(); }
    org.apache.spark.sql.types.TimestampNTZType asNullable ()  { throw new RuntimeException(); }
}
