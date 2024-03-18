package org.apache.spark.executor;
/**
 * :: DeveloperApi ::
 * Metrics tracked for executors and the driver.
 * <p>
 * Executor-level metrics are sent from each executor to the driver as part of the Heartbeat.
 */
public  class ExecutorMetrics implements scala.Serializable {
  /**
   * Get the current executor metrics. These are returned as an array, with the index
   * determined by ExecutorMetricType.metricToOffset.
   * <p>
   * @param memoryManager the memory manager for execution and storage memory
   * @return the values of the metrics
   */
  static public  long[] getCurrentMetrics (org.apache.spark.memory.MemoryManager memoryManager)  { throw new RuntimeException(); }
     ExecutorMetrics ()  { throw new RuntimeException(); }
  /** Returns the value for the specified metric. */
  public  long getMetricValue (java.lang.String metricName)  { throw new RuntimeException(); }
  /** Returns true if the values for the metrics have been set, false otherwise. */
  public  boolean isSet ()  { throw new RuntimeException(); }
     ExecutorMetrics (long[] metrics)  { throw new RuntimeException(); }
     ExecutorMetrics (java.util.concurrent.atomic.AtomicLongArray metrics)  { throw new RuntimeException(); }
  /**
   * Constructor: create the ExecutorMetrics using a given map.
   * <p>
   * @param executorMetrics map of executor metric name to value
   */
     ExecutorMetrics (scala.collection.immutable.Map<java.lang.String, java.lang.Object> executorMetrics)  { throw new RuntimeException(); }
  /**
   * Compare the specified executor metrics values with the current executor metric values,
   * and update the value for any metrics where the new value for the metric is larger.
   * <p>
   * @param executorMetrics the executor metrics to compare
   * @return if there is a new peak value for any metric
   */
    boolean compareAndUpdatePeakValues (org.apache.spark.executor.ExecutorMetrics executorMetrics)  { throw new RuntimeException(); }
}
