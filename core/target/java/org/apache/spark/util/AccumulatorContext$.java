package org.apache.spark.util;
/**
 * An internal class used to track accumulators by Spark itself.
 */
public  class AccumulatorContext$ implements org.apache.spark.internal.Logging {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final AccumulatorContext$ MODULE$ = null;
  public   AccumulatorContext$ ()  { throw new RuntimeException(); }
  /**
   * Returns a globally unique ID for a new {@link AccumulatorV2}.
   * Note: Once you copy the {@link AccumulatorV2} the ID is no longer unique.
   * @return (undocumented)
   */
  public  long newId ()  { throw new RuntimeException(); }
  /** Returns the number of accumulators registered. Used in testing. */
  public  int numAccums ()  { throw new RuntimeException(); }
  /**
   * Registers an {@link AccumulatorV2} created on the driver such that it can be used on the executors.
   * <p>
   * All accumulators registered here can later be used as a container for accumulating partial
   * values across multiple tasks. This is what <code>org.apache.spark.scheduler.DAGScheduler</code> does.
   * Note: if an accumulator is registered here, it should also be registered with the active
   * context cleaner for cleanup so as to avoid memory leaks.
   * <p>
   * If an {@link AccumulatorV2} with the same ID was already registered, this does nothing instead
   * of overwriting it. We will never register same accumulator twice, this is just a sanity check.
   * @param a (undocumented)
   */
  public  void register (org.apache.spark.util.AccumulatorV2<?, ?> a)  { throw new RuntimeException(); }
  /**
   * Unregisters the {@link AccumulatorV2} with the given ID, if any.
   * @param id (undocumented)
   */
  public  void remove (long id)  { throw new RuntimeException(); }
  /**
   * Returns the {@link AccumulatorV2} registered with the given ID, if any.
   * @param id (undocumented)
   * @return (undocumented)
   */
  public  scala.Option<org.apache.spark.util.AccumulatorV2<?, ?>> get (long id)  { throw new RuntimeException(); }
  /**
   * Clears all registered {@link AccumulatorV2}s. For testing only.
   */
  public  void clear ()  { throw new RuntimeException(); }
  /** Naive way to reduce the duplicate Some objects for values 0 and -1
   *  TODO: Eventually if this spreads out to more values then using
   *  Guava's weak interner would be a better solution.
   * @param value (undocumented)
   * @return (undocumented)
   */
  public  scala.Option<java.lang.Object> internOption (scala.Option<java.lang.Object> value)  { throw new RuntimeException(); }
    java.lang.String SQL_ACCUM_IDENTIFIER ()  { throw new RuntimeException(); }
}
