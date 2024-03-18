package org.apache.spark.storage.memory;
/**
 * Stores blocks in memory, either as Arrays of deserialized Java objects or as
 * serialized ByteBuffers.
 */
  class MemoryStore implements org.apache.spark.internal.Logging {
  public   MemoryStore (org.apache.spark.SparkConf conf, org.apache.spark.storage.BlockInfoManager blockInfoManager, org.apache.spark.serializer.SerializerManager serializerManager, org.apache.spark.memory.MemoryManager memoryManager, org.apache.spark.storage.memory.BlockEvictionHandler blockEvictionHandler)  { throw new RuntimeException(); }
  protected  void afterDropAction (org.apache.spark.storage.BlockId blockId)  { throw new RuntimeException(); }
  public  void clear ()  { throw new RuntimeException(); }
  public  boolean contains (org.apache.spark.storage.BlockId blockId)  { throw new RuntimeException(); }
  /**
   * Return the amount of memory currently occupied for unrolling blocks across all tasks.
   * @return (undocumented)
   */
  public  long currentUnrollMemory ()  { throw new RuntimeException(); }
  /**
   * Return the amount of memory currently occupied for unrolling blocks by this task.
   * @return (undocumented)
   */
  public  long currentUnrollMemoryForThisTask ()  { throw new RuntimeException(); }
  /**
   * Try to evict blocks to free up a given amount of space to store a particular block.
   * Can fail if either the block is bigger than our memory or it would require replacing
   * another block from the same RDD (which leads to a wasteful cyclic replacement pattern for
   * RDDs that don't fit into memory that we want to avoid).
   * <p>
   * @param blockId the ID of the block we are freeing space for, if any
   * @param space the size of this block
   * @param memoryMode the type of memory to free (on- or off-heap)
   * @return the amount of memory (in bytes) freed by eviction
   */
    long evictBlocksToFreeSpace (scala.Option<org.apache.spark.storage.BlockId> blockId, long space, org.apache.spark.memory.MemoryMode memoryMode)  { throw new RuntimeException(); }
  public <T extends org.apache.spark.storage.memory.MemoryEntry<?>> void freeMemoryEntry (T entry)  { throw new RuntimeException(); }
  public  scala.Option<org.apache.spark.util.io.ChunkedByteBuffer> getBytes (org.apache.spark.storage.BlockId blockId)  { throw new RuntimeException(); }
  public  long getSize (org.apache.spark.storage.BlockId blockId)  { throw new RuntimeException(); }
  public  scala.Option<scala.collection.Iterator<?>> getValues (org.apache.spark.storage.BlockId blockId)  { throw new RuntimeException(); }
  /**
   * Use <code>size</code> to test if there is enough space in MemoryStore. If so, create the ByteBuffer and
   * put it into MemoryStore. Otherwise, the ByteBuffer won't be created.
   * <p>
   * The caller should guarantee that <code>size</code> is correct.
   * <p>
   * @return true if the put() succeeded, false otherwise.
   * @param blockId (undocumented)
   * @param size (undocumented)
   * @param memoryMode (undocumented)
   * @param _bytes (undocumented)
   * @param evidence$2 (undocumented)
   */
  public <T extends java.lang.Object> boolean putBytes (org.apache.spark.storage.BlockId blockId, long size, org.apache.spark.memory.MemoryMode memoryMode, scala.Function0<org.apache.spark.util.io.ChunkedByteBuffer> _bytes, scala.reflect.ClassTag<T> evidence$2)  { throw new RuntimeException(); }
  /**
   * Attempt to put the given block in memory store as bytes.
   * <p>
   * @return in case of success, the estimated size of the stored data. In case of failure,
   *         return a handle which allows the caller to either finish the serialization by
   *         spilling to disk or to deserialize the partially-serialized block and reconstruct
   *         the original input iterator. The caller must either fully consume this result
   *         iterator or call <code>discard()</code> on it in order to free the storage memory consumed by the
   *         partially-unrolled block.
   * @param blockId (undocumented)
   * @param values (undocumented)
   * @param classTag (undocumented)
   * @param memoryMode (undocumented)
   */
   <T extends java.lang.Object> scala.util.Either<org.apache.spark.storage.memory.PartiallySerializedBlock<T>, java.lang.Object> putIteratorAsBytes (org.apache.spark.storage.BlockId blockId, scala.collection.Iterator<T> values, scala.reflect.ClassTag<T> classTag, org.apache.spark.memory.MemoryMode memoryMode)  { throw new RuntimeException(); }
  /**
   * Attempt to put the given block in memory store as values.
   * <p>
   * @return in case of success, the estimated size of the stored data. In case of failure, return
   *         an iterator containing the values of the block. The returned iterator will be backed
   *         by the combination of the partially-unrolled block and the remaining elements of the
   *         original input iterator. The caller must either fully consume this iterator or call
   *         <code>close()</code> on it in order to free the storage memory consumed by the partially-unrolled
   *         block.
   * @param blockId (undocumented)
   * @param values (undocumented)
   * @param memoryMode (undocumented)
   * @param classTag (undocumented)
   */
   <T extends java.lang.Object> scala.util.Either<org.apache.spark.storage.memory.PartiallyUnrolledIterator<T>, java.lang.Object> putIteratorAsValues (org.apache.spark.storage.BlockId blockId, scala.collection.Iterator<T> values, org.apache.spark.memory.MemoryMode memoryMode, scala.reflect.ClassTag<T> classTag)  { throw new RuntimeException(); }
  /**
   * Release memory used by this task for unrolling blocks.
   * If the amount is not specified, remove the current task's allocation altogether.
   * @param memoryMode (undocumented)
   * @param memory (undocumented)
   */
  public  void releaseUnrollMemoryForThisTask (org.apache.spark.memory.MemoryMode memoryMode, long memory)  { throw new RuntimeException(); }
  public  boolean remove (org.apache.spark.storage.BlockId blockId)  { throw new RuntimeException(); }
  /**
   * Reserve memory for unrolling the given block for this task.
   * <p>
   * @return whether the request is granted.
   * @param blockId (undocumented)
   * @param memory (undocumented)
   * @param memoryMode (undocumented)
   */
  public  boolean reserveUnrollMemoryForThisTask (org.apache.spark.storage.BlockId blockId, long memory, org.apache.spark.memory.MemoryMode memoryMode)  { throw new RuntimeException(); }
}
