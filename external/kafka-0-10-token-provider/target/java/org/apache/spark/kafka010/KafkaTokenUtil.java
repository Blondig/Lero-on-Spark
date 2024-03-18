package org.apache.spark.kafka010;
public  class KafkaTokenUtil {
  static   class KafkaDelegationTokenIdentifier extends org.apache.hadoop.security.token.delegation.AbstractDelegationTokenIdentifier {
    public   KafkaDelegationTokenIdentifier ()  { throw new RuntimeException(); }
    public  org.apache.hadoop.io.Text getKind ()  { throw new RuntimeException(); }
  }
  static public  org.apache.hadoop.io.Text TOKEN_KIND ()  { throw new RuntimeException(); }
  static   org.apache.hadoop.io.Text getTokenService (java.lang.String identifier)  { throw new RuntimeException(); }
  static   scala.Tuple2<org.apache.hadoop.security.token.Token<org.apache.spark.kafka010.KafkaTokenUtil.KafkaDelegationTokenIdentifier>, java.lang.Object> obtainToken (org.apache.spark.SparkConf sparkConf, org.apache.spark.kafka010.KafkaTokenClusterConf clusterConf)  { throw new RuntimeException(); }
  static   void checkProxyUser ()  { throw new RuntimeException(); }
  static   java.util.Properties createAdminClientProperties (org.apache.spark.SparkConf sparkConf, org.apache.spark.kafka010.KafkaTokenClusterConf clusterConf)  { throw new RuntimeException(); }
  static public  boolean isGlobalJaasConfigurationProvided ()  { throw new RuntimeException(); }
  static public  java.lang.String getKeytabJaasParams (java.lang.String keyTab, java.lang.String principal, java.lang.String kerberosServiceName)  { throw new RuntimeException(); }
  static public  scala.Option<org.apache.spark.kafka010.KafkaTokenClusterConf> findMatchingTokenClusterConfig (org.apache.spark.SparkConf sparkConf, java.lang.String bootStrapServers)  { throw new RuntimeException(); }
  static public  java.lang.String getTokenJaasParams (org.apache.spark.kafka010.KafkaTokenClusterConf clusterConf)  { throw new RuntimeException(); }
  static public  boolean needTokenUpdate (java.util.Map<java.lang.String, java.lang.Object> params, scala.Option<org.apache.spark.kafka010.KafkaTokenClusterConf> clusterConfig)  { throw new RuntimeException(); }
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
