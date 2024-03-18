package org.apache.spark.streaming.util;
/** A helper class with utility functions related to the WriteAheadLog interface */
public  class WriteAheadLogUtils {
  static public  boolean enableReceiverLog (org.apache.spark.SparkConf conf)  { throw new RuntimeException(); }
  static public  int getRollingIntervalSecs (org.apache.spark.SparkConf conf, boolean isDriver)  { throw new RuntimeException(); }
  static public  int getMaxFailures (org.apache.spark.SparkConf conf, boolean isDriver)  { throw new RuntimeException(); }
  static public  boolean isBatchingEnabled (org.apache.spark.SparkConf conf, boolean isDriver)  { throw new RuntimeException(); }
  /**
   * How long we will wait for the wrappedLog in the BatchedWriteAheadLog to write the records
   * before we fail the write attempt to unblock receivers.
   * @param conf (undocumented)
   * @return (undocumented)
   */
  static public  long getBatchingTimeout (org.apache.spark.SparkConf conf)  { throw new RuntimeException(); }
  static public  boolean shouldCloseFileAfterWrite (org.apache.spark.SparkConf conf, boolean isDriver)  { throw new RuntimeException(); }
  /**
   * Create a WriteAheadLog for the driver. If configured with custom WAL class, it will try
   * to create instance of that class, otherwise it will create the default FileBasedWriteAheadLog.
   * @param sparkConf (undocumented)
   * @param fileWalLogDirectory (undocumented)
   * @param fileWalHadoopConf (undocumented)
   * @return (undocumented)
   */
  static public  org.apache.spark.streaming.util.WriteAheadLog createLogForDriver (org.apache.spark.SparkConf sparkConf, java.lang.String fileWalLogDirectory, org.apache.hadoop.conf.Configuration fileWalHadoopConf)  { throw new RuntimeException(); }
  /**
   * Create a WriteAheadLog for the receiver. If configured with custom WAL class, it will try
   * to create instance of that class, otherwise it will create the default FileBasedWriteAheadLog.
   * @param sparkConf (undocumented)
   * @param fileWalLogDirectory (undocumented)
   * @param fileWalHadoopConf (undocumented)
   * @return (undocumented)
   */
  static public  org.apache.spark.streaming.util.WriteAheadLog createLogForReceiver (org.apache.spark.SparkConf sparkConf, java.lang.String fileWalLogDirectory, org.apache.hadoop.conf.Configuration fileWalHadoopConf)  { throw new RuntimeException(); }
  static public  org.slf4j.Logger org$apache$spark$internal$Logging$$log_ ()  { throw new RuntimeException(); }
  static public  void org$apache$spark$internal$Logging$$log__$eq (org.slf4j.Logger x$1)  { throw new RuntimeException(); }
  static protected  java.lang.String logName ()  { throw new RuntimeException(); }
  static protected  org.slf4j.Logger log ()  { throw new RuntimeException(); }
  static protected  void logInfo (scala.Function0<java.lang.String> msg)  { throw new RuntimeException(); }
  static protected  void logDebug (scala.Function0<java.lang.String> msg)  { throw new RuntimeException(); }
  static protected  void logTrace (scala.Function0<java.lang.String> msg)  { throw new RuntimeException(); }
  static protected  void logWarning (scala.Function0<java.lang.String> msg)  { throw new RuntimeException(); }
  static protected  void logError (scala.Function0<java.lang.String> msg)  { throw new RuntimeException(); }
  static protected  void logInfo (scala.Function0<java.lang.String> msg, java.lang.Throwable throwable)  { throw new RuntimeException(); }
  static protected  void logDebug (scala.Function0<java.lang.String> msg, java.lang.Throwable throwable)  { throw new RuntimeException(); }
  static protected  void logTrace (scala.Function0<java.lang.String> msg, java.lang.Throwable throwable)  { throw new RuntimeException(); }
  static protected  void logWarning (scala.Function0<java.lang.String> msg, java.lang.Throwable throwable)  { throw new RuntimeException(); }
  static protected  void logError (scala.Function0<java.lang.String> msg, java.lang.Throwable throwable)  { throw new RuntimeException(); }
  static protected  boolean isTraceEnabled ()  { throw new RuntimeException(); }
  static protected  void initializeLogIfNecessary (boolean isInterpreter)  { throw new RuntimeException(); }
  static protected  boolean initializeLogIfNecessary (boolean isInterpreter, boolean silent)  { throw new RuntimeException(); }
  static protected  boolean initializeLogIfNecessary$default$2 ()  { throw new RuntimeException(); }
  static   void initializeForcefully (boolean isInterpreter, boolean silent)  { throw new RuntimeException(); }
}
