package org.apache.spark.util;
public  class YarnContainerInfoHelper {
  static public  scala.collection.immutable.Map<java.lang.String, java.lang.String> getLogUrlsFromBaseUrl (java.lang.String baseUrl)  { throw new RuntimeException(); }
  static public  scala.Option<scala.collection.immutable.Map<java.lang.String, java.lang.String>> getLogUrls (org.apache.hadoop.conf.Configuration conf, scala.Option<org.apache.hadoop.yarn.api.records.Container> container)  { throw new RuntimeException(); }
  static public  scala.Option<scala.collection.immutable.Map<java.lang.String, java.lang.String>> getAttributes (org.apache.hadoop.conf.Configuration conf, scala.Option<org.apache.hadoop.yarn.api.records.Container> container)  { throw new RuntimeException(); }
  static public  org.apache.hadoop.yarn.api.records.ContainerId getContainerId (scala.Option<org.apache.hadoop.yarn.api.records.Container> container)  { throw new RuntimeException(); }
  static public  scala.Option<java.lang.String> getClusterId (org.apache.hadoop.yarn.conf.YarnConfiguration yarnConf)  { throw new RuntimeException(); }
  static public  java.lang.String getYarnHttpScheme (org.apache.hadoop.yarn.conf.YarnConfiguration yarnConf)  { throw new RuntimeException(); }
  static public  java.lang.String getNodeManagerHttpAddress (scala.Option<org.apache.hadoop.yarn.api.records.Container> container)  { throw new RuntimeException(); }
  static public  java.lang.String getNodeManagerHost (scala.Option<org.apache.hadoop.yarn.api.records.Container> container)  { throw new RuntimeException(); }
  static public  java.lang.String getNodeManagerHttpPort (scala.Option<org.apache.hadoop.yarn.api.records.Container> container)  { throw new RuntimeException(); }
  static public  java.lang.String getNodeManagerPort (scala.Option<org.apache.hadoop.yarn.api.records.Container> container)  { throw new RuntimeException(); }
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
