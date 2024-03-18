package org.apache.spark.deploy.history;
/**
 * The reader which will read the information of single event log file.
 * <p>
 * This reader gets the status of event log file only once when required;
 * It may not give "live" status of file that could be changing concurrently, and
 * FileNotFoundException could occur if the log file is renamed before getting the
 * status of log file.
 */
  class SingleFileEventLogFileReader extends org.apache.spark.deploy.history.EventLogFileReader {
  public   SingleFileEventLogFileReader (org.apache.hadoop.fs.FileSystem fs, org.apache.hadoop.fs.Path path, scala.Option<org.apache.hadoop.fs.FileStatus> maybeStatus)  { throw new RuntimeException(); }
  public   SingleFileEventLogFileReader (org.apache.hadoop.fs.FileSystem fs, org.apache.hadoop.fs.Path path)  { throw new RuntimeException(); }
  public  boolean completed ()  { throw new RuntimeException(); }
  public  scala.Option<java.lang.String> compressionCodec ()  { throw new RuntimeException(); }
  public  long fileSizeForLastIndex ()  { throw new RuntimeException(); }
  public  scala.Option<java.lang.Object> fileSizeForLastIndexForDFS ()  { throw new RuntimeException(); }
  public  scala.Option<java.lang.Object> lastIndex ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.hadoop.fs.FileStatus> listEventLogFiles ()  { throw new RuntimeException(); }
  public  long modificationTime ()  { throw new RuntimeException(); }
  public  long totalSize ()  { throw new RuntimeException(); }
  public  void zipEventLogFiles (java.util.zip.ZipOutputStream zipStream)  { throw new RuntimeException(); }
}
