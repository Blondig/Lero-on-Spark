package org.apache.spark.deploy.history;
/**
 * A class used to keep track of disk usage by the SHS, allowing application data to be deleted
 * from disk when usage exceeds a configurable threshold.
 * <p>
 * The goal of the class is not to guarantee that usage will never exceed the threshold; because of
 * how application data is written, disk usage may temporarily go higher. But, eventually, it
 * should fall back under the threshold.
 * <p>
 * param:  conf Spark configuration.
 * param:  path Path where to store application data.
 * param:  listing The listing store, used to persist usage data.
 * param:  clock Clock instance to use.
 */
public  class HistoryServerDiskManager implements org.apache.spark.internal.Logging {
    class Lease {
    // not preceding
    public   Lease (java.io.File tmpPath, long leased)  { throw new RuntimeException(); }
    /**
     * Commits a lease to its final location, and update accounting information. This method
     * marks the application as active, so its store is not available for eviction.
     * @param appId (undocumented)
     * @param attemptId (undocumented)
     * @return (undocumented)
     */
    public  java.io.File commit (java.lang.String appId, scala.Option<java.lang.String> attemptId)  { throw new RuntimeException(); }
    /** Deletes the temporary directory created for the lease. */
    public  void rollback ()  { throw new RuntimeException(); }
    public  java.io.File tmpPath ()  { throw new RuntimeException(); }
  }
  public   HistoryServerDiskManager (org.apache.spark.SparkConf conf, java.io.File path, org.apache.spark.util.kvstore.KVStore listing, org.apache.spark.util.Clock clock)  { throw new RuntimeException(); }
    java.io.File appStorePath (java.lang.String appId, scala.Option<java.lang.String> attemptId)  { throw new RuntimeException(); }
  /**
   * A non-scientific approximation of how large an app state store will be given the size of the
   * event log.
   * @param eventLogSize (undocumented)
   * @param isCompressed (undocumented)
   * @return (undocumented)
   */
  public  long approximateSize (long eventLogSize, boolean isCompressed)  { throw new RuntimeException(); }
  /** Current committed space. */
  public  long committed ()  { throw new RuntimeException(); }
  /** Current free space. Considers space currently leased out too. */
  public  long free ()  { throw new RuntimeException(); }
  public  void initialize ()  { throw new RuntimeException(); }
  /**
   * Lease some space from the store. The leased space is calculated as a fraction of the given
   * event log size; this is an approximation, and doesn't mean the application store cannot
   * outgrow the lease.
   * <p>
   * If there's not enough space for the lease, other applications might be evicted to make room.
   * This method always returns a lease, meaning that it's possible for local disk usage to grow
   * past the configured threshold if there aren't enough idle applications to evict.
   * <p>
   * While the lease is active, the data is written to a temporary location, so <code>openStore()</code>
   * will still return <code>None</code> for the application.
   * @param eventLogSize (undocumented)
   * @param isCompressed (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.deploy.history.HistoryServerDiskManager.Lease lease (long eventLogSize, boolean isCompressed)  { throw new RuntimeException(); }
  /**
   * Returns the location of an application store if it's still available. Marks the store as
   * being used so that it's not evicted when running out of designated space.
   * @param appId (undocumented)
   * @param attemptId (undocumented)
   * @return (undocumented)
   */
  public  scala.Option<java.io.File> openStore (java.lang.String appId, scala.Option<java.lang.String> attemptId)  { throw new RuntimeException(); }
  /**
   * Tell the disk manager that the store for the given application is not being used anymore.
   * <p>
   * @param delete Whether to delete the store from disk.
   * @param appId (undocumented)
   * @param attemptId (undocumented)
   */
  public  void release (java.lang.String appId, scala.Option<java.lang.String> attemptId, boolean delete)  { throw new RuntimeException(); }
  /** Visible for testing. Return the size of a directory. */
    long sizeOf (java.io.File path)  { throw new RuntimeException(); }
}
