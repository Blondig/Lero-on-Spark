package org.apache.spark.streaming.scheduler;
/**
 * Class that keep track of all the received blocks, and allocate them to batches
 * when required. All actions taken by this class can be saved to a write ahead log
 * (if a checkpoint directory has been provided), so that the state of the tracker
 * (received blocks and block-to-batch allocations) can be recovered after driver failure.
 * <p>
 * Note that when any instance of this class is created with a checkpoint directory,
 * it will try reading events from logs in the directory.
 */
  class ReceivedBlockTracker implements org.apache.spark.internal.Logging {
  static public  java.lang.String checkpointDirToLogDir (java.lang.String checkpointDir)  { throw new RuntimeException(); }
  public   ReceivedBlockTracker (org.apache.spark.SparkConf conf, org.apache.hadoop.conf.Configuration hadoopConf, scala.collection.Seq<java.lang.Object> streamIds, org.apache.spark.util.Clock clock, boolean recoverFromWriteAheadLog, scala.Option<java.lang.String> checkpointDirOption)  { throw new RuntimeException(); }
  /** Add received block. This event will get written to the write ahead log (if enabled). */
  public  boolean addBlock (org.apache.spark.streaming.scheduler.ReceivedBlockInfo receivedBlockInfo)  { throw new RuntimeException(); }
  /**
   * Allocate all unallocated blocks to the given batch.
   * This event will get written to the write ahead log (if enabled).
   * @param batchTime (undocumented)
   */
  public  void allocateBlocksToBatch (org.apache.spark.streaming.Time batchTime)  { throw new RuntimeException(); }
  /** Get the blocks allocated to the given batch. */
  public  scala.collection.immutable.Map<java.lang.Object, scala.collection.Seq<org.apache.spark.streaming.scheduler.ReceivedBlockInfo>> getBlocksOfBatch (org.apache.spark.streaming.Time batchTime)  { throw new RuntimeException(); }
  /** Get the blocks allocated to the given batch and stream. */
  public  scala.collection.Seq<org.apache.spark.streaming.scheduler.ReceivedBlockInfo> getBlocksOfBatchAndStream (org.apache.spark.streaming.Time batchTime, int streamId)  { throw new RuntimeException(); }
  /** Check if any blocks are left to be allocated to batches. */
  public  boolean hasUnallocatedReceivedBlocks ()  { throw new RuntimeException(); }
  /**
   * Get blocks that have been added but not yet allocated to any batch. This method
   * is primarily used for testing.
   * @param streamId (undocumented)
   * @return (undocumented)
   */
  public  scala.collection.Seq<org.apache.spark.streaming.scheduler.ReceivedBlockInfo> getUnallocatedBlocks (int streamId)  { throw new RuntimeException(); }
  /**
   * Clean up block information of old batches. If waitForCompletion is true, this method
   * returns only after the files are cleaned up.
   * @param cleanupThreshTime (undocumented)
   * @param waitForCompletion (undocumented)
   */
  public  void cleanupOldBatches (org.apache.spark.streaming.Time cleanupThreshTime, boolean waitForCompletion)  { throw new RuntimeException(); }
  /** Stop the block tracker. */
  public  void stop ()  { throw new RuntimeException(); }
  /** Write an update to the tracker to the write ahead log */
    boolean writeToLog (org.apache.spark.streaming.scheduler.ReceivedBlockTrackerLogEvent record)  { throw new RuntimeException(); }
  /** Check if the write ahead log is enabled. This is only used for testing purposes. */
    boolean isWriteAheadLogEnabled ()  { throw new RuntimeException(); }
}
