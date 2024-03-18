package org.apache.spark.sql.execution.adaptive;
public  class ShufflePartitionsUtil {
  static public final  double SMALL_PARTITION_FACTOR ()  { throw new RuntimeException(); }
  static public final  double MERGED_PARTITION_FACTOR ()  { throw new RuntimeException(); }
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
  static public  scala.collection.Seq<scala.collection.Seq<org.apache.spark.sql.execution.ShufflePartitionSpec>> coalescePartitions (scala.collection.Seq<scala.Option<org.apache.spark.MapOutputStatistics>> mapOutputStatistics, scala.collection.Seq<scala.Option<scala.collection.Seq<org.apache.spark.sql.execution.ShufflePartitionSpec>>> inputPartitionSpecs, long advisoryTargetSize, int minNumPartitions, long minPartitionSize)  { throw new RuntimeException(); }
  /**
   * Given a list of size, return an array of indices to split the list into multiple partitions,
   * so that the size sum of each partition is close to the target size. Each index indicates the
   * start of a partition.
   * @param sizes (undocumented)
   * @param targetSize (undocumented)
   * @param smallPartitionFactor (undocumented)
   * @return (undocumented)
   */
  static   int[] splitSizeListByTargetSize (long[] sizes, long targetSize, double smallPartitionFactor)  { throw new RuntimeException(); }
  /**
   * Splits the skewed partition based on the map size and the target partition size
   * after split, and create a list of <code>PartialReducerPartitionSpec</code>. Returns None if can't split.
   * @param shuffleId (undocumented)
   * @param reducerId (undocumented)
   * @param targetSize (undocumented)
   * @param smallPartitionFactor (undocumented)
   * @return (undocumented)
   */
  static public  scala.Option<scala.collection.Seq<org.apache.spark.sql.execution.PartialReducerPartitionSpec>> createSkewPartitionSpecs (int shuffleId, int reducerId, long targetSize, double smallPartitionFactor)  { throw new RuntimeException(); }
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
}
