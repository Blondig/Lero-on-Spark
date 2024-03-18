package org.apache.spark.scheduler;
/**
 * Schedules tasks for multiple types of clusters by acting through a SchedulerBackend.
 * It can also work with a local setup by using a <code>LocalSchedulerBackend</code> and setting
 * isLocal to true. It handles common logic, like determining a scheduling order across jobs, waking
 * up to launch speculative tasks, etc.
 * <p>
 * Clients should first call initialize() and start(), then submit task sets through the
 * submitTasks method.
 * <p>
 * THREADING: {@link SchedulerBackend}s and task-submitting clients can call this class from multiple
 * threads, so it needs locks in public API methods to maintain its state. In addition, some
 * {@link SchedulerBackend}s synchronize on themselves when they want to send events here, and then
 * acquire a lock on us, so we need to make sure that we don't try to lock the backend while
 * we are holding a lock on ourselves.  This class is called from many threads, notably:
 *   * The DAGScheduler Event Loop
 *   * The RPCHandler threads, responding to status updates from Executors
 *   * Periodic revival of all offers from the CoarseGrainedSchedulerBackend, to accommodate delay
 *      scheduling
 *   * task-result-getter threads
 * <p>
 * CAUTION: Any non fatal exception thrown within Spark RPC framework can be swallowed.
 * Thus, throwing exception in methods like resourceOffers, statusUpdate won't fail
 * the application, but could lead to undefined behavior. Instead, we shall use method like
 * TaskSetManger.abort() to abort a stage and then fail the application (SPARK-31485).
 * <p>
 * Delay Scheduling:
 *  Delay scheduling is an optimization that sacrifices job fairness for data locality in order to
 *  improve cluster and workload throughput. One useful definition of "delay" is how much time
 *  has passed since the TaskSet was using its fair share of resources. Since it is impractical to
 *  calculate this delay without a full simulation, the heuristic used is the time since the
 *  TaskSetManager last launched a task and has not rejected any resources due to delay scheduling
 *  since it was last offered its "fair share". A "fair share" offer is when {@link resourceOffers}'s
 *  parameter "isAllFreeResources" is set to true. A "delay scheduling reject" is when a resource
 *  is not utilized despite there being pending tasks (implemented inside {@link TaskSetManager}).
 *  The legacy heuristic only measured the time since the {@link TaskSetManager} last launched a task,
 *  and can be re-enabled by setting spark.locality.wait.legacyResetOnTaskLaunch to true.
 */
  class TaskSchedulerImpl implements org.apache.spark.scheduler.TaskScheduler, org.apache.spark.internal.Logging {
  static public  java.lang.String SCHEDULER_MODE_PROPERTY ()  { throw new RuntimeException(); }
  /**
   * Calculate the max available task slots given the <code>availableCpus</code> and <code>availableResources</code>
   * from a collection of ResourceProfiles. And only those ResourceProfiles who has the
   * same id with the <code>rpId</code> can be used to calculate the task slots.
   * <p>
   * @param scheduler the TaskSchedulerImpl instance
   * @param conf SparkConf used to calculate the limiting resource and get the cpu amount per task
   * @param rpId the target ResourceProfile id. Only those ResourceProfiles who has the same id
   *             with it can be used to calculate the task slots.
   * @param availableRPIds an Array of ids of the available ResourceProfiles from the executors.
   * @param availableCpus an Array of the amount of available cpus from the executors.
   * @param availableResources an Array of the resources map from the executors. In the resource
   *                           map, it maps from the resource name to its amount.
   * @return the number of max task slots
   */
  static public  int calculateAvailableSlots (org.apache.spark.scheduler.TaskSchedulerImpl scheduler, org.apache.spark.SparkConf conf, int rpId, int[] availableRPIds, int[] availableCpus, scala.collection.immutable.Map<java.lang.String, java.lang.Object>[] availableResources)  { throw new RuntimeException(); }
  /**
   * Used to balance containers across hosts.
   * <p>
   * Accepts a map of hosts to resource offers for that host, and returns a prioritized list of
   * resource offers representing the order in which the offers should be used. The resource
   * offers are ordered such that we'll allocate one container on each host before allocating a
   * second container on any host, and so on, in order to reduce the damage if a host fails.
   * <p>
   * For example, given {@literal <h1, [o1, o2, o3]>}, {@literal <h2, [o4]>} and
   * {@literal <h3, [o5, o6]>}, returns {@literal [o1, o5, o4, o2, o6, o3]}.
   * @param map (undocumented)
   * @return (undocumented)
   */
  static public <K extends java.lang.Object, T extends java.lang.Object> scala.collection.immutable.List<T> prioritizeContainers (scala.collection.mutable.HashMap<K, scala.collection.mutable.ArrayBuffer<T>> map)  { throw new RuntimeException(); }
  public  org.apache.spark.SparkContext sc ()  { throw new RuntimeException(); }
  public  int maxTaskFailures ()  { throw new RuntimeException(); }
  // not preceding
  public   TaskSchedulerImpl (org.apache.spark.SparkContext sc, int maxTaskFailures, boolean isLocal, org.apache.spark.util.Clock clock)  { throw new RuntimeException(); }
  public   TaskSchedulerImpl (org.apache.spark.SparkContext sc)  { throw new RuntimeException(); }
  // not preceding
    scala.Option<org.apache.spark.scheduler.HealthTracker> healthTrackerOpt ()  { throw new RuntimeException(); }
  public  org.apache.spark.SparkConf conf ()  { throw new RuntimeException(); }
  public  long SPECULATION_INTERVAL_MS ()  { throw new RuntimeException(); }
  public  long MIN_TIME_TO_SPECULATION ()  { throw new RuntimeException(); }
  public  long STARVATION_TIMEOUT_MS ()  { throw new RuntimeException(); }
  public  int CPUS_PER_TASK ()  { throw new RuntimeException(); }
    java.util.concurrent.ConcurrentHashMap<java.lang.Object, org.apache.spark.scheduler.TaskSetManager> taskIdToTaskSetManager ()  { throw new RuntimeException(); }
  public  scala.collection.mutable.HashMap<java.lang.Object, java.lang.String> taskIdToExecutorId ()  { throw new RuntimeException(); }
  public  java.util.concurrent.atomic.AtomicLong nextTaskId ()  { throw new RuntimeException(); }
  public  scala.collection.mutable.HashMap<java.lang.String, org.apache.spark.scheduler.ExecutorDecommissionState> executorsPendingDecommission ()  { throw new RuntimeException(); }
  public  scala.collection.immutable.Map<java.lang.String, java.lang.Object> runningTasksByExecutors ()  { throw new RuntimeException(); }
  protected  scala.collection.mutable.HashMap<java.lang.String, scala.collection.mutable.HashSet<java.lang.String>> hostToExecutors ()  { throw new RuntimeException(); }
  protected  scala.collection.mutable.HashMap<java.lang.String, scala.collection.mutable.HashSet<java.lang.String>> hostsByRack ()  { throw new RuntimeException(); }
  protected  scala.collection.mutable.HashMap<java.lang.String, java.lang.String> executorIdToHost ()  { throw new RuntimeException(); }
  public  scala.collection.mutable.HashMap<org.apache.spark.scheduler.TaskSetManager, java.lang.Object> unschedulableTaskSetToExpiryTime ()  { throw new RuntimeException(); }
  public  org.apache.spark.scheduler.DAGScheduler dagScheduler ()  { throw new RuntimeException(); }
  public  org.apache.spark.scheduler.SchedulerBackend backend ()  { throw new RuntimeException(); }
  public  org.apache.spark.MapOutputTrackerMaster mapOutputTracker ()  { throw new RuntimeException(); }
  public  scala.Enumeration.Value schedulingMode ()  { throw new RuntimeException(); }
  public  org.apache.spark.scheduler.Pool rootPool ()  { throw new RuntimeException(); }
    org.apache.spark.scheduler.TaskResultGetter taskResultGetter ()  { throw new RuntimeException(); }
    org.apache.spark.rpc.RpcEndpoint barrierCoordinator ()  { throw new RuntimeException(); }
  protected  scala.Option<java.lang.String> defaultRackValue ()  { throw new RuntimeException(); }
  public  void setDAGScheduler (org.apache.spark.scheduler.DAGScheduler dagScheduler)  { throw new RuntimeException(); }
  public  void initialize (org.apache.spark.scheduler.SchedulerBackend backend)  { throw new RuntimeException(); }
  public  long newTaskId ()  { throw new RuntimeException(); }
  public  void start ()  { throw new RuntimeException(); }
  public  void postStartHook ()  { throw new RuntimeException(); }
  public  void submitTasks (org.apache.spark.scheduler.TaskSet taskSet)  { throw new RuntimeException(); }
    org.apache.spark.scheduler.TaskSetManager createTaskSetManager (org.apache.spark.scheduler.TaskSet taskSet, int maxTaskFailures)  { throw new RuntimeException(); }
  public  void cancelTasks (int stageId, boolean interruptThread)  { throw new RuntimeException(); }
  public  boolean killTaskAttempt (long taskId, boolean interruptThread, java.lang.String reason)  { throw new RuntimeException(); }
  public  void killAllTaskAttempts (int stageId, boolean interruptThread, java.lang.String reason)  { throw new RuntimeException(); }
  public  void notifyPartitionCompletion (int stageId, int partitionId)  { throw new RuntimeException(); }
  /**
   * Called to indicate that all task attempts (including speculated tasks) associated with the
   * given TaskSetManager have completed, so state associated with the TaskSetManager should be
   * cleaned up.
   * @param manager (undocumented)
   */
  public  void taskSetFinished (org.apache.spark.scheduler.TaskSetManager manager)  { throw new RuntimeException(); }
  /**
   * Called by cluster manager to offer resources on workers. We respond by asking our active task
   * sets for tasks in order of priority. We fill each node with tasks in a round-robin manner so
   * that tasks are balanced across the cluster.
   * @param offers (undocumented)
   * @param isAllFreeResources (undocumented)
   * @return (undocumented)
   */
  public  scala.collection.Seq<scala.collection.Seq<org.apache.spark.scheduler.TaskDescription>> resourceOffers (scala.collection.IndexedSeq<org.apache.spark.scheduler.WorkerOffer> offers, boolean isAllFreeResources)  { throw new RuntimeException(); }
  /**
   * Shuffle offers around to avoid always placing tasks on the same workers.  Exposed to allow
   * overriding in tests, so it can be deterministic.
   * @param offers (undocumented)
   * @return (undocumented)
   */
  protected  scala.collection.IndexedSeq<org.apache.spark.scheduler.WorkerOffer> shuffleOffers (scala.collection.IndexedSeq<org.apache.spark.scheduler.WorkerOffer> offers)  { throw new RuntimeException(); }
  public  void statusUpdate (long tid, scala.Enumeration.Value state, java.nio.ByteBuffer serializedData)  { throw new RuntimeException(); }
  /**
   * Update metrics for in-progress tasks and executor metrics, and let the master know that the
   * BlockManager is still alive. Return true if the driver knows about the given block manager.
   * Otherwise, return false, indicating that the block manager should re-register.
   * @param execId (undocumented)
   * @param accumUpdates (undocumented)
   * @param blockManagerId (undocumented)
   * @param executorUpdates (undocumented)
   * @return (undocumented)
   */
  public  boolean executorHeartbeatReceived (java.lang.String execId, scala.Tuple2<java.lang.Object, scala.collection.Seq<org.apache.spark.util.AccumulatorV2<?, ?>>>[] accumUpdates, org.apache.spark.storage.BlockManagerId blockManagerId, scala.collection.mutable.Map<scala.Tuple2<java.lang.Object, java.lang.Object>, org.apache.spark.executor.ExecutorMetrics> executorUpdates)  { throw new RuntimeException(); }
  public  void handleTaskGettingResult (org.apache.spark.scheduler.TaskSetManager taskSetManager, long tid)  { throw new RuntimeException(); }
  public  void handleSuccessfulTask (org.apache.spark.scheduler.TaskSetManager taskSetManager, long tid, org.apache.spark.scheduler.DirectTaskResult<?> taskResult)  { throw new RuntimeException(); }
  public  void handleFailedTask (org.apache.spark.scheduler.TaskSetManager taskSetManager, long tid, scala.Enumeration.Value taskState, org.apache.spark.TaskFailedReason reason)  { throw new RuntimeException(); }
  /**
   * Marks the task has completed in the active TaskSetManager for the given stage.
   * <p>
   * After stage failure and retry, there may be multiple TaskSetManagers for the stage.
   * If an earlier zombie attempt of a stage completes a task, we can ask the later active attempt
   * to skip submitting and running the task for the same partition, to save resource. That also
   * means that a task completion from an earlier zombie attempt can lead to the entire stage
   * getting marked as successful.
   * @param stageId (undocumented)
   * @param partitionId (undocumented)
   */
    void handlePartitionCompleted (int stageId, int partitionId)  { throw new RuntimeException(); }
  public  void error (java.lang.String message)  { throw new RuntimeException(); }
  public  void stop ()  { throw new RuntimeException(); }
  public  int defaultParallelism ()  { throw new RuntimeException(); }
  public  void checkSpeculatableTasks ()  { throw new RuntimeException(); }
  public  void executorDecommission (java.lang.String executorId, org.apache.spark.scheduler.ExecutorDecommissionInfo decommissionInfo)  { throw new RuntimeException(); }
  public  scala.Option<org.apache.spark.scheduler.ExecutorDecommissionState> getExecutorDecommissionState (java.lang.String executorId)  { throw new RuntimeException(); }
  public  void executorLost (java.lang.String executorId, org.apache.spark.scheduler.ExecutorLossReason reason)  { throw new RuntimeException(); }
  public  void workerRemoved (java.lang.String workerId, java.lang.String host, java.lang.String message)  { throw new RuntimeException(); }
  public  void executorAdded (java.lang.String execId, java.lang.String host)  { throw new RuntimeException(); }
  public  scala.Option<scala.collection.immutable.Set<java.lang.String>> getExecutorsAliveOnHost (java.lang.String host)  { throw new RuntimeException(); }
  public  boolean hasExecutorsAliveOnHost (java.lang.String host)  { throw new RuntimeException(); }
  public  boolean hasHostAliveOnRack (java.lang.String rack)  { throw new RuntimeException(); }
  public  boolean isExecutorAlive (java.lang.String execId)  { throw new RuntimeException(); }
  public  boolean isExecutorBusy (java.lang.String execId)  { throw new RuntimeException(); }
  protected final  boolean isExecutorDecommissioned (java.lang.String execId)  { throw new RuntimeException(); }
  protected final  boolean isHostDecommissioned (java.lang.String host)  { throw new RuntimeException(); }
  /**
   * Get a snapshot of the currently excluded nodes for the entire application. This is
   * thread-safe -- it can be called without a lock on the TaskScheduler.
   * @return (undocumented)
   */
  public  scala.collection.immutable.Set<java.lang.String> excludedNodes ()  { throw new RuntimeException(); }
  /**
   * Get the rack for one host.
   * <p>
   * Note that {@link getRacksForHosts} should be preferred when possible as that can be much
   * more efficient.
   * @param host (undocumented)
   * @return (undocumented)
   */
  public  scala.Option<java.lang.String> getRackForHost (java.lang.String host)  { throw new RuntimeException(); }
  /**
   * Get racks for multiple hosts.
   * <p>
   * The returned Sequence will be the same length as the hosts argument and can be zipped
   * together with the hosts argument.
   * @param hosts (undocumented)
   * @return (undocumented)
   */
  public  scala.collection.Seq<scala.Option<java.lang.String>> getRacksForHosts (scala.collection.Seq<java.lang.String> hosts)  { throw new RuntimeException(); }
  public  java.lang.String applicationId ()  { throw new RuntimeException(); }
  public  scala.Option<java.lang.String> applicationAttemptId ()  { throw new RuntimeException(); }
    scala.Option<org.apache.spark.scheduler.TaskSetManager> taskSetManagerForAttempt (int stageId, int stageAttemptId)  { throw new RuntimeException(); }
}
