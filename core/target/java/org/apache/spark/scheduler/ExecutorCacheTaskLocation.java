package org.apache.spark.scheduler;
/**
 * A location that includes both a host and an executor id on that host.
 */
  class ExecutorCacheTaskLocation implements org.apache.spark.scheduler.TaskLocation, scala.Product, scala.Serializable {
  static public abstract  R apply (T1 v1, T2 v2)  ;
  public  java.lang.String host ()  { throw new RuntimeException(); }
  public  java.lang.String executorId ()  { throw new RuntimeException(); }
  // not preceding
  public   ExecutorCacheTaskLocation (java.lang.String host, java.lang.String executorId)  { throw new RuntimeException(); }
  public  java.lang.String toString ()  { throw new RuntimeException(); }
}
