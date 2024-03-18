package org.apache.spark.deploy;
/**
 * Provides a server from which Executors can read shuffle files (rather than reading directly from
 * each other), to provide uninterrupted access to the files in the face of executors being turned
 * off or killed.
 * <p>
 * Optionally requires SASL authentication in order to read. See {@link SecurityManager}.
 */
  class ExternalShuffleService implements org.apache.spark.internal.Logging {
  static public  void main (java.lang.String[] args)  { throw new RuntimeException(); }
  /** A helper main method that allows the caller to call this with a custom shuffle service. */
  static   void main (java.lang.String[] args, scala.Function2<org.apache.spark.SparkConf, org.apache.spark.SecurityManager, org.apache.spark.deploy.ExternalShuffleService> newShuffleService)  { throw new RuntimeException(); }
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
  public   ExternalShuffleService (org.apache.spark.SparkConf sparkConf, org.apache.spark.SecurityManager securityManager)  { throw new RuntimeException(); }
  protected  org.apache.spark.metrics.MetricsSystem masterMetricsSystem ()  { throw new RuntimeException(); }
  protected  java.io.File findRegisteredExecutorsDBFile (java.lang.String dbName)  { throw new RuntimeException(); }
  /** Get blockhandler  */
  public  org.apache.spark.network.shuffle.ExternalBlockHandler getBlockHandler ()  { throw new RuntimeException(); }
  /** Create a new shuffle block handler. Factored out for subclasses to override. */
  protected  org.apache.spark.network.shuffle.ExternalBlockHandler newShuffleBlockHandler (org.apache.spark.network.util.TransportConf conf)  { throw new RuntimeException(); }
  /** Starts the external shuffle service if the user has configured us to. */
  public  void startIfEnabled ()  { throw new RuntimeException(); }
  /** Start the external shuffle service */
  public  void start ()  { throw new RuntimeException(); }
  /** Clean up all shuffle files associated with an application that has exited. */
  public  void applicationRemoved (java.lang.String appId)  { throw new RuntimeException(); }
  /** Clean up all the non-shuffle files associated with an executor that has exited. */
  public  void executorRemoved (java.lang.String executorId, java.lang.String appId)  { throw new RuntimeException(); }
  public  void stop ()  { throw new RuntimeException(); }
}
