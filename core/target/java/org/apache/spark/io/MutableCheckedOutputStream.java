package org.apache.spark.io;
/**
 * A variant of {@link java.util.zip.CheckedOutputStream} which can
 * change the checksum calculator at runtime.
 */
  class MutableCheckedOutputStream extends java.io.OutputStream {
  public   MutableCheckedOutputStream (java.io.OutputStream out)  { throw new RuntimeException(); }
  public  void close ()  { throw new RuntimeException(); }
  public  void flush ()  { throw new RuntimeException(); }
  public  void setChecksum (java.util.zip.Checksum c)  { throw new RuntimeException(); }
  public  void write (int b)  { throw new RuntimeException(); }
  public  void write (byte[] b, int off, int len)  { throw new RuntimeException(); }
}
