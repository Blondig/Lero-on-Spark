package org.apache.spark.scheduler;
public  class SparkListenerApplicationStart implements org.apache.spark.scheduler.SparkListenerEvent, scala.Product, scala.Serializable {
  static public abstract  R apply (T1 v1, T2 v2, T3 v3, T4 v4, T5 v5, T6 v6, T7 v7)  ;
  static public  java.lang.String toString ()  { throw new RuntimeException(); }
  public  java.lang.String appName ()  { throw new RuntimeException(); }
  public  scala.Option<java.lang.String> appId ()  { throw new RuntimeException(); }
  public  long time ()  { throw new RuntimeException(); }
  public  java.lang.String sparkUser ()  { throw new RuntimeException(); }
  public  scala.Option<java.lang.String> appAttemptId ()  { throw new RuntimeException(); }
  public  scala.Option<scala.collection.Map<java.lang.String, java.lang.String>> driverLogs ()  { throw new RuntimeException(); }
  public  scala.Option<scala.collection.Map<java.lang.String, java.lang.String>> driverAttributes ()  { throw new RuntimeException(); }
  // not preceding
  public   SparkListenerApplicationStart (java.lang.String appName, scala.Option<java.lang.String> appId, long time, java.lang.String sparkUser, scala.Option<java.lang.String> appAttemptId, scala.Option<scala.collection.Map<java.lang.String, java.lang.String>> driverLogs, scala.Option<scala.collection.Map<java.lang.String, java.lang.String>> driverAttributes)  { throw new RuntimeException(); }
}
