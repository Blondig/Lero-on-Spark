package org.apache.spark;
public  class MapOutputTracker$ implements org.apache.spark.internal.Logging {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final MapOutputTracker$ MODULE$ = null;
  public   MapOutputTracker$ ()  { throw new RuntimeException(); }
  public  java.lang.String ENDPOINT_NAME ()  { throw new RuntimeException(); }
  public  int SHUFFLE_PUSH_MAP_ID ()  { throw new RuntimeException(); }
  public <T extends org.apache.spark.scheduler.ShuffleOutputStatus> scala.Tuple2<byte[], org.apache.spark.broadcast.Broadcast<byte[][]>> serializeOutputStatuses (T[] statuses, org.apache.spark.broadcast.BroadcastManager broadcastManager, boolean isLocal, int minBroadcastSize, org.apache.spark.SparkConf conf)  { throw new RuntimeException(); }
  public <T extends org.apache.spark.scheduler.ShuffleOutputStatus> T[] deserializeOutputStatuses (byte[] bytes, org.apache.spark.SparkConf conf)  { throw new RuntimeException(); }
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
  public  org.apache.spark.MapSizesByExecutorId convertMapStatuses (int shuffleId, int startPartition, int endPartition, org.apache.spark.scheduler.MapStatus[] mapStatuses, int startMapIndex, int endMapIndex, scala.Option<org.apache.spark.scheduler.MergeStatus[]> mergeStatuses)  { throw new RuntimeException(); }
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
  public  scala.collection.Iterator<scala.Tuple2<org.apache.spark.storage.BlockManagerId, scala.collection.Seq<scala.Tuple3<org.apache.spark.storage.BlockId, java.lang.Object, java.lang.Object>>>> getMapStatusesForMergeStatus (int shuffleId, int partitionId, org.apache.spark.scheduler.MapStatus[] mapStatuses, org.roaringbitmap.RoaringBitmap tracker)  { throw new RuntimeException(); }
  public  void validateStatus (org.apache.spark.scheduler.ShuffleOutputStatus status, int shuffleId, int partition)  { throw new RuntimeException(); }
}
