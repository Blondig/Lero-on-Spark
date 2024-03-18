package org.apache.spark.rpc;
  class RpcEnvConfig implements scala.Product, scala.Serializable {
  static public abstract  R apply (T1 v1, T2 v2, T3 v3, T4 v4, T5 v5, T6 v6, T7 v7, T8 v8)  ;
  static public  java.lang.String toString ()  { throw new RuntimeException(); }
  public  org.apache.spark.SparkConf conf ()  { throw new RuntimeException(); }
  public  java.lang.String name ()  { throw new RuntimeException(); }
  public  java.lang.String bindAddress ()  { throw new RuntimeException(); }
  public  java.lang.String advertiseAddress ()  { throw new RuntimeException(); }
  public  int port ()  { throw new RuntimeException(); }
  public  org.apache.spark.SecurityManager securityManager ()  { throw new RuntimeException(); }
  public  int numUsableCores ()  { throw new RuntimeException(); }
  public  boolean clientMode ()  { throw new RuntimeException(); }
  // not preceding
  public   RpcEnvConfig (org.apache.spark.SparkConf conf, java.lang.String name, java.lang.String bindAddress, java.lang.String advertiseAddress, int port, org.apache.spark.SecurityManager securityManager, int numUsableCores, boolean clientMode)  { throw new RuntimeException(); }
}
