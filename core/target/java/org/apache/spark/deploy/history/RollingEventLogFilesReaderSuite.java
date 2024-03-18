package org.apache.spark.deploy.history;
public  class RollingEventLogFilesReaderSuite extends org.apache.spark.deploy.history.EventLogFileReadersSuite {
  public   RollingEventLogFilesReaderSuite ()  { throw new RuntimeException(); }
  protected  void assertAppropriateReader (scala.Option<org.apache.spark.deploy.history.EventLogFileReader> actualReader)  { throw new RuntimeException(); }
  protected  org.apache.spark.deploy.history.EventLogFileWriter createWriter (java.lang.String appId, scala.Option<java.lang.String> appAttemptId, java.net.URI logBaseDir, org.apache.spark.SparkConf sparkConf, org.apache.hadoop.conf.Configuration hadoopConf)  { throw new RuntimeException(); }
  protected  java.lang.String getCurrentLogPath (java.lang.String logPath, boolean isCompleted)  { throw new RuntimeException(); }
  protected  void verifyReader (org.apache.spark.deploy.history.EventLogFileReader reader, org.apache.hadoop.fs.Path logPath, scala.Option<java.lang.String> compressionCodecShortName, boolean isCompleted)  { throw new RuntimeException(); }
}
