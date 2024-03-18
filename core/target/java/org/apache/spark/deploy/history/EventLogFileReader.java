package org.apache.spark.deploy.history;
/** The base class of reader which will read the information of event log file(s). */
public abstract class EventLogFileReader {
  static public  org.apache.spark.deploy.history.EventLogFileReader apply (org.apache.hadoop.fs.FileSystem fs, org.apache.hadoop.fs.Path path, scala.Option<java.lang.Object> lastIndex)  { throw new RuntimeException(); }
  static public  scala.Option<org.apache.spark.deploy.history.EventLogFileReader> apply (org.apache.hadoop.fs.FileSystem fs, org.apache.hadoop.fs.Path path)  { throw new RuntimeException(); }
  static public  scala.Option<org.apache.spark.deploy.history.EventLogFileReader> apply (org.apache.hadoop.fs.FileSystem fs, org.apache.hadoop.fs.FileStatus status)  { throw new RuntimeException(); }
  /**
   * Opens an event log file and returns an input stream that contains the event data.
   * <p>
   * @return input stream that holds one JSON record per line.
   * @param log (undocumented)
   * @param fs (undocumented)
   */
  static public  java.io.InputStream openEventLog (org.apache.hadoop.fs.Path log, org.apache.hadoop.fs.FileSystem fs)  { throw new RuntimeException(); }
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
  protected  org.apache.hadoop.fs.FileSystem fileSystem ()  { throw new RuntimeException(); }
  public  org.apache.hadoop.fs.Path rootPath ()  { throw new RuntimeException(); }
  // not preceding
  public   EventLogFileReader (org.apache.hadoop.fs.FileSystem fileSystem, org.apache.hadoop.fs.Path rootPath)  { throw new RuntimeException(); }
  protected  scala.Option<java.lang.Object> fileSizeForDFS (org.apache.hadoop.fs.Path path)  { throw new RuntimeException(); }
  protected  void addFileAsZipEntry (java.util.zip.ZipOutputStream zipStream, org.apache.hadoop.fs.Path path, java.lang.String entryName)  { throw new RuntimeException(); }
  /** Returns the last index of event log files. None for single event log file. */
  public abstract  scala.Option<java.lang.Object> lastIndex ()  ;
  /**
   * Returns the size of file for the last index of event log files. Returns its size for
   * single event log file.
   * @return (undocumented)
   */
  public abstract  long fileSizeForLastIndex ()  ;
  /** Returns whether the application is completed. */
  public abstract  boolean completed ()  ;
  /**
   * Returns the size of file for the last index (itself for single event log file) of event log
   * files, only when underlying input stream is DFSInputStream. Otherwise returns None.
   * @return (undocumented)
   */
  public abstract  scala.Option<java.lang.Object> fileSizeForLastIndexForDFS ()  ;
  /**
   * Returns the modification time for the last index (itself for single event log file)
   * of event log files.
   * @return (undocumented)
   */
  public abstract  long modificationTime ()  ;
  /**
   * This method compresses the files passed in, and writes the compressed data out into the
   * ZipOutputStream passed in. Each file is written as a new ZipEntry with its name being
   * the name of the file being compressed.
   * @param zipStream (undocumented)
   */
  public abstract  void zipEventLogFiles (java.util.zip.ZipOutputStream zipStream)  ;
  /** Returns all available event log files. */
  public abstract  scala.collection.Seq<org.apache.hadoop.fs.FileStatus> listEventLogFiles ()  ;
  /** Returns the short compression name if being used. None if it's uncompressed. */
  public abstract  scala.Option<java.lang.String> compressionCodec ()  ;
  /** Returns the size of all event log files. */
  public abstract  long totalSize ()  ;
}
