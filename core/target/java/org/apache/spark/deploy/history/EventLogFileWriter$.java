package org.apache.spark.deploy.history;
public  class EventLogFileWriter$ {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final EventLogFileWriter$ MODULE$ = null;
  public   EventLogFileWriter$ ()  { throw new RuntimeException(); }
  public  java.lang.String IN_PROGRESS ()  { throw new RuntimeException(); }
  public  java.lang.String COMPACTED ()  { throw new RuntimeException(); }
  public  org.apache.hadoop.fs.permission.FsPermission LOG_FILE_PERMISSIONS ()  { throw new RuntimeException(); }
  public  org.apache.hadoop.fs.permission.FsPermission LOG_FOLDER_PERMISSIONS ()  { throw new RuntimeException(); }
  public  org.apache.spark.deploy.history.EventLogFileWriter apply (java.lang.String appId, scala.Option<java.lang.String> appAttemptId, java.net.URI logBaseDir, org.apache.spark.SparkConf sparkConf, org.apache.hadoop.conf.Configuration hadoopConf)  { throw new RuntimeException(); }
  public  java.lang.String nameForAppAndAttempt (java.lang.String appId, scala.Option<java.lang.String> appAttemptId)  { throw new RuntimeException(); }
  public  scala.Option<java.lang.String> codecName (org.apache.hadoop.fs.Path log)  { throw new RuntimeException(); }
  public  boolean isCompacted (org.apache.hadoop.fs.Path log)  { throw new RuntimeException(); }
}
