package org.apache.spark.shuffle;
/**
 * Implementers of this trait understand how to retrieve block data for a logical shuffle block
 * identifier (i.e. map, reduce, and shuffle). Implementations may use files or file segments to
 * encapsulate shuffle data. This is used by the BlockStore to abstract over different shuffle
 * implementations when shuffle data is retrieved.
 */
public  interface ShuffleBlockResolver {
  /**
   * Retrieve the data for the specified block.
   * <p>
   * When the dirs parameter is None then use the disk manager's local directories. Otherwise,
   * read from the specified directories.
   * <p>
   * If the data for that block is not available, throws an unspecified exception.
   * @param blockId (undocumented)
   * @param dirs (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.network.buffer.ManagedBuffer getBlockData (org.apache.spark.storage.BlockId blockId, scala.Option<java.lang.String[]> dirs)  ;
  /**
   * Retrieve a list of BlockIds for a given shuffle map. Used to delete shuffle files
   * from the external shuffle service after the associated executor has been removed.
   * @param shuffleId (undocumented)
   * @param mapId (undocumented)
   * @return (undocumented)
   */
  public  scala.collection.Seq<org.apache.spark.storage.BlockId> getBlocksForShuffle (int shuffleId, long mapId)  ;
  /**
   * Retrieve the data for the specified merged shuffle block as multiple chunks.
   * @param blockId (undocumented)
   * @param dirs (undocumented)
   * @return (undocumented)
   */
  public  scala.collection.Seq<org.apache.spark.network.buffer.ManagedBuffer> getMergedBlockData (org.apache.spark.storage.ShuffleMergedBlockId blockId, scala.Option<java.lang.String[]> dirs)  ;
  /**
   * Retrieve the meta data for the specified merged shuffle block.
   * @param blockId (undocumented)
   * @param dirs (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.network.shuffle.MergedBlockMeta getMergedBlockMeta (org.apache.spark.storage.ShuffleMergedBlockId blockId, scala.Option<java.lang.String[]> dirs)  ;
  public  void stop ()  ;
}
