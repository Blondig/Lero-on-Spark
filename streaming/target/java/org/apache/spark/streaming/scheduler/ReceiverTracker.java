package org.apache.spark.streaming.scheduler;
/**
 * This class manages the execution of the receivers of ReceiverInputDStreams. Instance of
 * this class must be created after all input streams have been added and StreamingContext.start()
 * has been called because it needs the final set of input streams at the time of instantiation.
 * <p>
 * param:  skipReceiverLaunch Do not launch the receiver. This is useful for testing.
 */
  class ReceiverTracker implements org.apache.spark.internal.Logging {
  /** Enumeration to identify current state of the ReceiverTracker */
  public  class TrackerState$ extends scala.Enumeration {
    public   TrackerState$ ()  { throw new RuntimeException(); }
    public  scala.Enumeration.Value Initialized ()  { throw new RuntimeException(); }
    public  scala.Enumeration.Value Started ()  { throw new RuntimeException(); }
    public  scala.Enumeration.Value Stopping ()  { throw new RuntimeException(); }
    public  scala.Enumeration.Value Stopped ()  { throw new RuntimeException(); }
  }
  /**
   * Accessor for nested Scala object
   * @return (undocumented)
   */
  public  org.apache.spark.streaming.scheduler.ReceiverTracker.TrackerState$ TrackerState ()  { throw new RuntimeException(); }
  public   ReceiverTracker (org.apache.spark.streaming.StreamingContext ssc, boolean skipReceiverLaunch)  { throw new RuntimeException(); }
  /** Start the endpoint and receiver execution thread. */
  public  void start ()  { throw new RuntimeException(); }
  /** Stop the receiver execution thread. */
  public  void stop (boolean graceful)  { throw new RuntimeException(); }
  /** Allocate all unallocated blocks to the given batch. */
  public  void allocateBlocksToBatch (org.apache.spark.streaming.Time batchTime)  { throw new RuntimeException(); }
  /** Get the blocks for the given batch and all input streams. */
  public  scala.collection.immutable.Map<java.lang.Object, scala.collection.Seq<org.apache.spark.streaming.scheduler.ReceivedBlockInfo>> getBlocksOfBatch (org.apache.spark.streaming.Time batchTime)  { throw new RuntimeException(); }
  /** Get the blocks allocated to the given batch and stream. */
  public  scala.collection.Seq<org.apache.spark.streaming.scheduler.ReceivedBlockInfo> getBlocksOfBatchAndStream (org.apache.spark.streaming.Time batchTime, int streamId)  { throw new RuntimeException(); }
  /**
   * Clean up the data and metadata of blocks and batches that are strictly
   * older than the threshold time. Note that this does not
   * @param cleanupThreshTime (undocumented)
   */
  public  void cleanupOldBlocksAndBatches (org.apache.spark.streaming.Time cleanupThreshTime)  { throw new RuntimeException(); }
  /**
   * Get the executors allocated to each receiver.
   * @return a map containing receiver ids to optional executor ids.
   */
  public  scala.collection.immutable.Map<java.lang.Object, scala.Option<java.lang.String>> allocatedExecutors ()  { throw new RuntimeException(); }
  public  int numReceivers ()  { throw new RuntimeException(); }
  /** Update a receiver's maximum ingestion rate */
  public  void sendRateUpdate (int streamUID, long newRate)  { throw new RuntimeException(); }
  /** Check if any blocks are left to be processed */
  public  boolean hasUnallocatedBlocks ()  { throw new RuntimeException(); }
}
