package org.apache.spark.scheduler;
public  class SparkListenerExecutorRemoved implements org.apache.spark.scheduler.SparkListenerEvent, scala.Product, scala.Serializable {
  static public abstract  R apply (T1 v1, T2 v2, T3 v3)  ;
  static public  java.lang.String toString ()  { throw new RuntimeException(); }
  public  long time ()  { throw new RuntimeException(); }
  public  java.lang.String executorId ()  { throw new RuntimeException(); }
  public  java.lang.String reason ()  { throw new RuntimeException(); }
  // not preceding
  public   SparkListenerExecutorRemoved (long time, java.lang.String executorId, java.lang.String reason)  { throw new RuntimeException(); }
}
