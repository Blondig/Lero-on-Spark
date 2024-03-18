package org.apache.spark.storage;
/**
 * Helper class for {@link ShuffleBlockFetcherIterator} that encapsulates all the push-based
 * functionality to fetch push-merged block meta and shuffle chunks.
 * A push-merged block contains multiple shuffle chunks where each shuffle chunk contains multiple
 * shuffle blocks that belong to the common reduce partition and were merged by the
 * external shuffle service to that chunk.
 */
public  class PushBasedFetchHelper implements org.apache.spark.internal.Logging {
  // not preceding
  public   PushBasedFetchHelper (org.apache.spark.storage.ShuffleBlockFetcherIterator iterator, org.apache.spark.network.shuffle.BlockStoreClient shuffleClient, org.apache.spark.storage.BlockManager blockManager, org.apache.spark.MapOutputTracker mapOutputTracker)  { throw new RuntimeException(); }
  /**
   * This is executed by the task thread when the <code>iterator.next()</code> is invoked and the iterator
   * processes a response of type {@link ShuffleBlockFetcherIterator.PushMergedLocalMetaFetchResult}.
   * <p>
   * @param blockId shuffle chunk id.
   * @param chunkMeta (undocumented)
   */
  public  void addChunk (org.apache.spark.storage.ShuffleBlockChunkId blockId, org.roaringbitmap.RoaringBitmap chunkMeta)  { throw new RuntimeException(); }
  /**
   * This is executed by the task thread when the <code>iterator.next()</code> is invoked and the iterator
   * processes a response of type {@link ShuffleBlockFetcherIterator.PushMergedRemoteMetaFetchResult}.
   * <p>
   * @param shuffleId shuffle id.
   * @param reduceId  reduce id.
   * @param blockSize size of the push-merged block.
   * @param bitmaps   chunk bitmaps, where each bitmap contains all the mapIds that were merged
   *                  to that chunk.
   * @return  shuffle chunks to fetch.
   * @param shuffleMergeId (undocumented)
   */
  public  scala.collection.mutable.ArrayBuffer<scala.Tuple3<org.apache.spark.storage.BlockId, java.lang.Object, java.lang.Object>> createChunkBlockInfosFromMetaResponse (int shuffleId, int shuffleMergeId, int reduceId, long blockSize, org.roaringbitmap.RoaringBitmap[] bitmaps)  { throw new RuntimeException(); }
  /**
   * This is executed by the task thread when the iterator is initialized. It fetches all the
   * outstanding push-merged local blocks.
   * @param pushMergedLocalBlocks set of identified merged local blocks and their sizes.
   */
  public  void fetchAllPushMergedLocalBlocks (scala.collection.mutable.LinkedHashSet<org.apache.spark.storage.BlockId> pushMergedLocalBlocks)  { throw new RuntimeException(); }
  /**
   * This is executed by the task thread when the <code>iterator.next()</code> is invoked and the iterator
   * processes a response of type:
   * 1) {@link ShuffleBlockFetcherIterator.SuccessFetchResult}
   * 2) {@link ShuffleBlockFetcherIterator.FallbackOnPushMergedFailureResult}
   * 3) {@link ShuffleBlockFetcherIterator.PushMergedRemoteMetaFailedFetchResult}
   * <p>
   * This initiates fetching fallback blocks for a push-merged block or a shuffle chunk that
   * failed to fetch.
   * It makes a call to the map output tracker to get the list of original blocks for the
   * given push-merged block/shuffle chunk, split them into remote and local blocks, and process
   * them accordingly.
   * It also updates the numberOfBlocksToFetch in the iterator as it processes failed response and
   * finds more push-merged requests to remote and again updates it with additional requests for
   * original blocks.
   * The fallback happens when:
   * 1. There is an exception while creating shuffle chunks from push-merged-local shuffle block.
   *    See fetchLocalBlock.
   * 2. There is a failure when fetching remote shuffle chunks.
   * 3. There is a failure when processing SuccessFetchResult which is for a shuffle chunk
   *    (local or remote).
   * @param blockId (undocumented)
   * @param address (undocumented)
   */
  public  void initiateFallbackFetchForPushMergedBlock (org.apache.spark.storage.BlockId blockId, org.apache.spark.storage.BlockManagerId address)  { throw new RuntimeException(); }
  /**
   * Returns true if the address is of a push-merged-local block. false otherwise.
   * @param address (undocumented)
   * @return (undocumented)
   */
  public  boolean isLocalPushMergedBlockAddress (org.apache.spark.storage.BlockManagerId address)  { throw new RuntimeException(); }
  /**
   * Returns true if the address is for a push-merged block.
   * @param address (undocumented)
   * @return (undocumented)
   */
  public  boolean isPushMergedShuffleBlockAddress (org.apache.spark.storage.BlockManagerId address)  { throw new RuntimeException(); }
  /**
   * Returns true if the address is of a remote push-merged block. false otherwise.
   * @param address (undocumented)
   * @return (undocumented)
   */
  public  boolean isRemotePushMergedBlockAddress (org.apache.spark.storage.BlockManagerId address)  { throw new RuntimeException(); }
    org.apache.spark.storage.BlockManagerId localShuffleMergerBlockMgrId ()  { throw new RuntimeException(); }
  /**
   * This is executed by the task thread when the <code>iterator.next()</code> is invoked and the iterator
   * processes a response of type {@link ShuffleBlockFetcherIterator.SuccessFetchResult}.
   * <p>
   * @param blockId shuffle chunk id.
   */
  public  void removeChunk (org.apache.spark.storage.ShuffleBlockChunkId blockId)  { throw new RuntimeException(); }
  /**
   * This is executed by the task thread when the iterator is initialized and only if it has
   * push-merged blocks for which it needs to fetch the metadata.
   * <p>
   * @param req {@link ShuffleBlockFetcherIterator.FetchRequest} that only contains requests to fetch
   *            metadata of push-merged blocks.
   */
  public  void sendFetchMergedStatusRequest (org.apache.spark.storage.ShuffleBlockFetcherIterator.FetchRequest req)  { throw new RuntimeException(); }
}
