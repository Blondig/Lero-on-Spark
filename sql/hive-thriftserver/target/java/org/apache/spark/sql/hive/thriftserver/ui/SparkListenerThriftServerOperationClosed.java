package org.apache.spark.sql.hive.thriftserver.ui;
  class SparkListenerThriftServerOperationClosed implements org.apache.spark.scheduler.SparkListenerEvent, scala.Product, scala.Serializable {
  static public abstract  R apply (T1 v1, T2 v2)  ;
  static public  java.lang.String toString ()  { throw new RuntimeException(); }
  public  java.lang.String id ()  { throw new RuntimeException(); }
  public  long closeTime ()  { throw new RuntimeException(); }
  // not preceding
  public   SparkListenerThriftServerOperationClosed (java.lang.String id, long closeTime)  { throw new RuntimeException(); }
}
