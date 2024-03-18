package org.apache.spark.network;
/**
 * The BlockTransferService that used for fetching a set of blocks at time. Each instance of
 * BlockTransferService contains both client and server inside.
 */
 abstract class BlockTransferService extends org.apache.spark.network.shuffle.BlockStoreClient {
  public   BlockTransferService ()  { throw new RuntimeException(); }
  /**
   * A special case of {@link fetchBlocks}, as it fetches only one block and is blocking.
   * <p>
   * It is also only available after {@link init} is invoked.
   * @param host (undocumented)
   * @param port (undocumented)
   * @param execId (undocumented)
   * @param blockId (undocumented)
   * @param tempFileManager (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.network.buffer.ManagedBuffer fetchBlockSync (java.lang.String host, int port, java.lang.String execId, java.lang.String blockId, org.apache.spark.network.shuffle.DownloadFileManager tempFileManager)  { throw new RuntimeException(); }
  /**
   * Host name the service is listening on, available only after {@link init} is invoked.
   * @return (undocumented)
   */
  public abstract  java.lang.String hostName ()  ;
  /**
   * Initialize the transfer service by giving it the BlockDataManager that can be used to fetch
   * local blocks or put local blocks. The fetchBlocks method in {@link BlockStoreClient} also
   * available only after this is invoked.
   * @param blockDataManager (undocumented)
   */
  public abstract  void init (org.apache.spark.network.BlockDataManager blockDataManager)  ;
  /**
   * Port number the service is listening on, available only after {@link init} is invoked.
   * @return (undocumented)
   */
  public abstract  int port ()  ;
  /**
   * Upload a single block to a remote node, available only after {@link init} is invoked.
   * @param hostname (undocumented)
   * @param port (undocumented)
   * @param execId (undocumented)
   * @param blockId (undocumented)
   * @param blockData (undocumented)
   * @param level (undocumented)
   * @param classTag (undocumented)
   * @return (undocumented)
   */
  public abstract  scala.concurrent.Future<scala.runtime.BoxedUnit> uploadBlock (java.lang.String hostname, int port, java.lang.String execId, org.apache.spark.storage.BlockId blockId, org.apache.spark.network.buffer.ManagedBuffer blockData, org.apache.spark.storage.StorageLevel level, scala.reflect.ClassTag<?> classTag)  ;
  /**
   * Upload a single block to a remote node, available only after {@link init} is invoked.
   * <p>
   * This method is similar to {@link uploadBlock}, except this one blocks the thread
   * until the upload finishes.
   * @param hostname (undocumented)
   * @param port (undocumented)
   * @param execId (undocumented)
   * @param blockId (undocumented)
   * @param blockData (undocumented)
   * @param level (undocumented)
   * @param classTag (undocumented)
   */
  public  void uploadBlockSync (java.lang.String hostname, int port, java.lang.String execId, org.apache.spark.storage.BlockId blockId, org.apache.spark.network.buffer.ManagedBuffer blockData, org.apache.spark.storage.StorageLevel level, scala.reflect.ClassTag<?> classTag) throws java.io.IOException { throw new RuntimeException(); }
}
