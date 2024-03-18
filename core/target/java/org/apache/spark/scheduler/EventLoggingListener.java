package org.apache.spark.scheduler;
/**
 * A SparkListener that logs events to persistent storage.
 * <p>
 * Event logging is specified by the following configurable parameters:
 *   spark.eventLog.enabled - Whether event logging is enabled.
 *   spark.eventLog.dir - Path to the directory in which events are logged.
 *   spark.eventLog.logBlockUpdates.enabled - Whether to log block updates
 *   spark.eventLog.logStageExecutorMetrics - Whether to log stage executor metrics
 * <p>
 * Event log file writer maintains its own parameters: refer the doc of {@link EventLogFileWriter}
 * and its descendant for more details.
 */
  class EventLoggingListener extends org.apache.spark.scheduler.SparkListener implements org.apache.spark.internal.Logging {
  static public  java.lang.String DEFAULT_LOG_DIR ()  { throw new RuntimeException(); }
  static public  scala.Tuple2<java.lang.Object, java.lang.Object> DRIVER_STAGE_KEY ()  { throw new RuntimeException(); }
  static   org.apache.spark.scheduler.SparkListenerEnvironmentUpdate redactEvent (org.apache.spark.SparkConf sparkConf, org.apache.spark.scheduler.SparkListenerEnvironmentUpdate event)  { throw new RuntimeException(); }
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
  public   EventLoggingListener (java.lang.String appId, scala.Option<java.lang.String> appAttemptId, java.net.URI logBaseDir, org.apache.spark.SparkConf sparkConf, org.apache.hadoop.conf.Configuration hadoopConf)  { throw new RuntimeException(); }
  public   EventLoggingListener (java.lang.String appId, scala.Option<java.lang.String> appAttemptId, java.net.URI logBaseDir, org.apache.spark.SparkConf sparkConf)  { throw new RuntimeException(); }
    org.apache.spark.deploy.history.EventLogFileWriter logWriter ()  { throw new RuntimeException(); }
    scala.collection.mutable.ArrayBuffer<org.json4s.JsonAST.JValue> loggedEvents ()  { throw new RuntimeException(); }
  /**
   * Creates the log file in the configured log directory.
   */
  public  void start ()  { throw new RuntimeException(); }
  public  void onStageSubmitted (org.apache.spark.scheduler.SparkListenerStageSubmitted event)  { throw new RuntimeException(); }
  public  void onTaskStart (org.apache.spark.scheduler.SparkListenerTaskStart event)  { throw new RuntimeException(); }
  public  void onTaskGettingResult (org.apache.spark.scheduler.SparkListenerTaskGettingResult event)  { throw new RuntimeException(); }
  public  void onTaskEnd (org.apache.spark.scheduler.SparkListenerTaskEnd event)  { throw new RuntimeException(); }
  public  void onEnvironmentUpdate (org.apache.spark.scheduler.SparkListenerEnvironmentUpdate event)  { throw new RuntimeException(); }
  public  void onStageCompleted (org.apache.spark.scheduler.SparkListenerStageCompleted event)  { throw new RuntimeException(); }
  public  void onJobStart (org.apache.spark.scheduler.SparkListenerJobStart event)  { throw new RuntimeException(); }
  public  void onJobEnd (org.apache.spark.scheduler.SparkListenerJobEnd event)  { throw new RuntimeException(); }
  public  void onBlockManagerAdded (org.apache.spark.scheduler.SparkListenerBlockManagerAdded event)  { throw new RuntimeException(); }
  public  void onBlockManagerRemoved (org.apache.spark.scheduler.SparkListenerBlockManagerRemoved event)  { throw new RuntimeException(); }
  public  void onUnpersistRDD (org.apache.spark.scheduler.SparkListenerUnpersistRDD event)  { throw new RuntimeException(); }
  public  void onApplicationStart (org.apache.spark.scheduler.SparkListenerApplicationStart event)  { throw new RuntimeException(); }
  public  void onApplicationEnd (org.apache.spark.scheduler.SparkListenerApplicationEnd event)  { throw new RuntimeException(); }
  public  void onExecutorAdded (org.apache.spark.scheduler.SparkListenerExecutorAdded event)  { throw new RuntimeException(); }
  public  void onExecutorRemoved (org.apache.spark.scheduler.SparkListenerExecutorRemoved event)  { throw new RuntimeException(); }
  public  void onExecutorBlacklisted (org.apache.spark.scheduler.SparkListenerExecutorBlacklisted event)  { throw new RuntimeException(); }
  public  void onExecutorExcluded (org.apache.spark.scheduler.SparkListenerExecutorExcluded event)  { throw new RuntimeException(); }
  public  void onExecutorBlacklistedForStage (org.apache.spark.scheduler.SparkListenerExecutorBlacklistedForStage event)  { throw new RuntimeException(); }
  public  void onExecutorExcludedForStage (org.apache.spark.scheduler.SparkListenerExecutorExcludedForStage event)  { throw new RuntimeException(); }
  public  void onNodeBlacklistedForStage (org.apache.spark.scheduler.SparkListenerNodeBlacklistedForStage event)  { throw new RuntimeException(); }
  public  void onNodeExcludedForStage (org.apache.spark.scheduler.SparkListenerNodeExcludedForStage event)  { throw new RuntimeException(); }
  public  void onExecutorUnblacklisted (org.apache.spark.scheduler.SparkListenerExecutorUnblacklisted event)  { throw new RuntimeException(); }
  public  void onExecutorUnexcluded (org.apache.spark.scheduler.SparkListenerExecutorUnexcluded event)  { throw new RuntimeException(); }
  public  void onNodeBlacklisted (org.apache.spark.scheduler.SparkListenerNodeBlacklisted event)  { throw new RuntimeException(); }
  public  void onNodeExcluded (org.apache.spark.scheduler.SparkListenerNodeExcluded event)  { throw new RuntimeException(); }
  public  void onNodeUnblacklisted (org.apache.spark.scheduler.SparkListenerNodeUnblacklisted event)  { throw new RuntimeException(); }
  public  void onNodeUnexcluded (org.apache.spark.scheduler.SparkListenerNodeUnexcluded event)  { throw new RuntimeException(); }
  public  void onBlockUpdated (org.apache.spark.scheduler.SparkListenerBlockUpdated event)  { throw new RuntimeException(); }
  public  void onExecutorMetricsUpdate (org.apache.spark.scheduler.SparkListenerExecutorMetricsUpdate event)  { throw new RuntimeException(); }
  public  void onResourceProfileAdded (org.apache.spark.scheduler.SparkListenerResourceProfileAdded event)  { throw new RuntimeException(); }
  public  void onOtherEvent (org.apache.spark.scheduler.SparkListenerEvent event)  { throw new RuntimeException(); }
  /** Stop logging events. */
  public  void stop ()  { throw new RuntimeException(); }
}
