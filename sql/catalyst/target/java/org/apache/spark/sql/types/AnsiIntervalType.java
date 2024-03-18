package org.apache.spark.sql.types;
/**
 * The interval type which conforms to the ANSI SQL standard.
 */
 abstract class AnsiIntervalType extends org.apache.spark.sql.types.AtomicType {
  public   AnsiIntervalType ()  { throw new RuntimeException(); }
}
