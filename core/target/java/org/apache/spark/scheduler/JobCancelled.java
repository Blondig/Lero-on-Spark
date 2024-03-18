package org.apache.spark.scheduler;
  class JobCancelled implements org.apache.spark.scheduler.DAGSchedulerEvent, scala.Product, scala.Serializable {
  static public abstract  R apply (T1 v1, T2 v2)  ;
  static public  java.lang.String toString ()  { throw new RuntimeException(); }
  public  int jobId ()  { throw new RuntimeException(); }
  public  scala.Option<java.lang.String> reason ()  { throw new RuntimeException(); }
  // not preceding
  public   JobCancelled (int jobId, scala.Option<java.lang.String> reason)  { throw new RuntimeException(); }
}
