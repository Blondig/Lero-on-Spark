package org.apache.spark.deploy.history;
/**
 * The base class of writer which will write event logs into file.
 * <p>
 * The following configurable parameters are available to tune the behavior of writing:
 *   spark.eventLog.compress - Whether to compress logged events
 *   spark.eventLog.compression.codec - The codec to compress logged events
 *   spark.eventLog.overwrite - Whether to overwrite any existing files
 *   spark.eventLog.buffer.kb - Buffer size to use when writing to output streams
 * <p>
 * Note that descendant classes can maintain its own parameters: refer the javadoc of each class
 * for more details.
 * <p>
 * NOTE: CountingOutputStream being returned by "initLogFile" counts "non-compressed" bytes.
 */
public abstract class EventLogFileWriter implements org.apache.spark.internal.Logging {
  static public  java.lang.String IN_PROGRESS ()  { throw new RuntimeException(); }
  static public  java.lang.String COMPACTED ()  { throw new RuntimeException(); }
  static public  org.apache.hadoop.fs.permission.FsPermission LOG_FILE_PERMISSIONS ()  { throw new RuntimeException(); }
  static public  org.apache.hadoop.fs.permission.FsPermission LOG_FOLDER_PERMISSIONS ()  { throw new RuntimeException(); }
  static public  org.apache.spark.deploy.history.EventLogFileWriter apply (java.lang.String appId, scala.Option<java.lang.String> appAttemptId, java.net.URI logBaseDir, org.apache.spark.SparkConf sparkConf, org.apache.hadoop.conf.Configuration hadoopConf)  { throw new RuntimeException(); }
  static public  java.lang.String nameForAppAndAttempt (java.lang.String appId, scala.Option<java.lang.String> appAttemptId)  { throw new RuntimeException(); }
  static public  scala.Option<java.lang.String> codecName (org.apache.hadoop.fs.Path log)  { throw new RuntimeException(); }
  static public  boolean isCompacted (org.apache.hadoop.fs.Path log)  { throw new RuntimeException(); }
  public   EventLogFileWriter (java.lang.String appId, scala.Option<java.lang.String> appAttemptId, java.net.URI logBaseDir, org.apache.spark.SparkConf sparkConf, org.apache.hadoop.conf.Configuration hadoopConf)  { throw new RuntimeException(); }
  protected  boolean shouldCompress ()  { throw new RuntimeException(); }
  protected  boolean shouldOverwrite ()  { throw new RuntimeException(); }
  protected  int outputBufferSize ()  { throw new RuntimeException(); }
  protected  org.apache.hadoop.fs.FileSystem fileSystem ()  { throw new RuntimeException(); }
  protected  scala.Option<org.apache.spark.io.CompressionCodec> compressionCodec ()  { throw new RuntimeException(); }
    scala.Option<java.lang.String> compressionCodecName ()  { throw new RuntimeException(); }
  protected  scala.Option<org.apache.hadoop.fs.FSDataOutputStream> hadoopDataStream ()  { throw new RuntimeException(); }
  protected  scala.Option<java.io.PrintWriter> writer ()  { throw new RuntimeException(); }
  protected  void requireLogBaseDirAsDirectory ()  { throw new RuntimeException(); }
  protected  void initLogFile (org.apache.hadoop.fs.Path path, scala.Function1<java.io.OutputStream, java.io.PrintWriter> fnSetupWriter)  { throw new RuntimeException(); }
  protected  void writeLine (java.lang.String line, boolean flushLogger)  { throw new RuntimeException(); }
  protected  void closeWriter ()  { throw new RuntimeException(); }
  protected  void renameFile (org.apache.hadoop.fs.Path src, org.apache.hadoop.fs.Path dest, boolean overwrite)  { throw new RuntimeException(); }
  /** initialize writer for event logging */
  public abstract  void start ()  ;
  /** writes JSON format of event to file */
  public abstract  void writeEvent (java.lang.String eventJson, boolean flushLogger)  ;
  /** stops writer - indicating the application has been completed */
  public abstract  void stop ()  ;
  /** returns representative path of log. for tests only. */
  public abstract  java.lang.String logPath ()  ;
}
