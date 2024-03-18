package org.apache.spark;
/**
 * A client that communicates with the cluster manager to request or kill executors.
 * This is currently supported only in YARN mode.
 */
public  interface ExecutorAllocationClient {
  /**
   * Request that the cluster manager decommission the specified executor.
   * Delegates to decommissionExecutors.
   * <p>
   * @param executorId identifiers of executor to decommission
   * @param decommissionInfo information about the decommission (reason, host loss)
   * @param adjustTargetNumExecutors if we should adjust the target number of executors.
   * @param triggeredByExecutor whether the decommission is triggered at executor.
   *                            (TODO: add a new type like <code>ExecutorDecommissionInfo</code> for the
   *                            case where executor is decommissioned at executor first, so we
   *                            don't need this extra parameter.)
   * @return whether the request is acknowledged by the cluster manager.
   */
  public  boolean decommissionExecutor (java.lang.String executorId, org.apache.spark.scheduler.ExecutorDecommissionInfo decommissionInfo, boolean adjustTargetNumExecutors, boolean triggeredByExecutor)  ;
  /**
   * Request that the cluster manager decommission the specified executors.
   * Default implementation delegates to kill, scheduler must override
   * if it supports graceful decommissioning.
   * <p>
   * @param executorsAndDecomInfo identifiers of executors &amp; decom info.
   * @param adjustTargetNumExecutors whether the target number of executors will be adjusted down
   *                                 after these executors have been decommissioned.
   * @param triggeredByExecutor whether the decommission is triggered at executor.
   * @return the ids of the executors acknowledged by the cluster manager to be removed.
   */
  public  scala.collection.Seq<java.lang.String> decommissionExecutors (scala.Tuple2<java.lang.String, org.apache.spark.scheduler.ExecutorDecommissionInfo>[] executorsAndDecomInfo, boolean adjustTargetNumExecutors, boolean triggeredByExecutor)  ;
  /**
   * Request that the cluster manager decommission every executor on the specified host.
   * <p>
   * @return whether the request is acknowledged by the cluster manager.
   * @param host (undocumented)
   */
  public  boolean decommissionExecutorsOnHost (java.lang.String host)  ;
  /** Get the list of currently active executors */
    scala.collection.Seq<java.lang.String> getExecutorIds ()  ;
  /**
   * Whether an executor is active. An executor is active when it can be used to execute tasks
   * for jobs submitted by the application.
   * <p>
   * @return whether the executor with the given ID is currently active.
   * @param id (undocumented)
   */
  public  boolean isExecutorActive (java.lang.String id)  ;
  /**
   * Request that the cluster manager kill the specified executor.
   * @return whether the request is acknowledged by the cluster manager.
   * @param executorId (undocumented)
   */
  public  boolean killExecutor (java.lang.String executorId)  ;
  /**
   * Request that the cluster manager kill the specified executors.
   * <p>
   * @param executorIds identifiers of executors to kill
   * @param adjustTargetNumExecutors whether the target number of executors will be adjusted down
   *                                 after these executors have been killed
   * @param countFailures if there are tasks running on the executors when they are killed, whether
   *                     to count those failures toward task failure limits
   * @param force whether to force kill busy executors, default false
   * @return the ids of the executors acknowledged by the cluster manager to be removed.
   */
  public  scala.collection.Seq<java.lang.String> killExecutors (scala.collection.Seq<java.lang.String> executorIds, boolean adjustTargetNumExecutors, boolean countFailures, boolean force)  ;
  /**
   * Request that the cluster manager kill every executor on the specified host.
   * <p>
   * @return whether the request is acknowledged by the cluster manager.
   * @param host (undocumented)
   */
  public  boolean killExecutorsOnHost (java.lang.String host)  ;
  /**
   * Request an additional number of executors from the cluster manager for the default
   * ResourceProfile.
   * @return whether the request is acknowledged by the cluster manager.
   * @param numAdditionalExecutors (undocumented)
   */
  public  boolean requestExecutors (int numAdditionalExecutors)  ;
  /**
   * Update the cluster manager on our scheduling needs. Three bits of information are included
   * to help it make decisions.
   * <p>
   * @param resourceProfileIdToNumExecutors The total number of executors we'd like to have per
   *                                        ResourceProfile id. The cluster manager shouldn't kill
   *                                        any running executor to reach this number, but, if all
   *                                        existing executors were to die, this is the number
   *                                        of executors we'd want to be allocated.
   * @param numLocalityAwareTasksPerResourceProfileId The number of tasks in all active stages that
   *                                                  have a locality preferences per
   *                                                  ResourceProfile id. This includes running,
   *                                                  pending, and completed tasks.
   * @param hostToLocalTaskCount A map of ResourceProfile id to a map of hosts to the number of
   *                             tasks from all active stages that would like to like to run on
   *                             that host. This includes running, pending, and completed tasks.
   * @return whether the request is acknowledged by the cluster manager.
   */
    boolean requestTotalExecutors (scala.collection.immutable.Map<java.lang.Object, java.lang.Object> resourceProfileIdToNumExecutors, scala.collection.immutable.Map<java.lang.Object, java.lang.Object> numLocalityAwareTasksPerResourceProfileId, scala.collection.immutable.Map<java.lang.Object, scala.collection.immutable.Map<java.lang.String, java.lang.Object>> hostToLocalTaskCount)  ;
}
