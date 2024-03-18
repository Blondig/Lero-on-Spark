package org.apache.spark.deploy.history;
/**
 * This class helps to write compact file; to avoid reimplementing everything, it extends
 * {@link SingleEventLogFileWriter}, but only <code>originalFilePath</code> is used to determine the
 * path of compact file.
 */
public  class CompactedEventLogFileWriter extends org.apache.spark.deploy.history.SingleEventLogFileWriter {
  public   CompactedEventLogFileWriter (org.apache.hadoop.fs.Path originalFilePath, java.lang.String appId, scala.Option<java.lang.String> appAttemptId, java.net.URI logBaseDir, org.apache.spark.SparkConf sparkConf, org.apache.hadoop.conf.Configuration hadoopConf)  { throw new RuntimeException(); }
  public  java.lang.String logPath ()  { throw new RuntimeException(); }
}
