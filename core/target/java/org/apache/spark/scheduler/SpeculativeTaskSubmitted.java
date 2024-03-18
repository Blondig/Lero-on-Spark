package org.apache.spark.scheduler;
  class SpeculativeTaskSubmitted implements org.apache.spark.scheduler.DAGSchedulerEvent, scala.Product, scala.Serializable {
  static public abstract  R apply (T1 v1)  ;
  static public  java.lang.String toString ()  { throw new RuntimeException(); }
  public  org.apache.spark.scheduler.Task<?> task ()  { throw new RuntimeException(); }
  // not preceding
  public   SpeculativeTaskSubmitted (org.apache.spark.scheduler.Task<?> task)  { throw new RuntimeException(); }
}
