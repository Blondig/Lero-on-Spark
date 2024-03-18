package org.apache.spark.storage;
/**
 * Helper class that ensures a ManagedBuffer is released upon InputStream.close() and
 * also detects stream corruption if streamCompressedOrEncrypted is true
 */
public  class BufferReleasingInputStream extends java.io.InputStream {
  // not preceding
  public   BufferReleasingInputStream (java.io.InputStream delegate, org.apache.spark.storage.ShuffleBlockFetcherIterator iterator, org.apache.spark.storage.BlockId blockId, int mapIndex, org.apache.spark.storage.BlockManagerId address, boolean detectCorruption, boolean isNetworkReqDone, scala.Option<java.util.zip.CheckedInputStream> checkedInOpt)  { throw new RuntimeException(); }
  public  int available ()  { throw new RuntimeException(); }
  public  void close ()  { throw new RuntimeException(); }
    java.io.InputStream delegate ()  { throw new RuntimeException(); }
  public  void mark (int readlimit)  { throw new RuntimeException(); }
  public  boolean markSupported ()  { throw new RuntimeException(); }
  public  int read ()  { throw new RuntimeException(); }
  public  int read (byte[] b)  { throw new RuntimeException(); }
  public  int read (byte[] b, int off, int len)  { throw new RuntimeException(); }
  public  void reset ()  { throw new RuntimeException(); }
  public  long skip (long n)  { throw new RuntimeException(); }
}
