package org.apache.spark.shuffle.sort;
/**
 * In sort-based shuffle, incoming records are sorted according to their target partition ids, then
 * written to a single map output file. Reducers fetch contiguous regions of this file in order to
 * read their portion of the map output. In cases where the map output data is too large to fit in
 * memory, sorted subsets of the output can be spilled to disk and those on-disk files are merged
 * to produce the final output file.
 * <p>
 * Sort-based shuffle has two different write paths for producing its map output files:
 * <p>
 *  - Serialized sorting: used when all three of the following conditions hold:
 *    1. The shuffle dependency specifies no map-side combine.
 *    2. The shuffle serializer supports relocation of serialized values (this is currently
 *       supported by KryoSerializer and Spark SQL's custom serializers).
 *    3. The shuffle produces fewer than or equal to 16777216 output partitions.
 *  - Deserialized sorting: used to handle all other cases.
 * <p>
 * -----------------------
 * Serialized sorting mode
 * -----------------------
 * <p>
 * In the serialized sorting mode, incoming records are serialized as soon as they are passed to the
 * shuffle writer and are buffered in a serialized form during sorting. This write path implements
 * several optimizations:
 * <p>
 *  - Its sort operates on serialized binary data rather than Java objects, which reduces memory
 *    consumption and GC overheads. This optimization requires the record serializer to have certain
 *    properties to allow serialized records to be re-ordered without requiring deserialization.
 *    See SPARK-4550, where this optimization was first proposed and implemented, for more details.
 * <p>
 *  - It uses a specialized cache-efficient sorter ({@link ShuffleExternalSorter}) that sorts
 *    arrays of compressed record pointers and partition ids. By using only 8 bytes of space per
 *    record in the sorting array, this fits more of the array into cache.
 * <p>
 *  - The spill merging procedure operates on blocks of serialized records that belong to the same
 *    partition and does not need to deserialize records during the merge.
 * <p>
 *  - When the spill compression codec supports concatenation of compressed data, the spill merge
 *    simply concatenates the serialized and compressed spill partitions to produce the final output
 *    partition.  This allows efficient data copying methods, like NIO's <code>transferTo</code>, to be used
 *    and avoids the need to allocate decompression or copying buffers during the merge.
 * <p>
 * For more details on these optimizations, see SPARK-7081.
 */
  class SortShuffleManager implements org.apache.spark.shuffle.ShuffleManager, org.apache.spark.internal.Logging {
  /**
   * The maximum number of shuffle output partitions that SortShuffleManager supports when
   * buffering map outputs in a serialized form. This is an extreme defensive programming measure,
   * since it's extremely unlikely that a single shuffle produces over 16 million output partitions.
   * @return (undocumented)
   */
  static public  int MAX_SHUFFLE_OUTPUT_PARTITIONS_FOR_SERIALIZED_MODE ()  { throw new RuntimeException(); }
  /**
   * The local property key for continuous shuffle block fetching feature.
   * @return (undocumented)
   */
  static public  java.lang.String FETCH_SHUFFLE_BLOCKS_IN_BATCH_ENABLED_KEY ()  { throw new RuntimeException(); }
  /**
   * Helper method for determining whether a shuffle reader should fetch the continuous blocks
   * in batch.
   * @param startPartition (undocumented)
   * @param endPartition (undocumented)
   * @param context (undocumented)
   * @return (undocumented)
   */
  static public  boolean canUseBatchFetch (int startPartition, int endPartition, org.apache.spark.TaskContext context)  { throw new RuntimeException(); }
  /**
   * Helper method for determining whether a shuffle should use an optimized serialized shuffle
   * path or whether it should fall back to the original path that operates on deserialized objects.
   * @param dependency (undocumented)
   * @return (undocumented)
   */
  static public  boolean canUseSerializedShuffle (org.apache.spark.ShuffleDependency<?, ?, ?> dependency)  { throw new RuntimeException(); }
  static public  org.slf4j.Logger org$apache$spark$internal$Logging$$log_ ()  { throw new RuntimeException(); }
  static public  void org$apache$spark$internal$Logging$$log__$eq (org.slf4j.Logger x$1)  { throw new RuntimeException(); }
  static protected  java.lang.String logName ()  { throw new RuntimeException(); }
  static protected  org.slf4j.Logger log ()  { throw new RuntimeException(); }
  static protected  void logInfo (scala.Function0<java.lang.String> msg)  { throw new RuntimeException(); }
  static protected  void logDebug (scala.Function0<java.lang.String> msg)  { throw new RuntimeException(); }
  static protected  void logTrace (scala.Function0<java.lang.String> msg)  { throw new RuntimeException(); }
  static protected  void logWarning (scala.Function0<java.lang.String> msg)  { throw new RuntimeException(); }
  static protected  void logError (scala.Function0<java.lang.String> msg)  { throw new RuntimeException(); }
  static protected  void logInfo (scala.Function0<java.lang.String> msg, java.lang.Throwable throwable)  { throw new RuntimeException(); }
  static protected  void logDebug (scala.Function0<java.lang.String> msg, java.lang.Throwable throwable)  { throw new RuntimeException(); }
  static protected  void logTrace (scala.Function0<java.lang.String> msg, java.lang.Throwable throwable)  { throw new RuntimeException(); }
  static protected  void logWarning (scala.Function0<java.lang.String> msg, java.lang.Throwable throwable)  { throw new RuntimeException(); }
  static protected  void logError (scala.Function0<java.lang.String> msg, java.lang.Throwable throwable)  { throw new RuntimeException(); }
  static protected  boolean isTraceEnabled ()  { throw new RuntimeException(); }
  static protected  void initializeLogIfNecessary (boolean isInterpreter)  { throw new RuntimeException(); }
  static protected  boolean initializeLogIfNecessary (boolean isInterpreter, boolean silent)  { throw new RuntimeException(); }
  static protected  boolean initializeLogIfNecessary$default$2 ()  { throw new RuntimeException(); }
  static   void initializeForcefully (boolean isInterpreter, boolean silent)  { throw new RuntimeException(); }
  public   SortShuffleManager (org.apache.spark.SparkConf conf)  { throw new RuntimeException(); }
  public  org.apache.spark.shuffle.IndexShuffleBlockResolver shuffleBlockResolver ()  { throw new RuntimeException(); }
  /**
   * Obtains a {@link ShuffleHandle} to pass to tasks.
   * @param shuffleId (undocumented)
   * @param dependency (undocumented)
   * @return (undocumented)
   */
  public <K extends java.lang.Object, V extends java.lang.Object, C extends java.lang.Object> org.apache.spark.shuffle.ShuffleHandle registerShuffle (int shuffleId, org.apache.spark.ShuffleDependency<K, V, C> dependency)  { throw new RuntimeException(); }
  /**
   * Get a reader for a range of reduce partitions (startPartition to endPartition-1, inclusive) to
   * read from a range of map outputs(startMapIndex to endMapIndex-1, inclusive).
   * If endMapIndex=Int.MaxValue, the actual endMapIndex will be changed to the length of total map
   * outputs of the shuffle in <code>getMapSizesByExecutorId</code>.
   * <p>
   * Called on executors by reduce tasks.
   * @param handle (undocumented)
   * @param startMapIndex (undocumented)
   * @param endMapIndex (undocumented)
   * @param startPartition (undocumented)
   * @param endPartition (undocumented)
   * @param context (undocumented)
   * @param metrics (undocumented)
   * @return (undocumented)
   */
  public <K extends java.lang.Object, C extends java.lang.Object> org.apache.spark.shuffle.ShuffleReader<K, C> getReader (org.apache.spark.shuffle.ShuffleHandle handle, int startMapIndex, int endMapIndex, int startPartition, int endPartition, org.apache.spark.TaskContext context, org.apache.spark.shuffle.ShuffleReadMetricsReporter metrics)  { throw new RuntimeException(); }
  /** Get a writer for a given partition. Called on executors by map tasks. */
  public <K extends java.lang.Object, V extends java.lang.Object> org.apache.spark.shuffle.ShuffleWriter<K, V> getWriter (org.apache.spark.shuffle.ShuffleHandle handle, long mapId, org.apache.spark.TaskContext context, org.apache.spark.shuffle.ShuffleWriteMetricsReporter metrics)  { throw new RuntimeException(); }
  /** Remove a shuffle's metadata from the ShuffleManager. */
  public  boolean unregisterShuffle (int shuffleId)  { throw new RuntimeException(); }
  /** Shut down this ShuffleManager. */
  public  void stop ()  { throw new RuntimeException(); }
}
