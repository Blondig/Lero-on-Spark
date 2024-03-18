package org.apache.spark.examples;
/**
 * Usage: AccumulatorMetricsTest [numElem]
 * <p>
 * This example shows how to register accumulators against the accumulator source.
 * A simple RDD is created, and during the map, the accumulators are incremented.
 * <p>
 * The only argument, numElem, sets the number elements in the collection to parallelize.
 * <p>
 * The result is output to stdout in the driver with the values of the accumulators.
 * For the long accumulator, it should equal numElem the double accumulator should be
 * roughly 1.1 x numElem (within double precision.) This example also sets up a
 * ConsoleSink (metrics) instance, and so registered codahale metrics (like the
 * accumulator source) are reported to stdout as well.
 */
public  class AccumulatorMetricsTest {
  static public  void main (java.lang.String[] args)  { throw new RuntimeException(); }
}
