package org.apache.spark.deploy.security;
  class HadoopFSDelegationTokenProvider implements org.apache.spark.security.HadoopDelegationTokenProvider, org.apache.spark.internal.Logging {
  static public  scala.collection.immutable.Set<org.apache.hadoop.fs.FileSystem> hadoopFSsToAccess (org.apache.spark.SparkConf sparkConf, org.apache.hadoop.conf.Configuration hadoopConf)  { throw new RuntimeException(); }
  public   HadoopFSDelegationTokenProvider ()  { throw new RuntimeException(); }
  public  java.lang.String serviceName ()  { throw new RuntimeException(); }
  public  scala.Option<java.lang.Object> obtainDelegationTokens (org.apache.hadoop.conf.Configuration hadoopConf, org.apache.spark.SparkConf sparkConf, org.apache.hadoop.security.Credentials creds)  { throw new RuntimeException(); }
  public  boolean delegationTokensRequired (org.apache.spark.SparkConf sparkConf, org.apache.hadoop.conf.Configuration hadoopConf)  { throw new RuntimeException(); }
}
