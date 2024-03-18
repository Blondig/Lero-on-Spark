package org.apache.spark.deploy;
public  class RPackageUtils {
  /** Documentation on how the R source file layout should be in the jar. */
  static  final  java.lang.String RJarDoc ()  { throw new RuntimeException(); }
  /**
   * Checks the manifest of the Jar whether there is any R source code bundled with it.
   * Exposed for testing.
   * @param jar (undocumented)
   * @return (undocumented)
   */
  static   boolean checkManifestForR (java.util.jar.JarFile jar)  { throw new RuntimeException(); }
  /**
   * Extracts the files under /R in the jar to a temporary directory for building.
   * @param jars (undocumented)
   * @param printStream (undocumented)
   * @param verbose (undocumented)
   */
  static   void checkAndBuildRPackage (java.lang.String jars, java.io.PrintStream printStream, boolean verbose)  { throw new RuntimeException(); }
  /** Zips all the R libraries built for distribution to the cluster. */
  static   java.io.File zipRLibraries (java.io.File dir, java.lang.String name)  { throw new RuntimeException(); }
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
