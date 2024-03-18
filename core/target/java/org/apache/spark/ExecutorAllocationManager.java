package org.apache.spark;
/**
 * An agent that dynamically allocates and removes executors based on the workload.
 * <p>
 * The ExecutorAllocationManager maintains a moving target number of executors, for each
 * ResourceProfile, which is periodically synced to the cluster manager. The target starts
 * at a configured initial value and changes with the number of pending and running tasks.
 * <p>
 * Decreasing the target number of executors happens when the current target is more than needed to
 * handle the current load. The target number of executors is always truncated to the number of
 * executors that could run all current running and pending tasks at once.
 * <p>
 * Increasing the target number of executors happens in response to backlogged tasks waiting to be
 * scheduled. If the scheduler queue is not drained in M seconds, then new executors are added. If
 * the queue persists for another N seconds, then more executors are added and so on. The number
 * added in each round increases exponentially from the previous round until an upper bound has been
 * reached. The upper bound is based both on a configured property and on the current number of
 * running and pending tasks, as described above.
 * <p>
 * The rationale for the exponential increase is twofold: (1) Executors should be added slowly
 * in the beginning in case the number of extra executors needed turns out to be small. Otherwise,
 * we may add more executors than we need just to remove them later. (2) Executors should be added
 * quickly over time in case the maximum number of executors is very high. Otherwise, it will take
 * a long time to ramp up under heavy workloads.
 * <p>
 * The remove policy is simpler and is applied on each ResourceProfile separately. If an executor
 * for that ResourceProfile has been idle for K seconds and the number of executors is more
 * then what is needed for that ResourceProfile, meaning there are not enough tasks that could use
 * the executor, then it is removed. Note that an executor caching any data
 * blocks will be removed if it has been idle for more than L seconds.
 * <p>
 * There is no retry logic in either case because we make the assumption that the cluster manager
 * will eventually fulfill all requests it receives asynchronously.
 * <p>
 * The relevant Spark properties are below. Each of these properties applies separately to
 * every ResourceProfile. So if you set a minimum number of executors, that is a minimum
 * for each ResourceProfile.
 * <p>
 *   spark.dynamicAllocation.enabled - Whether this feature is enabled
 *   spark.dynamicAllocation.minExecutors - Lower bound on the number of executors
 *   spark.dynamicAllocation.maxExecutors - Upper bound on the number of executors
 *   spark.dynamicAllocation.initialExecutors - Number of executors to start with
 * <p>
 *   spark.dynamicAllocation.executorAllocationRatio -
 *     This is used to reduce the parallelism of the dynamic allocation that can waste
 *     resources when tasks are small
 * <p>
 *   spark.dynamicAllocation.schedulerBacklogTimeout (M) -
 *     If there are backlogged tasks for this duration, add new executors
 * <p>
 *   spark.dynamicAllocation.sustainedSchedulerBacklogTimeout (N) -
 *     If the backlog is sustained for this duration, add more executors
 *     This is used only after the initial backlog timeout is exceeded
 * <p>
 *   spark.dynamicAllocation.executorIdleTimeout (K) -
 *     If an executor without caching any data blocks has been idle for this duration, remove it
 * <p>
 *   spark.dynamicAllocation.cachedExecutorIdleTimeout (L) -
 *     If an executor with caching data blocks has been idle for more than this duration,
 *     the executor will be removed
 * <p>
 */
  class ExecutorAllocationManager implements org.apache.spark.internal.Logging {
  /**
   * A listener that notifies the given allocation manager of when to add and remove executors.
   * <p>
   * This class is intentionally conservative in its assumptions about the relative ordering
   * and consistency of events returned by the listener.
   */
    class ExecutorAllocationListener extends org.apache.spark.scheduler.SparkListener {
    public   ExecutorAllocationListener ()  { throw new RuntimeException(); }
    public  boolean hasPendingRegularTasks ()  { throw new RuntimeException(); }
    public  boolean hasPendingSpeculativeTasks ()  { throw new RuntimeException(); }
    public  boolean hasPendingTasks ()  { throw new RuntimeException(); }
    public  void onSpeculativeTaskSubmitted (org.apache.spark.scheduler.SparkListenerSpeculativeTaskSubmitted speculativeTask)  { throw new RuntimeException(); }
    public  void onStageCompleted (org.apache.spark.scheduler.SparkListenerStageCompleted stageCompleted)  { throw new RuntimeException(); }
    public  void onStageSubmitted (org.apache.spark.scheduler.SparkListenerStageSubmitted stageSubmitted)  { throw new RuntimeException(); }
    public  void onTaskEnd (org.apache.spark.scheduler.SparkListenerTaskEnd taskEnd)  { throw new RuntimeException(); }
    public  void onTaskStart (org.apache.spark.scheduler.SparkListenerTaskStart taskStart)  { throw new RuntimeException(); }
    public  void onUnschedulableTaskSetAdded (org.apache.spark.scheduler.SparkListenerUnschedulableTaskSetAdded unschedulableTaskSetAdded)  { throw new RuntimeException(); }
    public  void onUnschedulableTaskSetRemoved (org.apache.spark.scheduler.SparkListenerUnschedulableTaskSetRemoved unschedulableTaskSetRemoved)  { throw new RuntimeException(); }
    public  int pendingSpeculativeTasksPerResourceProfile (int rp)  { throw new RuntimeException(); }
    /**
     * An estimate of the total number of pending tasks remaining for currently running stages. Does
     * not account for tasks which may have failed and been resubmitted.
     * <p>
     * Note: This is not thread-safe without the caller owning the <code>allocationManager</code> lock.
     * @param rpId (undocumented)
     * @return (undocumented)
     */
    public  int pendingTasksPerResourceProfile (int rpId)  { throw new RuntimeException(); }
    /**
     * Currently we only know when a task set has an unschedulable task, we don't know
     * the exact number and since the allocation manager isn't tied closely with the scheduler,
     * we use the number of tasks sets that are unschedulable as a heuristic to add more executors.
     * @param rp (undocumented)
     * @return (undocumented)
     */
    public  int pendingUnschedulableTaskSetsPerResourceProfile (int rp)  { throw new RuntimeException(); }
    public  void removeStageFromResourceProfileIfUnused (org.apache.spark.ExecutorAllocationManager.StageAttempt stageAttempt)  { throw new RuntimeException(); }
    public  int totalRunningTasksPerResourceProfile (int rp)  { throw new RuntimeException(); }
    /**
     * Update the Executor placement hints (the number of tasks with locality preferences,
     * a map where each pair is a node and the number of tasks that would like to be scheduled
     * on that node).
     * <p>
     * These hints are updated when stages arrive and complete, so are not up-to-date at task
     * granularity within stages.
     */
    public  void updateExecutorPlacementHints ()  { throw new RuntimeException(); }
  }
  static   class TargetNumUpdates implements scala.Product, scala.Serializable {
    public  int delta ()  { throw new RuntimeException(); }
    public  int oldNumExecutorsTarget ()  { throw new RuntimeException(); }
    // not preceding
    public   TargetNumUpdates (int delta, int oldNumExecutorsTarget)  { throw new RuntimeException(); }
  }
  static public  class TargetNumUpdates$ extends scala.runtime.AbstractFunction2<java.lang.Object, java.lang.Object, org.apache.spark.ExecutorAllocationManager.TargetNumUpdates> implements scala.Serializable {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final TargetNumUpdates$ MODULE$ = null;
    public   TargetNumUpdates$ ()  { throw new RuntimeException(); }
  }
  static public  long NOT_SET ()  { throw new RuntimeException(); }
  public   ExecutorAllocationManager (org.apache.spark.ExecutorAllocationClient client, org.apache.spark.scheduler.LiveListenerBus listenerBus, org.apache.spark.SparkConf conf, scala.Option<org.apache.spark.ContextCleaner> cleaner, org.apache.spark.util.Clock clock, org.apache.spark.resource.ResourceProfileManager resourceProfileManager)  { throw new RuntimeException(); }
    scala.collection.mutable.HashMap<java.lang.Object, java.lang.Object> numExecutorsToAddPerResourceProfileId ()  { throw new RuntimeException(); }
    scala.collection.mutable.HashMap<java.lang.Object, java.lang.Object> numExecutorsTargetPerResourceProfileId ()  { throw new RuntimeException(); }
  public  org.apache.spark.ExecutorAllocationManager.ExecutorAllocationListener listener ()  { throw new RuntimeException(); }
  public  org.apache.spark.ExecutorAllocationManagerSource executorAllocationManagerSource ()  { throw new RuntimeException(); }
  public  org.apache.spark.scheduler.dynalloc.ExecutorMonitor executorMonitor ()  { throw new RuntimeException(); }
  /**
   * Register for scheduler callbacks to decide when to add and remove executors, and start
   * the scheduling task.
   */
  public  void start ()  { throw new RuntimeException(); }
  /**
   * Stop the allocation manager.
   */
  public  void stop ()  { throw new RuntimeException(); }
  /**
   * Reset the allocation manager when the cluster manager loses track of the driver's state.
   * This is currently only done in YARN client mode, when the AM is restarted.
   * <p>
   * This method forgets about any state about existing executors, and forces the scheduler to
   * re-evaluate the number of needed executors the next time it's run.
   */
  public  void reset ()  { throw new RuntimeException(); }
  /**
   * The maximum number of executors, for the ResourceProfile id passed in, that we would need
   * under the current load to satisfy all running and pending tasks, rounded up.
   * @param rpId (undocumented)
   * @return (undocumented)
   */
    int maxNumExecutorsNeededPerResourceProfile (int rpId)  { throw new RuntimeException(); }
}
