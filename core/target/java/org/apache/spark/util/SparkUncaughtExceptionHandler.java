package org.apache.spark.util;
/**
 * The default uncaught exception handler for Spark daemons. It terminates the whole process for
 * any Errors, and also terminates the process for Exceptions when the exitOnException flag is true.
 * <p>
 * param:  exitOnUncaughtException Whether to exit the process on UncaughtException.
 */
  class SparkUncaughtExceptionHandler implements java.lang.Thread.UncaughtExceptionHandler, org.apache.spark.internal.Logging {
  public  boolean exitOnUncaughtException ()  { throw new RuntimeException(); }
  // not preceding
  public   SparkUncaughtExceptionHandler (boolean exitOnUncaughtException)  { throw new RuntimeException(); }
  public  void uncaughtException (java.lang.Thread thread, java.lang.Throwable exception)  { throw new RuntimeException(); }
  public  void uncaughtException (java.lang.Throwable exception)  { throw new RuntimeException(); }
}
