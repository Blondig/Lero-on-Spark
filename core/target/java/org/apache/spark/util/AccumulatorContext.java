package org.apache.spark.util;
/**
 * An internal class used to track accumulators by Spark itself.
 */
public  class AccumulatorContext {
  /**
   * Returns a globally unique ID for a new {@link AccumulatorV2}.
   * Note: Once you copy the {@link AccumulatorV2} the ID is no longer unique.
   * @return (undocumented)
   */
  static public  long newId ()  { throw new RuntimeException(); }
  /** Returns the number of accumulators registered. Used in testing. */
  static public  int numAccums ()  { throw new RuntimeException(); }
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
  static public  void register (org.apache.spark.util.AccumulatorV2<?, ?> a)  { throw new RuntimeException(); }
  /**
   * Unregisters the {@link AccumulatorV2} with the given ID, if any.
   * @param id (undocumented)
   */
  static public  void remove (long id)  { throw new RuntimeException(); }
  /**
   * Returns the {@link AccumulatorV2} registered with the given ID, if any.
   * @param id (undocumented)
   * @return (undocumented)
   */
  static public  scala.Option<org.apache.spark.util.AccumulatorV2<?, ?>> get (long id)  { throw new RuntimeException(); }
  /**
   * Clears all registered {@link AccumulatorV2}s. For testing only.
   */
  static public  void clear ()  { throw new RuntimeException(); }
  /** Naive way to reduce the duplicate Some objects for values 0 and -1
   *  TODO: Eventually if this spreads out to more values then using
   *  Guava's weak interner would be a better solution.
   * @param value (undocumented)
   * @return (undocumented)
   */
  static public  scala.Option<java.lang.Object> internOption (scala.Option<java.lang.Object> value)  { throw new RuntimeException(); }
  static   java.lang.String SQL_ACCUM_IDENTIFIER ()  { throw new RuntimeException(); }
  static public  org.slf4j.Logger org$apache$spark$internal$Logging$$log_ ()  { throw new RuntimeException(); }
  static public  void org$apache$spark$internal$Logging$$log__$eq (org.slf4j.Logger x$1)  { throw new RuntimeException(); }
  static protected  java.lang.String logName ()  { throw new RuntimeException(); }
  static protected  org.slf4j.Logger log ()  { throw new RuntimeException(); }
  static protected  void logInfo (scala.Function0<java.lang.String> msg)  { throw new RuntimeException(); }
  static protected  void logDebug (scala.Function0<java.lang.String> msg)  { throw new RuntimeException(); }
  static protected  void logTrace (scala.Function0<java.lang.String> msg)  { throw new RuntimeException(); }
  static protected  void logWarning (scala.Function0<java.lang.String> msg)  { throw new RuntimeException(); }
  static protected  void logError (scala.Function0<java.lang.String> msg)  { throw new RuntimeException(); }
  static protected  void logInfo (scala.Function0<java.lang.String> msg, java.lang.Throwable throwable)  { throw new RuntimeException(); }
  static protected  void logDebug (scala.Function0<java.lang.String> msg, java.lang.Throwable throwable)  { throw new RuntimeException(); }
  static protected  void logTrace (scala.Function0<java.lang.String> msg, java.lang.Throwable throwable)  { throw new RuntimeException(); }
  static protected  void logWarning (scala.Function0<java.lang.String> msg, java.lang.Throwable throwable)  { throw new RuntimeException(); }
  static protected  void logError (scala.Function0<java.lang.String> msg, java.lang.Throwable throwable)  { throw new RuntimeException(); }
  static protected  boolean isTraceEnabled ()  { throw new RuntimeException(); }
  static protected  void initializeLogIfNecessary (boolean isInterpreter)  { throw new RuntimeException(); }
  static protected  boolean initializeLogIfNecessary (boolean isInterpreter, boolean silent)  { throw new RuntimeException(); }
  static protected  boolean initializeLogIfNecessary$default$2 ()  { throw new RuntimeException(); }
  static   void initializeForcefully (boolean isInterpreter, boolean silent)  { throw new RuntimeException(); }
}
