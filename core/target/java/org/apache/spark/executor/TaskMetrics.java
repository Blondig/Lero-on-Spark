package org.apache.spark.executor;
/**
 * :: DeveloperApi ::
 * Metrics tracked during the execution of a task.
 * <p>
 * This class is wrapper around a collection of internal accumulators that represent metrics
 * associated with a task. The local values of these accumulators are sent from the executor
 * to the driver when the task completes. These values are then merged into the corresponding
 * accumulator previously registered on the driver.
 * <p>
 * The accumulator updates are also sent to the driver periodically (on executor heartbeat)
 * and when the task failed with an exception. The {@link TaskMetrics} object itself should never
 * be sent to the driver.
 */
public  class TaskMetrics implements scala.Serializable {
  /**
   * Create an empty task metrics that doesn't register its accumulators.
   * @return (undocumented)
   */
  static public  org.apache.spark.executor.TaskMetrics empty ()  { throw new RuntimeException(); }
  static public  org.apache.spark.executor.TaskMetrics registered ()  { throw new RuntimeException(); }
  /**
   * Construct a {@link TaskMetrics} object from a list of {@link AccumulableInfo}, called on driver only.
   * The returned {@link TaskMetrics} is only used to get some internal metrics, we don't need to take
   * care of external accumulator info passed in.
   * @param infos (undocumented)
   * @return (undocumented)
   */
  static public  org.apache.spark.executor.TaskMetrics fromAccumulatorInfos (scala.collection.Seq<org.apache.spark.scheduler.AccumulableInfo> infos)  { throw new RuntimeException(); }
  /**
   * Construct a {@link TaskMetrics} object from a list of accumulator updates, called on driver only.
   * @param accums (undocumented)
   * @return (undocumented)
   */
  static public  org.apache.spark.executor.TaskMetrics fromAccumulators (scala.collection.Seq<org.apache.spark.util.AccumulatorV2<?, ?>> accums)  { throw new RuntimeException(); }
  static public  org.slf4j.Logger org$apache$spark$internal$Logging$$log_ ()  { throw new RuntimeException(); }
  static public  void org$apache$spark$internal$Logging$$log__$eq (org.slf4j.Logger x$1)  { throw new RuntimeException(); }
  static protected  java.lang.String logName ()  { throw new RuntimeException(); }
  static protected  org.slf4j.Logger log ()  { throw new RuntimeException(); }
  static protected  void logInfo (scala.Function0<java.lang.String> msg)  { throw new RuntimeException(); }
  static protected  void logDebug (scala.Function0<java.lang.String> msg)  { throw new RuntimeException(); }
  static protected  void logTrace (scala.Function0<java.lang.String> msg)  { throw new RuntimeException(); }
  static protected  void logWarning (scala.Function0<java.lang.String> msg)  { throw new RuntimeException(); }
  static protected  void logError (scala.Function0<java.lang.String> msg)  { throw new RuntimeException(); }
  static protected  void logInfo (scala.Function0<java.lang.String> msg, java.lang.Throwable throwable)  { throw new RuntimeException(); }
  static protected  void logDebug (scala.Function0<java.lang.String> msg, java.lang.Throwable throwable)  { throw new RuntimeException(); }
  static protected  void logTrace (scala.Function0<java.lang.String> msg, java.lang.Throwable throwable)  { throw new RuntimeException(); }
  static protected  void logWarning (scala.Function0<java.lang.String> msg, java.lang.Throwable throwable)  { throw new RuntimeException(); }
  static protected  void logError (scala.Function0<java.lang.String> msg, java.lang.Throwable throwable)  { throw new RuntimeException(); }
  static protected  boolean isTraceEnabled ()  { throw new RuntimeException(); }
  static protected  void initializeLogIfNecessary (boolean isInterpreter)  { throw new RuntimeException(); }
  static protected  boolean initializeLogIfNecessary (boolean isInterpreter, boolean silent)  { throw new RuntimeException(); }
  static protected  boolean initializeLogIfNecessary$default$2 ()  { throw new RuntimeException(); }
  static   void initializeForcefully (boolean isInterpreter, boolean silent)  { throw new RuntimeException(); }
     TaskMetrics ()  { throw new RuntimeException(); }
  /**
   * Time taken on the executor to deserialize this task.
   * @return (undocumented)
   */
  public  long executorDeserializeTime ()  { throw new RuntimeException(); }
  /**
   * CPU Time taken on the executor to deserialize this task in nanoseconds.
   * @return (undocumented)
   */
  public  long executorDeserializeCpuTime ()  { throw new RuntimeException(); }
  /**
   * Time the executor spends actually running the task (including fetching shuffle data).
   * @return (undocumented)
   */
  public  long executorRunTime ()  { throw new RuntimeException(); }
  /**
   * CPU Time the executor spends actually running the task
   * (including fetching shuffle data) in nanoseconds.
   * @return (undocumented)
   */
  public  long executorCpuTime ()  { throw new RuntimeException(); }
  /**
   * The number of bytes this task transmitted back to the driver as the TaskResult.
   * @return (undocumented)
   */
  public  long resultSize ()  { throw new RuntimeException(); }
  /**
   * Amount of time the JVM spent in garbage collection while executing this task.
   * @return (undocumented)
   */
  public  long jvmGCTime ()  { throw new RuntimeException(); }
  /**
   * Amount of time spent serializing the task result.
   * @return (undocumented)
   */
  public  long resultSerializationTime ()  { throw new RuntimeException(); }
  /**
   * The number of in-memory bytes spilled by this task.
   * @return (undocumented)
   */
  public  long memoryBytesSpilled ()  { throw new RuntimeException(); }
  /**
   * The number of on-disk bytes spilled by this task.
   * @return (undocumented)
   */
  public  long diskBytesSpilled ()  { throw new RuntimeException(); }
  /**
   * Peak memory used by internal data structures created during shuffles, aggregations and
   * joins. The value of this accumulator should be approximately the sum of the peak sizes
   * across all such data structures created in this task. For SQL jobs, this only tracks all
   * unsafe operators and ExternalSort.
   * @return (undocumented)
   */
  public  long peakExecutionMemory ()  { throw new RuntimeException(); }
  /**
   * Storage statuses of any blocks that have been updated as a result of this task.
   * <p>
   * Tracking the _updatedBlockStatuses can use a lot of memory.
   * It is not used anywhere inside of Spark so we would ideally remove it, but its exposed to
   * the user in SparkListenerTaskEnd so the api is kept for compatibility.
   * Tracking can be turned off to save memory via config
   * TASK_METRICS_TRACK_UPDATED_BLOCK_STATUSES.
   * @return (undocumented)
   */
  public  scala.collection.Seq<scala.Tuple2<org.apache.spark.storage.BlockId, org.apache.spark.storage.BlockStatus>> updatedBlockStatuses ()  { throw new RuntimeException(); }
    void setExecutorDeserializeTime (long v)  { throw new RuntimeException(); }
    void setExecutorDeserializeCpuTime (long v)  { throw new RuntimeException(); }
    void setExecutorRunTime (long v)  { throw new RuntimeException(); }
    void setExecutorCpuTime (long v)  { throw new RuntimeException(); }
    void setResultSize (long v)  { throw new RuntimeException(); }
    void setJvmGCTime (long v)  { throw new RuntimeException(); }
    void setResultSerializationTime (long v)  { throw new RuntimeException(); }
    void setPeakExecutionMemory (long v)  { throw new RuntimeException(); }
    void incMemoryBytesSpilled (long v)  { throw new RuntimeException(); }
    void incDiskBytesSpilled (long v)  { throw new RuntimeException(); }
    void incPeakExecutionMemory (long v)  { throw new RuntimeException(); }
    void incUpdatedBlockStatuses (scala.Tuple2<org.apache.spark.storage.BlockId, org.apache.spark.storage.BlockStatus> v)  { throw new RuntimeException(); }
    void setUpdatedBlockStatuses (java.util.List<scala.Tuple2<org.apache.spark.storage.BlockId, org.apache.spark.storage.BlockStatus>> v)  { throw new RuntimeException(); }
    void setUpdatedBlockStatuses (scala.collection.Seq<scala.Tuple2<org.apache.spark.storage.BlockId, org.apache.spark.storage.BlockStatus>> v)  { throw new RuntimeException(); }
  /**
   * Metrics related to reading data from a {@link org.apache.spark.rdd.HadoopRDD} or from persisted
   * data, defined only in tasks with input.
   * @return (undocumented)
   */
  public  org.apache.spark.executor.InputMetrics inputMetrics ()  { throw new RuntimeException(); }
  /**
   * Metrics related to writing data externally (e.g. to a distributed filesystem),
   * defined only in tasks with output.
   * @return (undocumented)
   */
  public  org.apache.spark.executor.OutputMetrics outputMetrics ()  { throw new RuntimeException(); }
  /**
   * Metrics related to shuffle read aggregated across all shuffle dependencies.
   * This is defined only if there are shuffle dependencies in this task.
   * @return (undocumented)
   */
  public  org.apache.spark.executor.ShuffleReadMetrics shuffleReadMetrics ()  { throw new RuntimeException(); }
  /**
   * Metrics related to shuffle write, defined only in shuffle map stages.
   * @return (undocumented)
   */
  public  org.apache.spark.executor.ShuffleWriteMetrics shuffleWriteMetrics ()  { throw new RuntimeException(); }
  /**
   * Create a {@link TempShuffleReadMetrics} for a particular shuffle dependency.
   * <p>
   * All usages are expected to be followed by a call to {@link mergeShuffleReadMetrics}, which
   * merges the temporary values synchronously. Otherwise, all temporary data collected will
   * be lost.
   * @return (undocumented)
   */
    org.apache.spark.executor.TempShuffleReadMetrics createTempShuffleReadMetrics ()  { throw new RuntimeException(); }
  /**
   * Merge values across all temporary {@link ShuffleReadMetrics} into <code>_shuffleReadMetrics</code>.
   * This is expected to be called on executor heartbeat and at the end of a task.
   */
    void mergeShuffleReadMetrics ()  { throw new RuntimeException(); }
    scala.Option<org.apache.spark.util.LongAccumulator> testAccum ()  { throw new RuntimeException(); }
  // not preceding
    scala.collection.mutable.Map<java.lang.String, org.apache.spark.util.AccumulatorV2<? extends java.lang.Object, ? super java.util.List<scala.Tuple2<org.apache.spark.storage.BlockId, org.apache.spark.storage.BlockStatus>>>> nameToAccums ()  { throw new RuntimeException(); }
  // not preceding
    scala.collection.Seq<org.apache.spark.util.AccumulatorV2<?, ?>> internalAccums ()  { throw new RuntimeException(); }
    void register (org.apache.spark.SparkContext sc)  { throw new RuntimeException(); }
  // not preceding
    scala.collection.mutable.ArrayBuffer<org.apache.spark.util.AccumulatorV2<?, ?>> externalAccums ()  { throw new RuntimeException(); }
    void registerAccumulator (org.apache.spark.util.AccumulatorV2<?, ?> a)  { throw new RuntimeException(); }
    scala.collection.Seq<org.apache.spark.util.AccumulatorV2<?, ?>> accumulators ()  { throw new RuntimeException(); }
    scala.collection.Seq<org.apache.spark.util.AccumulatorV2<?, ?>> nonZeroInternalAccums ()  { throw new RuntimeException(); }
}
