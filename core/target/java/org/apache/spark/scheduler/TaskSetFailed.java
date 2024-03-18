package org.apache.spark.scheduler;
  class TaskSetFailed implements org.apache.spark.scheduler.DAGSchedulerEvent, scala.Product, scala.Serializable {
  static public abstract  R apply (T1 v1, T2 v2, T3 v3)  ;
  static public  java.lang.String toString ()  { throw new RuntimeException(); }
  public  org.apache.spark.scheduler.TaskSet taskSet ()  { throw new RuntimeException(); }
  public  java.lang.String reason ()  { throw new RuntimeException(); }
  public  scala.Option<java.lang.Throwable> exception ()  { throw new RuntimeException(); }
  // not preceding
  public   TaskSetFailed (org.apache.spark.scheduler.TaskSet taskSet, java.lang.String reason, scala.Option<java.lang.Throwable> exception)  { throw new RuntimeException(); }
}
