package org.apache.spark.sql.hive.thriftserver.ui;
  class SparkListenerThriftServerOperationFinish implements org.apache.spark.scheduler.SparkListenerEvent, scala.Product, scala.Serializable {
  static public abstract  R apply (T1 v1, T2 v2)  ;
  static public  java.lang.String toString ()  { throw new RuntimeException(); }
  public  java.lang.String id ()  { throw new RuntimeException(); }
  public  long finishTime ()  { throw new RuntimeException(); }
  // not preceding
  public   SparkListenerThriftServerOperationFinish (java.lang.String id, long finishTime)  { throw new RuntimeException(); }
}
