package org.apache.spark.sql.execution.streaming;
/**
 * A {@link Trigger} that processes all available data in multiple batches then terminates the query.
 */
public  class AvailableNowTrigger {
  static public abstract  boolean canEqual (Object that)  ;
  static public abstract  boolean equals (Object that)  ;
  static public abstract  Object productElement (int n)  ;
  static public abstract  int productArity ()  ;
  static public  scala.collection.Iterator<java.lang.Object> productIterator ()  { throw new RuntimeException(); }
  static public  java.lang.String productPrefix ()  { throw new RuntimeException(); }
}
