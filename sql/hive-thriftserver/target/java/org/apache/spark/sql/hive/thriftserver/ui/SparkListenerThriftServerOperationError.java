package org.apache.spark.sql.hive.thriftserver.ui;
  class SparkListenerThriftServerOperationError implements org.apache.spark.scheduler.SparkListenerEvent, scala.Product, scala.Serializable {
  static public abstract  R apply (T1 v1, T2 v2, T3 v3, T4 v4)  ;
  static public  java.lang.String toString ()  { throw new RuntimeException(); }
  public  java.lang.String id ()  { throw new RuntimeException(); }
  public  java.lang.String errorMsg ()  { throw new RuntimeException(); }
  public  java.lang.String errorTrace ()  { throw new RuntimeException(); }
  public  long finishTime ()  { throw new RuntimeException(); }
  // not preceding
  public   SparkListenerThriftServerOperationError (java.lang.String id, java.lang.String errorMsg, java.lang.String errorTrace, long finishTime)  { throw new RuntimeException(); }
}
