package org.apache.spark.scheduler;
/**
 * State related to decommissioning that is kept by the TaskSchedulerImpl. This state is derived
 * from the info message above but it is kept distinct to allow the state to evolve independently
 * from the message.
 */
  class ExecutorDecommissionState implements scala.Product, scala.Serializable {
  static public abstract  R apply (T1 v1, T2 v2)  ;
  static public  java.lang.String toString ()  { throw new RuntimeException(); }
  public  long startTime ()  { throw new RuntimeException(); }
  public  scala.Option<java.lang.String> workerHost ()  { throw new RuntimeException(); }
  // not preceding
  public   ExecutorDecommissionState (long startTime, scala.Option<java.lang.String> workerHost)  { throw new RuntimeException(); }
}
