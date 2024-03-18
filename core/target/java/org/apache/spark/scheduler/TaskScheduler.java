package org.apache.spark.scheduler;
/**
 * Low-level task scheduler interface, currently implemented exclusively by
 * {@link org.apache.spark.scheduler.TaskSchedulerImpl}.
 * This interface allows plugging in different task schedulers. Each TaskScheduler schedules tasks
 * for a single SparkContext. These schedulers get sets of tasks submitted to them from the
 * DAGScheduler for each stage, and are responsible for sending the tasks to the cluster, running
 * them, retrying if there are failures, and mitigating stragglers. They return events to the
 * DAGScheduler.
 */
public  interface TaskScheduler {
  /**
   * Get an application's attempt ID associated with the job.
   * <p>
   * @return An application's Attempt ID
   */
  public  scala.Option<java.lang.String> applicationAttemptId ()  ;
  /**
   * Get an application ID associated with the job.
   * <p>
   * @return An application ID
   */
  public  java.lang.String applicationId ()  ;
  public  void cancelTasks (int stageId, boolean interruptThread)  ;
  public  int defaultParallelism ()  ;
  /**
   * Process a decommissioning executor.
   * @param executorId (undocumented)
   * @param decommissionInfo (undocumented)
   */
  public  void executorDecommission (java.lang.String executorId, org.apache.spark.scheduler.ExecutorDecommissionInfo decommissionInfo)  ;
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
  public  boolean executorHeartbeatReceived (java.lang.String execId, scala.Tuple2<java.lang.Object, scala.collection.Seq<org.apache.spark.util.AccumulatorV2<?, ?>>>[] accumUpdates, org.apache.spark.storage.BlockManagerId blockManagerId, scala.collection.mutable.Map<scala.Tuple2<java.lang.Object, java.lang.Object>, org.apache.spark.executor.ExecutorMetrics> executorUpdates)  ;
  /**
   * Process a lost executor
   * @param executorId (undocumented)
   * @param reason (undocumented)
   */
  public  void executorLost (java.lang.String executorId, org.apache.spark.scheduler.ExecutorLossReason reason)  ;
  /**
   * If an executor is decommissioned, return its corresponding decommission info
   * @param executorId (undocumented)
   * @return (undocumented)
   */
  public  scala.Option<org.apache.spark.scheduler.ExecutorDecommissionState> getExecutorDecommissionState (java.lang.String executorId)  ;
  public  void killAllTaskAttempts (int stageId, boolean interruptThread, java.lang.String reason)  ;
  /**
   * Kills a task attempt.
   * Throw UnsupportedOperationException if the backend doesn't support kill a task.
   * <p>
   * @return Whether the task was successfully killed.
   * @param taskId (undocumented)
   * @param interruptThread (undocumented)
   * @param reason (undocumented)
   */
  public  boolean killTaskAttempt (long taskId, boolean interruptThread, java.lang.String reason)  ;
  public  void notifyPartitionCompletion (int stageId, int partitionId)  ;
  public  void postStartHook ()  ;
  public  org.apache.spark.scheduler.Pool rootPool ()  ;
  public  scala.Enumeration.Value schedulingMode ()  ;
  public  void setDAGScheduler (org.apache.spark.scheduler.DAGScheduler dagScheduler)  ;
  public  void start ()  ;
  public  void stop ()  ;
  public  void submitTasks (org.apache.spark.scheduler.TaskSet taskSet)  ;
  /**
   * Process a removed worker
   * @param workerId (undocumented)
   * @param host (undocumented)
   * @param message (undocumented)
   */
  public  void workerRemoved (java.lang.String workerId, java.lang.String host, java.lang.String message)  ;
}
