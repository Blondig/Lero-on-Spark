package org.apache.spark.util;
/**
 * Contains utilities for working with posix signals.
 */
public  class SignalUtils$ implements org.apache.spark.internal.Logging {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final SignalUtils$ MODULE$ = null;
  public   SignalUtils$ ()  { throw new RuntimeException(); }
  /** Register a signal handler to log signals on UNIX-like systems. */
  public  void registerLogger (org.slf4j.Logger log)  { throw new RuntimeException(); }
  /**
   * Adds an action to be run when a given signal is received by this process.
   * <p>
   * Note that signals are only supported on unix-like operating systems and work on a best-effort
   * basis: if a signal is not available or cannot be intercepted, only a warning is emitted.
   * <p>
   * All actions for a given signal are run in a separate thread.
   * @param signal (undocumented)
   * @param action (undocumented)
   */
  public  void register (java.lang.String signal, scala.Function0<java.lang.Object> action)  { throw new RuntimeException(); }
  /**
   * Adds an action to be run when a given signal is received by this process.
   * <p>
   * This method receives failMessage as additional parameter, which would be logged when it fails
   * to register the signal. Here the failures include the cases 1) OS doesn't support signal at
   * all 2) OS doesn't support given signal (Could be possible with non-POSIX signals)
   * <p>
   * All actions for a given signal are run in a separate thread.
   * @param signal (undocumented)
   * @param failMessage (undocumented)
   * @param logStackTrace (undocumented)
   * @param action (undocumented)
   */
  public  void register (java.lang.String signal, java.lang.String failMessage, boolean logStackTrace, scala.Function0<java.lang.Object> action)  { throw new RuntimeException(); }
}
