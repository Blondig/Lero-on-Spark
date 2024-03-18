package org.apache.spark.scheduler;
public  class MergeStatus$ implements scala.Serializable {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final MergeStatus$ MODULE$ = null;
  public   MergeStatus$ ()  { throw new RuntimeException(); }
  public  int SHUFFLE_PUSH_DUMMY_NUM_REDUCES ()  { throw new RuntimeException(); }
  /**
   * Separate a MergeStatuses received from an ExternalShuffleService into individual
   * MergeStatus. The scheduler is responsible for providing the location information
   * for the given ExternalShuffleService.
   * @param mergeStatuses (undocumented)
   * @param loc (undocumented)
   * @return (undocumented)
   */
  public  scala.collection.Seq<scala.Tuple2<java.lang.Object, org.apache.spark.scheduler.MergeStatus>> convertMergeStatusesToMergeStatusArr (org.apache.spark.network.shuffle.protocol.MergeStatuses mergeStatuses, org.apache.spark.storage.BlockManagerId loc)  { throw new RuntimeException(); }
  public  org.apache.spark.scheduler.MergeStatus apply (org.apache.spark.storage.BlockManagerId loc, int shuffleMergeId, org.roaringbitmap.RoaringBitmap bitmap, long size)  { throw new RuntimeException(); }
}
