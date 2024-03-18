package org.apache.spark;
/**
 * An asynchronous cleaner for RDD, shuffle, and broadcast state.
 * <p>
 * This maintains a weak reference for each RDD, ShuffleDependency, and Broadcast of interest,
 * to be processed when the associated object goes out of scope of the application. Actual
 * cleanup is performed in a separate daemon thread.
 */
  class ContextCleaner implements org.apache.spark.internal.Logging {
  public   ContextCleaner (org.apache.spark.SparkContext sc, org.apache.spark.shuffle.api.ShuffleDriverComponents shuffleDriverComponents)  { throw new RuntimeException(); }
  /** Attach a listener object to get information of when objects are cleaned. */
  public  void attachListener (org.apache.spark.CleanerListener listener)  { throw new RuntimeException(); }
  /** Start the cleaner. */
  public  void start ()  { throw new RuntimeException(); }
  /**
   * Stop the cleaning thread and wait until the thread has finished running its current task.
   */
  public  void stop ()  { throw new RuntimeException(); }
  /** Register an RDD for cleanup when it is garbage collected. */
  public  void registerRDDForCleanup (org.apache.spark.rdd.RDD<?> rdd)  { throw new RuntimeException(); }
  public  void registerAccumulatorForCleanup (org.apache.spark.util.AccumulatorV2<?, ?> a)  { throw new RuntimeException(); }
  /** Register a ShuffleDependency for cleanup when it is garbage collected. */
  public  void registerShuffleForCleanup (org.apache.spark.ShuffleDependency<?, ?, ?> shuffleDependency)  { throw new RuntimeException(); }
  /** Register a Broadcast for cleanup when it is garbage collected. */
  public <T extends java.lang.Object> void registerBroadcastForCleanup (org.apache.spark.broadcast.Broadcast<T> broadcast)  { throw new RuntimeException(); }
  /** Register a RDDCheckpointData for cleanup when it is garbage collected. */
  public <T extends java.lang.Object> void registerRDDCheckpointDataForCleanup (org.apache.spark.rdd.RDD<?> rdd, int parentId)  { throw new RuntimeException(); }
  /** Register a SparkListener to be cleaned up when its owner is garbage collected. */
  public  void registerSparkListenerForCleanup (java.lang.Object listenerOwner, org.apache.spark.scheduler.SparkListener listener)  { throw new RuntimeException(); }
  /** Perform RDD cleanup. */
  public  void doCleanupRDD (int rddId, boolean blocking)  { throw new RuntimeException(); }
  /** Perform shuffle cleanup. */
  public  void doCleanupShuffle (int shuffleId, boolean blocking)  { throw new RuntimeException(); }
  /** Perform broadcast cleanup. */
  public  void doCleanupBroadcast (long broadcastId, boolean blocking)  { throw new RuntimeException(); }
  /** Perform accumulator cleanup. */
  public  void doCleanupAccum (long accId, boolean blocking)  { throw new RuntimeException(); }
  /**
   * Clean up checkpoint files written to a reliable storage.
   * Locally checkpointed files are cleaned up separately through RDD cleanups.
   * @param rddId (undocumented)
   */
  public  void doCleanCheckpoint (int rddId)  { throw new RuntimeException(); }
  public  void doCleanSparkListener (org.apache.spark.scheduler.SparkListener listener)  { throw new RuntimeException(); }
}
