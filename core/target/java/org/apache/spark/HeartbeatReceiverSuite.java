package org.apache.spark;
/**
 * A test suite for the heartbeating behavior between the driver and the executors.
 */
public  class HeartbeatReceiverSuite extends org.apache.spark.SparkFunSuite implements org.scalatest.BeforeAndAfterEach, org.scalatest.PrivateMethodTester, org.apache.spark.LocalSparkContext {
  public   HeartbeatReceiverSuite ()  { throw new RuntimeException(); }
  public  org.scalatest.PrivateMethodTester.PrivateMethod$ PrivateMethod ()  { throw new RuntimeException(); }
  /**
   * After each test, clean up all state and stop the {@link SparkContext}.
   */
  public  void afterEach ()  { throw new RuntimeException(); }
  /**
   * Before each test, set up the SparkContext and a custom {@link HeartbeatReceiver}
   * that uses a manual clock.
   */
  public  void beforeEach ()  { throw new RuntimeException(); }
  public  org.apache.spark.SparkConf conf ()  { throw new RuntimeException(); }
  public  org.apache.spark.SparkContext sc ()  { throw new RuntimeException(); }
}
