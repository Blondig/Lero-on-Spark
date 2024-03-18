package org.apache.spark.util.logging;
  class DriverLogger implements org.apache.spark.internal.Logging {
    class DfsAsyncWriter implements java.lang.Runnable, org.apache.spark.internal.Logging {
    public   DfsAsyncWriter (java.lang.String appId, org.apache.hadoop.conf.Configuration hadoopConf)  { throw new RuntimeException(); }
    public  void closeWriter ()  { throw new RuntimeException(); }
    public  void run ()  { throw new RuntimeException(); }
  }
  static public  java.lang.String DRIVER_LOG_DIR ()  { throw new RuntimeException(); }
  static public  java.lang.String DRIVER_LOG_FILE ()  { throw new RuntimeException(); }
  static public  java.lang.String DRIVER_LOG_FILE_SUFFIX ()  { throw new RuntimeException(); }
  static public  java.lang.String APPENDER_NAME ()  { throw new RuntimeException(); }
  static public  scala.Option<org.apache.spark.util.logging.DriverLogger> apply (org.apache.spark.SparkConf conf)  { throw new RuntimeException(); }
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
  public   DriverLogger (org.apache.spark.SparkConf conf)  { throw new RuntimeException(); }
  public  void startSync (org.apache.hadoop.conf.Configuration hadoopConf)  { throw new RuntimeException(); }
  public  void stop ()  { throw new RuntimeException(); }
}
