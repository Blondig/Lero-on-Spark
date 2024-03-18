package org.apache.spark.api.python;
/**
 * The inverse of pyspark's ChunkedStream for sending data of unknown size.
 * <p>
 * We might be serializing a really large object from python -- we don't want
 * python to buffer the whole thing in memory, nor can it write to a file,
 * so we don't know the length in advance.  So python writes it in chunks, each chunk
 * preceded by a length, till we get a "length" of -1 which serves as EOF.
 * <p>
 * Tested from python tests.
 */
  class DechunkedInputStream extends java.io.InputStream implements org.apache.spark.internal.Logging {
  /**
   * Dechunks the input, copies to output, and closes both input and the output safely.
   * @param chunked (undocumented)
   * @param out (undocumented)
   */
  static public  void dechunkAndCopyToOutput (java.io.InputStream chunked, java.io.OutputStream out)  { throw new RuntimeException(); }
  public   DechunkedInputStream (java.io.InputStream wrapped)  { throw new RuntimeException(); }
  public  int read ()  { throw new RuntimeException(); }
  public  int read (byte[] dest, int off, int len)  { throw new RuntimeException(); }
  public  void close ()  { throw new RuntimeException(); }
}
