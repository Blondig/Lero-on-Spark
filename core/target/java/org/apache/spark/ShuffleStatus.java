package org.apache.spark;
/**
 * Helper class used by the {@link MapOutputTrackerMaster} to perform bookkeeping for a single
 * ShuffleMapStage.
 * <p>
 * This class maintains a mapping from map index to <code>MapStatus</code>. It also maintains a cache of
 * serialized map statuses in order to speed up tasks' requests for map output statuses.
 * <p>
 * All public methods of this class are thread-safe.
 */
public  class ShuffleStatus implements org.apache.spark.internal.Logging {
  public   ShuffleStatus (int numPartitions, int numReducers)  { throw new RuntimeException(); }
  /**
   * MapStatus for each partition. The index of the array is the map partition id.
   * Each value in the array is the MapStatus for a partition, or null if the partition
   * is not available. Even though in theory a task may run multiple times (due to speculation,
   * stage retries, etc.), in practice the likelihood of a map output being available at multiple
   * locations is so small that we choose to ignore that case and store only a single location
   * for each output.
   * @return (undocumented)
   */
  public  org.apache.spark.scheduler.MapStatus[] mapStatuses ()  { throw new RuntimeException(); }
  /**
   * Keep the previous deleted MapStatus for recovery.
   * @return (undocumented)
   */
  public  org.apache.spark.scheduler.MapStatus[] mapStatusesDeleted ()  { throw new RuntimeException(); }
  /**
   * MergeStatus for each shuffle partition when push-based shuffle is enabled. The index of the
   * array is the shuffle partition id (reduce id). Each value in the array is the MergeStatus for
   * a shuffle partition, or null if not available. When push-based shuffle is enabled, this array
   * provides a reducer oriented view of the shuffle status specifically for the results of
   * merging shuffle partition blocks into per-partition merged shuffle files.
   * @return (undocumented)
   */
  public  org.apache.spark.scheduler.MergeStatus[] mergeStatuses ()  { throw new RuntimeException(); }
  /**
   * Broadcast variable holding serialized map output statuses array. When {@link serializedMapStatus}
   * serializes the map statuses array it may detect that the result is too large to send in a
   * single RPC, in which case it places the serialized array into a broadcast variable and then
   * sends a serialized broadcast variable instead. This variable holds a reference to that
   * broadcast variable in order to keep it from being garbage collected and to allow for it to be
   * explicitly destroyed later on when the ShuffleMapStage is garbage-collected.
   * @return (undocumented)
   */
    org.apache.spark.broadcast.Broadcast<byte[][]> cachedSerializedBroadcast ()  { throw new RuntimeException(); }
  /**
   * Register a map output. If there is already a registered location for the map output then it
   * will be replaced by the new location.
   * @param mapIndex (undocumented)
   * @param status (undocumented)
   */
  public  void addMapOutput (int mapIndex, org.apache.spark.scheduler.MapStatus status)  { throw new RuntimeException(); }
  /**
   * Update the map output location (e.g. during migration).
   * @param mapId (undocumented)
   * @param bmAddress (undocumented)
   */
  public  void updateMapOutput (long mapId, org.apache.spark.storage.BlockManagerId bmAddress)  { throw new RuntimeException(); }
  /**
   * Remove the map output which was served by the specified block manager.
   * This is a no-op if there is no registered map output or if the registered output is from a
   * different block manager.
   * @param mapIndex (undocumented)
   * @param bmAddress (undocumented)
   */
  public  void removeMapOutput (int mapIndex, org.apache.spark.storage.BlockManagerId bmAddress)  { throw new RuntimeException(); }
  /**
   * Register a merge result.
   * @param reduceId (undocumented)
   * @param status (undocumented)
   */
  public  void addMergeResult (int reduceId, org.apache.spark.scheduler.MergeStatus status)  { throw new RuntimeException(); }
  public  void registerShuffleMergerLocations (scala.collection.Seq<org.apache.spark.storage.BlockManagerId> shuffleMergers)  { throw new RuntimeException(); }
  public  void removeShuffleMergerLocations ()  { throw new RuntimeException(); }
  /**
   * Remove the merge result which was served by the specified block manager.
   * @param reduceId (undocumented)
   * @param bmAddress (undocumented)
   */
  public  void removeMergeResult (int reduceId, org.apache.spark.storage.BlockManagerId bmAddress)  { throw new RuntimeException(); }
  /**
   * Removes all shuffle outputs associated with this host. Note that this will also remove
   * outputs which are served by an external shuffle server (if one exists).
   * @param host (undocumented)
   */
  public  void removeOutputsOnHost (java.lang.String host)  { throw new RuntimeException(); }
  /**
   * Removes all map outputs associated with the specified executor. Note that this will also
   * remove outputs which are served by an external shuffle server (if one exists), as they are
   * still registered with that execId.
   * @param execId (undocumented)
   */
  public  void removeOutputsOnExecutor (java.lang.String execId)  { throw new RuntimeException(); }
  /**
   * Removes all shuffle outputs which satisfies the filter. Note that this will also
   * remove outputs which are served by an external shuffle server (if one exists).
   * @param f (undocumented)
   */
  public  void removeOutputsByFilter (scala.Function1<org.apache.spark.storage.BlockManagerId, java.lang.Object> f)  { throw new RuntimeException(); }
  /**
   * Removes all shuffle merge result which satisfies the filter.
   * @param f (undocumented)
   */
  public  void removeMergeResultsByFilter (scala.Function1<org.apache.spark.storage.BlockManagerId, java.lang.Object> f)  { throw new RuntimeException(); }
  /**
   * Number of partitions that have shuffle map outputs.
   * @return (undocumented)
   */
  public  int numAvailableMapOutputs ()  { throw new RuntimeException(); }
  /**
   * Number of shuffle partitions that have already been merge finalized when push-based
   * is enabled.
   * @return (undocumented)
   */
  public  int numAvailableMergeResults ()  { throw new RuntimeException(); }
  /**
   * Returns the sequence of partition ids that are missing (i.e. needs to be computed).
   * @return (undocumented)
   */
  public  scala.collection.Seq<java.lang.Object> findMissingPartitions ()  { throw new RuntimeException(); }
  /**
   * Serializes the mapStatuses array into an efficient compressed format. See the comments on
   * <code>MapOutputTracker.serializeOutputStatuses()</code> for more details on the serialization format.
   * <p>
   * This method is designed to be called multiple times and implements caching in order to speed
   * up subsequent requests. If the cache is empty and multiple threads concurrently attempt to
   * serialize the map statuses then serialization will only be performed in a single thread and
   * all other threads will block until the cache is populated.
   * @param broadcastManager (undocumented)
   * @param isLocal (undocumented)
   * @param minBroadcastSize (undocumented)
   * @param conf (undocumented)
   * @return (undocumented)
   */
  public  byte[] serializedMapStatus (org.apache.spark.broadcast.BroadcastManager broadcastManager, boolean isLocal, int minBroadcastSize, org.apache.spark.SparkConf conf)  { throw new RuntimeException(); }
  /**
   * Serializes the mapStatuses and mergeStatuses array into an efficient compressed format.
   * See the comments on <code>MapOutputTracker.serializeOutputStatuses()</code> for more details
   * on the serialization format.
   * <p>
   * This method is designed to be called multiple times and implements caching in order to speed
   * up subsequent requests. If the cache is empty and multiple threads concurrently attempt to
   * serialize the statuses array then serialization will only be performed in a single thread and
   * all other threads will block until the cache is populated.
   * @param broadcastManager (undocumented)
   * @param isLocal (undocumented)
   * @param minBroadcastSize (undocumented)
   * @param conf (undocumented)
   * @return (undocumented)
   */
  public  scala.Tuple2<byte[], byte[]> serializedMapAndMergeStatus (org.apache.spark.broadcast.BroadcastManager broadcastManager, boolean isLocal, int minBroadcastSize, org.apache.spark.SparkConf conf)  { throw new RuntimeException(); }
  public  boolean hasCachedSerializedBroadcast ()  { throw new RuntimeException(); }
  /**
   * Helper function which provides thread-safe access to the mapStatuses array.
   * The function should NOT mutate the array.
   * @param f (undocumented)
   * @return (undocumented)
   */
  public <T extends java.lang.Object> T withMapStatuses (scala.Function1<org.apache.spark.scheduler.MapStatus[], T> f)  { throw new RuntimeException(); }
  public <T extends java.lang.Object> T withMergeStatuses (scala.Function1<org.apache.spark.scheduler.MergeStatus[], T> f)  { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.storage.BlockManagerId> getShufflePushMergerLocations ()  { throw new RuntimeException(); }
  /**
   * Clears the cached serialized map output statuses.
   */
  public  void invalidateSerializedMapOutputStatusCache ()  { throw new RuntimeException(); }
  /**
   * Clears the cached serialized merge result statuses.
   */
  public  void invalidateSerializedMergeOutputStatusCache ()  { throw new RuntimeException(); }
}
