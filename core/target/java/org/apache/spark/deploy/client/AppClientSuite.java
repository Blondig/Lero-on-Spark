package org.apache.spark.deploy.client;
/**
 * End-to-end tests for application client in standalone mode.
 */
public  class AppClientSuite extends org.apache.spark.SparkFunSuite implements org.apache.spark.LocalSparkContext, org.scalatest.BeforeAndAfterAll, org.scalatest.concurrent.Eventually, org.scalatest.concurrent.ScalaFutures {
  public   AppClientSuite ()  { throw new RuntimeException(); }
  public  org.scalatest.concurrent.AbstractPatienceConfiguration.PatienceConfig$ PatienceConfig ()  { throw new RuntimeException(); }
  public  void afterAll ()  { throw new RuntimeException(); }
  /**
   * Start the local cluster.
   * Note: local-cluster mode is insufficient because we want a reference to the Master.
   */
  public  void beforeAll ()  { throw new RuntimeException(); }
    int jsAdjustment ()  { throw new RuntimeException(); }
  public  org.apache.spark.SparkContext sc ()  { throw new RuntimeException(); }
}
