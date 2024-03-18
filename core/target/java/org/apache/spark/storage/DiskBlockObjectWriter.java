package org.apache.spark.storage;
/**
 * A class for writing JVM objects directly to a file on disk. This class allows data to be appended
 * to an existing block. For efficiency, it retains the underlying file channel across
 * multiple commits. This channel is kept open until close() is called. In case of faults,
 * callers should instead close with revertPartialWritesAndClose() to atomically revert the
 * uncommitted partial writes.
 * <p>
 * This class does not support concurrent writes. Also, once the writer has been opened it cannot be
 * reopened again.
 */
  class DiskBlockObjectWriter extends java.io.OutputStream implements org.apache.spark.internal.Logging, org.apache.spark.util.collection.PairsWriter {
  /**
   * Guards against close calls, e.g. from a wrapping stream.
   * Call manualClose to close the stream that was extended by this trait.
   * Commit uses this trait to close object streams without paying the
   * cost of closing and opening the underlying file.
   */
  public  interface ManualCloseOutputStream {
    public  void close ()  ;
    public  void manualClose ()  ;
  }
  public  java.io.File file ()  { throw new RuntimeException(); }
  public  org.apache.spark.storage.BlockId blockId ()  { throw new RuntimeException(); }
  // not preceding
  public   DiskBlockObjectWriter (java.io.File file, org.apache.spark.serializer.SerializerManager serializerManager, org.apache.spark.serializer.SerializerInstance serializerInstance, int bufferSize, boolean syncWrites, org.apache.spark.shuffle.ShuffleWriteMetricsReporter writeMetrics, org.apache.spark.storage.BlockId blockId)  { throw new RuntimeException(); }
  /**
   * Set the checksum that the checksumOutputStream should use
   * @param checksum (undocumented)
   */
  public  void setChecksum (java.util.zip.Checksum checksum)  { throw new RuntimeException(); }
  public  org.apache.spark.storage.DiskBlockObjectWriter open ()  { throw new RuntimeException(); }
  /**
   * Commits any remaining partial writes and closes resources.
   */
  public  void close ()  { throw new RuntimeException(); }
  /**
   * Flush the partial writes and commit them as a single atomic block.
   * A commit may write additional bytes to frame the atomic block.
   * <p>
   * @return file segment with previous offset and length committed on this call.
   */
  public  org.apache.spark.storage.FileSegment commitAndGet ()  { throw new RuntimeException(); }
  /**
   * Reverts writes that haven't been committed yet. Callers should invoke this function
   * when there are runtime exceptions. This method will not throw, though it may be
   * unsuccessful in truncating written data.
   * <p>
   * @return the file that this DiskBlockObjectWriter wrote to.
   */
  public  java.io.File revertPartialWritesAndClose ()  { throw new RuntimeException(); }
  /**
   * Reverts write metrics and delete the file held by current <code>DiskBlockObjectWriter</code>.
   * Callers should invoke this function when there are runtime exceptions in file
   * writing process and the file is no longer needed.
   */
  public  void closeAndDelete ()  { throw new RuntimeException(); }
  /**
   * Writes a key-value pair.
   * @param key (undocumented)
   * @param value (undocumented)
   */
  public  void write (Object key, Object value)  { throw new RuntimeException(); }
  public  void write (int b)  { throw new RuntimeException(); }
  public  void write (byte[] kvBytes, int offs, int len)  { throw new RuntimeException(); }
  /**
   * Notify the writer that a record worth of bytes has been written with OutputStream#write.
   */
  public  void recordWritten ()  { throw new RuntimeException(); }
  public  void flush ()  { throw new RuntimeException(); }
}
