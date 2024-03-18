package org.apache.spark.deploy.yarn;
/**
 * Handles registering and unregistering the application with the YARN ResourceManager.
 */
  class YarnRMClient implements org.apache.spark.internal.Logging {
  public   YarnRMClient ()  { throw new RuntimeException(); }
  public  org.apache.spark.deploy.yarn.YarnAllocator createAllocator (org.apache.hadoop.yarn.conf.YarnConfiguration conf, org.apache.spark.SparkConf sparkConf, org.apache.hadoop.yarn.api.records.ApplicationAttemptId appAttemptId, java.lang.String driverUrl, org.apache.spark.rpc.RpcEndpointRef driverRef, org.apache.spark.SecurityManager securityMgr, scala.collection.immutable.Map<java.lang.String, org.apache.hadoop.yarn.api.records.LocalResource> localResources)  { throw new RuntimeException(); }
  /** Returns the configuration for the AmIpFilter to add to the Spark UI. */
  public  scala.collection.immutable.Map<java.lang.String, java.lang.String> getAmIpFilterParams (org.apache.hadoop.yarn.conf.YarnConfiguration conf, java.lang.String proxyBase)  { throw new RuntimeException(); }
  /** Returns the maximum number of attempts to register the AM. */
  public  int getMaxRegAttempts (org.apache.spark.SparkConf sparkConf, org.apache.hadoop.yarn.conf.YarnConfiguration yarnConf)  { throw new RuntimeException(); }
  /**
   * Registers the application master with the RM.
   * <p>
   * @param driverHost Host name where driver is running.
   * @param driverPort Port where driver is listening.
   * @param conf The Yarn configuration.
   * @param sparkConf The Spark configuration.
   * @param uiAddress Address of the SparkUI.
   * @param uiHistoryAddress Address of the application on the History Server.
   */
  public  void register (java.lang.String driverHost, int driverPort, org.apache.hadoop.yarn.conf.YarnConfiguration conf, org.apache.spark.SparkConf sparkConf, scala.Option<java.lang.String> uiAddress, java.lang.String uiHistoryAddress)  { throw new RuntimeException(); }
  /**
   * Unregister the AM. Guaranteed to only be called once.
   * <p>
   * @param status The final status of the AM.
   * @param diagnostics Diagnostics message to include in the final status.
   */
  public  void unregister (org.apache.hadoop.yarn.api.records.FinalApplicationStatus status, java.lang.String diagnostics)  { throw new RuntimeException(); }
}
