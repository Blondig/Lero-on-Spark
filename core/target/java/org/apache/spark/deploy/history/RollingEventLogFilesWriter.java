package org.apache.spark.deploy.history;
/**
 * The writer to write event logs into multiple log files, rolled over via configured size.
 * <p>
 * The class creates one directory per application, and stores event log files as well as
 * metadata files. The name of directory and files in the directory would follow:
 * <p>
 * - The name of directory: eventlog_v2_appId(_[appAttemptId])
 * - The prefix of name on event files: events_[index]_[appId](_[appAttemptId])(.[codec])
 *   - "index" would be monotonically increasing value (say, sequence)
 * - The name of metadata (app. status) file name: appstatus_[appId](_[appAttemptId])(.inprogress)
 * <p>
 * The writer will roll over the event log file when configured size is reached. Note that the
 * writer doesn't check the size on file being open for write: the writer tracks the count of bytes
 * written before compression is applied.
 * <p>
 * For metadata files, the class will leverage zero-byte file, as it provides minimized cost.
 */
public  class RollingEventLogFilesWriter extends org.apache.spark.deploy.history.EventLogFileWriter {
  static   java.lang.String EVENT_LOG_DIR_NAME_PREFIX ()  { throw new RuntimeException(); }
  static   java.lang.String EVENT_LOG_FILE_NAME_PREFIX ()  { throw new RuntimeException(); }
  static   java.lang.String APPSTATUS_FILE_NAME_PREFIX ()  { throw new RuntimeException(); }
  static public  org.apache.hadoop.fs.Path getAppEventLogDirPath (java.net.URI logBaseDir, java.lang.String appId, scala.Option<java.lang.String> appAttemptId)  { throw new RuntimeException(); }
  static public  org.apache.hadoop.fs.Path getAppStatusFilePath (org.apache.hadoop.fs.Path appLogDir, java.lang.String appId, scala.Option<java.lang.String> appAttemptId, boolean inProgress)  { throw new RuntimeException(); }
  static public  org.apache.hadoop.fs.Path getEventLogFilePath (org.apache.hadoop.fs.Path appLogDir, java.lang.String appId, scala.Option<java.lang.String> appAttemptId, long index, scala.Option<java.lang.String> codecName)  { throw new RuntimeException(); }
  static public  boolean isEventLogDir (org.apache.hadoop.fs.FileStatus status)  { throw new RuntimeException(); }
  static public  boolean isEventLogFile (java.lang.String fileName)  { throw new RuntimeException(); }
  static public  boolean isEventLogFile (org.apache.hadoop.fs.FileStatus status)  { throw new RuntimeException(); }
  static public  boolean isAppStatusFile (org.apache.hadoop.fs.FileStatus status)  { throw new RuntimeException(); }
  static public  long getEventLogFileIndex (java.lang.String eventLogFileName)  { throw new RuntimeException(); }
  public   RollingEventLogFilesWriter (java.lang.String appId, scala.Option<java.lang.String> appAttemptId, java.net.URI logBaseDir, org.apache.spark.SparkConf sparkConf, org.apache.hadoop.conf.Configuration hadoopConf)  { throw new RuntimeException(); }
  public  void start ()  { throw new RuntimeException(); }
  public  void writeEvent (java.lang.String eventJson, boolean flushLogger)  { throw new RuntimeException(); }
  /** exposed for testing only */
    void rollEventLogFile ()  { throw new RuntimeException(); }
  public  void stop ()  { throw new RuntimeException(); }
  public  java.lang.String logPath ()  { throw new RuntimeException(); }
}
