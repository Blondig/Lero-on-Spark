package org.apache.spark.shuffle;
/**
 * :: Experimental ::
 * An experimental trait to allow Spark to migrate shuffle blocks.
 */
public  interface MigratableResolver {
  /**
   * Get the blocks for migration for a particular shuffle and map.
   * @param shuffleBlockInfo (undocumented)
   * @return (undocumented)
   */
  public  scala.collection.immutable.List<scala.Tuple2<org.apache.spark.storage.BlockId, org.apache.spark.network.buffer.ManagedBuffer>> getMigrationBlocks (org.apache.spark.shuffle.ShuffleBlockInfo shuffleBlockInfo)  ;
  /**
   * Get the shuffle ids that are stored locally. Used for block migrations.
   * @return (undocumented)
   */
  public  scala.collection.Seq<org.apache.spark.shuffle.ShuffleBlockInfo> getStoredShuffles ()  ;
  /**
   * Write a provided shuffle block as a stream. Used for block migrations.
   * Up to the implementation to support STORAGE_REMOTE_SHUFFLE_MAX_DISK
   * @param blockId (undocumented)
   * @param serializerManager (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.network.client.StreamCallbackWithID putShuffleBlockAsStream (org.apache.spark.storage.BlockId blockId, org.apache.spark.serializer.SerializerManager serializerManager)  ;
}
