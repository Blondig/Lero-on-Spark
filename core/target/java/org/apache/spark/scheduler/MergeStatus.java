package org.apache.spark.scheduler;
/**
 * The status for the result of merging shuffle partition blocks per individual shuffle partition
 * maintained by the scheduler. The scheduler would separate the
 * {@link org.apache.spark.network.shuffle.protocol.MergeStatuses} received from
 * ExternalShuffleService into individual {@link MergeStatus} which is maintained inside
 * MapOutputTracker to be served to the reducers when they start fetching shuffle partition
 * blocks. Note that, the reducers are ultimately fetching individual chunks inside a merged
 * shuffle file, as explained in {@link org.apache.spark.network.shuffle.RemoteBlockPushResolver}.
 * Between the scheduler maintained MergeStatus and the shuffle service maintained per shuffle
 * partition meta file, we are effectively dividing the metadata for a push-based shuffle into
 * 2 layers. The scheduler would track the top-level metadata at the shuffle partition level
 * with MergeStatus, and the shuffle service would maintain the partition level metadata about
 * how to further divide a merged shuffle partition into multiple chunks with the per-partition
 * meta file. This helps to reduce the amount of data the scheduler needs to maintain for
 * push-based shuffle.
 */
  class MergeStatus implements java.io.Externalizable, org.apache.spark.scheduler.ShuffleOutputStatus {
  static public  int SHUFFLE_PUSH_DUMMY_NUM_REDUCES ()  { throw new RuntimeException(); }
  /**
   * Separate a MergeStatuses received from an ExternalShuffleService into individual
   * MergeStatus. The scheduler is responsible for providing the location information
   * for the given ExternalShuffleService.
   * @param mergeStatuses (undocumented)
   * @param loc (undocumented)
   * @return (undocumented)
   */
  static public  scala.collection.Seq<scala.Tuple2<java.lang.Object, org.apache.spark.scheduler.MergeStatus>> convertMergeStatusesToMergeStatusArr (org.apache.spark.network.shuffle.protocol.MergeStatuses mergeStatuses, org.apache.spark.storage.BlockManagerId loc)  { throw new RuntimeException(); }
  static public  org.apache.spark.scheduler.MergeStatus apply (org.apache.spark.storage.BlockManagerId loc, int shuffleMergeId, org.roaringbitmap.RoaringBitmap bitmap, long size)  { throw new RuntimeException(); }
  public   MergeStatus (org.apache.spark.storage.BlockManagerId loc, int _shuffleMergeId, org.roaringbitmap.RoaringBitmap mapTracker, long size)  { throw new RuntimeException(); }
  protected   MergeStatus ()  { throw new RuntimeException(); }
  public  org.apache.spark.storage.BlockManagerId location ()  { throw new RuntimeException(); }
  public  int shuffleMergeId ()  { throw new RuntimeException(); }
  public  long totalSize ()  { throw new RuntimeException(); }
  public  org.roaringbitmap.RoaringBitmap tracker ()  { throw new RuntimeException(); }
  /**
   * Get the list of mapper IDs for missing mapper partition blocks that are not merged.
   * The reducer will use this information to decide which shuffle partition blocks to
   * fetch in the original way.
   * @param numMaps (undocumented)
   * @return (undocumented)
   */
  public  scala.collection.Seq<java.lang.Object> getMissingMaps (int numMaps)  { throw new RuntimeException(); }
  /**
   * Get the number of missing map outputs for missing mapper partition blocks that are not merged.
   * @param numMaps (undocumented)
   * @return (undocumented)
   */
  public  int getNumMissingMapOutputs (int numMaps)  { throw new RuntimeException(); }
  public  void writeExternal (java.io.ObjectOutput out)  { throw new RuntimeException(); }
  public  void readExternal (java.io.ObjectInput in)  { throw new RuntimeException(); }
}
