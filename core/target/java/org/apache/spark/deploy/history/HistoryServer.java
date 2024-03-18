package org.apache.spark.deploy.history;
/**
 * A web server that renders SparkUIs of completed applications.
 * <p>
 * For the standalone mode, MasterWebUI already achieves this functionality. Thus, the
 * main use case of the HistoryServer is in other deploy modes (e.g. Yarn or Mesos).
 * <p>
 * The logging directory structure is as follows: Within the given base directory, each
 * application's event logs are maintained in the application's own sub-directory. This
 * is the same structure as maintained in the event log write code path in
 * EventLoggingListener.
 */
public  class HistoryServer extends org.apache.spark.ui.WebUI implements org.apache.spark.internal.Logging, org.apache.spark.status.api.v1.UIRoot, org.apache.spark.deploy.history.ApplicationCacheOperations {
  static public  java.lang.String UI_PATH_PREFIX ()  { throw new RuntimeException(); }
  static public  void main (java.lang.String[] argStrings)  { throw new RuntimeException(); }
  /**
   * Create a security manager.
   * This turns off security in the SecurityManager, so that the History Server can start
   * in a Spark cluster where security is enabled.
   * @param config configuration for the SecurityManager constructor
   * @return the security manager for use in constructing the History Server.
   */
  static   org.apache.spark.SecurityManager createSecurityManager (org.apache.spark.SparkConf config)  { throw new RuntimeException(); }
  static public  void initSecurity ()  { throw new RuntimeException(); }
  static   java.lang.String getAttemptURI (java.lang.String appId, scala.Option<java.lang.String> attemptId)  { throw new RuntimeException(); }
  static public  org.slf4j.Logger org$apache$spark$internal$Logging$$log_ ()  { throw new RuntimeException(); }
  static public  void org$apache$spark$internal$Logging$$log__$eq (org.slf4j.Logger x$1)  { throw new RuntimeException(); }
  static protected  java.lang.String logName ()  { throw new RuntimeException(); }
  static protected  org.slf4j.Logger log ()  { throw new RuntimeException(); }
  static protected  void logInfo (scala.Function0<java.lang.String> msg)  { throw new RuntimeException(); }
  static protected  void logDebug (scala.Function0<java.lang.String> msg)  { throw new RuntimeException(); }
  static protected  void logTrace (scala.Function0<java.lang.String> msg)  { throw new RuntimeException(); }
  static protected  void logWarning (scala.Function0<java.lang.String> msg)  { throw new RuntimeException(); }
  static protected  void logError (scala.Function0<java.lang.String> msg)  { throw new RuntimeException(); }
  static protected  void logInfo (scala.Function0<java.lang.String> msg, java.lang.Throwable throwable)  { throw new RuntimeException(); }
  static protected  void logDebug (scala.Function0<java.lang.String> msg, java.lang.Throwable throwable)  { throw new RuntimeException(); }
  static protected  void logTrace (scala.Function0<java.lang.String> msg, java.lang.Throwable throwable)  { throw new RuntimeException(); }
  static protected  void logWarning (scala.Function0<java.lang.String> msg, java.lang.Throwable throwable)  { throw new RuntimeException(); }
  static protected  void logError (scala.Function0<java.lang.String> msg, java.lang.Throwable throwable)  { throw new RuntimeException(); }
  static protected  boolean isTraceEnabled ()  { throw new RuntimeException(); }
  static protected  void initializeLogIfNecessary (boolean isInterpreter)  { throw new RuntimeException(); }
  static protected  boolean initializeLogIfNecessary (boolean isInterpreter, boolean silent)  { throw new RuntimeException(); }
  static protected  boolean initializeLogIfNecessary$default$2 ()  { throw new RuntimeException(); }
  static   void initializeForcefully (boolean isInterpreter, boolean silent)  { throw new RuntimeException(); }
  public   HistoryServer (org.apache.spark.SparkConf conf, org.apache.spark.deploy.history.ApplicationHistoryProvider provider, org.apache.spark.SecurityManager securityManager, int port)  { throw new RuntimeException(); }
    int maxApplications ()  { throw new RuntimeException(); }
  public  org.apache.spark.deploy.history.CacheMetrics cacheMetrics ()  { throw new RuntimeException(); }
  public <T extends java.lang.Object> T withSparkUI (java.lang.String appId, scala.Option<java.lang.String> attemptId, scala.Function1<org.apache.spark.ui.SparkUI, T> fn)  { throw new RuntimeException(); }
  public  boolean checkUIViewPermissions (java.lang.String appId, scala.Option<java.lang.String> attemptId, java.lang.String user)  { throw new RuntimeException(); }
  /**
   * Initialize the history server.
   * <p>
   * This starts a background thread that periodically synchronizes information displayed on
   * this UI with the event logs in the provided base directory.
   */
  public  void initialize ()  { throw new RuntimeException(); }
  /** Bind to the HTTP server behind this web interface. */
  public  void bind ()  { throw new RuntimeException(); }
  /** Stop the server and close the file system. */
  public  void stop ()  { throw new RuntimeException(); }
  /** Attach a reconstructed UI to this server. Only valid after bind(). */
  public  void attachSparkUI (java.lang.String appId, scala.Option<java.lang.String> attemptId, org.apache.spark.ui.SparkUI ui, boolean completed)  { throw new RuntimeException(); }
  /** Detach a reconstructed UI from this server. Only valid after bind(). */
  public  void detachSparkUI (java.lang.String appId, scala.Option<java.lang.String> attemptId, org.apache.spark.ui.SparkUI ui)  { throw new RuntimeException(); }
  /**
   * Get the application UI and whether or not it is completed
   * @param appId application ID
   * @param attemptId attempt ID
   * @return If found, the Spark UI and any history information to be used in the cache
   */
  public  scala.Option<org.apache.spark.deploy.history.LoadedAppUI> getAppUI (java.lang.String appId, scala.Option<java.lang.String> attemptId)  { throw new RuntimeException(); }
  /**
   * Returns a list of available applications, in descending order according to their end time.
   * <p>
   * @return List of all known applications.
   */
  public  scala.collection.Iterator<org.apache.spark.status.api.v1.ApplicationInfo> getApplicationList ()  { throw new RuntimeException(); }
  public  int getEventLogsUnderProcess ()  { throw new RuntimeException(); }
  public  long getLastUpdatedTime ()  { throw new RuntimeException(); }
  public  scala.collection.Iterator<org.apache.spark.status.api.v1.ApplicationInfo> getApplicationInfoList ()  { throw new RuntimeException(); }
  public  scala.Option<org.apache.spark.status.api.v1.ApplicationInfo> getApplicationInfo (java.lang.String appId)  { throw new RuntimeException(); }
  public  void writeEventLogs (java.lang.String appId, scala.Option<java.lang.String> attemptId, java.util.zip.ZipOutputStream zipStream)  { throw new RuntimeException(); }
  /**
   * @return html text to display when the application list is empty
   */
  public  scala.collection.Seq<scala.xml.Node> emptyListingHtml ()  { throw new RuntimeException(); }
  /**
   * Returns the provider configuration to show in the listing page.
   * <p>
   * @return A map with the provider's configuration.
   */
  public  scala.collection.immutable.Map<java.lang.String, java.lang.String> getProviderConfig ()  { throw new RuntimeException(); }
  /**
   * String value for diagnostics.
   * @return a multi-line description of the server state.
   */
  public  java.lang.String toString ()  { throw new RuntimeException(); }
}
