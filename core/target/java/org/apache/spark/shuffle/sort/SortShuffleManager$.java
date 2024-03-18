package org.apache.spark.shuffle.sort;
public  class SortShuffleManager$ implements org.apache.spark.internal.Logging {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final SortShuffleManager$ MODULE$ = null;
  public   SortShuffleManager$ ()  { throw new RuntimeException(); }
  /**
   * The maximum number of shuffle output partitions that SortShuffleManager supports when
   * buffering map outputs in a serialized form. This is an extreme defensive programming measure,
   * since it's extremely unlikely that a single shuffle produces over 16 million output partitions.
   * @return (undocumented)
   */
  public  int MAX_SHUFFLE_OUTPUT_PARTITIONS_FOR_SERIALIZED_MODE ()  { throw new RuntimeException(); }
  /**
   * The local property key for continuous shuffle block fetching feature.
   * @return (undocumented)
   */
  public  java.lang.String FETCH_SHUFFLE_BLOCKS_IN_BATCH_ENABLED_KEY ()  { throw new RuntimeException(); }
  /**
   * Helper method for determining whether a shuffle reader should fetch the continuous blocks
   * in batch.
   * @param startPartition (undocumented)
   * @param endPartition (undocumented)
   * @param context (undocumented)
   * @return (undocumented)
   */
  public  boolean canUseBatchFetch (int startPartition, int endPartition, org.apache.spark.TaskContext context)  { throw new RuntimeException(); }
  /**
   * Helper method for determining whether a shuffle should use an optimized serialized shuffle
   * path or whether it should fall back to the original path that operates on deserialized objects.
   * @param dependency (undocumented)
   * @return (undocumented)
   */
  public  boolean canUseSerializedShuffle (org.apache.spark.ShuffleDependency<?, ?, ?> dependency)  { throw new RuntimeException(); }
}
