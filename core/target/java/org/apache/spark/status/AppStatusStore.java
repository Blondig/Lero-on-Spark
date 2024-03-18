package org.apache.spark.status;
/**
 * A wrapper around a KVStore that provides methods for accessing the API data stored within.
 */
  class AppStatusStore {
  static public  long CURRENT_VERSION ()  { throw new RuntimeException(); }
  /**
   * Create an in-memory store for a live application.
   * @param conf (undocumented)
   * @param appStatusSource (undocumented)
   * @return (undocumented)
   */
  static public  org.apache.spark.status.AppStatusStore createLiveStore (org.apache.spark.SparkConf conf, scala.Option<org.apache.spark.status.AppStatusSource> appStatusSource)  { throw new RuntimeException(); }
  public  org.apache.spark.util.kvstore.KVStore store ()  { throw new RuntimeException(); }
  public  scala.Option<org.apache.spark.status.AppStatusListener> listener ()  { throw new RuntimeException(); }
  // not preceding
  public   AppStatusStore (org.apache.spark.util.kvstore.KVStore store, scala.Option<org.apache.spark.status.AppStatusListener> listener)  { throw new RuntimeException(); }
  public  org.apache.spark.status.api.v1.ApplicationInfo applicationInfo ()  { throw new RuntimeException(); }
  public  org.apache.spark.status.api.v1.ApplicationEnvironmentInfo environmentInfo ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.status.api.v1.ResourceProfileInfo> resourceProfileInfo ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.status.api.v1.JobData> jobsList (java.util.List<org.apache.spark.JobExecutionStatus> statuses)  { throw new RuntimeException(); }
  public  org.apache.spark.status.api.v1.JobData job (int jobId)  { throw new RuntimeException(); }
  public  scala.Tuple2<org.apache.spark.status.api.v1.JobData, scala.Option<java.lang.Object>> jobWithAssociatedSql (int jobId)  { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.status.api.v1.ExecutorSummary> executorList (boolean activeOnly)  { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.status.api.v1.ProcessSummary> miscellaneousProcessList (boolean activeOnly)  { throw new RuntimeException(); }
  public  org.apache.spark.status.api.v1.ExecutorSummary executorSummary (java.lang.String executorId)  { throw new RuntimeException(); }
  /**
   * This is used by ConsoleProgressBar to quickly fetch active stages for drawing the progress
   * bar. It will only return anything useful when called from a live application.
   * @return (undocumented)
   */
  public  scala.collection.Seq<org.apache.spark.status.api.v1.StageData> activeStages ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.status.api.v1.StageData> stageList (java.util.List<org.apache.spark.status.api.v1.StageStatus> statuses, boolean details, boolean withSummaries, double[] unsortedQuantiles, java.util.List<org.apache.spark.status.api.v1.TaskStatus> taskStatus)  { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.status.api.v1.StageData> stageData (int stageId, boolean details, java.util.List<org.apache.spark.status.api.v1.TaskStatus> taskStatus, boolean withSummaries, double[] unsortedQuantiles)  { throw new RuntimeException(); }
  public  org.apache.spark.status.api.v1.StageData lastStageAttempt (int stageId)  { throw new RuntimeException(); }
  public  scala.Tuple2<org.apache.spark.status.api.v1.StageData, scala.collection.Seq<java.lang.Object>> stageAttempt (int stageId, int stageAttemptId, boolean details, java.util.List<org.apache.spark.status.api.v1.TaskStatus> taskStatus, boolean withSummaries, double[] unsortedQuantiles)  { throw new RuntimeException(); }
  public  long taskCount (int stageId, int stageAttemptId)  { throw new RuntimeException(); }
  public  scala.collection.immutable.Map<java.lang.String, java.lang.Object> localitySummary (int stageId, int stageAttemptId)  { throw new RuntimeException(); }
  /**
   * Calculates a summary of the task metrics for the given stage attempt, returning the
   * requested quantiles for the recorded metrics.
   * <p>
   * This method can be expensive if the requested quantiles are not cached; the method
   * will only cache certain quantiles (every 0.05 step), so it's recommended to stick to
   * those to avoid expensive scans of all task data.
   * @param stageId (undocumented)
   * @param stageAttemptId (undocumented)
   * @param unsortedQuantiles (undocumented)
   * @return (undocumented)
   */
  public  scala.Option<org.apache.spark.status.api.v1.TaskMetricDistributions> taskSummary (int stageId, int stageAttemptId, double[] unsortedQuantiles)  { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.status.api.v1.TaskData> taskList (int stageId, int stageAttemptId, int maxTasks)  { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.status.api.v1.TaskData> taskList (int stageId, int stageAttemptId, int offset, int length, org.apache.spark.status.api.v1.TaskSorting sortBy, java.util.List<org.apache.spark.status.api.v1.TaskStatus> statuses)  { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.status.api.v1.TaskData> taskList (int stageId, int stageAttemptId, int offset, int length, scala.Option<java.lang.String> sortBy, boolean ascending, java.util.List<org.apache.spark.status.api.v1.TaskStatus> statuses)  { throw new RuntimeException(); }
  public  scala.collection.immutable.Map<java.lang.String, org.apache.spark.status.api.v1.ExecutorStageSummary> executorSummary (int stageId, int attemptId)  { throw new RuntimeException(); }
  public  scala.Option<org.apache.spark.status.api.v1.SpeculationStageSummary> speculationSummary (int stageId, int attemptId)  { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.status.api.v1.RDDStorageInfo> rddList (boolean cachedOnly)  { throw new RuntimeException(); }
  /**
   * Calls a closure that may throw a NoSuchElementException and returns <code>None</code> when the exception
   * is thrown.
   * @param fn (undocumented)
   * @return (undocumented)
   */
  public <T extends java.lang.Object> scala.Option<T> asOption (scala.Function0<T> fn)  { throw new RuntimeException(); }
  public  org.apache.spark.status.api.v1.StageData newStageData (org.apache.spark.status.api.v1.StageData stage, boolean withDetail, java.util.List<org.apache.spark.status.api.v1.TaskStatus> taskStatus, boolean withSummaries, double[] unsortedQuantiles)  { throw new RuntimeException(); }
  public  scala.Option<org.apache.spark.status.api.v1.ExecutorMetricsDistributions> stageExecutorSummary (int stageId, int stageAttemptId, double[] unsortedQuantiles)  { throw new RuntimeException(); }
  public  scala.collection.IndexedSeq<java.lang.Object> getQuantilesValue (scala.collection.IndexedSeq<java.lang.Object> values, double[] quantiles)  { throw new RuntimeException(); }
  public  org.apache.spark.status.api.v1.RDDStorageInfo rdd (int rddId)  { throw new RuntimeException(); }
  /**
   * Calls a closure that may throw a NoSuchElementException and returns <code>None</code> when the exception
   * is thrown.
   * @return (undocumented)
   */
  public  scala.collection.Seq<org.apache.spark.status.StreamBlockData> streamBlocksList ()  { throw new RuntimeException(); }
  public  org.apache.spark.ui.scope.RDDOperationGraph operationGraphForStage (int stageId)  { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.ui.scope.RDDOperationGraph> operationGraphForJob (int jobId)  { throw new RuntimeException(); }
  public  org.apache.spark.status.PoolData pool (java.lang.String name)  { throw new RuntimeException(); }
  public  org.apache.spark.status.AppSummary appSummary ()  { throw new RuntimeException(); }
  public  void close ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.status.api.v1.TaskData> constructTaskDataList (scala.collection.Iterable<org.apache.spark.status.TaskDataWrapper> taskDataWrapperIter)  { throw new RuntimeException(); }
}
