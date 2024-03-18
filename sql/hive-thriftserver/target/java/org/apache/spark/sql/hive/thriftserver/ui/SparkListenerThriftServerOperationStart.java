package org.apache.spark.sql.hive.thriftserver.ui;
  class SparkListenerThriftServerOperationStart implements org.apache.spark.scheduler.SparkListenerEvent, scala.Product, scala.Serializable {
  static public abstract  R apply (T1 v1, T2 v2, T3 v3, T4 v4, T5 v5, T6 v6)  ;
  static public  java.lang.String toString ()  { throw new RuntimeException(); }
  public  java.lang.String id ()  { throw new RuntimeException(); }
  public  java.lang.String sessionId ()  { throw new RuntimeException(); }
  public  java.lang.String statement ()  { throw new RuntimeException(); }
  public  java.lang.String groupId ()  { throw new RuntimeException(); }
  public  long startTime ()  { throw new RuntimeException(); }
  public  java.lang.String userName ()  { throw new RuntimeException(); }
  // not preceding
  public   SparkListenerThriftServerOperationStart (java.lang.String id, java.lang.String sessionId, java.lang.String statement, java.lang.String groupId, long startTime, java.lang.String userName)  { throw new RuntimeException(); }
}
