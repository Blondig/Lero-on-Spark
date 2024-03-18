package org.apache.spark.streaming.util;
/** A helper class with utility functions related to the WriteAheadLog interface */
public  class WriteAheadLogUtils$ implements org.apache.spark.internal.Logging {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final WriteAheadLogUtils$ MODULE$ = null;
  public   WriteAheadLogUtils$ ()  { throw new RuntimeException(); }
  public  boolean enableReceiverLog (org.apache.spark.SparkConf conf)  { throw new RuntimeException(); }
  public  int getRollingIntervalSecs (org.apache.spark.SparkConf conf, boolean isDriver)  { throw new RuntimeException(); }
  public  int getMaxFailures (org.apache.spark.SparkConf conf, boolean isDriver)  { throw new RuntimeException(); }
  public  boolean isBatchingEnabled (org.apache.spark.SparkConf conf, boolean isDriver)  { throw new RuntimeException(); }
  /**
   * How long we will wait for the wrappedLog in the BatchedWriteAheadLog to write the records
   * before we fail the write attempt to unblock receivers.
   * @param conf (undocumented)
   * @return (undocumented)
   */
  public  long getBatchingTimeout (org.apache.spark.SparkConf conf)  { throw new RuntimeException(); }
  public  boolean shouldCloseFileAfterWrite (org.apache.spark.SparkConf conf, boolean isDriver)  { throw new RuntimeException(); }
  /**
   * Create a WriteAheadLog for the driver. If configured with custom WAL class, it will try
   * to create instance of that class, otherwise it will create the default FileBasedWriteAheadLog.
   * @param sparkConf (undocumented)
   * @param fileWalLogDirectory (undocumented)
   * @param fileWalHadoopConf (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.streaming.util.WriteAheadLog createLogForDriver (org.apache.spark.SparkConf sparkConf, java.lang.String fileWalLogDirectory, org.apache.hadoop.conf.Configuration fileWalHadoopConf)  { throw new RuntimeException(); }
  /**
   * Create a WriteAheadLog for the receiver. If configured with custom WAL class, it will try
   * to create instance of that class, otherwise it will create the default FileBasedWriteAheadLog.
   * @param sparkConf (undocumented)
   * @param fileWalLogDirectory (undocumented)
   * @param fileWalHadoopConf (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.streaming.util.WriteAheadLog createLogForReceiver (org.apache.spark.SparkConf sparkConf, java.lang.String fileWalLogDirectory, org.apache.hadoop.conf.Configuration fileWalHadoopConf)  { throw new RuntimeException(); }
}
