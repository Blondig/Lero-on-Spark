package org.apache.spark;
/**
 * DebugFilesystem wraps
 *     1) file open calls to track all open connections. This can be used in tests to check that
 *        connections are not leaked;
 *     2) rename calls to return false when destination's parent path does not exist. When
 *        destination parent does not exist, LocalFileSystem uses FileUtil#copy to copy the
 *        file and returns true if succeed, while many other hadoop file systems (e.g. HDFS, S3A)
 *        return false without renaming any file. This helps to test that Spark can work with the
 *        latter file systems.
 */
public  class DebugFilesystem extends org.apache.hadoop.fs.LocalFileSystem {
  static public  void addOpenStream (org.apache.hadoop.fs.FSDataInputStream stream)  { throw new RuntimeException(); }
  static public  void clearOpenStreams ()  { throw new RuntimeException(); }
  static public  void removeOpenStream (org.apache.hadoop.fs.FSDataInputStream stream)  { throw new RuntimeException(); }
  static public  void assertNoOpenStreams ()  { throw new RuntimeException(); }
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
  public   DebugFilesystem ()  { throw new RuntimeException(); }
  public  org.apache.hadoop.fs.FSDataInputStream open (org.apache.hadoop.fs.Path f, int bufferSize)  { throw new RuntimeException(); }
  public  boolean rename (org.apache.hadoop.fs.Path src, org.apache.hadoop.fs.Path dst)  { throw new RuntimeException(); }
}
