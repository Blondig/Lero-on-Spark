package org.apache.spark.sql.execution.streaming.state;
/**
 * Class representing a RocksDB instance that checkpoints version of data to DFS.
 * After a set of updates, a new version can be committed by calling <code>commit()</code>.
 * Any past version can be loaded by calling <code>load(version)</code>.
 * <p>
 * @note This class is not thread-safe, so use it only from one thread.
 * @see {@link RocksDBFileManager} to see how the files are laid out in local disk and DFS.
 * param:  dfsRootDir  Remote directory where checkpoints are going to be written
 * param:  conf         Configuration for RocksDB
 * param:  localRootDir Root directory in local disk that is used to working and checkpointing dirs
 * param:  hadoopConf   Hadoop configuration for talking to the remote file system
 * param:  loggingId    Id that will be prepended in logs for isolating concurrent RocksDBs
 */
public  class RocksDB implements org.apache.spark.internal.Logging {
  public  org.apache.spark.sql.execution.streaming.state.RocksDBConf conf ()  { throw new RuntimeException(); }
  // not preceding
  public   RocksDB (java.lang.String dfsRootDir, org.apache.spark.sql.execution.streaming.state.RocksDBConf conf, java.io.File localRootDir, org.apache.hadoop.conf.Configuration hadoopConf, java.lang.String loggingId)  { throw new RuntimeException(); }
  /**
   * Load the given version of data in a native RocksDB instance.
   * Note that this will copy all the necessary file from DFS to local disk as needed,
   * and possibly restart the native RocksDB instance.
   * @param version (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.execution.streaming.state.RocksDB load (long version)  { throw new RuntimeException(); }
  /**
   * Get the value for the given key if present, or null.
   * @note This will return the last written value even if it was uncommitted.
   * @param key (undocumented)
   * @return (undocumented)
   */
  public  byte[] get (byte[] key)  { throw new RuntimeException(); }
  /**
   * Put the given value for the given key.
   * @note This update is not committed to disk until commit() is called.
   * @param key (undocumented)
   * @param value (undocumented)
   */
  public  void put (byte[] key, byte[] value)  { throw new RuntimeException(); }
  /**
   * Remove the key if present.
   * @note This update is not committed to disk until commit() is called.
   * @param key (undocumented)
   */
  public  void remove (byte[] key)  { throw new RuntimeException(); }
  /**
   * Get an iterator of all committed and uncommitted key-value pairs.
   * @return (undocumented)
   */
  public  scala.collection.Iterator<org.apache.spark.sql.execution.streaming.state.ByteArrayPair> iterator ()  { throw new RuntimeException(); }
  public  scala.collection.Iterator<org.apache.spark.sql.execution.streaming.state.ByteArrayPair> prefixScan (byte[] prefix)  { throw new RuntimeException(); }
  /**
   * Commit all the updates made as a version to DFS. The steps it needs to do to commits are:
   * - Write all the updates to the native RocksDB
   * - Flush all changes to disk
   * - Create a RocksDB checkpoint in a new local dir
   * - Sync the checkpoint dir files to DFS
   * @return (undocumented)
   */
  public  long commit ()  { throw new RuntimeException(); }
  /**
   * Drop uncommitted changes, and roll back to previous version.
   */
  public  void rollback ()  { throw new RuntimeException(); }
  public  void cleanup ()  { throw new RuntimeException(); }
  /** Release all resources */
  public  void close ()  { throw new RuntimeException(); }
  /** Get the latest version available in the DFS */
  public  long getLatestVersion ()  { throw new RuntimeException(); }
  /** Get current instantaneous statistics */
  public  org.apache.spark.sql.execution.streaming.state.RocksDBMetrics metrics ()  { throw new RuntimeException(); }
  /** Records the duration of running `body` for the next query progress update. */
  protected  long timeTakenMs (scala.Function0<scala.runtime.BoxedUnit> body)  { throw new RuntimeException(); }
  protected  java.lang.String logName ()  { throw new RuntimeException(); }
}
