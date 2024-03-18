package org.apache.spark.metrics.source;
/**
 * :: Experimental ::
 * Metrics source specifically for DoubleAccumulators. Accumulators
 * are only valid on the driver side, so these metrics are reported
 * only by the driver.
 * Register DoubleAccumulators using:
 *    DoubleAccumulatorSource.register(sc, {"name" -> doubleAccumulator})
 */
public  class DoubleAccumulatorSource$ {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final DoubleAccumulatorSource$ MODULE$ = null;
  public   DoubleAccumulatorSource$ ()  { throw new RuntimeException(); }
  public  void register (org.apache.spark.SparkContext sc, scala.collection.immutable.Map<java.lang.String, org.apache.spark.util.DoubleAccumulator> accumulators)  { throw new RuntimeException(); }
}
