package org.apache.spark;
/**
 * Driver-side class that keeps track of the location of the map output of a stage.
 * <p>
 * The DAGScheduler uses this class to (de)register map output statuses and to look up statistics
 * for performing locality-aware reduce task scheduling.
 * <p>
 * ShuffleMapStage uses this class for tracking available / missing outputs in order to determine
 * which tasks need to be run.
 */
  class MapOutputTrackerMaster extends org.apache.spark.MapOutputTracker {
  // not preceding
  public   MapOutputTrackerMaster (org.apache.spark.SparkConf conf, org.apache.spark.broadcast.BroadcastManager broadcastManager, boolean isLocal)  { throw new RuntimeException(); }
    org.apache.spark.broadcast.BroadcastManager broadcastManager ()  { throw new RuntimeException(); }
  /** Check if the given shuffle is being tracked */
  public  boolean containsShuffle (int shuffleId)  { throw new RuntimeException(); }
  /**
   * To equally divide n elements into m buckets, basically each bucket should have n/m elements,
   * for the remaining n%m elements, add one more element to the first n%m buckets each.
   * @param numElements (undocumented)
   * @param numBuckets (undocumented)
   * @return (undocumented)
   */
  public  scala.collection.Seq<scala.collection.Seq<java.lang.Object>> equallyDivide (int numElements, int numBuckets)  { throw new RuntimeException(); }
  /**
   * Returns the sequence of partition ids that are missing (i.e. needs to be computed), or None
   * if the MapOutputTrackerMaster doesn't know about this shuffle.
   * @param shuffleId (undocumented)
   * @return (undocumented)
   */
  public  scala.Option<scala.collection.Seq<java.lang.Object>> findMissingPartitions (int shuffleId)  { throw new RuntimeException(); }
  /** Called to get current epoch number. */
  public  long getEpoch ()  { throw new RuntimeException(); }
  /**
   * Return a list of locations that each have fraction of map output greater than the specified
   * threshold.
   * <p>
   * @param shuffleId id of the shuffle
   * @param reducerId id of the reduce task
   * @param numReducers total number of reducers in the shuffle
   * @param fractionThreshold fraction of total map output size that a location must have
   *                          for it to be considered large.
   * @return (undocumented)
   */
  public  scala.Option<org.apache.spark.storage.BlockManagerId[]> getLocationsWithLargestOutputs (int shuffleId, int reducerId, int numReducers, double fractionThreshold)  { throw new RuntimeException(); }
  /**
   * Return the locations where the Mappers ran. The locations each includes both a host and an
   * executor id on that host.
   * <p>
   * @param dep shuffle dependency object
   * @param startMapIndex the start map index
   * @param endMapIndex the end map index (exclusive)
   * @return a sequence of locations where task runs.
   */
  public  scala.collection.Seq<java.lang.String> getMapLocation (org.apache.spark.ShuffleDependency<?, ?, ?> dep, int startMapIndex, int endMapIndex)  { throw new RuntimeException(); }
  public  scala.collection.Iterator<scala.Tuple2<org.apache.spark.storage.BlockManagerId, scala.collection.Seq<scala.Tuple3<org.apache.spark.storage.BlockId, java.lang.Object, java.lang.Object>>>> getMapSizesByExecutorId (int shuffleId, int startMapIndex, int endMapIndex, int startPartition, int endPartition)  { throw new RuntimeException(); }
  public  scala.collection.Iterator<scala.Tuple2<org.apache.spark.storage.BlockManagerId, scala.collection.Seq<scala.Tuple3<org.apache.spark.storage.BlockId, java.lang.Object, java.lang.Object>>>> getMapSizesForMergeResult (int shuffleId, int partitionId)  { throw new RuntimeException(); }
  public  scala.collection.Iterator<scala.Tuple2<org.apache.spark.storage.BlockManagerId, scala.collection.Seq<scala.Tuple3<org.apache.spark.storage.BlockId, java.lang.Object, java.lang.Object>>>> getMapSizesForMergeResult (int shuffleId, int partitionId, org.roaringbitmap.RoaringBitmap chunkTracker)  { throw new RuntimeException(); }
  /** VisibleForTest. Invoked in test only. */
    int getNumAvailableMergeResults (int shuffleId)  { throw new RuntimeException(); }
  public  int getNumAvailableOutputs (int shuffleId)  { throw new RuntimeException(); }
    int getNumCachedSerializedBroadcast ()  { throw new RuntimeException(); }
  /**
   * Return the preferred hosts on which to run the given map output partition in a given shuffle,
   * i.e. the nodes that the most outputs for that partition are on. If the map output is
   * pre-merged, then return the node where the merged block is located if the merge ratio is
   * above the threshold.
   * <p>
   * @param dep shuffle dependency object
   * @param partitionId map output partition that we want to read
   * @return a sequence of host names
   */
  public  scala.collection.Seq<java.lang.String> getPreferredLocationsForShuffle (org.apache.spark.ShuffleDependency<?, ?, ?> dep, int partitionId)  { throw new RuntimeException(); }
  public  org.apache.spark.MapSizesByExecutorId getPushBasedShuffleMapSizesByExecutorId (int shuffleId, int startMapIndex, int endMapIndex, int startPartition, int endPartition)  { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.storage.BlockManagerId> getShufflePushMergerLocations (int shuffleId)  { throw new RuntimeException(); }
  /**
   * Return statistics about all of the outputs for a given shuffle.
   * @param dep (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.MapOutputStatistics getStatistics (org.apache.spark.ShuffleDependency<?, ?, ?> dep)  { throw new RuntimeException(); }
  public  void incrementEpoch ()  { throw new RuntimeException(); }
    boolean isLocal ()  { throw new RuntimeException(); }
  public  void post (org.apache.spark.MapOutputTrackerMasterMessage message)  { throw new RuntimeException(); }
  /**
   * Grouped function of Range, this is to avoid traverse of all elements of Range using
   * IterableLike's grouped function.
   * @param range (undocumented)
   * @param size (undocumented)
   * @return (undocumented)
   */
  public  scala.collection.Seq<scala.collection.immutable.Range> rangeGrouped (scala.collection.immutable.Range range, int size)  { throw new RuntimeException(); }
  public  void registerMapOutput (int shuffleId, int mapIndex, org.apache.spark.scheduler.MapStatus status)  { throw new RuntimeException(); }
  public  void registerMergeResult (int shuffleId, int reduceId, org.apache.spark.scheduler.MergeStatus status)  { throw new RuntimeException(); }
  public  void registerMergeResults (int shuffleId, scala.collection.Seq<scala.Tuple2<java.lang.Object, org.apache.spark.scheduler.MergeStatus>> statuses)  { throw new RuntimeException(); }
  public  void registerShuffle (int shuffleId, int numMaps, int numReduces)  { throw new RuntimeException(); }
  public  void registerShufflePushMergerLocations (int shuffleId, scala.collection.Seq<org.apache.spark.storage.BlockManagerId> shuffleMergers)  { throw new RuntimeException(); }
  /**
   * Removes all shuffle outputs associated with this executor. Note that this will also remove
   * outputs which are served by an external shuffle server (if one exists), as they are still
   * registered with this execId.
   * @param execId (undocumented)
   */
  public  void removeOutputsOnExecutor (java.lang.String execId)  { throw new RuntimeException(); }
  /**
   * Removes all shuffle outputs associated with this host. Note that this will also remove
   * outputs which are served by an external shuffle server (if one exists).
   * @param host (undocumented)
   */
  public  void removeOutputsOnHost (java.lang.String host)  { throw new RuntimeException(); }
  public  scala.collection.concurrent.Map<java.lang.Object, org.apache.spark.ShuffleStatus> shuffleStatuses ()  { throw new RuntimeException(); }
  public  void stop ()  { throw new RuntimeException(); }
  /** Unregister all map and merge output information of the given shuffle. */
  public  void unregisterAllMapAndMergeOutput (int shuffleId)  { throw new RuntimeException(); }
  public  void unregisterAllMergeResult (int shuffleId)  { throw new RuntimeException(); }
  /** Unregister map output information of the given shuffle, mapper and block manager */
  public  void unregisterMapOutput (int shuffleId, int mapIndex, org.apache.spark.storage.BlockManagerId bmAddress)  { throw new RuntimeException(); }
  /**
   * Unregisters a merge result corresponding to the reduceId if present. If the optional mapIndex
   * is specified, it will only unregister the merge result if the mapIndex is part of that merge
   * result.
   * <p>
   * @param shuffleId the shuffleId.
   * @param reduceId  the reduceId.
   * @param bmAddress block manager address.
   * @param mapIndex  the optional mapIndex which should be checked to see it was part of the
   *                  merge result.
   */
  public  void unregisterMergeResult (int shuffleId, int reduceId, org.apache.spark.storage.BlockManagerId bmAddress, scala.Option<java.lang.Object> mapIndex)  { throw new RuntimeException(); }
  /** Unregister shuffle data */
  public  void unregisterShuffle (int shuffleId)  { throw new RuntimeException(); }
  public  void updateMapOutput (int shuffleId, long mapId, org.apache.spark.storage.BlockManagerId bmAddress)  { throw new RuntimeException(); }
}
