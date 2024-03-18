package org.apache.spark.ui;
/**
 * Top level user interface for a Spark application.
 */
  class SparkUI extends org.apache.spark.ui.WebUI implements org.apache.spark.internal.Logging, org.apache.spark.status.api.v1.UIRoot {
  static public  java.lang.String STATIC_RESOURCE_DIR ()  { throw new RuntimeException(); }
  static public  java.lang.String DEFAULT_POOL_NAME ()  { throw new RuntimeException(); }
  static public  int getUIPort (org.apache.spark.SparkConf conf)  { throw new RuntimeException(); }
  /**
   * Create a new UI backed by an AppStatusStore.
   * @param sc (undocumented)
   * @param store (undocumented)
   * @param conf (undocumented)
   * @param securityManager (undocumented)
   * @param appName (undocumented)
   * @param basePath (undocumented)
   * @param startTime (undocumented)
   * @param appSparkVersion (undocumented)
   * @return (undocumented)
   */
  static public  org.apache.spark.ui.SparkUI create (scala.Option<org.apache.spark.SparkContext> sc, org.apache.spark.status.AppStatusStore store, org.apache.spark.SparkConf conf, org.apache.spark.SecurityManager securityManager, java.lang.String appName, java.lang.String basePath, long startTime, java.lang.String appSparkVersion)  { throw new RuntimeException(); }
  // not preceding
  public  org.apache.spark.status.AppStatusStore store ()  { throw new RuntimeException(); }
  public  scala.Option<org.apache.spark.SparkContext> sc ()  { throw new RuntimeException(); }
  public  org.apache.spark.SparkConf conf ()  { throw new RuntimeException(); }
  public  java.lang.String appName ()  { throw new RuntimeException(); }
  public  java.lang.String basePath ()  { throw new RuntimeException(); }
  public  long startTime ()  { throw new RuntimeException(); }
  public  java.lang.String appSparkVersion ()  { throw new RuntimeException(); }
  public  boolean killEnabled ()  { throw new RuntimeException(); }
  public  java.lang.String appId ()  { throw new RuntimeException(); }
  /**
   * Attach all existing handlers to ServerInfo.
   */
  public  void attachAllHandler ()  { throw new RuntimeException(); }
  /** Initialize all components of the server. */
  public  void initialize ()  { throw new RuntimeException(); }
  public  java.lang.String getSparkUser ()  { throw new RuntimeException(); }
  public  java.lang.String getAppName ()  { throw new RuntimeException(); }
  public  void setAppId (java.lang.String id)  { throw new RuntimeException(); }
  /**
   * To start SparUI, Spark starts Jetty Server first to bind address.
   * After the Spark application is fully started, call [attachAllHandlers]
   * to start all existing handlers.
   */
  public  void bind ()  { throw new RuntimeException(); }
  /** Stop the server behind this web interface. Only valid after bind(). */
  public  void stop ()  { throw new RuntimeException(); }
  public <T extends java.lang.Object> T withSparkUI (java.lang.String appId, scala.Option<java.lang.String> attemptId, scala.Function1<org.apache.spark.ui.SparkUI, T> fn)  { throw new RuntimeException(); }
  public  boolean checkUIViewPermissions (java.lang.String appId, scala.Option<java.lang.String> attemptId, java.lang.String user)  { throw new RuntimeException(); }
  public  scala.collection.Iterator<org.apache.spark.status.api.v1.ApplicationInfo> getApplicationInfoList ()  { throw new RuntimeException(); }
  public  scala.Option<org.apache.spark.status.api.v1.ApplicationInfo> getApplicationInfo (java.lang.String appId)  { throw new RuntimeException(); }
  public  scala.Option<org.apache.spark.scheduler.SparkListener> getStreamingJobProgressListener ()  { throw new RuntimeException(); }
  public  void setStreamingJobProgressListener (org.apache.spark.scheduler.SparkListener sparkListener)  { throw new RuntimeException(); }
  public  void clearStreamingJobProgressListener ()  { throw new RuntimeException(); }
}
