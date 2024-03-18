package org.apache.spark.deploy.history;
public  class EventLogFileReader$ implements org.apache.spark.internal.Logging {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final EventLogFileReader$ MODULE$ = null;
  public   EventLogFileReader$ ()  { throw new RuntimeException(); }
  public  org.apache.spark.deploy.history.EventLogFileReader apply (org.apache.hadoop.fs.FileSystem fs, org.apache.hadoop.fs.Path path, scala.Option<java.lang.Object> lastIndex)  { throw new RuntimeException(); }
  public  scala.Option<org.apache.spark.deploy.history.EventLogFileReader> apply (org.apache.hadoop.fs.FileSystem fs, org.apache.hadoop.fs.Path path)  { throw new RuntimeException(); }
  public  scala.Option<org.apache.spark.deploy.history.EventLogFileReader> apply (org.apache.hadoop.fs.FileSystem fs, org.apache.hadoop.fs.FileStatus status)  { throw new RuntimeException(); }
  /**
   * Opens an event log file and returns an input stream that contains the event data.
   * <p>
   * @return input stream that holds one JSON record per line.
   * @param log (undocumented)
   * @param fs (undocumented)
   */
  public  java.io.InputStream openEventLog (org.apache.hadoop.fs.Path log, org.apache.hadoop.fs.FileSystem fs)  { throw new RuntimeException(); }
}
