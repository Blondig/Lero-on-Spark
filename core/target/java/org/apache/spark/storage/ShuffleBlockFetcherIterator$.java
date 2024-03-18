package org.apache.spark.storage;
public  class ShuffleBlockFetcherIterator$ {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final ShuffleBlockFetcherIterator$ MODULE$ = null;
  public   ShuffleBlockFetcherIterator$ ()  { throw new RuntimeException(); }
  /**
   * A flag which indicates whether the Netty OOM error has raised during shuffle.
   * If true, unless there's no in-flight fetch requests, all the pending shuffle
   * fetch requests will be deferred until the flag is unset (whenever there's a
   * complete fetch request).
   * @return (undocumented)
   */
  public  java.util.concurrent.atomic.AtomicBoolean isNettyOOMOnShuffle ()  { throw new RuntimeException(); }
  public  void resetNettyOOMFlagIfPossible (long freeMemoryLowerBound)  { throw new RuntimeException(); }
  /**
   * This function is used to merged blocks when doBatchFetch is true. Blocks which have the
   * same <code>mapId</code> can be merged into one block batch. The block batch is specified by a range
   * of reduceId, which implies the continuous shuffle blocks that we can fetch in a batch.
   * For example, input blocks like (shuffle_0_0_0, shuffle_0_0_1, shuffle_0_1_0) can be
   * merged into (shuffle_0_0_0_2, shuffle_0_1_0_1), and input blocks like (shuffle_0_0_0_2,
   * shuffle_0_0_2, shuffle_0_0_3) can be merged into (shuffle_0_0_0_4).
   * <p>
   * @param blocks blocks to be merged if possible. May contains already merged blocks.
   * @param doBatchFetch whether to merge blocks.
   * @return the input blocks if doBatchFetch=false, or the merged blocks if doBatchFetch=true.
   */
  public  scala.collection.Seq<org.apache.spark.storage.ShuffleBlockFetcherIterator.FetchBlockInfo> mergeContinuousShuffleBlockIdsIfNeeded (scala.collection.Seq<org.apache.spark.storage.ShuffleBlockFetcherIterator.FetchBlockInfo> blocks, boolean doBatchFetch)  { throw new RuntimeException(); }
}
