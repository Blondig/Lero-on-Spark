package org.apache.spark.ml.util;
/**
 * A distributed {@link Stopwatch} using Spark accumulator.
 * param:  sc SparkContext
 */
  class DistributedStopwatch extends org.apache.spark.ml.util.Stopwatch {
  // not preceding
  public   DistributedStopwatch (org.apache.spark.SparkContext sc, java.lang.String name)  { throw new RuntimeException(); }
  protected  void add (long duration)  { throw new RuntimeException(); }
  public  long elapsed ()  { throw new RuntimeException(); }
  public  java.lang.String name ()  { throw new RuntimeException(); }
}
