package org.apache.spark;
/**
 * Executor-side client for fetching map output info from the driver's MapOutputTrackerMaster.
 * Note that this is not used in local-mode; instead, local-mode Executors access the
 * MapOutputTrackerMaster directly (which is possible because the master and worker share a common
 * superclass).
 */
  class MapOutputTrackerWorker extends org.apache.spark.MapOutputTracker {
  public   MapOutputTrackerWorker (org.apache.spark.SparkConf conf)  { throw new RuntimeException(); }
  public  scala.collection.Iterator<scala.Tuple2<org.apache.spark.storage.BlockManagerId, scala.collection.Seq<scala.Tuple3<org.apache.spark.storage.BlockId, java.lang.Object, java.lang.Object>>>> getMapSizesByExecutorId (int shuffleId, int startMapIndex, int endMapIndex, int startPartition, int endPartition)  { throw new RuntimeException(); }
  public  scala.collection.Iterator<scala.Tuple2<org.apache.spark.storage.BlockManagerId, scala.collection.Seq<scala.Tuple3<org.apache.spark.storage.BlockId, java.lang.Object, java.lang.Object>>>> getMapSizesForMergeResult (int shuffleId, int partitionId)  { throw new RuntimeException(); }
  public  scala.collection.Iterator<scala.Tuple2<org.apache.spark.storage.BlockManagerId, scala.collection.Seq<scala.Tuple3<org.apache.spark.storage.BlockId, java.lang.Object, java.lang.Object>>>> getMapSizesForMergeResult (int shuffleId, int partitionId, org.roaringbitmap.RoaringBitmap chunkTracker)  { throw new RuntimeException(); }
  public  org.apache.spark.MapSizesByExecutorId getPushBasedShuffleMapSizesByExecutorId (int shuffleId, int startMapIndex, int endMapIndex, int startPartition, int endPartition)  { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.storage.BlockManagerId> getShufflePushMergerLocations (int shuffleId)  { throw new RuntimeException(); }
  public  scala.collection.mutable.Map<java.lang.Object, org.apache.spark.scheduler.MapStatus[]> mapStatuses ()  { throw new RuntimeException(); }
  public  scala.collection.mutable.Map<java.lang.Object, org.apache.spark.scheduler.MergeStatus[]> mergeStatuses ()  { throw new RuntimeException(); }
  /**
   * {@link shufflePushMergerLocations} tracks shuffle push merger locations for the latest
   * shuffle execution
   * <p>
   * Exposed for testing
   * @return (undocumented)
   */
  public  scala.collection.concurrent.Map<java.lang.Object, scala.collection.Seq<org.apache.spark.storage.BlockManagerId>> shufflePushMergerLocations ()  { throw new RuntimeException(); }
  /** Unregister shuffle data. */
  public  void unregisterShuffle (int shuffleId)  { throw new RuntimeException(); }
  /**
   * Called from executors to update the epoch number, potentially clearing old outputs
   * because of a fetch failure. Each executor task calls this with the latest epoch
   * number on the driver at the time it was created.
   * @param newEpoch (undocumented)
   */
  public  void updateEpoch (long newEpoch)  { throw new RuntimeException(); }
}
