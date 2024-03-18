package org.apache.spark.deploy;
/**
 * End-to-end tests for dynamic allocation in standalone mode.
 */
public  class StandaloneDynamicAllocationSuite extends org.apache.spark.SparkFunSuite implements org.apache.spark.LocalSparkContext, org.scalatest.BeforeAndAfterAll, org.scalatest.PrivateMethodTester {
  public  org.scalatest.PrivateMethodTester.PrivateMethod$ PrivateMethod ()  { throw new RuntimeException(); }
  public   StandaloneDynamicAllocationSuite ()  { throw new RuntimeException(); }
  public  void afterAll ()  { throw new RuntimeException(); }
  /**
   * Start the local cluster.
   * Note: local-cluster mode is insufficient because we want a reference to the Master.
   */
  public  void beforeAll ()  { throw new RuntimeException(); }
  public  org.apache.spark.SparkContext sc ()  { throw new RuntimeException(); }
}
