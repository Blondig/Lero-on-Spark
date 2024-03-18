package org.apache.spark.storage;
/** Helper methods for storage-related objects. */
public  class StorageUtils {
  /**
   * Attempt to clean up a ByteBuffer if it is direct or memory-mapped. This uses an *unsafe* Sun
   * API that will cause errors if one attempts to read from the disposed buffer. However, neither
   * the bytes allocated to direct buffers nor file descriptors opened for memory-mapped buffers put
   * pressure on the garbage collector. Waiting for garbage collection may lead to the depletion of
   * off-heap memory or huge numbers of open files. There's unfortunately no standard API to
   * manually dispose of these kinds of buffers.
   * @param buffer (undocumented)
   */
  static public  void dispose (java.nio.ByteBuffer buffer)  { throw new RuntimeException(); }
  /**
   * Get the port used by the external shuffle service. In Yarn mode, this may be already be
   * set through the Hadoop configuration as the server is launched in the Yarn NM.
   * @param conf (undocumented)
   * @return (undocumented)
   */
  static public  int externalShuffleServicePort (org.apache.spark.SparkConf conf)  { throw new RuntimeException(); }
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
