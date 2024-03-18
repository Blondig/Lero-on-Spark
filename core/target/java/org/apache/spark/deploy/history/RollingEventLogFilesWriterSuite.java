package org.apache.spark.deploy.history;
public  class RollingEventLogFilesWriterSuite extends org.apache.spark.deploy.history.EventLogFileWritersSuite {
  public   RollingEventLogFilesWriterSuite ()  { throw new RuntimeException(); }
  protected  org.apache.spark.deploy.history.EventLogFileWriter createWriter (java.lang.String appId, scala.Option<java.lang.String> appAttemptId, java.net.URI logBaseDir, org.apache.spark.SparkConf sparkConf, org.apache.hadoop.conf.Configuration hadoopConf)  { throw new RuntimeException(); }
  protected  void verifyWriteEventLogFile (java.lang.String appId, scala.Option<java.lang.String> appAttemptId, java.net.URI logBaseDir, scala.Option<java.lang.String> compressionCodecShortName, scala.collection.Seq<java.lang.String> expectedLines)  { throw new RuntimeException(); }
}
