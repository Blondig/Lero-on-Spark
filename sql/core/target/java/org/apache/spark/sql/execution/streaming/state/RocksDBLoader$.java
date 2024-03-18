package org.apache.spark.sql.execution.streaming.state;
/**
 * A wrapper for RocksDB library loading using an uninterruptible thread, as the native RocksDB
 * code will throw an error when interrupted.
 */
public  class RocksDBLoader$ implements org.apache.spark.internal.Logging {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final RocksDBLoader$ MODULE$ = null;
  public   RocksDBLoader$ ()  { throw new RuntimeException(); }
  public  void loadLibrary ()  { throw new RuntimeException(); }
}
