package org.apache.spark.shuffle;
/**
 * Wrapper for a managed buffer that keeps track of how many times retain and release are called.
 * <p>
 * We need to define this class ourselves instead of using a spy because the NioManagedBuffer class
 * is final (final classes cannot be spied on).
 */
public  class RecordingManagedBuffer extends org.apache.spark.network.buffer.ManagedBuffer {
  public   RecordingManagedBuffer (org.apache.spark.network.buffer.NioManagedBuffer underlyingBuffer)  { throw new RuntimeException(); }
  public  int callsToRelease ()  { throw new RuntimeException(); }
  public  int callsToRetain ()  { throw new RuntimeException(); }
  public  java.lang.Object convertToNetty ()  { throw new RuntimeException(); }
  public  java.io.InputStream createInputStream ()  { throw new RuntimeException(); }
  public  java.nio.ByteBuffer nioByteBuffer ()  { throw new RuntimeException(); }
  public  org.apache.spark.network.buffer.ManagedBuffer release ()  { throw new RuntimeException(); }
  public  org.apache.spark.network.buffer.ManagedBuffer retain ()  { throw new RuntimeException(); }
  public  long size ()  { throw new RuntimeException(); }
}
