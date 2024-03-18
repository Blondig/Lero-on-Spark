package org.apache.spark.ml.util;
/**
 * A local {@link Stopwatch}.
 */
  class LocalStopwatch extends org.apache.spark.ml.util.Stopwatch {
  // not preceding
  public   LocalStopwatch (java.lang.String name)  { throw new RuntimeException(); }
  protected  void add (long duration)  { throw new RuntimeException(); }
  public  long elapsed ()  { throw new RuntimeException(); }
  public  java.lang.String name ()  { throw new RuntimeException(); }
}
