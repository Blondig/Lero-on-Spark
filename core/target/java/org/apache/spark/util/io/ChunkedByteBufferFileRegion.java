package org.apache.spark.util.io;
/**
 * This exposes a ChunkedByteBuffer as a netty FileRegion, just to allow sending > 2gb in one netty
 * message.  This is because netty cannot send a ByteBuf > 2g, but it can send a large FileRegion,
 * even though the data is not backed by a file.
 */
  class ChunkedByteBufferFileRegion extends org.apache.spark.network.util.AbstractFileRegion {
  // not preceding
  public   ChunkedByteBufferFileRegion (org.apache.spark.util.io.ChunkedByteBuffer chunkedByteBuffer, int ioChunkSize)  { throw new RuntimeException(); }
  public  long count ()  { throw new RuntimeException(); }
  protected  void deallocate ()  { throw new RuntimeException(); }
  public  long position ()  { throw new RuntimeException(); }
  public  long transferTo (java.nio.channels.WritableByteChannel target, long position)  { throw new RuntimeException(); }
  public  long transferred ()  { throw new RuntimeException(); }
}
