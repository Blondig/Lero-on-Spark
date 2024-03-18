package org.apache.spark.deploy.history;
/**
 * The reader which will read the information of rolled multiple event log files.
 * <p>
 * This reader lists the files only once; if caller would like to play with updated list,
 * it needs to create another reader instance.
 */
  class RollingEventLogFilesFileReader extends org.apache.spark.deploy.history.EventLogFileReader {
  public   RollingEventLogFilesFileReader (org.apache.hadoop.fs.FileSystem fs, org.apache.hadoop.fs.Path path)  { throw new RuntimeException(); }
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
