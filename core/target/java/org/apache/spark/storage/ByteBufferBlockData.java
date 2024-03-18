package org.apache.spark.storage;
  class ByteBufferBlockData implements org.apache.spark.storage.BlockData {
  // not preceding
  public   ByteBufferBlockData (org.apache.spark.util.io.ChunkedByteBuffer buffer, boolean shouldDispose)  { throw new RuntimeException(); }
  public  org.apache.spark.util.io.ChunkedByteBuffer buffer ()  { throw new RuntimeException(); }
  public  void dispose ()  { throw new RuntimeException(); }
  public  boolean shouldDispose ()  { throw new RuntimeException(); }
  public  long size ()  { throw new RuntimeException(); }
  public  java.nio.ByteBuffer toByteBuffer ()  { throw new RuntimeException(); }
  public  org.apache.spark.util.io.ChunkedByteBuffer toChunkedByteBuffer (scala.Function1<java.lang.Object, java.nio.ByteBuffer> allocator)  { throw new RuntimeException(); }
  public  java.io.InputStream toInputStream ()  { throw new RuntimeException(); }
  public  java.lang.Object toNetty ()  { throw new RuntimeException(); }
}
