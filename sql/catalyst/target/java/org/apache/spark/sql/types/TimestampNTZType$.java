package org.apache.spark.sql.types;
/**
 * The companion case object and its class is separated so the companion object also subclasses
 * the TimestampNTZType class. Otherwise, the companion object would be of type
 * "TimestampNTZType" in byte code. Defined with a private constructor so the companion
 * object is the only possible instantiation.
 */
public  class TimestampNTZType$ extends org.apache.spark.sql.types.TimestampNTZType implements scala.Product, scala.Serializable {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final TimestampNTZType$ MODULE$ = null;
  public   TimestampNTZType$ ()  { throw new RuntimeException(); }
}
