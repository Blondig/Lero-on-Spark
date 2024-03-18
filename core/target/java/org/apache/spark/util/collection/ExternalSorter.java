package org.apache.spark.util.collection;
/**
 * Sorts and potentially merges a number of key-value pairs of type (K, V) to produce key-combiner
 * pairs of type (K, C). Uses a Partitioner to first group the keys into partitions, and then
 * optionally sorts keys within each partition using a custom Comparator. Can output a single
 * partitioned file with a different byte range for each partition, suitable for shuffle fetches.
 * <p>
 * If combining is disabled, the type C must equal V -- we'll cast the objects at the end.
 * <p>
 * Note: Although ExternalSorter is a fairly generic sorter, some of its configuration is tied
 * to its use in sort-based shuffle (for example, its block compression is controlled by
 * <code>spark.shuffle.compress</code>).  We may need to revisit this if ExternalSorter is used in other
 * non-shuffle contexts where we might want to use different configuration settings.
 * <p>
 * param:  aggregator optional Aggregator with combine functions to use for merging data
 * param:  partitioner optional Partitioner; if given, sort by partition ID and then key
 * param:  ordering optional Ordering to sort keys within each partition; should be a total ordering
 * param:  serializer serializer to use when spilling to disk
 * <p>
 * Note that if an Ordering is given, we'll always sort using it, so only provide it if you really
 * want the output keys to be sorted. In a map task without map-side combine for example, you
 * probably want to pass None as the ordering to avoid extra sorting. On the other hand, if you do
 * want to do combining, having an Ordering is more efficient than not having it.
 * <p>
 * Users interact with this class in the following way:
 * <p>
 * 1. Instantiate an ExternalSorter.
 * <p>
 * 2. Call insertAll() with a set of records.
 * <p>
 * 3. Request an iterator() back to traverse sorted/aggregated records.
 *     - or -
 *    Invoke writePartitionedFile() to create a file containing sorted/aggregated outputs
 *    that can be used in Spark's sort shuffle.
 * <p>
 * At a high level, this class works internally as follows:
 * <p>
 *  - We repeatedly fill up buffers of in-memory data, using either a PartitionedAppendOnlyMap if
 *    we want to combine by key, or a PartitionedPairBuffer if we don't.
 *    Inside these buffers, we sort elements by partition ID and then possibly also by key.
 *    To avoid calling the partitioner multiple times with each key, we store the partition ID
 *    alongside each record.
 * <p>
 *  - When each buffer reaches our memory limit, we spill it to a file. This file is sorted first
 *    by partition ID and possibly second by key or by hash code of the key, if we want to do
 *    aggregation. For each file, we track how many objects were in each partition in memory, so we
 *    don't have to write out the partition ID for every element.
 * <p>
 *  - When the user requests an iterator or file output, the spilled files are merged, along with
 *    any remaining in-memory data, using the same sort order defined above (unless both sorting
 *    and aggregation are disabled). If we need to aggregate by key, we either use a total ordering
 *    from the ordering parameter, or read the keys with the same hash code and compare them with
 *    each other for equality to merge values.
 * <p>
 *  - Users are expected to call stop() at the end to delete all the intermediate files.
 */
  class ExternalSorter<K extends java.lang.Object, V extends java.lang.Object, C extends java.lang.Object> extends org.apache.spark.util.collection.Spillable<org.apache.spark.util.collection.WritablePartitionedPairCollection<K, C>> implements org.apache.spark.internal.Logging, org.apache.spark.shuffle.checksum.ShuffleChecksumSupport {
  // not preceding
  // TypeTree().setOriginal(TypeBoundsTree(TypeTree(), TypeTree()))
  // TypeTree().setOriginal(TypeBoundsTree(TypeTree(), TypeTree()))
  // TypeTree().setOriginal(TypeBoundsTree(TypeTree(), TypeTree()))
  public   ExternalSorter (org.apache.spark.TaskContext context, scala.Option<org.apache.spark.Aggregator<K, V, C>> aggregator, scala.Option<org.apache.spark.Partitioner> partitioner, scala.Option<scala.math.Ordering<K>> ordering, org.apache.spark.serializer.Serializer serializer)  { throw new RuntimeException(); }
  public  long diskBytesSpilled ()  { throw new RuntimeException(); }
  public  long peakMemoryUsedBytes ()  { throw new RuntimeException(); }
  public  long[] getChecksums ()  { throw new RuntimeException(); }
  /**
   * Number of files this sorter has spilled so far.
   * Exposed for testing.
   * @return (undocumented)
   */
    int numSpills ()  { throw new RuntimeException(); }
  public  void insertAll (scala.collection.Iterator<scala.Product2<K, V>> records)  { throw new RuntimeException(); }
  /**
   * Spill our in-memory collection to a sorted file that we can merge later.
   * We add this file into <code>spilledFiles</code> to find it later.
   * <p>
   * @param collection whichever collection we're using (map or buffer)
   */
  protected  void spill (org.apache.spark.util.collection.WritablePartitionedPairCollection<K, C> collection)  { throw new RuntimeException(); }
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
   * @param memoryIterator (undocumented)
   * @return (undocumented)
   */
  public  scala.collection.Iterator<scala.Tuple2<scala.Tuple2<java.lang.Object, K>, C>> destructiveIterator (scala.collection.Iterator<scala.Tuple2<scala.Tuple2<java.lang.Object, K>, C>> memoryIterator)  { throw new RuntimeException(); }
  /**
   * Return an iterator over all the data written to this object, grouped by partition and
   * aggregated by the requested aggregator. For each partition we then have an iterator over its
   * contents, and these are expected to be accessed in order (you can't "skip ahead" to one
   * partition without reading the previous one). Guaranteed to return a key-value pair for each
   * partition, in order of partition ID.
   * <p>
   * For now, we just merge all the spilled files in once pass, but this can be modified to
   * support hierarchical merging.
   * Exposed for testing.
   * @return (undocumented)
   */
  public  scala.collection.Iterator<scala.Tuple2<java.lang.Object, scala.collection.Iterator<scala.Product2<K, C>>>> partitionedIterator ()  { throw new RuntimeException(); }
  /**
   * Return an iterator over all the data written to this object, aggregated by our aggregator.
   * @return (undocumented)
   */
  public  scala.collection.Iterator<scala.Product2<K, C>> iterator ()  { throw new RuntimeException(); }
  /**
   * Insert all records, updates related task metrics, and return a completion iterator
   * over all the data written to this object, aggregated by our aggregator.
   * On task completion (success, failure, or cancellation), it releases resources by
   * calling <code>stop()</code>.
   * @param records (undocumented)
   * @return (undocumented)
   */
  public  scala.collection.Iterator<scala.Product2<K, C>> insertAllAndUpdateMetrics (scala.collection.Iterator<scala.Product2<K, V>> records)  { throw new RuntimeException(); }
  /**
   * TODO(SPARK-28764): remove this, as this is only used by UnsafeRowSerializerSuite in the SQL
   * project. We should figure out an alternative way to test that so that we can remove this
   * otherwise unused code path.
   * @param blockId (undocumented)
   * @param outputFile (undocumented)
   * @return (undocumented)
   */
  public  long[] writePartitionedFile (org.apache.spark.storage.BlockId blockId, java.io.File outputFile)  { throw new RuntimeException(); }
  /**
   * Write all the data added into this ExternalSorter into a map output writer that pushes bytes
   * to some arbitrary backing store. This is called by the SortShuffleWriter.
   * <p>
   * @return array of lengths, in bytes, of each partition of the file (used by map output tracker)
   * @param shuffleId (undocumented)
   * @param mapId (undocumented)
   * @param mapOutputWriter (undocumented)
   */
  public  void writePartitionedMapOutput (int shuffleId, long mapId, org.apache.spark.shuffle.api.ShuffleMapOutputWriter mapOutputWriter)  { throw new RuntimeException(); }
  public  void stop ()  { throw new RuntimeException(); }
}
