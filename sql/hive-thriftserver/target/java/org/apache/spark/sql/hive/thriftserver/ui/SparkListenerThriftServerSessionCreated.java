package org.apache.spark.sql.hive.thriftserver.ui;
  class SparkListenerThriftServerSessionCreated implements org.apache.spark.scheduler.SparkListenerEvent, scala.Product, scala.Serializable {
  static public abstract  R apply (T1 v1, T2 v2, T3 v3, T4 v4)  ;
  static public  java.lang.String toString ()  { throw new RuntimeException(); }
  public  java.lang.String ip ()  { throw new RuntimeException(); }
  public  java.lang.String sessionId ()  { throw new RuntimeException(); }
  public  java.lang.String userName ()  { throw new RuntimeException(); }
  public  long startTime ()  { throw new RuntimeException(); }
  // not preceding
  public   SparkListenerThriftServerSessionCreated (java.lang.String ip, java.lang.String sessionId, java.lang.String userName, long startTime)  { throw new RuntimeException(); }
}
