package org.apache.spark.deploy.yarn;
/**
 * Re-implement YARN's {@link RackResolver} for hadoop releases without YARN-9332.
 * This also allows Spark tests to easily override the default behavior, since YARN's class
 * self-initializes the first time it's called, and future calls all use the initial configuration.
 */
  class SparkRackResolver implements org.apache.spark.internal.Logging {
  /**
   * It will return the static resolver instance.  If there is already an instance, the passed
   * conf is entirely ignored.  If there is not a shared instance, it will create one with the
   * given conf.
   * @param conf (undocumented)
   * @return (undocumented)
   */
  static public  org.apache.spark.deploy.yarn.SparkRackResolver get (org.apache.hadoop.conf.Configuration conf)  { throw new RuntimeException(); }
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
  public   SparkRackResolver (org.apache.hadoop.conf.Configuration conf)  { throw new RuntimeException(); }
  public  org.apache.logging.log4j.Logger logger ()  { throw new RuntimeException(); }
  public  java.lang.String resolve (java.lang.String hostName)  { throw new RuntimeException(); }
  /**
   * Added in SPARK-13704.
   * This should be changed to <code>RackResolver.resolve(conf, hostNames)</code>
   * in hadoop releases with YARN-9332.
   * @param hostNames (undocumented)
   * @return (undocumented)
   */
  public  scala.collection.Seq<org.apache.hadoop.net.Node> resolve (scala.collection.Seq<java.lang.String> hostNames)  { throw new RuntimeException(); }
}
