package org.apache.spark.storage;
public  class DiskBlockData implements org.apache.spark.storage.BlockData {
  public   DiskBlockData (long minMemoryMapBytes, long maxMemoryMapBytes, java.io.File file, long blockSize)  { throw new RuntimeException(); }
  public  void dispose ()  { throw new RuntimeException(); }
  public  long size ()  { throw new RuntimeException(); }
  public  java.nio.ByteBuffer toByteBuffer ()  { throw new RuntimeException(); }
  public  org.apache.spark.util.io.ChunkedByteBuffer toChunkedByteBuffer (scala.Function1<java.lang.Object, java.nio.ByteBuffer> allocator)  { throw new RuntimeException(); }
  public  java.io.InputStream toInputStream ()  { throw new RuntimeException(); }
  /**
   * Returns a Netty-friendly wrapper for the block's data.
   * <p>
   * Please see <code>ManagedBuffer.convertToNetty()</code> for more details.
   * @return (undocumented)
   */
  public  java.lang.Object toNetty ()  { throw new RuntimeException(); }
}
