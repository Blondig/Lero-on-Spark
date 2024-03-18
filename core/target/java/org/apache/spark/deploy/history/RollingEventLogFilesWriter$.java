package org.apache.spark.deploy.history;
public  class RollingEventLogFilesWriter$ {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final RollingEventLogFilesWriter$ MODULE$ = null;
  public   RollingEventLogFilesWriter$ ()  { throw new RuntimeException(); }
    java.lang.String EVENT_LOG_DIR_NAME_PREFIX ()  { throw new RuntimeException(); }
    java.lang.String EVENT_LOG_FILE_NAME_PREFIX ()  { throw new RuntimeException(); }
    java.lang.String APPSTATUS_FILE_NAME_PREFIX ()  { throw new RuntimeException(); }
  public  org.apache.hadoop.fs.Path getAppEventLogDirPath (java.net.URI logBaseDir, java.lang.String appId, scala.Option<java.lang.String> appAttemptId)  { throw new RuntimeException(); }
  public  org.apache.hadoop.fs.Path getAppStatusFilePath (org.apache.hadoop.fs.Path appLogDir, java.lang.String appId, scala.Option<java.lang.String> appAttemptId, boolean inProgress)  { throw new RuntimeException(); }
  public  org.apache.hadoop.fs.Path getEventLogFilePath (org.apache.hadoop.fs.Path appLogDir, java.lang.String appId, scala.Option<java.lang.String> appAttemptId, long index, scala.Option<java.lang.String> codecName)  { throw new RuntimeException(); }
  public  boolean isEventLogDir (org.apache.hadoop.fs.FileStatus status)  { throw new RuntimeException(); }
  public  boolean isEventLogFile (java.lang.String fileName)  { throw new RuntimeException(); }
  public  boolean isEventLogFile (org.apache.hadoop.fs.FileStatus status)  { throw new RuntimeException(); }
  public  boolean isAppStatusFile (org.apache.hadoop.fs.FileStatus status)  { throw new RuntimeException(); }
  public  long getEventLogFileIndex (java.lang.String eventLogFileName)  { throw new RuntimeException(); }
}
