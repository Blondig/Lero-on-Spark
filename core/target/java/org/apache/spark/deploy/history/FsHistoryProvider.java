package org.apache.spark.deploy.history;
/**
 * A class that provides application history from event logs stored in the file system.
 * This provider checks for new finished applications in the background periodically and
 * renders the history application UI by parsing the associated event logs.
 * <p>
 * == How new and updated attempts are detected ==
 * <p>
 * - New attempts are detected in {@link checkForLogs}: the log dir is scanned, and any entries in the
 * log dir whose size changed since the last scan time are considered new or updated. These are
 * replayed to create a new attempt info entry and update or create a matching application info
 * element in the list of applications.
 * - Updated attempts are also found in {@link checkForLogs} -- if the attempt's log file has grown, the
 * attempt is replaced by another one with a larger log size.
 * <p>
 * The use of log size, rather than simply relying on modification times, is needed to
 * address the following issues
 * - some filesystems do not appear to update the <code>modtime</code> value whenever data is flushed to
 * an open file output stream. Changes to the history may not be picked up.
 * - the granularity of the <code>modtime</code> field may be 2+ seconds. Rapid changes to the FS can be
 * missed.
 * <p>
 * Tracking filesize works given the following invariant: the logs get bigger
 * as new events are added. If a format was used in which this did not hold, the mechanism would
 * break. Simple streaming of JSON-formatted events, as is implemented today, implicitly
 * maintains this invariant.
 */
  class FsHistoryProvider extends org.apache.spark.deploy.history.ApplicationHistoryProvider implements org.apache.spark.internal.Logging {
  /**
   * Current version of the data written to the listing database. When opening an existing
   * db, if the version does not match this value, the FsHistoryProvider will throw away
   * all data and re-generate the listing data from the event logs.
   * @return (undocumented)
   */
  static   long CURRENT_LISTING_VERSION ()  { throw new RuntimeException(); }
  public   FsHistoryProvider (org.apache.spark.SparkConf conf, org.apache.spark.util.Clock clock)  { throw new RuntimeException(); }
  public   FsHistoryProvider (org.apache.spark.SparkConf conf)  { throw new RuntimeException(); }
    org.apache.hadoop.fs.FileSystem fs ()  { throw new RuntimeException(); }
    org.apache.spark.util.kvstore.KVStore listing ()  { throw new RuntimeException(); }
    boolean isAccessible (org.apache.hadoop.fs.Path path)  { throw new RuntimeException(); }
  public  java.lang.Thread initThread ()  { throw new RuntimeException(); }
    java.lang.Thread initialize ()  { throw new RuntimeException(); }
    java.lang.Thread startSafeModeCheckThread (scala.Option<java.lang.Thread.UncaughtExceptionHandler> errorHandler)  { throw new RuntimeException(); }
  public  scala.collection.Iterator<org.apache.spark.status.api.v1.ApplicationInfo> getListing ()  { throw new RuntimeException(); }
  public  scala.Option<org.apache.spark.status.api.v1.ApplicationInfo> getApplicationInfo (java.lang.String appId)  { throw new RuntimeException(); }
  public  int getEventLogsUnderProcess ()  { throw new RuntimeException(); }
  public  long getLastUpdatedTime ()  { throw new RuntimeException(); }
  public  scala.Option<org.apache.spark.deploy.history.LoadedAppUI> getAppUI (java.lang.String appId, scala.Option<java.lang.String> attemptId)  { throw new RuntimeException(); }
  public  scala.collection.Seq<scala.xml.Node> getEmptyListingHtml ()  { throw new RuntimeException(); }
  public  scala.collection.immutable.Map<java.lang.String, java.lang.String> getConfig ()  { throw new RuntimeException(); }
  public  void start ()  { throw new RuntimeException(); }
  public  void stop ()  { throw new RuntimeException(); }
  public  void onUIDetached (java.lang.String appId, scala.Option<java.lang.String> attemptId, org.apache.spark.ui.SparkUI ui)  { throw new RuntimeException(); }
  public  boolean checkUIViewPermissions (java.lang.String appId, scala.Option<java.lang.String> attemptId, java.lang.String user)  { throw new RuntimeException(); }
  /**
   * Builds the application list based on the current contents of the log directory.
   * Tries to reuse as much of the data already in memory as possible, by not reading
   * applications that haven't been updated since last time the logs were checked.
   */
    void checkForLogs ()  { throw new RuntimeException(); }
    boolean shouldReloadLog (org.apache.spark.deploy.history.LogInfo info, org.apache.spark.deploy.history.EventLogFileReader reader)  { throw new RuntimeException(); }
  public  void writeEventLogs (java.lang.String appId, scala.Option<java.lang.String> attemptId, java.util.zip.ZipOutputStream zipStream)  { throw new RuntimeException(); }
  /**
   * Replay the given log file, saving the application in the listing db.
   * Visible for testing
   * @param reader (undocumented)
   * @param scanTime (undocumented)
   * @param enableOptimizations (undocumented)
   * @param lastEvaluatedForCompaction (undocumented)
   */
    void doMergeApplicationListing (org.apache.spark.deploy.history.EventLogFileReader reader, long scanTime, boolean enableOptimizations, scala.Option<java.lang.Object> lastEvaluatedForCompaction)  { throw new RuntimeException(); }
  /**
   * Check and delete specified event log according to the max log age defined by the user.
   * @param logPath (undocumented)
   */
    void checkAndCleanLog (java.lang.String logPath)  { throw new RuntimeException(); }
  /**
   * Delete event logs from the log directory according to the clean policy defined by the user.
   */
    void cleanLogs ()  { throw new RuntimeException(); }
  /**
   * Delete driver logs from the configured spark dfs dir that exceed the configured max age
   */
    void cleanDriverLogs ()  { throw new RuntimeException(); }
  /**
   * Rebuilds the application state store from its event log. Exposed for testing.
   * @param store (undocumented)
   * @param reader (undocumented)
   * @param lastUpdated (undocumented)
   */
    void rebuildAppStore (org.apache.spark.util.kvstore.KVStore store, org.apache.spark.deploy.history.EventLogFileReader reader, long lastUpdated)  { throw new RuntimeException(); }
  /**
   * Checks whether HDFS is in safe mode.
   * <p>
   * Note that DistributedFileSystem is a <code>@LimitedPrivate</code> class, which for all practical reasons
   * makes it more public than not.
   * @return (undocumented)
   */
    boolean isFsInSafeMode ()  { throw new RuntimeException(); }
    boolean isFsInSafeMode (org.apache.hadoop.hdfs.DistributedFileSystem dfs)  { throw new RuntimeException(); }
  /**
   * String description for diagnostics
   * @return a summary of the component state
   */
  public  java.lang.String toString ()  { throw new RuntimeException(); }
  /** For testing. Returns internal data about a single attempt. */
    org.apache.spark.deploy.history.AttemptInfoWrapper getAttempt (java.lang.String appId, scala.Option<java.lang.String> attemptId)  { throw new RuntimeException(); }
}
