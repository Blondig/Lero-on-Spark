package org.apache.spark.util;
  class SparkShutdownHookManager {
  public   SparkShutdownHookManager ()  { throw new RuntimeException(); }
  public  java.lang.Object add (int priority, scala.Function0<scala.runtime.BoxedUnit> hook)  { throw new RuntimeException(); }
  /**
   * Install a hook to run at shutdown and run all registered hooks in order.
   */
  public  void install ()  { throw new RuntimeException(); }
  public  boolean remove (java.lang.Object ref)  { throw new RuntimeException(); }
  public  void runAll ()  { throw new RuntimeException(); }
}
