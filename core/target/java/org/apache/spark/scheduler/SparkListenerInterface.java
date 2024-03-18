package org.apache.spark.scheduler;
/**
 * Interface for listening to events from the Spark scheduler. Most applications should probably
 * extend SparkListener or SparkFirehoseListener directly, rather than implementing this class.
 * <p>
 * Note that this is an internal interface which might change in different Spark releases.
 */
public  interface SparkListenerInterface {
  /**
   * Called when the application ends
   * @param applicationEnd (undocumented)
   */
  public  void onApplicationEnd (org.apache.spark.scheduler.SparkListenerApplicationEnd applicationEnd)  ;
  /**
   * Called when the application starts
   * @param applicationStart (undocumented)
   */
  public  void onApplicationStart (org.apache.spark.scheduler.SparkListenerApplicationStart applicationStart)  ;
  /**
   * Called when a new block manager has joined
   * @param blockManagerAdded (undocumented)
   */
  public  void onBlockManagerAdded (org.apache.spark.scheduler.SparkListenerBlockManagerAdded blockManagerAdded)  ;
  /**
   * Called when an existing block manager has been removed
   * @param blockManagerRemoved (undocumented)
   */
  public  void onBlockManagerRemoved (org.apache.spark.scheduler.SparkListenerBlockManagerRemoved blockManagerRemoved)  ;
  /**
   * Called when the driver receives a block update info.
   * @param blockUpdated (undocumented)
   */
  public  void onBlockUpdated (org.apache.spark.scheduler.SparkListenerBlockUpdated blockUpdated)  ;
  /**
   * Called when environment properties have been updated
   * @param environmentUpdate (undocumented)
   */
  public  void onEnvironmentUpdate (org.apache.spark.scheduler.SparkListenerEnvironmentUpdate environmentUpdate)  ;
  /**
   * Called when the driver registers a new executor.
   * @param executorAdded (undocumented)
   */
  public  void onExecutorAdded (org.apache.spark.scheduler.SparkListenerExecutorAdded executorAdded)  ;
  /**
   * Called when the driver excludes an executor for a Spark application.
   * @param executorBlacklisted (undocumented)
   *
   * @deprecated use onExecutorExcluded instead. Since 3.1.0. 
   */
  public  void onExecutorBlacklisted (org.apache.spark.scheduler.SparkListenerExecutorBlacklisted executorBlacklisted)  ;
  /**
   * Called when the driver excludes an executor for a stage.
   * @param executorBlacklistedForStage (undocumented)
   *
   * @deprecated use onExecutorExcludedForStage instead. Since 3.1.0. 
   */
  public  void onExecutorBlacklistedForStage (org.apache.spark.scheduler.SparkListenerExecutorBlacklistedForStage executorBlacklistedForStage)  ;
  /**
   * Called when the driver excludes an executor for a Spark application.
   * @param executorExcluded (undocumented)
   */
  public  void onExecutorExcluded (org.apache.spark.scheduler.SparkListenerExecutorExcluded executorExcluded)  ;
  /**
   * Called when the driver excludes an executor for a stage.
   * @param executorExcludedForStage (undocumented)
   */
  public  void onExecutorExcludedForStage (org.apache.spark.scheduler.SparkListenerExecutorExcludedForStage executorExcludedForStage)  ;
  /**
   * Called when the driver receives task metrics from an executor in a heartbeat.
   * @param executorMetricsUpdate (undocumented)
   */
  public  void onExecutorMetricsUpdate (org.apache.spark.scheduler.SparkListenerExecutorMetricsUpdate executorMetricsUpdate)  ;
  /**
   * Called when the driver removes an executor.
   * @param executorRemoved (undocumented)
   */
  public  void onExecutorRemoved (org.apache.spark.scheduler.SparkListenerExecutorRemoved executorRemoved)  ;
  /**
   * Called when the driver re-enables a previously excluded executor.
   * @param executorUnblacklisted (undocumented)
   *
   * @deprecated use onExecutorUnexcluded instead. Since 3.1.0. 
   */
  public  void onExecutorUnblacklisted (org.apache.spark.scheduler.SparkListenerExecutorUnblacklisted executorUnblacklisted)  ;
  /**
   * Called when the driver re-enables a previously excluded executor.
   * @param executorUnexcluded (undocumented)
   */
  public  void onExecutorUnexcluded (org.apache.spark.scheduler.SparkListenerExecutorUnexcluded executorUnexcluded)  ;
  /**
   * Called when a job ends
   * @param jobEnd (undocumented)
   */
  public  void onJobEnd (org.apache.spark.scheduler.SparkListenerJobEnd jobEnd)  ;
  /**
   * Called when a job starts
   * @param jobStart (undocumented)
   */
  public  void onJobStart (org.apache.spark.scheduler.SparkListenerJobStart jobStart)  ;
  /**
   * Called when the driver excludes a node for a Spark application.
   * @param nodeBlacklisted (undocumented)
   *
   * @deprecated use onNodeExcluded instead. Since 3.1.0. 
   */
  public  void onNodeBlacklisted (org.apache.spark.scheduler.SparkListenerNodeBlacklisted nodeBlacklisted)  ;
  /**
   * Called when the driver excludes a node for a stage.
   * @param nodeBlacklistedForStage (undocumented)
   *
   * @deprecated use onNodeExcludedForStage instead. Since 3.1.0. 
   */
  public  void onNodeBlacklistedForStage (org.apache.spark.scheduler.SparkListenerNodeBlacklistedForStage nodeBlacklistedForStage)  ;
  /**
   * Called when the driver excludes a node for a Spark application.
   * @param nodeExcluded (undocumented)
   */
  public  void onNodeExcluded (org.apache.spark.scheduler.SparkListenerNodeExcluded nodeExcluded)  ;
  /**
   * Called when the driver excludes a node for a stage.
   * @param nodeExcludedForStage (undocumented)
   */
  public  void onNodeExcludedForStage (org.apache.spark.scheduler.SparkListenerNodeExcludedForStage nodeExcludedForStage)  ;
  /**
   * Called when the driver re-enables a previously excluded node.
   * @param nodeUnblacklisted (undocumented)
   *
   * @deprecated use onNodeUnexcluded instead. Since 3.1.0. 
   */
  public  void onNodeUnblacklisted (org.apache.spark.scheduler.SparkListenerNodeUnblacklisted nodeUnblacklisted)  ;
  /**
   * Called when the driver re-enables a previously excluded node.
   * @param nodeUnexcluded (undocumented)
   */
  public  void onNodeUnexcluded (org.apache.spark.scheduler.SparkListenerNodeUnexcluded nodeUnexcluded)  ;
  /**
   * Called when other events like SQL-specific events are posted.
   * @param event (undocumented)
   */
  public  void onOtherEvent (org.apache.spark.scheduler.SparkListenerEvent event)  ;
  /**
   * Called when a Resource Profile is added to the manager.
   * @param event (undocumented)
   */
  public  void onResourceProfileAdded (org.apache.spark.scheduler.SparkListenerResourceProfileAdded event)  ;
  /**
   * Called when a speculative task is submitted
   * @param speculativeTask (undocumented)
   */
  public  void onSpeculativeTaskSubmitted (org.apache.spark.scheduler.SparkListenerSpeculativeTaskSubmitted speculativeTask)  ;
  /**
   * Called when a stage completes successfully or fails, with information on the completed stage.
   * @param stageCompleted (undocumented)
   */
  public  void onStageCompleted (org.apache.spark.scheduler.SparkListenerStageCompleted stageCompleted)  ;
  /**
   * Called with the peak memory metrics for a given (executor, stage) combination. Note that this
   * is only present when reading from the event log (as in the history server), and is never
   * called in a live application.
   * @param executorMetrics (undocumented)
   */
  public  void onStageExecutorMetrics (org.apache.spark.scheduler.SparkListenerStageExecutorMetrics executorMetrics)  ;
  /**
   * Called when a stage is submitted
   * @param stageSubmitted (undocumented)
   */
  public  void onStageSubmitted (org.apache.spark.scheduler.SparkListenerStageSubmitted stageSubmitted)  ;
  /**
   * Called when a task ends
   * @param taskEnd (undocumented)
   */
  public  void onTaskEnd (org.apache.spark.scheduler.SparkListenerTaskEnd taskEnd)  ;
  /**
   * Called when a task begins remotely fetching its result (will not be called for tasks that do
   * not need to fetch the result remotely).
   * @param taskGettingResult (undocumented)
   */
  public  void onTaskGettingResult (org.apache.spark.scheduler.SparkListenerTaskGettingResult taskGettingResult)  ;
  /**
   * Called when a task starts
   * @param taskStart (undocumented)
   */
  public  void onTaskStart (org.apache.spark.scheduler.SparkListenerTaskStart taskStart)  ;
  /**
   * Called when an RDD is manually unpersisted by the application
   * @param unpersistRDD (undocumented)
   */
  public  void onUnpersistRDD (org.apache.spark.scheduler.SparkListenerUnpersistRDD unpersistRDD)  ;
  /**
   * Called when a taskset becomes unschedulable due to exludeOnFailure and dynamic allocation
   * is enabled.
   * @param unschedulableTaskSetAdded (undocumented)
   */
  public  void onUnschedulableTaskSetAdded (org.apache.spark.scheduler.SparkListenerUnschedulableTaskSetAdded unschedulableTaskSetAdded)  ;
  /**
   * Called when an unschedulable taskset becomes schedulable and dynamic allocation
   * is enabled.
   * @param unschedulableTaskSetRemoved (undocumented)
   */
  public  void onUnschedulableTaskSetRemoved (org.apache.spark.scheduler.SparkListenerUnschedulableTaskSetRemoved unschedulableTaskSetRemoved)  ;
}
