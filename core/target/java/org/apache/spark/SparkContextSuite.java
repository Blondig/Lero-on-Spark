package org.apache.spark;
public  class SparkContextSuite extends org.apache.spark.SparkFunSuite implements org.apache.spark.LocalSparkContext, org.scalatest.concurrent.Eventually {
  static public  boolean isTaskStarted ()  { throw new RuntimeException(); }
  static public  boolean taskKilled ()  { throw new RuntimeException(); }
  static public  boolean taskSucceeded ()  { throw new RuntimeException(); }
  static public  java.util.concurrent.Semaphore semaphore ()  { throw new RuntimeException(); }
  public  org.scalatest.concurrent.AbstractPatienceConfiguration.PatienceConfig$ PatienceConfig ()  { throw new RuntimeException(); }
  public  org.apache.spark.SparkContext sc ()  { throw new RuntimeException(); }
  public   SparkContextSuite ()  { throw new RuntimeException(); }
  public  void testCancellingTasks (java.lang.String desc, scala.Function0<scala.runtime.BoxedUnit> blockFn)  { throw new RuntimeException(); }
}
