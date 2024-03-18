package org.apache.spark.scheduler;
/**
 * The high-level scheduling layer that implements stage-oriented scheduling. It computes a DAG of
 * stages for each job, keeps track of which RDDs and stage outputs are materialized, and finds a
 * minimal schedule to run the job. It then submits stages as TaskSets to an underlying
 * TaskScheduler implementation that runs them on the cluster. A TaskSet contains fully independent
 * tasks that can run right away based on the data that's already on the cluster (e.g. map output
 * files from previous stages), though it may fail if this data becomes unavailable.
 * <p>
 * Spark stages are created by breaking the RDD graph at shuffle boundaries. RDD operations with
 * "narrow" dependencies, like map() and filter(), are pipelined together into one set of tasks
 * in each stage, but operations with shuffle dependencies require multiple stages (one to write a
 * set of map output files, and another to read those files after a barrier). In the end, every
 * stage will have only shuffle dependencies on other stages, and may compute multiple operations
 * inside it. The actual pipelining of these operations happens in the RDD.compute() functions of
 * various RDDs
 * <p>
 * In addition to coming up with a DAG of stages, the DAGScheduler also determines the preferred
 * locations to run each task on, based on the current cache status, and passes these to the
 * low-level TaskScheduler. Furthermore, it handles failures due to shuffle output files being
 * lost, in which case old stages may need to be resubmitted. Failures *within* a stage that are
 * not caused by shuffle file loss are handled by the TaskScheduler, which will retry each task
 * a small number of times before cancelling the whole stage.
 * <p>
 * When looking through this code, there are several key concepts:
 * <p>
 *  - Jobs (represented by {@link ActiveJob}) are the top-level work items submitted to the scheduler.
 *    For example, when the user calls an action, like count(), a job will be submitted through
 *    submitJob. Each Job may require the execution of multiple stages to build intermediate data.
 * <p>
 *  - Stages ({@link Stage}) are sets of tasks that compute intermediate results in jobs, where each
 *    task computes the same function on partitions of the same RDD. Stages are separated at shuffle
 *    boundaries, which introduce a barrier (where we must wait for the previous stage to finish to
 *    fetch outputs). There are two types of stages: {@link ResultStage}, for the final stage that
 *    executes an action, and {@link ShuffleMapStage}, which writes map output files for a shuffle.
 *    Stages are often shared across multiple jobs, if these jobs reuse the same RDDs.
 * <p>
 *  - Tasks are individual units of work, each sent to one machine.
 * <p>
 *  - Cache tracking: the DAGScheduler figures out which RDDs are cached to avoid recomputing them
 *    and likewise remembers which shuffle map stages have already produced output files to avoid
 *    redoing the map side of a shuffle.
 * <p>
 *  - Preferred locations: the DAGScheduler also computes where to run each task in a stage based
 *    on the preferred locations of its underlying RDDs, or the location of cached or shuffle data.
 * <p>
 *  - Cleanup: all data structures are cleared when the running jobs that depend on them finish,
 *    to prevent memory leaks in a long-running application.
 * <p>
 * To recover from failures, the same stage might need to run multiple times, which are called
 * "attempts". If the TaskScheduler reports that a task failed because a map output file from a
 * previous stage was lost, the DAGScheduler resubmits that lost stage. This is detected through a
 * CompletionEvent with FetchFailed, or an ExecutorLost event. The DAGScheduler will wait a small
 * amount of time to see whether other nodes or tasks fail, then resubmit TaskSets for any lost
 * stage(s) that compute the missing tasks. As part of this process, we might also have to create
 * Stage objects for old (finished) stages where we previously cleaned up the Stage object. Since
 * tasks from the old attempt of a stage could still be running, care must be taken to map any
 * events received in the correct Stage object.
 * <p>
 * Here's a checklist to use when making or reviewing changes to this class:
 * <p>
 *  - All data structures should be cleared when the jobs involving them end to avoid indefinite
 *    accumulation of state in long-running programs.
 * <p>
 *  - When adding a new data structure, update <code>DAGSchedulerSuite.assertDataStructuresEmpty</code> to
 *    include the new structure. This will help to catch memory leaks.
 */
  class DAGScheduler implements org.apache.spark.internal.Logging {
  static public  int RESUBMIT_TIMEOUT ()  { throw new RuntimeException(); }
  static public  int DEFAULT_MAX_CONSECUTIVE_STAGE_ATTEMPTS ()  { throw new RuntimeException(); }
    org.apache.spark.SparkContext sc ()  { throw new RuntimeException(); }
    org.apache.spark.scheduler.TaskScheduler taskScheduler ()  { throw new RuntimeException(); }
  // not preceding
  public   DAGScheduler (org.apache.spark.SparkContext sc, org.apache.spark.scheduler.TaskScheduler taskScheduler, org.apache.spark.scheduler.LiveListenerBus listenerBus, org.apache.spark.MapOutputTrackerMaster mapOutputTracker, org.apache.spark.storage.BlockManagerMaster blockManagerMaster, org.apache.spark.SparkEnv env, org.apache.spark.util.Clock clock)  { throw new RuntimeException(); }
  public   DAGScheduler (org.apache.spark.SparkContext sc, org.apache.spark.scheduler.TaskScheduler taskScheduler)  { throw new RuntimeException(); }
  public   DAGScheduler (org.apache.spark.SparkContext sc)  { throw new RuntimeException(); }
    org.apache.spark.scheduler.DAGSchedulerSource metricsSource ()  { throw new RuntimeException(); }
    java.util.concurrent.atomic.AtomicInteger nextJobId ()  { throw new RuntimeException(); }
    int numTotalJobs ()  { throw new RuntimeException(); }
    scala.collection.mutable.HashMap<java.lang.Object, scala.collection.mutable.HashSet<java.lang.Object>> jobIdToStageIds ()  { throw new RuntimeException(); }
    scala.collection.mutable.HashMap<java.lang.Object, org.apache.spark.scheduler.Stage> stageIdToStage ()  { throw new RuntimeException(); }
  /**
   * Mapping from shuffle dependency ID to the ShuffleMapStage that will generate the data for
   * that dependency. Only includes stages that are part of currently running job (when the job(s)
   * that require the shuffle stage complete, the mapping will be removed, and the only record of
   * the shuffle data will be in the MapOutputTracker).
   * @return (undocumented)
   */
    scala.collection.mutable.HashMap<java.lang.Object, org.apache.spark.scheduler.ShuffleMapStage> shuffleIdToMapStage ()  { throw new RuntimeException(); }
    scala.collection.mutable.HashMap<java.lang.Object, org.apache.spark.scheduler.ActiveJob> jobIdToActiveJob ()  { throw new RuntimeException(); }
    scala.collection.mutable.HashSet<org.apache.spark.scheduler.Stage> waitingStages ()  { throw new RuntimeException(); }
    scala.collection.mutable.HashSet<org.apache.spark.scheduler.Stage> runningStages ()  { throw new RuntimeException(); }
    scala.collection.mutable.HashSet<org.apache.spark.scheduler.Stage> failedStages ()  { throw new RuntimeException(); }
    scala.collection.mutable.HashSet<org.apache.spark.scheduler.ActiveJob> activeJobs ()  { throw new RuntimeException(); }
    org.apache.spark.scheduler.OutputCommitCoordinator outputCommitCoordinator ()  { throw new RuntimeException(); }
  /**
   * Whether to unregister all the outputs on the host in condition that we receive a FetchFailure,
   * this is set default to false, which means, we only unregister the outputs related to the exact
   * executor(instead of the host) on a FetchFailure.
   * @return (undocumented)
   */
    boolean unRegisterOutputOnHostOnFetchFailure ()  { throw new RuntimeException(); }
  /**
   * Number of consecutive stage attempts allowed before a stage is aborted.
   * @return (undocumented)
   */
    int maxConsecutiveStageAttempts ()  { throw new RuntimeException(); }
  /**
   * Number of max concurrent tasks check failures for each barrier job.
   * @return (undocumented)
   */
    java.util.concurrent.ConcurrentHashMap<java.lang.Object, java.lang.Object> barrierJobIdToNumTasksCheckFailures ()  { throw new RuntimeException(); }
    org.apache.spark.scheduler.DAGSchedulerEventProcessLoop eventProcessLoop ()  { throw new RuntimeException(); }
  /**
   * Called by the TaskSetManager to report task's starting.
   * @param task (undocumented)
   * @param taskInfo (undocumented)
   */
  public  void taskStarted (org.apache.spark.scheduler.Task<?> task, org.apache.spark.scheduler.TaskInfo taskInfo)  { throw new RuntimeException(); }
  /**
   * Called by the TaskSetManager to report that a task has completed
   * and results are being fetched remotely.
   * @param taskInfo (undocumented)
   */
  public  void taskGettingResult (org.apache.spark.scheduler.TaskInfo taskInfo)  { throw new RuntimeException(); }
  /**
   * Called by the TaskSetManager to report task completions or failures.
   * @param task (undocumented)
   * @param reason (undocumented)
   * @param result (undocumented)
   * @param accumUpdates (undocumented)
   * @param metricPeaks (undocumented)
   * @param taskInfo (undocumented)
   */
  public  void taskEnded (org.apache.spark.scheduler.Task<?> task, org.apache.spark.TaskEndReason reason, Object result, scala.collection.Seq<org.apache.spark.util.AccumulatorV2<?, ?>> accumUpdates, long[] metricPeaks, org.apache.spark.scheduler.TaskInfo taskInfo)  { throw new RuntimeException(); }
  /**
   * Update metrics for in-progress tasks and let the master know that the BlockManager is still
   * alive. Return true if the driver knows about the given block manager. Otherwise, return false,
   * indicating that the block manager should re-register.
   * @param execId (undocumented)
   * @param accumUpdates (undocumented)
   * @param blockManagerId (undocumented)
   * @param executorUpdates (undocumented)
   * @return (undocumented)
   */
  public  boolean executorHeartbeatReceived (java.lang.String execId, scala.Tuple4<java.lang.Object, java.lang.Object, java.lang.Object, scala.collection.Seq<org.apache.spark.scheduler.AccumulableInfo>>[] accumUpdates, org.apache.spark.storage.BlockManagerId blockManagerId, scala.collection.mutable.Map<scala.Tuple2<java.lang.Object, java.lang.Object>, org.apache.spark.executor.ExecutorMetrics> executorUpdates)  { throw new RuntimeException(); }
  /**
   * Called by TaskScheduler implementation when an executor fails.
   * @param execId (undocumented)
   * @param reason (undocumented)
   */
  public  void executorLost (java.lang.String execId, org.apache.spark.scheduler.ExecutorLossReason reason)  { throw new RuntimeException(); }
  /**
   * Called by TaskScheduler implementation when a worker is removed.
   * @param workerId (undocumented)
   * @param host (undocumented)
   * @param message (undocumented)
   */
  public  void workerRemoved (java.lang.String workerId, java.lang.String host, java.lang.String message)  { throw new RuntimeException(); }
  /**
   * Called by TaskScheduler implementation when a host is added.
   * @param execId (undocumented)
   * @param host (undocumented)
   */
  public  void executorAdded (java.lang.String execId, java.lang.String host)  { throw new RuntimeException(); }
  /**
   * Called by the TaskSetManager to cancel an entire TaskSet due to either repeated failures or
   * cancellation of the job itself.
   * @param taskSet (undocumented)
   * @param reason (undocumented)
   * @param exception (undocumented)
   */
  public  void taskSetFailed (org.apache.spark.scheduler.TaskSet taskSet, java.lang.String reason, scala.Option<java.lang.Throwable> exception)  { throw new RuntimeException(); }
  /**
   * Called by the TaskSetManager when it decides a speculative task is needed.
   * @param task (undocumented)
   */
  public  void speculativeTaskSubmitted (org.apache.spark.scheduler.Task<?> task)  { throw new RuntimeException(); }
  /**
   * Called by the TaskSetManager when a taskset becomes unschedulable due to executors being
   * excluded because of too many task failures and dynamic allocation is enabled.
   * @param stageId (undocumented)
   * @param stageAttemptId (undocumented)
   */
  public  void unschedulableTaskSetAdded (int stageId, int stageAttemptId)  { throw new RuntimeException(); }
  /**
   * Called by the TaskSetManager when an unschedulable taskset becomes schedulable and dynamic
   * allocation is enabled.
   * @param stageId (undocumented)
   * @param stageAttemptId (undocumented)
   */
  public  void unschedulableTaskSetRemoved (int stageId, int stageAttemptId)  { throw new RuntimeException(); }
    scala.collection.IndexedSeq<scala.collection.Seq<org.apache.spark.scheduler.TaskLocation>> getCacheLocs (org.apache.spark.rdd.RDD<?> rdd)  { throw new RuntimeException(); }
  /**
   * Creates a ShuffleMapStage that generates the given shuffle dependency's partitions. If a
   * previously run stage generated the same shuffle data, this function will copy the output
   * locations that are still available from the previous shuffle to avoid unnecessarily
   * regenerating data.
   * @param shuffleDep (undocumented)
   * @param jobId (undocumented)
   * @return (undocumented)
   */
  public <K extends java.lang.Object, V extends java.lang.Object, C extends java.lang.Object> org.apache.spark.scheduler.ShuffleMapStage createShuffleMapStage (org.apache.spark.ShuffleDependency<K, V, C> shuffleDep, int jobId)  { throw new RuntimeException(); }
    org.apache.spark.resource.ResourceProfile mergeResourceProfilesForStage (scala.collection.mutable.HashSet<org.apache.spark.resource.ResourceProfile> stageResourceProfiles)  { throw new RuntimeException(); }
    org.apache.spark.resource.ResourceProfile mergeResourceProfiles (org.apache.spark.resource.ResourceProfile r1, org.apache.spark.resource.ResourceProfile r2)  { throw new RuntimeException(); }
  /**
   * Returns shuffle dependencies that are immediate parents of the given RDD and the
   * ResourceProfiles associated with the RDDs for this stage.
   * <p>
   * This function will not return more distant ancestors for shuffle dependencies. For example,
   * if C has a shuffle dependency on B which has a shuffle dependency on A:
   * <p>
   * A <-- B <-- C
   * <p>
   * calling this function with rdd C will only return the B <-- C dependency.
   * <p>
   * This function is scheduler-visible for the purpose of unit testing.
   * @param rdd (undocumented)
   * @return (undocumented)
   */
    scala.Tuple2<scala.collection.mutable.HashSet<org.apache.spark.ShuffleDependency<?, ?, ?>>, scala.collection.mutable.HashSet<org.apache.spark.resource.ResourceProfile>> getShuffleDependenciesAndResourceProfiles (org.apache.spark.rdd.RDD<?> rdd)  { throw new RuntimeException(); }
  /**
   * Submit an action job to the scheduler.
   * <p>
   * @param rdd target RDD to run tasks on
   * @param func a function to run on each partition of the RDD
   * @param partitions set of partitions to run on; some jobs may not want to compute on all
   *   partitions of the target RDD, e.g. for operations like first()
   * @param callSite where in the user program this job was called
   * @param resultHandler callback to pass each result to
   * @param properties scheduler properties to attach to this job, e.g. fair scheduler pool name
   * <p>
   * @return a JobWaiter object that can be used to block until the job finishes executing
   *         or can be used to cancel the job.
   * <p>
   * @throws IllegalArgumentException when partitions ids are illegal
   */
  public <T extends java.lang.Object, U extends java.lang.Object> org.apache.spark.scheduler.JobWaiter<U> submitJob (org.apache.spark.rdd.RDD<T> rdd, scala.Function2<org.apache.spark.TaskContext, scala.collection.Iterator<T>, U> func, scala.collection.Seq<java.lang.Object> partitions, org.apache.spark.util.CallSite callSite, scala.Function2<java.lang.Object, U, scala.runtime.BoxedUnit> resultHandler, java.util.Properties properties)  { throw new RuntimeException(); }
  /**
   * Run an action job on the given RDD and pass all the results to the resultHandler function as
   * they arrive.
   * <p>
   * @param rdd target RDD to run tasks on
   * @param func a function to run on each partition of the RDD
   * @param partitions set of partitions to run on; some jobs may not want to compute on all
   *   partitions of the target RDD, e.g. for operations like first()
   * @param callSite where in the user program this job was called
   * @param resultHandler callback to pass each result to
   * @param properties scheduler properties to attach to this job, e.g. fair scheduler pool name
   * <p>
   * @note Throws <code>Exception</code> when the job fails
   */
  public <T extends java.lang.Object, U extends java.lang.Object> void runJob (org.apache.spark.rdd.RDD<T> rdd, scala.Function2<org.apache.spark.TaskContext, scala.collection.Iterator<T>, U> func, scala.collection.Seq<java.lang.Object> partitions, org.apache.spark.util.CallSite callSite, scala.Function2<java.lang.Object, U, scala.runtime.BoxedUnit> resultHandler, java.util.Properties properties)  { throw new RuntimeException(); }
  /**
   * Run an approximate job on the given RDD and pass all the results to an ApproximateEvaluator
   * as they arrive. Returns a partial result object from the evaluator.
   * <p>
   * @param rdd target RDD to run tasks on
   * @param func a function to run on each partition of the RDD
   * @param evaluator <code>ApproximateEvaluator</code> to receive the partial results
   * @param callSite where in the user program this job was called
   * @param timeout maximum time to wait for the job, in milliseconds
   * @param properties scheduler properties to attach to this job, e.g. fair scheduler pool name
   * @return (undocumented)
   */
  public <T extends java.lang.Object, U extends java.lang.Object, R extends java.lang.Object> org.apache.spark.partial.PartialResult<R> runApproximateJob (org.apache.spark.rdd.RDD<T> rdd, scala.Function2<org.apache.spark.TaskContext, scala.collection.Iterator<T>, U> func, org.apache.spark.partial.ApproximateEvaluator<U, R> evaluator, org.apache.spark.util.CallSite callSite, long timeout, java.util.Properties properties)  { throw new RuntimeException(); }
  /**
   * Submit a shuffle map stage to run independently and get a JobWaiter object back. The waiter
   * can be used to block until the job finishes executing or can be used to cancel the job.
   * This method is used for adaptive query planning, to run map stages and look at statistics
   * about their outputs before submitting downstream stages.
   * <p>
   * @param dependency the ShuffleDependency to run a map stage for
   * @param callback function called with the result of the job, which in this case will be a
   *   single MapOutputStatistics object showing how much data was produced for each partition
   * @param callSite where in the user program this job was submitted
   * @param properties scheduler properties to attach to this job, e.g. fair scheduler pool name
   * @return (undocumented)
   */
  public <K extends java.lang.Object, V extends java.lang.Object, C extends java.lang.Object> org.apache.spark.scheduler.JobWaiter<org.apache.spark.MapOutputStatistics> submitMapStage (org.apache.spark.ShuffleDependency<K, V, C> dependency, scala.Function1<org.apache.spark.MapOutputStatistics, scala.runtime.BoxedUnit> callback, org.apache.spark.util.CallSite callSite, java.util.Properties properties)  { throw new RuntimeException(); }
  /**
   * Cancel a job that is running or waiting in the queue.
   * @param jobId (undocumented)
   * @param reason (undocumented)
   */
  public  void cancelJob (int jobId, scala.Option<java.lang.String> reason)  { throw new RuntimeException(); }
  /**
   * Cancel all jobs in the given job group ID.
   * @param groupId (undocumented)
   */
  public  void cancelJobGroup (java.lang.String groupId)  { throw new RuntimeException(); }
  /**
   * Cancel all jobs that are running or waiting in the queue.
   */
  public  void cancelAllJobs ()  { throw new RuntimeException(); }
    void doCancelAllJobs ()  { throw new RuntimeException(); }
  /**
   * Cancel all jobs associated with a running or scheduled stage.
   * @param stageId (undocumented)
   * @param reason (undocumented)
   */
  public  void cancelStage (int stageId, scala.Option<java.lang.String> reason)  { throw new RuntimeException(); }
  /**
   * Receives notification about shuffle push for a given shuffle from one map
   * task has completed
   * @param shuffleId (undocumented)
   * @param shuffleMergeId (undocumented)
   * @param mapIndex (undocumented)
   */
  public  void shufflePushCompleted (int shuffleId, int shuffleMergeId, int mapIndex)  { throw new RuntimeException(); }
  /**
   * Kill a given task. It will be retried.
   * <p>
   * @return Whether the task was successfully killed.
   * @param taskId (undocumented)
   * @param interruptThread (undocumented)
   * @param reason (undocumented)
   */
  public  boolean killTaskAttempt (long taskId, boolean interruptThread, java.lang.String reason)  { throw new RuntimeException(); }
  /**
   * Resubmit any failed stages. Ordinarily called after a small amount of time has passed since
   * the last fetch failure.
   */
    void resubmitFailedStages ()  { throw new RuntimeException(); }
    void handleJobGroupCancelled (java.lang.String groupId)  { throw new RuntimeException(); }
    void handleBeginEvent (org.apache.spark.scheduler.Task<?> task, org.apache.spark.scheduler.TaskInfo taskInfo)  { throw new RuntimeException(); }
    void handleSpeculativeTaskSubmitted (org.apache.spark.scheduler.Task<?> task)  { throw new RuntimeException(); }
    void handleUnschedulableTaskSetAdded (int stageId, int stageAttemptId)  { throw new RuntimeException(); }
    void handleUnschedulableTaskSetRemoved (int stageId, int stageAttemptId)  { throw new RuntimeException(); }
    void handleTaskSetFailed (org.apache.spark.scheduler.TaskSet taskSet, java.lang.String reason, scala.Option<java.lang.Throwable> exception)  { throw new RuntimeException(); }
    void cleanUpAfterSchedulerStop ()  { throw new RuntimeException(); }
    void handleGetTaskResult (org.apache.spark.scheduler.TaskInfo taskInfo)  { throw new RuntimeException(); }
    void handleJobSubmitted (int jobId, org.apache.spark.rdd.RDD<?> finalRDD, scala.Function2<org.apache.spark.TaskContext, scala.collection.Iterator<?>, ?> func, int[] partitions, org.apache.spark.util.CallSite callSite, org.apache.spark.scheduler.JobListener listener, java.util.Properties properties)  { throw new RuntimeException(); }
    void handleMapStageSubmitted (int jobId, org.apache.spark.ShuffleDependency<?, ?, ?> dependency, org.apache.spark.util.CallSite callSite, org.apache.spark.scheduler.JobListener listener, java.util.Properties properties)  { throw new RuntimeException(); }
    void checkAndScheduleShuffleMergeFinalize (org.apache.spark.scheduler.ShuffleMapStage shuffleStage)  { throw new RuntimeException(); }
  /**
   * Responds to a task finishing. This is called inside the event loop so it assumes that it can
   * modify the scheduler's internal state. Use taskEnded() to post a task end event from outside.
   * @param event (undocumented)
   */
    void handleTaskCompletion (org.apache.spark.scheduler.CompletionEvent event)  { throw new RuntimeException(); }
  /**
   * Schedules shuffle merge finalization.
   * <p>
   * @param stage the stage to finalize shuffle merge
   * @param delay how long to wait before finalizing shuffle merge
   * @param registerMergeResults indicate whether DAGScheduler would register the received
   *                             MergeStatus with MapOutputTracker and wait to schedule the reduce
   *                             stage until MergeStatus have been received from all mergers or
   *                             reaches timeout. For very small shuffle, this could be set to
   *                             false to avoid impact to job runtime.
   */
    void scheduleShuffleMergeFinalize (org.apache.spark.scheduler.ShuffleMapStage stage, long delay, boolean registerMergeResults)  { throw new RuntimeException(); }
  /**
   * DAGScheduler notifies all the remote shuffle services chosen to serve shuffle merge request for
   * the given shuffle map stage to finalize the shuffle merge process for this shuffle. This is
   * invoked in a separate thread to reduce the impact on the DAGScheduler main thread, as the
   * scheduler might need to talk to 1000s of shuffle services to finalize shuffle merge.
   * <p>
   * @param stage ShuffleMapStage to finalize shuffle merge for
   * @param registerMergeResults indicate whether DAGScheduler would register the received
   *                             MergeStatus with MapOutputTracker and wait to schedule the reduce
   *                             stage until MergeStatus have been received from all mergers or
   *                             reaches timeout. For very small shuffle, this could be set to
   *                             false to avoid impact to job runtime.
   */
    void finalizeShuffleMerge (org.apache.spark.scheduler.ShuffleMapStage stage, boolean registerMergeResults)  { throw new RuntimeException(); }
    void handleRegisterMergeStatuses (org.apache.spark.scheduler.ShuffleMapStage stage, scala.collection.Seq<scala.Tuple2<java.lang.Object, org.apache.spark.scheduler.MergeStatus>> mergeStatuses)  { throw new RuntimeException(); }
    void handleShuffleMergeFinalized (org.apache.spark.scheduler.ShuffleMapStage stage, int shuffleMergeId)  { throw new RuntimeException(); }
    void handleShufflePushCompleted (int shuffleId, int shuffleMergeId, int mapIndex)  { throw new RuntimeException(); }
    void markMapStageJobsAsFinished (org.apache.spark.scheduler.ShuffleMapStage shuffleStage)  { throw new RuntimeException(); }
  /**
   * Responds to an executor being lost. This is called inside the event loop, so it assumes it can
   * modify the scheduler's internal state. Use executorLost() to post a loss event from outside.
   * <p>
   * We will also assume that we've lost all shuffle blocks associated with the executor if the
   * executor serves its own blocks (i.e., we're not using an external shuffle service), or the
   * entire Standalone worker is lost.
   * @param execId (undocumented)
   * @param workerHost (undocumented)
   */
    void handleExecutorLost (java.lang.String execId, scala.Option<java.lang.String> workerHost)  { throw new RuntimeException(); }
  /**
   * Responds to a worker being removed. This is called inside the event loop, so it assumes it can
   * modify the scheduler's internal state. Use workerRemoved() to post a loss event from outside.
   * <p>
   * We will assume that we've lost all shuffle blocks associated with the host if a worker is
   * removed, so we will remove them all from MapStatus.
   * <p>
   * @param workerId identifier of the worker that is removed.
   * @param host host of the worker that is removed.
   * @param message the reason why the worker is removed.
   */
    void handleWorkerRemoved (java.lang.String workerId, java.lang.String host, java.lang.String message)  { throw new RuntimeException(); }
    void handleExecutorAdded (java.lang.String execId, java.lang.String host)  { throw new RuntimeException(); }
    void handleStageCancellation (int stageId, scala.Option<java.lang.String> reason)  { throw new RuntimeException(); }
    void handleJobCancellation (int jobId, scala.Option<java.lang.String> reason)  { throw new RuntimeException(); }
  /**
   * Aborts all jobs depending on a particular Stage. This is called in response to a task set
   * being canceled by the TaskScheduler. Use taskSetFailed() to inject this event from outside.
   * @param failedStage (undocumented)
   * @param reason (undocumented)
   * @param exception (undocumented)
   */
    void abortStage (org.apache.spark.scheduler.Stage failedStage, java.lang.String reason, scala.Option<java.lang.Throwable> exception)  { throw new RuntimeException(); }
  /**
   * Gets the locality information associated with a partition of a particular RDD.
   * <p>
   * This method is thread-safe and is called from both DAGScheduler and SparkContext.
   * <p>
   * @param rdd whose partitions are to be looked at
   * @param partition to lookup locality information for
   * @return list of machines that are preferred by the partition
   */
    scala.collection.Seq<org.apache.spark.scheduler.TaskLocation> getPreferredLocs (org.apache.spark.rdd.RDD<?> rdd, int partition)  { throw new RuntimeException(); }
  /** Mark a map stage job as finished with the given output stats, and report to its listener. */
  public  void markMapStageJobAsFinished (org.apache.spark.scheduler.ActiveJob job, org.apache.spark.MapOutputStatistics stats)  { throw new RuntimeException(); }
  public  void stop ()  { throw new RuntimeException(); }
}
