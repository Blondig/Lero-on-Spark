package org.apache.spark.streaming.scheduler;
  class ErrorReported implements org.apache.spark.streaming.scheduler.JobSchedulerEvent, scala.Product, scala.Serializable {
  static public abstract  R apply (T1 v1, T2 v2)  ;
  static public  java.lang.String toString ()  { throw new RuntimeException(); }
  public  java.lang.String msg ()  { throw new RuntimeException(); }
  public  java.lang.Throwable e ()  { throw new RuntimeException(); }
  // not preceding
  public   ErrorReported (java.lang.String msg, java.lang.Throwable e)  { throw new RuntimeException(); }
}
