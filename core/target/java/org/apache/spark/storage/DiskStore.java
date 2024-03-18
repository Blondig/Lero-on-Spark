package org.apache.spark.storage;
/**
 * Stores BlockManager blocks on disk.
 */
  class DiskStore implements org.apache.spark.internal.Logging {
  public   DiskStore (org.apache.spark.SparkConf conf, org.apache.spark.storage.DiskBlockManager diskManager, org.apache.spark.SecurityManager securityManager)  { throw new RuntimeException(); }
  public  boolean contains (org.apache.spark.storage.BlockId blockId)  { throw new RuntimeException(); }
  public  org.apache.spark.storage.BlockData getBytes (org.apache.spark.storage.BlockId blockId)  { throw new RuntimeException(); }
  public  org.apache.spark.storage.BlockData getBytes (java.io.File f, long blockSize)  { throw new RuntimeException(); }
  public  long getSize (org.apache.spark.storage.BlockId blockId)  { throw new RuntimeException(); }
  /**
   * @param blockSize if encryption is configured, the file is assumed to already be encrypted and
   *                  blockSize should be the decrypted size
   * @param sourceFile (undocumented)
   * @param targetBlockId (undocumented)
   */
  public  void moveFileToBlock (java.io.File sourceFile, long blockSize, org.apache.spark.storage.BlockId targetBlockId)  { throw new RuntimeException(); }
  /**
   * Invokes the provided callback function to write the specific block.
   * <p>
   * @throws IllegalStateException if the block already exists in the disk store.
   * @param blockId (undocumented)
   * @param writeFunc (undocumented)
   */
  public  void put (org.apache.spark.storage.BlockId blockId, scala.Function1<java.nio.channels.WritableByteChannel, scala.runtime.BoxedUnit> writeFunc)  { throw new RuntimeException(); }
  public  void putBytes (org.apache.spark.storage.BlockId blockId, org.apache.spark.util.io.ChunkedByteBuffer bytes)  { throw new RuntimeException(); }
  public  boolean remove (org.apache.spark.storage.BlockId blockId)  { throw new RuntimeException(); }
}
