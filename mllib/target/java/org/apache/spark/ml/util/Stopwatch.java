package org.apache.spark.ml.util;
/**
 * Abstract class for stopwatches.
 */
 abstract class Stopwatch implements scala.Serializable {
  public   Stopwatch ()  { throw new RuntimeException(); }
  /**
   * Adds input duration to total elapsed time.
   * @param duration (undocumented)
   */
  protected abstract  void add (long duration)  ;
  /**
   * Returns total elapsed time in milliseconds, not counting the current session if the stopwatch
   * is running.
   * @return (undocumented)
   */
  public abstract  long elapsed ()  ;
  /**
   * Checks whether the stopwatch is running.
   * @return (undocumented)
   */
  public  boolean isRunning ()  { throw new RuntimeException(); }
  /**
   * Name of the stopwatch.
   * @return (undocumented)
   */
  public abstract  java.lang.String name ()  ;
  /**
   * Gets the current time in milliseconds.
   * @return (undocumented)
   */
  protected  long now ()  { throw new RuntimeException(); }
  /**
   * Starts the stopwatch.
   * Throws an exception if the stopwatch is already running.
   */
  public  void start ()  { throw new RuntimeException(); }
  /**
   * Stops the stopwatch and returns the duration of the last session in milliseconds.
   * Throws an exception if the stopwatch is not running.
   * @return (undocumented)
   */
  public  long stop ()  { throw new RuntimeException(); }
  public  java.lang.String toString ()  { throw new RuntimeException(); }
}
