package org.apache.spark.deploy.yarn;
/**
 * Common application master functionality for Spark on Yarn.
 */
  class ApplicationMaster implements org.apache.spark.internal.Logging {
  static public  void main (java.lang.String[] args)  { throw new RuntimeException(); }
  static   void sparkContextInitialized (org.apache.spark.SparkContext sc)  { throw new RuntimeException(); }
  static   org.apache.hadoop.yarn.api.records.ApplicationAttemptId getAttemptId ()  { throw new RuntimeException(); }
  static   java.lang.String getHistoryServerAddress (org.apache.spark.SparkConf sparkConf, org.apache.hadoop.yarn.conf.YarnConfiguration yarnConf, java.lang.String appId, java.lang.String attemptId)  { throw new RuntimeException(); }
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
  public   ApplicationMaster (org.apache.spark.deploy.yarn.ApplicationMasterArguments args, org.apache.spark.SparkConf sparkConf, org.apache.hadoop.yarn.conf.YarnConfiguration yarnConf)  { throw new RuntimeException(); }
  public final  int run ()  { throw new RuntimeException(); }
  public  void runUnmanaged (org.apache.spark.rpc.RpcEnv clientRpcEnv, org.apache.hadoop.yarn.api.records.ApplicationAttemptId appAttemptId, org.apache.hadoop.fs.Path stagingDir, org.apache.spark.SparkConf cachedResourcesConf)  { throw new RuntimeException(); }
  public  void stopUnmanaged (org.apache.hadoop.fs.Path stagingDir)  { throw new RuntimeException(); }
  /**
   * Set the default final application status for client mode to UNDEFINED to handle
   * if YARN HA restarts the application so that it properly retries. Set the final
   * status to SUCCEEDED in cluster mode to handle if the user calls System.exit
   * from the application code.
   * @return (undocumented)
   */
  public final  org.apache.hadoop.yarn.api.records.FinalApplicationStatus getDefaultFinalStatus ()  { throw new RuntimeException(); }
  /**
   * unregister is used to completely unregister the application from the ResourceManager.
   * This means the ResourceManager will not retry the application attempt on your behalf if
   * a failure occurred.
   * @param status (undocumented)
   * @param diagnostics (undocumented)
   */
  public final  void unregister (org.apache.hadoop.yarn.api.records.FinalApplicationStatus status, java.lang.String diagnostics)  { throw new RuntimeException(); }
  public final  void finish (org.apache.hadoop.yarn.api.records.FinalApplicationStatus status, int code, java.lang.String msg)  { throw new RuntimeException(); }
}
