package org.apache.spark.scheduler;
  class ExecutorLost implements org.apache.spark.scheduler.DAGSchedulerEvent, scala.Product, scala.Serializable {
  static public abstract  R apply (T1 v1, T2 v2)  ;
  static public  java.lang.String toString ()  { throw new RuntimeException(); }
  public  java.lang.String execId ()  { throw new RuntimeException(); }
  public  org.apache.spark.scheduler.ExecutorLossReason reason ()  { throw new RuntimeException(); }
  // not preceding
  public   ExecutorLost (java.lang.String execId, org.apache.spark.scheduler.ExecutorLossReason reason)  { throw new RuntimeException(); }
}
