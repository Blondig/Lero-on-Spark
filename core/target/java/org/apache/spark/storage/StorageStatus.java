package org.apache.spark.storage;
/**
 * Storage information for each BlockManager.
 * <p>
 * This class assumes BlockId and BlockStatus are immutable, such that the consumers of this
 * class cannot mutate the source of the information. Accesses are not thread-safe.
 */
  class StorageStatus {
  // not preceding
  public   StorageStatus (org.apache.spark.storage.BlockManagerId blockManagerId, long maxMemory, scala.Option<java.lang.Object> maxOnHeapMem, scala.Option<java.lang.Object> maxOffHeapMem)  { throw new RuntimeException(); }
  /** Create a storage status with an initial set of blocks, leaving the source unmodified. */
  public   StorageStatus (org.apache.spark.storage.BlockManagerId bmid, long maxMemory, scala.Option<java.lang.Object> maxOnHeapMem, scala.Option<java.lang.Object> maxOffHeapMem, scala.collection.Map<org.apache.spark.storage.BlockId, org.apache.spark.storage.BlockStatus> initialBlocks)  { throw new RuntimeException(); }
  /** Add the given block to this storage status. If it already exists, overwrite it. */
    void addBlock (org.apache.spark.storage.BlockId blockId, org.apache.spark.storage.BlockStatus blockStatus)  { throw new RuntimeException(); }
  public  org.apache.spark.storage.BlockManagerId blockManagerId ()  { throw new RuntimeException(); }
  /**
   * Return the blocks stored in this block manager.
   * <p>
   * @note This is somewhat expensive, as it involves cloning the underlying maps and then
   * concatenating them together. Much faster alternatives exist for common operations such as
   * contains, get, and size.
   * @return (undocumented)
   */
  public  scala.collection.Map<org.apache.spark.storage.BlockId, org.apache.spark.storage.BlockStatus> blocks ()  { throw new RuntimeException(); }
  /** Return the disk space used by this block manager. */
  public  long diskUsed ()  { throw new RuntimeException(); }
  /** Return the disk space used by the given RDD in this block manager in O(1) time. */
  public  long diskUsedByRdd (int rddId)  { throw new RuntimeException(); }
  /**
   * Return the given block stored in this block manager in O(1) time.
   * <p>
   * @note This is much faster than <code>this.blocks.get</code>, which is O(blocks) time.
   * @param blockId (undocumented)
   * @return (undocumented)
   */
  public  scala.Option<org.apache.spark.storage.BlockStatus> getBlock (org.apache.spark.storage.BlockId blockId)  { throw new RuntimeException(); }
  /** Return the max memory can be used by this block manager. */
  public  long maxMem ()  { throw new RuntimeException(); }
  public  long maxMemory ()  { throw new RuntimeException(); }
  public  scala.Option<java.lang.Object> maxOffHeapMem ()  { throw new RuntimeException(); }
  public  scala.Option<java.lang.Object> maxOnHeapMem ()  { throw new RuntimeException(); }
  /** Return the memory remaining in this block manager. */
  public  long memRemaining ()  { throw new RuntimeException(); }
  /** Return the memory used by this block manager. */
  public  long memUsed ()  { throw new RuntimeException(); }
  /** Return the memory used by off-heap caching RDDs */
  public  scala.Option<java.lang.Object> offHeapCacheSize ()  { throw new RuntimeException(); }
  /** Return the off-heap memory remaining in this block manager. */
  public  scala.Option<java.lang.Object> offHeapMemRemaining ()  { throw new RuntimeException(); }
  /** Return the off-heap memory used by this block manager. */
  public  scala.Option<java.lang.Object> offHeapMemUsed ()  { throw new RuntimeException(); }
  /** Return the memory used by on-heap caching RDDs */
  public  scala.Option<java.lang.Object> onHeapCacheSize ()  { throw new RuntimeException(); }
  /** Return the on-heap memory remaining in this block manager. */
  public  scala.Option<java.lang.Object> onHeapMemRemaining ()  { throw new RuntimeException(); }
  /** Return the on-heap memory used by this block manager. */
  public  scala.Option<java.lang.Object> onHeapMemUsed ()  { throw new RuntimeException(); }
  /**
   * Return the RDD blocks stored in this block manager.
   * <p>
   * @note This is somewhat expensive, as it involves cloning the underlying maps and then
   * concatenating them together. Much faster alternatives exist for common operations such as
   * getting the memory, disk, and off-heap memory sizes occupied by this RDD.
   * @return (undocumented)
   */
  public  scala.collection.Map<org.apache.spark.storage.BlockId, org.apache.spark.storage.BlockStatus> rddBlocks ()  { throw new RuntimeException(); }
}
