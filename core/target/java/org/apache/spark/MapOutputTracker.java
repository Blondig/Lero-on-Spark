package org.apache.spark;
/**
 * Class that keeps track of the location of the map output of a stage. This is abstract because the
 * driver and executor have different versions of the MapOutputTracker. In principle the driver-
 * and executor-side classes don't need to share a common base class; the current shared base class
 * is maintained primarily for backwards-compatibility in order to avoid having to update existing
 * test code.
 */
 abstract class MapOutputTracker implements org.apache.spark.internal.Logging {
  static public  java.lang.String ENDPOINT_NAME ()  { throw new RuntimeException(); }
  static public  int SHUFFLE_PUSH_MAP_ID ()  { throw new RuntimeException(); }
  static public <T extends org.apache.spark.scheduler.ShuffleOutputStatus> scala.Tuple2<byte[], org.apache.spark.broadcast.Broadcast<byte[][]>> serializeOutputStatuses (T[] statuses, org.apache.spark.broadcast.BroadcastManager broadcastManager, boolean isLocal, int minBroadcastSize, org.apache.spark.SparkConf conf)  { throw new RuntimeException(); }
  static public <T extends org.apache.spark.scheduler.ShuffleOutputStatus> T[] deserializeOutputStatuses (byte[] bytes, org.apache.spark.SparkConf conf)  { throw new RuntimeException(); }
  /**
   * Given an array of map statuses and a range of map output partitions, returns a sequence that,
   * for each block manager ID, lists the shuffle block IDs and corresponding shuffle block sizes
   * stored at that block manager.
   * Note that empty blocks are filtered in the result.
   * <p>
   * If push-based shuffle is enabled and an array of merge statuses is available, prioritize
   * the locations of the merged shuffle partitions over unmerged shuffle blocks.
   * <p>
   * If any of the statuses is null (indicating a missing location due to a failed mapper),
   * throws a FetchFailedException.
   * <p>
   * @param shuffleId Identifier for the shuffle
   * @param startPartition Start of map output partition ID range (included in range)
   * @param endPartition End of map output partition ID range (excluded from range)
   * @param mapStatuses List of map statuses, indexed by map partition index.
   * @param startMapIndex Start Map index.
   * @param endMapIndex End Map index.
   * @param mergeStatuses List of merge statuses, index by reduce ID.
   * @return A sequence of 2-item tuples, where the first item in the tuple is a BlockManagerId,
   *         and the second item is a sequence of (shuffle block id, shuffle block size, map index)
   *         tuples describing the shuffle blocks that are stored at that block manager.
   */
  static public  org.apache.spark.MapSizesByExecutorId convertMapStatuses (int shuffleId, int startPartition, int endPartition, org.apache.spark.scheduler.MapStatus[] mapStatuses, int startMapIndex, int endMapIndex, scala.Option<org.apache.spark.scheduler.MergeStatus[]> mergeStatuses)  { throw new RuntimeException(); }
  /**
   * Given a shuffle ID, a partition ID, an array of map statuses, and bitmap corresponding
   * to either a merged shuffle partition or a merged shuffle partition chunk, identify
   * the metadata about the shuffle partition blocks that are merged into the merged shuffle
   * partition or partition chunk represented by the bitmap.
   * <p>
   * @param shuffleId Identifier for the shuffle
   * @param partitionId The partition ID of the MergeStatus for which we look for the metadata
   *                    of the merged shuffle partition blocks
   * @param mapStatuses List of map statuses, indexed by map ID
   * @param tracker     bitmap containing mapIndexes that belong to the merged block or merged
   *                    block chunk.
   * @return A sequence of 2-item tuples, where the first item in the tuple is a BlockManagerId,
   *         and the second item is a sequence of (shuffle block ID, shuffle block size) tuples
   *         describing the shuffle blocks that are stored at that block manager.
   */
  static public  scala.collection.Iterator<scala.Tuple2<org.apache.spark.storage.BlockManagerId, scala.collection.Seq<scala.Tuple3<org.apache.spark.storage.BlockId, java.lang.Object, java.lang.Object>>>> getMapStatusesForMergeStatus (int shuffleId, int partitionId, org.apache.spark.scheduler.MapStatus[] mapStatuses, org.roaringbitmap.RoaringBitmap tracker)  { throw new RuntimeException(); }
  static public  void validateStatus (org.apache.spark.scheduler.ShuffleOutputStatus status, int shuffleId, int partition)  { throw new RuntimeException(); }
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
  public   MapOutputTracker (org.apache.spark.SparkConf conf)  { throw new RuntimeException(); }
  /** Set to the MapOutputTrackerMasterEndpoint living on the driver. */
  public  org.apache.spark.rpc.RpcEndpointRef trackerEndpoint ()  { throw new RuntimeException(); }
  /**
   * The driver-side counter is incremented every time that a map output is lost. This value is sent
   * to executors as part of tasks, where executors compare the new epoch number to the highest
   * epoch number that they received in the past. If the new epoch number is higher then executors
   * will clear their local caches of map output statuses and will re-fetch (possibly updated)
   * statuses from the driver.
   * @return (undocumented)
   */
  protected  long epoch ()  { throw new RuntimeException(); }
  protected  java.lang.Object epochLock ()  { throw new RuntimeException(); }
  /**
   * Send a message to the trackerEndpoint and get its result within a default timeout, or
   * throw a SparkException if this fails.
   * @param message (undocumented)
   * @param evidence$1 (undocumented)
   * @return (undocumented)
   */
  protected <T extends java.lang.Object> T askTracker (Object message, scala.reflect.ClassTag<T> evidence$1)  { throw new RuntimeException(); }
  /** Send a one-way message to the trackerEndpoint, to which we expect it to reply with true. */
  protected  void sendTracker (Object message)  { throw new RuntimeException(); }
  public  scala.collection.Iterator<scala.Tuple2<org.apache.spark.storage.BlockManagerId, scala.collection.Seq<scala.Tuple3<org.apache.spark.storage.BlockId, java.lang.Object, java.lang.Object>>>> getMapSizesByExecutorId (int shuffleId, int reduceId)  { throw new RuntimeException(); }
  public  org.apache.spark.MapSizesByExecutorId getPushBasedShuffleMapSizesByExecutorId (int shuffleId, int reduceId)  { throw new RuntimeException(); }
  /**
   * Called from executors to get the server URIs and output sizes for each shuffle block that
   * needs to be read from a given range of map output partitions (startPartition is included but
   * endPartition is excluded from the range) within a range of mappers (startMapIndex is included
   * but endMapIndex is excluded) when push based shuffle is not enabled for the specific shuffle
   * dependency. If endMapIndex=Int.MaxValue, the actual endMapIndex will be changed to the length
   * of total map outputs.
   * <p>
   * @return A sequence of 2-item tuples, where the first item in the tuple is a BlockManagerId,
   *         and the second item is a sequence of (shuffle block id, shuffle block size, map index)
   *         tuples describing the shuffle blocks that are stored at that block manager.
   *         Note that zero-sized blocks are excluded in the result.
   * @param shuffleId (undocumented)
   * @param startMapIndex (undocumented)
   * @param endMapIndex (undocumented)
   * @param startPartition (undocumented)
   * @param endPartition (undocumented)
   */
  public abstract  scala.collection.Iterator<scala.Tuple2<org.apache.spark.storage.BlockManagerId, scala.collection.Seq<scala.Tuple3<org.apache.spark.storage.BlockId, java.lang.Object, java.lang.Object>>>> getMapSizesByExecutorId (int shuffleId, int startMapIndex, int endMapIndex, int startPartition, int endPartition)  ;
  /**
   * Called from executors to get the server URIs and output sizes for each shuffle block that
   * needs to be read from a given range of map output partitions (startPartition is included but
   * endPartition is excluded from the range) within a range of mappers (startMapIndex is included
   * but endMapIndex is excluded) when push based shuffle is enabled for the specific shuffle
   * dependency. If endMapIndex=Int.MaxValue, the actual endMapIndex will be changed to the length
   * of total map outputs.
   * <p>
   * @return A case class object which includes two attributes. The first attribute is a sequence
   *         of 2-item tuples, where the first item in the tuple is a BlockManagerId, and the
   *         second item is a sequence of (shuffle block id, shuffle block size, map index) tuples
   *         tuples describing the shuffle blocks that are stored at that block manager. Note that
   *         zero-sized blocks are excluded in the result. The second attribute is a boolean flag,
   *         indicating whether batch fetch can be enabled.
   * @param shuffleId (undocumented)
   * @param startMapIndex (undocumented)
   * @param endMapIndex (undocumented)
   * @param startPartition (undocumented)
   * @param endPartition (undocumented)
   */
  public abstract  org.apache.spark.MapSizesByExecutorId getPushBasedShuffleMapSizesByExecutorId (int shuffleId, int startMapIndex, int endMapIndex, int startPartition, int endPartition)  ;
  /**
   * Called from executors upon fetch failure on an entire merged shuffle reduce partition.
   * Such failures can happen if the shuffle client fails to fetch the metadata for the given
   * merged shuffle partition. This method is to get the server URIs and output sizes for each
   * shuffle block that is merged in the specified merged shuffle block so fetch failure on a
   * merged shuffle block can fall back to fetching the unmerged blocks.
   * <p>
   * @return A sequence of 2-item tuples, where the first item in the tuple is a BlockManagerId,
   *         and the second item is a sequence of (shuffle block ID, shuffle block size, map index)
   *         tuples describing the shuffle blocks that are stored at that block manager.
   * @param shuffleId (undocumented)
   * @param partitionId (undocumented)
   */
  public abstract  scala.collection.Iterator<scala.Tuple2<org.apache.spark.storage.BlockManagerId, scala.collection.Seq<scala.Tuple3<org.apache.spark.storage.BlockId, java.lang.Object, java.lang.Object>>>> getMapSizesForMergeResult (int shuffleId, int partitionId)  ;
  /**
   * Called from executors upon fetch failure on a merged shuffle reduce partition chunk. This is
   * to get the server URIs and output sizes for each shuffle block that is merged in the specified
   * merged shuffle partition chunk so fetch failure on a merged shuffle block chunk can fall back
   * to fetching the unmerged blocks.
   * <p>
   * chunkBitMap tracks the mapIds which are part of the current merged chunk, this way if there is
   * a fetch failure on the merged chunk, it can fallback to fetching the corresponding original
   * blocks part of this merged chunk.
   * <p>
   * @return A sequence of 2-item tuples, where the first item in the tuple is a BlockManagerId,
   *         and the second item is a sequence of (shuffle block ID, shuffle block size, map index)
   *         tuples describing the shuffle blocks that are stored at that block manager.
   * @param shuffleId (undocumented)
   * @param partitionId (undocumented)
   * @param chunkBitmap (undocumented)
   */
  public abstract  scala.collection.Iterator<scala.Tuple2<org.apache.spark.storage.BlockManagerId, scala.collection.Seq<scala.Tuple3<org.apache.spark.storage.BlockId, java.lang.Object, java.lang.Object>>>> getMapSizesForMergeResult (int shuffleId, int partitionId, org.roaringbitmap.RoaringBitmap chunkBitmap)  ;
  /**
   * Called from executors whenever a task with push based shuffle is enabled doesn't have shuffle
   * mergers available. This typically happens when the initial stages doesn't have enough shuffle
   * mergers available since very few executors got registered. This is on a best effort basis,
   * if there is not enough shuffle mergers available for this stage then an empty sequence would
   * be returned indicating the task to avoid shuffle push.
   * @param shuffleId
   * @return (undocumented)
   */
  public abstract  scala.collection.Seq<org.apache.spark.storage.BlockManagerId> getShufflePushMergerLocations (int shuffleId)  ;
  /**
   * Deletes map output status information for the specified shuffle stage.
   * @param shuffleId (undocumented)
   */
  public abstract  void unregisterShuffle (int shuffleId)  ;
  public  void stop ()  { throw new RuntimeException(); }
}
