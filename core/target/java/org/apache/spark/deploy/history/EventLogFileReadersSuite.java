package org.apache.spark.deploy.history;
public abstract class EventLogFileReadersSuite extends org.apache.spark.SparkFunSuite implements org.apache.spark.LocalSparkContext, org.scalatest.BeforeAndAfter, org.apache.spark.internal.Logging {
  public   EventLogFileReadersSuite ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<scala.Option<java.lang.String>> allCodecs ()  { throw new RuntimeException(); }
  protected abstract  void assertAppropriateReader (scala.Option<org.apache.spark.deploy.history.EventLogFileReader> actualReader)  ;
  protected abstract  org.apache.spark.deploy.history.EventLogFileWriter createWriter (java.lang.String appId, scala.Option<java.lang.String> appAttemptId, java.net.URI logBaseDir, org.apache.spark.SparkConf sparkConf, org.apache.hadoop.conf.Configuration hadoopConf)  ;
  protected  org.apache.hadoop.fs.FileSystem fileSystem ()  { throw new RuntimeException(); }
  protected abstract  java.lang.String getCurrentLogPath (java.lang.String logPath, boolean isCompleted)  ;
  public  org.apache.spark.SparkContext sc ()  { throw new RuntimeException(); }
  protected  java.io.File testDir ()  { throw new RuntimeException(); }
  protected  org.apache.hadoop.fs.Path testDirPath ()  { throw new RuntimeException(); }
  protected abstract  void verifyReader (org.apache.spark.deploy.history.EventLogFileReader reader, org.apache.hadoop.fs.Path logPath, scala.Option<java.lang.String> compressionCodecShortName, boolean isCompleted)  ;
}
