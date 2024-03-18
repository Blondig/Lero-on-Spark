package org.apache.spark.storage;
/**
 * Manager running on every node (driver and executors) which provides interfaces for putting and
 * retrieving blocks both locally and remotely into various stores (memory, disk, and off-heap).
 * <p>
 * Note that {@link initialize()} must be called before the BlockManager is usable.
 */
  class BlockManager implements org.apache.spark.network.BlockDataManager, org.apache.spark.storage.memory.BlockEvictionHandler, org.apache.spark.internal.Logging {
  /**
   * Helper for storing a block based from bytes already in a local temp file.
   */
    class TempFileBasedBlockStoreUpdater<T extends java.lang.Object> extends org.apache.spark.storage.BlockManager.BlockStoreUpdater<T> implements scala.Product, scala.Serializable {
    public  org.apache.spark.storage.BlockId blockId ()  { throw new RuntimeException(); }
    public  org.apache.spark.storage.StorageLevel level ()  { throw new RuntimeException(); }
    public  scala.reflect.ClassTag<T> classTag ()  { throw new RuntimeException(); }
    public  java.io.File tmpFile ()  { throw new RuntimeException(); }
    public  long blockSize ()  { throw new RuntimeException(); }
    public  boolean tellMaster ()  { throw new RuntimeException(); }
    public  boolean keepReadLock ()  { throw new RuntimeException(); }
    // not preceding
    public   TempFileBasedBlockStoreUpdater (org.apache.spark.storage.BlockId blockId, org.apache.spark.storage.StorageLevel level, scala.reflect.ClassTag<T> classTag, java.io.File tmpFile, long blockSize, boolean tellMaster, boolean keepReadLock)  { throw new RuntimeException(); }
    public  org.apache.spark.util.io.ChunkedByteBuffer readToByteBuffer ()  { throw new RuntimeException(); }
    public  org.apache.spark.storage.BlockData blockData ()  { throw new RuntimeException(); }
    public  void saveToDiskStore ()  { throw new RuntimeException(); }
    public  boolean save ()  { throw new RuntimeException(); }
  }
  public  class TempFileBasedBlockStoreUpdater$ implements scala.Serializable {
    public   TempFileBasedBlockStoreUpdater$ ()  { throw new RuntimeException(); }
  }
  /**
   * Abstraction for storing blocks from bytes, whether they start in memory or on disk.
   * <p>
   * param:  blockSize the decrypted size of the block
   */
   abstract class BlockStoreUpdater<T extends java.lang.Object> {
    // not preceding
    // TypeTree().setOriginal(TypeBoundsTree(TypeTree(), TypeTree()))
    public   BlockStoreUpdater (long blockSize, org.apache.spark.storage.BlockId blockId, org.apache.spark.storage.StorageLevel level, scala.reflect.ClassTag<T> classTag, boolean tellMaster, boolean keepReadLock)  { throw new RuntimeException(); }
    protected abstract  org.apache.spark.storage.BlockData blockData ()  ;
    /**
     *  Reads the block content into the memory. If the update of the block store is based on a
     *  temporary file this could lead to loading the whole file into a ChunkedByteBuffer.
     * @return (undocumented)
     */
    protected abstract  org.apache.spark.util.io.ChunkedByteBuffer readToByteBuffer ()  ;
    /**
     * Put the given data according to the given level in one of the block stores, replicating
     * the values if necessary.
     * <p>
     * If the block already exists, this method will not overwrite it.
     * <p>
     * If keepReadLock is true, this method will hold the read lock when it returns (even if the
     * block already exists). If false, this method will hold no locks when it returns.
     * <p>
     * @return true if the block was already present or if the put succeeded, false otherwise.
     */
    public  boolean save ()  { throw new RuntimeException(); }
    protected abstract  void saveToDiskStore ()  ;
  }
  static public  class RemoteBlockDownloadFileManager implements org.apache.spark.network.shuffle.DownloadFileManager, org.apache.spark.internal.Logging {
    public   RemoteBlockDownloadFileManager (org.apache.spark.storage.BlockManager blockManager, scala.Option<byte[]> encryptionKey)  { throw new RuntimeException(); }
    public  org.apache.spark.network.shuffle.DownloadFile createTempFile (org.apache.spark.network.util.TransportConf transportConf)  { throw new RuntimeException(); }
    public  boolean registerTempFileToClean (org.apache.spark.network.shuffle.DownloadFile file)  { throw new RuntimeException(); }
    public  void stop ()  { throw new RuntimeException(); }
  }
  static public  scala.collection.immutable.Map<org.apache.spark.storage.BlockId, scala.collection.Seq<java.lang.String>> blockIdsToLocations (org.apache.spark.storage.BlockId[] blockIds, org.apache.spark.SparkEnv env, org.apache.spark.storage.BlockManagerMaster blockManagerMaster)  { throw new RuntimeException(); }
  public  java.lang.String executorId ()  { throw new RuntimeException(); }
  public  org.apache.spark.storage.BlockManagerMaster master ()  { throw new RuntimeException(); }
  public  org.apache.spark.serializer.SerializerManager serializerManager ()  { throw new RuntimeException(); }
  public  org.apache.spark.SparkConf conf ()  { throw new RuntimeException(); }
  public  org.apache.spark.network.BlockTransferService blockTransferService ()  { throw new RuntimeException(); }
  // not preceding
  public   BlockManager (java.lang.String executorId, org.apache.spark.rpc.RpcEnv rpcEnv, org.apache.spark.storage.BlockManagerMaster master, org.apache.spark.serializer.SerializerManager serializerManager, org.apache.spark.SparkConf conf, org.apache.spark.memory.MemoryManager memoryManager, org.apache.spark.MapOutputTracker mapOutputTracker, org.apache.spark.shuffle.ShuffleManager shuffleManager, org.apache.spark.network.BlockTransferService blockTransferService, org.apache.spark.SecurityManager securityManager, scala.Option<org.apache.spark.network.shuffle.ExternalBlockStoreClient> externalBlockStoreClient)  { throw new RuntimeException(); }
    boolean externalShuffleServiceEnabled ()  { throw new RuntimeException(); }
    int subDirsPerLocalDir ()  { throw new RuntimeException(); }
  public  org.apache.spark.storage.DiskBlockManager diskBlockManager ()  { throw new RuntimeException(); }
    org.apache.spark.storage.BlockInfoManager blockInfoManager ()  { throw new RuntimeException(); }
    org.apache.spark.storage.memory.MemoryStore memoryStore ()  { throw new RuntimeException(); }
    org.apache.spark.storage.DiskStore diskStore ()  { throw new RuntimeException(); }
    int externalShuffleServicePort ()  { throw new RuntimeException(); }
  public  org.apache.spark.storage.BlockManagerId blockManagerId ()  { throw new RuntimeException(); }
    org.apache.spark.storage.BlockManagerId shuffleServerId ()  { throw new RuntimeException(); }
    org.apache.spark.network.shuffle.BlockStoreClient blockStoreClient ()  { throw new RuntimeException(); }
    scala.Option<org.apache.spark.storage.BlockManagerDecommissioner> decommissioner ()  { throw new RuntimeException(); }
    org.apache.spark.storage.BlockManager.RemoteBlockDownloadFileManager remoteBlockTempFileManager ()  { throw new RuntimeException(); }
  public  scala.Option<org.apache.spark.storage.HostLocalDirManager> hostLocalDirManager ()  { throw new RuntimeException(); }
  public final  boolean isDecommissioning ()  { throw new RuntimeException(); }
  // not preceding
    org.apache.spark.shuffle.MigratableResolver migratableResolver ()  { throw new RuntimeException(); }
  public  java.lang.String[] getLocalDiskDirs ()  { throw new RuntimeException(); }
  /**
   * Diagnose the possible cause of the shuffle data corruption by verifying the shuffle checksums
   * <p>
   * @param blockId The blockId of the corrupted shuffle block
   * @param checksumByReader The checksum value of the corrupted block
   * @param algorithm The cheksum algorithm that is used when calculating the checksum value
   * @return (undocumented)
   */
  public  org.apache.spark.network.shuffle.checksum.Cause diagnoseShuffleBlockCorruption (org.apache.spark.storage.BlockId blockId, long checksumByReader, java.lang.String algorithm)  { throw new RuntimeException(); }
  /**
   * Initializes the BlockManager with the given appId. This is not performed in the constructor as
   * the appId may not be known at BlockManager instantiation time (in particular for the driver,
   * where it is only learned after registration with the TaskScheduler).
   * <p>
   * This method initializes the BlockTransferService and BlockStoreClient, registers with the
   * BlockManagerMaster, starts the BlockManagerWorker endpoint, and registers with a local shuffle
   * service if configured.
   * @param appId (undocumented)
   */
  public  void initialize (java.lang.String appId)  { throw new RuntimeException(); }
  public  org.apache.spark.metrics.source.Source shuffleMetricsSource ()  { throw new RuntimeException(); }
  /**
   * Re-register with the master and report all blocks to it. This will be called by the heart beat
   * thread if our heartbeat to the block manager indicates that we were not registered.
   * <p>
   * Note that this method must be called without any BlockInfo locks held.
   */
  public  void reregister ()  { throw new RuntimeException(); }
  /**
   * For testing. Wait for any pending asynchronous re-registration; otherwise, do nothing.
   */
  public  void waitForAsyncReregister ()  { throw new RuntimeException(); }
  public  org.apache.spark.network.buffer.ManagedBuffer getHostLocalShuffleData (org.apache.spark.storage.BlockId blockId, java.lang.String[] dirs)  { throw new RuntimeException(); }
  /**
   * Interface to get local block data. Throws an exception if the block cannot be found or
   * cannot be read successfully.
   * @param blockId (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.network.buffer.ManagedBuffer getLocalBlockData (org.apache.spark.storage.BlockId blockId)  { throw new RuntimeException(); }
  /**
   * Put the block locally, using the given storage level.
   * <p>
   * '''Important!''' Callers must not mutate or release the data buffer underlying <code>bytes</code>. Doing
   * so may corrupt or change the data stored by the <code>BlockManager</code>.
   * @param blockId (undocumented)
   * @param data (undocumented)
   * @param level (undocumented)
   * @param classTag (undocumented)
   * @return (undocumented)
   */
  public  boolean putBlockData (org.apache.spark.storage.BlockId blockId, org.apache.spark.network.buffer.ManagedBuffer data, org.apache.spark.storage.StorageLevel level, scala.reflect.ClassTag<?> classTag)  { throw new RuntimeException(); }
  public  org.apache.spark.network.client.StreamCallbackWithID putBlockDataAsStream (org.apache.spark.storage.BlockId blockId, org.apache.spark.storage.StorageLevel level, scala.reflect.ClassTag<?> classTag)  { throw new RuntimeException(); }
  /**
   * Get the local merged shuffle block data for the given block ID as multiple chunks.
   * A merged shuffle file is divided into multiple chunks according to the index file.
   * Instead of reading the entire file as a single block, we split it into smaller chunks
   * which will be memory efficient when performing certain operations.
   * @param blockId (undocumented)
   * @param dirs (undocumented)
   * @return (undocumented)
   */
  public  scala.collection.Seq<org.apache.spark.network.buffer.ManagedBuffer> getLocalMergedBlockData (org.apache.spark.storage.ShuffleMergedBlockId blockId, java.lang.String[] dirs)  { throw new RuntimeException(); }
  /**
   * Get the local merged shuffle block meta data for the given block ID.
   * @param blockId (undocumented)
   * @param dirs (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.network.shuffle.MergedBlockMeta getLocalMergedBlockMeta (org.apache.spark.storage.ShuffleMergedBlockId blockId, java.lang.String[] dirs)  { throw new RuntimeException(); }
  /**
   * Get the BlockStatus for the block identified by the given ID, if it exists.
   * NOTE: This is mainly for testing.
   * @param blockId (undocumented)
   * @return (undocumented)
   */
  public  scala.Option<org.apache.spark.storage.BlockStatus> getStatus (org.apache.spark.storage.BlockId blockId)  { throw new RuntimeException(); }
  /**
   * Get the ids of existing blocks that match the given filter. Note that this will
   * query the blocks stored in the disk block manager (that the block manager
   * may not know of).
   * @param filter (undocumented)
   * @return (undocumented)
   */
  public  scala.collection.Seq<org.apache.spark.storage.BlockId> getMatchingBlockIds (scala.Function1<org.apache.spark.storage.BlockId, java.lang.Object> filter)  { throw new RuntimeException(); }
  /**
   * Tell the master about the current storage status of a block. This will send a block update
   * message reflecting the current status, *not* the desired storage level in its block info.
   * For example, a block with MEMORY_AND_DISK set might have fallen out to be only on disk.
   * <p>
   * droppedMemorySize exists to account for when the block is dropped from memory to disk (so
   * it is still valid). This ensures that update in master will compensate for the increase in
   * memory on the storage endpoint.
   * @param blockId (undocumented)
   * @param status (undocumented)
   * @param droppedMemorySize (undocumented)
   */
    void reportBlockStatus (org.apache.spark.storage.BlockId blockId, org.apache.spark.storage.BlockStatus status, long droppedMemorySize)  { throw new RuntimeException(); }
  /**
   * Get block from local block manager as an iterator of Java objects.
   * @param blockId (undocumented)
   * @return (undocumented)
   */
  public  scala.Option<org.apache.spark.storage.BlockResult> getLocalValues (org.apache.spark.storage.BlockId blockId)  { throw new RuntimeException(); }
  /**
   * Get block from the local block manager as serialized bytes.
   * @param blockId (undocumented)
   * @return (undocumented)
   */
  public  scala.Option<org.apache.spark.storage.BlockData> getLocalBytes (org.apache.spark.storage.BlockId blockId)  { throw new RuntimeException(); }
  /**
   * Get block from remote block managers.
   * <p>
   * This does not acquire a lock on this block in this JVM.
   * @param blockId (undocumented)
   * @param evidence$1 (undocumented)
   * @return (undocumented)
   */
   <T extends java.lang.Object> scala.Option<org.apache.spark.storage.BlockResult> getRemoteValues (org.apache.spark.storage.BlockId blockId, scala.reflect.ClassTag<T> evidence$1)  { throw new RuntimeException(); }
  /**
   * Get the remote block and transform it to the provided data type.
   * <p>
   * If the block is persisted to the disk and stored at an executor running on the same host then
   * first it is tried to be accessed using the local directories of the other executor directly.
   * If the file is successfully identified then tried to be transformed by the provided
   * transformation function which expected to open the file. If there is any exception during this
   * transformation then block access falls back to fetching it from the remote executor via the
   * network.
   * <p>
   * @param blockId identifies the block to get
   * @param bufferTransformer this transformer expected to open the file if the block is backed by a
   *                          file by this it is guaranteed the whole content can be loaded
   * @tparam T result type
   * @return (undocumented)
   */
   <T extends java.lang.Object> scala.Option<T> getRemoteBlock (org.apache.spark.storage.BlockId blockId, scala.Function1<org.apache.spark.network.buffer.ManagedBuffer, T> bufferTransformer)  { throw new RuntimeException(); }
  /**
   * Return a list of locations for the given block, prioritizing the local machine since
   * multiple block managers can share the same host, followed by hosts on the same rack.
   * <p>
   * Within each of the above listed groups (same host, same rack and others) executors are
   * preferred over the external shuffle service.
   * @param locations (undocumented)
   * @return (undocumented)
   */
    scala.collection.Seq<org.apache.spark.storage.BlockManagerId> sortLocations (scala.collection.Seq<org.apache.spark.storage.BlockManagerId> locations)  { throw new RuntimeException(); }
  /**
   * Reads the block from the local directories of another executor which runs on the same host.
   * @param blockId (undocumented)
   * @param localDirs (undocumented)
   * @param blockSize (undocumented)
   * @return (undocumented)
   */
    scala.Option<org.apache.spark.network.buffer.ManagedBuffer> readDiskBlockFromSameHostExecutor (org.apache.spark.storage.BlockId blockId, java.lang.String[] localDirs, long blockSize)  { throw new RuntimeException(); }
  /**
   * Get block from remote block managers as serialized bytes.
   * @param blockId (undocumented)
   * @return (undocumented)
   */
  public  scala.Option<org.apache.spark.util.io.ChunkedByteBuffer> getRemoteBytes (org.apache.spark.storage.BlockId blockId)  { throw new RuntimeException(); }
  /**
   * Get a block from the block manager (either local or remote).
   * <p>
   * This acquires a read lock on the block if the block was stored locally and does not acquire
   * any locks if the block was fetched from a remote block manager. The read lock will
   * automatically be freed once the result's <code>data</code> iterator is fully consumed.
   * @param blockId (undocumented)
   * @param evidence$2 (undocumented)
   * @return (undocumented)
   */
  public <T extends java.lang.Object> scala.Option<org.apache.spark.storage.BlockResult> get (org.apache.spark.storage.BlockId blockId, scala.reflect.ClassTag<T> evidence$2)  { throw new RuntimeException(); }
  /**
   * Downgrades an exclusive write lock to a shared read lock.
   * @param blockId (undocumented)
   */
  public  void downgradeLock (org.apache.spark.storage.BlockId blockId)  { throw new RuntimeException(); }
  /**
   * Release a lock on the given block with explicit TaskContext.
   * The param <code>taskContext</code> should be passed in case we can't get the correct TaskContext,
   * for example, the input iterator of a cached RDD iterates to the end in a child
   * thread.
   * @param blockId (undocumented)
   * @param taskContext (undocumented)
   */
  public  void releaseLock (org.apache.spark.storage.BlockId blockId, scala.Option<org.apache.spark.TaskContext> taskContext)  { throw new RuntimeException(); }
  /**
   * Registers a task with the BlockManager in order to initialize per-task bookkeeping structures.
   * @param taskAttemptId (undocumented)
   */
  public  void registerTask (long taskAttemptId)  { throw new RuntimeException(); }
  /**
   * Release all locks for the given task.
   * <p>
   * @return the blocks whose locks were released.
   * @param taskAttemptId (undocumented)
   */
  public  scala.collection.Seq<org.apache.spark.storage.BlockId> releaseAllLocksForTask (long taskAttemptId)  { throw new RuntimeException(); }
  /**
   * Retrieve the given block if it exists, otherwise call the provided <code>makeIterator</code> method
   * to compute the block, persist it, and return its values.
   * <p>
   * @return either a BlockResult if the block was successfully cached, or an iterator if the block
   *         could not be cached.
   * @param blockId (undocumented)
   * @param level (undocumented)
   * @param classTag (undocumented)
   * @param makeIterator (undocumented)
   */
  public <T extends java.lang.Object> scala.util.Either<org.apache.spark.storage.BlockResult, scala.collection.Iterator<T>> getOrElseUpdate (org.apache.spark.storage.BlockId blockId, org.apache.spark.storage.StorageLevel level, scala.reflect.ClassTag<T> classTag, scala.Function0<scala.collection.Iterator<T>> makeIterator)  { throw new RuntimeException(); }
  /**
   * @return true if the block was stored or false if an error occurred.
   * @param blockId (undocumented)
   * @param values (undocumented)
   * @param level (undocumented)
   * @param tellMaster (undocumented)
   * @param evidence$3 (undocumented)
   */
  public <T extends java.lang.Object> boolean putIterator (org.apache.spark.storage.BlockId blockId, scala.collection.Iterator<T> values, org.apache.spark.storage.StorageLevel level, boolean tellMaster, scala.reflect.ClassTag<T> evidence$3)  { throw new RuntimeException(); }
  /**
   * A short circuited method to get a block writer that can write data directly to disk.
   * The Block will be appended to the File specified by filename. Callers should handle error
   * cases.
   * @param blockId (undocumented)
   * @param file (undocumented)
   * @param serializerInstance (undocumented)
   * @param bufferSize (undocumented)
   * @param writeMetrics (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.storage.DiskBlockObjectWriter getDiskWriter (org.apache.spark.storage.BlockId blockId, java.io.File file, org.apache.spark.serializer.SerializerInstance serializerInstance, int bufferSize, org.apache.spark.shuffle.ShuffleWriteMetricsReporter writeMetrics)  { throw new RuntimeException(); }
  /**
   * Put a new block of serialized bytes to the block manager.
   * <p>
   * '''Important!''' Callers must not mutate or release the data buffer underlying <code>bytes</code>. Doing
   * so may corrupt or change the data stored by the <code>BlockManager</code>.
   * <p>
   * @return true if the block was stored or false if an error occurred.
   * @param blockId (undocumented)
   * @param bytes (undocumented)
   * @param level (undocumented)
   * @param tellMaster (undocumented)
   * @param evidence$4 (undocumented)
   */
  public <T extends java.lang.Object> boolean putBytes (org.apache.spark.storage.BlockId blockId, org.apache.spark.util.io.ChunkedByteBuffer bytes, org.apache.spark.storage.StorageLevel level, boolean tellMaster, scala.reflect.ClassTag<T> evidence$4)  { throw new RuntimeException(); }
  /**
   * Get peer block managers in the system.
   * @param forceFetch (undocumented)
   * @return (undocumented)
   */
    scala.collection.Seq<org.apache.spark.storage.BlockManagerId> getPeers (boolean forceFetch)  { throw new RuntimeException(); }
  /**
   * Replicates a block to peer block managers based on existingReplicas and maxReplicas
   * <p>
   * @param blockId blockId being replicate
   * @param existingReplicas existing block managers that have a replica
   * @param maxReplicas maximum replicas needed
   * @param maxReplicationFailures number of replication failures to tolerate before
   *                               giving up.
   * @return whether block was successfully replicated or not
   */
  public  boolean replicateBlock (org.apache.spark.storage.BlockId blockId, scala.collection.immutable.Set<org.apache.spark.storage.BlockManagerId> existingReplicas, int maxReplicas, scala.Option<java.lang.Object> maxReplicationFailures)  { throw new RuntimeException(); }
  /**
   * Read a block consisting of a single object.
   * @param blockId (undocumented)
   * @param evidence$5 (undocumented)
   * @return (undocumented)
   */
  public <T extends java.lang.Object> scala.Option<T> getSingle (org.apache.spark.storage.BlockId blockId, scala.reflect.ClassTag<T> evidence$5)  { throw new RuntimeException(); }
  /**
   * Write a block consisting of a single object.
   * <p>
   * @return true if the block was stored or false if the block was already stored or an
   *         error occurred.
   * @param blockId (undocumented)
   * @param value (undocumented)
   * @param level (undocumented)
   * @param tellMaster (undocumented)
   * @param evidence$6 (undocumented)
   */
  public <T extends java.lang.Object> boolean putSingle (org.apache.spark.storage.BlockId blockId, T value, org.apache.spark.storage.StorageLevel level, boolean tellMaster, scala.reflect.ClassTag<T> evidence$6)  { throw new RuntimeException(); }
  /**
   * Drop a block from memory, possibly putting it on disk if applicable. Called when the memory
   * store reaches its limit and needs to free up space.
   * <p>
   * If <code>data</code> is not put on disk, it won't be created.
   * <p>
   * The caller of this method must hold a write lock on the block before calling this method.
   * This method does not release the write lock.
   * <p>
   * @return the block's new effective StorageLevel.
   * @param blockId (undocumented)
   * @param data (undocumented)
   * @param evidence$7 (undocumented)
   */
   <T extends java.lang.Object> org.apache.spark.storage.StorageLevel dropFromMemory (org.apache.spark.storage.BlockId blockId, scala.Function0<scala.util.Either<java.lang.Object, org.apache.spark.util.io.ChunkedByteBuffer>> data, scala.reflect.ClassTag<T> evidence$7)  { throw new RuntimeException(); }
  /**
   * Remove all blocks belonging to the given RDD.
   * <p>
   * @return The number of blocks removed.
   * @param rddId (undocumented)
   */
  public  int removeRdd (int rddId)  { throw new RuntimeException(); }
  public  void decommissionBlockManager ()  { throw new RuntimeException(); }
    void decommissionSelf ()  { throw new RuntimeException(); }
  /**
   *  Returns the last migration time and a boolean denoting if all the blocks have been migrated.
   *  If there are any tasks running since that time the boolean may be incorrect.
   * @return (undocumented)
   */
    scala.Tuple2<java.lang.Object, java.lang.Object> lastMigrationInfo ()  { throw new RuntimeException(); }
    scala.collection.Seq<org.apache.spark.storage.BlockManagerMessages.ReplicateBlock> getMigratableRDDBlocks ()  { throw new RuntimeException(); }
  /**
   * Remove all blocks belonging to the given broadcast.
   * @param broadcastId (undocumented)
   * @param tellMaster (undocumented)
   * @return (undocumented)
   */
  public  int removeBroadcast (long broadcastId, boolean tellMaster)  { throw new RuntimeException(); }
  /**
   * Remove a block from both memory and disk.
   * @param blockId (undocumented)
   * @param tellMaster (undocumented)
   */
  public  void removeBlock (org.apache.spark.storage.BlockId blockId, boolean tellMaster)  { throw new RuntimeException(); }
  public  void releaseLockAndDispose (org.apache.spark.storage.BlockId blockId, org.apache.spark.storage.BlockData data, scala.Option<org.apache.spark.TaskContext> taskContext)  { throw new RuntimeException(); }
  public  void stop ()  { throw new RuntimeException(); }
}
