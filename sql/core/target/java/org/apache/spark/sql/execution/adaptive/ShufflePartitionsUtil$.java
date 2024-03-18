package org.apache.spark.sql.execution.adaptive;
public  class ShufflePartitionsUtil$ implements org.apache.spark.internal.Logging {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final ShufflePartitionsUtil$ MODULE$ = null;
  public   ShufflePartitionsUtil$ ()  { throw new RuntimeException(); }
  public final  double SMALL_PARTITION_FACTOR ()  { throw new RuntimeException(); }
  public final  double MERGED_PARTITION_FACTOR ()  { throw new RuntimeException(); }
  /**
   * Coalesce the partitions from multiple shuffles, either in their original states, or applied
   * with skew handling partition specs. If called on partitions containing skew partition specs,
   * this method will keep the skew partition specs intact and only coalesce the partitions outside
   * the skew sections.
   * <p>
   * This method will return an empty result if the shuffles have been coalesced already, or if
   * they do not have the same number of partitions, or if the coalesced result is the same as the
   * input partition layout.
   * <p>
   * @return A sequence of sequence of {@link ShufflePartitionSpec}s, which each inner sequence as the
   *         new partition specs for its corresponding shuffle after coalescing. If Nil is returned,
   *         then no coalescing is applied.
   * @param mapOutputStatistics (undocumented)
   * @param inputPartitionSpecs (undocumented)
   * @param advisoryTargetSize (undocumented)
   * @param minNumPartitions (undocumented)
   * @param minPartitionSize (undocumented)
   */
  public  scala.collection.Seq<scala.collection.Seq<org.apache.spark.sql.execution.ShufflePartitionSpec>> coalescePartitions (scala.collection.Seq<scala.Option<org.apache.spark.MapOutputStatistics>> mapOutputStatistics, scala.collection.Seq<scala.Option<scala.collection.Seq<org.apache.spark.sql.execution.ShufflePartitionSpec>>> inputPartitionSpecs, long advisoryTargetSize, int minNumPartitions, long minPartitionSize)  { throw new RuntimeException(); }
  /**
   * Given a list of size, return an array of indices to split the list into multiple partitions,
   * so that the size sum of each partition is close to the target size. Each index indicates the
   * start of a partition.
   * @param sizes (undocumented)
   * @param targetSize (undocumented)
   * @param smallPartitionFactor (undocumented)
   * @return (undocumented)
   */
    int[] splitSizeListByTargetSize (long[] sizes, long targetSize, double smallPartitionFactor)  { throw new RuntimeException(); }
  /**
   * Splits the skewed partition based on the map size and the target partition size
   * after split, and create a list of <code>PartialReducerPartitionSpec</code>. Returns None if can't split.
   * @param shuffleId (undocumented)
   * @param reducerId (undocumented)
   * @param targetSize (undocumented)
   * @param smallPartitionFactor (undocumented)
   * @return (undocumented)
   */
  public  scala.Option<scala.collection.Seq<org.apache.spark.sql.execution.PartialReducerPartitionSpec>> createSkewPartitionSpecs (int shuffleId, int reducerId, long targetSize, double smallPartitionFactor)  { throw new RuntimeException(); }
}
