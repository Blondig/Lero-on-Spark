package org.apache.spark.network;
public  interface BlockDataManager {
  /**
   * Diagnose the possible cause of the shuffle data corruption by verifying the shuffle checksums
   * @param blockId (undocumented)
   * @param checksumByReader (undocumented)
   * @param algorithm (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.network.shuffle.checksum.Cause diagnoseShuffleBlockCorruption (org.apache.spark.storage.BlockId blockId, long checksumByReader, java.lang.String algorithm)  ;
  /**
   * Interface to get host-local shuffle block data. Throws an exception if the block cannot be
   * found or cannot be read successfully.
   * @param blockId (undocumented)
   * @param dirs (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.network.buffer.ManagedBuffer getHostLocalShuffleData (org.apache.spark.storage.BlockId blockId, java.lang.String[] dirs)  ;
  /**
   * Interface to get local block data. Throws an exception if the block cannot be found or
   * cannot be read successfully.
   * @param blockId (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.network.buffer.ManagedBuffer getLocalBlockData (org.apache.spark.storage.BlockId blockId)  ;
  /**
   * Get the local directories that used by BlockManager to save the blocks to disk
   * @return (undocumented)
   */
  public  java.lang.String[] getLocalDiskDirs ()  ;
  /**
   * Put the block locally, using the given storage level.
   * <p>
   * Returns true if the block was stored and false if the put operation failed or the block
   * already existed.
   * @param blockId (undocumented)
   * @param data (undocumented)
   * @param level (undocumented)
   * @param classTag (undocumented)
   * @return (undocumented)
   */
  public  boolean putBlockData (org.apache.spark.storage.BlockId blockId, org.apache.spark.network.buffer.ManagedBuffer data, org.apache.spark.storage.StorageLevel level, scala.reflect.ClassTag<?> classTag)  ;
  /**
   * Put the given block that will be received as a stream.
   * <p>
   * When this method is called, the block data itself is not available -- it will be passed to the
   * returned StreamCallbackWithID.
   * @param blockId (undocumented)
   * @param level (undocumented)
   * @param classTag (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.network.client.StreamCallbackWithID putBlockDataAsStream (org.apache.spark.storage.BlockId blockId, org.apache.spark.storage.StorageLevel level, scala.reflect.ClassTag<?> classTag)  ;
  /**
   * Release locks acquired by {@link putBlockData()} and {@link getLocalBlockData()}.
   * @param blockId (undocumented)
   * @param taskContext (undocumented)
   */
  public  void releaseLock (org.apache.spark.storage.BlockId blockId, scala.Option<org.apache.spark.TaskContext> taskContext)  ;
}
