package org.apache.spark.scheduler;
/**
 * Schedules the tasks within a single TaskSet in the TaskSchedulerImpl. This class keeps track of
 * each task, retries tasks if they fail (up to a limited number of times), and
 * handles locality-aware scheduling for this TaskSet via delay scheduling. The main interfaces
 * to it are resourceOffer, which asks the TaskSet whether it wants to run a task on one node,
 * and handleSuccessfulTask/handleFailedTask, which tells it that one of its tasks changed state
 *  (e.g. finished/failed).
 * <p>
 * THREADING: This class is designed to only be called from code with a lock on the
 * TaskScheduler (e.g. its event handlers). It should not be called from other threads.
 * <p>
 * param:  sched           the TaskSchedulerImpl associated with the TaskSetManager
 * param:  taskSet         the TaskSet to manage scheduling for
 * param:  maxTaskFailures if any particular task fails this number of times, the entire
 *                        task set will be aborted
 */
  class TaskSetManager implements org.apache.spark.scheduler.Schedulable, org.apache.spark.internal.Logging {
  static public  int TASK_SIZE_TO_WARN_KIB ()  { throw new RuntimeException(); }
  static public  int BARRIER_LOGGING_INTERVAL ()  { throw new RuntimeException(); }
  public  org.apache.spark.scheduler.TaskSet taskSet ()  { throw new RuntimeException(); }
  public  int maxTaskFailures ()  { throw new RuntimeException(); }
  // not preceding
  public   TaskSetManager (org.apache.spark.scheduler.TaskSchedulerImpl sched, org.apache.spark.scheduler.TaskSet taskSet, int maxTaskFailures, scala.Option<org.apache.spark.scheduler.HealthTracker> healthTracker, org.apache.spark.util.Clock clock)  { throw new RuntimeException(); }
  public  long maxResultSize ()  { throw new RuntimeException(); }
  public  org.apache.spark.SparkEnv env ()  { throw new RuntimeException(); }
  public  org.apache.spark.serializer.SerializerInstance ser ()  { throw new RuntimeException(); }
  public  org.apache.spark.scheduler.Task<?>[] tasks ()  { throw new RuntimeException(); }
    scala.collection.immutable.Map<java.lang.Object, java.lang.Object> partitionToIndex ()  { throw new RuntimeException(); }
  public  int numTasks ()  { throw new RuntimeException(); }
  public  int[] copiesRunning ()  { throw new RuntimeException(); }
  public  boolean speculationEnabled ()  { throw new RuntimeException(); }
  public  double speculationQuantile ()  { throw new RuntimeException(); }
  public  double speculationMultiplier ()  { throw new RuntimeException(); }
  public  int minFinishedForSpeculation ()  { throw new RuntimeException(); }
  public  scala.Option<java.lang.Object> speculationTaskDurationThresOpt ()  { throw new RuntimeException(); }
  public  boolean speculationTasksLessEqToSlots ()  { throw new RuntimeException(); }
  public  boolean[] successful ()  { throw new RuntimeException(); }
  public  scala.collection.immutable.List<org.apache.spark.scheduler.TaskInfo>[] taskAttempts ()  { throw new RuntimeException(); }
    int tasksSuccessful ()  { throw new RuntimeException(); }
  public  int weight ()  { throw new RuntimeException(); }
  public  int minShare ()  { throw new RuntimeException(); }
  public  int priority ()  { throw new RuntimeException(); }
  public  int stageId ()  { throw new RuntimeException(); }
  public  java.lang.String name ()  { throw new RuntimeException(); }
  public  org.apache.spark.scheduler.Pool parent ()  { throw new RuntimeException(); }
    scala.Option<org.apache.spark.scheduler.TaskSetExcludelist> taskSetExcludelistHelperOpt ()  { throw new RuntimeException(); }
    scala.collection.mutable.HashSet<java.lang.Object> runningTasksSet ()  { throw new RuntimeException(); }
  public  int runningTasks ()  { throw new RuntimeException(); }
  public  boolean someAttemptSucceeded (long tid)  { throw new RuntimeException(); }
    boolean isZombie ()  { throw new RuntimeException(); }
    boolean isBarrier ()  { throw new RuntimeException(); }
    scala.collection.mutable.HashMap<java.lang.Object, org.apache.spark.scheduler.BarrierPendingLaunchTask> barrierPendingLaunchTasks ()  { throw new RuntimeException(); }
    long lastResourceOfferFailLogTime ()  { throw new RuntimeException(); }
    org.apache.spark.scheduler.PendingTasksByLocality pendingTasks ()  { throw new RuntimeException(); }
    scala.collection.mutable.HashSet<java.lang.Object> speculatableTasks ()  { throw new RuntimeException(); }
    org.apache.spark.scheduler.PendingTasksByLocality pendingSpeculatableTasks ()  { throw new RuntimeException(); }
    scala.collection.mutable.HashMap<java.lang.Object, org.apache.spark.scheduler.TaskInfo> taskInfos ()  { throw new RuntimeException(); }
  public  org.apache.spark.util.collection.MedianHeap successfulTaskDurations ()  { throw new RuntimeException(); }
  public  long EXCEPTION_PRINT_INTERVAL ()  { throw new RuntimeException(); }
  public  long epoch ()  { throw new RuntimeException(); }
  /**
   * Track the set of locality levels which are valid given the tasks locality preferences and
   * the set of currently available executors.  This is updated as executors are added and removed.
   * This allows a performance optimization, of skipping levels that aren't relevant (e.g., skip
   * PROCESS_LOCAL if no tasks could be run PROCESS_LOCAL for the current set of executors).
   * @return (undocumented)
   */
    scala.Enumeration.Value[] myLocalityLevels ()  { throw new RuntimeException(); }
    long[] localityWaits ()  { throw new RuntimeException(); }
  public  java.util.concurrent.ConcurrentLinkedQueue<org.apache.spark.scheduler.Schedulable> schedulableQueue ()  { throw new RuntimeException(); }
  public  scala.Enumeration.Value schedulingMode ()  { throw new RuntimeException(); }
    boolean emittedTaskSizeWarning ()  { throw new RuntimeException(); }
  /** Add a task to all the pending-task lists that it should be on. */
    void addPendingTask (int index, boolean resolveRacks, boolean speculatable)  { throw new RuntimeException(); }
  /**
   * Dequeue a pending task for a given node and return its index and locality level.
   * Only search for tasks matching the given locality constraint.
   * <p>
   * @return An option containing (task index within the task set, locality, is speculative?)
   * @param execId (undocumented)
   * @param host (undocumented)
   * @param maxLocality (undocumented)
   * @param speculative (undocumented)
   */
  protected  scala.Option<scala.Tuple3<java.lang.Object, scala.Enumeration.Value, java.lang.Object>> dequeueTaskHelper (java.lang.String execId, java.lang.String host, scala.Enumeration.Value maxLocality, boolean speculative)  { throw new RuntimeException(); }
    void resetDelayScheduleTimer (scala.Option<scala.Enumeration.Value> minLocality)  { throw new RuntimeException(); }
  /**
   * Respond to an offer of a single executor from the scheduler by finding a task
   * <p>
   * NOTE: this function is either called with a maxLocality which
   * would be adjusted by delay scheduling algorithm or it will be with a special
   * NO_PREF locality which will be not modified
   * <p>
   * @param execId the executor Id of the offered resource
   * @param host  the host Id of the offered resource
   * @param maxLocality the maximum locality we want to schedule the tasks at
   * @param taskCpus the number of CPUs for the task
   * @param taskResourceAssignments the resource assignments for the task
   * <p>
   * @return Triple containing:
   *         (TaskDescription of launched task if any,
   *         rejected resource due to delay scheduling?,
   *         dequeued task index)
   */
  public  scala.Tuple3<scala.Option<org.apache.spark.scheduler.TaskDescription>, java.lang.Object, java.lang.Object> resourceOffer (java.lang.String execId, java.lang.String host, scala.Enumeration.Value maxLocality, int taskCpus, scala.collection.immutable.Map<java.lang.String, org.apache.spark.resource.ResourceInformation> taskResourceAssignments) throws org.apache.spark.TaskNotSerializableException { throw new RuntimeException(); }
  public  org.apache.spark.scheduler.TaskDescription prepareLaunchingTask (java.lang.String execId, java.lang.String host, int index, scala.Enumeration.Value taskLocality, boolean speculative, int taskCpus, scala.collection.immutable.Map<java.lang.String, org.apache.spark.resource.ResourceInformation> taskResourceAssignments, long launchTime)  { throw new RuntimeException(); }
  public  java.lang.String taskName (long tid)  { throw new RuntimeException(); }
  /**
   * Find the index in myLocalityLevels for a given locality. This is also designed to work with
   * localities that are not in myLocalityLevels (in case we somehow get those) by returning the
   * next-biggest level we have. Uses the fact that the last value in myLocalityLevels is ANY.
   * @param locality (undocumented)
   * @return (undocumented)
   */
  public  int getLocalityIndex (scala.Enumeration.Value locality)  { throw new RuntimeException(); }
  /**
   * Check whether the given task set has been excluded to the point that it can't run anywhere.
   * <p>
   * It is possible that this taskset has become impossible to schedule *anywhere* due to the
   * failures that lead executors being excluded from the ones we can run on. The most common
   * scenario would be if there are fewer executors than spark.task.maxFailures.
   * We need to detect this so we can avoid the job from being hung. We try to acquire new
   * executor/s by killing an existing idle excluded executor.
   * <p>
   * There's a tradeoff here: we could make sure all tasks in the task set are schedulable, but that
   * would add extra time to each iteration of the scheduling loop. Here, we take the approach of
   * making sure at least one of the unscheduled tasks is schedulable. This means we may not detect
   * the hang as quickly as we could have, but we'll always detect the hang eventually, and the
   * method is faster in the typical case. In the worst case, this method can take
   * O(maxTaskFailures + numTasks) time, but it will be faster when there haven't been any task
   * failures (this is because the method picks one unscheduled task, and then iterates through each
   * executor until it finds one that the task isn't excluded on).
   * @param hostToExecutors (undocumented)
   * @return (undocumented)
   */
    scala.Option<java.lang.Object> getCompletelyExcludedTaskIfAny (scala.collection.mutable.HashMap<java.lang.String, scala.collection.mutable.HashSet<java.lang.String>> hostToExecutors)  { throw new RuntimeException(); }
    void abortSinceCompletelyExcludedOnFailure (int indexInTaskSet)  { throw new RuntimeException(); }
  /**
   * Marks the task as getting result and notifies the DAG Scheduler
   * @param tid (undocumented)
   */
  public  void handleTaskGettingResult (long tid)  { throw new RuntimeException(); }
  /**
   * Check whether has enough quota to fetch the result with <code>size</code> bytes.
   * This check does not apply to shuffle map tasks as they return map status and metrics updates,
   * which will be discarded by the driver after being processed.
   * @param size (undocumented)
   * @return (undocumented)
   */
  public  boolean canFetchMoreResults (long size)  { throw new RuntimeException(); }
  /**
   * Marks a task as successful and notifies the DAGScheduler that the task has ended.
   * @param tid (undocumented)
   * @param result (undocumented)
   */
  public  void handleSuccessfulTask (long tid, org.apache.spark.scheduler.DirectTaskResult<?> result)  { throw new RuntimeException(); }
    void markPartitionCompleted (int partitionId)  { throw new RuntimeException(); }
  /**
   * Marks the task as failed, re-adds it to the list of pending tasks, and notifies the
   * DAG Scheduler.
   * @param tid (undocumented)
   * @param state (undocumented)
   * @param reason (undocumented)
   */
  public  void handleFailedTask (long tid, scala.Enumeration.Value state, org.apache.spark.TaskFailedReason reason)  { throw new RuntimeException(); }
  public  void abort (java.lang.String message, scala.Option<java.lang.Throwable> exception)  { throw new RuntimeException(); }
  /** If the given task ID is not in the set of running tasks, adds it.
   * <p>
   * Used to keep track of the number of running tasks, for enforcing scheduling policies.
   * @param tid (undocumented)
   */
  public  void addRunningTask (long tid)  { throw new RuntimeException(); }
  /** If the given task ID is in the set of running tasks, removes it. */
  public  void removeRunningTask (long tid)  { throw new RuntimeException(); }
  public  org.apache.spark.scheduler.Schedulable getSchedulableByName (java.lang.String name)  { throw new RuntimeException(); }
  public  boolean isSchedulable ()  { throw new RuntimeException(); }
  public  void addSchedulable (org.apache.spark.scheduler.Schedulable schedulable)  { throw new RuntimeException(); }
  public  void removeSchedulable (org.apache.spark.scheduler.Schedulable schedulable)  { throw new RuntimeException(); }
  public  scala.collection.mutable.ArrayBuffer<org.apache.spark.scheduler.TaskSetManager> getSortedTaskSetQueue ()  { throw new RuntimeException(); }
  /** Called by TaskScheduler when an executor is lost so we can re-enqueue our tasks */
  public  void executorLost (java.lang.String execId, java.lang.String host, org.apache.spark.scheduler.ExecutorLossReason reason)  { throw new RuntimeException(); }
  /**
   * Check for tasks to be speculated and return true if there are any. This is called periodically
   * by the TaskScheduler.
   * <p>
   * @param minTimeToSpeculation (undocumented)
   * @return (undocumented)
   */
  public  boolean checkSpeculatableTasks (long minTimeToSpeculation)  { throw new RuntimeException(); }
  public  void executorDecommission (java.lang.String execId)  { throw new RuntimeException(); }
  public  void recomputeLocality ()  { throw new RuntimeException(); }
  public  void executorAdded ()  { throw new RuntimeException(); }
}
