package org.apache.spark.deploy.security;
/**
 * Manager for delegation tokens in a Spark application.
 * <p>
 * When delegation token renewal is enabled, this manager will make sure long-running apps can
 * run without interruption while accessing secured services. It periodically logs in to the KDC
 * with user-provided credentials, and contacts all the configured secure services to obtain
 * delegation tokens to be distributed to the rest of the application.
 * <p>
 * New delegation tokens are created once 75% of the renewal interval of the original tokens has
 * elapsed. The new tokens are sent to the Spark driver endpoint. The driver is tasked with
 * distributing the tokens to other processes that might need them.
 * <p>
 * Renewal can be enabled in two different ways: by providing a principal and keytab to Spark, or by
 * enabling renewal based on the local credential cache. The latter has the drawback that Spark
 * can't create new TGTs by itself, so the user has to manually update the Kerberos ticket cache
 * externally.
 * <p>
 * This class can also be used just to create delegation tokens, by calling the
 * <code>obtainDelegationTokens</code> method. This option does not require calling the <code>start</code> method nor
 * providing a driver reference, but leaves it up to the caller to distribute the tokens that were
 * generated.
 */
  class HadoopDelegationTokenManager implements org.apache.spark.internal.Logging {
  static public  boolean isServiceEnabled (org.apache.spark.SparkConf sparkConf, java.lang.String serviceName)  { throw new RuntimeException(); }
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
  protected  org.apache.spark.SparkConf sparkConf ()  { throw new RuntimeException(); }
  protected  org.apache.hadoop.conf.Configuration hadoopConf ()  { throw new RuntimeException(); }
  protected  org.apache.spark.rpc.RpcEndpointRef schedulerRef ()  { throw new RuntimeException(); }
  // not preceding
  public   HadoopDelegationTokenManager (org.apache.spark.SparkConf sparkConf, org.apache.hadoop.conf.Configuration hadoopConf, org.apache.spark.rpc.RpcEndpointRef schedulerRef)  { throw new RuntimeException(); }
  /** @return Whether delegation token renewal is enabled. */
  public  boolean renewalEnabled ()  { throw new RuntimeException(); }
  /**
   * Start the token renewer. Requires a principal and keytab. Upon start, the renewer will
   * obtain delegation tokens for all configured services and send them to the driver, and
   * set up tasks to periodically get fresh tokens as needed.
   * <p>
   * This method requires that a keytab has been provided to Spark, and will try to keep the
   * logged in user's TGT valid while this manager is active.
   * <p>
   * @return New set of delegation tokens created for the configured principal.
   */
  public  byte[] start ()  { throw new RuntimeException(); }
  public  void stop ()  { throw new RuntimeException(); }
  /**
   * Fetch new delegation tokens for configured services, storing them in the given credentials.
   * <p>
   * @param creds Credentials object where to store the delegation tokens.
   */
  public  void obtainDelegationTokens (org.apache.hadoop.security.Credentials creds)  { throw new RuntimeException(); }
  public  boolean isProviderLoaded (java.lang.String serviceName)  { throw new RuntimeException(); }
}
