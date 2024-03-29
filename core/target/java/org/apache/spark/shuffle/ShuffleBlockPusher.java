package org.apache.spark.shuffle;
/**
 * Used for pushing shuffle blocks to remote shuffle services when push shuffle is enabled.
 * When push shuffle is enabled, it is created after the shuffle writer finishes writing the shuffle
 * file and initiates the block push process.
 * <p>
 * param:  conf spark configuration
 */
  class ShuffleBlockPusher implements org.apache.spark.internal.Logging {
  /**
   * A request to push blocks to a remote shuffle service
   * param:  address remote shuffle service location to push blocks to
   * param:  blocks list of block IDs and their sizes
   * param:  reqBuffer a chunk of data in the shuffle data file corresponding to the continuous
   *                  blocks represented in this request
   */
  static   class PushRequest implements scala.Product, scala.Serializable {
    public  org.apache.spark.storage.BlockManagerId address ()  { throw new RuntimeException(); }
    public  scala.collection.Seq<scala.Tuple2<org.apache.spark.storage.BlockId, java.lang.Object>> blocks ()  { throw new RuntimeException(); }
    public  org.apache.spark.network.buffer.ManagedBuffer reqBuffer ()  { throw new RuntimeException(); }
    // not preceding
    public   PushRequest (org.apache.spark.storage.BlockManagerId address, scala.collection.Seq<scala.Tuple2<org.apache.spark.storage.BlockId, java.lang.Object>> blocks, org.apache.spark.network.buffer.ManagedBuffer reqBuffer)  { throw new RuntimeException(); }
    public  int size ()  { throw new RuntimeException(); }
  }
  static public  class PushRequest$ extends scala.runtime.AbstractFunction3<org.apache.spark.storage.BlockManagerId, scala.collection.Seq<scala.Tuple2<org.apache.spark.storage.BlockId, java.lang.Object>>, org.apache.spark.network.buffer.ManagedBuffer, org.apache.spark.shuffle.ShuffleBlockPusher.PushRequest> implements scala.Serializable {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final PushRequest$ MODULE$ = null;
    public   PushRequest$ ()  { throw new RuntimeException(); }
  }
  /**
   * Stop the shuffle pusher pool if it isn't null.
   */
  static   void stop ()  { throw new RuntimeException(); }
  public   ShuffleBlockPusher (org.apache.spark.SparkConf conf)  { throw new RuntimeException(); }
    long bytesInFlight ()  { throw new RuntimeException(); }
    scala.collection.mutable.HashSet<org.apache.spark.storage.BlockManagerId> unreachableBlockMgrs ()  { throw new RuntimeException(); }
    org.apache.spark.network.shuffle.ErrorHandler.BlockPushErrorHandler createErrorHandler ()  { throw new RuntimeException(); }
    boolean isPushCompletionNotified ()  { throw new RuntimeException(); }
  /**
   * Initiates the block push.
   * <p>
   * @param dataFile         mapper generated shuffle data file
   * @param partitionLengths array of shuffle block size so we can tell shuffle block
   * @param dep              shuffle dependency to get shuffle ID and the location of remote shuffle
   *                         services to push local shuffle blocks
   * @param mapIndex      map index of the shuffle map task
   */
    void initiateBlockPush (java.io.File dataFile, long[] partitionLengths, org.apache.spark.ShuffleDependency<?, ?, ?> dep, int mapIndex)  { throw new RuntimeException(); }
    void tryPushUpToMax ()  { throw new RuntimeException(); }
  /**
   * Triggers the push. It's a separate method for testing.
   * VisibleForTesting
   * @param task (undocumented)
   */
  protected  void submitTask (java.lang.Runnable task)  { throw new RuntimeException(); }
  /**
   * Notify the driver about all the blocks generated by the current map task having been pushed.
   * This enables the DAGScheduler to finalize shuffle merge as soon as sufficient map tasks have
   * completed push instead of always waiting for a fixed amount of time.
   * <p>
   * VisibleForTesting
   */
  protected  void notifyDriverAboutPushCompletion ()  { throw new RuntimeException(); }
  /**
   * Convert the shuffle data file of the current mapper into a list of PushRequest. Basically,
   * continuous blocks in the shuffle file are grouped into a single request to allow more
   * efficient read of the block data. Each mapper for a given shuffle will receive the same
   * list of BlockManagerIds as the target location to push the blocks to. All mappers in the
   * same shuffle will map shuffle partition ranges to individual target locations in a consistent
   * manner to make sure each target location receives shuffle blocks belonging to the same set
   * of partition ranges. 0-length blocks and blocks that are large enough will be skipped.
   * <p>
   * @param numPartitions number of shuffle partitions in the shuffle file
   * @param partitionId map index of the current mapper
   * @param shuffleId shuffleId of current shuffle
   * @param shuffleMergeId shuffleMergeId is used to uniquely identify merging process
   *                       of shuffle by an indeterminate stage attempt.
   * @param dataFile shuffle data file
   * @param partitionLengths array of sizes of blocks in the shuffle data file
   * @param mergerLocs target locations to push blocks to
   * @param transportConf transportConf used to create FileSegmentManagedBuffer
   * @return List of the PushRequest, randomly shuffled.
   * <p>
   * VisibleForTesting
   */
    scala.collection.Seq<org.apache.spark.shuffle.ShuffleBlockPusher.PushRequest> prepareBlockPushRequests (int numPartitions, int partitionId, int shuffleId, int shuffleMergeId, java.io.File dataFile, long[] partitionLengths, scala.collection.Seq<org.apache.spark.storage.BlockManagerId> mergerLocs, org.apache.spark.network.util.TransportConf transportConf)  { throw new RuntimeException(); }
  protected  org.apache.spark.network.buffer.ManagedBuffer createRequestBuffer (org.apache.spark.network.util.TransportConf conf, java.io.File dataFile, long offset, long length)  { throw new RuntimeException(); }
}
