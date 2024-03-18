package org.apache.spark.storage;
/**
 * Abstracts away how blocks are stored and provides different ways to read the underlying block
 * data. Callers should call {@link dispose()} when they're done with the block.
 */
public  interface BlockData {
  public  void dispose ()  ;
  public  long size ()  ;
  public  java.nio.ByteBuffer toByteBuffer ()  ;
  public  org.apache.spark.util.io.ChunkedByteBuffer toChunkedByteBuffer (scala.Function1<java.lang.Object, java.nio.ByteBuffer> allocator)  ;
  public  java.io.InputStream toInputStream ()  ;
  /**
   * Returns a Netty-friendly wrapper for the block's data.
   * <p>
   * Please see <code>ManagedBuffer.convertToNetty()</code> for more details.
   * @return (undocumented)
   */
  public  java.lang.Object toNetty ()  ;
}
