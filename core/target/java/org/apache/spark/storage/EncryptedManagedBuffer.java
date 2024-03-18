package org.apache.spark.storage;
  class EncryptedManagedBuffer extends org.apache.spark.network.buffer.ManagedBuffer {
  // not preceding
  public   EncryptedManagedBuffer (org.apache.spark.storage.EncryptedBlockData blockData)  { throw new RuntimeException(); }
  public  org.apache.spark.storage.EncryptedBlockData blockData ()  { throw new RuntimeException(); }
  public  java.lang.Object convertToNetty ()  { throw new RuntimeException(); }
  public  java.io.InputStream createInputStream ()  { throw new RuntimeException(); }
  public  java.nio.ByteBuffer nioByteBuffer ()  { throw new RuntimeException(); }
  public  org.apache.spark.network.buffer.ManagedBuffer release ()  { throw new RuntimeException(); }
  public  org.apache.spark.network.buffer.ManagedBuffer retain ()  { throw new RuntimeException(); }
  public  long size ()  { throw new RuntimeException(); }
}
