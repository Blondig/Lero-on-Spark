package org.apache.spark.scheduler.cluster;
/**
 * Abstract Yarn scheduler backend that contains common logic
 * between the client and cluster Yarn scheduler backends.
 */
 abstract class YarnSchedulerBackend extends org.apache.spark.scheduler.cluster.CoarseGrainedSchedulerBackend {
  /**
   * An {@link RpcEndpoint} that communicates with the ApplicationMaster.
   */
  protected  class YarnSchedulerEndpoint implements org.apache.spark.rpc.ThreadSafeRpcEndpoint, org.apache.spark.internal.Logging {
    // not preceding
    public   YarnSchedulerEndpoint (org.apache.spark.rpc.RpcEnv rpcEnv)  { throw new RuntimeException(); }
      void handleClientModeDriverStop ()  { throw new RuntimeException(); }
      void handleExecutorDisconnectedFromDriver (java.lang.String executorId, org.apache.spark.rpc.RpcAddress executorRpcAddress)  { throw new RuntimeException(); }
    public  void onDisconnected (org.apache.spark.rpc.RpcAddress remoteAddress)  { throw new RuntimeException(); }
    public  scala.PartialFunction<java.lang.Object, scala.runtime.BoxedUnit> receive ()  { throw new RuntimeException(); }
    public  scala.PartialFunction<java.lang.Object, scala.runtime.BoxedUnit> receiveAndReply (org.apache.spark.rpc.RpcCallContext context)  { throw new RuntimeException(); }
    public  org.apache.spark.rpc.RpcEnv rpcEnv ()  { throw new RuntimeException(); }
  }
  static public  java.lang.String ENDPOINT_NAME ()  { throw new RuntimeException(); }
  // not preceding
  public   YarnSchedulerBackend (org.apache.spark.scheduler.TaskSchedulerImpl scheduler, org.apache.spark.SparkContext sc)  { throw new RuntimeException(); }
  public  double minRegisteredRatio ()  { throw new RuntimeException(); }
  protected  int totalExpectedExecutors ()  { throw new RuntimeException(); }
  protected  org.apache.spark.scheduler.cluster.YarnSchedulerBackend.YarnSchedulerEndpoint yarnSchedulerEndpoint ()  { throw new RuntimeException(); }
  protected  scala.Option<org.apache.spark.rpc.RpcEndpointRef> amEndpoint ()  { throw new RuntimeException(); }
  /** Application ID. */
  protected  scala.Option<org.apache.hadoop.yarn.api.records.ApplicationId> appId ()  { throw new RuntimeException(); }
  /**
   * Bind to YARN. This *must* be done before calling {@link start()}.
   * <p>
   * @param appId YARN application ID
   * @param attemptId Optional YARN attempt ID
   */
  protected  void bindToYarn (org.apache.hadoop.yarn.api.records.ApplicationId appId, scala.Option<org.apache.hadoop.yarn.api.records.ApplicationAttemptId> attemptId)  { throw new RuntimeException(); }
  protected  void startBindings ()  { throw new RuntimeException(); }
  public  void stop ()  { throw new RuntimeException(); }
  /**
   * Get the attempt ID for this run, if the cluster manager supports multiple
   * attempts. Applications run in client mode will not have attempt IDs.
   * This attempt ID only includes attempt counter, like "1", "2".
   * <p>
   * @return The application attempt id, if available.
   */
  public  scala.Option<java.lang.String> applicationAttemptId ()  { throw new RuntimeException(); }
  /**
   * Get an application ID associated with the job.
   * This returns the string value of {@link appId} if set, otherwise
   * the locally-generated ID from the superclass.
   * @return The application ID
   */
  public  java.lang.String applicationId ()  { throw new RuntimeException(); }
    org.apache.spark.scheduler.cluster.CoarseGrainedClusterMessages.RequestExecutors prepareRequestExecutors (scala.collection.immutable.Map<org.apache.spark.resource.ResourceProfile, java.lang.Object> resourceProfileToTotalExecs)  { throw new RuntimeException(); }
  /**
   * Request executors from the ApplicationMaster by specifying the total number desired.
   * This includes executors already pending or running.
   * @param resourceProfileToTotalExecs (undocumented)
   * @return (undocumented)
   */
  public  scala.concurrent.Future<java.lang.Object> doRequestTotalExecutors (scala.collection.immutable.Map<org.apache.spark.resource.ResourceProfile, java.lang.Object> resourceProfileToTotalExecs)  { throw new RuntimeException(); }
  /**
   * Request that the ApplicationMaster kill the specified executors.
   * @param executorIds (undocumented)
   * @return (undocumented)
   */
  public  scala.concurrent.Future<java.lang.Object> doKillExecutors (scala.collection.Seq<java.lang.String> executorIds)  { throw new RuntimeException(); }
  public  boolean sufficientResourcesRegistered ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.storage.BlockManagerId> getShufflePushMergerLocations (int numPartitions, int resourceProfileId)  { throw new RuntimeException(); }
  /**
   * Add filters to the SparkUI.
   * @param filterName (undocumented)
   * @param filterParams (undocumented)
   * @param proxyBase (undocumented)
   */
    void addWebUIFilter (java.lang.String filterName, scala.collection.immutable.Map<java.lang.String, java.lang.String> filterParams, java.lang.String proxyBase)  { throw new RuntimeException(); }
  public  org.apache.spark.scheduler.cluster.CoarseGrainedSchedulerBackend.DriverEndpoint createDriverEndpoint ()  { throw new RuntimeException(); }
  /**
   * Reset the state of SchedulerBackend to the initial state. This is happened when AM is failed
   * and re-registered itself to driver after a failure. The stale state in driver should be
   * cleaned.
   */
  protected  void reset ()  { throw new RuntimeException(); }
  protected  scala.Option<org.apache.spark.deploy.security.HadoopDelegationTokenManager> createTokenManager ()  { throw new RuntimeException(); }
}
