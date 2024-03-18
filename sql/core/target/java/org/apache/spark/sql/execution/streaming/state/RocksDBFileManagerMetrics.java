package org.apache.spark.sql.execution.streaming.state;
/**
 * Metrics regarding RocksDB file sync between local and DFS.
 */
public  class RocksDBFileManagerMetrics implements scala.Product, scala.Serializable {
  /**
   * Metrics to return when requested but no operation has been performed.
   * @return (undocumented)
   */
  static public  org.apache.spark.sql.execution.streaming.state.RocksDBFileManagerMetrics EMPTY_METRICS ()  { throw new RuntimeException(); }
  public  long filesCopied ()  { throw new RuntimeException(); }
  public  long bytesCopied ()  { throw new RuntimeException(); }
  public  long filesReused ()  { throw new RuntimeException(); }
  public  scala.Option<java.lang.Object> zipFileBytesUncompressed ()  { throw new RuntimeException(); }
  // not preceding
  public   RocksDBFileManagerMetrics (long filesCopied, long bytesCopied, long filesReused, scala.Option<java.lang.Object> zipFileBytesUncompressed)  { throw new RuntimeException(); }
}
