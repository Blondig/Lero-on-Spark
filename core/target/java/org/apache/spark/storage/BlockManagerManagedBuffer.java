package org.apache.spark.storage;
/**
 * This {@link ManagedBuffer} wraps a {@link BlockData} instance retrieved from the {@link BlockManager}
 * so that the corresponding block's read lock can be released once this buffer's references
 * are released.
 * <p>
 * If <code>dispose</code> is set to true, the {@link BlockData}will be disposed when the buffer's reference
 * count drops to zero.
 * <p>
 * This is effectively a wrapper / bridge to connect the BlockManager's notion of read locks
 * to the network layer's notion of retain / release counts.
 */
  class BlockManagerManagedBuffer extends org.apache.spark.network.buffer.ManagedBuffer {
  public   BlockManagerManagedBuffer (org.apache.spark.storage.BlockInfoManager blockInfoManager, org.apache.spark.storage.BlockId blockId, org.apache.spark.storage.BlockData data, boolean dispose, boolean unlockOnDeallocate)  { throw new RuntimeException(); }
  public  long size ()  { throw new RuntimeException(); }
  public  java.nio.ByteBuffer nioByteBuffer ()  { throw new RuntimeException(); }
  public  java.io.InputStream createInputStream ()  { throw new RuntimeException(); }
  public  java.lang.Object convertToNetty ()  { throw new RuntimeException(); }
  public  org.apache.spark.network.buffer.ManagedBuffer retain ()  { throw new RuntimeException(); }
  public  org.apache.spark.network.buffer.ManagedBuffer release ()  { throw new RuntimeException(); }
}
