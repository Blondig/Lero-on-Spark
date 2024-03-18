package org.apache.spark.deploy.history;
public abstract class EventLogFileWritersSuite extends org.apache.spark.SparkFunSuite implements org.apache.spark.LocalSparkContext, org.scalatest.BeforeAndAfter {
  public   EventLogFileWritersSuite ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<scala.Option<java.lang.String>> allCodecs ()  { throw new RuntimeException(); }
  protected abstract  org.apache.spark.deploy.history.EventLogFileWriter createWriter (java.lang.String appId, scala.Option<java.lang.String> appAttemptId, java.net.URI logBaseDir, org.apache.spark.SparkConf sparkConf, org.apache.hadoop.conf.Configuration hadoopConf)  ;
  protected  org.apache.hadoop.fs.FileSystem fileSystem ()  { throw new RuntimeException(); }
  protected  scala.collection.immutable.List<java.lang.String> readLinesFromEventLogFile (org.apache.hadoop.fs.Path log, org.apache.hadoop.fs.FileSystem fs)  { throw new RuntimeException(); }
  public  org.apache.spark.SparkContext sc ()  { throw new RuntimeException(); }
  protected  java.io.File testDir ()  { throw new RuntimeException(); }
  protected  org.apache.hadoop.fs.Path testDirPath ()  { throw new RuntimeException(); }
  /**
   * This should be called with "closed" event log file; No guarantee on reading event log file
   * which is being written, especially the file is compressed. SHS also does the best it can.
   * @param appId (undocumented)
   * @param appAttemptId (undocumented)
   * @param logBaseDir (undocumented)
   * @param compressionCodecShortName (undocumented)
   * @param expectedLines (undocumented)
   */
  protected abstract  void verifyWriteEventLogFile (java.lang.String appId, scala.Option<java.lang.String> appAttemptId, java.net.URI logBaseDir, scala.Option<java.lang.String> compressionCodecShortName, scala.collection.Seq<java.lang.String> expectedLines)  ;
}
