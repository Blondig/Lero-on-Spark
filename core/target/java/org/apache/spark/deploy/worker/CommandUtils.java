package org.apache.spark.deploy.worker;
/**
 * Utilities for running commands with the spark classpath.
 */
public  class CommandUtils {
  /**
   * Build a ProcessBuilder based on the given parameters.
   * The <code>env</code> argument is exposed for testing.
   * @param command (undocumented)
   * @param securityMgr (undocumented)
   * @param memory (undocumented)
   * @param sparkHome (undocumented)
   * @param substituteArguments (undocumented)
   * @param classPaths (undocumented)
   * @param env (undocumented)
   * @return (undocumented)
   */
  static public  java.lang.ProcessBuilder buildProcessBuilder (org.apache.spark.deploy.Command command, org.apache.spark.SecurityManager securityMgr, int memory, java.lang.String sparkHome, scala.Function1<java.lang.String, java.lang.String> substituteArguments, scala.collection.Seq<java.lang.String> classPaths, scala.collection.Map<java.lang.String, java.lang.String> env)  { throw new RuntimeException(); }
  /** Spawn a thread that will redirect a given stream to a file */
  static public  void redirectStream (java.io.InputStream in, java.io.File file)  { throw new RuntimeException(); }
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
}
