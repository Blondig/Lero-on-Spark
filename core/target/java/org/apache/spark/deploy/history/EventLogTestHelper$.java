package org.apache.spark.deploy.history;
public  class EventLogTestHelper$ {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final EventLogTestHelper$ MODULE$ = null;
  public   EventLogTestHelper$ ()  { throw new RuntimeException(); }
  public  java.lang.String getUniqueApplicationId ()  { throw new RuntimeException(); }
  /**
   * Get a SparkConf with event logging enabled. It doesn't enable rolling event logs, so caller
   * should set it manually.
   * @param logDir (undocumented)
   * @param compressionCodec (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.SparkConf getLoggingConf (org.apache.hadoop.fs.Path logDir, scala.Option<java.lang.String> compressionCodec)  { throw new RuntimeException(); }
  public  scala.collection.Seq<java.lang.String> writeTestEvents (org.apache.spark.deploy.history.EventLogFileWriter writer, java.lang.String eventStr, long desiredSize)  { throw new RuntimeException(); }
  public  java.lang.String writeEventLogFile (org.apache.spark.SparkConf sparkConf, org.apache.hadoop.conf.Configuration hadoopConf, java.io.File dir, int idx, scala.collection.Seq<org.apache.spark.scheduler.SparkListenerEvent> events)  { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.hadoop.fs.FileStatus> writeEventsToRollingWriter (org.apache.hadoop.fs.FileSystem fs, java.lang.String appId, java.io.File dir, org.apache.spark.SparkConf sparkConf, org.apache.hadoop.conf.Configuration hadoopConf, scala.collection.Seq<scala.collection.Seq<org.apache.spark.scheduler.SparkListenerEvent>> eventsFiles)  { throw new RuntimeException(); }
  public  void writeEventsToRollingWriter (org.apache.spark.deploy.history.RollingEventLogFilesWriter writer, scala.collection.Seq<org.apache.spark.scheduler.SparkListenerEvent> events, boolean rollFile)  { throw new RuntimeException(); }
  public  java.lang.String convertEvent (org.apache.spark.scheduler.SparkListenerEvent event)  { throw new RuntimeException(); }
}
