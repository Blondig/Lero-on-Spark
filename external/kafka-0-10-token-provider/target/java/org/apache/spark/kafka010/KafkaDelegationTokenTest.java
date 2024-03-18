package org.apache.spark.kafka010;
/**
 * This is a trait which provides functionalities for Kafka delegation token related test suites.
 */
public  interface KafkaDelegationTokenTest extends org.scalatest.BeforeAndAfterEach {
  public  void addTokenToUGI (org.apache.hadoop.io.Text tokenService, java.lang.String tokenId, java.lang.String tokenPassword)  ;
  public  void afterEach ()  ;
  public  void beforeEach ()  ;
  public  java.lang.String bootStrapServers ()  ;
  public  org.apache.spark.kafka010.KafkaTokenClusterConf createClusterConf (java.lang.String identifier, java.lang.String securityProtocol, scala.collection.immutable.Map<java.lang.String, java.lang.String> specifiedKafkaParams)  ;
  public  org.mockito.stubbing.Stubber doReturn (Object value)  ;
  public  java.lang.String identifier1 ()  ;
  public  java.lang.String identifier2 ()  ;
  public  java.lang.String keyPassword ()  ;
  public  java.lang.String keyStoreLocation ()  ;
  public  java.lang.String keyStorePassword ()  ;
  public  java.lang.String keyStoreType ()  ;
  public  java.lang.String keytab ()  ;
  public  java.lang.String matchingTargetServersRegex ()  ;
  public  java.lang.String nonMatchingTargetServersRegex ()  ;
  public  java.lang.String principal ()  ;
  public  void setGlobalKafkaClientConfig ()  ;
  public  void setSparkEnv (scala.collection.Iterable<scala.Tuple2<java.lang.String, java.lang.String>> settings)  ;
  public  java.lang.String tokenId1 ()  ;
  public  java.lang.String tokenId2 ()  ;
  public  java.lang.String tokenPassword1 ()  ;
  public  java.lang.String tokenPassword2 ()  ;
  public  org.apache.hadoop.io.Text tokenService1 ()  ;
  public  org.apache.hadoop.io.Text tokenService2 ()  ;
  public  java.lang.String trustStoreLocation ()  ;
  public  java.lang.String trustStorePassword ()  ;
  public  java.lang.String trustStoreType ()  ;
}
