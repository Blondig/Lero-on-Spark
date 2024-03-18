package org.apache.spark.kafka010;
  class KafkaDelegationTokenProvider implements org.apache.spark.security.HadoopDelegationTokenProvider, org.apache.spark.internal.Logging {
  public   KafkaDelegationTokenProvider ()  { throw new RuntimeException(); }
  public  boolean delegationTokensRequired (org.apache.spark.SparkConf sparkConf, org.apache.hadoop.conf.Configuration hadoopConf)  { throw new RuntimeException(); }
  public  scala.Option<java.lang.Object> obtainDelegationTokens (org.apache.hadoop.conf.Configuration hadoopConf, org.apache.spark.SparkConf sparkConf, org.apache.hadoop.security.Credentials creds)  { throw new RuntimeException(); }
  public  java.lang.String serviceName ()  { throw new RuntimeException(); }
}
