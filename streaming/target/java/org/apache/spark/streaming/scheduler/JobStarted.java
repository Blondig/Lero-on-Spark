package org.apache.spark.streaming.scheduler;
  class JobStarted implements org.apache.spark.streaming.scheduler.JobSchedulerEvent, scala.Product, scala.Serializable {
  static public abstract  R apply (T1 v1, T2 v2)  ;
  static public  java.lang.String toString ()  { throw new RuntimeException(); }
  public  org.apache.spark.streaming.scheduler.Job job ()  { throw new RuntimeException(); }
  public  long startTime ()  { throw new RuntimeException(); }
  // not preceding
  public   JobStarted (org.apache.spark.streaming.scheduler.Job job, long startTime)  { throw new RuntimeException(); }
}
