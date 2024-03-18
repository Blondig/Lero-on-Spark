package org.apache.spark.metrics.source;
/**
 * :: Experimental ::
 * Metrics source specifically for LongAccumulators. Accumulators
 * are only valid on the driver side, so these metrics are reported
 * only by the driver.
 * Register LongAccumulators using:
 *    LongAccumulatorSource.register(sc, {"name" -> longAccumulator})
 */
public  class LongAccumulatorSource$ {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final LongAccumulatorSource$ MODULE$ = null;
  public   LongAccumulatorSource$ ()  { throw new RuntimeException(); }
  public  void register (org.apache.spark.SparkContext sc, scala.collection.immutable.Map<java.lang.String, org.apache.spark.util.LongAccumulator> accumulators)  { throw new RuntimeException(); }
}
