package org.apache.spark.scheduler;
/**
 * Unit tests for SparkListener that require a local cluster.
 */
public  class SparkListenerWithClusterSuite extends org.apache.spark.SparkFunSuite implements org.apache.spark.LocalSparkContext {
  public   SparkListenerWithClusterSuite ()  { throw new RuntimeException(); }
  /** Length of time to wait while draining listener events. */
  public  int WAIT_TIMEOUT_MILLIS ()  { throw new RuntimeException(); }
  public  void beforeEach ()  { throw new RuntimeException(); }
  public  org.apache.spark.SparkContext sc ()  { throw new RuntimeException(); }
}
