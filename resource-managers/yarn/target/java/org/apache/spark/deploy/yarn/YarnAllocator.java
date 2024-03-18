package org.apache.spark.deploy.yarn;
/**
 * YarnAllocator is charged with requesting containers from the YARN ResourceManager and deciding
 * what to do with containers when YARN fulfills these requests.
 * <p>
 * This class makes use of YARN's AMRMClient APIs. We interact with the AMRMClient in three ways:
 * * Making our resource needs known, which updates local bookkeeping about containers requested.
 * * Calling "allocate", which syncs our local container requests with the RM, and returns any
 *   containers that YARN has granted to us.  This also functions as a heartbeat.
 * * Processing the containers granted to us to possibly launch executors inside of them.
 * <p>
 * The public methods of this class are thread-safe.  All methods that mutate state are
 * synchronized.
 */
  class YarnAllocator implements org.apache.spark.internal.Logging {
  static public  java.lang.String MEM_REGEX ()  { throw new RuntimeException(); }
  static public  int VMEM_EXCEEDED_EXIT_CODE ()  { throw new RuntimeException(); }
  static public  int PMEM_EXCEEDED_EXIT_CODE ()  { throw new RuntimeException(); }
  static public  scala.collection.immutable.Set<java.lang.Object> NOT_APP_AND_SYSTEM_FAULT_EXIT_STATUS ()  { throw new RuntimeException(); }
  public   YarnAllocator (java.lang.String driverUrl, org.apache.spark.rpc.RpcEndpointRef driverRef, org.apache.hadoop.yarn.conf.YarnConfiguration conf, org.apache.spark.SparkConf sparkConf, org.apache.hadoop.yarn.client.api.AMRMClient<org.apache.hadoop.yarn.client.api.AMRMClient.ContainerRequest> amClient, org.apache.hadoop.yarn.api.records.ApplicationAttemptId appAttemptId, org.apache.spark.SecurityManager securityMgr, scala.collection.immutable.Map<java.lang.String, org.apache.hadoop.yarn.api.records.LocalResource> localResources, org.apache.spark.deploy.yarn.SparkRackResolver resolver, org.apache.spark.util.Clock clock)  { throw new RuntimeException(); }
  public  scala.collection.mutable.HashMap<java.lang.Object, scala.collection.mutable.HashMap<java.lang.String, scala.collection.mutable.Set<org.apache.hadoop.yarn.api.records.ContainerId>>> allocatedHostToContainersMapPerRPId ()  { throw new RuntimeException(); }
  public  scala.collection.mutable.HashMap<org.apache.hadoop.yarn.api.records.ContainerId, java.lang.String> allocatedContainerToHostMap ()  { throw new RuntimeException(); }
    scala.collection.mutable.HashMap<java.lang.String, org.apache.hadoop.yarn.api.records.Container> executorIdToContainer ()  { throw new RuntimeException(); }
    java.util.concurrent.ConcurrentHashMap<java.lang.Object, org.apache.hadoop.yarn.api.records.Resource> rpIdToYarnResource ()  { throw new RuntimeException(); }
    scala.collection.mutable.HashMap<java.lang.Object, org.apache.spark.resource.ResourceProfile> rpIdToResourceProfile ()  { throw new RuntimeException(); }
    scala.collection.immutable.Map<java.lang.Object, java.lang.Object> numLocalityAwareTasksPerResourceProfileId ()  { throw new RuntimeException(); }
    org.apache.spark.deploy.yarn.FailureTracker failureTracker ()  { throw new RuntimeException(); }
    org.apache.spark.deploy.yarn.LocalityPreferredContainerPlacementStrategy containerPlacementStrategy ()  { throw new RuntimeException(); }
  public  int getNumExecutorsRunning ()  { throw new RuntimeException(); }
  public  int getNumLocalityAwareTasks ()  { throw new RuntimeException(); }
  public  int getNumExecutorsStarting ()  { throw new RuntimeException(); }
  public  int getNumReleasedContainers ()  { throw new RuntimeException(); }
  public  int getNumExecutorsFailed ()  { throw new RuntimeException(); }
  public  boolean isAllNodeExcluded ()  { throw new RuntimeException(); }
  /**
   * A sequence of pending container requests that have not yet been fulfilled.
   * ResourceProfile id -> pendingAllocate container request
   * @return (undocumented)
   */
  public  scala.collection.immutable.Map<java.lang.Object, scala.collection.Seq<org.apache.hadoop.yarn.client.api.AMRMClient.ContainerRequest>> getPendingAllocate ()  { throw new RuntimeException(); }
  public  int getNumContainersPendingAllocate ()  { throw new RuntimeException(); }
  /**
   * Request as many executors from the ResourceManager as needed to reach the desired total. If
   * the requested total is smaller than the current number of running executors, no executors will
   * be killed.
   * @param resourceProfileToTotalExecs total number of containers requested for each
   *                                    ResourceProfile
   * @param numLocalityAwareTasksPerResourceProfileId number of locality aware tasks for each
   *                                                  ResourceProfile id to be used as container
   *                                                  placement hint.
   * @param hostToLocalTaskCount a map of preferred hostname to possible task counts for each
   *                             ResourceProfile id to be used as container placement hint.
   * @param excludedNodes excluded nodes, which is passed in to avoid allocating new containers
   *                      on them. It will be used to update the applications excluded node list.
   * @return Whether the new requested total is different than the old value.
   * @param hostToLocalTaskCountPerResourceProfileId (undocumented)
   */
  public  boolean requestTotalExecutorsWithPreferredLocalities (scala.collection.immutable.Map<org.apache.spark.resource.ResourceProfile, java.lang.Object> resourceProfileToTotalExecs, scala.collection.immutable.Map<java.lang.Object, java.lang.Object> numLocalityAwareTasksPerResourceProfileId, scala.collection.immutable.Map<java.lang.Object, scala.collection.immutable.Map<java.lang.String, java.lang.Object>> hostToLocalTaskCountPerResourceProfileId, scala.collection.immutable.Set<java.lang.String> excludedNodes)  { throw new RuntimeException(); }
  /**
   * Request that the ResourceManager release the container running the specified executor.
   * @param executorId (undocumented)
   */
  public  void killExecutor (java.lang.String executorId)  { throw new RuntimeException(); }
  /**
   * Request resources such that, if YARN gives us all we ask for, we'll have a number of containers
   * equal to maxExecutors.
   * <p>
   * Deal with any containers YARN has granted to us by possibly launching executors in them.
   * <p>
   * This must be synchronized because variables read in this method are mutated by other methods.
   */
  public  void allocateResources ()  { throw new RuntimeException(); }
  /**
   * Update the set of container requests that we will sync with the RM based on the number of
   * executors we have currently running and our target number of executors for each
   * ResourceProfile.
   * <p>
   * Visible for testing.
   */
  public  void updateResourceRequests ()  { throw new RuntimeException(); }
  public  void stop ()  { throw new RuntimeException(); }
  /**
   * Handle containers granted by the RM by launching executors on them.
   * <p>
   * Due to the way the YARN allocation protocol works, certain healthy race conditions can result
   * in YARN granting containers that we no longer need. In this case, we release them.
   * <p>
   * Visible for testing.
   * @param allocatedContainers (undocumented)
   */
  public  void handleAllocatedContainers (scala.collection.Seq<org.apache.hadoop.yarn.api.records.Container> allocatedContainers)  { throw new RuntimeException(); }
    void processCompletedContainers (scala.collection.Seq<org.apache.hadoop.yarn.api.records.ContainerStatus> completedContainers)  { throw new RuntimeException(); }
  /**
   * Register that some RpcCallContext has asked the AM why the executor was lost. Note that
   * we can only find the loss reason to send back in the next call to allocateResources().
   * @param eid (undocumented)
   * @param context (undocumented)
   */
    void enqueueGetLossReasonRequest (java.lang.String eid, org.apache.spark.rpc.RpcCallContext context)  { throw new RuntimeException(); }
    long getNumUnexpectedContainerRelease ()  { throw new RuntimeException(); }
    int getNumPendingLossReasonRequests ()  { throw new RuntimeException(); }
}
