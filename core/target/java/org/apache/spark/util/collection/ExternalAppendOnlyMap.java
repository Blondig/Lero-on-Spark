package org.apache.spark.util.collection;
/**
 * :: DeveloperApi ::
 * An append-only map that spills sorted content to disk when there is insufficient space for it
 * to grow.
 * <p>
 * This map takes two passes over the data:
 * <p>
 *   (1) Values are merged into combiners, which are sorted and spilled to disk as necessary
 *   (2) Combiners are read from disk and merged together
 * <p>
 * The setting of the spill threshold faces the following trade-off: If the spill threshold is
 * too high, the in-memory map may occupy more memory than is available, resulting in OOM.
 * However, if the spill threshold is too low, we spill frequently and incur unnecessary disk
 * writes. This may lead to a performance regression compared to the normal case of using the
 * non-spilling AppendOnlyMap.
 */
public  class ExternalAppendOnlyMap<K extends java.lang.Object, V extends java.lang.Object, C extends java.lang.Object> extends org.apache.spark.util.collection.Spillable<org.apache.spark.util.collection.SizeTracker> implements java.io.Serializable, org.apache.spark.internal.Logging, scala.collection.Iterable<scala.Tuple2<K, C>> {
  // not preceding
  // TypeTree().setOriginal(TypeBoundsTree(TypeTree(), TypeTree()))
  // TypeTree().setOriginal(TypeBoundsTree(TypeTree(), TypeTree()))
  // TypeTree().setOriginal(TypeBoundsTree(TypeTree(), TypeTree()))
  public   ExternalAppendOnlyMap (scala.Function1<V, C> createCombiner, scala.Function2<C, V, C> mergeValue, scala.Function2<C, C, C> mergeCombiners, org.apache.spark.serializer.Serializer serializer, org.apache.spark.storage.BlockManager blockManager, org.apache.spark.TaskContext context, org.apache.spark.serializer.SerializerManager serializerManager)  { throw new RuntimeException(); }
  public   ExternalAppendOnlyMap (scala.Function1<V, C> createCombiner, scala.Function2<C, V, C> mergeValue, scala.Function2<C, C, C> mergeCombiners, org.apache.spark.serializer.Serializer serializer, org.apache.spark.storage.BlockManager blockManager)  { throw new RuntimeException(); }
  /**
   * Exposed for testing
   * @return (undocumented)
   */
    org.apache.spark.util.collection.SizeTrackingAppendOnlyMap<K, C> currentMap ()  { throw new RuntimeException(); }
  public  long diskBytesSpilled ()  { throw new RuntimeException(); }
  public  long peakMemoryUsedBytes ()  { throw new RuntimeException(); }
  /**
   * Number of files this map has spilled so far.
   * Exposed for testing.
   * @return (undocumented)
   */
    int numSpills ()  { throw new RuntimeException(); }
  /**
   * Insert the given key and value into the map.
   * @param key (undocumented)
   * @param value (undocumented)
   */
  public  void insert (K key, V value)  { throw new RuntimeException(); }
  /**
   * Insert the given iterator of keys and values into the map.
   * <p>
   * When the underlying map needs to grow, check if the global pool of shuffle memory has
   * enough room for this to happen. If so, allocate the memory required to grow the map;
   * otherwise, spill the in-memory map to disk.
   * <p>
   * The shuffle memory usage of the first trackMemoryThreshold entries is not tracked.
   * @param entries (undocumented)
   */
  public  void insertAll (scala.collection.Iterator<scala.Product2<K, V>> entries)  { throw new RuntimeException(); }
  /**
   * Insert the given iterable of keys and values into the map.
   * <p>
   * When the underlying map needs to grow, check if the global pool of shuffle memory has
   * enough room for this to happen. If so, allocate the memory required to grow the map;
   * otherwise, spill the in-memory map to disk.
   * <p>
   * The shuffle memory usage of the first trackMemoryThreshold entries is not tracked.
   * @param entries (undocumented)
   */
  public  void insertAll (scala.collection.Iterable<scala.Product2<K, V>> entries)  { throw new RuntimeException(); }
  /**
   * Sort the existing contents of the in-memory map and spill them to a temporary file on disk.
   * @param collection (undocumented)
   */
  protected  void spill (org.apache.spark.util.collection.SizeTracker collection)  { throw new RuntimeException(); }
  /**
   * Force to spilling the current in-memory collection to disk to release memory,
   * It will be called by TaskMemoryManager when there is not enough memory for the task.
   * @return (undocumented)
   */
  protected  boolean forceSpill ()  { throw new RuntimeException(); }
  /**
   * Returns a destructive iterator for iterating over the entries of this map.
   * If this iterator is forced spill to disk to release memory when there is not enough memory,
   * it returns pairs from an on-disk map.
   * @param inMemoryIterator (undocumented)
   * @return (undocumented)
   */
  public  scala.collection.Iterator<scala.Tuple2<K, C>> destructiveIterator (scala.collection.Iterator<scala.Tuple2<K, C>> inMemoryIterator)  { throw new RuntimeException(); }
  /**
   * Return a destructive iterator that merges the in-memory map with the spilled maps.
   * If no spill has occurred, simply return the in-memory map's iterator.
   * @return (undocumented)
   */
  public  scala.collection.Iterator<scala.Tuple2<K, C>> iterator ()  { throw new RuntimeException(); }
  public  java.lang.String toString ()  { throw new RuntimeException(); }
}
