package org.apache.spark.scheduler;
/**
 * Result returned by a ShuffleMapTask to a scheduler. Includes the block manager address that the
 * task has shuffle files stored on as well as the sizes of outputs for each reducer, for passing
 * on to the reduce tasks.
 */
public  interface MapStatus extends org.apache.spark.scheduler.ShuffleOutputStatus {
  /** Location where this task output is. */
  public  org.apache.spark.storage.BlockManagerId location ()  ;
  public  void updateLocation (org.apache.spark.storage.BlockManagerId newLoc)  ;
  /**
   * Estimated size for the reduce block, in bytes.
   * <p>
   * If a block is non-empty, then this method MUST return a non-zero size.  This invariant is
   * necessary for correctness, since block fetchers are allowed to skip zero-size blocks.
   * @param reduceId (undocumented)
   * @return (undocumented)
   */
  public  long getSizeForBlock (int reduceId)  ;
  /**
   * The unique ID of this shuffle map task, if spark.shuffle.useOldFetchProtocol enabled we use
   * partitionId of the task or taskContext.taskAttemptId is used.
   * @return (undocumented)
   */
  public  long mapId ()  ;
}
